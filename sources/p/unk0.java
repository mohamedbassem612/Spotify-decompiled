package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class unk0 implements bok0 {
    public final ijf1 a;
    public final s69 b;
    public final yoo c;
    public final bpo d;

    public unk0(ijf1 ijf1Var, s69 s69Var, yoo yooVar, bpo bpoVar) {
        this.a = ijf1Var;
        this.b = s69Var;
        this.c = yooVar;
        this.d = bpoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unk0)) {
            return false;
        }
        unk0 unk0Var = (unk0) obj;
        return this.a == unk0Var.a && this.b.equals(unk0Var.b) && this.c == unk0Var.c && this.d == unk0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + v8i0.h(this.b, this.a.hashCode() * 31, 31)) * 31);
    }
}
