package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l100 implements l600 {
    public final tv80 a;

    public l100(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l100) && u890.j(this.a, ((l100) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
