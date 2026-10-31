package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class cg5 {
    public static final ajn0 a = ajn0.e("message");
    public static final ajn0 b = ajn0.e("replaceWith");
    public static final ajn0 c = ajn0.e("level");
    public static final ajn0 d = ajn0.e("expression");
    public static final ajn0 e = ajn0.e("imports");

    public static final qbc a(g6b0 g6b0Var, String str, String str2, String str3) {
        qbc qbcVar = new qbc(g6b0Var, rfb1.o, sqg0.J(new mmr0[]{new mmr0(d, new ghc1(str2)), new mmr0(e, new e46(z6x.a, new bg5(g6b0Var, (byte) 0)))}));
        kf30 kf30Var = rfb1.m;
        mmr0 mmr0Var = new mmr0(a, new ghc1(str));
        mmr0 mmr0Var2 = new mmr0(b, new dg5(qbcVar));
        kf30 kf30Var2 = rfb1.n;
        return new qbc(g6b0Var, kf30Var, sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0(c, new b1z(new heg(kf30Var2.b(), kf30Var2.a.g()), ajn0.e(str3)))}));
    }
}
