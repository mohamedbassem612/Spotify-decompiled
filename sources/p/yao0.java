package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yao0 {
    public final int a;
    public final i1z b;

    public yao0(int i, i1z i1zVar) {
        this.a = i;
        this.b = i1zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yao0)) {
            return false;
        }
        yao0 yao0Var = (yao0) obj;
        return this.a == yao0Var.a && this.b.equals(yao0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
