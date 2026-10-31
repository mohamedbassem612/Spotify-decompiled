package p;

import android.app.NotificationManager;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.spotify.collection.offlinesyncnotification.BulkRedownloadCancelReceiver;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.share.resultactivity.api.ShareResultActivity;
import com.spotify.widget.widget.WidgetPickerService;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jzp implements sq, dl4 {
    public final /* synthetic */ byte a;
    public final daq b;

    public /* synthetic */ jzp(daq daqVar, byte b) {
        this.a = b;
        this.b = daqVar;
    }

    public nfa0 A0() {
        return (nfa0) this.b.b2.get();
    }

    public xm41 B0() {
        return (xm41) this.b.W4.get();
    }

    public tq C0() {
        return s2.l(new x34(false, false, (luk) this.b.L1.get()));
    }

    public t2j0 D0() {
        return (t2j0) this.b.f2.get();
    }

    public boolean E0() {
        return gyo1.O(new x34(false, false, (luk) this.b.L1.get()));
    }

    public wbd1 F0() {
        return (wbd1) this.b.lj.get();
    }

    public wve0 G0() {
        return (wve0) this.b.w4.get();
    }

    public xm41 H0() {
        return (xm41) this.b.V4.get();
    }

    public uh8 I0() {
        return (uh8) this.b.zf.get();
    }

    public yqg a() {
        return (yqg) this.b.J1.get();
    }

    public Context context() {
        return (Context) this.b.x1.a;
    }

    public q8n d() {
        return (q8n) this.b.E1.get();
    }

    public RetrofitMaker n() {
        return (RetrofitMaker) this.b.Y3.get();
    }

    @Override // p.dl4
    public void w(Object obj) {
        byte b = this.a;
        daq daqVar = this.b;
        switch (b) {
            case 1:
                w361.o((BulkRedownloadCancelReceiver) obj, (vpp0) daqVar.C8.get());
                break;
            case 2:
                n1p1.m((ShareResultActivity) obj, hh61.n((wpq) daqVar.Ud.get()));
                break;
            default:
                WidgetPickerService widgetPickerService = (WidgetPickerService) obj;
                rqg0.A(widgetPickerService, new k3i0((Context) daqVar.x1.a, (xs80) daqVar.b3.get(), (NotificationManager) daqVar.m3.get()));
                Context context = (Context) daqVar.x1.a;
                AppWidgetManager appWidgetManagerV = yah0.v((Context) daqVar.x1.a);
                Scheduler scheduler = (Scheduler) daqVar.r3.get();
                qpj1 qpj1Var = new qpj1((i8h1) daqVar.A5.get());
                Context context2 = (Context) daqVar.x1.a;
                rqg0.B(widgetPickerService, new ghk1(new rx5(context, appWidgetManagerV, scheduler, qpj1Var, new wpt(context2), new uxy0(context2, yah0.v((Context) daqVar.x1.a), (byte) 11)), (byte) 3));
                break;
        }
    }

    public g0l x0() {
        return (g0l) this.b.E5.get();
    }

    public Flowable z0() {
        return (Flowable) this.b.z2.get();
    }
}
