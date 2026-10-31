package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wfh implements xfh {
    public final String a;

    public wfh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wfh) && this.a.equals(((wfh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
