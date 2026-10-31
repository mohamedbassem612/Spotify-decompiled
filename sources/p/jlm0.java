package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jlm0 extends klm0 {
    public final tv80 a;

    public jlm0(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jlm0) && u890.j(this.a, ((jlm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
