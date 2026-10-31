package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class d9x0 extends w361 {
    public final String c;

    public d9x0(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d9x0) && this.c.equals(((d9x0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
