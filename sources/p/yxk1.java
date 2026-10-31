package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yxk1 implements ayk1 {
    public final tv80 a;

    public yxk1(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yxk1) && u890.j(this.a, ((yxk1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
