package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t3q implements yn91 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ t3q(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final bo91 a(ujm ujmVar, Observable observable) {
        byte b = this.a;
        r7q r7qVar = this.b;
        switch (b) {
            case 0:
                thq thqVar = (thq) r7qVar;
                v5q v5qVar = (v5q) thqVar.c;
                hn91 hn91Var = (hn91) v5qVar.y9.get();
                daq daqVar = thqVar.b;
                return new bo91(ujmVar, observable, hn91Var, (ip91) daqVar.g8.get(), (jo91) daqVar.r7.get(), (xrc0) daqVar.f5.get(), (iyc0) daqVar.g5.get(), (b7r0) daqVar.p7.get(), (yqg) daqVar.J1.get(), (Scheduler) daqVar.z1.get(), new q7j0((agc0) v5qVar.b.B7.get()));
            default:
                r7q r7qVar2 = r7qVar;
                teq teqVar = r7qVar2.d;
                hn91 hn91Var2 = (hn91) teqVar.W6.get();
                daq daqVar2 = r7qVar2.b;
                return new bo91(ujmVar, observable, hn91Var2, (ip91) daqVar2.g8.get(), (jo91) daqVar2.r7.get(), (xrc0) teqVar.e1.get(), (iyc0) teqVar.g1.get(), (b7r0) daqVar2.p7.get(), (yqg) daqVar2.J1.get(), (Scheduler) daqVar2.z1.get(), daqVar2.a2());
        }
    }
}
