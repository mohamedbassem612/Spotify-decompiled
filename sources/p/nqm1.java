package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nqm1 extends k9 {
    public final int c;

    public nqm1(int i) {
        super(new pr61(0, new sl11(i, (byte) 25), String.valueOf(i)), (byte) 20);
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nqm1) && this.c == ((nqm1) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }
}
