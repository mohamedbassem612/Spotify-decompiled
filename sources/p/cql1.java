package p;

import android.content.Context;
import android.net.NetworkRequest;
import com.spotify.widgets.widgetbackgroundupdates.WidgetUpdateWorker;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cql1 implements bql1 {
    public final Context a;
    public final t85 b;

    public cql1(Context context, t85 t85Var) {
        this.a = context;
        this.b = t85Var;
    }

    public final lvh1 a() {
        long jA = this.b.a();
        if (1 <= jA && jA < 15) {
            jA = 15;
        }
        Context context = this.a;
        if (jA == 0) {
            bzn1.r("dynamic-npv-widget-periodic-update", awl1.d(context));
            return lvh1.b;
        }
        ha71.q(awl1.d(context), "dynamic-npv-widget-periodic-update", new uks0(WidgetUpdateWorker.class, jA, TimeUnit.MINUTES).f(new gjl(new e8o0((NetworkRequest) null), 2, false, false, true, false, -1L, -1L, o7h.p1(new LinkedHashSet()))).b());
        return lvh1.a;
    }
}
