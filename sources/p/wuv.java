package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wuv implements evv {
    public final String a;

    public wuv(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wuv) && this.a.equals(((wuv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
