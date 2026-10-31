package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class woc0 extends zoc0 {
    public final int a;
    public final un90 b;

    public woc0(int i, un90 un90Var) {
        this.a = i;
        this.b = un90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof woc0)) {
            return false;
        }
        woc0 woc0Var = (woc0) obj;
        return this.a == woc0Var.a && u890.j(this.b, woc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
