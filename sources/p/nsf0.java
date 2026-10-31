package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nsf0 implements rsf0 {
    public final int a;
    public final int b;

    public nsf0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsf0)) {
            return false;
        }
        nsf0 nsf0Var = (nsf0) obj;
        return this.a == nsf0Var.a && this.b == nsf0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
