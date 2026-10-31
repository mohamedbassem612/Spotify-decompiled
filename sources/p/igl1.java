package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class igl1 {
    public final Scheduler a;
    public final l8s b;
    public final dma1 c;
    public final ajg d;
    public final Context e;
    public final yqg f;
    public final hhr g;
    public final gw70 h;
    public final y75 i;
    public String j;
    public final rku k = new rku();

    public igl1(Scheduler scheduler, l8s l8sVar, dma1 dma1Var, ajg ajgVar, Context context, yqg yqgVar, hhr hhrVar, gw70 gw70Var, y75 y75Var) {
        this.a = scheduler;
        this.b = l8sVar;
        this.c = dma1Var;
        this.d = ajgVar;
        this.e = context;
        this.f = yqgVar;
        this.g = hhrVar;
        this.h = gw70Var;
        this.i = y75Var;
    }

    public final void a(ti tiVar) {
        boolean z = tiVar instanceof mhl1;
        dma1 dma1Var = this.c;
        if (z) {
            l1d.B(this.f, dma1Var.edit(), jgl1.b());
        }
        hma1 hma1VarEdit = dma1Var.edit();
        hma1VarEdit.d(jgl1.c(), tiVar.d());
        hma1VarEdit.g();
    }

    public final void b(jme jmeVar) {
        this.k.b(this.h.f("https://wear.spotifycdn.com/wear_onboarding_watches.webp").o().e(this.b.c(new gjo0(new bih1(this, jmeVar, (byte) 24), new csj1(this, (byte) 5)))).observeOn(this.a).subscribe(new qdj1(this, jmeVar, (byte) 3), vrk1.h));
    }
}
