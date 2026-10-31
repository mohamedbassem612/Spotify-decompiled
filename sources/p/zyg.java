package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zyg extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zyg(tm tmVar, byte b) {
        super(4);
        this.a = b;
        this.b = tmVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        syg sygVar;
        byte b = this.a;
        tm tmVar = this.b;
        switch (b) {
            case 0:
                jjm0 jjm0Var = (jjm0) obj;
                xyg xygVar = (xyg) obj2;
                int iIntValue = ((Number) obj4).intValue();
                x340 x340Var = (b0k) obj3;
                x340Var.i0(1727092840);
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(xygVar);
                    x340Var.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                boolean zI = x340Var.i(ven0Var) | x340Var.i(xygVar);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new pid(xygVar, ven0Var, (lnm) null, (byte) 23);
                    x340Var.s0(objT2);
                }
                qxd0.t(xygVar, x340Var, (vu30) objT2);
                boolean zI2 = x340Var.i(ven0Var) | x340Var.i(tmVar);
                Object objT3 = x340Var.T();
                if (zI2 || objT3 == m4cVar) {
                    objT3 = new yyg(tmVar, ven0Var, (lnm) null);
                    x340Var.s0(objT3);
                }
                jjm0Var.a((zu30) objT3, x340Var, (iIntValue << 3) & 112);
                xyg xygVar2 = (xyg) ven0Var.getValue();
                x340Var.r(false);
                return xygVar2;
            default:
                xyg xygVar3 = (xyg) obj;
                ((Number) obj3).intValue();
                s1f1 s1f1Var = xygVar3.c;
                q1f1 q1f1Var = s1f1Var instanceof q1f1 ? (q1f1) s1f1Var : null;
                boolean z = (q1f1Var == null || (sygVar = (syg) q1f1Var.a) == null) ? false : sygVar.a;
                hyl0 hyl0Var = (hyl0) tmVar.c;
                hyl0Var.getClass();
                x6h1 x6h1VarC = hyl0Var.b.c();
                x6h1VarC.i.add(new a7h1("share_cards_carousel", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                String str = xygVar3.a;
                Integer numValueOf = Integer.valueOf(xygVar3.b);
                x6h1 x6h1VarC2 = y6h1VarA.c();
                x6h1VarC2.i.add(new a7h1("share_card", str, numValueOf, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                r6h1 r6h1Var = r6h1.c;
                r6h1 r6h1Var2 = hyl0Var.a;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var2.a);
                arrayList.add(y6h1VarA2);
                return new jyl0(new opl0(new r6h1(arrayList, r6h1Var2.b), (byte) 20), z ? 2 : 1);
        }
    }
}
