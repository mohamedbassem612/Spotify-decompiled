package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class f361 {
    public final String a;
    public final byte b;
    public final String c;

    /* JADX WARN: Multi-variable type inference failed */
    public f361(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f361)) {
            return false;
        }
        f361 f361Var = (f361) obj;
        return u890.j(this.a, f361Var.a) && this.b == f361Var.b && u890.j(this.c, f361Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iF = kaa0.f(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.c;
        return iF + (str2 != null ? str2.hashCode() : 0);
    }
}
