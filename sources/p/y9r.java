package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class y9r {
    public final oq70 a;
    public final boolean b;

    public y9r(oq70 oq70Var, boolean z) {
        this.a = oq70Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9r)) {
            return false;
        }
        y9r y9rVar = (y9r) obj;
        return this.a.equals(y9rVar.a) && this.b == y9rVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecodeResult(image=");
        sb.append(this.a);
        sb.append(", isSampled=");
        return f4i1.g(sb, this.b, ')');
    }
}
