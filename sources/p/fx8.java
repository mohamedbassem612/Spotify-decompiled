package p;

import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fx8 implements ifp0 {
    public static final fx8 a = new fx8();
    public static final u120 b = u120.c("packageName");
    public static final u120 c = u120.c("versionName");
    public static final u120 d = u120.c("appBuildVersion");
    public static final u120 e = u120.c("deviceManufacturer");
    public static final u120 f = u120.c("currentProcessDetails");
    public static final u120 g = u120.c("appProcessDetails");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        c54 c54Var = (c54) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.a(b, c54Var.a);
        jfp0Var.a(c, c54Var.b);
        jfp0Var.a(d, c54Var.c);
        jfp0Var.a(e, Build.MANUFACTURER);
        jfp0Var.a(f, c54Var.d);
        jfp0Var.a(g, c54Var.e);
    }
}
