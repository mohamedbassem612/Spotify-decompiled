package p;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import com.spotify.widget.widgetpromo.PromoSuccessHandlerService;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rx5 implements lys0 {
    public final Context a;
    public final AppWidgetManager b;
    public final Scheduler c;
    public final qpj1 d;
    public final wpt e;
    public final uxy0 f;

    public rx5(Context context, AppWidgetManager appWidgetManager, Scheduler scheduler, qpj1 qpj1Var, wpt wptVar, uxy0 uxy0Var) {
        this.a = context;
        this.b = appWidgetManager;
        this.c = scheduler;
        this.d = qpj1Var;
        this.e = wptVar;
        this.f = uxy0Var;
    }

    public final boolean a(nmx0 nmx0Var) {
        Context context = this.a;
        try {
            AppWidgetManager appWidgetManager = this.b;
            if (appWidgetManager == null) {
                return false;
            }
            ComponentName componentName = new ComponentName(context, "com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider");
            int i = PromoSuccessHandlerService.b;
            boolean zRequestPinAppWidget = appWidgetManager.requestPinAppWidget(componentName, null, t4n1.p(context, nmx0Var));
            if (!zRequestPinAppWidget) {
                return zRequestPinAppWidget;
            }
            this.d.y(nmx0Var);
            return zRequestPinAppWidget;
        } catch (IllegalStateException e) {
            n57.t("The widget can't be pinned because the app is not FG", e);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum b(nmx0 nmx0Var, onm onmVar) {
        qx5 qx5Var;
        int i;
        if (onmVar instanceof qx5) {
            qx5Var = (qx5) onmVar;
            int i2 = qx5Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qx5Var.d = i2 - Integer.MIN_VALUE;
            } else {
                qx5Var = new qx5(this, onmVar);
            }
        } else {
            qx5Var = new qx5(this, onmVar);
        }
        Object obj = qx5Var.b;
        int i3 = qx5Var.d;
        uxy0 uxy0Var = this.f;
        if (i3 == 0) {
            hm5.M(obj);
            int iW = uxy0Var.w();
            if (!a(nmx0Var)) {
                return mys0.b;
            }
            if (this.e.a() != null) {
                qx5Var.a = iW;
                qx5Var.d = 1;
                Object objI = hap1.i(1500L, qx5Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
                i = iW;
            }
            return mys0.a;
        }
        if (i3 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = qx5Var.a;
        hm5.M(obj);
        if (uxy0Var.w() <= i) {
            return mys0.c;
        }
        return mys0.a;
    }
}
