package p;

import android.content.Context;
import android.os.Parcelable;
import android.text.format.DateFormat;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fqp {
    public final twd0 a;
    public final vzd0 b;
    public final blp c = new blp(this, 0, (byte) 13);
    public final blp d = new blp(this, 1, (byte) 13);
    public final blp e = new blp(this, 2, (byte) 13);
    public final blp f = new blp(this, 3, (byte) 13);
    public final blp g = new blp(this, 4, (byte) 13);
    public final blp h = new blp(this, 6, (byte) 13);
    public final jly0 i = iy81.a(new blp(this, 5, (byte) 13));
    public final jly0 j = iy81.a(new blp(this, 7, (byte) 13));
    public final jly0 k = iy81.a(new blp(this, 8, (byte) 13));

    public fqp(twd0 twd0Var, vzd0 vzd0Var) {
        this.a = twd0Var;
        this.b = vzd0Var;
    }

    public final Locale a() {
        Context contextA = this.a.a();
        c8o.l(contextA);
        Locale localeB = yoi1.A(contextA.getResources().getConfiguration()).b(0);
        return localeB == null ? Locale.forLanguageTag(upn1.p()) : localeB;
    }

    public final rzd0 b() {
        cqp cqpVar = (cqp) this.i.get();
        Parcelable.Creator creator = lik1.CREATOR;
        return new rzd0((i8h1) ((fqp) cqpVar.a.c).h.get(), new lik1(this.b.a));
    }

    public final mzr0 c() {
        twd0 twd0Var = this.a;
        Context contextA = twd0Var.a();
        c8o.l(contextA);
        zmj0 zmj0Var = (zmj0) twd0Var.c.get();
        c8o.l(zmj0Var);
        lv00 lv00Var = (lv00) twd0Var.d.get();
        c8o.l(lv00Var);
        juz juzVar = new juz(zmj0Var, lv00Var);
        Context contextA2 = twd0Var.a();
        c8o.l(contextA2);
        Locale localeA = a();
        kly0 kly0Var = twd0Var.f;
        yqg yqgVar = (yqg) kly0Var.get();
        c8o.l(yqgVar);
        g2z g2zVar = new g2z();
        g2zVar.a = yqgVar;
        TimeZone timeZoneG = yqgVar.g();
        g2zVar.b = timeZoneG;
        g2zVar.c = contextA2.getString(2131957596);
        g2zVar.d = contextA2.getString(2131957597);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE", localeA);
        simpleDateFormat.setTimeZone(timeZoneG);
        g2zVar.e = simpleDateFormat;
        g2zVar.f = new SimpleDateFormat("MMM d", localeA);
        Locale localeA2 = a();
        yqg yqgVar2 = (yqg) kly0Var.get();
        c8o.l(yqgVar2);
        Context contextA3 = twd0Var.a();
        c8o.l(contextA3);
        esa1 esa1Var = new esa1(g2zVar, new q6r(localeA2, yqgVar2, DateFormat.is24HourFormat(contextA3) ? e0u.b : e0u.a), (byte) 25);
        zr00 zr00Var = (zr00) twd0Var.r.get();
        c8o.l(zr00Var);
        RetrofitMaker retrofitMakerC = twd0Var.c();
        c8o.l(retrofitMakerC);
        cfd cfdVar = new cfd(new mx3(vj3.g(retrofitMakerC)), this.d, (byte) 11);
        ov20 ov20Var = (ov20) twd0Var.w.get();
        c8o.l(ov20Var);
        return new mzr0(contextA, juzVar, esa1Var, zr00Var, this.c, cfdVar, ov20Var);
    }
}
