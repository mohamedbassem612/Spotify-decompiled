package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class znk0 implements bok0 {
    public final ijf1 a;
    public final s69 b;
    public final yoo c;
    public final bpo d;

    public znk0(ijf1 ijf1Var, s69 s69Var, yoo yooVar, bpo bpoVar) {
        this.a = ijf1Var;
        this.b = s69Var;
        this.c = yooVar;
        this.d = bpoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znk0)) {
            return false;
        }
        znk0 znk0Var = (znk0) obj;
        return this.a == znk0Var.a && this.b.equals(znk0Var.b) && this.c == znk0Var.c && this.d == znk0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + v8i0.h(this.b, this.a.hashCode() * 31, 31)) * 31);
    }
}
