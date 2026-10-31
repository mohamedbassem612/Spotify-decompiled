package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g8k implements z8k {
    public final String a;

    public g8k(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g8k) && this.a.equals(((g8k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
