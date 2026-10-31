package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t251 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y7e1 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t251(y7e1 y7e1Var, Function0 function0, byte b) {
        super(2);
        this.a = b;
        this.b = y7e1Var;
        this.c = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        y7e1 y7e1Var = this.b;
        Function0 function0 = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else if (y7e1Var.d().d.length() <= 0) {
                    x340Var2.i0(550670597);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(550333999);
                    gux guxVar = gux.c;
                    jsl jslVar = new jsl(cwl1.o0(x340Var2, 2131953771));
                    uwr uwrVar = cbx.a;
                    long j = cbx.a(x340Var2).b.b;
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    qim0 qim0VarR = u291.r(nim0Var, 16.0f);
                    boolean zG = x340Var2.g(function0);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new us21(function0, (byte) 19);
                        x340Var2.s0(objT);
                    }
                    w0h1.a(guxVar, jslVar, bin.x(qim0VarR, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), j, 0L, true, x340Var2, gux.d | 196608, 16);
                    x340Var2.r(false);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else if (y7e1Var.d().d.length() <= 0) {
                    x340Var4.i0(-581638863);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(-582157214);
                    fux fuxVar = fux.c;
                    uwr uwrVar2 = cbx.a;
                    zov0 zov0Var2 = cbx.b(x340Var4).g;
                    qim0 qim0VarN = anm1.N("search_input_clear_button", u291.r(nim0Var, 16.0f));
                    boolean zG2 = x340Var4.g(y7e1Var) | x340Var4.g(function0);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new w451(y7e1Var, function0, (byte) 0);
                        x340Var4.s0(objT2);
                    }
                    w0h1.a(fuxVar, new jsl(cwl1.o0(x340Var4, 2131952512)), bin.x(qim0VarN, false, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 15), cbx.a(x340Var4).b.b, 0L, false, x340Var4, fux.d, 48);
                    x340Var4.r(false);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else if (y7e1Var.d().d.length() <= 0) {
                    x340Var6.i0(1193012416);
                    x340Var6.r(false);
                } else {
                    x340Var6.i0(1192267207);
                    boolean zI = x340Var6.i(y7e1Var) | x340Var6.g(function0);
                    Object objT3 = x340Var6.T();
                    if (zI || objT3 == fkj0.X) {
                        objT3 = new w451(y7e1Var, function0, (byte) 1);
                        x340Var6.s0(objT3);
                    }
                    wro1.h(new gbx(z50.c, (Function0) objT3), ldx.c, anm1.N("song_dna_search_input_clear_button", nim0Var), (max) null, yla.s(x340Var6), (vzq0) null, false, (idn0) null, (ga80) null, vjj.b, x340Var6, 0, 6, 984);
                    x340Var6.r(false);
                }
                break;
        }
        return rih1Var;
    }
}
