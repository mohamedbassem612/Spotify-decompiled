package p;

import android.app.Activity;
import com.spotify.nowplaying.musicinstallation.NowPlayingActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e7p0 {
    public final Activity a;
    public final lzn0 b;
    public final mwn0 c;
    public final m7p0 d;
    public final d7p0 e;
    public final kly0 f;
    public final w4p0 g;

    public e7p0(Activity activity, lzn0 lzn0Var, mwn0 mwn0Var, m7p0 m7p0Var, d7p0 d7p0Var, jly0 jly0Var, w4p0 w4p0Var) {
        this.a = activity;
        this.b = lzn0Var;
        this.c = mwn0Var;
        this.d = m7p0Var;
        this.e = d7p0Var;
        this.f = jly0Var;
        this.g = w4p0Var;
    }

    public static void d(e7p0 e7p0Var, ou80 ou80Var) {
        e7p0Var.getClass();
        lik1 lik1Var = NowPlayingActivity.y1;
        e7p0Var.a(mqn1.L(mhc.e().a, ou80Var), false, ou80Var);
    }

    public static void e(e7p0 e7p0Var, tv80 tv80Var) {
        ou80 ou80Var = tv80Var.a;
        e7p0Var.getClass();
        lik1 lik1Var = NowPlayingActivity.y1;
        e7p0Var.a(mqn1.L(mhc.e().a, ou80Var), false, ou80Var);
    }

    public final void a(nsn0 nsn0Var, boolean z, ou80 ou80Var) {
        g7p0 g7p0Var = (j7p0) ezn1.o(this.d.a).getValue();
        Function0 function0 = this.e.b;
        if ((g7p0Var instanceof i7p0) && ((i7p0) g7p0Var).a) {
            return;
        }
        if ((g7p0Var instanceof g7p0) && g7p0Var.a() && function0 != null && !z) {
            function0.invoke();
            return;
        }
        if (((gv4) this.f.get()).b()) {
            b(ou80Var);
            return;
        }
        mwn0 mwn0Var = this.c;
        mwn0Var.e(nsn0Var);
        mwn0Var.f(nsn0Var);
        this.g.a();
        lik1 lik1Var = NowPlayingActivity.y1;
        Activity activity = this.a;
        activity.startActivity(mhc.f(activity, false));
    }

    public final void b(ou80 ou80Var) {
        lzn0 lzn0Var = this.b;
        if (ou80Var != null) {
            lzn0Var.a(nik1.o1.a, new tv80(ou80Var, null), null);
        } else {
            lzn0Var.h(nik1.o1.a);
        }
    }

    public final void c() {
        a(jsn0.a, false, null);
    }
}
