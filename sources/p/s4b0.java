package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class s4b0 {
    public static final r4b0 Companion = new r4b0();
    public final long a;
    public final int b;
    public final int c;

    public /* synthetic */ s4b0(long j, int i, int i2, int i3) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, q4b0.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4b0)) {
            return false;
        }
        s4b0 s4b0Var = (s4b0) obj;
        return this.a == s4b0Var.a && this.b == s4b0Var.b && this.c == s4b0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(this.b, Long.hashCode(this.a) * 31, 31);
    }
}
