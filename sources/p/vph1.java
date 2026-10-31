package p;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vph1 extends ResultReceiver {
    public final /* synthetic */ wph1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vph1(wph1 wph1Var, Handler handler) {
        super(handler);
        this.a = wph1Var;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        jrr0 jrr0VarC;
        if (i != -1 || (jrr0VarC = i7w0.c(bundle)) == null) {
            return;
        }
        this.a.e(iko1.t(jrr0VarC));
    }
}
