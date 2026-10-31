package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bs6 {
    public final qaa1 a;

    public bs6(qaa1 qaa1Var) {
        this.a = qaa1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bs6) && u890.j(this.a, ((bs6) obj).a);
    }

    public final int hashCode() {
        qaa1 qaa1Var = this.a;
        if (qaa1Var == null) {
            return 0;
        }
        return Boolean.hashCode(qaa1Var.a);
    }
}
