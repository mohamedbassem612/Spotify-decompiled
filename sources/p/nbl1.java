package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nbl1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ obl1 b;

    public /* synthetic */ nbl1(obl1 obl1Var, byte b) {
        this.a = b;
        this.b = obl1Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        obl1 obl1Var = this.b;
        switch (b) {
            case 0:
                obl1Var.e.onNext((kcg1) obj);
                obl1Var.h.onNext(Boolean.TRUE);
                break;
            default:
                obl1Var.h.onNext(Boolean.FALSE);
                break;
        }
    }
}
