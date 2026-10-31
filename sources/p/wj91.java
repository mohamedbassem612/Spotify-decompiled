package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wj91 extends bk91 {
    public final int a;
    public final String b;

    public wj91(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wj91)) {
            return false;
        }
        wj91 wj91Var = (wj91) obj;
        return this.a == wj91Var.a && u890.j(this.b, wj91Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
