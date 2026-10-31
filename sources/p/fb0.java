package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class fb0 {
    public static final eb0 Companion = new eb0();
    public final String a;
    public final long b;

    public /* synthetic */ fb0(long j, int i, String str) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, db0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb0)) {
            return false;
        }
        fb0 fb0Var = (fb0) obj;
        return u890.j(this.a, fb0Var.a) && this.b == fb0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public fb0(String str, long j) {
        this.a = str;
        this.b = j;
    }
}
