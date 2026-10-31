package p;

import android.app.Activity;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.MobiusAndroid;
import com.spotify.mobius.extras.patterns.InnerEffectHandlers;
import com.spotify.mobius.extras.patterns.InnerUpdate;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mq81 {
    public final x6s0 a;
    public final ohv0 b;
    public final dxz0 c;
    public final ug d;
    public final Scheduler e;
    public final kqq f;
    public final hr81 g;
    public final nfb h;
    public final y0g i;
    public final kly0 j;
    public final d7r0 k;
    public final mwn0 l;

    public mq81(x6s0 x6s0Var, ohv0 ohv0Var, dxz0 dxz0Var, ug ugVar, Scheduler scheduler, kqq kqqVar, hr81 hr81Var, nfb nfbVar, y0g y0gVar, jly0 jly0Var, d7r0 d7r0Var, mwn0 mwn0Var) {
        this.a = x6s0Var;
        this.b = ohv0Var;
        this.c = dxz0Var;
        this.d = ugVar;
        this.e = scheduler;
        this.f = kqqVar;
        this.g = hr81Var;
        this.h = nfbVar;
        this.i = y0gVar;
        this.j = jly0Var;
        this.k = d7r0Var;
        this.l = mwn0Var;
    }

    public final MobiusLoop.Controller a(dg30 dg30Var, kr81 kr81Var, qq81 qq81Var, PublishSubject publishSubject, y3u y3uVar, pxw pxwVar) {
        dq80 dq80Var = new dq80(this.b, this.k, (i8h1) this.j.get(), this.l);
        ObservableSource publishSubject2 = new PublishSubject();
        dxz0 dxz0Var = this.c;
        Observable observableStartWithItem = dxz0Var.e().startWithItem(Boolean.valueOf(dxz0Var.d()));
        BehaviorSubject behaviorSubject = this.d.b;
        azw azwVar = kr81Var.Y;
        hr81 hr81Var = this.g;
        yww ywwVar = azwVar != null ? new yww(kr81Var, azwVar, y3uVar, publishSubject2, hr81Var, this.h) : null;
        y6s0 y6s0Var = kr81Var.Z;
        d6s0 d6s0Var = y6s0Var != null ? new d6s0(this.a, y6s0Var, kr81Var, hr81Var) : null;
        m5 m5Var = kr81Var.N0;
        Scheduler scheduler = this.e;
        y0g y0gVar = this.i;
        gg2 gg2Var = new gg2(kr81Var, m5Var, scheduler, y3uVar, hr81Var, y0gVar);
        yc40 yc40Var = new yc40(kr81Var);
        hjn0 hjn0Var = new hjn0(dg30Var, kr81Var.P0, publishSubject2);
        h72 h72Var = (h72) this.f.a.c;
        Activity activity = (Activity) ((gq81) h72Var.b).b.get();
        c8o.l(activity);
        gq81 gq81Var = (gq81) h72Var.b;
        kg0 kg0Var = (kg0) gq81Var.i.get();
        c8o.l(kg0Var);
        Scheduler scheduler2 = (Scheduler) gq81Var.f.get();
        c8o.l(scheduler2);
        g1f0 g1f0Var = (g1f0) gq81Var.j.get();
        c8o.l(g1f0Var);
        br81 br81Var = (br81) gq81Var.l.get();
        c8o.l(br81Var);
        yww ywwVar2 = ywwVar;
        d6s0 d6s0Var2 = d6s0Var;
        fp81 fp81Var = new fp81(ywwVar2, d6s0Var2, gg2Var, yc40Var, hjn0Var, kr81Var, y3uVar, y0gVar, activity, kg0Var, scheduler2, g1f0Var, br81Var);
        InnerUpdate.Builder builderB = InnerUpdate.b();
        builderB.b(vbx0.Z);
        builderB.e(wbx0.Z);
        builderB.f(ybx0.Z);
        builderB.d(gp71.f);
        builderB.c(InnerEffectHandlers.a(hcx0.Z));
        InnerUpdate innerUpdateA = builderB.a();
        InnerUpdate.Builder builderB2 = InnerUpdate.b();
        builderB2.b(mgx0.Y);
        builderB2.e(bjx0.Z);
        builderB2.f(djx0.Z);
        builderB2.d(new wam0((byte) 16));
        builderB2.c(InnerEffectHandlers.a(njx0.Z));
        InnerUpdate innerUpdateA2 = builderB2.a();
        InnerUpdate.Builder builderB3 = InnerUpdate.b();
        builderB3.b(n9x0.Y);
        builderB3.e(o9x0.Y);
        builderB3.f(s9x0.Z);
        builderB3.d(new wam0((byte) 14));
        builderB3.c(InnerEffectHandlers.a(u9x0.Y));
        InnerUpdate innerUpdateA3 = builderB3.a();
        InnerUpdate.Builder builderB4 = InnerUpdate.b();
        builderB4.b(icx0.Y);
        builderB4.e(jcx0.Z);
        builderB4.f(kcx0.Z);
        builderB4.d(new wam0((byte) 15));
        builderB4.c(InnerEffectHandlers.a(pdx0.Z));
        InnerUpdate innerUpdateA4 = builderB4.a();
        InnerUpdate.Builder builderB5 = InnerUpdate.b();
        builderB5.b(rdx0.Y);
        builderB5.e(wdx0.Y);
        builderB5.f(gex0.Z);
        builderB5.d(gp71.g);
        builderB5.c(InnerEffectHandlers.a(hgx0.Z));
        lq81 lq81Var = new lq81(innerUpdateA, innerUpdateA2, innerUpdateA3, innerUpdateA4, builderB5.a());
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        if (pxwVar.a && ywwVar2 != null) {
            subtypeEffectHandlerBuilderC.g(io81.class, new cp81(ywwVar2, (byte) 1));
        }
        if (pxwVar.b && d6s0Var2 != null) {
            subtypeEffectHandlerBuilderC.g(so81.class, new cp81(d6s0Var2, (byte) 4));
        }
        subtypeEffectHandlerBuilderC.g(go81.class, new fg2(gg2Var, (byte) 1));
        subtypeEffectHandlerBuilderC.g(mo81.class, new cp81(yc40Var, (byte) 2));
        subtypeEffectHandlerBuilderC.g(ro81.class, new cp81(hjn0Var, (byte) 3));
        subtypeEffectHandlerBuilderC.b(ho81.class, new ep81(fp81Var, (byte) 1), scheduler2);
        subtypeEffectHandlerBuilderC.d(lo81.class, new dp81(fp81Var, (byte) 1), scheduler2);
        subtypeEffectHandlerBuilderC.b(uo81.class, new ep81(fp81Var, (byte) 2), scheduler2);
        subtypeEffectHandlerBuilderC.b(vo81.class, new ep81(fp81Var, (byte) 3), scheduler2);
        subtypeEffectHandlerBuilderC.b(to81.class, new ep81(fp81Var, (byte) 4), scheduler2);
        subtypeEffectHandlerBuilderC.b(wo81.class, new ep81(fp81Var, (byte) 5), scheduler2);
        subtypeEffectHandlerBuilderC.g(ko81.class, new cp81(new fe81(br81Var, (byte) 4), (byte) 0));
        subtypeEffectHandlerBuilderC.d(yo81.class, new jkt0((byte) 7), scheduler2);
        subtypeEffectHandlerBuilderC.d(xo81.class, new dp81(fp81Var, (byte) 2), scheduler2);
        subtypeEffectHandlerBuilderC.d(jo81.class, new dp81(fp81Var, (byte) 3), scheduler2);
        subtypeEffectHandlerBuilderC.c(zo81.class, new dp81(fp81Var, (byte) 0));
        subtypeEffectHandlerBuilderC.b(qo81.class, new ep81(fp81Var, (byte) 0), scheduler2);
        return MobiusAndroid.a(Mobius.d(lq81Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).c(RxEventSources.a(new ObservableSource[]{publishSubject.map(l9x0.Z)}), new EventSource[]{RxEventSources.a(new ObservableSource[]{observableStartWithItem.flatMap(m9x0.Z)}), RxEventSources.a(new ObservableSource[]{behaviorSubject.distinctUntilChanged().flatMap(y6x0.Y)}), RxEventSources.a(new ObservableSource[]{publishSubject2})}).f(dq80Var).e(new iq81(pxwVar)), qq81Var);
    }
}
