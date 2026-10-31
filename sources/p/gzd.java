package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gzd {
    public final String a;
    public final String b;
    public final c380 c;
    public final String d;

    public gzd(String str, String str2, String str3, c380 c380Var) {
        this.a = str;
        this.b = str2;
        this.c = c380Var;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gzd)) {
            return false;
        }
        gzd gzdVar = (gzd) obj;
        return u890.j(this.a, gzdVar.a) && u890.j(this.b, gzdVar.b) && u890.j(this.c, gzdVar.c) && u890.j(this.d, gzdVar.d);
    }

    public final int hashCode() {
        int iF = kk0.f(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return iF + (str == null ? 0 : str.hashCode());
    }
}
