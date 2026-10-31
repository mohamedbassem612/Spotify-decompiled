package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k51 extends x3p1 {
    public final f31 c;

    public k51(f31 f31Var) {
        this.c = f31Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k51) && u890.j(this.c, ((k51) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final f31 x() {
        return this.c;
    }
}
