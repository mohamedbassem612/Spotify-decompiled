package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y9q0 {
    public final String a;

    public y9q0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y9q0) && this.a.equals(((y9q0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
