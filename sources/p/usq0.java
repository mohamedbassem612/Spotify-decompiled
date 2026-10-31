package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class usq0 implements wsq0 {
    public final tg41 a;
    public final urq0 b;

    public usq0(tg41 tg41Var) {
        this.a = tg41Var;
        boolean zEquals = tg41Var.equals(rg41.a);
        urq0 urq0Var = trq0.a;
        if (!zEquals) {
            if (!(tg41Var instanceof sg41)) {
                eg.o();
                throw null;
            }
            sg41 sg41Var = (sg41) tg41Var;
            float f = sg41Var.a;
            if (f != 0.0f) {
                urq0Var = Math.abs(sg41Var.c) <= 900000 ? qrq0.a : f < 0.0f ? rrq0.a : srq0.a;
            }
        }
        this.b = urq0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof usq0) && this.a.equals(((usq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
