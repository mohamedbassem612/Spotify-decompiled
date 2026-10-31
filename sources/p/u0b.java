package p;

import io.reactivex.rxjava3.functions.Action;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u0b implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i8h1 b;
    public final /* synthetic */ ntk0 c;

    public /* synthetic */ u0b(i8h1 i8h1Var, ntk0 ntk0Var, byte b) {
        this.a = b;
        this.b = i8h1Var;
        this.c = ntk0Var;
    }

    public final void run() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        ntk0 ntk0Var = this.c;
        i8h1 i8h1Var = this.b;
        switch (b) {
            case 0:
                ntk0Var.getClass();
                x6h1 x6h1VarC = ntk0Var.a.c();
                x6h1VarC.i.add(new a7h1("invite_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            case 1:
                ntk0Var.getClass();
                x6h1 x6h1VarC2 = ntk0Var.a.c();
                x6h1VarC2.i.add(new a7h1("face_pile_image", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            case 2:
                x6h1 x6h1VarC3 = ntk0Var.a.c();
                x6h1VarC3.i.add(new a7h1("join_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                y6h1 y6h1VarA = x6h1VarC3.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var.a(), (Set) null);
                break;
            case 3:
                x6h1 x6h1VarC4 = ntk0Var.a.c();
                x6h1VarC4.i.add(new a7h1("join_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("create_playlist", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            case 4:
                x6h1 x6h1VarC5 = ntk0Var.a.c();
                x6h1VarC5.i.add(new a7h1("join_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = true;
                y6h1 y6h1VarA2 = x6h1VarC5.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var2.a(), (Set) null);
                break;
            case 5:
                x6h1 x6h1VarC6 = ntk0Var.a.c();
                x6h1VarC6.i.add(new a7h1("join_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = true;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("create_playlist", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                x6h1 x6h1VarC7 = ntk0Var.a.c();
                x6h1VarC7.i.add(new a7h1("invite_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = true;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC7.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
        }
    }
}
