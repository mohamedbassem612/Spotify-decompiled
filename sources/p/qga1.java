package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qga1 extends rga1 {
    public final eia1 a;

    public qga1(eia1 eia1Var) {
        this.a = eia1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qga1) && this.a.equals(((qga1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
