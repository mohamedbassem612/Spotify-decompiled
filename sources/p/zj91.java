package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zj91 extends bk91 {
    public final int a;
    public final String b;

    public zj91(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj91)) {
            return false;
        }
        zj91 zj91Var = (zj91) obj;
        return this.a == zj91Var.a && u890.j(this.b, zj91Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
