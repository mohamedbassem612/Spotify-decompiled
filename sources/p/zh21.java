package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zh21 {
    public final String a;
    public final String b;
    public final sqw0 c;

    public zh21(String str, String str2, sqw0 sqw0Var) {
        this.a = str;
        this.b = str2;
        this.c = sqw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh21)) {
            return false;
        }
        zh21 zh21Var = (zh21) obj;
        return u890.j(this.a, zh21Var.a) && u890.j(this.b, zh21Var.b) && u890.j(this.c, zh21Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
