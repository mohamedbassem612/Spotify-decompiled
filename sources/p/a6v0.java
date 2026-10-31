package p;

import android.app.Activity;
import android.content.DialogInterface;
import android.net.Uri;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a6v0 {
    public final Activity a;
    public final i8h1 b;
    public final g341 c;
    public final lo9 d;
    public wqk0 e;
    public final CompositeDisposable f = new CompositeDisposable();

    public a6v0(Activity activity, i8h1 i8h1Var, g341 g341Var, lo9 lo9Var) {
        this.a = activity;
        this.b = i8h1Var;
        this.c = g341Var;
        this.d = lo9Var;
    }

    public final void a(String str, ti tiVar, vdc vdcVar, lnc1 lnc1Var) {
        DialogInterface.OnClickListener ln5Var;
        String string;
        this.e = new wqk0(str, (byte) 25);
        String string2 = tiVar.a;
        Activity activity = this.a;
        if (string2 == null) {
            string2 = tiVar instanceof wdc ? activity.getString(2131960247) : activity.getString(2131960245);
        }
        if (tiVar instanceof vdc) {
            ln5Var = new oad(this, (byte) 25);
        } else if (!(tiVar instanceof wdc)) {
            eg.o();
            return;
        } else {
            Uri uriBuild = !ihc1.y0(str) ? ((wdc) tiVar).b.buildUpon().appendQueryParameter("spotifyEpisodeUri", str).build() : ((wdc) tiVar).b;
            uriBuild.getClass();
            ln5Var = new ln5(this, uriBuild, (byte) 18);
        }
        if (vdcVar != null) {
            string = ((ti) vdcVar).a;
            if (string == null) {
                string = activity.getString(2131960244);
            }
        } else {
            string = null;
        }
        oad oadVar = vdcVar != null ? new oad(this, (byte) 25) : null;
        wqk0 wqk0Var = this.e;
        if (wqk0Var == null) {
            u890.C("eventFactory");
            throw null;
        }
        this.b.f(wqk0Var.e(), (Set) null);
        if (((zb4) this.d.b).a()) {
            z5v0 z5v0Var = new z5v0(ln5Var, (byte) 0);
            z50 z50Var = z50.c;
            oqo1.t(activity, new fhx(null, null, new ygx(string2, new gbx(z50Var, z5v0Var)), string != null ? new ygx(string, new gbx(z50Var, new z5v0(oadVar, (byte) 1))) : null, null, new v3v0(1, lnc1Var, lnc1.class, "createView", "createView(Landroid/content/Context;)Landroid/view/View;", 0, (byte) 3), 35));
            return;
        }
        mw40 mw40Var = new mw40(activity, lnc1Var);
        mw40Var.e = false;
        mw40Var.a = string2;
        mw40Var.c = ln5Var;
        mw40Var.b = string;
        mw40Var.d = oadVar;
        mw40Var.b().b();
    }

    public final void b() {
        this.f.g();
    }
}
