package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h1c extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ tyq d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ Function0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1c(int i, Object obj, tyq tyqVar, Function0 function0, iu30 iu30Var) {
        super(2);
        this.c = i;
        this.b = obj;
        this.d = tyqVar;
        this.f = function0;
        this.e = iu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
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
                    String strC = f4i1.c(this.c, "popup_");
                    boolean zG = x340Var2.g(strC);
                    Object obj3 = this.b;
                    boolean zG2 = zG | x340Var2.g(obj3);
                    Object objT = x340Var2.T();
                    if (zG2 || objT == fkj0.X) {
                        objT = this.e.invoke(obj3);
                        x340Var2.s0(objT);
                    }
                    Object obj4 = objT;
                    ipb1 ipb1VarC = wpb1.C(strC, this.d, obj4, x340Var2, 0, 8);
                    kiv kivVar = alg0.e;
                    Boolean bool = Boolean.TRUE;
                    mod.c(new ely0[]{kivVar.a(bool), alg0.a.a(bool), alg0.b.a(this.f)}, apo.r(-1475365910, new g1c(this.d, obj4, ipb1VarC, (byte) 0), x340Var2), x340Var2, 56);
                }
                break;
            default:
                ((Number) obj2).intValue();
                pxd0.b(this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1c(Object obj, int i, tyq tyqVar, iu30 iu30Var, Function0 function0, int i2) {
        super(2);
        this.b = obj;
        this.c = i;
        this.d = tyqVar;
        this.e = iu30Var;
        this.f = function0;
    }
}
