package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fhn0 extends cgj1 {
    public final String c;

    public fhn0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fhn0) && this.c.equals(((fhn0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
