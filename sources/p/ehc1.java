package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ehc1 extends ryn1 {
    public final String c;

    public ehc1(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ehc1) && u890.j(this.c, ((ehc1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
