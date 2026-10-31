package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ih00 extends mh00 {
    public final boolean a;
    public final tv80 b;

    public ih00(tv80 tv80Var, boolean z) {
        this.a = z;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih00)) {
            return false;
        }
        ih00 ih00Var = (ih00) obj;
        return this.a == ih00Var.a && u890.j(this.b, ih00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
