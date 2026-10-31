package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wwp0 extends fbp1 {
    public final int c;
    public final int d;

    public wwp0(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwp0)) {
            return false;
        }
        wwp0 wwp0Var = (wwp0) obj;
        return this.c == wwp0Var.c && this.d == wwp0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (l1d.C(this.c) * 31);
    }
}
