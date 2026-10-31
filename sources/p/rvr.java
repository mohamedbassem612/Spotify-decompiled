package p;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rvr implements puu, quu {
    public final /* synthetic */ tjq a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ rvr(tjq tjqVar, String str, int i) {
        this.a = tjqVar;
        this.b = str;
        this.c = i;
    }

    public void a() {
        tjq tjqVar = this.a;
        ayl aylVar = (ayl) tjqVar.c;
        String str = ((lik1) tjqVar.d).a;
        String str2 = this.b;
        ayl.b(aylVar, str2, str, 4);
        dlg1 dlg1Var = (dlg1) tjqVar.b;
        bpl0 bpl0VarL = dlg1Var.l();
        Integer numValueOf = Integer.valueOf(this.c);
        x6h1 x6h1VarC = bpl0VarL.b.c();
        x6h1VarC.i.add(new a7h1("episode_card_container", (String) null, numValueOf, str2, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("actions", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        x6h1 x6h1VarC3 = x6h1VarC2.a().c();
        x6h1VarC3.i.add(new a7h1("download_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = false;
        ((i8h1) dlg1Var.a).m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("download", 1, Collections.singletonMap("item_to_download", str2)), x6h1VarC3.a(), bpl0VarL.a, System.currentTimeMillis()), (xj61) null);
    }

    public void b(List list) {
        tjq tjqVar = this.a;
        ayl aylVar = (ayl) tjqVar.c;
        lik1 lik1Var = (lik1) tjqVar.d;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ayl.c(aylVar, (String) it.next(), lik1Var.a, 4);
        }
        String str = lik1Var.a;
        String str2 = this.b;
        ayl.c(aylVar, str2, str, 4);
        dlg1 dlg1Var = (dlg1) tjqVar.b;
        bpl0 bpl0VarL = dlg1Var.l();
        Integer numValueOf = Integer.valueOf(this.c);
        x6h1 x6h1VarC = bpl0VarL.b.c();
        x6h1VarC.i.add(new a7h1("episode_card_container", (String) null, numValueOf, str2, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("actions", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        x6h1 x6h1VarC3 = x6h1VarC2.a().c();
        x6h1VarC3.i.add(new a7h1("download_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = false;
        ((i8h1) dlg1Var.a).m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("remove_download", 1, Collections.singletonMap("item_to_remove_from_downloads", str2)), x6h1VarC3.a(), bpl0VarL.a, System.currentTimeMillis()), (xj61) null);
    }
}
