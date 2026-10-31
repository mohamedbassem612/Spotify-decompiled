package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qe51 extends te51 {
    public final String a;
    public final e98 b;

    public qe51(String str, e98 e98Var) {
        this.a = str;
        this.b = e98Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe51)) {
            return false;
        }
        qe51 qe51Var = (qe51) obj;
        return u890.j(this.a, qe51Var.a) && this.b.equals(qe51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
