package p;

import android.content.Context;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cg7 {
    public final Scheduler a;
    public final Scheduler b;
    public final me7 c;
    public final y0p d;
    public final a1p e;
    public final b1p f;
    public final d1p g;
    public final e1p h;
    public final cir0 i;
    public final le7 j;
    public final ze k;
    public final ajq0 l;

    public cg7(Scheduler scheduler, Scheduler scheduler2, me7 me7Var, y0p y0pVar, a1p a1pVar, b1p b1pVar, c1p c1pVar, d1p d1pVar, e1p e1pVar, cir0 cir0Var, le7 le7Var, ze zeVar) {
        ajq0 ajq0Var;
        this.a = scheduler;
        this.b = scheduler2;
        this.c = me7Var;
        this.d = y0pVar;
        this.e = a1pVar;
        this.f = b1pVar;
        this.g = d1pVar;
        this.h = e1pVar;
        this.i = cir0Var;
        this.j = le7Var;
        this.k = zeVar;
        switch (c1pVar.a) {
            case 0:
                yxo yxoVar = (yxo) c1pVar.b.c;
                me7 me7Var2 = ((be7) yxoVar.c).e;
                c8o.m(me7Var2);
                String str = ((be7) yxoVar.c).c;
                c8o.m(str);
                ajq0Var = new ajq0(me7Var2, str, (yf7) yxoVar.O0.get(), cir0Var);
                break;
            default:
                voa voaVar = (voa) c1pVar.b.c;
                me7 me7Var3 = ((pe7) voaVar.a).d;
                c8o.m(me7Var3);
                String str2 = ((pe7) voaVar.a).c;
                c8o.m(str2);
                ajq0Var = new ajq0(me7Var3, str2, (yf7) ((jly0) voaVar.n).get(), cir0Var);
                break;
        }
        this.l = ajq0Var;
    }

    public final MobiusLoop.Controller a() {
        zd1 zd1Var;
        zd1 zd1Var2;
        a21 a21Var;
        char c;
        char c2;
        byte b;
        if7 if7Var;
        zwg zwgVar;
        Observable observableJust;
        zf7 zf7Var = new zf7();
        a1p a1pVar = this.e;
        byte b2 = a1pVar.a;
        cir0 cir0Var = this.i;
        switch (b2) {
            case 0:
                yxo yxoVar = (yxo) a1pVar.b.c;
                ow3 ow3VarB = yxoVar.b();
                Scheduler scheduler = (Scheduler) ((ae7) yxoVar.d).b.get();
                c8o.l(scheduler);
                zd1Var = new zd1(cir0Var, ow3VarB, scheduler, (byte) 14);
                break;
            default:
                voa voaVar = (voa) a1pVar.b.c;
                ow3 ow3VarB2 = voaVar.b();
                Scheduler scheduler2 = (Scheduler) ((oe7) voaVar.b).b.get();
                c8o.l(scheduler2);
                zd1Var = new zd1(cir0Var, ow3VarB2, scheduler2, (byte) 14);
                break;
        }
        zd1 zd1Var3 = zd1Var;
        d1p d1pVar = this.g;
        byte b3 = d1pVar.a;
        ajq0 ajq0Var = this.l;
        switch (b3) {
            case 0:
                yxo yxoVar2 = (yxo) d1pVar.b.c;
                ow3 ow3VarB3 = yxoVar2.b();
                Scheduler scheduler3 = (Scheduler) ((ae7) yxoVar2.d).b.get();
                c8o.l(scheduler3);
                zd1Var2 = new zd1(ow3VarB3, scheduler3, ajq0Var, (byte) 10);
                break;
            default:
                voa voaVar2 = (voa) d1pVar.b.c;
                ow3 ow3VarB4 = voaVar2.b();
                Scheduler scheduler4 = (Scheduler) ((oe7) voaVar2.b).b.get();
                c8o.l(scheduler4);
                zd1Var2 = new zd1(ow3VarB4, scheduler4, ajq0Var, (byte) 10);
                break;
        }
        zd1 zd1Var4 = zd1Var2;
        e1p e1pVar = this.h;
        byte b4 = e1pVar.a;
        ze zeVar = this.k;
        switch (b4) {
            case 0:
                Context contextA = ((ae7) ((yxo) e1pVar.b.c).d).a();
                c8o.l(contextA);
                a21Var = new a21(contextA, zeVar, (byte) 9);
                break;
            default:
                Context contextA2 = ((oe7) ((voa) e1pVar.b.c).b).a();
                c8o.l(contextA2);
                a21Var = new a21(contextA2, zeVar, (byte) 9);
                break;
        }
        a21 a21Var2 = a21Var;
        b1p b1pVar = this.f;
        switch (b1pVar.a) {
            case 0:
                yxo yxoVar3 = (yxo) b1pVar.b.c;
                lzn0 lzn0Var = (lzn0) ((ae7) yxoVar3.d).h.get();
                c8o.l(lzn0Var);
                f5b f5bVar = new f5b(lzn0Var, (byte) 1);
                has0 has0Var = new has0((ec7) yxoVar3.R0.get(), (byte) 1);
                rwa0 rwa0Var = new rwa0(new t4d1((md7) yxoVar3.b.get(), (byte) 19), (byte) 7);
                has0 has0Var2 = new has0((ec7) yxoVar3.R0.get(), (byte) 0);
                Scheduler scheduler5 = (Scheduler) ((ae7) yxoVar3.d).b.get();
                c8o.l(scheduler5);
                x290 x290Var = (x290) ((ae7) yxoVar3.d).A.get();
                c8o.l(x290Var);
                a381 a381Var = new a381(x290Var.a(), (byte) 0);
                c = 0;
                iac0 iac0Var = ((q7r0) yxoVar3.e).d.c;
                c8o.m(iac0Var);
                y390 y390Var = (y390) ((ae7) yxoVar3.d).D.get();
                c8o.l(y390Var);
                o481 o481Var = new o481(y390Var.a(iac0Var, r6h1.c), (byte) 1);
                yh2 yh2Var = (yh2) ((ae7) yxoVar3.d).y.get();
                c8o.l(yh2Var);
                tr41 tr41Var = new tr41(yh2Var, (byte) 10);
                c2 = 1;
                t4d1 t4d1Var = new t4d1((md7) yxoVar3.b.get(), (byte) 19);
                Scheduler scheduler6 = (Scheduler) ((ae7) yxoVar3.d).d.get();
                c8o.l(scheduler6);
                g2x0 g2x0Var = new g2x0(t4d1Var, scheduler6, (byte) 11);
                so soVar = new so(yxoVar3.b(), new t4d1((md7) yxoVar3.b.get(), (byte) 19), (byte) 5);
                by3 by3Var = (by3) ((ae7) yxoVar3.d).j.get();
                c8o.l(by3Var);
                b = 19;
                if7Var = new if7(f5bVar, has0Var, rwa0Var, has0Var2, scheduler5, a381Var, o481Var, tr41Var, g2x0Var, soVar, new yx11(by3Var, (byte) 20), a21Var2, zd1Var3, zd1Var4);
                break;
            default:
                voa voaVar3 = (voa) b1pVar.b.c;
                lzn0 lzn0Var2 = (lzn0) ((oe7) voaVar3.b).h.get();
                c8o.l(lzn0Var2);
                f5b f5bVar2 = new f5b(lzn0Var2, (byte) 1);
                has0 has0Var3 = new has0((ec7) ((jly0) voaVar3.q).get(), (byte) 1);
                rwa0 rwa0Var2 = new rwa0(new t4d1((md7) ((jly0) voaVar3.d).get(), (byte) 19), (byte) 7);
                has0 has0Var4 = new has0((ec7) ((jly0) voaVar3.q).get(), (byte) 0);
                Scheduler scheduler7 = (Scheduler) ((oe7) voaVar3.b).b.get();
                c8o.l(scheduler7);
                x290 x290Var2 = (x290) ((oe7) voaVar3.b).A.get();
                c8o.l(x290Var2);
                a381 a381Var2 = new a381(x290Var2.a(), (byte) 0);
                iac0 iac0Var2 = ((q7r0) voaVar3.c).d.c;
                c8o.m(iac0Var2);
                y390 y390Var2 = (y390) ((oe7) voaVar3.b).D.get();
                c8o.l(y390Var2);
                o481 o481Var2 = new o481(y390Var2.a(iac0Var2, r6h1.c), (byte) 1);
                yh2 yh2Var2 = (yh2) ((oe7) voaVar3.b).y.get();
                c8o.l(yh2Var2);
                tr41 tr41Var2 = new tr41(yh2Var2, (byte) 10);
                t4d1 t4d1Var2 = new t4d1((md7) ((jly0) voaVar3.d).get(), (byte) 19);
                Scheduler scheduler8 = (Scheduler) ((oe7) voaVar3.b).d.get();
                c8o.l(scheduler8);
                g2x0 g2x0Var2 = new g2x0(t4d1Var2, scheduler8, (byte) 11);
                b = 19;
                so soVar2 = new so(voaVar3.b(), new t4d1((md7) ((jly0) voaVar3.d).get(), (byte) 19), (byte) 5);
                by3 by3Var2 = (by3) ((oe7) voaVar3.b).j.get();
                c8o.l(by3Var2);
                c2 = 1;
                if7Var = new if7(f5bVar2, has0Var3, rwa0Var2, has0Var4, scheduler7, a381Var2, o481Var2, tr41Var2, g2x0Var2, soVar2, new yx11(by3Var2, (byte) 20), a21Var2, zd1Var3, zd1Var4);
                c = 0;
                break;
        }
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.c(ye7.class, if7Var.c);
        subtypeEffectHandlerBuilderC.g(cf7.class, if7Var.m);
        subtypeEffectHandlerBuilderC.g(hf7.class, if7Var.i);
        f5b f5bVar3 = if7Var.a;
        Scheduler scheduler9 = if7Var.e;
        subtypeEffectHandlerBuilderC.d(xe7.class, f5bVar3, scheduler9);
        subtypeEffectHandlerBuilderC.d(bf7.class, if7Var.b, scheduler9);
        subtypeEffectHandlerBuilderC.g(we7.class, if7Var.j);
        subtypeEffectHandlerBuilderC.d(af7.class, if7Var.d, scheduler9);
        subtypeEffectHandlerBuilderC.g(ze7.class, if7Var.n);
        subtypeEffectHandlerBuilderC.d(ff7.class, if7Var.f, scheduler9);
        subtypeEffectHandlerBuilderC.d(gf7.class, if7Var.g, scheduler9);
        subtypeEffectHandlerBuilderC.d(df7.class, if7Var.h, scheduler9);
        subtypeEffectHandlerBuilderC.g(ef7.class, if7Var.k);
        subtypeEffectHandlerBuilderC.d(ve7.class, if7Var.l, scheduler9);
        MobiusLoop.Builder builderD = Mobius.d(zf7Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
        y0p y0pVar = this.d;
        byte b5 = y0pVar.a;
        le7 le7Var = this.j;
        switch (b5) {
            case 0:
                yxo yxoVar4 = (yxo) y0pVar.b.c;
                z0p z0pVar = (z0p) yxoVar4.N0.get();
                x5j1 x5j1Var = new x5j1((yf7) yxoVar4.O0.get(), (byte) 23);
                zwz0 zwz0Var = (zwz0) ((ae7) yxoVar4.d).r.get();
                c8o.l(zwz0Var);
                i3b i3bVar = new i3b(zwz0Var, b);
                l1p0 l1p0Var = new l1p0((ec7) yxoVar4.R0.get(), (byte) 24);
                ae7 ae7Var = (ae7) yxoVar4.d;
                o241 o241Var = (o241) ae7Var.l.get();
                c8o.l(o241Var);
                yh2 yh2Var3 = (yh2) ae7Var.y.get();
                c8o.l(yh2Var3);
                zr00 zr00Var = (zr00) ae7Var.C.get();
                c8o.l(zr00Var);
                ux3 ux3Var = (ux3) ae7Var.i.get();
                c8o.l(ux3Var);
                zwgVar = new zwg(z0pVar, x5j1Var, i3bVar, l1p0Var, new lag(o241Var, yh2Var3, zr00Var, ux3Var, (byte) 24), le7Var);
                break;
            default:
                voa voaVar4 = (voa) y0pVar.b.c;
                z0p z0pVar2 = (z0p) ((jly0) voaVar4.m).get();
                x5j1 x5j1Var2 = new x5j1((yf7) ((jly0) voaVar4.n).get(), (byte) 23);
                zwz0 zwz0Var2 = (zwz0) ((oe7) voaVar4.b).n.get();
                c8o.l(zwz0Var2);
                i3b i3bVar2 = new i3b(zwz0Var2, b);
                l1p0 l1p0Var2 = new l1p0((ec7) ((jly0) voaVar4.q).get(), (byte) 24);
                oe7 oe7Var = (oe7) voaVar4.b;
                o241 o241Var2 = (o241) oe7Var.l.get();
                c8o.l(o241Var2);
                yh2 yh2Var4 = (yh2) oe7Var.y.get();
                c8o.l(yh2Var4);
                zr00 zr00Var2 = (zr00) oe7Var.C.get();
                c8o.l(zr00Var2);
                ux3 ux3Var2 = (ux3) oe7Var.i.get();
                c8o.l(ux3Var2);
                zwgVar = new zwg(z0pVar2, x5j1Var2, i3bVar2, l1p0Var2, new lag(o241Var2, yh2Var4, zr00Var2, ux3Var2, (byte) 24), le7Var);
                break;
        }
        le7 le7Var2 = (le7) ((l2a) zwgVar.e).b;
        ObservableSource map = le7Var2.h.observeOn(le7Var2.e).map(t9w.T0);
        ObservableSource observableSource = ((yf7) ((x5j1) zwgVar.a).b).a;
        mr20 mr20VarC = ((zwz0) ((i3b) zwgVar.b).b).c();
        o6x o6xVar = o6x.a;
        ObservableSource map2 = yoi1.i(mr20VarC, o6xVar).map(b6j0.Q0);
        ec7 ec7Var = (ec7) ((l1p0) zwgVar.c).b;
        ObservableSource map3 = yoi1.i(hu20.e(ec7Var.e, new qt((lnm) null, ec7Var, (byte) 15)), o6xVar).map(dj10.d1);
        lag lagVar = (lag) zwgVar.d;
        Observable observableI = yoi1.i(((zr00) lagVar.d).a, o6xVar);
        Observable observableA = ((yh2) lagVar.c).a();
        Observable observable = ((o241) lagVar.b).a;
        Observable observableDistinctUntilChanged = observable.map(olj0.S0).distinctUntilChanged();
        Observable observableDistinctUntilChanged2 = observable.map(pzs0.S0).distinctUntilChanged();
        ux3 ux3Var3 = (ux3) lagVar.e;
        if (ux3Var3.a()) {
            observableJust = yoi1.i(ux3Var3.b(), o6xVar);
        } else {
            observableJust = Observable.just(Boolean.FALSE);
            observableJust.getClass();
        }
        ObservableSource observableSourceCombineLatest = Observable.combineLatest(observableI, observableA, observableDistinctUntilChanged, observableDistinctUntilChanged2, observableJust, qzs0.T0);
        ObservableSource[] observableSourceArr = new ObservableSource[5];
        observableSourceArr[c] = map;
        observableSourceArr[c2] = observableSource;
        observableSourceArr[2] = map2;
        observableSourceArr[3] = map3;
        observableSourceArr[4] = observableSourceCombineLatest;
        MobiusLoop.Builder builderG = l1d.g(builderD.h(RxEventSources.a(observableSourceArr)).b(new ag7(this)).d(new bg7(this)));
        sd7 sd7Var = le7Var.i;
        return Mobius.c(builderG, new dg7(true, false, z6x.a, false, false, false, false, ofu0.a, this.c, sd7Var == null ? new sd7(null, null, null, null, null, 2047) : sd7Var), MainThreadWorkRunner.a());
    }
}
