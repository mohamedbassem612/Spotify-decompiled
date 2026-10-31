package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bph1 implements fph1 {
    public final int a;
    public final String b;

    public bph1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bph1)) {
            return false;
        }
        bph1 bph1Var = (bph1) obj;
        return this.a == bph1Var.a && u890.j(this.b, bph1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (l1d.C(this.a) * 31);
    }
}
