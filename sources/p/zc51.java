package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zc51 extends hd51 {
    public final String b;
    public final tv80 c;

    public zc51(String str, tv80 tv80Var) {
        this.b = str;
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc51)) {
            return false;
        }
        zc51 zc51Var = (zc51) obj;
        return u890.j(this.b, zc51Var.b) && u890.j(this.c, zc51Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        tv80 tv80Var = this.c;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
