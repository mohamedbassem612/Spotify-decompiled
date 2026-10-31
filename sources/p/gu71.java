package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class gu71 {
    public static final fu71 Companion = new fu71();
    public final long a;
    public final long b;

    public /* synthetic */ gu71(int i, long j, long j2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, eu71.a.getDescriptor());
            throw null;
        }
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu71)) {
            return false;
        }
        gu71 gu71Var = (gu71) obj;
        return this.a == gu71Var.a && this.b == gu71Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public gu71(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
