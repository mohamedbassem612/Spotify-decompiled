package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ju60 extends ru60 {
    public final ns60 a;

    public ju60(ns60 ns60Var) {
        this.a = ns60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ju60) && u890.j(this.a, ((ju60) obj).a);
    }

    public final int hashCode() {
        ns60 ns60Var = this.a;
        if (ns60Var == null) {
            return 0;
        }
        return ns60Var.hashCode();
    }
}
