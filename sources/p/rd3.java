package p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rd3 {
    public final uu00 a;
    public final ajq0 b;

    public rd3(uu00 uu00Var, ajq0 ajq0Var) {
        this.a = uu00Var;
        this.b = ajq0Var;
    }

    public final kjm a(String str, List list, String str2, sd3 sd3Var, List list2, lik1 lik1Var, String str3) {
        String strA;
        hb6 hb6Var = (hb6) o7h.s0(list);
        if (hb6Var == null || (strA = hb6Var.a()) == null) {
            strA = "";
        }
        igm igmVar = new igm(str, new wfm(Uri.parse(str2), xfm.c), strA);
        smc0 smc0VarN = k4p1.n();
        boolean zIsEmpty = list.isEmpty();
        ajq0 ajq0Var = this.b;
        if (!zIsEmpty) {
            if (list.size() == 1) {
                smc0VarN.add(ajq0Var.o(((hb6) o7h.q0(list)).b(), ((hb6) o7h.q0(list)).a()));
            } else {
                List list3 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((hb6) it.next()).b());
                }
                smc0VarN.add(ajq0Var.p(arrayList));
            }
        }
        if (!list2.isEmpty()) {
            smc0VarN.add(ajq0Var.m(lik1Var, list2));
        }
        ok51 ok51Var = sd3Var.b;
        if (ok51Var != null) {
            smc0VarN.add(ajq0Var.r(ok51Var));
        }
        if (!sd3Var.a) {
            smc0VarN.add(ajq0Var.s(str3));
        }
        return new kjm(igmVar, k4p1.k(smc0VarN), 4);
    }
}
