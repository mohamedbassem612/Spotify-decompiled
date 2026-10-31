package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vdw extends vzn1 {
    public final String c;

    public vdw(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdw) && this.c.equals(((vdw) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
