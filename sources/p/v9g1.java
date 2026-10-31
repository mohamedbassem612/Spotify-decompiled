package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v9g1 implements e9g1 {
    public final keq a;
    public final leq b;
    public final n35 c;

    public v9g1(keq keqVar, leq leqVar, n35 n35Var) {
        this.a = keqVar;
        this.b = leqVar;
        this.c = n35Var;
    }

    public final dzj create() {
        return this.c.a() ? new dzj(this.b.a.d.R3(), (byte) 0) : new dzj(this.a.a.d.R3(), (byte) 1);
    }
}
