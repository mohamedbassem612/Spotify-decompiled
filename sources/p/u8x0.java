package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u8x0 extends w361 {
    public final obx0 c;
    public final boolean d;
    public final tv80 e;

    public u8x0(obx0 obx0Var, boolean z, tv80 tv80Var) {
        this.c = obx0Var;
        this.d = z;
        this.e = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8x0)) {
            return false;
        }
        u8x0 u8x0Var = (u8x0) obj;
        return this.c.equals(u8x0Var.c) && this.d == u8x0Var.d && u890.j(this.e, u8x0Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.c.hashCode() * 31, 31, this.d);
        tv80 tv80Var = this.e;
        return iG + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
