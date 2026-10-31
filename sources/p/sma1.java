package p;

import android.app.Activity;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxMobius;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sma1 implements wpw {
    public final /* synthetic */ byte a;
    public final rqw b;
    public final nsw c;
    public final Object d;
    public final Object e;
    public final mqw f;

    public sma1(hyy0 hyy0Var, dpq dpqVar, ecd1 ecd1Var, gpq gpqVar, p801 p801Var, m801 m801Var) {
        this.a = (byte) 1;
        this.d = dpqVar;
        this.e = ecd1Var;
        ccg1 ccg1Var = new ccg1("", "", z6x.a, 1, tcd1.a, false, false, 0, 0, 0, true, false, false, false, true);
        gp71 gp71Var = gp71.q;
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(obg1.class, nm3.O0);
        o801 o801Var = new o801(p801Var, (byte) 0);
        Scheduler scheduler = p801Var.b;
        subtypeEffectHandlerBuilderC.d(qbg1.class, o801Var, scheduler);
        subtypeEffectHandlerBuilderC.d(pbg1.class, new o801(p801Var, (byte) 1), scheduler);
        subtypeEffectHandlerBuilderC.c(sbg1.class, new o801(p801Var, (byte) 2));
        subtypeEffectHandlerBuilderC.c(rbg1.class, new lyw0(m801Var, (byte) 13));
        this.f = sbl.z(ccg1Var, gp71Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()), new rvd1(this, (byte) 17), new rzf1(m801Var, this, (byte) 4));
        this.b = hyy0Var != null ? n3o1.q(this).a(new g001(hyy0Var, (byte) 3), kxz0.P0) : new eih1();
        this.c = jch0.j(new juy0(this, gpqVar, (byte) 13));
    }

    public static ccg1 e(ccg1 ccg1Var, dbg1 dbg1Var) {
        List list = ccg1Var.c;
        ArrayList arrayList = dbg1Var.d;
        boolean zJ = u890.j(list, arrayList);
        return ccg1.a(ccg1Var, dbg1Var.a, dbg1Var.b, arrayList, dbg1Var.h, dbg1Var.i, false, false, 0, 0, 0, false, false, false, !zJ ? false : ccg1Var.n, dbg1Var.g, 8160);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.b;
    }

    public final rsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.c;
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return this.f;
    }

    public sma1(yfx yfxVar, u63 u63Var) {
        this.a = (byte) 2;
        this.d = yfxVar;
        this.e = u63Var;
        this.f = ila0.D();
        this.b = n3o1.q(this).a(k3j1.O0, k3j1.P0);
        this.c = jch0.j(new zyf1(this, (byte) 19));
    }

    public sma1(v7l1 v7l1Var, Activity activity) {
        this.a = (byte) 3;
        this.d = v7l1Var;
        this.e = activity;
        this.f = ila0.D();
        this.b = new eih1();
        this.c = jch0.j(new zyf1(this, (byte) 26));
    }

    public sma1(jpg0 jpg0Var, rma1 rma1Var) {
        this.a = (byte) 0;
        this.d = jpg0Var;
        this.e = rma1Var;
        this.f = jpg0Var.getBehavior();
        this.b = jpg0Var.a();
        this.c = jch0.j(new cq61(this, (byte) 27));
    }
}
