package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wdn implements ydn {
    public final String a;

    public wdn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wdn) && this.a.equals(((wdn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
