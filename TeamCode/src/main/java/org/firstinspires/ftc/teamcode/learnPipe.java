package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;
import org.openftc.easyopencv.OpenCvPipeline;

public class learnPipe extends OpenCvPipeline
{
    boolean viewportPaused;

    Telemetry telemetry;
    public learnPipe(Telemetry t) {telemetry=t;};
    Mat redMat = new Mat();
    public enum Colors{
        Color1,
        Color2,
        Color3
    }
    private Colors colors;
    static final Rect target_BOX = new Rect(
            new Point(210, 120),
            new Point(220,140));
    @Override
    public Mat processFrame(Mat input)
    {
        Imgproc.cvtColor(input, redMat, Imgproc.COLOR_RGB2HLS);
        Scalar lowRedBound = new Scalar(0, 10, 0);
        Scalar highRedBound = new Scalar(23, 255, 250);
        Mat target = redMat.submat(target_BOX);

        Core.inRange(redMat, lowRedBound, highRedBound, redMat);

        Imgproc.rectangle(redMat, target_BOX, new Scalar(255, 0, 0));

        double targetVal1 = Core.sumElems(target).val[0] / target_BOX.area() / 255;
        target.release();

        if (targetVal1 > 0.7) {
            colors = Colors.Color1;

        }
        return redMat;
    }

    public Colors ColorType(){
        return colors;
    }
}
