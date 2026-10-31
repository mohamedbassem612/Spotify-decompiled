package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ach1 {
    public final qxc0 a;

    public ach1(qxc0 qxc0Var) {
        this.a = qxc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ach1) && u890.j(this.a, ((ach1) obj).a);
    }

    public final int hashCode() {
        qxc0 qxc0Var = this.a;
        if (qxc0Var == null) {
            return 0;
        }
        return qxc0Var.hashCode();
    }
}
