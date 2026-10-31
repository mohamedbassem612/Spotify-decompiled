package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y0c extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ ipb1 Y;
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ c380 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ tob1 f;
    public final /* synthetic */ tob1 g;
    public final /* synthetic */ tob1 h;
    public final /* synthetic */ tob1 i;
    public final /* synthetic */ tyq t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0c(int i, Integer num, c380 c380Var, boolean z, tob1 tob1Var, tob1 tob1Var2, tob1 tob1Var3, tob1 tob1Var4, tyq tyqVar, Object obj, ipb1 ipb1Var, byte b) {
        super(2);
        this.a = b;
        this.b = i;
        this.c = num;
        this.d = c380Var;
        this.e = z;
        this.f = tob1Var;
        this.g = tob1Var2;
        this.h = tob1Var3;
        this.i = tob1Var4;
        this.t = tyqVar;
        this.X = obj;
        this.Y = ipb1Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        u0c u0cVarC;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    Integer num = this.c;
                    float size = (num != null && i == num.intValue()) ? Float.MAX_VALUE : this.d.size() - i;
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarX = lrn1.x(nim0Var, size);
                    boolean z = this.e;
                    tob1 tob1Var = this.i;
                    tob1 tob1Var2 = this.h;
                    tob1 tob1Var3 = this.g;
                    if (z) {
                        x340Var2.i0(1269526208);
                        tob1 tob1Var4 = this.f;
                        boolean zI = x340Var2.i(tob1Var4);
                        Object objT = x340Var2.T();
                        if (zI || objT == m4cVar) {
                            objT = new bu2(tob1Var4, (byte) 2);
                            x340Var2.s0(objT);
                        }
                        Function0 function0 = (Function0) objT;
                        boolean zI2 = x340Var2.i(tob1Var3) | x340Var2.i(tob1Var2);
                        Object objT2 = x340Var2.T();
                        if (zI2 || objT2 == m4cVar) {
                            objT2 = new x0c(tob1Var3, tob1Var2, (byte) 0);
                            x340Var2.s0(objT2);
                        }
                        Function0 function1 = (Function0) objT2;
                        boolean zI3 = x340Var2.i(tob1Var3) | x340Var2.i(tob1Var);
                        Object objT3 = x340Var2.T();
                        if (zI3 || objT3 == m4cVar) {
                            objT3 = new x0c(tob1Var3, tob1Var, (byte) 1);
                            x340Var2.s0(objT3);
                        }
                        u0cVarC = new u0c(function0, function1, (Function0) objT3);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(1269889249);
                        boolean zI4 = x340Var2.i(tob1Var3) | x340Var2.i(tob1Var) | x340Var2.i(tob1Var2);
                        Object objT4 = x340Var2.T();
                        if (zI4 || objT4 == m4cVar) {
                            objT4 = new ai6(tob1Var3, tob1Var, tob1Var2, (byte) 2);
                            x340Var2.s0(objT4);
                        }
                        u0cVarC = i541.C(nim0Var, (iu30) objT4);
                        x340Var2.r(false);
                    }
                    otw.c(this.t, this.X, qim0VarX.then(u0cVarC), this.Y, x340Var2, 0, 0);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    Integer numValueOf = Integer.valueOf(i);
                    boolean zE = x340Var4.e(i);
                    Object objT5 = x340Var4.T();
                    if (zE || objT5 == fkj0.X) {
                        objT5 = new uv4(i, (byte) 6);
                        x340Var4.s0(objT5);
                    }
                    dgo1.c(numValueOf, (iu30) objT5, apo.r(835507516, new y0c(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, this.X, this.Y, (byte) 0), x340Var4), x340Var4, 384);
                }
                break;
        }
        return rih1Var;
    }
}
