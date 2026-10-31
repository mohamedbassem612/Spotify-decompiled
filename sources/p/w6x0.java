package p;

import android.app.Activity;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class w6x0 {
    public final Scheduler a;
    public final Scheduler b;
    public final Scheduler c;
    public final q8n d;
    public final zsc e;
    public final zsc f;
    public final kt91 g;
    public final o3x0 h;
    public final m1x0 i;
    public final dg30 j;
    public final e630 k;
    public final bfd l;
    public final wmy m;
    public final c4n0 n;
    public final oxi0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j0a1 f21p;
    public final kp5 q;
    public final k3x0 r;
    public final PublishSubject s = new PublishSubject();

    public w6x0(Scheduler scheduler, Scheduler scheduler2, Scheduler scheduler3, q8n q8nVar, zsc zscVar, zsc zscVar2, kt91 kt91Var, o3x0 o3x0Var, m1x0 m1x0Var, dg30 dg30Var, e630 e630Var, bfd bfdVar, wmy wmyVar, c4n0 c4n0Var, oxi0 oxi0Var, j0a1 j0a1Var, kp5 kp5Var, r35 r35Var, k3x0 k3x0Var) {
        this.a = scheduler;
        this.b = scheduler2;
        this.c = scheduler3;
        this.d = q8nVar;
        this.e = zscVar;
        this.f = zscVar2;
        this.g = kt91Var;
        this.h = o3x0Var;
        this.i = m1x0Var;
        this.j = dg30Var;
        this.k = e630Var;
        this.l = bfdVar;
        this.m = wmyVar;
        this.n = c4n0Var;
        this.o = oxi0Var;
        this.f21p = j0a1Var;
        this.q = kp5Var;
        this.r = k3x0Var;
    }

    public final MobiusLoop.Builder a(Observable observable) {
        t6x0 t6x0Var = new t6x0();
        mwv0 mwv0Var = this.r.q;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(v4x0.class, new g2x0(this.h, this.f, (byte) 3));
        zsc zscVar = this.e;
        o5x0 o5x0Var = new o5x0(zscVar, (byte) 3);
        Scheduler scheduler = this.a;
        subtypeEffectHandlerBuilderC.d(p4x0.class, o5x0Var, scheduler);
        subtypeEffectHandlerBuilderC.d(o4x0.class, new o5x0(zscVar, (byte) 2), scheduler);
        subtypeEffectHandlerBuilderC.d(s4x0.class, new o5x0(zscVar, (byte) 6), scheduler);
        subtypeEffectHandlerBuilderC.d(q4x0.class, new o5x0(zscVar, (byte) 4), scheduler);
        subtypeEffectHandlerBuilderC.d(r4x0.class, new o5x0(zscVar, (byte) 5), scheduler);
        subtypeEffectHandlerBuilderC.d(m4x0.class, new o5x0(zscVar, (byte) 0), scheduler);
        subtypeEffectHandlerBuilderC.g(t4x0.class, new g2x0(scheduler, this.i, (byte) 2));
        kt91 kt91Var = this.g;
        subtypeEffectHandlerBuilderC.d(k4x0.class, new l5x0(kt91Var, (byte) 0), scheduler);
        subtypeEffectHandlerBuilderC.d(g5x0.class, new l5x0(kt91Var, (byte) 1), scheduler);
        dg30 dg30Var = this.j;
        subtypeEffectHandlerBuilderC.d(a5x0.class, new s5x0((Activity) dg30Var, kt91Var, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.d(h5x0.class, new s5x0((Activity) dg30Var, kt91Var, (byte) 3), scheduler);
        subtypeEffectHandlerBuilderC.d(z4x0.class, new hi1(this.k, dg30Var, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.d(n4x0.class, new o5x0(zscVar, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.d(x4x0.class, new qg7(this.o, this.m, this.n, (byte) 21), scheduler);
        subtypeEffectHandlerBuilderC.d(y4x0.class, new o5x0(zscVar, (byte) 7), scheduler);
        q8n q8nVar = this.d;
        bfd bfdVar = this.l;
        subtypeEffectHandlerBuilderC.g(i4x0.class, new c2x0(q8nVar, bfdVar, (byte) 1));
        subtypeEffectHandlerBuilderC.g(j4x0.class, new zd1(q8nVar, bfdVar, mwv0Var, (byte) 17));
        j0a1 j0a1Var = this.f21p;
        subtypeEffectHandlerBuilderC.g(l4x0.class, new k5x0(q8nVar, j0a1Var, (byte) 1));
        subtypeEffectHandlerBuilderC.g(u4x0.class, new k5x0(q8nVar, j0a1Var, (byte) 2));
        subtypeEffectHandlerBuilderC.g(h4x0.class, new k5x0(q8nVar, j0a1Var, (byte) 0));
        subtypeEffectHandlerBuilderC.g(e5x0.class, new u5x0(scheduler, this.q, (byte) 0));
        subtypeEffectHandlerBuilderC.d(d5x0.class, new t5x0(kt91Var, dg30Var, zscVar, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.d(c5x0.class, new s5x0(kt91Var, (Activity) dg30Var, (byte) 2), scheduler);
        subtypeEffectHandlerBuilderC.d(f5x0.class, new jkt0((byte) 3), scheduler);
        subtypeEffectHandlerBuilderC.d(b5x0.class, new t5x0(kt91Var, dg30Var, zscVar, (byte) 0), scheduler);
        subtypeEffectHandlerBuilderC.d(w4x0.class, new s5x0(kt91Var, (Activity) dg30Var, (byte) 0), scheduler);
        return l1d.g(Mobius.d(t6x0Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(RxEventSources.a(new ObservableSource[]{observable.map(r6x0.b), this.s, yoi1.i(new dwv(j0a1Var.b, (byte) 15), o6x.a)})).b(new u6x0(this)).d(new v6x0(this)));
    }
}
