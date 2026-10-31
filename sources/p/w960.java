package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class w960 implements da60 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public w960(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w960)) {
            return false;
        }
        w960 w960Var = (w960) obj;
        return this.a.equals(w960Var.a) && this.b.equals(w960Var.b) && this.c.equals(w960Var.c) && this.d.equals(w960Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
