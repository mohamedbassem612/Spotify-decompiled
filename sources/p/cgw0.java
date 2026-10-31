package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cgw0 extends up30 {
    public final String c;
    public final String d;
    public final tv80 e;

    public cgw0(String str, String str2, tv80 tv80Var) {
        this.c = str;
        this.d = str2;
        this.e = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgw0)) {
            return false;
        }
        cgw0 cgw0Var = (cgw0) obj;
        return this.c.equals(cgw0Var.c) && u890.j(this.d, cgw0Var.d) && u890.j(this.e, cgw0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        tv80 tv80Var = this.e;
        return iHashCode2 + (tv80Var != null ? tv80Var.hashCode() : 0);
    }
}
