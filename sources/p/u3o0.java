package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class u3o0 {
    public final hux a;
    public final String b;
    public final String c;

    public u3o0(String str, String str2, hux huxVar) {
        this.a = huxVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3o0)) {
            return false;
        }
        u3o0 u3o0Var = (u3o0) obj;
        return u890.j(this.a, u3o0Var.a) && u890.j(this.b, u3o0Var.b) && u890.j(this.c, u3o0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
