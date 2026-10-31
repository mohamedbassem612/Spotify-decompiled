package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pdk0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jo70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pdk0(jo70 jo70Var, byte b) {
        super(3);
        this.a = b;
        this.b = jo70Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String strY0 = null;
        jo70 jo70Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                if (jo70Var != null && (list = jo70Var.d) != null) {
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((ho70) it.next()).a);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : arrayList) {
                        if (((String) obj4).length() > 0) {
                            arrayList2.add(obj4);
                        }
                    }
                    strY0 = o7h.y0(arrayList2, ", ", (String) null, (String) null, (iu30) null, 62);
                }
                uwo1.e(strY0 == null ? "" : strY0, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar, 0, 0, 1726);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                strY0 = jo70Var != null ? jo70Var.a : null;
                uwo1.e(strY0 == null ? "" : strY0, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar2, 0, 0, 1726);
                break;
        }
        return rih1Var;
    }
}
