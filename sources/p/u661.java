package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class u661 {
    public static final t661 Companion = new t661();
    public final int a;
    public final int b;

    public /* synthetic */ u661(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, s661.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u661)) {
            return false;
        }
        u661 u661Var = (u661) obj;
        return this.a == u661Var.a && this.b == u661Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public u661(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
