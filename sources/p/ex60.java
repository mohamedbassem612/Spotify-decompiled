package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ex60 {
    public final String a;
    public final int b;
    public final String c;

    public ex60(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex60)) {
            return false;
        }
        ex60 ex60Var = (ex60) obj;
        return u890.j(this.a, ex60Var.a) && this.b == ex60Var.b && u890.j(this.c, ex60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ab80.k(this.b, this.a.hashCode() * 31, 31);
    }
}
