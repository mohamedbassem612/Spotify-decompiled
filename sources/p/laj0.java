package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class laj0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ maj0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ laj0(iu30 iu30Var, maj0 maj0Var, byte b) {
        super(2);
        this.a = b;
        this.b = iu30Var;
        this.c = maj0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Object obj5;
        byte b = this.a;
        z50 z50Var = z50.c;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        maj0 maj0Var = this.c;
        boolean z = false;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    idx idxVar = new idx(4);
                    boolean zG = x340Var2.g(iu30Var) | x340Var2.i(maj0Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        obj3 = objT;
                        kaj0 kaj0Var = new kaj0(iu30Var, maj0Var, (byte) 0);
                        x340Var2.s0(kaj0Var);
                        obj3 = kaj0Var;
                    }
                    obj3 = objT;
                    foo1.c(new gbx(z50Var, (Function0) obj3), idxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-152415512, new jaj0(maj0Var, (byte) 2), x340Var2), x340Var2, 0, 48, 2044);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    ldx ldxVar = ldx.c;
                    boolean zG2 = x340Var4.g(iu30Var) | x340Var4.i(maj0Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        obj4 = objT2;
                        kaj0 kaj0Var2 = new kaj0(iu30Var, maj0Var, (byte) 1);
                        x340Var4.s0(kaj0Var2);
                        obj4 = kaj0Var2;
                    }
                    obj4 = objT2;
                    foo1.c(new gbx(z50Var, (Function0) obj4), ldxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(481883497, new jaj0(maj0Var, (byte) 3), x340Var4), x340Var4, 0, 48, 2044);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    boolean zG3 = x340Var6.g(iu30Var);
                    Object objT3 = x340Var6.T();
                    if (zG3 || objT3 == fkj0.X) {
                        obj5 = objT3;
                        edi0 edi0Var = new edi0(iu30Var, (byte) 18);
                        x340Var6.s0(edi0Var);
                        obj5 = edi0Var;
                    }
                    obj5 = objT3;
                    mqo1.e((Function0) obj5, (i3u) null, (vu30) null, apo.r(-2045308953, new jaj0(maj0Var, (byte) 0), x340Var6), apo.r(-1411009944, new jaj0(maj0Var, (byte) 1), x340Var6), apo.r(-776710935, new laj0(iu30Var, maj0Var, z ? 1 : 0), x340Var6), apo.r(-142411926, new laj0(iu30Var, maj0Var, b2), x340Var6), x340Var6, 1797120, 6);
                }
                break;
        }
        return rih1Var;
    }
}
