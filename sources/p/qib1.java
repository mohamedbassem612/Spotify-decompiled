package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qib1 {
    public final phx a;
    public final c380 b;

    public qib1(phx phxVar, c380 c380Var) {
        this.a = phxVar;
        this.b = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qib1)) {
            return false;
        }
        qib1 qib1Var = (qib1) obj;
        return this.a.equals(qib1Var.a) && u890.j(this.b, qib1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
