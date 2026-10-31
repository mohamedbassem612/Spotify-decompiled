package p;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jx5 implements eyf0 {
    public final g341 a;
    public final Scheduler b;
    public final Scheduler c;
    public final Activity d;
    public final boolean e;

    public jx5(g341 g341Var, Scheduler scheduler, Scheduler scheduler2, Activity activity, boolean z) {
        this.a = g341Var;
        this.b = scheduler;
        this.c = scheduler2;
        this.d = activity;
        this.e = z;
    }

    public final void a(Intent intent) {
        String dataString;
        if (this.e && (dataString = intent.getDataString()) != null) {
            Set set = s4b1.f;
            s4b1 s4b1VarX = uic.x(dataString);
            Uri uri = s4b1VarX.a;
            if (uri == null || !uri.getBooleanQueryParameter("b2mwp", false)) {
                return;
            }
            Uri uri2 = Uri.parse(s4b1VarX.y());
            this.a.b(Uri.parse(uri2.getScheme() + "://" + uri2.getAuthority() + "/__noul__/" + s4b1VarX).buildUpon().appendQueryParameter("b2mwp", "true").appendQueryParameter("utm_source", "app_bounce").build()).subscribeOn(this.c).observeOn(this.b).subscribe(new tg(this, (byte) 18), nm.P0);
        }
    }
}
