package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class icp0 extends hab0 implements Function0 {
    public final /* synthetic */ ccp0 N0;
    public final /* synthetic */ ccp0 X;
    public final /* synthetic */ ccp0 Y;
    public final /* synthetic */ ccp0 Z;
    public final /* synthetic */ ccp0 a;
    public final /* synthetic */ ccp0 b;
    public final /* synthetic */ ccp0 c;
    public final /* synthetic */ ccp0 d;
    public final /* synthetic */ ccp0 e;
    public final /* synthetic */ ccp0 f;
    public final /* synthetic */ ybp0 g;
    public final /* synthetic */ ccp0 h;
    public final /* synthetic */ ccp0 i;
    public final /* synthetic */ ccp0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icp0(ccp0 ccp0Var, ccp0 ccp0Var2, ccp0 ccp0Var3, ccp0 ccp0Var4, ccp0 ccp0Var5, ccp0 ccp0Var6, ybp0 ybp0Var, ccp0 ccp0Var7, ccp0 ccp0Var8, ccp0 ccp0Var9, ccp0 ccp0Var10, ccp0 ccp0Var11, ccp0 ccp0Var12, ccp0 ccp0Var13) {
        super(0);
        this.a = ccp0Var;
        this.b = ccp0Var2;
        this.c = ccp0Var3;
        this.d = ccp0Var4;
        this.e = ccp0Var5;
        this.f = ccp0Var6;
        this.g = ybp0Var;
        this.h = ccp0Var7;
        this.i = ccp0Var8;
        this.t = ccp0Var9;
        this.X = ccp0Var10;
        this.Y = ccp0Var11;
        this.Z = ccp0Var12;
        this.N0 = ccp0Var13;
    }

    public final Object invoke() {
        Scheduler scheduler = (Scheduler) this.a.invoke();
        jgz0 jgz0Var = (jgz0) this.b.invoke();
        i8h1 i8h1Var = (i8h1) this.c.invoke();
        t2j0 t2j0Var = (t2j0) this.d.invoke();
        b7r0 b7r0Var = (b7r0) this.e.invoke();
        g0l g0lVar = (g0l) this.f.invoke();
        kly0 kly0Var = this.g.b.x1;
        Flowable flowable = (Flowable) this.h.invoke();
        ypd ypdVar = (ypd) this.i.invoke();
        mw7 mw7Var = (mw7) this.t.invoke();
        crd crdVar = (crd) this.X.invoke();
        Observable observable = (Observable) this.Y.invoke();
        Observable observable2 = (Observable) this.Z.invoke();
        Observable observable3 = (Observable) this.N0.invoke();
        x390 x390Var = new x390(i8h1Var, t2j0Var, (byte) 10);
        haa0 haa0Var = new haa0(scheduler, g0lVar);
        m980 m980Var = new m980(kly0Var);
        aia0 aia0Var = new aia0(scheduler, x390Var, jgz0Var, b7r0Var, haa0Var, observable2);
        return new bia0(aia0Var, m980Var, p7h.M(new xjs[]{new kbu0(flowable, scheduler), new h74(scheduler, ypdVar), new n74(g0lVar, (byte) 0), new uts0(new swm0(mw7Var, (byte) 20)), new n74(mw7Var, (byte) 1)}), new xqd(aia0Var, crdVar, observable, observable3));
    }
}
