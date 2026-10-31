package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fa61 {
    public final boolean a;
    public final boolean b;

    public /* synthetic */ fa61(int i) {
        this((i & 1) != 0, false);
    }

    public static fa61 a(fa61 fa61Var, int i) {
        return new fa61((i & 1) != 0 ? fa61Var.a : false, (i & 2) != 0 ? fa61Var.b : true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa61)) {
            return false;
        }
        fa61 fa61Var = (fa61) obj;
        return this.a == fa61Var.a && this.b == fa61Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public fa61(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
