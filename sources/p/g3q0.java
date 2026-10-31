package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g3q0 {
    public final w6e0 a;
    public final buf0 b;
    public final yqg c;
    public final int d;
    public final q8n e;

    public g3q0(w6e0 w6e0Var, buf0 buf0Var, yqg yqgVar, int i, q8n q8nVar) {
        this.a = w6e0Var;
        this.b = buf0Var;
        this.c = yqgVar;
        this.d = i;
        this.e = q8nVar;
    }

    public final mr20 a(String str) {
        int i;
        return (!nhc1.Y(str, "spotify:album", false) || (i = this.d) <= 0) ? h4p1.m(c3q0.a) : hu20.e(t5p1.i(this.b.a()), new ko2((lnm) null, this, str, i));
    }
}
