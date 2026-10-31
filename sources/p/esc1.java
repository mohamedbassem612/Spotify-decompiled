package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class esc1 extends c4p1 {
    public final p480 c;
    public final int d;

    public esc1(p480 p480Var, int i) {
        this.c = p480Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esc1)) {
            return false;
        }
        esc1 esc1Var = (esc1) obj;
        return this.c.equals(esc1Var.c) && this.d == esc1Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + (this.c.a.hashCode() * 31);
    }
}
