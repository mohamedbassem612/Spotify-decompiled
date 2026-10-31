package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k0e {
    public final t0e a;
    public final c380 b;

    public k0e(t0e t0eVar, c380 c380Var) {
        this.a = t0eVar;
        this.b = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0e)) {
            return false;
        }
        k0e k0eVar = (k0e) obj;
        return this.a.equals(k0eVar.a) && u890.j(this.b, k0eVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
