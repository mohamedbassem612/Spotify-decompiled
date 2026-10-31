package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dj9 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sir b;
    public final /* synthetic */ xir c;

    public /* synthetic */ dj9(sir sirVar, xir xirVar, byte b) {
        this.a = b;
        this.b = sirVar;
        this.c = xirVar;
    }

    public final void accept(Object obj) {
        Object value;
        pir pirVar;
        Object value2;
        pir pirVar2;
        byte b = this.a;
        xir xirVar = this.c;
        sir sirVar = this.b;
        switch (b) {
            case 0:
                qi9 qi9Var = (qi9) obj;
                if (sirVar.b.isEnabled()) {
                    bpb1 bpb1Var = sirVar.c;
                    do {
                        value = bpb1Var.getValue();
                        pirVar = (pir) value;
                    } while (!bpb1Var.k(value, pir.a(pirVar, pirVar.b + 1, 0, 0, 0, 0, 0, 509)));
                }
                xirVar.e.onNext(new ie9(qi9Var.a, qi9Var.b, qi9Var.c));
                break;
            default:
                ti9 ti9Var = (ti9) obj;
                if (sirVar.b.isEnabled()) {
                    bpb1 bpb1Var2 = sirVar.c;
                    do {
                        value2 = bpb1Var2.getValue();
                        pirVar2 = (pir) value2;
                    } while (!bpb1Var2.k(value2, pir.a(pirVar2, 0, 0, pirVar2.d + 1, 0, 0, 0, 503)));
                }
                xirVar.e.onNext(new me9(ti9Var.a, ti9Var.b));
                break;
        }
    }
}
