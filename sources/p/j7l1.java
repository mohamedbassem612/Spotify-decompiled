package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j7l1 {
    public final String a;
    public final String b;
    public final String c;

    public j7l1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7l1)) {
            return false;
        }
        j7l1 j7l1Var = (j7l1) obj;
        return u890.j(this.a, j7l1Var.a) && this.b.equals(j7l1Var.b) && this.c.equals(j7l1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
