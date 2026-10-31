package p;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ylw0 {
    public Size a;
    public Rect b;
    public int c;
    public Matrix d;
    public int e;
    public boolean f;
    public boolean g;
    public emw0 h;

    public final void a(Size size, int i, Rect rect) {
        Matrix matrix;
        if (f()) {
            Matrix matrix2 = new Matrix();
            if (f()) {
                Matrix matrix3 = new Matrix(this.d);
                matrix3.postConcat(c(size, i));
                matrix = matrix3;
            } else {
                matrix = null;
            }
            matrix.invert(matrix2);
            Matrix matrix4 = new Matrix();
            matrix4.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
            matrix2.postConcat(matrix4);
        }
    }

    public final Size b() {
        return pfg1.b(this.c) ? new Size(this.b.height(), this.b.width()) : new Size(this.b.width(), this.b.height());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0070  */
    /* JADX WARN: Code duplicated, block: B:19:0x0073  */
    public final Matrix c(Size size, int i) {
        Matrix.ScaleToFit scaleToFit;
        RectF rectF;
        o0c.q((String) null, f());
        if (pfg1.c(size, true, b())) {
            rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            RectF rectF2 = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
            Size sizeB = b();
            RectF rectF3 = new RectF(0.0f, 0.0f, sizeB.getWidth(), sizeB.getHeight());
            Matrix matrix = new Matrix();
            emw0 emw0Var = this.h;
            int iOrdinal = emw0Var.ordinal();
            if (iOrdinal == 0) {
                scaleToFit = Matrix.ScaleToFit.START;
            } else if (iOrdinal == 1) {
                scaleToFit = Matrix.ScaleToFit.CENTER;
            } else if (iOrdinal == 2) {
                scaleToFit = Matrix.ScaleToFit.END;
            } else if (iOrdinal == 3) {
                scaleToFit = Matrix.ScaleToFit.START;
            } else if (iOrdinal == 4) {
                scaleToFit = Matrix.ScaleToFit.CENTER;
            } else if (iOrdinal != 5) {
                emw0Var.toString();
                j2h1.p("PreviewTransform");
                scaleToFit = Matrix.ScaleToFit.FILL;
            } else {
                scaleToFit = Matrix.ScaleToFit.END;
            }
            if (emw0Var == emw0.FIT_CENTER || emw0Var == emw0.FIT_START || emw0Var == emw0.FIT_END) {
                matrix.setRectToRect(rectF3, rectF2, scaleToFit);
            } else {
                matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                matrix.invert(matrix);
            }
            matrix.mapRect(rectF3);
            if (i == 1) {
                float width = size.getWidth() / 2.0f;
                float f = width + width;
                rectF = new RectF(f - rectF3.right, rectF3.top, f - rectF3.left, rectF3.bottom);
            } else {
                rectF = rectF3;
            }
        }
        Matrix matrixA = pfg1.a(new RectF(this.b), rectF, this.c, false);
        if (this.f && this.g) {
            boolean zB = pfg1.b(this.c);
            Rect rect = this.b;
            if (zB) {
                matrixA.preScale(1.0f, -1.0f, rect.centerX(), this.b.centerY());
                return matrixA;
            }
            matrixA.preScale(-1.0f, 1.0f, rect.centerX(), this.b.centerY());
        }
        return matrixA;
    }

    public final Matrix d() {
        o0c.q((String) null, f());
        RectF rectF = new RectF(0.0f, 0.0f, this.a.getWidth(), this.a.getHeight());
        return pfg1.a(rectF, rectF, !this.g ? this.c : -mqn1.G(this.e), false);
    }

    public final RectF e(Size size, int i) {
        o0c.q((String) null, f());
        Matrix matrixC = c(size, i);
        RectF rectF = new RectF(0.0f, 0.0f, this.a.getWidth(), this.a.getHeight());
        matrixC.mapRect(rectF);
        return rectF;
    }

    public final boolean f() {
        return (this.b == null || this.a == null || !(!this.g || this.e != -1)) ? false : true;
    }
}
