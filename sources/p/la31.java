package p;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class la31 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ ka31 b;
    public final /* synthetic */ oa31 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la31(ka31 ka31Var, oa31 oa31Var, iu30 iu30Var) {
        super(2);
        this.b = ka31Var;
        this.c = oa31Var;
        this.d = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        ka31 ka31Var = this.b;
        oa31 oa31Var = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    noq noqVar = oa31Var.e;
                    ja31 ja31Var = (ja31) ka31Var;
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        objT = new dv11(iu30Var, (byte) 25);
                        x340Var2.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    boolean zG2 = x340Var2.g(iu30Var);
                    Object objT2 = x340Var2.T();
                    if (zG2 || objT2 == m4cVar) {
                        objT2 = new dv11(iu30Var, (byte) 26);
                        x340Var2.s0(objT2);
                    }
                    Function0 function1 = (Function0) objT2;
                    boolean zG3 = x340Var2.g(iu30Var);
                    Object objT3 = x340Var2.T();
                    if (zG3 || objT3 == m4cVar) {
                        objT3 = new ict0(iu30Var, (byte) 7);
                        x340Var2.s0(objT3);
                    }
                    d7e.i(noqVar, ja31Var, function0, function1, (xu30) objT3, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else if (ka31Var instanceof ja31) {
                    x340Var4.i0(-1078043191);
                    Object objT4 = x340Var4.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT4 == m4cVar2) {
                        objT4 = oa31Var.f.b();
                        x340Var4.s0(objT4);
                    }
                    r6h1 r6h1Var = (r6h1) objT4;
                    boolean zI = x340Var4.i(r6h1Var);
                    Object objT5 = x340Var4.T();
                    if (zI || objT5 == m4cVar2) {
                        objT5 = new cb1(r6h1Var, (byte) 28);
                        x340Var4.s0(objT5);
                    }
                    dgo1.c("retrieval", (iu30) objT5, apo.r(-536402217, new la31(oa31Var, ka31Var, iu30Var), x340Var4), x340Var4, 390);
                    x340Var4.r(false);
                } else {
                    if (!(ka31Var instanceof ia31)) {
                        throw p3d1.k(x340Var4, -173324601, false);
                    }
                    x340Var4.i0(-1077128939);
                    x340Var4.r(false);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la31(oa31 oa31Var, ka31 ka31Var, iu30 iu30Var) {
        super(2);
        this.c = oa31Var;
        this.b = ka31Var;
        this.d = iu30Var;
    }
}
