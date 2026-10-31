package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rf20 extends v1p1 {
    public final dam c;

    public rf20(dam damVar) {
        this.c = damVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rf20) && this.c.equals(((rf20) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
