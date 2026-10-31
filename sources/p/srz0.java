package p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class srz0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ trz0 b;

    public /* synthetic */ srz0(trz0 trz0Var, byte b) {
        this.a = b;
        this.b = trz0Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        trz0 trz0Var = this.b;
        switch (b) {
            case 0:
                zq4 zq4Var = trz0Var.b;
                ((Throwable) obj).getMessage();
                zq4Var.a();
                break;
            case 1:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                zq4 zq4Var2 = trz0Var.b;
                if (!zBooleanValue) {
                    zq4Var2.a();
                } else {
                    zq4Var2.a();
                }
                break;
            default:
                zq4 zq4Var3 = trz0Var.b;
                ((Throwable) obj).getMessage();
                zq4Var3.a();
                break;
        }
    }
}
