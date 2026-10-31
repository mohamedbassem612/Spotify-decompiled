package p;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ufl1 implements ServiceConnection {
    public final /* synthetic */ ffl1 a;

    public ufl1(ffl1 ffl1Var) {
        this.a = ffl1Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ffl1 ffl1Var = this.a;
        if (ffl1.a(ffl1Var) == null) {
            ffl1.b(ffl1Var, new Messenger((Handler) ffl1Var.g()));
        }
        new vfl1(ffl1Var, ffl1.c(ffl1Var), ffl1.d(ffl1Var), ffl1.a(ffl1Var)).execute(fk70.s(iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.f(4);
    }
}
