package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bo5 implements co5 {
    public final do5 a;

    public bo5(do5 do5Var) {
        this.a = do5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bo5) && this.a.equals(((bo5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
