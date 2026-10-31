package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nx0 extends px0 {
    public final ji0 a;

    public nx0(ji0 ji0Var) {
        this.a = ji0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nx0) && this.a.equals(((nx0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
