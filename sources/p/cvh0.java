package p;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cvh0 extends hwh0 {
    public final /* synthetic */ Messenger a;
    public final /* synthetic */ int b;

    public cvh0(Messenger messenger, int i) {
        this.a = messenger;
        this.b = i;
    }

    public static void c(Messenger messenger, int i, int i2, Bundle bundle, Bundle bundle2) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = i2;
        messageObtain.arg2 = 0;
        messageObtain.obj = bundle;
        messageObtain.setData(bundle2);
        try {
            messenger.send(messageObtain);
        } catch (DeadObjectException | RemoteException unused) {
        }
    }

    public final void a(String str, Bundle bundle) {
        int i = fvh0.e;
        int i2 = this.b;
        Messenger messenger = this.a;
        if (str != null) {
            c(messenger, 4, i2, bundle, cy30.g("error", str));
        } else {
            c(messenger, 4, i2, bundle, null);
        }
    }

    public final void b(Bundle bundle) {
        int i = fvh0.e;
        c(this.a, 3, this.b, bundle, null);
    }
}
