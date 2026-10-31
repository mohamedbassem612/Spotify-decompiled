package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rn5 implements sn5 {
    public final do5 a;

    public rn5(do5 do5Var) {
        this.a = do5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rn5) && u890.j(this.a, ((rn5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
