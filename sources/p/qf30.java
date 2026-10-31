package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class qf30 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zf30 b;
    public final /* synthetic */ Bundle c;

    public /* synthetic */ qf30(zf30 zf30Var, Bundle bundle, byte b) {
        this.a = b;
        this.b = zf30Var;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Bundle bundle = this.c;
        zf30 zf30Var = this.b;
        switch (b) {
            case 0:
                zf30Var.I0(zf30Var.j1, bundle);
                break;
            case 1:
                zf30Var.F0(bundle);
                break;
            case 2:
                zf30Var.w0(bundle);
                break;
            default:
                zf30Var.J0(bundle);
                break;
        }
    }
}
