package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jz01 implements pz01 {
    public final tv80 a;

    public jz01(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jz01) && u890.j(this.a, ((jz01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
