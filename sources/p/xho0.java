package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xho0 {
    public final som a;
    public final s2o b;
    public final String c;

    public xho0(som somVar, s2o s2oVar, String str) {
        this.a = somVar;
        this.b = s2oVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xho0)) {
            return false;
        }
        xho0 xho0Var = (xho0) obj;
        return this.a.equals(xho0Var.a) && this.b.equals(xho0Var.b) && u890.j(this.c, xho0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return Boolean.hashCode(true) + xcg1.g((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, false);
    }
}
