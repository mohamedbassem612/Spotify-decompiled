package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ap30 {
    public final String a;
    public final String b;
    public final String c;

    public ap30(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap30)) {
            return false;
        }
        ap30 ap30Var = (ap30) obj;
        return this.a.equals(ap30Var.a) && this.b.equals(ap30Var.b) && this.c.equals(ap30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
