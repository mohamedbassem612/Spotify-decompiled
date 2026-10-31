package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@o661
public final class jpe1 {
    public static final ipe1 Companion = new ipe1();
    public final String a;
    public final long b;
    public final long c;
    public final int d;
    public final int e;

    public /* synthetic */ jpe1(int i, String str, long j, long j2, int i2, int i3) {
        if (31 != (i & 31)) {
            o6p1.t(i, 31, hpe1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpe1)) {
            return false;
        }
        jpe1 jpe1Var = (jpe1) obj;
        return u890.j(this.a, jpe1Var.a) && this.b == jpe1Var.b && this.c == jpe1Var.c && this.d == jpe1Var.d && this.e == jpe1Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + kaa0.f(this.d, cy30.f(cy30.f(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31);
    }
}
