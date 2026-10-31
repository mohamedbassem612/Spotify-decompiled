package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lap0 extends hab0 implements Function0 {
    public final /* synthetic */ ibp0 N0;
    public final /* synthetic */ ibp0 O0;
    public final /* synthetic */ yap0 P0;
    public final /* synthetic */ ibp0 Q0;
    public final /* synthetic */ ibp0 R0;
    public final /* synthetic */ sap0 S0;
    public final /* synthetic */ ibp0 X;
    public final /* synthetic */ ibp0 Y;
    public final /* synthetic */ ibp0 Z;
    public final /* synthetic */ ibp0 a;
    public final /* synthetic */ ibp0 b;
    public final /* synthetic */ ibp0 c;
    public final /* synthetic */ ibp0 d;
    public final /* synthetic */ ibp0 e;
    public final /* synthetic */ ibp0 f;
    public final /* synthetic */ ibp0 g;
    public final /* synthetic */ ibp0 h;
    public final /* synthetic */ ibp0 i;
    public final /* synthetic */ ibp0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lap0(ibp0 ibp0Var, ibp0 ibp0Var2, ibp0 ibp0Var3, ibp0 ibp0Var4, ibp0 ibp0Var5, ibp0 ibp0Var6, ibp0 ibp0Var7, ibp0 ibp0Var8, ibp0 ibp0Var9, ibp0 ibp0Var10, ibp0 ibp0Var11, ibp0 ibp0Var12, ibp0 ibp0Var13, ibp0 ibp0Var14, ibp0 ibp0Var15, yap0 yap0Var, ibp0 ibp0Var16, ibp0 ibp0Var17, sap0 sap0Var) {
        super(0);
        this.a = ibp0Var;
        this.b = ibp0Var2;
        this.c = ibp0Var3;
        this.d = ibp0Var4;
        this.e = ibp0Var5;
        this.f = ibp0Var6;
        this.g = ibp0Var7;
        this.h = ibp0Var8;
        this.i = ibp0Var9;
        this.t = ibp0Var10;
        this.X = ibp0Var11;
        this.Y = ibp0Var12;
        this.Z = ibp0Var13;
        this.N0 = ibp0Var14;
        this.O0 = ibp0Var15;
        this.P0 = yap0Var;
        this.Q0 = ibp0Var16;
        this.R0 = ibp0Var17;
        this.S0 = sap0Var;
    }

    public final Object invoke() {
        Context context = (Context) this.a.invoke();
        wve0 wve0Var = (wve0) this.b.invoke();
        yqg yqgVar = (yqg) this.c.invoke();
        nfa0 nfa0Var = (nfa0) this.d.invoke();
        uh8 uh8Var = (uh8) this.e.invoke();
        Flowable flowable = (Flowable) this.f.invoke();
        luk lukVar = (luk) this.g.invoke();
        mya1 mya1Var = (mya1) this.h.invoke();
        RetrofitMaker retrofitMaker = (RetrofitMaker) this.i.invoke();
        xm41 xm41Var = (xm41) this.t.invoke();
        xm41 xm41Var2 = (xm41) this.X.invoke();
        wbd1 wbd1Var = (wbd1) this.Y.invoke();
        vbd1 vbd1Var = (vbd1) this.Z.invoke();
        Scheduler scheduler = (Scheduler) this.N0.invoke();
        q8n q8nVar = (q8n) this.O0.invoke();
        yv yvVarC = this.P0.b.c();
        g0l g0lVar = (g0l) this.Q0.invoke();
        t2j0 t2j0Var = (t2j0) this.R0.invoke();
        n4f0 n4f0VarD = this.S0.b.d();
        em0 em0Var = new em0(new qq(context, wve0Var, yqgVar, nfa0Var, uh8Var, flowable, lukVar, mya1Var, retrofitMaker, xm41Var, xm41Var2, wbd1Var, vbd1Var, scheduler, q8nVar, yvVarC, g0lVar, t2j0Var, n4f0VarD));
        return new pq(flowable, (jly0) em0Var.e, (fwo) em0Var.f, (fwo) em0Var.g, (fwo) em0Var.h, (fwo) em0Var.i, (fwo) em0Var.t, (fwo) em0Var.X, n4f0VarD);
    }
}
