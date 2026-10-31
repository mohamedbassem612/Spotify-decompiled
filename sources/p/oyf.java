package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oyf extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pyf b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oyf(pyf pyfVar, String str, byte b) {
        super(0);
        this.a = b;
        this.b = pyfVar;
        this.c = str;
    }

    public final Object invoke() {
        byte b = this.a;
        pyf pyfVar = this.b;
        switch (b) {
            case 0:
                dsk0 dsk0Var = pyfVar.g2;
                if (dsk0Var == null) {
                    u890.C("webviewEventsFact");
                    throw null;
                }
                x6h1 x6h1VarC = dsk0Var.b.c();
                x6h1VarC.i.add(new a7h1("loading_indicator", (String) null, (Integer) null, this.c, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            default:
                dsk0 dsk0Var2 = pyfVar.g2;
                if (dsk0Var2 == null) {
                    u890.C("webviewEventsFact");
                    throw null;
                }
                x6h1 x6h1VarC2 = dsk0Var2.b.c();
                x6h1VarC2.i.add(new a7h1("page_content", (String) null, (Integer) null, this.c, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var2.a();
        }
    }
}
