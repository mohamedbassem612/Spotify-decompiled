package p;

import android.os.BadParcelableException;
import android.os.Bundle;
import androidx.car.app.model.Alert;
import androidx.media3.session.legacy.MediaBrowserCompat;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import androidx.media3.session.legacy.MediaSessionManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class qph0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tph0 b;
    public final /* synthetic */ MediaSessionManager.RemoteUserInfo c;
    public final /* synthetic */ MediaBrowserServiceCompat.Result d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ String f;

    public /* synthetic */ qph0(tph0 tph0Var, MediaSessionManager.RemoteUserInfo remoteUserInfo, MediaBrowserServiceCompat.Result result, Bundle bundle, String str) {
        this.a = (byte) 1;
        this.b = tph0Var;
        this.c = remoteUserInfo;
        this.d = result;
        this.e = bundle;
        this.f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iph0 iph0VarD;
        iph0 iph0Var = null;
        switch (this.a) {
            case 0:
                tph0 tph0Var = this.b;
                MediaSessionManager.RemoteUserInfo remoteUserInfo = this.c;
                MediaBrowserServiceCompat.Result result = this.d;
                String str = this.f;
                Bundle bundle = this.e;
                v1k v1kVar = tph0Var.c;
                ixh0 ixh0VarO = v1kVar.o(remoteUserInfo);
                if (ixh0VarO == null) {
                    result.sendError(null);
                    return;
                }
                if (!v1kVar.x(ixh0VarO, new pa61(str, Bundle.EMPTY))) {
                    result.sendError(null);
                    return;
                }
                iqh0 iqh0Var = tph0Var.d;
                s8d0 s8d0VarB = iqh0Var.e.a.b(iqh0Var.A(ixh0VarO).a.getPackageName(), str, bundle);
                s8d0VarB.b(new ag20(s8d0VarB, result, (byte) 18), l5u.a);
                return;
            case 1:
                l5u l5uVar = l5u.a;
                tph0 tph0Var2 = this.b;
                MediaSessionManager.RemoteUserInfo remoteUserInfo2 = this.c;
                MediaBrowserServiceCompat.Result result2 = this.d;
                Bundle bundle2 = this.e;
                String str2 = this.f;
                iqh0 iqh0Var2 = tph0Var2.d;
                v1k v1kVar2 = tph0Var2.c;
                ixh0 ixh0VarO2 = v1kVar2.o(remoteUserInfo2);
                if (ixh0VarO2 == null) {
                    result2.sendResult(null);
                    return;
                }
                if (!v1kVar2.w(ixh0VarO2, 50003)) {
                    result2.sendResult(null);
                    return;
                }
                byte b = 1;
                if (bundle2 != null) {
                    bundle2.setClassLoader(iqh0Var2.f.getClassLoader());
                    try {
                        int i = bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE);
                        int i2 = bundle2.getInt(MediaBrowserCompat.EXTRA_PAGE_SIZE);
                        iph0VarD = yzb0.d(iqh0Var2.f, bundle2);
                        if (i >= 0 && i2 > 0) {
                            try {
                                em61 em61VarM0 = zoi1.m0(tph0Var2.d.F(ixh0VarO2, str2, i, i2, iph0VarD), new nph0(tph0Var2, b));
                                em61VarM0.b(new mph0(em61VarM0, result2, (byte) 0), l5uVar);
                                return;
                            } catch (BadParcelableException unused) {
                                iph0Var = iph0VarD;
                            }
                        }
                    } catch (BadParcelableException unused2) {
                    }
                } else {
                    iph0VarD = iph0Var;
                }
                em61 em61VarM1 = zoi1.m0(tph0Var2.d.F(ixh0VarO2, str2, 0, Alert.DURATION_SHOW_INDEFINITELY, iph0VarD), new nph0(tph0Var2, b));
                em61VarM1.b(new mph0(em61VarM1, result2, (byte) 0), l5uVar);
                return;
            default:
                tph0 tph0Var3 = this.b;
                MediaSessionManager.RemoteUserInfo remoteUserInfo3 = this.c;
                MediaBrowserServiceCompat.Result result3 = this.d;
                String str3 = this.f;
                Bundle bundle3 = this.e;
                ixh0 ixh0VarO3 = tph0Var3.c.o(remoteUserInfo3);
                if (ixh0VarO3 == null) {
                    result3.sendResult(null);
                    return;
                }
                if (!(ixh0VarO3.e instanceof rph0)) {
                    result3.sendResult(null);
                    return;
                }
                if (!tph0Var3.c.w(ixh0VarO3, 50005)) {
                    result3.sendResult(null);
                    return;
                }
                hxh0 hxh0Var = ixh0VarO3.e;
                hxh0Var.getClass();
                rph0 rph0Var = (rph0) hxh0Var;
                synchronized (rph0Var.a) {
                    rph0Var.c.add(new sph0(ixh0VarO3, ixh0VarO3.a, str3, bundle3, result3));
                    break;
                }
                tph0Var3.d.J(ixh0VarO3, str3, yzb0.d(tph0Var3.d.f, bundle3));
                String str4 = zoi1.a;
                return;
        }
    }

    public /* synthetic */ qph0(tph0 tph0Var, MediaSessionManager.RemoteUserInfo remoteUserInfo, MediaBrowserServiceCompat.Result result, String str, Bundle bundle, byte b) {
        this.a = b;
        this.b = tph0Var;
        this.c = remoteUserInfo;
        this.d = result;
        this.f = str;
        this.e = bundle;
    }
}
