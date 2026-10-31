package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w671 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public w671(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w671)) {
            return false;
        }
        w671 w671Var = (w671) obj;
        return this.a.equals(w671Var.a) && u890.j(this.b, w671Var.b) && this.c.equals(w671Var.c) && this.d == w671Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
