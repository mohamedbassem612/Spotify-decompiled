package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@o661
public final class o3c1 {
    public static final n3c1 Companion = new n3c1();
    public final boolean a;
    public final long b;

    public /* synthetic */ o3c1(long j, boolean z, int i) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, m3c1.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3c1)) {
            return false;
        }
        o3c1 o3c1Var = (o3c1) obj;
        return this.a == o3c1Var.a && this.b == o3c1Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public o3c1(boolean z, long j) {
        this.a = z;
        this.b = j;
    }
}
