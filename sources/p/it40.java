package p;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import androidx.glance.appwidget.UnmanagedSessionReceiver;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class it40 implements RemoteViewsService.RemoteViewsFactory {
    public final GlanceRemoteViewsService a;
    public final int b;
    public final int c;
    public final String d;

    public it40(GlanceRemoteViewsService glanceRemoteViewsService, int i, int i2, String str) {
        this.a = glanceRemoteViewsService;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final wy11 a() {
        wy11 wy11Var;
        cuw cuwVar = GlanceRemoteViewsService.a;
        int i = this.b;
        int i2 = this.c;
        String str = this.d;
        cuw cuwVar2 = GlanceRemoteViewsService.a;
        synchronized (cuwVar2) {
            wy11Var = (wy11) cuwVar2.a.get(cuw.a(i, i2, str));
            if (wy11Var == null) {
                wy11Var = wy11.d;
            }
        }
        return wy11Var;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(kx5 kx5Var, onm onmVar) throws Throwable {
        ht40 ht40Var;
        ComponentName componentName;
        String className;
        faa0 faa0Var;
        if (onmVar instanceof ht40) {
            ht40Var = (ht40) onmVar;
            int i = ht40Var.d;
            if ((i & os00.INVALID_ID) != 0) {
                ht40Var.d = i - os00.INVALID_ID;
            } else {
                ht40Var = new ht40(this, onmVar);
            }
        } else {
            ht40Var = new ht40(this, onmVar);
        }
        Object objB = ht40Var.b;
        int i2 = ht40Var.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 != 0) {
            if (i2 == 1) {
                this = ht40Var.a;
                hm5.M(objB);
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        hm5.M(objB);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objB);
                faa0Var = (faa0) objB;
            }
            if (faa0Var != null) {
                ht40Var.a = null;
                ht40Var.d = 3;
                if (faa0Var.j(ht40Var) == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1Var;
        }
        hm5.M(objB);
        AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(this.a).getAppWidgetInfo(this.b);
        ws40 ws40VarB = (appWidgetInfo == null || (componentName = appWidgetInfo.provider) == null || (className = componentName.getClassName()) == null) ? null : ((kaa) Class.forName(className).getDeclaredConstructor(null).newInstance(null)).b();
        if (ws40VarB == null) {
            v9c v9cVar = UnmanagedSessionReceiver.a;
            v9c.e(this.b);
            faa0Var = null;
            if (faa0Var != null) {
                ht40Var.a = null;
                ht40Var.d = 3;
                if (faa0Var.j(ht40Var) == d9nVar) {
                }
            }
            return rih1Var;
        }
        cg61 cg61Var = dg61.a;
        rzu rzuVar = new rzu(this, kx5Var, ws40VarB, (lnm) null, (byte) 16);
        ht40Var.a = this;
        ht40Var.d = 1;
        objB = cg61Var.b(rzuVar, ht40Var);
        if (objB != d9nVar) {
            this = this;
        }
        return d9nVar;
        faa0Var = (faa0) objB;
        if (faa0Var == null) {
            v9c v9cVar2 = UnmanagedSessionReceiver.a;
            v9c.e(this.b);
            faa0Var = null;
        }
        if (faa0Var != null) {
            ht40Var.a = null;
            ht40Var.d = 3;
            if (faa0Var.j(ht40Var) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return a().a.length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return a().a[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return a().b[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.a.getPackageName(), 2131624854);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return a().c;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        a().getClass();
        return false;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        jo31.t(o6x.a, new j020(this, (lnm) null, (byte) 15));
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
        cuw cuwVar = GlanceRemoteViewsService.a;
        int i = this.b;
        int i2 = this.c;
        String str = this.d;
        cuw cuwVar2 = GlanceRemoteViewsService.a;
        synchronized (cuwVar2) {
            cuwVar2.a.remove(cuw.a(i, i2, str));
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
    }
}
