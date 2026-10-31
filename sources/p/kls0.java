package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.mobius.coroutines.MobiusCoroutines;
import com.spotify.mobius.coroutines.a;
import io.reactivex.rxjava3.core.Flowable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kls0 implements xpw, cvl1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public kls0(jl41 jl41Var, wl41 wl41Var, q8n q8nVar, q8n q8nVar2) {
        this.a = (byte) 5;
        this.b = q8nVar;
        this.c = q8nVar2;
        ej41 ej41Var = ej41.c;
        t7p0 t7p0Var = t7p0.x;
        CoroutinesSubtypeEffectHandlerBuilder coroutinesSubtypeEffectHandlerBuilderI = kk0.i(MobiusCoroutines.a);
        CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious cancelPrevious = new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.CancelPrevious();
        gl41 gl41Var = new gl41(jl41Var);
        jd11 jd11Var = rc11.a;
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(zk41.class), cancelPrevious.a(gl41Var));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(al41.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new dl41(jl41Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(bl41.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new il41(jl41Var)));
        coroutinesSubtypeEffectHandlerBuilderI.a(jd11Var.b(cl41.class), new CoroutinesSubtypeEffectHandlerBuilder.ExecutionPolicy.RunSequentially().a(new el41(jl41Var)));
        this.d = sbl.C(ej41Var, t7p0Var, new a(jl41Var.h, coroutinesSubtypeEffectHandlerBuilderI), jh31.X, new hf31(wl41Var, this, (byte) 16));
        this.e = n3o1.q(this).a(vs31.O0, vs31.P0);
        j2i j2iVar = mej.a;
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                return n3o1.q(this).a(new jls0(this, (byte) 0), new jls0(this, (byte) 1));
            case 1:
                return (ia00) obj2;
            case 2:
                return (ia00) obj2;
            case 3:
                return (eih1) this.d;
            case 4:
                return (ia00) obj2;
            case 5:
                return (ia00) obj2;
            case 6:
                return (hy00) obj2;
            case 7:
                return (hy00) obj;
            case 8:
                return (ia00) obj2;
            case 9:
                return (ia00) obj2;
            case 10:
                return (ia00) obj2;
            case 11:
                return (ia00) obj2;
            default:
                return (ia00) obj;
        }
    }

    public final jsw c() {
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                j2i j2iVar = b7j.a;
                ien0 ien0Var = qsw.a;
                return new psw(j2iVar, (byte) 0);
            case 1:
                return (psw) obj2;
            case 2:
                return (psw) obj2;
            case 3:
                return (psw) obj2;
            case 4:
                return (psw) obj2;
            case 5:
                return (psw) obj2;
            case 6:
                return (psw) obj2;
            case 7:
                return (psw) obj;
            case 8:
                return (psw) obj2;
            case 9:
                return (f70) obj2;
            case 10:
                return (psw) obj2;
            case 11:
                return (psw) obj2;
            default:
                return (psw) obj;
        }
    }

    public void e(m9m m9mVar, br01 br01Var) {
        ((dp5) this.b).g(new ls01(m9mVar, br01Var));
    }

    public final mqw getBehavior() {
        byte b = this.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                return x3p1.n(new hls0(this, (byte) 0), new hls0(this, (byte) 1), w0q0.a1, (o8n) null, new hls0(this, (byte) 2), 8);
            case 1:
                return (rey0) obj;
            case 2:
                return (js20) obj;
            case 3:
                return (rey0) this.e;
            case 4:
                return (rey0) obj;
            case 5:
                return (e7m0) obj;
            case 6:
                return (rey0) obj;
            case 7:
                return (rey0) obj;
            case 8:
                return (rey0) obj;
            case 9:
                return (rey0) obj;
            case 10:
                return (rey0) obj;
            case 11:
                return (rey0) obj;
            default:
                return (poy0) obj;
        }
    }

    public kls0(jpg0 jpg0Var, cgf1 cgf1Var) {
        this.a = (byte) 11;
        this.b = jpg0Var;
        this.c = cgf1Var;
        this.d = new rey0(new e9f1(this, (byte) 1));
        this.e = n3o1.q(this).a(kle1.R0, kle1.S0);
        j2i j2iVar = new j2i(-1394482452, new y2f1(this, (byte) 7), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public kls0(Function0 function0, Function0 function1) {
        this.a = (byte) 1;
        this.b = function0;
        this.c = function1;
        this.d = k1o1.p();
        this.e = n3o1.q(this).a(new x3o0(this, (byte) 22), f2s0.T0);
        j2i j2iVar = new j2i(-455454292, new t9r0(this, (byte) 15), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public kls0(lzn0 lzn0Var, o241 o241Var) {
        this.a = (byte) 2;
        this.b = lzn0Var;
        this.c = o241Var;
        this.d = x3p1.n(new dfv0(this, (byte) 0), o5v0.a1, new xgr0(this, (byte) 12), (o8n) null, new dfv0(this, (byte) 1), 8);
        this.e = n3o1.q(this).a(gou0.S0, gou0.T0);
        j2i j2iVar = c9j.a;
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public kls0(xh71 xh71Var, byp bypVar) {
        this.a = (byte) 8;
        this.b = xh71Var;
        this.c = bypVar;
        this.d = new rey0(new u451(this, (byte) 19));
        this.e = n3o1.q(this).a(vy61.N0, vy61.O0);
        j2i j2iVar = ahj.b;
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public kls0(dp5 dp5Var, bw8 bw8Var) {
        this.a = (byte) 4;
        this.b = dp5Var;
        this.c = bw8Var;
        this.d = new rey0(new f2z0(this, (byte) 21));
        this.e = n3o1.q(this).a(kxz0.b1, kxz0.c1);
        j2i j2iVar = new j2i(1502876865, new dr01(this, (byte) 1), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public kls0(Context context, z710 z710Var) {
        this.a = (byte) 10;
        this.b = z710Var;
        this.c = context.getString(2131963149);
        this.d = new rey0(new bxb1(this, (byte) 20));
        this.e = n3o1.q(this).a(i6d1.O0, new nsb1(this, (byte) 12));
        j2i j2iVar = tmj.c;
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public kls0(lzn0 lzn0Var, n6r0 n6r0Var) {
        this.a = (byte) 6;
        this.b = lzn0Var;
        this.c = n6r0Var;
        this.d = new rey0(new u451(this, (byte) 6));
        this.e = n3o1.r(this).c(new z821(this, (byte) 16), v451.N0);
        j2i j2iVar = pfj.b;
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public kls0(String str, lzn0 lzn0Var, ktv ktvVar) {
        this.a = (byte) 7;
        this.b = lzn0Var;
        this.c = ktv.d(str);
        this.d = new rey0(new u451(this, (byte) 15));
        j2i j2iVar = kgj.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
        this.f = n3o1.r(this).c(vp51.Y0, new z821(this, (byte) 28));
    }

    public kls0(String str, f2g1 f2g1Var) {
        this.a = (byte) 3;
        this.b = str;
        this.c = f2g1Var;
        this.d = new eih1();
        this.e = new rey0(new dvt0(this, (byte) 27));
        j2i j2iVar = kaj.b;
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public kls0(fg60 fg60Var, sgd0 sgd0Var, l6m0 l6m0Var, q8n q8nVar) {
        this.a = (byte) 0;
        this.b = fg60Var;
        this.c = sgd0Var;
        this.d = l6m0Var;
        this.e = us71.h(q8nVar);
        this.f = gio1.b(Boolean.FALSE);
    }

    public kls0(Flowable flowable, cv4 cv4Var) {
        this.a = (byte) 12;
        this.b = flowable;
        this.c = cv4Var;
        this.d = d4o1.f(new xaj1(this, (byte) 17), new yvf1(this, (byte) 9), new c1j1(this, (byte) 7), jmj1.S0, 8);
        j2i j2iVar = new j2i(-1982940409, new xyh(this, (byte) 28), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
        this.f = n3o1.q(this).a(k3j1.X0, k3j1.Y0);
    }

    public kls0(lzn0 lzn0Var, bzl0 bzl0Var) {
        this.a = (byte) 9;
        this.b = lzn0Var;
        this.c = bzl0Var;
        this.d = new rey0(new bxb1(this, (byte) 9));
        this.e = n3o1.q(this).a(new nsb1(this, (byte) 4), m1c1.i);
        this.f = new f70((byte) 15);
    }
}
