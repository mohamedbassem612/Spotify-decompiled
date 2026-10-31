package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uuc0 implements cvc0 {
    public final int a;
    public final zkb b;
    public final int c;

    public uuc0(int i, zkb zkbVar, int i2) {
        this.a = i;
        this.b = zkbVar;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uuc0)) {
            return false;
        }
        uuc0 uuc0Var = (uuc0) obj;
        return this.a == uuc0Var.a && this.b.equals(uuc0Var.b) && this.c == uuc0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }
}
