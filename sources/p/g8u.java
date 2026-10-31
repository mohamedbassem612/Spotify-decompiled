package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g8u extends d9u {
    public final abu a;
    public final boolean b;

    public g8u(abu abuVar, boolean z) {
        this.a = abuVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8u)) {
            return false;
        }
        g8u g8uVar = (g8u) obj;
        return u890.j(this.a, g8uVar.a) && this.b == g8uVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
