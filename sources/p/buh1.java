package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class buh1 {
    public final z740 a;

    public buh1(z740 z740Var) {
        this.a = z740Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof buh1) && this.a.equals(((buh1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
