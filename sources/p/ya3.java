package p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ya3 implements mgm {
    public final me30 a;
    public final o3r b;
    public final o3r c;

    public ya3(me30 me30Var) {
        this.a = me30Var;
        jd11 jd11Var = rc11.a;
        this.b = w3p1.o(new l4r(new wlu(jd11Var.b(jo70.class)), 2, ra3.f, new j4r(q83.d1), ra3.g), q83.e1);
        this.c = w3p1.o(new l4r(new wlu(jd11Var.b(jo70.class)), 1, ra3.h, new j4r(ra3.b), ra3.i), ra3.c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.mgm
    public final Object a(hti0 hti0Var, d0r d0rVar, lnm lnmVar) {
        ta3 ta3Var;
        qxc0 qxc0Var;
        if (lnmVar instanceof ta3) {
            ta3Var = (ta3) lnmVar;
            int i = ta3Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ta3Var.d = i - Integer.MIN_VALUE;
            } else {
                ta3Var = new ta3(this, (onm) lnmVar);
            }
        } else {
            ta3Var = new ta3(this, (onm) lnmVar);
        }
        Object objS = ta3Var.b;
        int i2 = ta3Var.d;
        if (i2 == 0) {
            hm5.M(objS);
            qxc0 qxc0Var2 = hti0Var.d;
            if (qxc0Var2 == null || this.a.a(qxc0Var2.e) != le30.b) {
                qxc0Var2 = null;
            }
            if (qxc0Var2 == null) {
                return null;
            }
            String str = (String) qxc0Var2.X.get("artistUris");
            List listQ0 = str != null ? ihc1.Q0(str, new String[]{","}, 0, 6) : null;
            if (listQ0 == null) {
                listQ0 = z6x.a;
            }
            List list = listQ0;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ihc1.e1((String) it.next()).toString());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            bh bhVar = new bh(arrayList2, this, d0rVar, (lnm) null, (byte) 9);
            ta3Var.a = qxc0Var2;
            ta3Var.d = 1;
            objS = smo1.s(bhVar, ta3Var);
            d9n d9nVar = d9n.a;
            if (objS == d9nVar) {
                return d9nVar;
            }
            qxc0Var = qxc0Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qxc0Var = ta3Var.a;
            hm5.M(objS);
        }
        return new igm(qxc0Var.a, new wfm(Uri.parse(qxc0Var.b.a(2))), (String) objS);
    }

    @Override // p.mgm
    public final mr20 b(hti0 hti0Var, d0r d0rVar) {
        wa3 huzVar;
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null || this.a.a(qxc0Var.e) != le30.b) {
            qxc0Var = null;
        }
        if (qxc0Var == null) {
            return new huz((Object) null, (byte) 10);
        }
        String str = (String) qxc0Var.X.get("artistUris");
        List listQ0 = str != null ? ihc1.Q0(str, new String[]{","}, 0, 6) : null;
        List list = listQ0;
        if (list == null || list.isEmpty()) {
            huzVar = new huz("", (byte) 10);
        } else {
            List list2 = listQ0;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(d3p1.F(d0rVar, this.b, (String) it.next()));
            }
            huzVar = new wa3((mr20[]) o7h.l1(arrayList).toArray(new mr20[0]), (byte) 0);
        }
        return new vd0(huzVar, this, qxc0Var, (byte) 5);
    }
}
