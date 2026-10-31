package p;

import android.content.Context;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class hwo implements jly0 {
    public final or a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public hwo(or orVar, int i) {
        this.a = orVar;
        this.b = i;
    }

    public final Object get() {
        or orVar = this.a;
        sq sqVar = (sq) orVar.b;
        boolean z = this.b;
        if (z) {
            if (!z) {
                jah.e(z ? 1 : 0);
                return null;
            }
            Context context = sqVar.context();
            c8o.l(context);
            c8o.l(sqVar.a());
            nfa0 nfa0VarA0 = sqVar.A0();
            c8o.l(nfa0VarA0);
            fha0 fha0Var = new fha0(nfa0VarA0);
            Context context2 = sqVar.context();
            c8o.l(context2);
            sr srVar = new sr(context2.getApplicationContext());
            q8n q8nVarD = sqVar.d();
            c8o.l(q8nVarD);
            return new iq(context, fha0Var, srVar, q8nVarD, 500L, sqVar.E0());
        }
        wve0 wve0VarG0 = sqVar.G0();
        c8o.l(wve0VarG0);
        yqg yqgVarA = sqVar.a();
        c8o.l(yqgVarA);
        mr mrVar = new mr(wve0VarG0, yqgVarA, (byte) 3);
        RetrofitMaker retrofitMakerN = sqVar.n();
        c8o.l(retrofitMakerN);
        fo70 fo70Var = (fo70) retrofitMakerN.createWebgateService(fo70.class, "android-accountswitching-switcherimpl");
        yqg yqgVarA2 = sqVar.a();
        c8o.l(yqgVarA2);
        xm41 xm41VarH0 = sqVar.H0();
        c8o.l(xm41VarH0);
        Observable map = eth.X(xm41VarH0).map(qr.X);
        xm41 xm41VarB0 = sqVar.B0();
        c8o.l(xm41VarB0);
        Observable map2 = eth.X(xm41VarB0).map(qr.t);
        Flowable flowableZ0 = sqVar.z0();
        c8o.l(flowableZ0);
        uh8 uh8VarI0 = sqVar.I0();
        c8o.l(uh8VarI0);
        wbd1 wbd1VarF0 = sqVar.F0();
        c8o.l(wbd1VarF0);
        t2j0 t2j0VarD0 = sqVar.D0();
        c8o.l(t2j0VarD0);
        g0l g0lVarX0 = sqVar.x0();
        c8o.l(g0lVarX0);
        Context context3 = sqVar.context();
        c8o.l(context3);
        vv vvVar = new vv(t2j0VarD0, g0lVarX0, context3);
        iq iqVar = (iq) ((jly0) orVar.c).get();
        tq tqVarC0 = sqVar.C0();
        q8n q8nVarD2 = sqVar.d();
        c8o.l(q8nVarD2);
        return new cs(mrVar, fo70Var, yqgVarA2, map, map2, flowableZ0, uh8VarI0, wbd1VarF0, vvVar, iqVar, tqVarC0, q8nVarD2);
    }
}
