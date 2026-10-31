package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gcg1 {
    public final int a;
    public final int b;
    public final wae1 c;

    public gcg1(int i, dn81 dn81Var, int i2) {
        this((i2 & 1) != 0 ? 0 : i, 1, (wae1) ((i2 & 4) != 0 ? new a0b((byte) 28) : dn81Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcg1)) {
            return false;
        }
        gcg1 gcg1Var = (gcg1) obj;
        return this.a == gcg1Var.a && this.b == gcg1Var.b && u890.j(this.c, gcg1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public gcg1(int i, int i2, wae1 wae1Var) {
        this.a = i;
        this.b = i2;
        this.c = wae1Var;
    }
}
