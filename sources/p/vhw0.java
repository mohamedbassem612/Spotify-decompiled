package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vhw0 extends thw0 {
    public final int a;
    public final rn71 b;

    public vhw0(int i, rn71 rn71Var) {
        this.a = i;
        this.b = rn71Var;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vhw0)) {
            return false;
        }
        vhw0 vhw0Var = (vhw0) obj;
        return this.a == vhw0Var.a && this.b.equals(vhw0Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
