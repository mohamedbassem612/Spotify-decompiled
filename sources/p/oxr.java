package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oxr implements o5s {
    public final h6v0 a;
    public final kly0 b;
    public final dlg1 c;
    public final y5v0 d;
    public final aod e;
    public final e7p0 f;
    public final eo4 g;
    public final c3s h;
    public final Scheduler i;
    public final vku t = new vku();

    public oxr(h6v0 h6v0Var, jly0 jly0Var, dlg1 dlg1Var, y5v0 y5v0Var, aod aodVar, e7p0 e7p0Var, eo4 eo4Var, c3s c3sVar, iac0 iac0Var, Scheduler scheduler) {
        this.a = h6v0Var;
        this.b = jly0Var;
        this.c = dlg1Var;
        this.d = y5v0Var;
        this.e = aodVar;
        this.f = e7p0Var;
        this.g = eo4Var;
        this.h = c3sVar;
        this.i = scheduler;
        iac0Var.getLifecycle().a(this);
    }

    public final void a(j7z j7zVar, Function0 function0) {
        String str = j7zVar.a;
        s8u0 s8u0Var = this.a;
        Flowable flowableH = Flowable.h(s8u0Var.f.J(eh10.Z0).J(new akp1(str, (byte) 9)), s8u0Var.e, o9p1.W0);
        Boolean bool = Boolean.FALSE;
        this.t.a(flowableH.y(new mmr0(bool, bool)).subscribe(new y43(j7zVar, this, j7zVar, function0, (byte) 2)));
    }

    public final ou80 b(j7z j7zVar) {
        String str = j7zVar.a;
        int i = j7zVar.b;
        dlg1 dlg1Var = this.c;
        bpl0 bpl0VarL = dlg1Var.l();
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC = bpl0VarL.b.c();
        x6h1VarC.i.add(new a7h1("episode_card_container", (String) null, numValueOf, str, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("actions", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        x6h1 x6h1VarC3 = x6h1VarC2.a().c();
        x6h1VarC3.i.add(new a7h1("play_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = false;
        return ((i8h1) dlg1Var.a).m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str)), x6h1VarC3.a(), bpl0VarL.a, System.currentTimeMillis()), (xj61) null).a;
    }

    public final void onStop(iac0 iac0Var) {
        this.t.c();
        y5v0 y5v0Var = this.d;
        y5v0Var.k.g();
        ((a6v0) y5v0Var.a.get()).b();
    }
}
