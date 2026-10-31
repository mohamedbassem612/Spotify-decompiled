package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tjj1 {
    public final int a;
    public final int b;

    public tjj1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tjj1)) {
            return false;
        }
        tjj1 tjj1Var = (tjj1) obj;
        return this.a == tjj1Var.a && this.b == tjj1Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
