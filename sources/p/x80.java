package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x80 extends dn90 {
    public final int e;

    public x80(int i) {
        super(i, (byte) 1);
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x80) && this.e == ((x80) obj).e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e);
    }
}
