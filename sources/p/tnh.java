package p;

import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tnh {
    public final Scheduler a;
    public final i4q b;
    public final zd1 c;
    public final yon d;
    public final h1e0 e;
    public final h1e0 f;
    public final h1e0 g;
    public final f5b h;
    public final q6p i;
    public final h1e0 j;
    public final r6p k;
    public final yon l;
    public final x981 m;
    public final tr41 n;
    public final qg7 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g2x0 f15p;

    public tnh(Scheduler scheduler, i4q i4qVar, zd1 zd1Var, yon yonVar, h1e0 h1e0Var, h1e0 h1e0Var2, h1e0 h1e0Var3, f5b f5bVar, q6p q6pVar, h1e0 h1e0Var4, r6p r6pVar, yon yonVar2, x981 x981Var, tr41 tr41Var, qg7 qg7Var, g2x0 g2x0Var) {
        this.a = scheduler;
        this.b = i4qVar;
        this.c = zd1Var;
        this.d = yonVar;
        this.e = h1e0Var;
        this.f = h1e0Var2;
        this.g = h1e0Var3;
        this.h = f5bVar;
        this.i = q6pVar;
        this.j = h1e0Var4;
        this.k = r6pVar;
        this.l = yonVar2;
        this.m = x981Var;
        this.n = tr41Var;
        this.o = qg7Var;
        this.f15p = g2x0Var;
    }

    public final ObservableTransformer a(x9k1 x9k1Var, lik1 lik1Var, String str) {
        so soVar;
        mt60 mt60Var;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(cnh.class, this.c);
        subtypeEffectHandlerBuilderC.g(dnh.class, this.d);
        subtypeEffectHandlerBuilderC.g(enh.class, this.e);
        subtypeEffectHandlerBuilderC.g(fnh.class, this.f);
        subtypeEffectHandlerBuilderC.g(gnh.class, this.g);
        f5b f5bVar = this.h;
        Scheduler scheduler = this.a;
        subtypeEffectHandlerBuilderC.d(hnh.class, f5bVar, scheduler);
        subtypeEffectHandlerBuilderC.d(inh.class, new mba(x9k1Var, (byte) 29), scheduler);
        q6p q6pVar = this.i;
        switch (q6pVar.a) {
            case 0:
                em0 em0Var = (em0) q6pVar.b.c;
                muz muzVarD = ((cyp) ((jly0) em0Var.d).get()).d();
                ruz ruzVarA = ((cyp) ((jly0) em0Var.d).get()).a();
                iwp iwpVar = (iwp) ((bnh) em0Var.b).h.get();
                c8o.l(iwpVar);
                soVar = new so(muzVarD, ruzVarA, iwpVar, str);
                break;
            default:
                em0 em0Var2 = (em0) q6pVar.b.c;
                muz muzVarD2 = ((cyp) ((jly0) em0Var2.e).get()).d();
                ruz ruzVarA2 = ((cyp) ((jly0) em0Var2.e).get()).a();
                iwp iwpVar2 = (iwp) ((wph) em0Var2.b).p.get();
                c8o.l(iwpVar2);
                soVar = new so(muzVarD2, ruzVarA2, iwpVar2, str);
                break;
        }
        subtypeEffectHandlerBuilderC.g(jnh.class, soVar);
        subtypeEffectHandlerBuilderC.g(knh.class, this.j);
        mfm mfmVarA = this.b.a(lik1Var);
        syf syfVar = new syf(x9k1Var, (byte) 25);
        r6p r6pVar = this.k;
        switch (r6pVar.a) {
            case 0:
                em0 em0Var3 = (em0) r6pVar.b.c;
                Scheduler scheduler2 = (Scheduler) ((bnh) em0Var3.b).I.get();
                c8o.l(scheduler2);
                bhh bhhVar = (bhh) ((bnh) em0Var3.b).i.get();
                c8o.l(bhhVar);
                mt60Var = new mt60(scheduler2, bhhVar, mfmVarA, lik1Var, syfVar);
                break;
            default:
                em0 em0Var4 = (em0) r6pVar.b.c;
                Scheduler scheduler3 = (Scheduler) ((wph) em0Var4.b).G.get();
                c8o.l(scheduler3);
                bhh bhhVar2 = (bhh) ((wph) em0Var4.b).q.get();
                c8o.l(bhhVar2);
                mt60Var = new mt60(scheduler3, bhhVar2, mfmVarA, lik1Var, syfVar);
                break;
        }
        subtypeEffectHandlerBuilderC.g(mnh.class, mt60Var);
        subtypeEffectHandlerBuilderC.g(pnh.class, this.m);
        subtypeEffectHandlerBuilderC.d(qnh.class, this.n, scheduler);
        subtypeEffectHandlerBuilderC.d(nnh.class, this.o, scheduler);
        subtypeEffectHandlerBuilderC.g(onh.class, this.l);
        subtypeEffectHandlerBuilderC.g(rnh.class, this.f15p);
        return subtypeEffectHandlerBuilderC.h();
    }
}
