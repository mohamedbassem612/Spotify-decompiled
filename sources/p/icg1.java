package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class icg1 {
    public final int a;
    public final xae1 b;
    public final lwz0 c;

    public icg1(int i, xae1 xae1Var, lwz0 lwz0Var) {
        this.a = i;
        this.b = xae1Var;
        this.c = lwz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icg1)) {
            return false;
        }
        icg1 icg1Var = (icg1) obj;
        return this.a == icg1Var.a && this.b.equals(icg1Var.b) && this.c.equals(icg1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }
}
