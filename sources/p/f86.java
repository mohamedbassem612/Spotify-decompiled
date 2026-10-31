package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f86 implements m86 {
    public final dxn0 a;

    public f86(dxn0 dxn0Var) {
        this.a = dxn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f86) && this.a.equals(((f86) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
