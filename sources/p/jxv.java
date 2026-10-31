package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jxv implements oxv {
    public final tv80 a;

    public jxv(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxv) && u890.j(this.a, ((jxv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
