package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class e3f implements q3f {
    public final String a;
    public final String b;
    public final gxz0 c;

    public e3f(String str, String str2, gxz0 gxz0Var) {
        this.a = str;
        this.b = str2;
        this.c = gxz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3f)) {
            return false;
        }
        e3f e3fVar = (e3f) obj;
        return u890.j(this.a, e3fVar.a) && u890.j(this.b, e3fVar.b) && u890.j(this.c, e3fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
