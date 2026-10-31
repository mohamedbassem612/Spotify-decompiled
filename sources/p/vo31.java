package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vo31 implements tg51 {
    public final /* synthetic */ byte a;
    public final ng51 b;
    public final gg11 c;

    public /* synthetic */ vo31(ng51 ng51Var, gg11 gg11Var, byte b) {
        this.a = b;
        this.b = ng51Var;
        this.c = gg11Var;
    }

    @Override // p.tg51
    public final List a(tr3 tr3Var) {
        byte b = this.a;
        List list = z6x.a;
        gg11 gg11Var = this.c;
        ng51 ng51Var = this.b;
        switch (b) {
            case 0:
                List listA = ng51Var.a(tr3Var);
                ArrayList arrayList = new ArrayList();
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    kg51 kg51Var = (kg51) gg11Var.get((mg51) it.next());
                    List list2 = kg51Var != null ? (List) kg51Var.invoke(tr3Var) : null;
                    if (list2 == null) {
                        list2 = list;
                    }
                    r7h.W(list2, arrayList);
                }
                return arrayList;
            default:
                List listA2 = ng51Var.a(tr3Var);
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = listA2.iterator();
                while (it2.hasNext()) {
                    kg51 kg51Var2 = (kg51) gg11Var.get((mg51) it2.next());
                    List list3 = kg51Var2 != null ? (List) kg51Var2.invoke(tr3Var) : null;
                    if (list3 == null) {
                        list3 = list;
                    }
                    r7h.W(list3, arrayList2);
                }
                return arrayList2;
        }
    }
}
