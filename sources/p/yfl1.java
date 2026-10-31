package p;

import android.R;
import android.app.Application;
import android.content.Context;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yfl1 {
    public static final v9c k = new v9c((byte) 29);
    public final Application a;
    public final Scheduler b;
    public final alg1 c;
    public final sfl1 d;
    public final d341 e;
    public final t8r0 f;
    public final kly0 g;
    public zfl1 h = k;
    public final rku i = new rku();
    public final qeh1 j = new qeh1(this, (byte) 11);

    public yfl1(Application application, Scheduler scheduler, lxh1 lxh1Var, alg1 alg1Var, sfl1 sfl1Var, d341 d341Var, t8r0 t8r0Var, caq caqVar) {
        this.a = application;
        this.b = scheduler;
        this.c = alg1Var;
        this.d = sfl1Var;
        this.e = d341Var;
        this.f = t8r0Var;
        this.g = caqVar;
    }

    public final void a() {
        this.i.a();
        if (c()) {
            this.h.stop();
            this.h = k;
        }
    }

    public final boolean b() {
        return this.d.e == null && this.h.b();
    }

    public final boolean c() {
        if (!((qo4) this.g.get()).d()) {
            return true;
        }
        v9c v9cVar = this.h;
        return v9cVar != k && v9cVar.b();
    }

    public final void d(bgl1 bgl1Var) {
        sfl1 sfl1Var = this.d;
        sfl1Var.getClass();
        sfl1Var.f = bgl1Var;
        sfl1Var.d.onNext(Boolean.valueOf(sfl1Var.a()));
        List list = bgl1.a;
        if (!s110.l(bgl1Var)) {
            sfl1Var.c = "";
        }
        e();
    }

    public final void e() {
        jfl1 jfl1Var;
        jfl1 jfl1Var2;
        t8r0 t8r0Var = this.f;
        Context context = (Context) t8r0Var.a;
        ut71 ut71Var = (ut71) t8r0Var.b;
        sfl1 sfl1Var = this.d;
        if (sfl1Var.a()) {
            if (!ut71Var.a(context).h(agl1.b(), true) || b()) {
                jfl1Var = new jfl1(1, 0, (String) null, (String) null, (String) null, 126);
                jfl1Var2 = jfl1Var;
            } else {
                int iW = h7w.w(sfl1Var.f, sfl1Var.b);
                String str = sfl1Var.e;
                String str2 = sfl1Var.a;
                List list = bgl1.a;
                jfl1Var2 = new jfl1(2, iW, str, str2, s110.l(sfl1Var.f) ? sfl1Var.c : null, 64);
            }
        } else if (b() || !ut71Var.a(context).h(agl1.b(), true) || ut71Var.a(context).h(agl1.a(), false)) {
            b();
            ut71Var.a(context).h(agl1.b(), true);
            ut71Var.a(context).h(agl1.a(), false);
            jfl1Var = new jfl1(1, 0, (String) null, (String) null, (String) null, 126);
            jfl1Var2 = jfl1Var;
        } else {
            jfl1Var2 = new jfl1(3, 2131234023, R.drawable.ic_menu_close_clear_cancel, (String) null, (String) null, (String) null, this.a.getResources().getString(2131963841));
        }
        this.e.a.onNext(jfl1Var2);
    }
}
