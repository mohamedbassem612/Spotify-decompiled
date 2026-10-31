package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r361 {
    public final String a;
    public final String b;
    public final String c;
    public final byte d;
    public final s361 e;
    public final boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public r361(String str, String str2, String str3, int i, s361 s361Var, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = s361Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r361)) {
            return false;
        }
        r361 r361Var = (r361) obj;
        return u890.j(this.a, r361Var.a) && u890.j(this.b, r361Var.b) && u890.j(this.c, r361Var.c) && this.d == r361Var.d && this.e.equals(r361Var.e) && this.f == r361Var.f;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + kaa0.f(this.d, cy30.d(cy30.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31)) * 31);
    }
}
