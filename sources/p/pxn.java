package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pxn implements txn {
    public final String a;
    public final long b;

    public pxn(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxn)) {
            return false;
        }
        pxn pxnVar = (pxn) obj;
        return this.a.equals(pxnVar.a) && this.b == pxnVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
