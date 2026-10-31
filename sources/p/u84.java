package p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class u84 implements fid {
    public Canvas a = v84.a;
    public Rect b;
    public Rect c;

    @Override // p.fid
    public final void b(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // p.fid
    public final void c(float f, float f2, float f3, float f4, lw4 lw4Var) {
        this.a.drawOval(f, f2, f3, f4, fdg1.N(lw4Var));
    }

    @Override // p.fid
    public final void d(float f, float f2, float f3, float f4, lw4 lw4Var) {
        this.a.drawRect(f, f2, f3, f4, fdg1.N(lw4Var));
    }

    @Override // p.fid
    public final void e(yk4 yk4Var, long j, long j2, long j3, long j4, lw4 lw4Var) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapM = no80.m(yk4Var);
        Rect rect = this.b;
        rect.getClass();
        int i = (int) (j >> 32);
        rect.left = i;
        int i2 = (int) (j & 4294967295L);
        rect.top = i2;
        rect.right = i + ((int) (j2 >> 32));
        rect.bottom = i2 + ((int) (j2 & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        int i3 = (int) (j3 >> 32);
        rect2.left = i3;
        int i4 = (int) (j3 & 4294967295L);
        rect2.top = i4;
        rect2.right = i3 + ((int) (j4 >> 32));
        rect2.bottom = i4 + ((int) (j4 & 4294967295L));
        canvas.drawBitmap(bitmapM, rect, rect2, fdg1.N(lw4Var));
    }

    @Override // p.fid
    public final void f(float f, float f2, float f3, float f4, float f5, float f6, lw4 lw4Var) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, fdg1.N(lw4Var));
    }

    @Override // p.fid
    public final void g(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, k1p1.k(i) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // p.fid
    public final void h(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // p.fid
    public final void i() {
        this.a.restore();
    }

    @Override // p.fid
    public final void j(n511 n511Var, lw4 lw4Var) {
        this.a.saveLayer(n511Var.a, n511Var.b, n511Var.c, n511Var.d, fdg1.N(lw4Var), 31);
    }

    @Override // p.fid
    public final void k(long j, long j2, lw4 lw4Var) {
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), fdg1.N(lw4Var));
    }

    @Override // p.fid
    public final void l(float f, float f2, float f3, float f4, float f5, float f6, lw4 lw4Var) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, fdg1.N(lw4Var));
    }

    @Override // p.fid
    public final void m() {
        l0o1.g(this.a, true);
    }

    @Override // p.fid
    public final void n(float f) {
        this.a.rotate(f);
    }

    @Override // p.fid
    public final void o(float f, long j, lw4 lw4Var) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, fdg1.N(lw4Var));
    }

    @Override // p.fid
    public final void p(yk4 yk4Var, long j, lw4 lw4Var) {
        this.a.drawBitmap(no80.m(yk4Var), Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), fdg1.N(lw4Var));
    }

    @Override // p.fid
    public final void q() {
        this.a.save();
    }

    @Override // p.fid
    public final void r() {
        l0o1.g(this.a, false);
    }

    @Override // p.fid
    public final void s(float[] fArr) {
        if (zgo1.t(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        y9g1.v(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // p.fid
    public final void t(u8s0 u8s0Var, int i) {
        Canvas canvas = this.a;
        if (u8s0Var instanceof tw4) {
            canvas.clipPath(((tw4) u8s0Var).a, k1p1.k(i) ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
        } else {
            hhg1.h("Unable to obtain android.graphics.Path");
        }
    }

    @Override // p.fid
    public final void u(u8s0 u8s0Var, lw4 lw4Var) {
        Canvas canvas = this.a;
        if (u8s0Var instanceof tw4) {
            canvas.drawPath(((tw4) u8s0Var).a, fdg1.N(lw4Var));
        } else {
            hhg1.h("Unable to obtain android.graphics.Path");
        }
    }
}
