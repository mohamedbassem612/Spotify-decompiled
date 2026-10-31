package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ctc0 extends htc0 {
    public final int a;
    public final un90 b;

    public ctc0(int i, un90 un90Var) {
        this.a = i;
        this.b = un90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctc0)) {
            return false;
        }
        ctc0 ctc0Var = (ctc0) obj;
        return this.a == ctc0Var.a && u890.j(this.b, ctc0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }
}
