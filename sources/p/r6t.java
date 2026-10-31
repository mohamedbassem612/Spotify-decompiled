package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class r6t implements s6t {
    public final zks0 a;

    public r6t(zks0 zks0Var) {
        this.a = zks0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r6t) && u890.j(this.a, ((r6t) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
