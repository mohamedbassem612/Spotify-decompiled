package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ecs implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l6s b;

    public /* synthetic */ ecs(l6s l6sVar, byte b) {
        this.a = b;
        this.b = l6sVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        l6s l6sVar = this.b;
        switch (b) {
            case 0:
                x6h1 x6h1VarC = ((xok0) l6sVar.b).b.c();
                x6h1VarC.i.add(new a7h1("dialog", (String) null, (Integer) obj, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("allow_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                ((i8h1) l6sVar.c).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("permission_allow", 1, Collections.singletonMap("permission_id", "android.permission-group.NEARBY_DEVICES")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            case 1:
                x6h1 x6h1VarC3 = ((xok0) l6sVar.b).b.c();
                x6h1VarC3.i.add(new a7h1("dialog", (String) null, (Integer) obj, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("deny_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                ((i8h1) l6sVar.c).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("permission_deny", 1, Collections.singletonMap("permission_id", "android.permission-group.NEARBY_DEVICES")), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                x6h1 x6h1VarC5 = ((xok0) l6sVar.b).b.c();
                x6h1VarC5.i.add(new a7h1("dialog", (String) null, (Integer) obj, (String) null, (String) null));
                x6h1VarC5.j = true;
                y6h1 y6h1VarA = x6h1VarC5.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                ((i8h1) l6sVar.c).f(k7h1Var.a(), (Set) null);
                break;
        }
    }
}
