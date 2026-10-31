package p;

import android.graphics.Matrix;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x5w0 implements mch0 {
    public final int a;
    public final int b;
    public float c;
    public final byte d;
    public float e;
    public float f;
    public Matrix g;

    /* JADX WARN: Multi-variable type inference failed */
    public x5w0(float f, int i, int i2, int i3) {
        dm5.n(f == -1.0f || i == -1, "width and aspect ratio should not both be set");
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = i3;
        this.e = -1.0f;
        this.f = -1.0f;
        this.g = new Matrix();
    }

    public static x5w0 f(int i, int i2, int i3) {
        dm5.l("width %s must be positive", i, i > 0);
        dm5.l("height %s must be positive", i2, i2 > 0);
        dm5.l("invalid layout %s", i3, i3 == 0 || i3 == 1 || i3 == 2);
        return new x5w0(-1.0f, i, i2, i3);
    }

    public final Matrix b() {
        return this.g;
    }

    public final int c() {
        return 9729;
    }

    public final l291 d(int i, int i2) {
        dm5.n(i > 0, "inputWidth must be positive");
        dm5.n(i2 > 0, "inputHeight must be positive");
        Matrix matrix = new Matrix();
        this.g = matrix;
        float f = i;
        this.e = f;
        float f2 = i2;
        this.f = f2;
        int i3 = this.a;
        int i4 = this.b;
        if (i3 != -1 && i4 != -1) {
            this.c = i3 / i4;
        }
        float f3 = this.c;
        if (f3 != -1.0f) {
            float f4 = f / f2;
            byte b = this.d;
            if (b == 0) {
                if (f3 > f4) {
                    matrix.setScale(f4 / f3, 1.0f);
                    f2 = this.f;
                    f = this.c * f2;
                    this.e = f;
                } else {
                    matrix.setScale(1.0f, f3 / f4);
                    f = this.e;
                    f2 = f / this.c;
                    this.f = f2;
                }
            } else if (b == 1) {
                if (f3 > f4) {
                    matrix.setScale(1.0f, f3 / f4);
                    f = this.e;
                    f2 = f / this.c;
                    this.f = f2;
                } else {
                    matrix.setScale(f4 / f3, 1.0f);
                    f2 = this.f;
                    f = this.c * f2;
                    this.e = f;
                }
            } else if (b == 2) {
                if (f3 > f4) {
                    f = f2 * f3;
                    this.e = f;
                } else {
                    f2 = f / f3;
                    this.f = f2;
                }
            }
        }
        if (i4 != -1) {
            if (i3 != -1) {
                this.e = i3;
                this.f = i4;
            } else {
                float f5 = i4;
                float f6 = (f * f5) / f2;
                this.e = f6;
                this.e = Math.round(((double) f6) / 1.0d);
                this.f = f5;
            }
        }
        return new l291(Math.round(this.e), Math.round(this.f));
    }

    public final boolean e(int i, int i2) {
        d(i, i2);
        return this.g.isIdentity() && i == Math.round(this.e) && i2 == Math.round(this.f);
    }
}
