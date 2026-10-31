package p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ghl implements r290 {
    public final yjq a;
    public final qut0 b;
    public final xrc0 c;
    public final me30 d;
    public final ip91 e;
    public final jo91 f;
    public final Flowable g;
    public final q8n h;

    public ghl(yjq yjqVar, qut0 qut0Var, xrc0 xrc0Var, me30 me30Var, ip91 ip91Var, jo91 jo91Var, Flowable flowable, q8n q8nVar) {
        this.a = yjqVar;
        this.b = qut0Var;
        this.c = xrc0Var;
        this.d = me30Var;
        this.e = ip91Var;
        this.f = jo91Var;
        this.g = flowable;
        this.h = q8nVar;
    }

    @Override // p.r290
    public final Single a(List list, String str, String str2, boolean z, int i, kio kioVar, gj3 gj3Var) {
        Single singleOnErrorReturn;
        String str3 = (String) o7h.q0(list);
        ((upp0) this.b.b.get()).getClass();
        if (upp0.b(str3)) {
            return rqt0.F(this.h, new fhl(this, list, str, str2, z, kioVar, gj3Var, (lnm) null, (byte) 0));
        }
        if (kioVar instanceof hio) {
            singleOnErrorReturn = Single.just(kioVar);
        } else {
            Set set = s4b1.f;
            v5b1 v5b1Var = uic.x(str2).d;
            b3i1 type = v5b1Var != null ? v5b1Var.getType() : null;
            if (u890.j(type, nyu0.e) || u890.j(type, wyu0.f)) {
                singleOnErrorReturn = rqt0.G(new cuk(this, str2, (lnm) null, (byte) 7)).map(new ps7(this, (byte) 27)).onErrorReturnItem(Boolean.FALSE).map(new zjp1(str2, (byte) 2)).onErrorReturn(o9p1.S0);
                singleOnErrorReturn.getClass();
            } else {
                singleOnErrorReturn = Single.just(kioVar);
            }
        }
        Flowable flowable = this.g;
        return new FlowableSingleSingle(ydh.f(flowable, flowable)).flatMapCompletable(new ehl(this, z)).e(singleOnErrorReturn.flatMap(new kl1(this, list, str, str2, z, gj3Var)));
    }

    @Override // p.r290
    public final Completable b(List list, String str, String str2, gj3 gj3Var) {
        return j2h1.D(this.h, new el0(this, list, str, str2, gj3Var, (lnm) null, (byte) 15));
    }
}
