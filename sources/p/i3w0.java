package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class i3w0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k3w0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3w0(k3w0 k3w0Var, byte b) {
        super(0);
        this.a = b;
        this.b = k3w0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        k3w0 k3w0Var = this.b;
        switch (b) {
            case 0:
                zok0 zok0Var = k3w0Var.b.b;
                x6h1 x6h1VarC = zok0Var.b.c();
                x6h1VarC.i.add(new a7h1("merch_carousel", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = zok0Var.c;
                return k7h1Var.a();
            default:
                return (gik1) k3w0Var.c.get();
        }
    }
}
