package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bh00 extends mh00 {
    public final tv80 a;

    public bh00(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bh00) && u890.j(this.a, ((bh00) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 1426582503;
    }
}
