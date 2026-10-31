package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w000 extends e600 {
    public final tv80 a;

    public w000(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w000) && u890.j(this.a, ((w000) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
