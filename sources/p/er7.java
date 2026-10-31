package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class er7 extends jr7 {
    public final String a;
    public final String b;
    public final s171 c;

    public er7(String str, String str2, s171 s171Var) {
        this.a = str;
        this.b = str2;
        this.c = s171Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er7)) {
            return false;
        }
        er7 er7Var = (er7) obj;
        return u890.j(this.a, er7Var.a) && u890.j(this.b, er7Var.b) && this.c.equals(er7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
