package p;

import android.net.Uri;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qwf1 implements it80 {
    public final phi0 X;
    public final q8n Y;
    public final eb80 a;
    public final Scheduler b;
    public final Scheduler c;
    public final w911 d;
    public final ov20 e;
    public final rh11 f;
    public final etf1 g;
    public final dg4 h;
    public final uu00 i;
    public final vbs t;

    public qwf1(eb80 eb80Var, Scheduler scheduler, Scheduler scheduler2, w911 w911Var, ov20 ov20Var, rh11 rh11Var, etf1 etf1Var, dg4 dg4Var, uu00 uu00Var, vbs vbsVar, phi0 phi0Var, q8n q8nVar) {
        this.a = eb80Var;
        this.b = scheduler;
        this.c = scheduler2;
        this.d = w911Var;
        this.e = ov20Var;
        this.f = rh11Var;
        this.g = etf1Var;
        this.h = dg4Var;
        this.i = uu00Var;
        this.t = vbsVar;
        this.X = phi0Var;
        this.Y = q8nVar;
    }

    @Override // p.it80
    public final void a(ajq0 ajq0Var) {
        ajq0Var.J(cpn1.w(blc0.TRACK), "Handle track links", new owf1(this, (byte) 0));
        ajq0Var.J(cpn1.w(blc0.TRACK_AUTOPLAY), "Handle track autoplay links", new ltf1(this, (byte) 1));
    }

    public final Single b(s4b1 s4b1Var) {
        blc0 blc0Var = s4b1Var.c;
        if (blc0Var != blc0.TRACK && blc0Var != blc0.TRACK_AUTOPLAY) {
            hhg1.n("Failed requirement.");
            return null;
        }
        String strE = s4b1Var.E();
        if (strE != null) {
            return this.g.a(k4p1.x(strE)).observeOn(this.c).map(djx0.T0).onErrorReturnItem(Boolean.FALSE);
        }
        eg.m("Required value was null.");
        return null;
    }

    public final Single c(s4b1 s4b1Var) {
        blc0 blc0Var = s4b1Var.c;
        if (blc0Var != blc0.TRACK && blc0Var != blc0.TRACK_AUTOPLAY) {
            hhg1.n("Failed requirement.");
            return null;
        }
        String strE = s4b1Var.E();
        if (strE != null) {
            return this.a.u(strE);
        }
        eg.m("Required value was null.");
        return null;
    }

    public final Single d(s4b1 s4b1Var) {
        return Single.zip(this.f.d().firstOrError().onErrorReturnItem(Boolean.FALSE), rqt0.F(this.Y, new b0f1(this, (lnm) null, (byte) 5)), njx0.T0).flatMap(new vnd1(s4b1Var, this, (byte) 11));
    }

    public final Single e(s4b1 s4b1Var) {
        return c(s4b1Var).timeout(10L, TimeUnit.SECONDS, this.b).map(e2x0.U0).onErrorResumeNext(f2x0.U0);
    }

    public final Single f(s4b1 s4b1Var) {
        String string;
        String strE = s4b1Var.E();
        if (strE == null) {
            Set set = s4b1.f;
            return Single.just(lfb.j(uic.x("spotify:home")));
        }
        boolean zB = this.h.b();
        Uri uri = s4b1Var.a;
        w911 w911Var = this.d;
        if (!zB) {
            return Single.just(new frn0(yah0.s(w911Var.b, strE, uri != null ? uri.getQueryParameter("si") : null), nnf1.class));
        }
        String queryParameter = uri != null ? uri.getQueryParameter("si") : null;
        String str = "";
        if (queryParameter == null) {
            queryParameter = "";
        }
        Uri uri2 = w911Var.b;
        if (uri2 != null && (string = uri2.toString()) != null) {
            str = string;
        }
        return Single.just(lfb.m(um30.class, new wm30(strE, queryParameter, str)));
    }
}
