package p;

import android.app.Activity;
import com.spotify.fandomcollectibles.protos.LottieStory;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class o8c1 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8c1(lnm lnmVar, tmj1 tmj1Var, qxc0 qxc0Var, cly0 cly0Var, ptf1 ptf1Var, String str, rzq rzqVar) {
        super(3, lnmVar);
        this.e = tmj1Var;
        this.f = qxc0Var;
        this.g = cly0Var;
        this.h = ptf1Var;
        this.i = str;
        this.t = rzqVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.t;
        switch (b) {
            case 0:
                o8c1 o8c1Var = new o8c1((LottieStory) obj4, (lnm) obj3);
                o8c1Var.i = (f8c1) obj2;
                return o8c1Var.invokeSuspend(rih1Var);
            default:
                o8c1 o8c1Var2 = new o8c1((lnm) obj3, (tmj1) this.e, (qxc0) this.f, (cly0) this.g, (ptf1) this.h, (String) this.i, (rzq) obj4);
                o8c1Var2.c = (vr20) obj;
                o8c1Var2.d = obj2;
                return o8c1Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        zda nroVar;
        vk41[] vk41VarArr;
        Object objR;
        vk41[] vk41VarArr2;
        zda[] zdaVarArr;
        zda[] zdaVarArr2;
        sk41 sk41Var;
        byte b = this.a;
        Object obj2 = this.t;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                LottieStory lottieStory = (LottieStory) obj2;
                f8c1 f8c1Var = (f8c1) this.i;
                boolean z = this.b;
                if (z) {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zdaVarArr = (zda[]) this.g;
                    sk41Var = (sk41) this.h;
                    vk41VarArr = (vk41[]) ((Object[]) this.e);
                    zdaVarArr2 = (zda[]) this.f;
                    vk41VarArr2 = (vk41[]) ((Object[]) this.d);
                    zda zdaVar = (zda) this.c;
                    hm5.M(obj);
                    nroVar = zdaVar;
                    objR = obj;
                    zdaVarArr[0] = new gdf0(new yge0((fcf0) objR, Collections.singletonList(new kdf0()), (byte) 5), 1, z6x.a);
                    sk41Var.getClass();
                    vk41VarArr[0] = sk41.a(zdaVarArr2);
                    vk41VarArr2[1] = new vk41(f46.Q0(new zda[]{nroVar}));
                    return p7h.M(vk41VarArr2);
                }
                hm5.M(obj);
                gpr0 gpr0VarY = who1.y(jon1.p(2132018010, f8c1Var.a), lottieStory.q().o(), lottieStory.q().p());
                nroVar = f8c1Var.i.a ? new nro(gpr0VarY, lottieStory.n().s(), (byte) 0) : new esb1(gpr0VarY);
                vk41VarArr = new vk41[2];
                zda[] zdaVarArr3 = new zda[1];
                String strP = lottieStory.p();
                Activity activity = f8c1Var.a;
                this.i = null;
                this.c = nroVar;
                this.d = vk41VarArr;
                this.f = zdaVarArr3;
                this.e = vk41VarArr;
                sk41 sk41Var2 = sk41.a;
                this.h = sk41Var2;
                this.g = zdaVarArr3;
                this.b = true;
                ohd ohdVar = new ohd(1, aym.t(this));
                ohdVar.t();
                if (ihc1.y0(strP)) {
                    eg.m("Can't load a Lottie composition from a null or blank string");
                    return null;
                }
                jdf0 jdf0Var = new jdf0(ohdVar, (byte) 7);
                jdf0 jdf0Var2 = new jdf0(ohdVar, (byte) 6);
                qdf0 qdf0VarG = kcf0.g(activity, strP, strP);
                qdf0VarG.b(jdf0Var);
                qdf0VarG.a(jdf0Var2);
                ohdVar.n(new ny51(qdf0VarG, jdf0Var, jdf0Var2, (byte) 25));
                objR = ohdVar.r();
                if (objR == d9nVar) {
                    return d9nVar;
                }
                vk41VarArr2 = vk41VarArr;
                zdaVarArr = zdaVarArr3;
                zdaVarArr2 = zdaVarArr;
                sk41Var = sk41Var2;
                zdaVarArr[0] = new gdf0(new yge0((fcf0) objR, Collections.singletonList(new kdf0()), (byte) 5), 1, z6x.a);
                sk41Var.getClass();
                vk41VarArr[0] = sk41.a(zdaVarArr2);
                vk41VarArr2[1] = new vk41(f46.Q0(new zda[]{nroVar}));
                return p7h.M(vk41VarArr2);
            default:
                String str = (String) this.i;
                ptf1 ptf1Var = (ptf1) this.h;
                qxc0 qxc0Var = (qxc0) this.f;
                tmj1 tmj1Var = (tmj1) this.e;
                vr20 vr20Var = (vr20) this.c;
                Object obj3 = this.d;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    Map map = (Map) obj3;
                    boolean z3 = cua.f(map) && qxc0Var.X0;
                    huz x010Var = (z3 || tmj1Var.e(map, qxc0Var)) ? new x010((cly0) this.g, rqt0.u(new cly0(d3p1.F((d0r) ptf1Var.b, mlj1.a, str), (byte) 19)), new smj1(tmj1Var, str, (rzq) obj2, (qxc0) this.f, ptf1Var, z3, (lnm) null), (byte) 1) : new huz((Object) null, (byte) 10);
                    this.c = null;
                    this.d = null;
                    this.b = true;
                    if (l4p1.s(vr20Var, x010Var, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8c1(LottieStory lottieStory, lnm lnmVar) {
        super(3, lnmVar);
        this.t = lottieStory;
    }
}
