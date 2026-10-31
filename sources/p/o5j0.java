package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o5j0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zyi0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5j0(iu30 iu30Var, zyi0 zyi0Var) {
        super(1);
        this.a = (byte) 3;
        this.c = iu30Var;
        this.b = zyi0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zyi0 zyi0Var = this.b;
        iu30 iu30Var = this.c;
        switch (b) {
            case 0:
                zyi0Var.j.invoke();
                iu30Var.invoke(new gyi0(((s201) obj).a));
                return rih1Var;
            case 1:
                tv80 tv80Var = (tv80) obj;
                zyi0Var.j.invoke();
                iu30Var.invoke(new dyi0(tv80Var != null ? tv80Var.a : null));
                return rih1Var;
            case 2:
                dxi0 dxi0Var = (dxi0) obj;
                uyi0 uyi0Var = zyi0Var.n;
                if (dxi0Var.equals(zwi0.a)) {
                    if (uyi0Var.equals(ryi0.a)) {
                        iu30Var.invoke(eyi0.a);
                    }
                } else if (dxi0Var.equals(axi0.a)) {
                    yyi0 yyi0Var = zyi0Var.f;
                    if (((yyi0Var instanceof xyi0) || (yyi0Var instanceof vyi0)) && (!uyi0Var.equals(oyi0.a) || zyi0Var.o)) {
                        iu30Var.invoke(fyi0.a);
                    }
                } else if (dxi0Var instanceof bxi0) {
                    iu30Var.invoke(iyi0.a);
                } else {
                    if (!(dxi0Var instanceof cxi0)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new kyi0(((cxi0) dxi0Var).a));
                }
                return rih1Var;
            default:
                z001 z001Var = (z001) obj;
                if (z001Var.equals(x001.a)) {
                    iu30Var.invoke(new myi0(zyi0Var.i));
                } else {
                    if (!(z001Var instanceof y001)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new jyi0(((y001) z001Var).a));
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o5j0(zyi0 zyi0Var, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = zyi0Var;
        this.c = iu30Var;
    }
}
