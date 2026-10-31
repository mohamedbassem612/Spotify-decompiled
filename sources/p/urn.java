package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class urn {
    public final String a;

    public urn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof urn) && this.a.equals(((urn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
