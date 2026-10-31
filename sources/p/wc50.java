package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wc50 {
    public final String a;

    public wc50(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wc50) && u890.j(this.a, ((wc50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
