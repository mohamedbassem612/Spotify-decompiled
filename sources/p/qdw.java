package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qdw extends rzn1 {
    public final String f;

    public qdw(String str) {
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qdw) && this.f.equals(((qdw) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }
}
