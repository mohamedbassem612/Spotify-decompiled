package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bpm0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ cpm0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpm0(cpm0 cpm0Var) {
        super(2);
        this.b = cpm0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        hax haxVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        cpm0 cpm0Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    String strO0 = cwl1.o0(x340Var2, 2131963228);
                    String strO1 = cwl1.o0(x340Var2, 2131960781);
                    boolean zI = x340Var2.i(cpm0Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new zem0(cpm0Var, (byte) 1);
                        x340Var2.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    if (cpm0Var.getNumSelectedItems() == 0) {
                        x340Var2.i0(-1731275834);
                        haxVar = new hax(cwl1.o0(x340Var2, 2131960758));
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1731273101);
                        x340Var2.r(false);
                        haxVar = jax.a;
                    }
                    myo1.d(strO0, strO1, function0, (qim0) null, haxVar, x340Var2, 0, 8);
                }
                break;
            default:
                ((Number) obj2).intValue();
                cpm0Var.a((b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bpm0(cpm0 cpm0Var, int i) {
        super(2);
        this.b = cpm0Var;
    }
}
