package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class icv0 extends e9p1 {
    public final String c;

    public icv0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof icv0) && this.c.equals(((icv0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
