package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y9u extends gau {
    public final String a;

    public y9u(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y9u) && this.a.equals(((y9u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
