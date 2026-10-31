package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class pho1 implements ifp0 {
    public static final pho1 a = new pho1();
    public static final u120 b = new u120("maxMs", td6.n(lqn1.f(bxn1.class, new gwn1(1))));
    public static final u120 c = new u120("minMs", td6.n(lqn1.f(bxn1.class, new gwn1(2))));
    public static final u120 d = new u120("avgMs", td6.n(lqn1.f(bxn1.class, new gwn1(3))));
    public static final u120 e = new u120("firstQuartileMs", td6.n(lqn1.f(bxn1.class, new gwn1(4))));
    public static final u120 f = new u120("medianMs", td6.n(lqn1.f(bxn1.class, new gwn1(5))));
    public static final u120 g = new u120("thirdQuartileMs", td6.n(lqn1.f(bxn1.class, new gwn1(6))));

    public final void a(Object obj, Object obj2) {
        zyo1 zyo1Var = (zyo1) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.a(b, zyo1Var.a);
        jfp0Var.a(c, zyo1Var.b);
        jfp0Var.a(d, zyo1Var.c);
        jfp0Var.a(e, zyo1Var.d);
        jfp0Var.a(f, zyo1Var.e);
        jfp0Var.a(g, zyo1Var.f);
    }
}
