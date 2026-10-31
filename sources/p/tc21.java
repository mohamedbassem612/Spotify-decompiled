package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tc21 implements qzw {
    public final ji0 a;

    public tc21(ji0 ji0Var) {
        this.a = ji0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tc21) && u890.j(this.a, ((tc21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
