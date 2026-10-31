package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hxk1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fwk1 b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ tob1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hxk1(fwk1 fwk1Var, iu30 iu30Var, tob1 tob1Var, byte b) {
        super(2);
        this.a = b;
        this.b = fwk1Var;
        this.c = iu30Var;
        this.d = tob1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        jax haxVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tob1 tob1Var = this.d;
        fwk1 fwk1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    lvb lvbVar = fwk1Var.g;
                    String str = lvbVar.b;
                    String str2 = lvbVar.f;
                    float fFloatValue = ((Number) tob1Var.getValue()).floatValue();
                    if (fwk1Var.g() <= 0 || fwk1Var.i) {
                        x340Var2.i0(-845119344);
                        haxVar = new hax(cwl1.o0(x340Var2, 2131963821));
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-845156978);
                        x340Var2.r(false);
                        haxVar = jax.a;
                    }
                    m87.d(str, str2, fFloatValue, haxVar, this.c, (qim0) null, x340Var2, 24576);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    boolean z = m87.s(fwk1Var, x340Var4) instanceof jax;
                    qim0 qim0VarA = nim0.a;
                    if (z) {
                        x340Var4.i0(-491793671);
                    } else {
                        x340Var4.i0(-491745311);
                        Object objT = x340Var4.T();
                        if (objT == fkj0.X) {
                            objT = eak1.X0;
                            x340Var4.s0(objT);
                        }
                        qim0VarA = s161.a(qim0VarA, (iu30) objT);
                    }
                    x340Var4.r(false);
                    m87.j(fwk1Var.i, fwk1Var.g.g, ((Number) tob1Var.getValue()).floatValue(), m87.s(fwk1Var, x340Var4), this.c, qim0VarA, apo.r(-1274594463, new gxk1(fwk1Var, (byte) 1), x340Var4), x340Var4, 1597440);
                }
                break;
        }
        return rih1Var;
    }
}
