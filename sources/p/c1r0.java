package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.tome.pageactivity.PageActivity;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c1r0 implements a1r0 {
    public final dg30 a;
    public final mwn0 b;
    public final String c = PageActivity.class.getName();

    public c1r0(dg30 dg30Var, mwn0 mwn0Var) {
        this.a = dg30Var;
        this.b = mwn0Var;
    }

    @Override // p.a1r0
    public final void a(String str, String str2, Bundle bundle) {
        dg30 dg30Var = this.a;
        if (h(dg30Var)) {
            a1r0.j(this, str, str2, bundle, false, 8);
        } else {
            hhg1.f(gvg.h("Cannot internally navigate from ", dg30Var.getClass().getCanonicalName(), ", expected ", this.c));
        }
    }

    @Override // p.a1r0
    public final void b(b3i1 b3i1Var) {
        dg30 dg30Var = this.a;
        boolean zH = h(dg30Var);
        String str = this.c;
        if (!zH) {
            hhg1.f(gvg.h("Cannot close ", dg30Var.getClass().getCanonicalName(), ", expected ", str));
            return;
        }
        Intent className = new Intent("com.spotify.mobile.android.ui.action.ACTION_CLOSE_ALL_OVERLAYS_FOR_URI_TYPE").setClassName((Context) dg30Var, str);
        className.putExtra("uri_type", b3i1Var.getKey());
        if (dg30Var instanceof l0r0) {
            ((l0r0) dg30Var).g(className);
        } else {
            dg30Var.startActivity(className);
        }
    }

    @Override // p.a1r0
    public final void c() {
        dg30 dg30Var = this.a;
        boolean zH = h(dg30Var);
        String str = this.c;
        if (!zH) {
            hhg1.f(gvg.h("Cannot close ", dg30Var.getClass().getCanonicalName(), ", expected ", str));
            return;
        }
        Intent flags = new Intent("com.spotify.mobile.android.ui.action.ACTION_CLOSE_ALL_OVERLAYS").setClassName((Context) dg30Var, str).setFlags(67108864);
        if (dg30Var instanceof l0r0) {
            ((l0r0) dg30Var).g(flags);
        } else {
            dg30Var.startActivity(flags);
        }
    }

    @Override // p.a1r0
    public final void d(blc0 blc0Var) {
        dg30 dg30Var = this.a;
        boolean zH = h(dg30Var);
        String str = this.c;
        if (!zH) {
            hhg1.f(gvg.h("Cannot close ", dg30Var.getClass().getCanonicalName(), ", expected ", str));
            return;
        }
        Intent className = new Intent("com.spotify.mobile.android.ui.action.ACTION_CLOSE_ALL_OVERLAYS_FOR_LINK").setClassName((Context) dg30Var, str);
        className.putExtra("link_type", blc0Var);
        if (dg30Var instanceof l0r0) {
            ((l0r0) dg30Var).g(className);
        } else {
            dg30Var.startActivity(className);
        }
    }

    @Override // p.a1r0
    public final void f(dwn0 dwn0Var, Bundle bundle, boolean z) {
        String strB = dwn0Var.b();
        Set set = s4b1.f;
        if (uic.x(strB).c != blc0.DUMMY) {
            o(dwn0Var.b(), dwn0Var.a(), bundle, z);
        } else {
            hhg1.f(xcg1.i(dwn0Var.b(), " is not internal uri and cannot be opened in ", this.c));
        }
    }

    @Override // p.a1r0
    public final void g() {
        dg30 dg30Var = this.a;
        boolean zH = h(dg30Var);
        String str = this.c;
        if (!zH) {
            hhg1.f(gvg.h("Cannot close ", dg30Var.getClass().getCanonicalName(), ", expected ", str));
            return;
        }
        Intent className = new Intent("com.spotify.mobile.android.ui.action.view.CLOSE_PAGE_ACTIVITY").setClassName((Context) dg30Var, str);
        if (dg30Var instanceof l0r0) {
            ((l0r0) dg30Var).g(className);
        } else {
            dg30Var.startActivity(className);
        }
    }

    @Override // p.a1r0
    public final boolean h(Activity activity) {
        return u890.j(activity.getClass().getCanonicalName(), this.c);
    }

    @Override // p.a1r0
    public final void k(String str, tv80 tv80Var, Bundle bundle, boolean z) {
        Set set = s4b1.f;
        if (uic.x(str).c != blc0.DUMMY) {
            o(str, tv80Var != null ? new bwn0(tv80Var) : null, bundle, z);
        } else {
            hhg1.f(f4i1.f(str, " is not internal uri and cannot be opened in ", this.c));
        }
    }

    @Override // p.a1r0
    public final void l() {
        dg30 dg30Var = this.a;
        boolean zH = h(dg30Var);
        String str = this.c;
        if (!zH) {
            hhg1.f(gvg.h("Cannot internally go back from ", dg30Var.getClass().getCanonicalName(), ", expected ", str));
            return;
        }
        yrn0 yrn0VarH = mqn1.h();
        mwn0 mwn0Var = this.b;
        mwn0Var.e(yrn0VarH);
        mwn0Var.f(mqn1.h());
        Intent className = new Intent("com.spotify.mobile.android.ui.action.view.SPOTIFY_URI").setClassName((Context) dg30Var, str);
        if (dg30Var instanceof l0r0) {
            ((l0r0) dg30Var).g(className);
        } else {
            dg30Var.startActivity(className);
        }
    }

    @Override // p.a1r0
    public final void n(String str, String str2, Bundle bundle, boolean z) {
        Set set = s4b1.f;
        if (uic.x(str).c != blc0.DUMMY) {
            o(str, str2 != null ? new awn0(new ou80(str2)) : null, bundle, z);
        } else {
            hhg1.f(f4i1.f(str, " is not internal uri and cannot be opened in ", this.c));
        }
    }

    public final void o(String str, cwn0 cwn0Var, Bundle bundle, boolean z) {
        dg30 dg30Var = this.a;
        Intent intentE = ud20.e(dg30Var, str);
        if (z) {
            intentE.setFlags(0);
        }
        if (cwn0Var instanceof awn0) {
            gg.H(intentE, ((awn0) cwn0Var).a());
        } else if (cwn0Var instanceof bwn0) {
            gg.I(intentE, ((bwn0) cwn0Var).a());
        } else if (u890.j(cwn0Var, zvn0.a)) {
            gg.J(intentE, hsn0.a);
        } else if (!u890.j(cwn0Var, yvn0.a)) {
            if (cwn0Var instanceof xvn0) {
                gg.J(intentE, mqn1.l(((xvn0) cwn0Var).a()));
            } else if (cwn0Var != null) {
                eg.o();
                return;
            }
        }
        if (bundle != null) {
            intentE.putExtras(bundle);
            intentE.putExtra("is_internal_navigation", true);
        }
        this.b.e(gg.d(intentE));
        if (z || !(dg30Var instanceof l0r0)) {
            dg30Var.startActivity(intentE);
        } else {
            ((l0r0) dg30Var).g(intentE);
        }
    }
}
