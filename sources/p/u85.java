package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u85 implements erl1 {
    public final short a;
    public final String b;
    public final hrr0 c = v8r.q(nk80.e);
    public final hrr0 d = v8r.q(Boolean.TRUE);

    /* JADX WARN: Multi-variable type inference failed */
    public u85(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final int a(wat watVar, flb0 flb0Var) {
        return e().c;
    }

    public final int b(wat watVar, flb0 flb0Var) {
        return e().a;
    }

    public final int c(wat watVar) {
        return e().b;
    }

    public final int d(wat watVar) {
        return e().d;
    }

    public final nk80 e() {
        return (nk80) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u85) {
            return this.a == ((u85) obj).a;
        }
        return false;
    }

    public final boolean f() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final void g(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void h(hsl1 hsl1Var, int i) {
        short s = this.a;
        if (i == 0 || (i & s) != 0) {
            this.c.setValue(hsl1Var.a.i(s));
            g(hsl1Var.a.u(s));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = e().a;
        int i2 = e().b;
        int i3 = e().c;
        int i4 = e().d;
        StringBuilder sb = new StringBuilder(this.b);
        sb.append("(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        c13.n(i3, i4, ", ", ", ", sb);
        sb.append(")");
        return sb.toString();
    }
}
