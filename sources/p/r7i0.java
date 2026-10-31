package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r7i0 extends hno1 {
    public final u3i0 c;

    public r7i0(u3i0 u3i0Var) {
        this.c = u3i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r7i0) && this.c.equals(((r7i0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
