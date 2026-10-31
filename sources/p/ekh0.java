package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class ekh0 implements gkh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ie30 c;

    public /* synthetic */ ekh0(Context context, ie30 ie30Var, byte b) {
        this.a = b;
        this.b = context;
        this.c = ie30Var;
    }

    public final int b(Object obj) {
        byte b = this.a;
        ie30 ie30Var = this.c;
        Context context = this.b;
        bkh0 bkh0Var = (bkh0) obj;
        switch (b) {
            case 0:
                return bkh0Var.e(context, ie30Var) ? 1 : 0;
            default:
                String str = bkh0Var.b;
                return ((str.equals(ie30Var.f66p) || str.equals(hkh0.c(ie30Var))) && bkh0Var.c(context, ie30Var, false) && bkh0Var.d(ie30Var)) ? 1 : 0;
        }
    }
}
