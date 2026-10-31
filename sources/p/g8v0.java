package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class g8v0 extends j7p1 {
    public final String c;

    public g8v0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g8v0) && this.c.equals(((g8v0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
