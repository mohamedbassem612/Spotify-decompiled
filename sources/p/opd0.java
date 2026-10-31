package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class opd0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ppd0 b;

    public /* synthetic */ opd0(ppd0 ppd0Var, byte b) {
        this.a = b;
        this.b = ppd0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ppd0 ppd0Var = this.b;
        switch (b) {
            case 0:
                ppd0Var.h.invoke((qpd0) obj);
                break;
            default:
                qpd0 qpd0Var = new qpd0(((Number) obj).longValue(), ppd0Var.i.b);
                ppd0Var.i = qpd0Var;
                ppd0Var.h.invoke(qpd0Var);
                break;
        }
    }
}
