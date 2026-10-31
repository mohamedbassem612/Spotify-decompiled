package p;

import android.graphics.Matrix;
import android.graphics.RectF;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zdk1 {
    public final Matrix a = new Matrix();
    public final RectF b = new RectF();
    public float c = 0.0f;
    public float d = 0.0f;
    public float e = 1.0f;
    public float f = Float.MAX_VALUE;
    public float g = 1.0f;
    public float h = 1.0f;
    public float i = 0.0f;
    public float j = 0.0f;
    public float k = 0.0f;
    public final Matrix l = new Matrix();
    public final float[] m = new float[9];

    public final boolean a(float f) {
        return this.b.left <= f + 1.0f;
    }

    public final boolean b(float f) {
        return this.b.right >= (((float) ((int) (f * 100.0f))) / 100.0f) - 1.0f;
    }

    public final void c(Matrix matrix, RectF rectF) {
        float[] fArr = this.m;
        matrix.getValues(fArr);
        float f = fArr[2];
        float f2 = fArr[0];
        float f3 = fArr[5];
        float f4 = fArr[4];
        this.g = Math.min(Math.max(this.e, f2), this.f);
        this.h = Math.min(Math.max(1.0f, f4), Float.MAX_VALUE);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        this.i = Math.min(Math.max(f, ((this.g - 1.0f) * (-fWidth)) - this.j), this.j);
        float fMax = Math.max(Math.min(f3, ((this.h - 1.0f) * fHeight) + this.k), -this.k);
        fArr[2] = this.i;
        fArr[0] = this.g;
        fArr[5] = fMax;
        fArr[4] = this.h;
        matrix.setValues(fArr);
    }

    public final void d(Matrix matrix, x8a x8aVar, boolean z) {
        Matrix matrix2 = this.a;
        matrix2.set(matrix);
        c(matrix2, this.b);
        if (z) {
            x8aVar.invalidate();
        }
        matrix.set(matrix2);
    }
}
