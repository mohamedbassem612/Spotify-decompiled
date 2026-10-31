package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class ujk1 {
    public static final ojk1 Companion = new ojk1();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ ujk1(int i, boolean z, boolean z2, boolean z3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, njk1.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ujk1)) {
            return false;
        }
        ujk1 ujk1Var = (ujk1) obj;
        return this.a == ujk1Var.a && this.b == ujk1Var.b && this.c == ujk1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }
}
