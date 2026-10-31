package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class p2f implements q3f {
    public final String a;
    public final gxz0 b;

    public p2f(String str, gxz0 gxz0Var) {
        this.a = str;
        this.b = gxz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2f)) {
            return false;
        }
        p2f p2fVar = (p2f) obj;
        return u890.j(this.a, p2fVar.a) && this.b.equals(p2fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
