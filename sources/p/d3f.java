package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class d3f implements q3f {
    public final String a;
    public final gxz0 b;

    public d3f(String str, gxz0 gxz0Var) {
        this.a = str;
        this.b = gxz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3f)) {
            return false;
        }
        d3f d3fVar = (d3f) obj;
        return u890.j(this.a, d3fVar.a) && u890.j(this.b, d3fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
