package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zse {
    public final c380 a;
    public final int b;
    public final vu30 c;

    public zse(c380 c380Var, int i, vu30 vu30Var) {
        this.a = c380Var;
        this.b = i;
        this.c = vu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zse)) {
            return false;
        }
        zse zseVar = (zse) obj;
        return this.a.equals(zseVar.a) && this.b == zseVar.b && u890.j(this.c, zseVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
