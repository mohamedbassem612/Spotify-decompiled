package p;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z710 {
    public final Activity a;
    public final kt91 b;

    public z710(Activity activity, kt91 kt91Var) {
        this.a = activity;
        this.b = kt91Var;
    }

    public static /* synthetic */ boolean c(z710 z710Var, Uri uri, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        return z710Var.b(uri, false, z);
    }

    public static boolean d(z710 z710Var, String str, boolean z, int i) {
        if ((i & 2) != 0) {
            z = false;
        }
        boolean z2 = (i & 4) == 0;
        z710Var.getClass();
        return z710Var.b(Uri.parse(str), z, z2);
    }

    public final boolean a() {
        Activity activity = this.a;
        String strI = asn.i(activity);
        if (strI == null) {
            return false;
        }
        return asn.k(activity, strI);
    }

    public final boolean b(Uri uri, boolean z, boolean z2) {
        if (z) {
            return e(uri);
        }
        oxg1 oxg1Var = new oxg1();
        oxg1Var.g();
        oxg1Var.i();
        oxg1Var.f();
        oxg1Var.c(2);
        if (z2) {
            oxg1Var.e();
        }
        try {
            oxg1Var.a().j(this.a, uri);
            return true;
        } catch (ActivityNotFoundException unused) {
            return e(uri);
        }
    }

    public final boolean e(Uri uri) {
        try {
            this.a.startActivity(new Intent("android.intent.action.VIEW", uri));
            return true;
        } catch (ActivityNotFoundException unused) {
            er91 er91VarC = k4k.p(2131955873).c();
            kt91 kt91Var = this.b;
            if (kt91Var.g()) {
                kt91Var.k(er91VarC);
                return false;
            }
            kt91Var.o(er91VarC);
            return false;
        }
    }
}
