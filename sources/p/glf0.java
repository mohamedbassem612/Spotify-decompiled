package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class glf0 {
    public final String a;
    public final String b;
    public final flf0 c;

    public glf0(String str, String str2, flf0 flf0Var) {
        this.a = str;
        this.b = str2;
        this.c = flf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glf0)) {
            return false;
        }
        glf0 glf0Var = (glf0) obj;
        return u890.j(this.a, glf0Var.a) && u890.j(this.b, glf0Var.b) && u890.j(this.c, glf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }

    public /* synthetic */ glf0() {
        this("", "", dlf0.a);
    }
}
