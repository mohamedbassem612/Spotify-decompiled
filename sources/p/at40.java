package p;

import android.appwidget.AppWidgetManager;
import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class at40 {
    public static r4r f;
    public final Context a;
    public final AppWidgetManager b;
    public final idd1 c = new idd1(new f710(this, (byte) 26));
    public static final ys40 d = new ys40();
    public static final lnv0 e = sj1.x("GlanceAppWidgetManager", (ze3) null, 14);
    public static final mnv0 g = rc2.I("list::Providers");

    public at40(Context context) {
        this.a = context;
        this.b = AppWidgetManager.getInstance(context);
    }

    public final Object a(kaa kaaVar, ws40 ws40Var, xr00 xr00Var) {
        mma0[] mma0VarArr = ys40.a;
        d.getClass();
        String canonicalName = kaaVar.getClass().getCanonicalName();
        if (canonicalName == null) {
            hhg1.n("no receiver name");
            return null;
        }
        String canonicalName2 = ws40Var.getClass().getCanonicalName();
        if (canonicalName2 != null) {
            Object objA = ((r4r) this.c.getValue()).a(new piu(canonicalName, canonicalName2, (lnm) null), xr00Var);
            return objA == d9n.a ? objA : rih1.a;
        }
        hhg1.n("no provider name");
        return null;
    }
}
