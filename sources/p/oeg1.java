package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class oeg1 {
    public final int a;
    public final xae1 b;

    public oeg1(int i, xae1 xae1Var) {
        this.a = i;
        this.b = xae1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oeg1)) {
            return false;
        }
        oeg1 oeg1Var = (oeg1) obj;
        return this.a == oeg1Var.a && this.b.equals(oeg1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
