package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yxj0 {
    public final boolean a;
    public final int b;

    public yxj0(int i, boolean z) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yxj0)) {
            return false;
        }
        yxj0 yxj0Var = (yxj0) obj;
        return this.a == yxj0Var.a && this.b == yxj0Var.b;
    }

    public final int hashCode() {
        return l1d.C(this.b) + (Boolean.hashCode(this.a) * 31);
    }
}
