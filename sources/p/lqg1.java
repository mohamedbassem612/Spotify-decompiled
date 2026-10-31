package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lqg1 {
    public final int a;

    public lqg1(kqg1 kqg1Var) {
        this.a = kqg1Var.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqg1) && this.a == ((lqg1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
