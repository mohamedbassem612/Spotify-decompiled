package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i600 {
    public final String a;
    public final String b;
    public final ji0 c;

    public i600(String str, String str2, ji0 ji0Var) {
        this.a = str;
        this.b = str2;
        this.c = ji0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i600)) {
            return false;
        }
        i600 i600Var = (i600) obj;
        return this.a.equals(i600Var.a) && u890.j(this.b, i600Var.b) && this.c.equals(i600Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
