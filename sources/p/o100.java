package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o100 extends f600 {
    public final String a;
    public final tv80 b;

    public o100(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o100)) {
            return false;
        }
        o100 o100Var = (o100) obj;
        return u890.j(this.a, o100Var.a) && u890.j(this.b, o100Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
