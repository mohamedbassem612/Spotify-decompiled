package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mbj1 {
    public final ji0 a;

    public mbj1(ji0 ji0Var) {
        this.a = ji0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mbj1) && u890.j(this.a, ((mbj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
