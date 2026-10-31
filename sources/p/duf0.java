package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class duf0 extends nfp0 {
    public static final ofp0 d;
    public float b = 0.0f;
    public float c = 0.0f;

    static {
        ofp0 ofp0VarA = ofp0.a(32, new duf0());
        d = ofp0VarA;
        ofp0VarA.f = 0.5f;
    }

    public static duf0 b(float f, float f2) {
        duf0 duf0Var = (duf0) d.b();
        duf0Var.b = f;
        duf0Var.c = f2;
        return duf0Var;
    }

    @Override // p.nfp0
    public final nfp0 a() {
        return new duf0();
    }
}
