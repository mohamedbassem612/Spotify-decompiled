package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s2b0 extends k3b0 {
    public final String a;
    public final int b;
    public final String c;

    public s2b0(String str, int i) {
        this.a = str;
        this.b = i;
        if (i <= 0) {
            hhg1.n("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
            throw null;
        }
        StringBuilder sb = new StringBuilder("ArrayKClassValue(");
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.a);
        int i3 = this.b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        sb.append(")");
        this.c = sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2b0)) {
            return false;
        }
        s2b0 s2b0Var = (s2b0) obj;
        return u890.j(this.a, s2b0Var.a) && this.b == s2b0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.c;
    }
}
