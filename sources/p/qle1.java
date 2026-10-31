package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qle1 {
    public final Long a;
    public final Long b;

    public qle1(Long l, Long l2) {
        this.a = l;
        this.b = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qle1)) {
            return false;
        }
        qle1 qle1Var = (qle1) obj;
        return this.a.equals(qle1Var.a) && this.b.equals(qle1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
