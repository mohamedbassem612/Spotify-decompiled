package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f9x0 extends w361 {
    public final String c;

    public f9x0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f9x0) && this.c.equals(((f9x0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
