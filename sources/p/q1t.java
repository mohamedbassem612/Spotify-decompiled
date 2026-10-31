package p;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import io.reactivex.rxjava3.core.ObservableTransformer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q1t implements f4h1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public q1t(k8m0 k8m0Var, s1t s1tVar, whp whpVar) {
        this.a = (byte) 0;
        this.b = k8m0Var;
        this.c = s1tVar;
        this.d = whpVar;
        this.e = new rku();
    }

    public final Object getView() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((s1t) this.c).f;
            case 1:
                return (FrameLayout) ((kp00) obj).b;
            default:
                return (View) obj;
        }
    }

    public final void start() {
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.e;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                s1t s1tVar = (s1t) obj4;
                ((rku) obj3).b(((k8m0) obj2).k(s1tVar, (ObservableTransformer) ((idd1) ((whp) obj).a(s1tVar).e).getValue()));
                break;
            case 1:
                kp00 kp00Var = (kp00) obj2;
                FrameLayout frameLayout = (FrameLayout) kp00Var.c;
                FrameLayout frameLayout2 = (FrameLayout) kp00Var.b;
                pp20 pp20Var = (pp20) obj4;
                qp20 qp20Var = pp20Var.b;
                Integer num = pp20Var.a;
                if (num == null || qp20Var == null) {
                    tka0 tka0Var = dtw.C;
                    Context context = frameLayout2.getContext();
                    String string = frameLayout2.getContext().getString(2131955714);
                    ((swp) obj3).getClass();
                    dtw dtwVarD = mhc.d(context, frameLayout, new dx0(string), (drw) null, 24);
                    frameLayout.removeAllViews();
                    frameLayout.addView(dtwVarD.w);
                } else {
                    int iIntValue = num.intValue();
                    tka0 tka0Var2 = dtw.C;
                    Context context2 = frameLayout2.getContext();
                    qqp qqpVar = (qqp) ((qwp) obj).a.c;
                    enp0 enp0Var = (enp0) qqpVar.d;
                    Activity activity = (Activity) enp0Var.a.get();
                    c8o.l(activity);
                    swv0 swv0Var = (swv0) enp0Var.c.get();
                    c8o.l(swv0Var);
                    lzn0 lzn0Var = (lzn0) enp0Var.d.get();
                    c8o.l(lzn0Var);
                    dtw dtwVarB = mhc.b(context2, frameLayout, new ug3(new hp20(activity, swv0Var, lzn0Var), new yxk0((byte) 1), (rwp) ((jly0) qqpVar.b).get(), new op20()), new lp20(iIntValue, qp20Var), (ipb1) null, 112);
                    frameLayout.removeAllViews();
                    frameLayout.addView(dtwVarB.w);
                }
                break;
            default:
                ((n381) obj4).l();
                if (((String) obj3) != null) {
                    ((View) obj2).findViewById(2131427827).setOnClickListener(new gl61(this, (byte) 3));
                }
                break;
        }
    }

    public final void stop() {
        switch (this.a) {
            case 0:
                ((rku) this.e).a();
                break;
        }
    }

    private final void b() {
    }

    private final void c() {
    }

    public q1t(kp00 kp00Var, pp20 pp20Var, qwp qwpVar, swp swpVar) {
        this.a = (byte) 1;
        this.b = kp00Var;
        this.c = pp20Var;
        this.d = qwpVar;
        this.e = swpVar;
    }

    public q1t(View view, n381 n381Var, y991 y991Var, String str) {
        this.a = (byte) 2;
        this.b = view;
        this.c = n381Var;
        this.d = y991Var;
        this.e = str;
        rwq0.s(view, xi81.e);
    }
}
