package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z9r0 implements car0 {
    public final vir0 a;

    public z9r0(vir0 vir0Var) {
        this.a = vir0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z9r0) && u890.j(this.a, ((z9r0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
