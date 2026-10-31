package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wjx0 {
    public final int a;
    public final boolean b;

    public wjx0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wjx0.class != obj.getClass()) {
            return false;
        }
        wjx0 wjx0Var = (wjx0) obj;
        return this.a == wjx0Var.a && this.b == wjx0Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
