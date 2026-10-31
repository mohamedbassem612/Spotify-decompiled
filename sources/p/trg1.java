package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class trg1 {
    public final int a;
    public final xrg1 b;
    public final int c;

    public trg1(int i, xrg1 xrg1Var, int i2) {
        this.a = i;
        this.b = xrg1Var;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trg1)) {
            return false;
        }
        trg1 trg1Var = (trg1) obj;
        return this.a == trg1Var.a && this.b.equals(trg1Var.b) && this.c == trg1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + kaa0.f(2131959425, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31);
    }
}
