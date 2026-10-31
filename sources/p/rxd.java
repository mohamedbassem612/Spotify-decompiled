package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rxd {
    public final String a;

    public rxd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rxd) && this.a.equals(((rxd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
