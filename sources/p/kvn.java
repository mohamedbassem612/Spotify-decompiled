package p;

import android.app.Application;
import com.spotify.mobius.EventSource;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kvn {
    public final kly0 A;
    public final boolean B;
    public final opv0 C;
    public final o241 D;
    public final dvp E;
    public final fcq F;
    public final boolean G;
    public final qns0 H;
    public final zsc I;
    public final zs11 J;
    public final wf4 K;
    public final Application a;
    public final yuw b;
    public final fhv0 c;
    public final vfs d;
    public final a4v0 e;
    public final gw70 f;
    public final xfx g;
    public final jus h;
    public final yqg i;
    public final lzn0 j;
    public final Flowable k;
    public final y48 l;
    public final zwg m;
    public final ccq n;
    public final kly0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pp11 f9p;
    public final rpv0 q;
    public final quc0 r;
    public final af10 s;
    public final w6e0 t;
    public final q8n u;
    public final dcq v;
    public final ecq w;
    public final nbc x;
    public final xmu0 y;
    public final kly0 z;

    public kvn(Application application, yuw yuwVar, fhv0 fhv0Var, vfs vfsVar, a4v0 a4v0Var, gw70 gw70Var, xfx xfxVar, jus jusVar, yqg yqgVar, lzn0 lzn0Var, Flowable flowable, y48 y48Var, zwg zwgVar, ccq ccqVar, r7q r7qVar, pp11 pp11Var, rpv0 rpv0Var, quc0 quc0Var, af10 af10Var, w6e0 w6e0Var, q8n q8nVar, dcq dcqVar, ecq ecqVar, nbc nbcVar, xmu0 xmu0Var, r7q r7qVar2, r7q r7qVar3, boolean z, opv0 opv0Var, o241 o241Var, dvp dvpVar, fcq fcqVar, boolean z2, qns0 qns0Var, zsc zscVar, zs11 zs11Var, wf4 wf4Var) {
        this.a = application;
        this.b = yuwVar;
        this.c = fhv0Var;
        this.d = vfsVar;
        this.e = a4v0Var;
        this.f = gw70Var;
        this.g = xfxVar;
        this.h = jusVar;
        this.i = yqgVar;
        this.j = lzn0Var;
        this.k = flowable;
        this.l = y48Var;
        this.m = zwgVar;
        this.n = ccqVar;
        this.o = r7qVar;
        this.f9p = pp11Var;
        this.q = rpv0Var;
        this.r = quc0Var;
        this.s = af10Var;
        this.t = w6e0Var;
        this.u = q8nVar;
        this.v = dcqVar;
        this.w = ecqVar;
        this.x = nbcVar;
        this.y = xmu0Var;
        this.z = r7qVar2;
        this.A = r7qVar3;
        this.B = z;
        this.C = opv0Var;
        this.D = o241Var;
        this.E = dvpVar;
        this.F = fcqVar;
        this.G = z2;
        this.H = qns0Var;
        this.I = zscVar;
        this.J = zs11Var;
        this.K = wf4Var;
    }

    public final hvn a(cp11 cp11Var, iac0 iac0Var, sck1 sck1Var, vp11 vp11Var, fvn fvnVar, l8h1 l8h1Var, d0r d0rVar) {
        h2c1 h2c1Var = new h2c1(sck1Var);
        fn31.T(cto1.q(iac0Var), (o8n) null, 0, new hff(this, cp11Var, fvnVar, (lnm) null, (byte) 27), 3);
        k541 k541Var = new k541();
        int i = th10.a;
        h2c1Var.a(k541.class, j541.class, i541.class, k541Var, new ull((byte) 7));
        n6r0 n6r0Var = vp11Var.h;
        String str = cp11Var.a;
        op11 op11VarA = this.f9p.a(iac0Var.getLifecycle(), fvnVar.d, fvnVar.f, fvnVar.h);
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially runSequentially = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially();
        pq11 pq11Var = new pq11(op11VarA);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(dq11.class), runSequentially.a(pq11Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cq11.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new jq11(op11VarA)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(eq11.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new kq11(op11VarA)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(fq11.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new lq11(op11VarA)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(gq11.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious().a(new nq11(this.q)));
        q8n q8nVar = this.u;
        a aVar = new a(q8nVar, coroutinesSubtypeEffectHandlerBuilderI);
        h2c1Var.b(jwn.class, new eaz0(new rq11(op11VarA, q8nVar), (byte) 2));
        o3r o3rVar = tq11.a;
        FlowEventSources.Companion companion = FlowEventSources.a;
        o3r o3rVar2 = tq11.a;
        mr20[] mr20VarArr = {new cly0(d3p1.F(d0rVar, o3rVar2, str), (byte) 3)};
        companion.getClass();
        h2c1Var.b(jwn.class, new eaz0(new b(q8nVar, mr20VarArr), (byte) 3));
        i1r i1rVarN = x2p1.n(d0rVar, o3rVar2, str);
        i1r i1rVar = i1rVarN instanceof i1r ? i1rVarN : null;
        String str2 = i1rVar != null ? (String) i1rVar.a : null;
        if (str2 == null) {
            str2 = "";
        }
        h2c1Var.a(jwn.class, awn.class, hq11.class, new gwn(120, str, str2), new wgo(aVar));
        h2c1Var.b(pb31.class, new ed2((byte) 10));
        h2c1Var.b(jc91.class, ed2.g);
        String str3 = cp11Var.a;
        boolean z = fvnVar.a;
        ioc iocVar = fvnVar.c;
        boolean z2 = fvnVar.i;
        mr20 mr20Var = fvnVar.j;
        km90 km90Var = fvnVar.k;
        up11 up11Var = vp11Var.g;
        String strPath = n6r0Var.path();
        boolean z3 = fvnVar.n;
        kb31 kb31Var = new kb31("", !up11Var.equals(sp11.a), up11Var instanceof tp11 ? new qb31(((tp11) up11Var).a) : rb31.e);
        dq7 dq7Var = new dq7(km90Var, (byte) 24);
        zb91 zb91Var = new zb91(iocVar.b(), (byte) 9);
        zwg zwgVar = this.m;
        hjm0 hjm0Var = new hjm0(dq7Var, new bc31(str3, strPath, new r0x((uu00) zwgVar.a, (xrc0) zwgVar.b, (b7n) zwgVar.c, (o241) zwgVar.d, (wf4) zwgVar.e, z, zb91Var, iocVar, z2, mr20Var), z3 ? new x390(str3, ((mvn) this.o.get()).a, (byte) 29) : null, this.n, this.u, this.l));
        Flowable flowable = this.k;
        EventSource eventSourceA = RxEventSources.a(new ObservableSource[]{x0d.j(flowable, flowable).map(drm0.S0)});
        h2c1Var.a(pb31.class, jb31.class, ab31.class, kb31Var, hjm0Var);
        h2c1Var.b(pb31.class, new fe2(eventSourceA, (byte) 3));
        if (fvnVar.g) {
            ad2 ad2Var = new ad2();
            qns0 qns0Var = this.H;
            h2c1Var.a(ad2.class, wc2.class, rc2.class, ad2Var, new cd2(qns0Var));
            h2c1Var.b(jc91.class, ed2.b);
            h2c1Var.b(ad2.class, new ku1(new zc2(qns0Var), (byte) 1));
        }
        h2c1Var.a(jc91.class, fc91.class, rih1.class, ic91.a, new ull((byte) 2));
        h2c1Var.b(pb31.class, ed2.d);
        int i2 = vp11Var.j;
        if (i2 != 1) {
            boolean z4 = i2 == 4 || i2 == 3;
            h2c1Var.a(whx0.class, ahx0.class, kgx0.class, new whx0(b7x.a), new ull(fvnVar.e, this, n6r0Var));
            h2c1Var.b(jc91.class, new jvn(z4, str));
            if (z4) {
                h2c1Var.b(whx0.class, new fe2(RxEventSources.a(new ObservableSource[]{Observable.just(str).map(zhm0.R0)}), (byte) 2));
            }
        }
        return new hvn(h2c1Var, vp11Var, this, cp11Var, iac0Var, fvnVar, l8h1Var, d0rVar);
    }
}
