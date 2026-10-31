package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nql1 implements nti0 {
    public final fra a;
    public final int b;

    public nql1(fra fraVar, int i) {
        this.a = fraVar;
        this.b = i;
    }

    @Override // p.nti0
    public final int a(ur80 ur80Var, long j, int i) {
        int i2 = (int) (j & 4294967295L);
        int i3 = this.b;
        return i >= i2 - (i3 * 2) ? Math.round(((i2 - i) / 2.0f) * 1.0f) : yoi1.p(this.a.c(i, i2), i3, (i2 - i3) - i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nql1)) {
            return false;
        }
        nql1 nql1Var = (nql1) obj;
        return this.a.equals(nql1Var.a) && this.b == nql1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Float.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(alignment=");
        sb.append(this.a);
        sb.append(", margin=");
        return l1d.o(sb, this.b, ')');
    }
}
