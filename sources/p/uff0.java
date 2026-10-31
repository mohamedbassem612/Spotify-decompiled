package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@o661
public final class uff0 {
    public static final tff0 Companion = new tff0();
    public final int a;
    public final int b;

    public /* synthetic */ uff0(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, sff0.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uff0)) {
            return false;
        }
        uff0 uff0Var = (uff0) obj;
        return this.a == uff0Var.a && this.b == uff0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public uff0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
