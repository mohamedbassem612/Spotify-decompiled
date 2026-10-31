package p;

import android.content.Context;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ys4 {
    public final q8n A;
    public final Flowable B;
    public final idd1 D;
    public final Scheduler a;
    public final Scheduler b;
    public final Flowable c;
    public final Flowable d;
    public final ks21 e;
    public final o241 f;
    public final z3v0 g;
    public final Observable h;
    public final wp20 i;
    public final x0i0 j;
    public final at4 k;
    public final vbs l;
    public final eu4 m;
    public final veu0 n;
    public final g0l o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ln91 f102p;
    public final ypd q;
    public final d520 r;
    public final uvy s;
    public final nn61 t;
    public final q0i0 u;
    public final q0i0 v;
    public final xvo w;
    public final mr20 x;
    public final mwm1 y;
    public final boolean z;
    public final idd1 C = new idd1(new rq4(this, (byte) 17));
    public String E = "";

    public ys4(Scheduler scheduler, Scheduler scheduler2, Flowable flowable, Flowable flowable2, ks21 ks21Var, o241 o241Var, z3v0 z3v0Var, Observable observable, wp20 wp20Var, x0i0 x0i0Var, at4 at4Var, vbs vbsVar, eu4 eu4Var, veu0 veu0Var, g0l g0lVar, ln91 ln91Var, ypd ypdVar, d520 d520Var, uvy uvyVar, nn61 nn61Var, q0i0 q0i0Var, q0i0 q0i0Var2, xvo xvoVar, mr20 mr20Var, mwm1 mwm1Var, Context context, boolean z, q8n q8nVar) {
        this.a = scheduler;
        this.b = scheduler2;
        this.c = flowable;
        this.d = flowable2;
        this.e = ks21Var;
        this.f = o241Var;
        this.g = z3v0Var;
        this.h = observable;
        this.i = wp20Var;
        this.j = x0i0Var;
        this.k = at4Var;
        this.l = vbsVar;
        this.m = eu4Var;
        this.n = veu0Var;
        this.o = g0lVar;
        this.f102p = ln91Var;
        this.q = ypdVar;
        this.r = d520Var;
        this.s = uvyVar;
        this.t = nn61Var;
        this.u = q0i0Var;
        this.v = q0i0Var2;
        this.w = xvoVar;
        this.x = mr20Var;
        this.y = mwm1Var;
        this.z = z;
        this.A = q8nVar;
        this.B = ((p241) o241Var).a.map(uml1.f).distinctUntilChanged().toFlowable(BackpressureStrategy.d);
        this.D = new idd1(new mo2(context, (byte) 1));
    }

    public final String a(ContextTrack contextTrack) {
        if (l4o1.G(contextTrack) && !l4o1.u(contextTrack)) {
            return l4o1.j(contextTrack);
        }
        String strX = l4o1.x(contextTrack);
        String str = null;
        if (strX != null) {
            if (!l4o1.v(contextTrack)) {
                strX = null;
            }
            if (strX != null) {
                return strX;
            }
        }
        String str2 = (String) contextTrack.metadata().get("save_track.uri");
        if (str2 != null) {
            eu4 eu4Var = this.m;
            if (eu4Var.m() || eu4Var.a()) {
                str = str2;
            }
        }
        return str == null ? contextTrack.uri() : str;
    }

    public final Flowable b(Flowable flowable, Object obj) {
        return this.k.e() ? flowable.U(obj) : flowable;
    }
}
