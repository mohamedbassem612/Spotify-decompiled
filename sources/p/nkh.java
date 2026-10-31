package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nkh extends pkh {
    public final int b;
    public final String c;

    public nkh(int i, String str) {
        super(fkh.i);
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkh)) {
            return false;
        }
        nkh nkhVar = (nkh) obj;
        return this.b == nkhVar.b && this.c.equals(nkhVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }
}
