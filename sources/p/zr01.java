package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zr01 extends vxo1 {
    public final String c;
    public final tv80 d;

    public zr01(String str, tv80 tv80Var) {
        this.c = str;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr01)) {
            return false;
        }
        zr01 zr01Var = (zr01) obj;
        return u890.j(this.c, zr01Var.c) && u890.j(this.d, zr01Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        tv80 tv80Var = this.d;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
