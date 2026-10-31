package p;

import android.view.View;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f1w implements f4h1 {
    public final a2w a;
    public final gdx0 b;
    public final dg30 c;
    public final myv d;
    public final q0w e;
    public MobiusLoop.Controller f;

    public f1w(a2w a2wVar, gdx0 gdx0Var, dg30 dg30Var, myv myvVar, q0w q0wVar) {
        this.a = a2wVar;
        this.b = gdx0Var;
        this.c = dg30Var;
        this.d = myvVar;
        this.e = q0wVar;
    }

    public final Object getView() {
        return this.a.i;
    }

    public final void start() {
        nk80 nk80VarI;
        myv myvVar = this.d;
        String str = myvVar.a;
        String str2 = myvVar.b;
        String str3 = myvVar.c;
        String str4 = myvVar.d;
        boolean z = myvVar.e;
        int i = myvVar.f;
        String str5 = myvVar.g;
        String str6 = myvVar.h;
        th4 th4Var = this.b.a;
        boolean zE = th4Var.e();
        boolean zD = th4Var.d();
        boolean zF = th4Var.f();
        boolean zS = th4Var.s();
        boolean z2 = myvVar.j;
        lrz0 lrz0Var = myvVar.k;
        Boolean bool = myvVar.i;
        s0w s0wVar = new s0w(str, str2, str3, false, false, false, str4, null, null, null, z, i, false, new xb41(), str5, false, str6, false, zE, zD, zF, zS, z2, lrz0Var, bool != null ? bool.booleanValue() : false, th4Var.c(), myvVar.m, myvVar.l);
        q0w q0wVar = this.e;
        Scheduler scheduler = q0wVar.a;
        lls0 lls0Var = q0wVar.d;
        otu otuVar = q0wVar.e;
        st60 st60Var = q0wVar.g;
        vb41 vb41Var = q0wVar.h;
        r0w r0wVar = q0wVar.i;
        kh0 kh0Var = q0wVar.j;
        lzn0 lzn0Var = q0wVar.k;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(bzv.class, new kzv(scheduler, r0wVar, lls0Var));
        a2w a2wVar = this.a;
        subtypeEffectHandlerBuilderC.d(qyv.class, new qg7(r0wVar, st60Var, a2wVar, (byte) 8), scheduler);
        subtypeEffectHandlerBuilderC.c(xyv.class, new ezv(vb41Var, (byte) 1));
        subtypeEffectHandlerBuilderC.c(oyv.class, new ezv(vb41Var, (byte) 0));
        subtypeEffectHandlerBuilderC.g(zyv.class, new kzv(scheduler, lls0Var, r0wVar, (byte) 1));
        subtypeEffectHandlerBuilderC.d(azv.class, new f5b(lzn0Var, (byte) 3), scheduler);
        subtypeEffectHandlerBuilderC.g(pyv.class, new fzv(otuVar, (byte) 0));
        subtypeEffectHandlerBuilderC.d(wyv.class, new izv(otuVar, (byte) 0), scheduler);
        subtypeEffectHandlerBuilderC.g(yyv.class, new kzv(scheduler, lls0Var, r0wVar, (byte) 0));
        dg30 dg30Var = this.c;
        subtypeEffectHandlerBuilderC.d(tyv.class, new hzv(dg30Var, (byte) 0), scheduler);
        subtypeEffectHandlerBuilderC.c(uyv.class, new cfs(kh0Var, (byte) 16));
        subtypeEffectHandlerBuilderC.d(czv.class, new hzv(dg30Var, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.d(vyv.class, new f5b(lzn0Var, (byte) 2), scheduler);
        subtypeEffectHandlerBuilderC.d(syv.class, new gzv(r0wVar, lzn0Var, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.d(dzv.class, new qg7(r0wVar, dg30Var, lls0Var, (byte) 9), scheduler);
        subtypeEffectHandlerBuilderC.d(ryv.class, new gzv(r0wVar, lzn0Var, (byte) 0), scheduler);
        MobiusLoop.Builder builderD = Mobius.d(n0w.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
        m0w m0wVar = q0wVar.f;
        MobiusLoop.Controller controllerC = Mobius.c(l1d.g(builderD.h(RxEventSources.a(new ObservableSource[]{((Observable) vb41Var.o.getValue()).map(p9w.a1), Observable.defer(new yj1(m0wVar, (byte) 6)).subscribeOn(m0wVar.a)})).b(new o0w(q0wVar)).d(new p0w(q0wVar))), s0wVar, MainThreadWorkRunner.a());
        this.f = controllerC;
        controllerC.c(a2wVar);
        if (!controllerC.isRunning()) {
            controllerC.start();
        }
        View view = a2wVar.i;
        WeakHashMap weakHashMap = b8k1.a;
        hsl1 hsl1VarA = s7k1.a(view);
        view.setPadding(view.getPaddingLeft(), (hsl1VarA == null || (nk80VarI = hsl1VarA.a.i(519)) == null) ? 0 : nk80VarI.b, view.getPaddingRight(), view.getPaddingBottom());
    }

    public final void stop() {
        MobiusLoop.Controller controller = this.f;
        if (controller != null) {
            controller.stop();
            controller.disconnect();
        }
    }
}
