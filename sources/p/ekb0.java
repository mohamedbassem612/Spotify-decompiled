package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ekb0 implements e9j1 {
    public final taj1 a;
    public final String b;
    public final String c;

    public ekb0(taj1 taj1Var, String str, String str2) {
        this.a = taj1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ekb0)) {
            return false;
        }
        ekb0 ekb0Var = (ekb0) obj;
        return u890.j(this.a, ekb0Var.a) && u890.j(this.b, ekb0Var.b) && this.c.equals(ekb0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
