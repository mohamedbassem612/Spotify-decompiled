package p;

import android.app.NotificationManager;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.functions.Action;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bm0 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bm0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                cm0 cm0Var = (cm0) this.c;
                mmr0 mmr0Var = (mmr0) this.b;
                l62 l62Var = (l62) mmr0Var.a;
                long jLongValue = ((Number) mmr0Var.b).longValue();
                tv80 tv80VarC = ((j62) cm0Var.h).c(l62Var.R0, l62Var.S0, l62Var.i, l62Var.V0);
                ao0.a((ao0) cm0Var.g, co0.Q0, l62Var.t, Long.valueOf(jLongValue), (String) null, (String) null, 120);
                ((a62) cm0Var.f).a(tv80VarC);
                break;
            case 1:
                im0 im0Var = (im0) this.c;
                mmr0 mmr0Var2 = (mmr0) this.b;
                l62 l62Var2 = (l62) mmr0Var2.a;
                long jLongValue2 = ((Number) mmr0Var2.b).longValue();
                tv80 tv80VarC2 = ((j62) im0Var.h).c(l62Var2.R0, l62Var2.S0, l62Var2.i, l62Var2.V0);
                ao0.a((ao0) im0Var.g, co0.Q0, l62Var2.t, Long.valueOf(jLongValue2), (String) null, (String) null, 120);
                ((a62) im0Var.f).a(tv80VarC2);
                break;
            case 2:
                ((lw0) this.c).c.e(((nw0) this.b).a);
                break;
            case 3:
                ((pw0) this.c).c.e(((nw0) this.b).a);
                break;
            case 4:
                ((qw0) this.c).c.f(((sw0) this.b).a);
                break;
            case 5:
                ((tw0) this.c).c.f(((sw0) this.b).a);
                break;
            case 6:
                ((u11) this.c).i.a(((ni8) this.b).a, true);
                break;
            case 7:
                Logger.b("SpotifyAlarmLauncherService stopping from cachePlaylistContextHandler", new Object[0]);
                z43 z43Var = (z43) this.c;
                nx2 nx2Var = (nx2) this.b;
                Logger.b("Stopping SpotifyAlarmLauncherService", new Object[0]);
                z43Var.f.g();
                nx2Var.invoke();
                break;
            case 8:
                ((lvc) ((x5j1) ((ajq0) this.c).e).b).f((slc0) this.b, "alexa", true, "", "", "");
                break;
            case 9:
                ((c77) this.c).b.b().b((String) this.b);
                break;
            case 10:
                ((Consumer) ((km3) this.c).c).accept((qvx0) this.b);
                break;
            case 11:
                inh0 inh0Var = (inh0) this.c;
                if (inh0Var != null) {
                    inh0Var.i.set(false);
                }
                ((ru7) this.b).Q0 = null;
                ((ru7) this.b).e();
                break;
            case 12:
                ((g0b) this.c).g.remove((List) this.b);
                break;
            case 13:
                Object systemService = ((Context) this.c).getSystemService("notification");
                NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
                if (notificationManager != null) {
                    notificationManager.cancel(2131430179);
                }
                ((BroadcastReceiver.PendingResult) this.b).finish();
                break;
            case 14:
                ima1 ima1Var = (dma1) this.c;
                yqg yqgVar = ((l5d) this.b).c;
                bma1 bma1Var = l5d.f;
                ima1 ima1Var2 = ima1Var;
                if (!ima1Var2.n(bma1Var)) {
                    yqgVar.b();
                    l1d.B(yqgVar, ima1Var2.edit(), bma1Var);
                }
                break;
            case 15:
                dma1 dma1Var = (dma1) this.c;
                bma1 bma1Var2 = (bma1) this.b;
                hma1 hma1VarEdit = dma1Var.edit();
                hma1VarEdit.a(bma1Var2, true);
                hma1VarEdit.g();
                break;
            case 16:
                bfe bfeVar = (bfe) this.c;
                yee yeeVar = (yee) this.b;
                yee yeeVar2 = bfe.X;
                bfeVar.g.onNext(yee.a(yeeVar, true));
                break;
            case 17:
                er91 er91Var = (er91) this.b;
                kt91 kt91Var = ((a4h) this.c).a;
                if (!kt91Var.g()) {
                    kt91Var.o(er91Var);
                } else {
                    kt91Var.k(er91Var);
                }
                break;
            case 18:
                ((pnr) this.c).h = (s1l) this.b;
                break;
            case 19:
                boolean zB = ((ian) this.c).b();
                nqr nqrVar = (nqr) this.b;
                if (!zB) {
                    mqr mqrVar = nqrVar.e;
                    if (mqrVar != null) {
                        mqrVar.a.invoke(can.a);
                    }
                } else {
                    b2c b2cVar = nqrVar.a;
                    kqr kqrVar = new kqr(nqrVar, (byte) 0);
                    lag lagVar = (lag) b2cVar.d;
                    ((LinearLayout) lagVar.b).animate().alpha(0.0f).setDuration(500L).setListener(new oqr(lagVar, kqrVar, (byte) 0));
                }
                break;
            case 20:
                ((iac0) this.c).getLifecycle().d((iau) this.b);
                break;
            case 21:
                ((Consumer) this.c).accept(this.b);
                break;
            case 22:
                ((Consumer) this.c).accept(new exw(((nxw) this.b).b()));
                break;
            case 23:
                ((m900) this.c).f.remove((mmr0) this.b);
                break;
            case 24:
                ((iu30) this.c).invoke((dc00) this.b);
                break;
            case 25:
                ((id31) ((uny) this.c).d).b(((pqd0) this.b).a);
                break;
            case 26:
                kt91 kt91Var2 = (kt91) ((kp00) this.c).b;
                Integer num = (Integer) this.b;
                n57.k(num.intValue() != 0, "Invalid resource ID provided: %s", new Object[]{num});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var2.k(new er91((fs91) null, "", num, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                break;
            case 27:
                BluetoothDevice bluetoothDevice = (BluetoothDevice) this.c;
                Logger.b("Go: Session ended for device: %s", new Object[]{bluetoothDevice.getAddress()});
                if (((w8l) ((gy40) this.b).a.a.remove(bluetoothDevice.getAddress())) == null) {
                    n57.e("Connection could not be removed because it is not present.");
                }
                break;
            case 28:
                gy40 gy40Var = (gy40) this.c;
                w8l w8lVar = (w8l) this.b;
                w8lVar.b = 4;
                gy40Var.g.onNext(w8lVar);
                break;
            default:
                ((u250) this.c).k1();
                ((pf30) this.b).a(rih1.a);
                break;
        }
    }
}
