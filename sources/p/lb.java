package p;

import android.app.Application;
import android.content.Context;
import com.spotify.widgets.npvwidget.HideTooltipWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lb {
    public final Context a;

    public lb(Application application) {
        this.a = application.getApplicationContext();
    }

    public p3r a(String str) {
        Set set = s4b1.f;
        boolean z = false;
        boolean zK = uic.k(str, new b3i1[]{nyu0.e, wyu0.f});
        Context context = this.a;
        return zK ? new dn3(context, z) : new bx5(context);
    }

    public List b() {
        Context context = this.a;
        try {
            return w081.k(context, 2);
        } catch (IllegalArgumentException unused) {
            w081.u(context);
            try {
                return w081.k(context, 2);
            } catch (IllegalArgumentException e) {
                n57.g("Could not retrieve dynamic shortcuts", e);
                return null;
            }
        }
    }

    public boolean c(t081 t081Var) {
        List listB = b();
        Context context = this.a;
        int iG = w081.g(context);
        if (listB != null) {
            int size = (listB.size() - iG) + 1;
            Integer numValueOf = Integer.valueOf(size);
            if (size <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                List listD1 = o7h.d1(o7h.a1(listB, new be21((byte) 10)), numValueOf.intValue());
                ArrayList arrayList = new ArrayList(q7h.U(listD1, 10));
                Iterator it = listD1.iterator();
                while (it.hasNext()) {
                    arrayList.add(((t081) it.next()).b);
                }
                w081.v(context, arrayList);
            }
        }
        try {
            return w081.q(context, t081Var);
        } catch (IllegalArgumentException e) {
            n57.g("Could not push dynamic shortcut", e);
            return false;
        }
    }

    public void d() {
        Context context = this.a;
        awl1 awl1VarD = awl1.d(context);
        ila0.y(awl1VarD.b.h, "CancelWorkByTag_com.spotify.widgets.npvwidget.TAG_HIDE_TOOLTIP", awl1VarD.d.a, new hx4(awl1VarD, (byte) 13));
        awl1.d(context).a(new ciq0(HideTooltipWorker.class).h(3500L, TimeUnit.MILLISECONDS).a("com.spotify.widgets.npvwidget.TAG_HIDE_TOOLTIP").b());
    }
}
