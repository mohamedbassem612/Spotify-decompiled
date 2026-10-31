package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cxs0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dxs0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cxs0(dxs0 dxs0Var, byte b) {
        super(3);
        this.a = b;
        this.b = dxs0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        yws0 yws0Var = yws0.a;
        dxs0 dxs0Var = this.b;
        zws0 zws0Var = zws0.a;
        switch (b) {
            case 0:
                axs0 axs0Var = (axs0) obj2;
                if (axs0Var.equals(zws0Var)) {
                    dxs0Var.b.invoke();
                } else if (!axs0Var.equals(yws0Var)) {
                    eg.o();
                    return null;
                }
                return rih1.a;
            default:
                axs0 axs0Var2 = (axs0) obj3;
                if (!axs0Var2.equals(zws0Var)) {
                    if (axs0Var2.equals(yws0Var)) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                grk0 grk0Var = (grk0) dxs0Var.a.invoke();
                grk0Var.getClass();
                x6h1 x6h1VarC = grk0Var.a.c();
                x6h1VarC.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
        }
    }
}
