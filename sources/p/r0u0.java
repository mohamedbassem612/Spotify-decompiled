package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r0u0 extends b2p1 {
    public final tv80 c;

    public r0u0(tv80 tv80Var) {
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r0u0) && this.c.equals(((r0u0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
