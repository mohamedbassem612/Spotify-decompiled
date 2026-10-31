package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hgq0 {
    public final String a;

    public hgq0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hgq0) && this.a.equals(((hgq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
