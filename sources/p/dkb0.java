package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dkb0 implements d9j1 {
    public final taj1 a;
    public final String b;

    public dkb0(taj1 taj1Var, String str) {
        this.a = taj1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkb0)) {
            return false;
        }
        dkb0 dkb0Var = (dkb0) obj;
        return u890.j(this.a, dkb0Var.a) && u890.j(this.b, dkb0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + 25724023;
    }
}
