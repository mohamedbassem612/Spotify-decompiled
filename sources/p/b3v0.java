package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class b3v0 implements zr41 {
    public final /* synthetic */ mi30 a;

    public final void a(float f) {
        Float fValueOf = Float.valueOf(f);
        mi30 mi30Var = this.a;
        switch (mi30Var.a) {
            case 0:
                ygr0 ygr0Var = mi30Var.c;
                mi30Var.b.t(fValueOf.floatValue());
                idd1 idd1Var = (idd1) mi30Var.d;
                if (((kgr0) idd1Var.getValue()).getScrollState() != ygr0Var) {
                    ((kgr0) idd1Var.getValue()).setScrollState(ygr0Var);
                }
                break;
            default:
                kgr0 kgr0Var = (kgr0) mi30Var.d;
                mi30Var.b.t(fValueOf.floatValue());
                ygr0 scrollState = kgr0Var.getScrollState();
                ygr0 ygr0Var2 = mi30Var.c;
                if (scrollState != ygr0Var2) {
                    kgr0Var.setScrollState(ygr0Var2);
                }
                break;
        }
    }
}
