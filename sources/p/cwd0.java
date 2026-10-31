package p;

import android.os.Bundle;
import android.widget.FrameLayout;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cwd0 implements f4h1 {
    public final FrameLayout a;
    public final qzh b;
    public final tjq c;
    public final fdc d;
    public final wmy e;
    public final boolean f;

    public cwd0(FrameLayout frameLayout, qzh qzhVar, tjq tjqVar, ptf1 ptf1Var, fdc fdcVar, wmy wmyVar, boolean z) {
        this.a = frameLayout;
        this.b = qzhVar;
        this.c = tjqVar;
        this.d = fdcVar;
        this.e = wmyVar;
        this.f = z;
        ptf1Var.o();
    }

    public final Object getView() {
        return this.a;
    }

    public final Bundle serialize() {
        return mno1.g();
    }

    public final void start() {
        qzh qzhVar = this.b;
        this.c.t(new lbc0(1, qzhVar, qzh.class, "render", "render(Ljava/lang/Object;)V", 0, (byte) 6), new lbc0(1, qzhVar, qzh.class, "onEvent", "onEvent(Lkotlin/jvm/functions/Function1;)V", 0, (byte) 7));
        wmy wmyVar = this.e;
        ((vku) wmyVar.f).a(((Flowable) wmyVar.b).L((Scheduler) wmyVar.c).subscribe(new lyw0(wmyVar, (byte) 17)));
    }

    public final void stop() {
        ((vku) this.e.f).c();
        this.c.u();
        if (this.f) {
            this.d.dismiss();
        }
    }
}
