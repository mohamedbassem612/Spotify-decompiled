package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i1k1 {
    public final String a;

    public i1k1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i1k1) && this.a.equals(((i1k1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
