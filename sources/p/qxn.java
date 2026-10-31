package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qxn implements txn {
    public final String a;
    public final h290 b;

    public qxn(String str, h290 h290Var) {
        this.a = str;
        this.b = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxn)) {
            return false;
        }
        qxn qxnVar = (qxn) obj;
        return this.a.equals(qxnVar.a) && this.b.equals(qxnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
