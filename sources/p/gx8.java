package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gx8 implements ifp0 {
    public static final gx8 a = new gx8();
    public static final u120 b = u120.c("appId");
    public static final u120 c = u120.c("deviceModel");
    public static final u120 d = u120.c("sessionSdkVersion");
    public static final u120 e = u120.c("osVersion");
    public static final u120 f = u120.c("logEnvironment");
    public static final u120 g = u120.c("androidAppInfo");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        xz5 xz5Var = (xz5) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.a(b, xz5Var.a);
        jfp0Var.a(c, Build.MODEL);
        jfp0Var.a(d, "2.0.1");
        jfp0Var.a(e, Build.VERSION.RELEASE);
        jfp0Var.a(f, ase0.LOG_ENVIRONMENT_PROD);
        jfp0Var.a(g, xz5Var.b);
    }
}
