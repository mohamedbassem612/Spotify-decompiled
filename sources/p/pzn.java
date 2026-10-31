package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pzn {
    public final af10 a;

    public pzn(af10 af10Var) {
        this.a = af10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pzn) && u890.j(this.a, ((pzn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
