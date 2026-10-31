package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wik1 implements qzw {
    public final ji0 a;
    public final long b;

    public wik1(ji0 ji0Var, long j) {
        this.a = ji0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wik1)) {
            return false;
        }
        wik1 wik1Var = (wik1) obj;
        return u890.j(this.a, wik1Var.a) && yr80.b(this.b, wik1Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
