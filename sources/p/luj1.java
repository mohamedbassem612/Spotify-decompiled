package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class luj1 extends muj1 {
    public final int a;
    public final String b;

    public luj1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof luj1)) {
            return false;
        }
        luj1 luj1Var = (luj1) obj;
        return this.a == luj1Var.a && u890.j(this.b, luj1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
