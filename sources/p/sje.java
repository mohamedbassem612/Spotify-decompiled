package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sje {
    public static final o3r a = w3p1.n(new l4r(pwc0.B, 1, rje.b, new j4r(jzd.d1), rje.c), new l4r(hvm.c, 1, rje.d, new j4r(jzd.e1), rje.e), wnb.a1);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(d0r d0rVar, String str, String str2, onm onmVar) {
        qje qjeVar;
        int i;
        if (onmVar instanceof qje) {
            qjeVar = (qje) onmVar;
            int i2 = qjeVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qjeVar.e = i2 - Integer.MIN_VALUE;
            } else {
                qjeVar = new qje(this, onmVar);
            }
        } else {
            qjeVar = new qje(this, onmVar);
        }
        Object objJ = qjeVar.c;
        int i3 = qjeVar.e;
        if (i3 == 0) {
            hm5.M(objJ);
            ay8 ay8VarF = d3p1.F(d0rVar, a, str);
            s4 s4Var = new s4(2, (lnm) null, (byte) 27);
            qjeVar.a = str;
            qjeVar.b = str2;
            qjeVar.e = 1;
            objJ = b5p1.j(ay8VarF, s4Var, qjeVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = qjeVar.b;
            str = qjeVar.a;
            hm5.M(objJ);
        }
        i1r i1rVar = (k1r) objJ;
        if (!(i1rVar instanceof i1r)) {
            if (i1rVar instanceof h1r) {
                throw qmo1.x(((h1r) i1rVar).a);
            }
            if (u890.j(i1rVar, j1r.a)) {
                eg.m("filtered above");
                return null;
            }
            eg.o();
            return null;
        }
        mmr0 mmr0Var = (mmr0) i1rVar.a;
        l631 l631Var = (l631) mmr0Var.a;
        List list = (List) mmr0Var.b;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((pvc0) it.next()).c);
        }
        int iIndexOf = arrayList.indexOf(str2);
        int iIndexOf2 = arrayList.indexOf(l631Var.a);
        List listSubList = z6x.a;
        if (iIndexOf > iIndexOf2) {
            if (iIndexOf > 0) {
                listSubList = arrayList.subList(0, iIndexOf);
            }
            return new uje(str, listSubList, str2);
        }
        if (iIndexOf >= 0 && (i = iIndexOf + 1) < arrayList.size()) {
            listSubList = arrayList.subList(i, arrayList.size());
        }
        return new tje(str, listSubList, str2);
    }
}
