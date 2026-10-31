package p;

import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor$Companion;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mlj0 {
    public final llj0 a;
    public final vjj0 b;
    public final up11 c;
    public final vu30 d;
    public final n6r0 e;
    public final int f;
    public final boolean g;
    public final mr20 h;
    public final boolean i;

    public mlj0(llj0 llj0Var, vjj0 vjj0Var, up11 up11Var, vu30 vu30Var, n6r0 n6r0Var, int i, boolean z, xe01 xe01Var, int i2) {
        vjj0Var = (i2 & 2) != 0 ? null : vjj0Var;
        up11Var = (i2 & 16) != 0 ? rp11.a : up11Var;
        z = (i2 & 256) != 0 ? false : z;
        xe01Var = (i2 & NativeMediaProcessor$Companion.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0 ? null : xe01Var;
        boolean z2 = (i2 & 1024) == 0;
        this.a = llj0Var;
        this.b = vjj0Var;
        this.c = up11Var;
        this.d = vu30Var;
        this.e = n6r0Var;
        this.f = i;
        this.g = z;
        this.h = xe01Var;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlj0)) {
            return false;
        }
        mlj0 mlj0Var = (mlj0) obj;
        return this.a.equals(mlj0Var.a) && u890.j(this.b, mlj0Var.b) && this.c.equals(mlj0Var.c) && this.d.equals(mlj0Var.d) && u890.j(this.e, mlj0Var.e) && this.f == mlj0Var.f && this.g == mlj0Var.g && u890.j(this.h, mlj0Var.h) && this.i == mlj0Var.i;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vjj0 vjj0Var = this.b;
        int iG = xcg1.g(ab80.k(this.f, (this.e.hashCode() + hrt.g((this.c.hashCode() + ((iHashCode + (vjj0Var == null ? 0 : vjj0Var.hashCode())) * 29791)) * 31, 31, this.d)) * 31, 31), 31, this.g);
        mr20 mr20Var = this.h;
        return xcg1.g((iG + (mr20Var != null ? mr20Var.hashCode() : 0)) * 31, 31, this.i);
    }
}
