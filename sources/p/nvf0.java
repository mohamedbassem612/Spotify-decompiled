package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nvf0 extends pvf0 {
    public final tv80 a;

    public nvf0(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nvf0) && u890.j(this.a, ((nvf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
