package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u501 {
    public final String a;
    public final String b;
    public final boolean c;

    public u501(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u501)) {
            return false;
        }
        u501 u501Var = (u501) obj;
        return u890.j(this.a, u501Var.a) && u890.j(this.b, u501Var.b) && this.c == u501Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
