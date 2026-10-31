package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wqz0 {
    public final int a;
    public final tob1 b;
    public final tob1 c;

    public wqz0(int i, ven0 ven0Var, ven0 ven0Var2) {
        this.a = i;
        this.b = ven0Var;
        this.c = ven0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqz0)) {
            return false;
        }
        wqz0 wqz0Var = (wqz0) obj;
        return this.a == wqz0Var.a && this.b.equals(wqz0Var.b) && this.c.equals(wqz0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }
}
