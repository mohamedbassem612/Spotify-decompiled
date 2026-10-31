package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class in01 {
    public final dma1 a;

    public List a() {
        try {
            String strF = this.a.f(jn01.a);
            if (strF != null) {
                Iterable<uos0> iterable = (Iterable) nfa0.d.a(strF, new r36(uos0.Companion.serializer(), (byte) 0));
                ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
                for (uos0 uos0Var : iterable) {
                    arrayList.add(new nhe0(uos0Var.a, uos0Var.b, uos0Var.c));
                }
                return arrayList;
            }
        } catch (Exception unused) {
        }
        return z6x.a;
    }

    public void b(List list) {
        List<nhe0> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (nhe0 nhe0Var : list2) {
            arrayList.add(new uos0(nhe0Var.a, nhe0Var.b, nhe0Var.c));
        }
        String strB = nfa0.d.b(new r36(uos0.Companion.serializer(), (byte) 0), arrayList);
        hma1 hma1VarEdit = this.a.edit();
        hma1VarEdit.d(jn01.a, strB);
        hma1VarEdit.g();
    }
}
