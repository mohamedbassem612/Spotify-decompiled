package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c631 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public c631(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c631)) {
            return false;
        }
        c631 c631Var = (c631) obj;
        return this.a.equals(c631Var.a) && this.b.equals(c631Var.b) && this.c.equals(c631Var.c) && this.d.equals(c631Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
