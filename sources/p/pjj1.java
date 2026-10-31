package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pjj1 {
    public final wao0 a;
    public final rjj1 b;

    public pjj1(wao0 wao0Var, rjj1 rjj1Var) {
        this.a = wao0Var;
        this.b = rjj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pjj1) {
            pjj1 pjj1Var = (pjj1) obj;
            return this.a.equals(pjj1Var.a) && this.b == pjj1Var.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
