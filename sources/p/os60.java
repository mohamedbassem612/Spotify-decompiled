package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class os60 {
    public final ns60 a;
    public final ms60 b;

    public /* synthetic */ os60(ns60 ns60Var, ms60 ms60Var, int i) {
        this((i & 1) != 0 ? null : ns60Var, (i & 2) != 0 ? is60.a : ms60Var);
    }

    public static os60 a(os60 os60Var, ns60 ns60Var, ms60 ms60Var, int i) {
        if ((i & 1) != 0) {
            ns60Var = os60Var.a;
        }
        if ((i & 2) != 0) {
            ms60Var = os60Var.b;
        }
        os60Var.getClass();
        return new os60(ns60Var, ms60Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os60)) {
            return false;
        }
        os60 os60Var = (os60) obj;
        return u890.j(this.a, os60Var.a) && u890.j(this.b, os60Var.b);
    }

    public final int hashCode() {
        ns60 ns60Var = this.a;
        return this.b.hashCode() + ((ns60Var == null ? 0 : ns60Var.hashCode()) * 31);
    }

    public os60(ns60 ns60Var, ms60 ms60Var) {
        this.a = ns60Var;
        this.b = ms60Var;
    }
}
