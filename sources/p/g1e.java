package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g1e implements h1e {
    public final String a;

    public g1e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g1e) && this.a.equals(((g1e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
