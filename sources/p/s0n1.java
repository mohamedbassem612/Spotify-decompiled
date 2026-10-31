package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class s0n1 extends ern1 {
    public final int c;
    public final tv80 d;
    public final kjo0 e;

    public s0n1(int i, tv80 tv80Var, kjo0 kjo0Var) {
        this.c = i;
        this.d = tv80Var;
        this.e = kjo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0n1)) {
            return false;
        }
        s0n1 s0n1Var = (s0n1) obj;
        return this.c == s0n1Var.c && this.d.equals(s0n1Var.d) && u890.j(this.e, s0n1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (Integer.hashCode(this.c) * 31)) * 31);
    }
}
