package p;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class esj1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ esj1(Object obj, Object obj2, Object obj3, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        Object obj5 = this.d;
        Object obj6 = this.b;
        Object obj7 = this.c;
        switch (b) {
            case 0:
                return new as0((Context) obj2, (ViewGroup) obj3, (gsj1) obj6, (epb1) obj7, (iu30) obj4, (iac0) obj5);
            default:
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var = (b0k) obj3;
                ((Number) obj4).intValue();
                List list = (List) obj7;
                boolean z = iIntValue == ((err0) ((jkr0) ((kes) obj6)).d.c).s();
                h631 h631Var = (h631) list.get(iIntValue);
                String str = null;
                if (z) {
                    String str2 = (String) obj5;
                    int size = list.size();
                    if (str2 != null) {
                        if (size <= 1) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            String strW = nhc1.W(nhc1.W(str2, "%1$d", String.valueOf(iIntValue + 1)), "%2$d", String.valueOf(size));
                            List listM = p7h.M(new String[]{"%d", "%s", "$d", "$s"});
                            if ((listM instanceof Collection) && listM.isEmpty()) {
                                str = strW;
                            } else {
                                Iterator it = listM.iterator();
                                do {
                                    if (!it.hasNext()) {
                                        str = strW;
                                    }
                                } while (!ihc1.h0(strW, (CharSequence) it.next(), false));
                            }
                        }
                    }
                }
                qim0 qim0VarA = nim0.a;
                x340 x340Var2 = x340Var;
                if (z) {
                    x340Var2.i0(-347746333);
                } else {
                    x340Var2.i0(-347745582);
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = lcl1.T0;
                        x340Var2.s0(objT);
                    }
                    qim0VarA = s161.a(qim0VarA, (iu30) objT);
                }
                x340Var2.r(false);
                vby0.l(h631Var, str, qim0VarA, x340Var, 0);
                return rih1.a;
        }
    }
}
