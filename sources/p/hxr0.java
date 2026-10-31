package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@o661
public final class hxr0 {
    public static final gxr0 Companion = new gxr0();
    public final boolean a;
    public final boolean b;

    public /* synthetic */ hxr0(int i, boolean z, boolean z2) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, fxr0.a.getDescriptor());
            throw null;
        }
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hxr0)) {
            return false;
        }
        hxr0 hxr0Var = (hxr0) obj;
        return this.a == hxr0Var.a && this.b == hxr0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public hxr0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
