package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tt9 implements ut9 {
    public final iu30 a;

    public tt9(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tt9) && u890.j(this.a, ((tt9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
