package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bjc1 {
    public final cqs0 a;

    public bjc1(cqs0 cqs0Var) {
        this.a = cqs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bjc1) && u890.j(this.a, ((bjc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
