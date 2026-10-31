package p;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.ComposeView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h490 {
    public final Application a;
    public final tg90 b;
    public final Handler c;
    public boolean e;
    public Activity f;
    public rl1 g;
    public boolean d = true;
    public final g490 h = new g490(this, 1);
    public final g490 i = new g490(this, 0);
    public final si0 j = new si0(this, (byte) 3);

    public h490(Application application, Activity activity, tg90 tg90Var, Handler handler) {
        this.a = application;
        this.b = tg90Var;
        this.c = handler;
    }

    public static boolean b(Activity activity) {
        war0 war0VarB0;
        bbr0 bbr0Var = activity instanceof bbr0 ? (bbr0) activity : null;
        bn70 bn70Var = (bbr0Var == null || (war0VarB0 = bbr0Var.b0(bn70.class)) == null) ? null : (bn70) war0VarB0.a();
        if (!u890.j(bn70Var != null ? bn70Var.b : null, nik1.J5)) {
            return false;
        }
        Intent intent = activity.getIntent();
        if (!u890.j(intent != null ? intent.getStringExtra("feedbackReportMode") : null, "InternalBug")) {
            return false;
        }
        activity.finish();
        return true;
    }

    public final void a() {
        if (this.d) {
            this.d = false;
            g490 g490Var = this.h;
            Handler handler = this.c;
            handler.removeCallbacks(g490Var);
            handler.removeCallbacks(this.i);
            rl1 rl1Var = this.g;
            if (rl1Var != null) {
                View view = (ComposeView) rl1Var.c;
                qe41 qe41Var = (z3u) rl1Var.e;
                ViewGroup viewGroup = (ViewGroup) rl1Var.d;
                if (rl1Var.b) {
                    rl1Var.b = false;
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(view);
                    }
                    if (x9p1.h(viewGroup) == qe41Var) {
                        x9p1.p(viewGroup, (iac0) null);
                    }
                    if (lap1.k(viewGroup) == qe41Var) {
                        lap1.o(viewGroup, (sck1) null);
                    }
                    if (hm5.w(viewGroup) == qe41Var) {
                        hm5.J(viewGroup, (qe41) null);
                    }
                    ((z3u) qe41Var).b.i(w8c0.a);
                    ((z3u) qe41Var).d.a();
                }
            }
            this.g = null;
            this.a.unregisterActivityLifecycleCallbacks(this.j);
        }
    }

    public final void c(Activity activity) {
        if (this.d) {
            boolean z = this.e;
            Handler handler = this.c;
            if (!z) {
                this.e = true;
                handler.postDelayed(this.h, 5000L);
            }
            if (b(activity)) {
                return;
            }
            this.f = activity;
            g490 g490Var = this.i;
            handler.removeCallbacks(g490Var);
            handler.postDelayed(g490Var, 300L);
        }
    }
}
