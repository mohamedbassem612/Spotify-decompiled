package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fjt0 implements mjt0 {
    public final ilo1 a;

    public fjt0(ilo1 ilo1Var) {
        this.a = ilo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fjt0) && this.a.equals(((fjt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
