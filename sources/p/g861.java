package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g861 implements i861 {
    public final String a;

    public g861(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g861) && this.a.equals(((g861) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
