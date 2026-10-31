package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mew0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sbw0 b;
    public final /* synthetic */ gfw0 c;

    public mew0(sbw0 sbw0Var, gfw0 gfw0Var) {
        this.a = (byte) 1;
        this.b = sbw0Var;
        this.c = gfw0Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        gfw0 gfw0Var = this.c;
        sbw0 sbw0Var = this.b;
        switch (b) {
            case 0:
                fgl fglVar = (fgl) obj;
                if (u890.j(fglVar.b.b, gfw0.p(sbw0Var))) {
                    int iC = l1d.C(fglVar.a);
                    if (iC != 0) {
                        if (iC != 1) {
                            eg.o();
                            return null;
                        }
                        if (gfw0Var.K == 2) {
                            gfw0Var.K = 1;
                            if (gfw0Var.D) {
                                gfw0Var.f4p.m((Object) null, Boolean.TRUE);
                                sbw0 sbw0Var2 = gfw0Var.v;
                                if (sbw0Var2 != null && gfw0Var.E) {
                                    gfw0Var.r(sbw0Var2);
                                }
                            }
                        }
                    } else if (gfw0Var.K != 3) {
                        gfw0Var.K = 2;
                        sbw0 sbw0Var3 = gfw0Var.v;
                        if (sbw0Var3 != null) {
                            gfw0Var.s(sbw0Var3);
                        } else {
                            gfw0Var.w();
                        }
                    }
                }
                return rih1Var;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                bpb1 bpb1Var = gfw0Var.q;
                if (sbw0Var.h && gfw0Var.K == 1 && zBooleanValue) {
                    bpb1Var.m((Object) null, Boolean.TRUE);
                } else if (((r091) gfw0Var.k.b) == null) {
                    bpb1Var.m((Object) null, Boolean.FALSE);
                }
                return rih1Var;
            default:
                if (((Boolean) obj).booleanValue()) {
                    gfw0Var.r(sbw0Var);
                } else {
                    gfw0Var.s(sbw0Var);
                }
                return rih1Var;
        }
    }

    public /* synthetic */ mew0(gfw0 gfw0Var, sbw0 sbw0Var, byte b) {
        this.a = b;
        this.c = gfw0Var;
        this.b = sbw0Var;
    }
}
