package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mn20 implements erl1 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public mn20(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    @Override // p.erl1
    public final int a(wat watVar, flb0 flb0Var) {
        return this.c;
    }

    @Override // p.erl1
    public final int b(wat watVar, flb0 flb0Var) {
        return this.a;
    }

    @Override // p.erl1
    public final int c(wat watVar) {
        return this.b;
    }

    @Override // p.erl1
    public final int d(wat watVar) {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mn20)) {
            return false;
        }
        mn20 mn20Var = (mn20) obj;
        return this.a == mn20Var.a && this.b == mn20Var.b && this.c == mn20Var.c && this.d == mn20Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sbQ = cy30.q(this.a, this.b, "Insets(left=", ", top=", ", right=");
        sbQ.append(this.c);
        sbQ.append(", bottom=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
