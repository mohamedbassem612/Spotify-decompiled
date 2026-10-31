package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y9o {
    public final boolean a;
    public final int b;

    public y9o(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9o)) {
            return false;
        }
        y9o y9oVar = (y9o) obj;
        return this.a == y9oVar.a && this.b == y9oVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
