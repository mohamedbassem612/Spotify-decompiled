package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class q6a0 {
    public final String a;
    public final String b;
    public final String c;

    public q6a0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6a0)) {
            return false;
        }
        q6a0 q6a0Var = (q6a0) obj;
        return u890.j(this.a, q6a0Var.a) && u890.j(this.b, q6a0Var.b) && u890.j(this.c, q6a0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
