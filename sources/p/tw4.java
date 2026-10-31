package p;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tw4 implements u8s0 {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public tw4(Path path) {
        this.a = path;
    }

    public final void d(u8s0 u8s0Var, long j) {
        if (!(u8s0Var instanceof tw4)) {
            hhg1.h("Unable to obtain android.graphics.Path");
            return;
        }
        this.a.addPath(((tw4) u8s0Var).a, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public final void e(vq31 vq31Var, int i) {
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        float f = vq31Var.a;
        long j = vq31Var.h;
        long j2 = vq31Var.g;
        long j3 = vq31Var.f;
        long j4 = vq31Var.e;
        rectF.set(f, vq31Var.b, vq31Var.c, vq31Var.d);
        float[] fArr = this.c;
        if (fArr == null) {
            fArr = new float[8];
            this.c = fArr;
        }
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        RectF rectF2 = this.b;
        rectF2.getClass();
        float[] fArr2 = this.c;
        fArr2.getClass();
        this.a.addRoundRect(rectF2, fArr2, ww4.c(i));
    }

    public final void f(n511 n511Var, float f, float f2) {
        float f3 = n511Var.a;
        float f4 = n511Var.b;
        float f5 = n511Var.c;
        float f6 = n511Var.d;
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        rectF.set(f3, f4, f5, f6);
        RectF rectF2 = this.b;
        rectF2.getClass();
        this.a.arcTo(rectF2, f, f2, false);
    }

    public final void g() {
        this.a.close();
    }

    public final void h(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    public final n511 i() {
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        this.a.computeBounds(rectF, true);
        return new n511(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void j(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final void k(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    public final boolean l(u8s0 u8s0Var, u8s0 u8s0Var2, int i) {
        Path.Op op;
        if (voo1.n(i, 0)) {
            op = Path.Op.DIFFERENCE;
        } else if (voo1.n(i, 1)) {
            op = Path.Op.INTERSECT;
        } else if (voo1.n(i, 4)) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = voo1.n(i, 2) ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(u8s0Var instanceof tw4)) {
            hhg1.h("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = ((tw4) u8s0Var).a;
        if (u8s0Var2 instanceof tw4) {
            return this.a.op(path, ((tw4) u8s0Var2).a, op);
        }
        hhg1.h("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void m(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    public final void n() {
        this.a.reset();
    }

    public final void o() {
        this.a.rewind();
    }

    public final void p(int i) {
        this.a.setFillType(loo1.t(i, 1) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    public final void q(float[] fArr) {
        Matrix matrix = this.d;
        if (matrix == null) {
            matrix = new Matrix();
            this.d = matrix;
        }
        y9g1.v(matrix, fArr);
        Matrix matrix2 = this.d;
        matrix2.getClass();
        this.a.transform(matrix2);
    }

    public final void r(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }
}
