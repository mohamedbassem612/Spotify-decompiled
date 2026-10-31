package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.runners.MainThreadWorkRunner;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class e201 implements d101 {
    public final m201 a;
    public final frd1 b;
    public final String c;
    public final l201 d;
    public final phi0 e;
    public final f201 f;

    public e201(pmq pmqVar, qmq qmqVar, rmq rmqVar, m201 m201Var, sxz0 sxz0Var, frd1 frd1Var, String str, a601 a601Var, l201 l201Var) {
        phi0 phi0Var;
        o101 o101Var;
        k201 k201Var;
        this.a = m201Var;
        this.b = frd1Var;
        this.c = str;
        this.d = l201Var;
        List listE = sxz0Var.e();
        switch (qmqVar.a) {
            case 0:
                f0a f0aVar = (f0a) qmqVar.b.c;
                yqg yqgVar = (yqg) ((e101) f0aVar.c).a.get();
                c8o.l(yqgVar);
                xjh xjhVar = (xjh) ((e101) f0aVar.c).c.get();
                c8o.l(xjhVar);
                i8h1 i8h1Var = (i8h1) ((e401) f0aVar.b).i.get();
                c8o.l(i8h1Var);
                pux0 pux0Var = new pux0(i8h1Var);
                g4q g4qVar = (g4q) ((e101) f0aVar.c).b.get();
                c8o.l(g4qVar);
                phi0Var = new phi0(yqgVar, xjhVar, pux0Var, g4qVar, listE);
                break;
            default:
                uw0 uw0Var = (uw0) qmqVar.b.c;
                yqg yqgVar2 = (yqg) ((v001) uw0Var.d).a.get();
                c8o.l(yqgVar2);
                xjh xjhVar2 = (xjh) ((v001) uw0Var.d).d.get();
                c8o.l(xjhVar2);
                pux0 pux0VarH = uw0Var.H();
                g4q g4qVar2 = (g4q) ((v001) uw0Var.d).b.get();
                c8o.l(g4qVar2);
                phi0Var = new phi0(yqgVar2, xjhVar2, pux0VarH, g4qVar2, listE);
                break;
        }
        this.e = phi0Var;
        switch (rmqVar.a) {
            case 0:
                f0a f0aVar2 = (f0a) rmqVar.b.c;
                Scheduler scheduler = (Scheduler) ((e101) f0aVar2.c).d.get();
                c8o.l(scheduler);
                smq smqVar = (smq) ((jly0) f0aVar2.Y).get();
                lzn0 lzn0Var = (lzn0) ((e101) f0aVar2.c).e.get();
                c8o.l(lzn0Var);
                f5b f5bVar = new f5b(lzn0Var, (byte) 12);
                tmq tmqVar = (tmq) ((jly0) f0aVar2.Z).get();
                e401 e401Var = (e401) f0aVar2.b;
                jjz jjzVar = (jjz) e401Var.c.get();
                c8o.l(jjzVar);
                x981 x981Var = new x981(jjzVar, ((Boolean) e401Var.f.get()).booleanValue(), (byte) 2);
                p501 p501Var = (p501) e401Var.h.get();
                c8o.l(p501Var);
                o101Var = new o101(scheduler, smqVar, f5bVar, tmqVar, x981Var, p501Var, sxz0Var, frd1Var, str, a601Var);
                break;
            default:
                uw0 uw0Var2 = (uw0) rmqVar.b.c;
                Scheduler scheduler2 = (Scheduler) ((v001) uw0Var2.d).j.get();
                c8o.l(scheduler2);
                smq smqVar2 = (smq) ((jly0) uw0Var2.c).get();
                v001 v001Var = (v001) uw0Var2.d;
                lzn0 lzn0Var2 = (lzn0) v001Var.k.get();
                c8o.l(lzn0Var2);
                f5b f5bVar2 = new f5b(lzn0Var2, (byte) 12);
                tmq tmqVar2 = (tmq) ((jly0) uw0Var2.Y).get();
                jjz jjzVar2 = (jjz) v001Var.g.get();
                c8o.l(jjzVar2);
                x981 x981Var2 = new x981(jjzVar2, ((Boolean) v001Var.i.get()).booleanValue(), (byte) 2);
                p501 p501Var2 = (p501) v001Var.n.get();
                c8o.l(p501Var2);
                o101Var = new o101(scheduler2, smqVar2, f5bVar2, tmqVar2, x981Var2, p501Var2, sxz0Var, frd1Var, str, a601Var);
                break;
        }
        switch (pmqVar.a) {
            case 0:
                f0a f0aVar3 = (f0a) pmqVar.b.c;
                Scheduler scheduler3 = (Scheduler) ((e401) f0aVar3.b).b.get();
                c8o.l(scheduler3);
                Observable observable = (Observable) ((e101) f0aVar3.c).g.get();
                c8o.l(observable);
                k201Var = new k201(scheduler3, new a201(observable), l201Var, o101Var);
                break;
            default:
                uw0 uw0Var3 = (uw0) pmqVar.b.c;
                Scheduler scheduler4 = (Scheduler) ((v001) uw0Var3.d).e.get();
                c8o.l(scheduler4);
                Observable observable2 = (Observable) ((v001) uw0Var3.d).p.get();
                c8o.l(observable2);
                k201Var = new k201(scheduler4, new a201(observable2), l201Var, o101Var);
                break;
        }
        this.f = k201Var;
    }

    public final void a(b0k b0kVar, int i) {
        zd1 zd1Var;
        ak1 ak1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1616582994);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                k201 k201Var = (k201) this.f;
                o101 o101Var = (o101) k201Var.d;
                o101Var.getClass();
                RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
                subtypeEffectHandlerBuilderC.a(f101.class, new ruz0(o101Var, (byte) 1));
                smq smqVar = o101Var.b;
                sxz0 sxz0Var = o101Var.g;
                frd1 frd1Var = o101Var.h;
                String str = o101Var.i;
                switch (smqVar.a) {
                    case 0:
                        zd1Var = new zd1(sxz0Var, frd1Var, str, (byte) 7);
                        break;
                    default:
                        zd1Var = new zd1(sxz0Var, frd1Var, str, (byte) 7);
                        break;
                }
                subtypeEffectHandlerBuilderC.g(g101.class, zd1Var);
                subtypeEffectHandlerBuilderC.d(h101.class, o101Var.c, o101Var.a);
                subtypeEffectHandlerBuilderC.a(i101.class, new ruz0(o101Var.f, (byte) 2));
                switch (o101Var.d.a) {
                    case 0:
                        ak1Var = new ak1(sxz0Var, frd1Var, (byte) 2);
                        break;
                    default:
                        ak1Var = new ak1(sxz0Var, frd1Var, (byte) 2);
                        break;
                }
                subtypeEffectHandlerBuilderC.g(j101.class, ak1Var);
                subtypeEffectHandlerBuilderC.g(l101.class, o101Var.e);
                objT = Mobius.b(Mobius.d(h201.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).h(RxEventSources.a(new ObservableSource[]{k201Var.b.a.map(njx0.d)})).d(new i201(k201Var)).b(new j201(k201Var)), k201Var.c, g201.a, MainThreadWorkRunner.a());
                x340Var.s0(objT);
            }
            MobiusLoop.Controller controller = (MobiusLoop.Controller) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(this.d);
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = mgo1.e(0, 0, 0, 7);
                x340Var.s0(objT3);
            }
            sen0 sen0Var = (sen0) objT3;
            boolean zI = x340Var.i(controller) | x340Var.i(sen0Var);
            Object objT4 = x340Var.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new c201(controller, sen0Var, ven0Var, null);
                x340Var.s0(objT4);
            }
            rih1 rih1Var = rih1.a;
            qxd0.t(rih1Var, x340Var, (vu30) objT4);
            boolean zI2 = x340Var.i(controller) | x340Var.i(this);
            Object objT5 = x340Var.T();
            if (zI2 || objT5 == m4cVar) {
                objT5 = new d201(controller, this);
                x340Var.s0(objT5);
            }
            qxd0.i(rih1Var, (iu30) objT5, x340Var);
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar) {
                objT6 = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT6);
            }
            c9n c9nVar = (c9n) objT6;
            l201 l201Var = (l201) ven0Var.getValue();
            boolean zI3 = x340Var.i(c9nVar) | x340Var.i(sen0Var);
            Object objT7 = x340Var.T();
            if (zI3 || objT7 == m4cVar) {
                objT7 = new j3y0(c9nVar, sen0Var, (byte) 18);
                x340Var.s0(objT7);
            }
            this.e.e(l201Var, (iu30) objT7, x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ziz0(this, i, (byte) 6);
        }
    }
}
