package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.FormatType;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class baa {
    public final c5j0 a;
    public final ljg b;
    public final Scheduler c;
    public final Scheduler d;
    public final FormatType e;
    public final vlc f;
    public final y4q0 g;
    public final uy31 h;
    public final vku i;
    public final vku j;

    public baa(c5j0 c5j0Var, ljg ljgVar, Scheduler scheduler, Scheduler scheduler2, FormatType formatType, vlc vlcVar, y4q0 y4q0Var, uy31 uy31Var) {
        this.a = c5j0Var;
        this.b = ljgVar;
        this.c = scheduler;
        this.d = scheduler2;
        this.e = formatType;
        this.f = vlcVar;
        this.g = y4q0Var;
        this.h = uy31Var;
        this.i = new vku();
        this.j = new vku();
        Logger.g("ClientMessagingPlatform: UI Plugin: Initializing Plugin for formatType: " + formatType, new Object[0]);
    }

    public final void f() {
        Logger.g("ClientMessagingPlatform: UI Plugin: UI Destroyed for formatType: " + this.e, new Object[0]);
        this.j.c();
        this.i.c();
    }

    public final void g(gj5 gj5Var) {
        StringBuilder sb = new StringBuilder("ClientMessagingPlatform: UI Plugin: UI Visible for formatType: ");
        FormatType formatType = this.e;
        sb.append(formatType);
        Logger.g(sb.toString(), new Object[0]);
        this.i.a(this.a.c.a.hide().filter(new g5j0(formatType)).map(h5j0.a).subscribeOn(this.d).observeOn(this.c).subscribe(new aaa(this, gj5Var)));
    }

    public /* synthetic */ baa(c5j0 c5j0Var, ljg ljgVar, Scheduler scheduler, Scheduler scheduler2, FormatType formatType, vlc vlcVar, y4q0 y4q0Var) {
        this(c5j0Var, ljgVar, scheduler, scheduler2, formatType, vlcVar, y4q0Var, vks.a);
    }
}
