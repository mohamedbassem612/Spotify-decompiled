package p;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vxf0 {
    public final Activity a;
    public final ynb0 b;
    public final pbk1 c;
    public final u2f0 d;
    public final nl21 e;

    public vxf0(Activity activity, ynb0 ynb0Var, pbk1 pbk1Var, u2f0 u2f0Var, nl21 nl21Var) {
        this.a = activity;
        this.b = ynb0Var;
        this.c = pbk1Var;
        this.d = u2f0Var;
        this.e = nl21Var;
    }

    public final void a(boolean z, yg8 yg8Var) {
        Intent intent;
        if (z && (yg8Var == yg8.N0 || yg8Var == yg8.Z)) {
            return;
        }
        int i = 1;
        Activity activity = this.a;
        if (z) {
            intent = (Intent) this.c.a(activity, "spotify:home").b;
        } else {
            intent = activity.getIntent();
            intent.putExtra("forwarded_by_login_flow", true);
        }
        Intent intent2 = intent;
        Uri data = z ? null : activity.getIntent().getData();
        r2b1 r2b1Var = (r2b1) this.b.get();
        r2b1Var.getClass();
        if (intent2.getData() != null) {
            r2b1Var.a.getClass();
            n3c.q = true;
        }
        this.e.c.m((Object) null, "authentication");
        u2f0 u2f0Var = this.d;
        u2f0Var.getClass();
        int i2 = (data == null || !(u890.j(data.getHost(), "auth-callback.spotify.com") || (u890.j(data.getHost(), "callback") && u890.j(data.getScheme(), "spotify-auth-music")))) ? 268468224 : 0;
        if (yg8Var != null) {
            int iOrdinal = yg8Var.ordinal();
            if (iOrdinal == 10) {
                i = 2;
            } else if (iOrdinal == 11) {
                i = 3;
            }
        }
        Activity activity2 = this.a;
        activity2.startActivity(u2f0.a(u2f0Var, activity2, intent2, z, data, i2, i, 32));
        activity.overridePendingTransition(0, 0);
        if (z) {
            activity.finish();
        }
    }
}
