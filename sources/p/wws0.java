package p;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wws0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xws0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wws0(xws0 xws0Var, byte b) {
        super(3);
        this.a = b;
        this.b = xws0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        qws0 qws0Var = qws0.a;
        pws0 pws0Var = pws0.a;
        rws0 rws0Var = rws0.a;
        xws0 xws0Var = this.b;
        switch (b) {
            case 0:
                uws0 uws0Var = (uws0) obj2;
                if (uws0Var.equals(rws0Var)) {
                    xws0Var.b.invoke();
                } else if (uws0Var instanceof sws0) {
                    xws0Var.c.invoke(((sws0) uws0Var).a);
                } else if (uws0Var instanceof tws0) {
                    tws0 tws0Var = (tws0) uws0Var;
                    xws0Var.d.invoke(Integer.valueOf(tws0Var.a), tws0Var.b);
                } else if (uws0Var.equals(pws0Var)) {
                    xws0Var.f.invoke();
                } else {
                    if (!uws0Var.equals(qws0Var)) {
                        eg.o();
                        return null;
                    }
                    xws0Var.e.invoke();
                }
                return rih1.a;
            default:
                vws0 vws0Var = (vws0) obj;
                uws0 uws0Var2 = (uws0) obj3;
                Function0 function0 = xws0Var.a;
                boolean zEquals = uws0Var2.equals(rws0Var);
                b7x b7xVar = b7x.a;
                if (zEquals) {
                    grk0 grk0Var = (grk0) function0.invoke();
                    grk0Var.getClass();
                    x6h1 x6h1VarC = grk0Var.a.c();
                    x6h1VarC.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = true;
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                }
                if (!(uws0Var2 instanceof sws0)) {
                    if ((uws0Var2 instanceof tws0) || uws0Var2.equals(pws0Var) || uws0Var2.equals(qws0Var)) {
                        return null;
                    }
                    eg.o();
                    return null;
                }
                List list = vws0Var.c;
                txs0 txs0Var = ((sws0) uws0Var2).a;
                int iIndexOf = list.indexOf(txs0Var);
                grk0 grk0Var2 = (grk0) function0.invoke();
                grk0Var2.getClass();
                x6h1 x6h1VarC3 = grk0Var2.a.c();
                x6h1VarC3.i.add(new a7h1("filter_chips", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                y6h1 y6h1VarA = x6h1VarC3.a();
                Integer numValueOf = Integer.valueOf(iIndexOf);
                String str = txs0Var.b;
                x6h1 x6h1VarC4 = y6h1VarA.c();
                x6h1VarC4.i.add(new a7h1("filter_chip", (String) null, numValueOf, str, (String) null));
                x6h1VarC4.j = true;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("filter", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
        }
    }
}
