package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uve0 implements vve0 {
    public final uo5 a;

    public uve0(uo5 uo5Var) {
        this.a = uo5Var;
    }

    public final uo5 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uve0) && this.a == ((uve0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
