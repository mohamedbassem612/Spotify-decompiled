package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class t881 {
    public static final s881 Companion = new s881();
    public final y381 a;

    public /* synthetic */ t881(int i, y381 y381Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = y381Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t881) && u890.j(this.a, ((t881) obj).a);
    }

    public final int hashCode() {
        y381 y381Var = this.a;
        if (y381Var == null) {
            return 0;
        }
        return y381Var.hashCode();
    }

    public t881(y381 y381Var) {
        this.a = y381Var;
    }
}
