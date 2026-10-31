package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sj91 extends bk91 {
    public final yk91 a;

    public sj91(yk91 yk91Var) {
        this.a = yk91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sj91) && u890.j(this.a, ((sj91) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(0L) + (this.a.hashCode() * 31);
    }
}
