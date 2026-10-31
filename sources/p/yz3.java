package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yz3 implements mti0 {
    public final era a;
    public final era b;
    public final int c;

    public yz3(era eraVar, era eraVar2, int i) {
        this.a = eraVar;
        this.b = eraVar2;
        this.c = i;
    }

    @Override // p.mti0
    public final int a(ur80 ur80Var, long j, int i, flb0 flb0Var) {
        int iA = this.b.a(0, ur80Var.d(), flb0Var);
        int i2 = -this.a.a(0, i, flb0Var);
        flb0 flb0Var2 = flb0.a;
        int i3 = this.c;
        if (flb0Var != flb0Var2) {
            i3 = -i3;
        }
        return x0d.g(ur80Var.a, iA, i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz3)) {
            return false;
        }
        yz3 yz3Var = (yz3) obj;
        return this.a.equals(yz3Var.a) && this.b.equals(yz3Var.b) && this.c == yz3Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + x0d.f(Float.hashCode(this.a.a) * 31, 31, this.b.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return l1d.o(sb, this.c, ')');
    }
}
