package p;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.interapp.service.service.AppProtocolRemoteService;
import com.spotify.messages.AppRemoteAuthentication;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class jv5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jv5(Object obj, boolean z, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.Context, com.spotify.interapp.service.service.AppProtocolRemoteService] */
    @Override // java.lang.Runnable
    public final void run() {
        xig xigVar;
        ApplicationInfo applicationInfo;
        qoj1 qoj1Var;
        switch (this.a) {
            case 0:
                ?? r0 = (AppProtocolRemoteService) this.c;
                boolean z = this.b;
                aos aosVar = (aos) this.d;
                int i = AppProtocolRemoteService.f1;
                if (!z || (xigVar = r0.c1) == null) {
                    r0.e1.post(new iv5(r0, aosVar, (byte) 2));
                    return;
                }
                PackageManager packageManager = r0.getPackageManager();
                try {
                    applicationInfo = packageManager.getApplicationInfo(xigVar.a, 0);
                    break;
                } catch (PackageManager.NameNotFoundException unused) {
                    applicationInfo = null;
                }
                String str = (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : r0.getString(2131952370));
                Logger.g("%s is connecting", new Object[]{str});
                xig xigVar2 = r0.c1;
                gw5 gw5VarN = AppRemoteAuthentication.n();
                m210 m210Var = aosVar.f.z;
                if (m210Var == null) {
                    m210Var = oh61.D;
                }
                String str2 = m210Var.b;
                t2j0 t2j0Var = r0.X0;
                gw5VarN.r(xigVar2.a);
                gw5VarN.n(xigVar2.b);
                gw5VarN.q(str2);
                t2j0Var.a(gw5VarN.build());
                r0.Q0.a.m((Object) null, str == null ? "unknown" : str);
                r0.f.g("com.spotify.interapp.service.service.AppProtocolRemoteService", r0.getString(2131952369, str));
                return;
            default:
                roj1 roj1Var = (roj1) this.c;
                boolean z2 = this.b;
                qoj1 qoj1Var2 = (qoj1) this.d;
                try {
                    synchronized (roj1Var.e) {
                        try {
                            if (!roj1Var.g || !z2) {
                                while (true) {
                                    synchronized (roj1Var.e) {
                                        qoj1Var = (qoj1) roj1Var.f.poll();
                                        break;
                                    }
                                    if (qoj1Var == null) {
                                        qoj1Var2.run();
                                    } else {
                                        qoj1Var.run();
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Exception e) {
                    roj1Var.b(e);
                    return;
                }
        }
    }
}
