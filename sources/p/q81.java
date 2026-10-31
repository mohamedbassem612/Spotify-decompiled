package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q81 extends u4p1 {
    public final String c;
    public final iyr0 d;
    public final g4a e;

    public q81(String str, iyr0 iyr0Var, g4a g4aVar) {
        this.c = str;
        this.d = iyr0Var;
        this.e = g4aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q81)) {
            return false;
        }
        q81 q81Var = (q81) obj;
        return this.c.equals(q81Var.c) && this.d == q81Var.d && this.e == q81Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
