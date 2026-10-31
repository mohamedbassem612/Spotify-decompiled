package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class lff0 {
    public static final kff0 Companion = new kff0();
    public final int a;
    public final int b;
    public final int c;

    public /* synthetic */ lff0(int i, int i2, int i3, int i4) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, jff0.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
        this.c = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lff0)) {
            return false;
        }
        lff0 lff0Var = (lff0) obj;
        return this.a == lff0Var.a && this.b == lff0Var.b && this.c == lff0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public lff0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
