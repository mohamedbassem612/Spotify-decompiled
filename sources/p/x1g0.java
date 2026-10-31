package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x1g0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xhl b;
    public final /* synthetic */ ihl c;
    public final /* synthetic */ ihl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1g0(xhl xhlVar, ihl ihlVar, ihl ihlVar2, ihl ihlVar3) {
        super(1);
        this.a = (byte) 0;
        this.b = xhlVar;
        this.c = ihlVar;
        this.d = ihlVar3;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nnb0 nnb0Var = this.d;
        nnb0 nnb0Var2 = this.c;
        xhl xhlVar = this.b;
        switch (b) {
            case 0:
                dhl dhlVar = (dhl) obj;
                dhlVar.g(new e5u((p3v) null, "parent"));
                yf.p(dhlVar.g, uhl.g(xhlVar, new nnb0[]{nnb0Var2, nnb0Var}), 0.0f, 6);
                break;
            case 1:
                dhl dhlVar2 = (dhl) obj;
                dhlVar2.g(new e5u((p3v) null, "parent"));
                yf.p(dhlVar2.g, uhl.g(xhlVar, new nnb0[]{nnb0Var2, nnb0Var}), 0.0f, 6);
                break;
            case 2:
                ube ubeVar = ((dhl) obj).g;
                nnb0[] nnb0VarArr = {nnb0Var2, nnb0Var};
                onb0 onb0Var = new onb0(Integer.valueOf(xhlVar.f()));
                yhc yhcVar = new yhc(new char[0]);
                for (int i = 0; i < 2; i++) {
                    yhcVar.n(gic.n(nnb0VarArr[i].a().toString()));
                }
                eic eicVarB = xhlVar.b(onb0Var);
                eicVarB.K("type", "barrier");
                eicVarB.K("direction", "bottom");
                eicVarB.J("margin", 0.0f);
                eicVarB.I("contains", yhcVar);
                xhlVar.i(15);
                for (int i2 = 0; i2 < 2; i2++) {
                    xhlVar.i(nnb0VarArr[i2].hashCode());
                }
                xhlVar.i(Float.hashCode(0.0f));
                yf.p(ubeVar, new shl(((nnb0) onb0Var).a, 0, onb0Var), 0.0f, 6);
                break;
            default:
                dhl dhlVar3 = (dhl) obj;
                hrt.m((p3v) null, "parent", dhlVar3, (p3v) null, "spread");
                yf.p(dhlVar3.e, uhl.g(xhlVar, new nnb0[]{nnb0Var2, nnb0Var}), 0.0f, 6);
                yf.p(dhlVar3.g, dhlVar3.c.g, 0.0f, 6);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1g0(xhl xhlVar, ihl ihlVar, ihl ihlVar2, byte b) {
        super(1);
        this.a = b;
        this.b = xhlVar;
        this.c = ihlVar;
        this.d = ihlVar2;
    }
}
