package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class psi1 implements erl1 {
    public final String a;
    public final hrr0 b;

    public psi1(wk80 wk80Var, String str) {
        this.a = str;
        this.b = v8r.q(wk80Var);
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

    public final wk80 e() {
        return (wk80) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof psi1) {
            return u890.j(e(), ((psi1) obj).e());
        }
        return false;
    }

    public final void f(wk80 wk80Var) {
        this.b.setValue(wk80Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        int i = e().a;
        int i2 = e().b;
        int i3 = e().c;
        int i4 = e().d;
        StringBuilder sb = new StringBuilder(this.a);
        sb.append("(left=");
        sb.append(i);
        sb.append(", top=");
        sb.append(i2);
        c13.n(i3, i4, ", right=", ", bottom=", sb);
        sb.append(")");
        return sb.toString();
    }
}
