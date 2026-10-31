package p;

import com.spotify.voiceassistants.playermodels.PlayIntent;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class r4h1 implements Function {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public r4h1(b7n b7nVar, jed0 jed0Var, Flowable flowable, vcd0 vcd0Var, yqg yqgVar) {
        this.a = b7nVar;
        this.b = jed0Var;
        this.c = flowable;
        this.d = vcd0Var;
        this.e = yqgVar;
        this.f = gio1.b(Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(onm onmVar) {
        fpm1 fpm1Var;
        if (onmVar instanceof fpm1) {
            fpm1Var = (fpm1) onmVar;
            int i = fpm1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                fpm1Var.c = i - Integer.MIN_VALUE;
            } else {
                fpm1Var = new fpm1(this, onmVar);
            }
        } else {
            fpm1Var = new fpm1(this, onmVar);
        }
        Object objG = fpm1Var.a;
        int i2 = fpm1Var.c;
        if (i2 == 0) {
            hm5.M(objG);
            mdd0 mdd0Var = (vcd0) this.d;
            fpm1Var.c = 1;
            objG = mdd0Var.g(fpm1Var);
            d9n d9nVar = d9n.a;
            if (objG == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objG);
        }
        tcd0 tcd0Var = (tcd0) objG;
        byte b = 10;
        if (tcd0Var == null) {
            return new huz(zom1.a, b);
        }
        return new huz(new xom1(tcd0Var.d, tcd0Var.a, tcd0Var.b, tcd0Var.c), b);
    }

    public Object apply(Object obj) {
        String str = (String) obj;
        tp7 tp7Var = (tp7) this.a;
        PlayIntent playIntent = (PlayIntent) this.b;
        m210 m210Var = (m210) this.c;
        String str2 = (String) this.d;
        zle1 zle1Var = (zle1) this.e;
        t45 t45Var = (t45) this.f;
        return tp7Var.e(m210Var, t45Var).map(new vi11(t45Var, playIntent, tp7Var, m210Var, (Object) null, (byte) 25)).observeOn((Scheduler) tp7Var.d).flatMapCompletable(new ikj1(tp7Var, playIntent, str2, str, zle1Var, t45Var));
    }

    public mr20 b() {
        jge jgeVarE = hu20.e(new uji1(((b7n) this.a).a(r6n.a), (byte) 11), new cpm1((lnm) null, this, (byte) 0));
        Flowable flowable = (Flowable) this.c;
        vbm[] vbmVarArr = q601.a;
        return rqt0.u(new x010(jgeVarE, hu20.e(rqt0.w(new kge(flowable), gbm1.Y0, rqt0.b), new y3s((lnm) null, this, (byte) 12)), new ap51(3, null, (byte) 14), (byte) 1));
    }

    public /* synthetic */ r4h1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
    }
}
