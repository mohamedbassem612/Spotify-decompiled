package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class woy0 implements yoy0 {
    public final int a;
    public final int b;

    public woy0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof woy0)) {
            return false;
        }
        woy0 woy0Var = (woy0) obj;
        return this.a == woy0Var.a && this.b == woy0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
