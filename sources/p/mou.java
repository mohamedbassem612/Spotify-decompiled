package p;

import android.view.View;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mou implements x4l, o5s {
    public final Scheduler a;
    public final apr b;
    public final idd1 c;
    public final vku d = new vku();
    public View e;
    public Boolean f;
    public String g;

    public mou(gj5 gj5Var, ynb0 ynb0Var, Scheduler scheduler, apr aprVar) {
        this.a = scheduler;
        this.b = aprVar;
        this.c = new idd1(new d4e(ynb0Var, (byte) 21));
        ((f0i) gj5Var).a.a(this);
    }

    public final void a(View view) {
        this.e = view;
        if (this.f != null) {
            this.f = null;
            g(view);
        }
    }

    public final void b() {
        String str = this.g;
        if (str != null) {
            this.d.a(((lou) this.c.getValue()).b.a(str).subscribe());
        }
        this.e = null;
    }

    public final void f(String str) {
        this.g = str;
    }

    public final void g(View view) {
        if (this.b.c()) {
            return;
        }
        lou louVar = (lou) this.c.getValue();
        this.d.a(louVar.b.c(new ijo0(new mx81(view.getContext().getString(2131955001), 0, 0, (Long) null, 254), view, (w4f1) null, 4)).observeOn(this.a).subscribe(new cj9(this, louVar, (byte) 2)));
    }

    public final void onCreate(iac0 iac0Var) {
        if (this.b.c()) {
            return;
        }
        lou louVar = (lou) this.c.getValue();
        this.d.a(louVar.a.d.subscribe(new xu(this, louVar)));
    }

    public final void onDestroy(iac0 iac0Var) {
        this.d.c();
    }
}
