package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class og71 extends tg71 {
    public final o571 a;
    public final s4b1 b;

    public og71(o571 o571Var, s4b1 s4b1Var) {
        this.a = o571Var;
        this.b = s4b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og71)) {
            return false;
        }
        og71 og71Var = (og71) obj;
        return u890.j(this.a, og71Var.a) && u890.j(this.b, og71Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        s4b1 s4b1Var = this.b;
        return iHashCode + (s4b1Var == null ? 0 : s4b1Var.hashCode());
    }
}
