package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wsc {
    public final String a;

    public wsc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wsc) && u890.j(this.a, ((wsc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
