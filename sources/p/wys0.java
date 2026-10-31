package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wys0 {
    public final String a;

    public wys0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wys0) && this.a.equals(((wys0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
