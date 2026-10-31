package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bte extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bte(cte cteVar, byte b) {
        super(2);
        this.a = b;
        this.b = cteVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        cte cteVar = this.b;
        boolean z = false;
        byte b2 = 1;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                pt ptVar = cteVar.b;
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    ete eteVar = cteVar.c;
                    brm brmVar = new brm(eteVar.c, eteVar.d, eteVar.b, eteVar.a, eteVar.e);
                    Parcelable.Creator<w4i1> creator = w4i1.CREATOR;
                    otw.c(ptVar, brmVar, (qim0) null, wpb1.C("ContributionMediaGalleryPageElement", ptVar, brmVar, x340Var2, 6, 8), x340Var2, 0, 4);
                }
                break;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    Object objT = x340Var4.T();
                    m4c m4cVar = fkj0.X;
                    if (objT == m4cVar) {
                        obj3 = objT;
                        r6h1 r6h1VarB = cteVar.d.b();
                        x340Var4.s0(r6h1VarB);
                        obj3 = r6h1VarB;
                    }
                    obj3 = objT;
                    r6h1 r6h1Var = (r6h1) obj3;
                    boolean zI = x340Var4.i(r6h1Var);
                    Object objT2 = x340Var4.T();
                    Object obj4 = objT2;
                    if (zI || objT2 == m4cVar) {
                        cb1 cb1Var = new cb1(r6h1Var, (byte) 7);
                        x340Var4.s0(cb1Var);
                        obj4 = cb1Var;
                    }
                    dgo1.c("chatContributionMediaGalleryPage", (iu30) obj4, apo.r(1898437261, new bte(cteVar, z ? (byte) 1 : (byte) 0), x340Var4), x340Var4, 390);
                }
                break;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                } else {
                    mod.b(ade0.c.a(cteVar.e), apo.r(-1778765999, new bte(cteVar, b2), x340Var6), x340Var6, 56);
                }
                break;
        }
        return rih1Var;
    }
}
