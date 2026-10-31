package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ota1 {
    public final int a;
    public final nta1 b;

    public ota1(int i, nta1 nta1Var) {
        this.a = i;
        this.b = nta1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ota1)) {
            return false;
        }
        ota1 ota1Var = (ota1) obj;
        return this.a == ota1Var.a && u890.j(this.b, ota1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public /* synthetic */ ota1() {
        this(100, jta1.a);
    }
}
