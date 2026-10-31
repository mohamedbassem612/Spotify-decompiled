package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g500 implements y600 {
    public final String a;
    public final String b;
    public final Throwable c;

    public g500(String str, String str2, Throwable th) {
        this.a = str;
        this.b = str2;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g500)) {
            return false;
        }
        g500 g500Var = (g500) obj;
        if (!u890.j(this.a, g500Var.a)) {
            return false;
        }
        String str = g500Var.b;
        nl7 nl7Var = bp21.b;
        return u890.j(this.b, str) && u890.j(this.c, g500Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        nl7 nl7Var = bp21.b;
        return this.c.hashCode() + cy30.d(iHashCode, 31, this.b);
    }

    public /* synthetic */ g500(int i, String str, String str2, Throwable th) {
        this(str, str2, th);
    }
}
