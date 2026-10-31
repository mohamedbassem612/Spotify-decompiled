package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class un5 implements xn5 {
    public final do5 a;

    public un5(do5 do5Var) {
        this.a = do5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof un5) && u890.j(this.a, ((un5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
