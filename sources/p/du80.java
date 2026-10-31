package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class du80 extends rc2 {
    public final String d;

    public du80(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof du80) && this.d.equals(((du80) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
