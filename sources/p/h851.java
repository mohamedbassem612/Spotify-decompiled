package p;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h851 {
    public final Activity a;
    public final pbk1 b;

    public h851(Activity activity, pbk1 pbk1Var) {
        this.a = activity;
        this.b = pbk1Var;
    }

    public final void a() {
        String str = nik1.A1.a;
        pbk1 pbk1Var = this.b;
        Activity activity = this.a;
        activity.startActivity((Intent) pbk1Var.a(activity, str).b);
    }
}
