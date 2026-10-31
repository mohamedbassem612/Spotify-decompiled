package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kho0 implements mho0 {
    public final som a;
    public final s2o b;
    public final String c;

    public kho0(som somVar, s2o s2oVar, String str) {
        this.a = somVar;
        this.b = s2oVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kho0)) {
            return false;
        }
        kho0 kho0Var = (kho0) obj;
        return this.a.equals(kho0Var.a) && this.b.equals(kho0Var.b) && u890.j(this.c, kho0Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
