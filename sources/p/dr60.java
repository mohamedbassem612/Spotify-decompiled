package p;

import android.content.Context;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.TextureView;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dr60 extends VideoSurfaceView {
    public final float[] A1;
    public boolean w1;
    public Float x1;
    public final Matrix y1;
    public final Matrix z1;

    public dr60(Context context) {
        super(context, (AttributeSet) null);
        this.y1 = new Matrix();
        this.z1 = new Matrix();
        this.A1 = new float[9];
    }

    public boolean getSupportsSurfaceView() {
        return this.w1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        TextureView textureView = getTextureView();
        if (textureView == null) {
            return;
        }
        Matrix matrix = this.y1;
        textureView.getTransform(matrix);
        float[] fArr = this.A1;
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[4];
        float f3 = fArr[5];
        Float f4 = this.x1;
        float fFloatValue = f4 != null ? f4.floatValue() : 0.5f;
        float width = getWidth();
        float f5 = width * f;
        float fO = f5 > width ? yoi1.o((width / 2.0f) - (fFloatValue * f5), width - f5, 0.0f) : 0.0f;
        Matrix matrix2 = this.z1;
        matrix2.setScale(f, f2);
        matrix2.postTranslate(fO, f3);
        textureView.setTransform(matrix2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setHorizontalFocusPercentage(Float f) {
        this.x1 = f;
        requestLayout();
    }

    public void setSupportsSurfaceView(boolean z) {
        this.w1 = z;
    }
}
