package p;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class df11 implements IBinder.DeathRecipient {
    public final Messenger a;
    public final kv5 b;
    public final Messenger c;
    public int f;
    public int g;
    public final /* synthetic */ if11 i;
    public int d = 1;
    public int e = 1;
    public final SparseArray h = new SparseArray();

    public df11(if11 if11Var, Messenger messenger) {
        this.i = if11Var;
        this.a = messenger;
        kv5 kv5Var = new kv5(this);
        this.b = kv5Var;
        this.c = new Messenger((Handler) kv5Var);
    }

    public final void a(int i) {
        int i2 = this.d;
        this.d = i2 + 1;
        b(5, i2, i, null, null);
    }

    public final boolean b(int i, int i2, int i3, Object obj, Bundle bundle) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.arg1 = i2;
        messageObtain.arg2 = i3;
        messageObtain.obj = obj;
        messageObtain.setData(bundle);
        messageObtain.replyTo = this.c;
        try {
            this.a.send(messageObtain);
            return true;
        } catch (DeadObjectException | RemoteException unused) {
            return false;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.i.t.post(new cf11(this, (byte) 1));
    }

    public final void c(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.d;
        this.d = i3 + 1;
        b(7, i3, i, null, bundle);
    }

    public final void d(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.d;
        this.d = i3 + 1;
        b(8, i3, i, null, bundle);
    }
}
