package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n341 extends o341 {
    public final ug8 a;

    public n341(ug8 ug8Var) {
        this.a = ug8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n341) && this.a.equals(((n341) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
