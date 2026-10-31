package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lkf0 implements nkf0 {
    public final int a;
    public final boolean b;

    public lkf0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lkf0)) {
            return false;
        }
        lkf0 lkf0Var = (lkf0) obj;
        return this.a == lkf0Var.a && this.b == lkf0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
