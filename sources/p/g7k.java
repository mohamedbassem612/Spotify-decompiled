package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g7k {
    public final String a;

    public g7k(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g7k) && this.a.equals(((g7k) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
