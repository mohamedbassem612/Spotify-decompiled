package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ccj1 extends hab0 implements zu30 {
    public final /* synthetic */ boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccj1(boolean z) {
        super(4);
        this.a = z;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        spk0 spk0Var = (spk0) obj;
        taj1 taj1Var = (taj1) obj2;
        nbj1 nbj1Var = (nbj1) obj4;
        String strG = taj1Var.c().g();
        if (nbj1Var.equals(u8u0.a)) {
            return this.a ? spk0Var.h().o(strG) : spk0Var.h().q();
        }
        if (nbj1Var.equals(rp00.a)) {
            return spk0Var.h().j().j();
        }
        if (nbj1Var.equals(grg.a)) {
            return spk0Var.h().i().i();
        }
        if (nbj1Var.equals(bf21.a)) {
            return spk0Var.h().v().h(taj1Var.d());
        }
        if (nbj1Var.equals(rxc.a)) {
            return spk0Var.h().h().e(strG);
        }
        return null;
    }
}
