package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qs8 implements ifp0 {
    public static final qs8 a = new qs8();
    public static final u120 b = u120.c("name");
    public static final u120 c = u120.c("importance");
    public static final u120 d = u120.c("frames");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        iin iinVar = (iin) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.a(b, ((xz8) iinVar).a);
        xz8 xz8Var = (xz8) iinVar;
        jfp0Var.c(c, xz8Var.b);
        jfp0Var.a(d, xz8Var.c);
    }
}
