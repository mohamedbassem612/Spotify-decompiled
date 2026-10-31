package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
@o661
public final class y320 {
    public static final x320 Companion = new x320();
    public final int a;
    public final v0u b;

    public /* synthetic */ y320(int i, int i2, v0u v0uVar) {
        if (3 != (i & 3)) {
            o6p1.t(i, 3, w320.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = v0uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y320)) {
            return false;
        }
        y320 y320Var = (y320) obj;
        return this.a == y320Var.a && u890.j(this.b, y320Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public y320(v0u v0uVar) {
        this.a = 2;
        this.b = v0uVar;
    }
}
