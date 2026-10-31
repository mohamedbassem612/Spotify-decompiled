package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fs40 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public fs40(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs40)) {
            return false;
        }
        fs40 fs40Var = (fs40) obj;
        return this.a.equals(fs40Var.a) && this.b.equals(fs40Var.b) && this.c.equals(fs40Var.c) && this.d.equals(fs40Var.d) && this.e.equals(fs40Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
