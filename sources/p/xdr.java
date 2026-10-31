package p;

import io.reactivex.rxjava3.functions.Action;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xdr implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zdr b;
    public final /* synthetic */ slc0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public /* synthetic */ xdr(zdr zdrVar, slc0 slc0Var, String str, int i, byte b) {
        this.a = b;
        this.b = zdrVar;
        this.c = slc0Var;
        this.d = str;
        this.e = i;
    }

    public final void run() {
        byte b = this.a;
        zdr zdrVar = this.b;
        switch (b) {
            case 0:
                py9 py9Var = (py9) zdrVar.b.b;
                x6h1 x6h1VarC = py9Var.c.c();
                x6h1VarC.i.add(new a7h1("nudge", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("link_account_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                b7x b7xVar = b7x.a;
                String str = zdrVar.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, py9Var.b, System.currentTimeMillis()), (xj61) null).a.a;
                zdrVar.c.a(this.c, "Samsung", this.d, str, 2, this.e);
                break;
            default:
                py9 py9Var2 = (py9) zdrVar.b.b;
                x6h1 x6h1VarC3 = py9Var2.c.c();
                x6h1VarC3.i.add(new a7h1("nudge", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                y6h1 y6h1VarA2 = x6h1VarC3.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA2;
                ((xjn) k7h1Var).b = py9Var2.b;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                String str2 = zdrVar.a.f(k7h1Var.a(), (Set) null).a.a;
                zdrVar.c.e(this.e, str2, "Samsung", this.d, this.c);
                break;
        }
    }
}
