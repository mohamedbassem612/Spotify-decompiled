package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bs8 implements ifp0 {
    public static final bs8 a = new bs8();
    public static final u120 b = u120.c("arch");
    public static final u120 c = u120.c("libraryName");
    public static final u120 d = u120.c("buildId");

    @Override // p.vax
    public final void a(Object obj, Object obj2) {
        whn whnVar = (whn) obj;
        jfp0 jfp0Var = (jfp0) obj2;
        jfp0Var.a(b, ((zy8) whnVar).a);
        zy8 zy8Var = (zy8) whnVar;
        jfp0Var.a(c, zy8Var.b);
        jfp0Var.a(d, zy8Var.c);
    }
}
