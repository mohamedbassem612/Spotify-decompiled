package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kxb1 implements lxb1 {
    public final int a;
    public final String b;

    public kxb1(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxb1)) {
            return false;
        }
        kxb1 kxb1Var = (kxb1) obj;
        return this.a == kxb1Var.a && u890.j(this.b, kxb1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
