package p;

import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fro extends jro {
    public final /* synthetic */ Context b;

    public fro(Context context) {
        this.b = context;
    }

    @Override // p.jro
    public final void a(asn asnVar) {
        try {
            ((og70) ((qg70) asnVar.b)).Z0();
        } catch (RemoteException unused) {
        }
        this.b.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
