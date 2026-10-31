package p;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d8l implements o5s {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d8l(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void onCreate(iac0 iac0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                fdc fdcVar = (fdc) obj;
                oe41 oe41VarP = ((qe41) fdcVar.c).p();
                Bundle bundleA = oe41VarP.a("activityResultSavedState");
                if (bundleA != null) {
                    ((c8l) fdcVar.e).e(bundleA);
                }
                oe41VarP.c("activityResultSavedState", new uk(fdcVar, (byte) 2));
                return;
            case 1:
                st60 st60Var = (st60) obj;
                Bundle bundleA2 = ((qe41) st60Var.d).p().a("INSTANCE_STATE_RECEIVING_PLUGIN_POINT");
                if (bundleA2 == null) {
                    return;
                }
                rmc0 rmc0VarListIterator = ((smc0) ((lmw) st60Var.c).b).listIterator(0);
                while (true) {
                    rmc0 rmc0Var = rmc0VarListIterator;
                    if (!rmc0Var.hasNext()) {
                        return;
                    } else {
                        ((cyf0) ((ynb0) rmc0Var.next()).get()).e(bundleA2);
                    }
                }
                break;
            case 2:
                tte0 tte0Var = (tte0) obj;
                ute0 ute0Var = tte0Var.a;
                i94 i94Var = ute0Var.g;
                i94Var.e("session_ui_plugins_on_create_ui");
                Iterator it = ute0Var.c.iterator();
                while (it.hasNext()) {
                    ((iyf0) it.next()).g(ute0Var.l);
                }
                i94Var.a("session_ui_plugins_on_create_ui");
                tte0Var.m = true;
                if (((f0i) ute0Var.e).a.i.a(w8c0.d)) {
                    tte0Var.a();
                }
                fn31.T(tte0Var.l, (o8n) null, 0, new ste0(ute0Var, tte0Var, null, (byte) 1), 3);
                if (tte0Var.d) {
                    Iterator it2 = ute0Var.c.iterator();
                    while (it2.hasNext()) {
                        ((iyf0) it2.next()).i();
                    }
                    tte0Var.d = false;
                }
                iac0Var.getLifecycle().d(this);
                return;
            case 3:
                arq0 arq0Var = (arq0) obj;
                Bundle bundleA3 = arq0Var.b.p().a("orientation_plugin_saved_state");
                if (bundleA3 != null) {
                    bundleA3.getInt("orientation_plugin_saved_state", arq0Var.a.a());
                    return;
                }
                return;
            default:
                im21 im21Var = (im21) obj;
                ik21 ik21Var = im21Var.H1;
                if (ik21Var == null) {
                    u890.C("reportBlockingFlow");
                    throw null;
                }
                ik21Var.i.a(ik21Var.d.l(ik21Var.j, ik21Var.b(), ik21Var.h).subscribe(new hk21(ik21Var, (byte) 4)));
                ((f0i) im21Var.N0()).a.d(this);
                th30 th30VarE0 = im21Var.N0().e0();
                th30VarE0.getClass();
                nu9 nu9Var = new nu9(th30VarE0);
                nu9Var.m(im21Var);
                nu9Var.f();
                return;
        }
    }
}
