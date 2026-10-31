package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w100 extends f600 {
    public final tv80 a;

    public w100(tv80 tv80Var) {
        this.a = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w100) && u890.j(this.a, ((w100) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
