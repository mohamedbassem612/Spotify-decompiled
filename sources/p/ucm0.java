package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class ucm0 implements fdm0 {
    public static final tcm0 Companion = new tcm0();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ ucm0(int i, boolean z, boolean z2, boolean z3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, scm0.a.getDescriptor());
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
        if (!(obj instanceof ucm0)) {
            return false;
        }
        ucm0 ucm0Var = (ucm0) obj;
        return this.a == ucm0Var.a && this.b == ucm0Var.b && this.c == ucm0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public ucm0(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }
}
