package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lz1 extends fap1 {
    public final String c;

    public lz1(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lz1) && this.c.equals(((lz1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
