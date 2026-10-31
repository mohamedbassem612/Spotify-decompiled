package p;

import android.app.Application;
import com.google.android.recaptcha.internal.zzhm;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lqo1 {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;

    public lqo1(Application application, rlf1 rlf1Var) {
        this.a = application;
        this.b = rlf1Var;
        this.c = ygn0.a();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    public static final /* synthetic */ void a(lqo1 lqo1Var, long j, String str) throws zzhm {
        if (str.length() == 0) {
            throw new zzhm(tgo1.e, ij81.h, (String) null, (Exception) null);
        }
        if (j < 5000) {
            throw new zzhm(tgo1.k, ij81.P0, (String) null, (Exception) null);
        }
        if (x74.j((Application) lqo1Var.a, "android.permission.INTERNET") != 0) {
            throw new zzhm(tgo1.d, ij81.b1, (String) null, (Exception) null);
        }
    }

    public lqo1() {
        this.a = new Object();
    }
}
