package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lnd1 extends azo1 {
    public final int c;

    public lnd1(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lnd1) && this.c == ((lnd1) obj).c;
    }

    public final int hashCode() {
        return l1d.C(this.c);
    }
}
