package p;

import android.os.Build;
import com.spotify.cosmos.fireandforgetresolver.FireAndForgetResolver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wo5 implements jlq0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public wo5(n4f0 n4f0Var, cue0 cue0Var) {
        this.a = (byte) 9;
        this.c = n4f0Var;
        this.b = cue0Var;
    }

    public final void c() {
        byte b = this.a;
        lnm lnmVar = null;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((n4f0) obj2).b(new f85(this, (byte) 20));
                break;
            case 1:
                fn31.T(smo1.e((q8n) obj), (o8n) null, 0, new kk(this, lnmVar, (byte) 14), 3);
                break;
            case 2:
                ((n4f0) obj2).b(new lwe(this, (byte) 17));
                break;
            case 3:
                ((n4f0) obj2).b(new lwe(this, (byte) 19));
                break;
            case 4:
                ((r241) obj2).b.g();
                ((FireAndForgetResolver) obj).dispose();
                break;
            case 5:
                ((FireAndForgetResolver) obj).reset();
                hma1 hma1VarEdit = ((jqb1) obj2).a.edit();
                bma1 bma1Var = jqb1.d;
                fqb1 fqb1Var = iqb1.a;
                hma1VarEdit.b(bma1Var, 0);
                hma1VarEdit.b(jqb1.c, 0);
                hma1VarEdit.g();
                break;
            case 6:
                ((n4f0) obj2).b(new pdp0(this, (byte) 21));
                break;
            case 7:
                if (Build.VERSION.SDK_INT < 34) {
                    iyb0 iyb0Var = new iyb0(this, (lnm) null, (byte) 26);
                    fn31.T(ov40.a, (q8n) obj2, 0, iyb0Var, 2);
                }
                break;
            case 8:
                ((n4f0) obj2).b(new vwz0(this, (byte) 7));
                break;
            case 9:
                ((n4f0) obj2).b(new vwz0(this, (byte) 13));
                break;
            case 10:
                ((y2g0) obj2).b("RemoteControlClientShutdownOperation", new vwz0(this, (byte) 25));
                break;
            default:
                ((n4f0) obj2).b(new l451(this, (byte) 0));
                break;
        }
    }

    public final String getName() {
        switch (this.a) {
            case 0:
                return "AppLanguageCacheShutdownOperation";
            case 1:
                return "AppWidgetManagerPrepareOperation";
            case 2:
                return "ClearConsumedGroupsShutdownOperation";
            case 3:
                return "ClearWebViewCookiesShutdownOperation";
            case 4:
                return "CoreDependentInfraIntegrationShutdownOperation";
            case 5:
                return "CoreDependentInfraIntegrationStartupOperation";
            case 6:
                return "OnLogoutDeviceSortingDataCleanerShutdownOperation";
            case 7:
                return "OutputSwitcherServiceDisablerOperation";
            case 8:
                return "RecentLocationsCleanUpShutdownOperation";
            case 9:
                return "RecordLoggedOutAccountShutdownOperation";
            case 10:
                return "RemoteControlClientShutdownOperation";
            default:
                return "SearchHistoryCleanUpShutdownOperation";
        }
    }

    public /* synthetic */ wo5(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
