package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ld21 {
    public static final ld21 c = new ld21(0, false);
    public final int a;
    public final boolean b;

    public ld21(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ld21.class == obj.getClass()) {
            ld21 ld21Var = (ld21) obj;
            if (this.a == ld21Var.a && this.b == ld21Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
