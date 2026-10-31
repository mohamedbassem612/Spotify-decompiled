package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fx70 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gx70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fx70(gx70 gx70Var, byte b) {
        super(0);
        this.a = b;
        this.b = gx70Var;
    }

    public final Object invoke() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        gx70 gx70Var = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = gx70Var.a;
                ksk0 ksk0Var = gx70Var.b;
                ksk0Var.getClass();
                x6h1 x6h1VarC = ksk0Var.c.c();
                x6h1VarC.i.add(new a7h1("image", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return i8h1Var.m(new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("move_image", 1, b7xVar), x6h1VarC.a(), ksk0Var.b, System.currentTimeMillis()), (xj61) null);
            case 1:
                i8h1 i8h1Var2 = gx70Var.a;
                ksk0 ksk0Var2 = gx70Var.b;
                ksk0Var2.getClass();
                x6h1 x6h1VarC2 = ksk0Var2.c.c();
                x6h1VarC2.i.add(new a7h1("image", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return i8h1Var2.m(new w7h1("", "", new z7h1("pinch", 1, b7xVar), new x7h1("resize_image", 1, b7xVar), x6h1VarC2.a(), ksk0Var2.b, System.currentTimeMillis()), (xj61) null);
            default:
                i8h1 i8h1Var3 = gx70Var.a;
                ksk0 ksk0Var3 = gx70Var.b;
                ksk0Var3.getClass();
                x6h1 x6h1VarC3 = ksk0Var3.c.c();
                x6h1VarC3.i.add(new a7h1("image", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                return i8h1Var3.m(new w7h1("", "", new z7h1("spread", 1, b7xVar), new x7h1("resize_image", 1, b7xVar), x6h1VarC3.a(), ksk0Var3.b, System.currentTimeMillis()), (xj61) null);
        }
    }
}
