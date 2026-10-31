package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kxn {
    public final txn a;
    public final String b;

    public kxn(txn txnVar, String str) {
        this.a = txnVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxn)) {
            return false;
        }
        kxn kxnVar = (kxn) obj;
        return this.a.equals(kxnVar.a) && this.b.equals(kxnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
