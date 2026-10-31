package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import j$.net.URLEncoder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class drp0 {
    public final eg4 a;
    public final g5l0 b;
    public final i8h1 c;
    public final wml d;
    public final lzn0 e;
    public final o241 f;
    public final Scheduler g;
    public final Scheduler h;
    public final u4q0 i;
    public final am30 j;
    public boolean k;
    public boolean l;
    public boolean n;
    public tig0 m = sig0.a;
    public final vku o = new vku();

    public drp0(dg30 dg30Var, eg4 eg4Var, g5l0 g5l0Var, i8h1 i8h1Var, wml wmlVar, lzn0 lzn0Var, o241 o241Var, Scheduler scheduler, Scheduler scheduler2, u4q0 u4q0Var, am30 am30Var) {
        this.a = eg4Var;
        this.b = g5l0Var;
        this.c = i8h1Var;
        this.d = wmlVar;
        this.e = lzn0Var;
        this.f = o241Var;
        this.g = scheduler;
        this.h = scheduler2;
        this.i = u4q0Var;
        this.j = am30Var;
        f();
        e();
        d();
        dg30Var.runOnUiThread(new jyh0(dg30Var, this, (byte) 4));
    }

    public final boolean a() {
        return (!this.a.a() || this.k || this.l) ? false : true;
    }

    public final boolean b() {
        return (!this.a.a() || this.k || this.l) ? false : true;
    }

    public final tv80 c(int i, String str) {
        w7h1 w7h1VarH;
        int iC = l1d.C(i);
        g5l0 g5l0Var = this.b;
        if (iC == 0) {
            w7h1VarH = g5l0Var.q().l(str).h();
        } else if (iC == 1) {
            w7h1VarH = g5l0Var.q().i(str).q();
        } else if (iC == 2) {
            w7h1VarH = g5l0Var.p().k(str).h();
        } else if (iC == 3) {
            w7h1VarH = g5l0Var.p().h(str).q();
        } else if (iC == 4) {
            w7h1VarH = g5l0Var.e().j(str).m();
        } else {
            if (iC != 5) {
                eg.o();
                return null;
            }
            w7h1VarH = g5l0Var.e().e(str).q();
        }
        return this.c.m(w7h1VarH, null);
    }

    public final void d() {
        this.o.a(yoi1.i(this.j.a(), o6x.a).subscribeOn(this.g).subscribe(new crp0(this, (byte) 0), new crp0(this, (byte) 1)));
    }

    public final void e() {
        this.o.a(yoi1.i(this.i.d(), o6x.a).subscribe(new crp0(this, (byte) 2), new crp0(this, (byte) 3)));
    }

    public final void f() {
        p241 p241Var = this.f;
        Observable observableB = p241Var.b("type");
        Scheduler scheduler = this.g;
        Disposable disposableSubscribe = observableB.subscribeOn(scheduler).subscribe(new crp0(this, (byte) 4), zzc0.S0);
        vku vkuVar = this.o;
        vkuVar.a(disposableSubscribe);
        vkuVar.a(p241Var.b("offline").subscribeOn(scheduler).subscribe(new crp0(this, (byte) 5), zzc0.T0));
    }

    public final void g(int i, String str) {
        n2v n2vVar;
        boolean z = this.n;
        lzn0 lzn0Var = this.e;
        if (z) {
            lzn0Var.a(fx20.d.g(), c(i, str), null);
            return;
        }
        rig0 rig0Var = this.m;
        if (rig0Var instanceof rig0) {
            int iA = rig0Var.a();
            lzn0Var.a(asg1.d.b(iA), c(i, str), null);
            return;
        }
        if (!rig0Var.equals(sig0.a)) {
            eg.o();
            return;
        }
        tv80 tv80VarC = c(i, str);
        int iC = l1d.C(i);
        n2v n2vVar2 = n2v.c;
        if (iC == 0 || iC == 1) {
            n2vVar = n2v.a;
        } else if (iC == 2 || iC == 3) {
            n2vVar = n2vVar2;
        } else {
            if (iC != 4 && iC != 5) {
                eg.o();
                return;
            }
            n2vVar = n2v.b;
        }
        if (n2vVar == n2vVar2) {
            lzn0Var.a(wdu0.a(null, "https://message-editor.scdn.co/1e43b2cb-b1fa-4f1c-a118-9afa3d42057d", n2vVar), tv80VarC, null);
            return;
        }
        Disposable disposableSubscribe = this.d.e(str).observeOn(this.h).subscribe(new qg7(n2vVar, this, tv80VarC, (byte) 17), new w090(this, tv80VarC, (byte) 24));
        disposableSubscribe.getClass();
        this.o.a(disposableSubscribe);
    }

    public final void h(int i, String str, String str2) {
        String str3;
        boolean z = this.n;
        lzn0 lzn0Var = this.e;
        if (z) {
            lzn0Var.a(fx20.d.g(), c(i, str), null);
            return;
        }
        rig0 rig0Var = this.m;
        if (rig0Var instanceof rig0) {
            lzn0Var.a(asg1.d.b(rig0Var.a()), c(i, str), null);
            return;
        }
        if (!rig0Var.equals(sig0.a)) {
            eg.o();
            return;
        }
        tv80 tv80VarC = c(i, str);
        int iC = l1d.C(i);
        if (iC == 1) {
            str3 = "spotify:playlist:download_button";
        } else if (iC != 3) {
            str3 = iC != 5 ? "" : "spotify:album:download_button";
        } else {
            str3 = "spotify:liked-songs:download_button";
        }
        lzn0Var.a(nik1.b2.a + "?displayReason=" + URLEncoder.encode(str3, "UTF-8") + "&imageUri=" + URLEncoder.encode(str2, "UTF-8"), tv80VarC, null);
    }
}
