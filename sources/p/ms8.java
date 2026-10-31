package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ms8 implements ifp0 {
    public static final ms8 a = new ms8();
    public static final u120 b = u120.c("baseAddress");
    public static final u120 c = u120.c("size");
    public static final u120 d = u120.c("name");
    public static final u120 e = u120.c("uuid");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        ein einVar = (ein) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.e(b, ((rz8) einVar).a);
        rz8 rz8Var = (rz8) einVar;
        jfp0Var.e(c, rz8Var.b);
        jfp0Var.a(d, rz8Var.c);
        String str = rz8Var.d;
        jfp0Var.a(e, str != null ? str.getBytes(vin.a) : null);
    }
}
