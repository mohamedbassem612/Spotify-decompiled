package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s8k1 extends d7p1 {
    public final tv80 c;

    public s8k1(tv80 tv80Var) {
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s8k1) && this.c.equals(((s8k1) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
