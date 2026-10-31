package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oc6 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tc6 b;

    public /* synthetic */ oc6(tc6 tc6Var, byte b) {
        this.a = b;
        this.b = tc6Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        tc6 tc6Var = this.b;
        switch (b) {
            case 0:
                beh behVar = (feh) obj;
                if ((behVar instanceof beh) && u890.j(behVar.a, "mft_disallow")) {
                    tc6Var.h.a(2131952463, new Object[0]);
                    break;
                }
                break;
            case 1:
                tc6Var.h(tc6Var.b.getString(2131955714));
                break;
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    tc6Var.e.c();
                }
                break;
            default:
                tc6Var.h(tc6Var.b.getString(2131955714));
                break;
        }
    }
}
