package p;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.player.model.ContextTrack;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableFilter;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tp7 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public tp7(Context context, vq6 vq6Var, po7 po7Var, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.c = vq6Var;
        this.k = po7Var;
        this.j = audioDeviceInfo;
        Handler handlerS = zoi1.s((Handler.Callback) null);
        this.d = handlerS;
        this.e = new rp7(this);
        this.f = new jlb(this, (byte) 3);
        bg11 bg11Var = qp7.e;
        String str = Build.MANUFACTURER;
        Uri uriFor = (str.equals("Amazon") || str.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.g = uriFor != null ? new sp7(this, handlerS, applicationContext.getContentResolver(), uriFor) : null;
    }

    public static /* synthetic */ AudioDeviceInfo a(tp7 tp7Var) {
        return (AudioDeviceInfo) tp7Var.j;
    }

    public static void c(tp7 tp7Var) {
        List listG = tp7Var.g();
        Context context = (Context) tp7Var.b;
        po7 po7Var = (po7) tp7Var.k;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) tp7Var.j;
        bg11 bg11Var = qp7.e;
        tp7Var.h(qp7.b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), po7Var, audioDeviceInfo, listG));
    }

    public static final /* synthetic */ bqb1 d(tp7 tp7Var) {
        return (bqb1) tp7Var.c;
    }

    public Single e(m210 m210Var, t45 t45Var) {
        Observable observableDoOnSubscribe = ((Observable) this.b).doOnSubscribe(new zna1(t45Var, (byte) 5));
        emk1 emk1Var = emk1.b;
        return observableDoOnSubscribe.map(new sjb((byte) 29)).take(1L).single("local_device").timeout(100L, TimeUnit.MILLISECONDS, (Scheduler) this.e, Single.just("local_device")).map(new zrj1(t45Var, m210Var, this, (byte) 9)).observeOn((Scheduler) this.d);
    }

    public Observable f(String str, String str2, t45 t45Var, String str3) {
        Flowable flowableX = ((Flowable) this.c).w(new zna1(t45Var, (byte) 3)).X(s9x0.W0);
        flowableX.getClass();
        return new ObservableFromPublisher(flowableX.t(Functions.a)).doOnNext(new zna1(t45Var, (byte) 4)).onErrorResumeNext(new e821(t45Var, str, str2, str3, this));
    }

    public List g() {
        pna1 pna1Var;
        if (Build.VERSION.SDK_INT >= 32 && (pna1Var = (pna1) this.h) != null) {
            return pna1Var.b();
        }
        w280 w280Var = b380.b;
        return bg11.e;
    }

    public void h(qp7 qp7Var) {
        if (!this.a || qp7Var.equals((qp7) this.i)) {
            return;
        }
        this.i = qp7Var;
        r58 r58Var = (r58) ((vq6) this.c).b;
        r58Var.f();
        qp7 qp7Var2 = r58Var.g;
        if (qp7Var2 == null || qp7Var.equals(qp7Var2)) {
            return;
        }
        r58Var.g = qp7Var;
        h9d0 h9d0Var = r58Var.e;
        if (h9d0Var != null) {
            h9d0Var.h(-1, new q58((byte) 0));
        }
    }

    public void i() {
        imx0 imx0Var = (imx0) this.h;
        imx0Var.c();
        ContextTrack contextTrack = (ContextTrack) this.k;
        if (contextTrack != null && this.a && ((gh4) this.f).k() && ((cbv) this.i).a(contextTrack)) {
            imx0Var.d(contextTrack.uri(), (ViewGroup) this.b, (View) this.c, (View) this.d);
        }
    }

    public tp7(Context context, bqb1 bqb1Var, ptt pttVar, g44 g44Var, Scheduler scheduler, x8c0 x8c0Var, Observable observable, Handler handler) {
        this.b = context;
        this.c = bqb1Var;
        this.e = pttVar;
        this.f = scheduler;
        this.g = x8c0Var;
        this.h = observable;
        this.d = handler;
        this.i = new rku();
        this.a = g44Var.a();
        this.k = new rpb1(this);
    }

    public tp7(Observable observable, boolean z, Flowable flowable, Scheduler scheduler, Scheduler scheduler2, lxh1 lxh1Var, r2a1 r2a1Var, g2j1 g2j1Var, bge0 bge0Var, a77 a77Var, vna1 vna1Var) {
        this.b = observable;
        this.a = z;
        this.c = flowable;
        this.d = scheduler;
        this.e = scheduler2;
        this.f = lxh1Var;
        this.g = bge0Var;
        this.h = a77Var;
        this.i = vna1Var;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.j = atomicBoolean;
        this.k = new aoa1((qna1) r2a1Var.b, (bmk1) g2j1Var.invoke(bge0Var, a77Var, atomicBoolean), (Scheduler) r2a1Var.c, new dn81(5, 100L, 3), new dn81(5, 100L, 3));
    }

    public tp7(ViewGroup viewGroup, View view, View view2, FlowableFilter flowableFilter, gh4 gh4Var, q8n q8nVar, imx0 imx0Var, cbv cbvVar) {
        this.b = viewGroup;
        this.c = view;
        this.d = view2;
        this.e = flowableFilter;
        this.f = gh4Var;
        this.g = q8nVar;
        this.h = imx0Var;
        this.i = cbvVar;
    }

    public tp7(pt ptVar, jly0 jly0Var, uym0 uym0Var, owp owpVar, d0r d0rVar, boolean z, v1k v1kVar, gkd gkdVar, iac0 iac0Var, sn4 sn4Var, et90 et90Var) {
        this.b = ptVar;
        this.c = jly0Var;
        this.d = uym0Var;
        this.e = owpVar;
        this.f = d0rVar;
        this.a = z;
        this.g = v1kVar;
        this.h = gkdVar;
        this.i = iac0Var;
        this.j = sn4Var;
        this.k = et90Var;
    }
}
