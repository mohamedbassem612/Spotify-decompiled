package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dxk1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ xhz c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxk1(xhz xhzVar, iu30 iu30Var) {
        super(2);
        this.a = (byte) 3;
        this.c = xhzVar;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Object obj5;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        xhz xhzVar = this.c;
        byte b2 = 2;
        byte b3 = 1;
        boolean z = false;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        obj3 = objT;
                        izj1 izj1Var = new izj1(iu30Var, (byte) 18);
                        x340Var2.s0(izj1Var);
                        obj3 = izj1Var;
                    }
                    obj3 = objT;
                    Function0 function0 = (Function0) obj3;
                    if (ihc1.y0("Retry submitting votes")) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.f(new gbx(new y50("Retry submitting votes"), function0), (qim0) null, (max) null, (gdx) null, (idn0) null, (vu30) null, (vu30) null, apo.r(-934897099, new cxk1(xhzVar, (byte) 1), x340Var2), x340Var2, 12582912, 126);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    gfx.g(4, apo.r(-178594661, new dxk1(iu30Var, xhzVar, z ? (byte) 1 : (byte) 0), x340Var4), x340Var4, 54);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zG2 = x340Var6.g(iu30Var);
                    Object objT2 = x340Var6.T();
                    if (zG2 || objT2 == fkj0.X) {
                        obj4 = objT2;
                        izj1 izj1Var2 = new izj1(iu30Var, (byte) 19);
                        x340Var6.s0(izj1Var2);
                        obj4 = izj1Var2;
                    }
                    obj4 = objT2;
                    Function0 function1 = (Function0) obj4;
                    if (ihc1.y0("Exit voting")) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.h(new gbx(new y50("Exit voting"), function1), (qim0) null, (max) null, (gdx) null, (idn0) null, (vu30) null, apo.r(-579424302, new cxk1(xhzVar, (byte) 3), x340Var6), x340Var6, 12582912, 126);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    iqo1.d(apo.r(116001773, new cxk1(xhzVar, (byte) 0), x340Var8), apo.r(1382072558, new dxk1(iu30Var, xhzVar, b3), x340Var8), (qim0) null, (vu30) null, apo.r(885317617, new cxk1(xhzVar, (byte) 2), x340Var8), apo.r(-2143578894, new dxk1(iu30Var, xhzVar, b2), x340Var8), x340Var8, 221238, 12);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zG3 = x340Var10.g(iu30Var);
                    Object objT3 = x340Var10.T();
                    if (zG3 || objT3 == fkj0.X) {
                        obj5 = objT3;
                        izj1 izj1Var3 = new izj1(iu30Var, (byte) 17);
                        x340Var10.s0(izj1Var3);
                        obj5 = izj1Var3;
                    }
                    obj5 = objT3;
                    anm1.a((Function0) obj5, new i3u(4, true, false, false), apo.r(1706758237, new dxk1(xhzVar, iu30Var), x340Var10), x340Var10, 384, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                m87.f(xhzVar, iu30Var, (b0k) obj, czo1.p(49));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxk1(xhz xhzVar, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 5;
        this.c = xhzVar;
        this.b = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dxk1(iu30 iu30Var, xhz xhzVar, byte b) {
        super(2);
        this.a = b;
        this.b = iu30Var;
        this.c = xhzVar;
    }
}
