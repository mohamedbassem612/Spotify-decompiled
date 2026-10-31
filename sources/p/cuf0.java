package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cuf0 extends nfp0 {
    public static final ofp0 d;
    public double b = 0.0d;
    public double c = 0.0d;

    static {
        ofp0 ofp0VarA = ofp0.a(64, new cuf0());
        d = ofp0VarA;
        ofp0VarA.f = 0.5f;
    }

    public static void b(cuf0 cuf0Var) {
        d.c(cuf0Var);
    }

    @Override // p.nfp0
    public final nfp0 a() {
        return new cuf0();
    }

    public final String toString() {
        return "MPPointD, x: " + this.b + ", y: " + this.c;
    }
}
