package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q100 implements h600 {
    public final tv80 a;

    public q100(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q100) && u890.j(this.a, ((q100) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
