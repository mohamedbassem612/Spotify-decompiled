package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xaf {
    public final zks0 a;
    public final c380 b;
    public final c380 c;

    public xaf(zks0 zks0Var, c380 c380Var, c380 c380Var2) {
        this.a = zks0Var;
        this.b = c380Var;
        this.c = c380Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xaf)) {
            return false;
        }
        xaf xafVar = (xaf) obj;
        return u890.j(this.a, xafVar.a) && u890.j(this.b, xafVar.b) && u890.j(this.c, xafVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kk0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
