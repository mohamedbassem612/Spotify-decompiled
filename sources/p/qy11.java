package p;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.wear.remote.interactions.RemoteActivityHelper$RemoteIntentException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class qy11 extends ResultReceiver {
    public final mzc a;
    public int b;
    public int c;

    public qy11(mzc mzcVar, int i) {
        super(null);
        this.a = mzcVar;
        this.b = i;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        int i2 = this.b - 1;
        this.b = i2;
        if (i != 0) {
            this.c++;
        }
        if (i2 > 0) {
            return;
        }
        int i3 = this.c;
        mzc mzcVar = this.a;
        if (i3 == 0) {
            mzcVar.b((Object) null);
        } else {
            mzcVar.c(new RemoteActivityHelper$RemoteIntentException("There was an error while starting remote activity."));
        }
    }
}
