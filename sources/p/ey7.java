package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ey7 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y7e1 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey7(y7e1 y7e1Var, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 1;
        this.b = y7e1Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        y7e1 y7e1Var = this.b;
        iu30 iu30Var = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    for (yx7 yx7Var : yx7.d) {
                        String str = yx7Var.a;
                        boolean zJ = u890.j(y7e1Var.d().d.toString(), yx7Var.b);
                        boolean zG = x340Var2.g(iu30Var) | x340Var2.e(yx7Var.ordinal());
                        Object objT = x340Var2.T();
                        if (zG || objT == fkj0.X) {
                            objT = new z77(iu30Var, yx7Var, (byte) 10);
                            x340Var2.s0(objT);
                        }
                        pto1.k(str, zJ, false, (Function0) objT, x340Var2, 0, 4);
                    }
                } else {
                    x340Var2.b0();
                }
                break;
            case 1:
                ((Number) obj2).intValue();
                pto1.f(y7e1Var, iu30Var, (b0k) obj, czo1.p(1));
                break;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else if (y7e1Var.d().d.length() > 0) {
                    x340Var4.i0(-167656559);
                    boolean zG2 = x340Var4.g(y7e1Var) | x340Var4.g(iu30Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new efb(y7e1Var, iu30Var, (byte) 9);
                        x340Var4.s0(objT2);
                    }
                    wro1.h(new gbx(z50.c, (Function0) objT2), ldx.c, anm1.N("search_header_clear_button", nim0Var), (max) null, yla.s(x340Var4), (vzq0) null, false, (idn0) null, (ga80) null, wej.b, x340Var4, 432, 6, 984);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(-166946070);
                    x340Var4.r(false);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else if (y7e1Var.d().d.length() > 0) {
                    x340Var6.i0(-2027704771);
                    fux fuxVar = fux.c;
                    jsl jslVar = new jsl(cwl1.o0(x340Var6, 2131957353));
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var6).g;
                    qim0 qim0VarN = anm1.N("toolbar_clear_button", u291.r(nim0Var, 16.0f));
                    boolean zI = x340Var6.i(y7e1Var) | x340Var6.g(iu30Var);
                    Object objT3 = x340Var6.T();
                    if (zI || objT3 == fkj0.X) {
                        objT3 = new efb(y7e1Var, iu30Var, (byte) 11);
                        x340Var6.s0(objT3);
                    }
                    w0h1.a(fuxVar, jslVar, bin.x(qim0VarN, false, (String) null, (pm31) null, (idn0) null, (Function0) objT3, 15), 0L, 0L, false, x340Var6, fux.d, 56);
                    x340Var6.r(false);
                } else {
                    x340Var6.i0(-2027136820);
                    x340Var6.r(false);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey7(y7e1 y7e1Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = y7e1Var;
        this.c = iu30Var;
    }
}
