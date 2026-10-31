package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pzl extends zzl {
    public final ro41 a;

    public pzl(ro41 ro41Var) {
        this.a = ro41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pzl) && u890.j(this.a, ((pzl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
