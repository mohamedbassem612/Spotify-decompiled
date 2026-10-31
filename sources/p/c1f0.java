package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c1f0 extends e1f0 {
    public final th8 a;

    public c1f0(th8 th8Var) {
        this.a = th8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1f0) && this.a.equals(((c1f0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
