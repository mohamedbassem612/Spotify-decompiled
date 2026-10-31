package p;

import android.app.Activity;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.observables.ConnectableObservable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q30 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q30(Object obj, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Observable observableH;
        Observable observableObserveOn;
        Observable observableFlatMapSingle;
        ConnectableObservable connectableObservableReplay;
        Observable observableH2;
        Observable observableObserveOn2;
        Observable observableFlatMapSingle2;
        ConnectableObservable connectableObservableReplay2;
        Observable observableH3;
        Observable observableObserveOn3;
        Observable observableFlatMapSingle3;
        ConnectableObservable connectableObservableReplay3;
        Observable observableH4;
        Observable observableObserveOn4;
        Observable observableFlatMapSingle4;
        ConnectableObservable connectableObservableReplay4;
        Observable observableH5;
        Observable observableObserveOn5;
        Observable observableFlatMapSingle5;
        ConnectableObservable connectableObservableReplay5;
        Observable observableH6;
        Observable observableObserveOn6;
        Observable observableFlatMapSingle6;
        ConnectableObservable connectableObservableReplay6;
        Observable observableH7;
        Observable observableObserveOn7;
        Observable observableFlatMapSingle7;
        ConnectableObservable connectableObservableReplay7;
        Observable observableH8;
        Observable observableObserveOn8;
        Observable observableFlatMapSingle8;
        ConnectableObservable connectableObservableReplay8;
        Observable observableH9;
        Observable observableObserveOn9;
        Observable observableFlatMapSingle9;
        ConnectableObservable connectableObservableReplay9;
        byte b = this.a;
        byte b2 = 3;
        rih1 rih1Var = rih1.a;
        byte b3 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (i40) ((r30) obj).N0.getValue();
            case 1:
                Activity activity = (Activity) obj;
                if (activity != null) {
                    activity.finishAffinity();
                }
                return rih1Var;
            case 2:
                return ((fq2) obj).j.a("martini");
            case 3:
                hu2 hu2Var = (hu2) obj;
                return ((cqe) hu2Var.b.get()).a(new g82(hu2Var, (byte) 3));
            case 4:
                String strA = ((gc3) obj).b.a();
                if (strA == null) {
                    strA = "";
                }
                return mno1.h(new mmr0[]{oqn1.n("cwp_autoplay_key", strA)});
            case 5:
                q54 q54Var = (q54) obj;
                tgp0 tgp0Var = q54Var.d;
                return (tgp0Var == null || (observableH = tgp0Var.h()) == null || (observableObserveOn = observableH.observeOn(Schedulers.c)) == null || (observableFlatMapSingle = observableObserveOn.flatMapSingle(new lan1(q54Var, (byte) 15))) == null || (connectableObservableReplay = observableFlatMapSingle.replay(1)) == null) ? Observable.never() : connectableObservableReplay.f();
            case 6:
                k84 k84Var = (k84) obj;
                luk lukVarA = k84.a(k84Var);
                if (lukVarA != null) {
                    return lukVarA.e(new c44(k84Var, b3));
                }
                return null;
            case 7:
                o84 o84Var = (o84) obj;
                tgp0 tgp0Var2 = o84Var.c;
                return (tgp0Var2 == null || (observableH2 = tgp0Var2.h()) == null || (observableObserveOn2 = observableH2.observeOn(Schedulers.c)) == null || (observableFlatMapSingle2 = observableObserveOn2.flatMapSingle(new e4b1(o84Var, (byte) 16))) == null || (connectableObservableReplay2 = observableFlatMapSingle2.replay(1)) == null) ? Observable.never() : connectableObservableReplay2.f();
            case 8:
                se4 se4Var = (se4) obj;
                luk lukVarA2 = se4.a(se4Var);
                if (lukVarA2 != null) {
                    return lukVarA2.e(new c44(se4Var, (byte) 2));
                }
                return null;
            case 9:
                ag4 ag4Var = (ag4) obj;
                luk lukVar = ag4Var.e;
                if (lukVar != null) {
                    return (ag4) lukVar.e(new if4(ag4Var, (byte) 13));
                }
                return null;
            case 10:
                eh4 eh4Var = (eh4) obj;
                tgp0 tgp0Var3 = eh4Var.l;
                return (tgp0Var3 == null || (observableH3 = tgp0Var3.h()) == null || (observableObserveOn3 = observableH3.observeOn(Schedulers.c)) == null || (observableFlatMapSingle3 = observableObserveOn3.flatMapSingle(new ymm0(eh4Var, (byte) 15))) == null || (connectableObservableReplay3 = observableFlatMapSingle3.replay(1)) == null) ? Observable.never() : connectableObservableReplay3.f();
            case 11:
                xj4 xj4Var = (xj4) obj;
                luk lukVar2 = xj4Var.c;
                if (lukVar2 != null) {
                    return (xj4) lukVar2.e(new c44(xj4Var, b2));
                }
                return null;
            case 12:
                ek4 ek4Var = (ek4) obj;
                tgp0 tgp0Var4 = ek4Var.i;
                return (tgp0Var4 == null || (observableH4 = tgp0Var4.h()) == null || (observableObserveOn4 = observableH4.observeOn(Schedulers.c)) == null || (observableFlatMapSingle4 = observableObserveOn4.flatMapSingle(new a42(ek4Var, (byte) 17))) == null || (connectableObservableReplay4 = observableFlatMapSingle4.replay(1)) == null) ? Observable.never() : connectableObservableReplay4.f();
            case 13:
                hk4 hk4Var = (hk4) obj;
                tgp0 tgp0Var5 = hk4Var.i;
                return (tgp0Var5 == null || (observableH5 = tgp0Var5.h()) == null || (observableObserveOn5 = observableH5.observeOn(Schedulers.c)) == null || (observableFlatMapSingle5 = observableObserveOn5.flatMapSingle(new w4b1(hk4Var, (byte) 20))) == null || (connectableObservableReplay5 = observableFlatMapSingle5.replay(1)) == null) ? Observable.never() : connectableObservableReplay5.f();
            case 14:
                jk4 jk4Var = (jk4) obj;
                tgp0 tgp0Var6 = jk4Var.b;
                return (tgp0Var6 == null || (observableH6 = tgp0Var6.h()) == null || (observableObserveOn6 = observableH6.observeOn(Schedulers.c)) == null || (observableFlatMapSingle6 = observableObserveOn6.flatMapSingle(new x5j1(jk4Var, (byte) 16))) == null || (connectableObservableReplay6 = observableFlatMapSingle6.replay(1)) == null) ? Observable.never() : connectableObservableReplay6.f();
            case 15:
                qm4 qm4Var = (qm4) obj;
                luk lukVarA3 = qm4.a(qm4Var);
                if (lukVarA3 != null) {
                    return lukVarA3.e(new c44(qm4Var, (byte) 4));
                }
                return null;
            case 16:
                qo4 qo4Var = (qo4) obj;
                luk lukVarA4 = qo4.a(qo4Var);
                if (lukVarA4 != null) {
                    return lukVarA4.e(new c44(qo4Var, (byte) 6));
                }
                return null;
            case 17:
                or4 or4Var = (or4) obj;
                luk lukVarA5 = or4.a(or4Var);
                if (lukVarA5 != null) {
                    return lukVarA5.e(new nr4(or4Var, (byte) 0));
                }
                return null;
            case 18:
                at4 at4Var = (at4) obj;
                tgp0 tgp0Var7 = at4Var.k;
                return (tgp0Var7 == null || (observableH7 = tgp0Var7.h()) == null || (observableObserveOn7 = observableH7.observeOn(Schedulers.c)) == null || (observableFlatMapSingle7 = observableObserveOn7.flatMapSingle(new a42(at4Var, (byte) 19))) == null || (connectableObservableReplay7 = observableFlatMapSingle7.replay(1)) == null) ? Observable.never() : connectableObservableReplay7.f();
            case 19:
                xw4 xw4Var = (xw4) obj;
                luk lukVarA6 = xw4.a(xw4Var);
                if (lukVarA6 != null) {
                    return lukVarA6.e(new ew4(xw4Var, (byte) 5));
                }
                return null;
            case 20:
                ax4 ax4Var = (ax4) obj;
                tgp0 tgp0Var8 = ax4Var.q;
                return (tgp0Var8 == null || (observableH8 = tgp0Var8.h()) == null || (observableObserveOn8 = observableH8.observeOn(Schedulers.c)) == null || (observableFlatMapSingle8 = observableObserveOn8.flatMapSingle(new t7o0(ax4Var, (byte) 19))) == null || (connectableObservableReplay8 = observableFlatMapSingle8.replay(1)) == null) ? Observable.never() : connectableObservableReplay8.f();
            case 21:
                n15 n15Var = (n15) obj;
                luk lukVar3 = n15Var.s;
                if (lukVar3 != null) {
                    return (n15) lukVar3.e(new c44(n15Var, (byte) 8));
                }
                return null;
            case 22:
                m26 m26Var = (m26) obj;
                tgp0 tgp0Var9 = m26Var.r;
                return (tgp0Var9 == null || (observableH9 = tgp0Var9.h()) == null || (observableObserveOn9 = observableH9.observeOn(Schedulers.c)) == null || (observableFlatMapSingle9 = observableObserveOn9.flatMapSingle(new j26(m26Var))) == null || (connectableObservableReplay9 = observableFlatMapSingle9.replay(1)) == null) ? Observable.never() : connectableObservableReplay9.f();
            case 23:
                svz0 svz0VarC = ((cj4) ((xg8) obj).e.d).c();
                svz0 svz0Var = svz0.d;
                return j0o1.r(mgx0.a(svz0VarC, ulc.k()));
            case 24:
                return ilo1.B(((yfb) obj).d, guo1.B());
            case 25:
                return (Set) ((ggb) obj).a.get();
            case 26:
                krw0 krw0Var = krw0.i;
                u7n0.w().f.d(((gjb) obj).i);
                return rih1Var;
            case 27:
                return ((qzn0) iwc.b((iwc) obj).get()).b();
            case 28:
                return h4p1.l(new wt((ypd) obj, (lnm) null, (byte) 22));
            default:
                km0.a((km0) obj).a.start();
                return rih1Var;
        }
    }
}
