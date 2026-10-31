package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zwh0 {
    public final dq70 a;
    public final clj1 b;
    public final int c;

    public zwh0(dq70 dq70Var, clj1 clj1Var, int i) {
        this.a = dq70Var;
        this.b = clj1Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwh0)) {
            return false;
        }
        zwh0 zwh0Var = (zwh0) obj;
        return this.a.equals(zwh0Var.a) && this.b.equals(zwh0Var.b) && this.c == zwh0Var.c;
    }

    public final int hashCode() {
        return l1d.C(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
