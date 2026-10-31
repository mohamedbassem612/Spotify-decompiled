package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class wtf0 extends hab0 implements vu30 {
    public final /* synthetic */ vu30 N0;
    public final /* synthetic */ j2i O0;
    public final /* synthetic */ j2i X;
    public final /* synthetic */ j2i Y;
    public final /* synthetic */ vu30 Z;
    public final /* synthetic */ byte a;
    public final /* synthetic */ hob1 b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ i091 g;
    public final /* synthetic */ j2i h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wtf0(hob1 hob1Var, qim0 qim0Var, float f, Function0 function0, Function0 function1, i091 i091Var, j2i j2iVar, boolean z, boolean z2, j2i j2iVar2, j2i j2iVar3, vu30 vu30Var, vu30 vu30Var2, j2i j2iVar4, byte b) {
        super(2);
        this.a = b;
        this.b = hob1Var;
        this.c = qim0Var;
        this.d = f;
        this.e = function0;
        this.f = function1;
        this.g = i091Var;
        this.h = j2iVar;
        this.i = z;
        this.t = z2;
        this.X = j2iVar2;
        this.Y = j2iVar3;
        this.Z = vu30Var;
        this.N0 = vu30Var2;
        this.O0 = j2iVar4;
    }

    public final Object invoke(Object obj, Object obj2) {
        String strK;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    hob1 hob1Var = this.b;
                    mmr0 mmr0VarQ = bth.q(hob1Var);
                    er00 er00Var = hob1Var.h;
                    qim0 qim0VarO = bth.o(zr7.i(u291.f(uyn1.B(this.c, 0.0f, ((p3v) mmr0VarQ.a).a, 0.0f, ((p3v) mmr0VarQ.b).a, 5), 1.0f), kna.R0), this.d, er00Var);
                    Object objT = x340Var2.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        objT = ktd.n(x340Var2);
                    }
                    idn0 idn0Var = (idn0) objT;
                    jtr jtrVar = jtr.c;
                    if (!(er00Var instanceof dr00) || hob1Var.J) {
                        x340Var2.i0(-490785038);
                        x340Var2.r(false);
                        strK = null;
                    } else {
                        strK = x0d.k(x340Var2, -490867993, 2131959828, x340Var2, false);
                    }
                    String str = strK;
                    pm31 pm31Var = new pm31(0);
                    Function0 function0 = this.e;
                    boolean zG = x340Var2.g(function0);
                    Object objT2 = x340Var2.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new tze0(function0, (byte) 7);
                        x340Var2.s0(objT2);
                    }
                    Function0 function1 = (Function0) objT2;
                    Function0 function2 = this.f;
                    boolean zG2 = x340Var2.g(function2);
                    Object objT3 = x340Var2.T();
                    if (zG2 || objT3 == m4cVar) {
                        objT3 = new tze0(function2, (byte) 8);
                        x340Var2.s0(objT3);
                    }
                    w2g0.c(anm1.N("cardClickableArea", bin.y(qim0VarO, idn0Var, jtrVar, false, str, pm31Var, (String) null, function1, (Function0) objT3, 420)), (tl3) null, apo.r(1666257621, new vtf0(this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.b, this.N0, this.O0), x340Var2), x340Var2, 3072, 6);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    gfx.b(18, apo.r(346856427, new wtf0(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, this.Z, this.N0, this.O0, (byte) 0), x340Var4), x340Var4, 54);
                }
                break;
        }
        return rih1Var;
    }
}
