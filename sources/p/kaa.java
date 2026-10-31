package p;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class kaa extends AppWidgetProvider {
    public static final /* synthetic */ int e = 0;
    public final bs50 a;
    public spl1 b;
    public ynb0 c;
    public ynb0 d;

    public kaa() {
        Handler handlerB = fmv.Z.b();
        fns fnsVar = igu.a;
        int i = ds50.a;
        this.a = new bs50(handlerB, null, false);
    }

    public abstract ws40 b();

    public final spl1 c() {
        spl1 spl1Var = this.b;
        if (spl1Var != null) {
            return spl1Var;
        }
        u890.C("widgetProviderDelegate");
        throw null;
    }

    public final void d(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        blo1.r(this, this.a, new tv1(this, context, i, bundle, (lnm) null, (byte) 2));
    }

    public final void e(Context context, int[] iArr) {
        blo1.r(this, this.a, new mu0(this, context, iArr, (lnm) null));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007f A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001f, B:15:0x0028, B:17:0x0030, B:19:0x0039, B:21:0x0047, B:22:0x004e, B:23:0x004f, B:24:0x0056, B:25:0x0057, B:41:0x00a2, B:31:0x006d, B:33:0x007f, B:35:0x008a, B:37:0x0096, B:36:0x0092, B:39:0x009a, B:40:0x00a1, B:28:0x0062), top: B:44:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008a A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001f, B:15:0x0028, B:17:0x0030, B:19:0x0039, B:21:0x0047, B:22:0x004e, B:23:0x004f, B:24:0x0056, B:25:0x0057, B:41:0x00a2, B:31:0x006d, B:33:0x007f, B:35:0x008a, B:37:0x0096, B:36:0x0092, B:39:0x009a, B:40:0x00a1, B:28:0x0062), top: B:44:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0092 A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001f, B:15:0x0028, B:17:0x0030, B:19:0x0039, B:21:0x0047, B:22:0x004e, B:23:0x004f, B:24:0x0056, B:25:0x0057, B:41:0x00a2, B:31:0x006d, B:33:0x007f, B:35:0x008a, B:37:0x0096, B:36:0x0092, B:39:0x009a, B:40:0x00a1, B:28:0x0062), top: B:44:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009a A[Catch: all -> 0x00a5, TryCatch #0 {all -> 0x00a5, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x001f, B:15:0x0028, B:17:0x0030, B:19:0x0039, B:21:0x0047, B:22:0x004e, B:23:0x004f, B:24:0x0056, B:25:0x0057, B:41:0x00a2, B:31:0x006d, B:33:0x007f, B:35:0x008a, B:37:0x0096, B:36:0x0092, B:39:0x009a, B:40:0x00a1, B:28:0x0062), top: B:44:0x0002 }] */
    public final void f(Context context, Intent intent) {
        kaa kaaVar;
        Context context2;
        AppWidgetManager appWidgetManager;
        String packageName;
        String canonicalName;
        ComponentName componentName;
        int[] appWidgetIds;
        try {
            String action = intent.getAction();
            if (action == null) {
                kaaVar = this;
                context2 = context;
            } else {
                int iHashCode = action.hashCode();
                if (iHashCode == -19011148) {
                    kaaVar = this;
                    context2 = context;
                    if (!action.equals("android.intent.action.LOCALE_CHANGED")) {
                    }
                    appWidgetManager = AppWidgetManager.getInstance(context2);
                    packageName = context2.getPackageName();
                    canonicalName = kaaVar.getClass().getCanonicalName();
                    if (canonicalName != null) {
                        throw new IllegalStateException("no canonical name");
                    }
                    componentName = new ComponentName(packageName, canonicalName);
                    if (intent.hasExtra("appWidgetIds")) {
                        appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                        appWidgetIds.getClass();
                    } else {
                        appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                    }
                    kaaVar.onUpdate(context2, appWidgetManager, appWidgetIds);
                    return;
                }
                if (iHashCode == 649033583) {
                    kaaVar = this;
                    context2 = context;
                    if (!action.equals("androidx.glance.appwidget.action.DEBUG_UPDATE")) {
                    }
                    appWidgetManager = AppWidgetManager.getInstance(context2);
                    packageName = context2.getPackageName();
                    canonicalName = kaaVar.getClass().getCanonicalName();
                    if (canonicalName != null) {
                        throw new IllegalStateException("no canonical name");
                    }
                    componentName = new ComponentName(packageName, canonicalName);
                    if (intent.hasExtra("appWidgetIds")) {
                        appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                        appWidgetIds.getClass();
                    } else {
                        appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                    }
                    kaaVar.onUpdate(context2, appWidgetManager, appWidgetIds);
                    return;
                }
                if (iHashCode == 1989767543 && action.equals("ACTION_TRIGGER_LAMBDA")) {
                    String stringExtra = intent.getStringExtra("EXTRA_ACTION_KEY");
                    if (stringExtra == null) {
                        throw new IllegalStateException("Intent is missing ActionKey extra");
                    }
                    int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
                    if (intExtra == -1) {
                        throw new IllegalStateException("Intent is missing AppWidgetId extra");
                    }
                    blo1.r(this, this.a, new bt40(this, context, intExtra, stringExtra, (lnm) null));
                    return;
                }
                kaaVar = this;
                context2 = context;
            }
            super.onReceive(context2, intent);
        } catch (Throwable unused) {
        }
    }

    public final void g(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        blo1.r(this, this.a, new lqv(this, context, iArr, (lnm) null, (byte) 19));
    }

    public final void h(Context context, c9n c9nVar) {
        fn31.T(c9nVar, (o8n) null, 0, new xr00(context, this, (lnm) null, (byte) 22), 3);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i, Bundle bundle) {
        d(context, appWidgetManager, i, bundle);
        c().b(i, new ComponentName(context, getClass()));
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDeleted(Context context, int[] iArr) {
        e(context, iArr);
        c().c(iArr);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onDisabled(Context context) {
        super.onDisabled(context);
        c().d();
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onEnabled(Context context) {
        super.onEnabled(context);
        c().e();
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        j1e1.s(this, context);
        ynb0 ynb0Var = this.c;
        if (ynb0Var == null) {
            u890.C("intentFactory");
            throw null;
        }
        dro.D(ynb0Var);
        f(context, intent);
        c().f(intent);
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        g(context, appWidgetManager, iArr);
        c().g(iArr, new ComponentName(context, getClass()));
    }
}
