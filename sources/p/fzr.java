package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fzr implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gzr b;

    public /* synthetic */ fzr(gzr gzrVar, byte b) {
        this.a = b;
        this.b = gzrVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        gzr gzrVar = this.b;
        switch (b) {
            case 0:
                gzrVar.a.e();
                break;
            default:
                vnd1 vnd1Var = gzrVar.b;
                pap1 pap1Var = ((dh20) obj).c;
                fjl0 fjl0Var = (fjl0) vnd1Var.c;
                r6h1 r6h1Var = fjl0Var.b;
                y6h1 y6h1Var = fjl0Var.c;
                i8h1 i8h1Var = (i8h1) vnd1Var.b;
                boolean zEquals = pap1Var.equals(bq80.c);
                b7x b7xVar = b7x.a;
                if (zEquals) {
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
                } else if (pap1Var.equals(bq80.d)) {
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("no_results", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = true;
                    y6h1 y6h1VarA = x6h1VarC3.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).b = r6h1Var;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var.f(k7h1Var.a(), (Set) null);
                } else if (!pap1Var.equals(bq80.e)) {
                    eg.o();
                } else {
                    x6h1 x6h1VarC4 = y6h1Var.c();
                    x6h1VarC4.i.add(new a7h1("search_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                    x6h1VarC5.i.add(new a7h1("text_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("search", 1, b7xVar), x6h1VarC5.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
                }
                break;
        }
    }
}
