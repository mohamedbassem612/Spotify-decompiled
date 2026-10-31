package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dm2 implements nm2 {
    public final pk2 a;

    public dm2(pk2 pk2Var) {
        this.a = pk2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dm2) && this.a.equals(((dm2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
