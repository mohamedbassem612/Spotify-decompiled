package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o1n1 extends q1n1 {
    public final tv80 a;

    public o1n1(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o1n1) && this.a.equals(((o1n1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
