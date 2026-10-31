package p;

import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class pxa extends jmr0 {
    public ColorFilter X;
    public final yk4 f;
    public final long g;
    public int h;
    public final long i;
    public float t;

    public pxa(yk4 yk4Var, long j) {
        int i;
        this.f = yk4Var;
        this.g = j;
        this.h = 1;
        int i2 = (int) (j >> 32);
        if (i2 < 0 || (i = (int) (4294967295L & j)) < 0 || i2 > yk4Var.a.getWidth() || i > yk4Var.a.getHeight()) {
            hhg1.n("Failed requirement.");
            throw null;
        }
        this.i = j;
        this.t = 1.0f;
    }

    @Override // p.jmr0
    public final boolean a(float f) {
        this.t = f;
        return true;
    }

    @Override // p.jmr0
    public final boolean c(ColorFilter colorFilter) {
        this.X = colorFilter;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxa)) {
            return false;
        }
        pxa pxaVar = (pxa) obj;
        return u890.j(this.f, pxaVar.f) && qr80.b(0L, 0L) && yr80.b(this.g, pxaVar.g) && k1p1.l(this.h, pxaVar.h);
    }

    public final int hashCode() {
        return k1p1.n(this.h) + cy30.f(cy30.f(this.f.hashCode() * 31, 0L, 31), this.g, 31);
    }

    @Override // p.jmr0
    public final long i() {
        return o0c.R(this.i);
    }

    @Override // p.jmr0
    public final void j(DrawScope drawScope) {
        DrawScope.G(drawScope, this.f, 0L, this.g, 0L, (((long) Math.round(Float.intBitsToFloat((int) (drawScope.j() >> 32)))) << 32) | (((long) Math.round(Float.intBitsToFloat((int) (drawScope.j() & 4294967295L)))) & 4294967295L), this.t, this.X, this.h, 328);
    }

    public final String toString() {
        String strE = qr80.e(0L);
        String strC = yr80.c(this.g);
        String strS = k1p1.s(this.h);
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f);
        sb.append(", srcOffset=");
        sb.append(strE);
        sb.append(", srcSize=");
        return rjx.o(sb, strC, ", filterQuality=", strS, ")");
    }

    public pxa(yk4 yk4Var) {
        this(yk4Var, (((long) yk4Var.a.getHeight()) & 4294967295L) | (((long) yk4Var.a.getWidth()) << 32));
    }
}
