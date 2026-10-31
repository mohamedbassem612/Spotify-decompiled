package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i920 extends m0p1 {
    public final String c;

    public i920(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i920) && u890.j(this.c, ((i920) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
