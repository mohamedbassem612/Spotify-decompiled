package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vzz implements k700 {
    public final p2c0 a;
    public final boolean b;

    public vzz(p2c0 p2c0Var, boolean z) {
        this.a = p2c0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzz)) {
            return false;
        }
        vzz vzzVar = (vzz) obj;
        return this.a.equals(vzzVar.a) && this.b == vzzVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
