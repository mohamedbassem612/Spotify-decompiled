package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jcv0 extends e9p1 {
    public final String c;

    public jcv0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jcv0) && this.c.equals(((jcv0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
