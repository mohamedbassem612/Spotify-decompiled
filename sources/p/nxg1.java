package p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nxg1 extends jro {
    public m2d b;
    public m2d c;
    public final hwb d;
    public final /* synthetic */ oxg1 e;

    public nxg1(oxg1 oxg1Var, hwb hwbVar) {
        this.e = oxg1Var;
        this.d = hwbVar;
    }

    @Override // p.jro
    public final void a(asn asnVar) {
        m2d m2dVar;
        m2d m2dVar2;
        oxg1 oxg1Var = this.e;
        PackageManager packageManager = ((NoAnimLauncherActivity) oxg1Var.c).getPackageManager();
        String str = (String) oxg1Var.d;
        if (!(!s9g.a.contains(str) ? true : s9g.a(packageManager, str, 368300000))) {
            try {
                ((og70) ((qg70) asnVar.b)).Z0();
            } catch (RemoteException unused) {
            }
        }
        try {
            wzn wznVarL = asnVar.l(this.d, PendingIntent.getActivity((Context) asnVar.a, 96375, new Intent(), 67108864));
            oxg1Var.f = wznVarL;
            if (wznVarL != null && (m2dVar2 = this.b) != null) {
                m2dVar2.run();
            } else if (wznVarL == null && (m2dVar = this.c) != null) {
                m2dVar.run();
            }
        } catch (RuntimeException unused2) {
            this.c.run();
        }
        this.b = null;
        this.c = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.e.f = null;
    }
}
