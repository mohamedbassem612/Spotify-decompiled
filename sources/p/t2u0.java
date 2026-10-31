package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t2u0 extends u2u0 {
    public final f6o1 a;

    public t2u0(f6o1 f6o1Var) {
        this.a = f6o1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t2u0) && this.a.equals(((t2u0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
