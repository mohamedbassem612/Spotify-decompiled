package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ajw0 implements bjw0 {
    public final cjw0 a;

    public ajw0(cjw0 cjw0Var) {
        this.a = cjw0Var;
    }

    public final cjw0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajw0) && u890.j(this.a, ((ajw0) obj).a);
    }

    public final int hashCode() {
        cjw0 cjw0Var = this.a;
        if (cjw0Var == null) {
            return 0;
        }
        return cjw0Var.hashCode();
    }

    public /* synthetic */ ajw0() {
        this(null);
    }
}
