package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class irq0 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public irq0(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irq0)) {
            return false;
        }
        irq0 irq0Var = (irq0) obj;
        return this.a == irq0Var.a && this.b == irq0Var.b && this.c == irq0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xcg1.g(xcg1.g(Integer.hashCode(this.a) * 31, 31, this.b), 31, true);
    }
}
