package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mbs0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qbs0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ mbs0(qbs0 qbs0Var, String str, byte b) {
        this.a = b;
        this.b = qbs0Var;
        this.c = str;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        String str = this.c;
        qbs0 qbs0Var = this.b;
        switch (b) {
            case 0:
                int iOrdinal = ((u1q0) obj).ordinal();
                if (iOrdinal == 0) {
                    qbs0Var.Z0().U(new s300(str));
                } else if (iOrdinal == 1) {
                    qbs0Var.Z0().U(new i000(str, (Throwable) null));
                } else if (iOrdinal != 2) {
                    eg.o();
                } else {
                    qbs0Var.Z0().U(new i000(str, (Throwable) new IllegalStateException("onBeforeStartPayment returned a failure")));
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                n57.g("Failed when invoking onBeforeStartPayment callback", th);
                qbs0Var.Z0().U(new i000(str, th));
                break;
        }
    }
}
