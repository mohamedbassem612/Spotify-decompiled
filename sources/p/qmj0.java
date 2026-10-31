package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qmj0 {
    public final qtw a;
    public final qbk b;

    public qmj0(qtw qtwVar, qbk qbkVar) {
        this.a = qtwVar;
        this.b = qbkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmj0)) {
            return false;
        }
        qmj0 qmj0Var = (qmj0) obj;
        return this.a == qmj0Var.a && this.b == qmj0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
