package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jte0 implements kte0 {
    public final tv80 a;

    public jte0(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jte0) && u890.j(this.a, ((jte0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
