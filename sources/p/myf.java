package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class myf extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pyf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ myf(pyf pyfVar, byte b) {
        super(0);
        this.a = b;
        this.b = pyfVar;
    }

    public final Object invoke() {
        byte b = this.a;
        pyf pyfVar = this.b;
        switch (b) {
            case 0:
                Object objT = jhc1.t(pyfVar.O0(), "checkout_web_view_args", lyf.class);
                if (objT != null) {
                    return (lyf) objT;
                }
                hhg1.n("Required value was null.");
                return null;
            case 1:
                dsk0 dsk0Var = pyfVar.g2;
                if (dsk0Var == null) {
                    u890.C("webviewEventsFact");
                    throw null;
                }
                x6h1 x6h1VarC = dsk0Var.b.c();
                x6h1VarC.i.add(new a7h1("page_timeout_error", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            default:
                dsk0 dsk0Var2 = pyfVar.g2;
                if (dsk0Var2 != null) {
                    return dsk0Var2.e();
                }
                u890.C("webviewEventsFact");
                throw null;
        }
    }
}
