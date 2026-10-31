package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cjg implements kly0 {
    public final /* synthetic */ byte a;
    public final kly0 b;

    public /* synthetic */ cjg(kly0 kly0Var, byte b) {
        this.a = b;
        this.b = kly0Var;
    }

    public final Object get() {
        byte b = this.a;
        kly0 kly0Var = this.b;
        switch (b) {
            case 0:
                return (String) ((spq0) kly0Var.get()).h();
            default:
                return new vm41(((Integer) acq0.a.get()).intValue(), (Context) kly0Var.get(), "com.google.android.datatransport.events");
        }
    }
}
