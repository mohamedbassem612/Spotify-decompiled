package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableAndThenCompletable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableOnErrorComplete;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q7b1 {
    public final rm5 a;
    public final lb b;
    public final String c;
    public final boolean d;
    public String e;

    public q7b1(rm5 rm5Var, lb lbVar, String str, boolean z) {
        this.a = rm5Var;
        this.b = lbVar;
        this.c = str;
        this.d = z;
    }

    public final CompletableOnErrorComplete a() {
        CompletableAndThenCompletable completableAndThenCompletableC;
        boolean z = this.d;
        rm5 rm5Var = this.a;
        if (z) {
            Single single = (Single) rm5Var.b;
            List<String> listM = p7h.M(new String[]{"sp_loading_platform", "sp_accept_language", "sp_app_version"});
            z2n.C.getClass();
            List list = y2n.b;
            ArrayList<mmr0> arrayList = new ArrayList();
            for (String str : listM) {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new mmr0(str, (String) it.next()));
                }
                r7h.W(arrayList2, arrayList);
            }
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
            for (mmr0 mmr0Var : arrayList) {
                arrayList3.add(single.observeOn((Scheduler) rm5Var.a).flatMapCompletable(new yy8((String) mmr0Var.b, (String) mmr0Var.a, ";expires=Tue, 15 Nov 1994 00:00:01 UTC;")));
            }
            completableAndThenCompletableC = Completable.l(arrayList3).c(single.flatMapCompletable(f331.X));
        } else {
            completableAndThenCompletableC = null;
        }
        return Completable.l(f46.i0(new Completable[]{completableAndThenCompletableC, z2n.a(rm5Var, "sp_loading_platform", "android-webview"), z2n.a(rm5Var, "sp_app_version", this.c)})).h(wx91.f).o(Functions.h);
    }
}
