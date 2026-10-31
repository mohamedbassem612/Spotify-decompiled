package p;

import android.app.Activity;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w911 {
    public final Activity a;
    public Uri b;
    public final qe41 c;

    public w911(Activity activity) {
        this.a = activity;
        qe41 qe41Var = (qe41) activity;
        this.c = qe41Var;
        ae0 ae0Var = new ae0(this, (byte) 6);
        ((r5q0) activity).Y.add(ae0Var);
        qe41Var.p().c("navigation.referrer-accessor.saved_state_key", new uk(this, (byte) 16));
        ((iac0) activity).getLifecycle().a(new v911(this));
    }
}
