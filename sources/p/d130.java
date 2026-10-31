package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class d130 implements epc0 {
    public final cik1 a;

    public d130(cik1 cik1Var, c130 c130Var) {
        this.a = cik1Var;
    }

    public final Object invoke(Object obj) {
        voc0 voc0Var = (voc0) obj;
        mml mmlVar = voc0Var.d;
        if (!(mmlVar instanceof iml)) {
            n57.e("Can not load a folder without proper Container");
            Observable observableJust = Observable.just(new svc0(14, new a7x()));
            observableJust.getClass();
            return observableJust;
        }
        tr80 tr80Var = voc0Var.c;
        dia1 dia1Var = voc0Var.e;
        List list = voc0Var.g;
        List list2 = voc0Var.i;
        int i = ((rr80) tr80Var).a;
        return this.a.o(new p7c0(i, (((rr80) tr80Var).b + 1) - i, voc0Var.b, false, false, dia1Var, false, false, false, (iml) mmlVar, list, list2, false, 4120));
    }
}
