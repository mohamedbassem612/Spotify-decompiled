package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ix60 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ tx60 b;
    public final /* synthetic */ fx60 c;
    public final /* synthetic */ lmw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix60(fx60 fx60Var, tx60 tx60Var, lmw lmwVar) {
        super(2);
        this.c = fx60Var;
        this.b = tx60Var;
        this.d = lmwVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lmw lmwVar = this.d;
        fx60 fx60Var = this.c;
        tx60 tx60Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    p40 p40Var = new p40((byte) 16);
                    jo70 jo70Var = fx60Var.a;
                    String str = jo70Var.a;
                    String strA = tx60Var.a;
                    if (strA == null) {
                        quc0 quc0Var = (quc0) lmwVar.b;
                        List list = jo70Var.d;
                        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ho70) it.next()).a);
                        }
                        strA = quc0Var.a(arrayList);
                    }
                    otw.c(p40Var, new o2f1(str, strA, tx60Var.b), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    x340Var4.i0(-787371674);
                    uwr uwrVar = cbx.a;
                    afx afxVarA = cbx.a(x340Var4);
                    x340Var4.r(false);
                    gfx.d(afxVarA, apo.r(620745656, new ix60(fx60Var, tx60Var, lmwVar), x340Var4), x340Var4, 48);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix60(tx60 tx60Var, fx60 fx60Var, lmw lmwVar) {
        super(2);
        this.b = tx60Var;
        this.c = fx60Var;
        this.d = lmwVar;
    }
}
