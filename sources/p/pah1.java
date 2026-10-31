package p;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pah1 extends ResultReceiver {
    public final /* synthetic */ rah1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pah1(rah1 rah1Var, Handler handler) {
        super(handler);
        this.a = rah1Var;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        if (i == -1) {
            rah1 rah1Var = this.a;
            rah1Var.o.a(ixb.c);
            ResultReceiver resultReceiver = rah1Var.a.b;
            if (resultReceiver != null) {
                resultReceiver.send(-1, null);
            }
        }
    }
}
