package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rq6 {
    public final String a;
    public final String b;
    public final String c;

    public rq6(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq6)) {
            return false;
        }
        rq6 rq6Var = (rq6) obj;
        return this.a.equals(rq6Var.a) && this.b.equals(rq6Var.b) && this.c.equals(rq6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
