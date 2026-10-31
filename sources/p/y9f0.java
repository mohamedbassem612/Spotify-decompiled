package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y9f0 {
    public final String a;

    public y9f0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y9f0) && u890.j(this.a, ((y9f0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
