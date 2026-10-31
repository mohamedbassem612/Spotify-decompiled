package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bwn0 implements cwn0 {
    public final tv80 a;

    public bwn0(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final tv80 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bwn0) && u890.j(this.a, ((bwn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
