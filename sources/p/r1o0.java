package p;

import io.reactivex.rxjava3.functions.Action;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class r1o0 implements Action {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t1o0 b;
    public final /* synthetic */ Integer c;

    public /* synthetic */ r1o0(t1o0 t1o0Var, Integer num, byte b) {
        this.a = b;
        this.b = t1o0Var;
        this.c = num;
    }

    public final void run() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        t1o0 t1o0Var = this.b;
        switch (b) {
            case 0:
                x6h1 x6h1VarC = t1o0Var.b.b.c();
                x6h1VarC.i.add(new a7h1("dialog", (String) null, this.c, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("allow_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                t1o0Var.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("permission_allow", 1, Collections.singletonMap("permission_id", "android.permission-group.NEARBY_DEVICES")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
            default:
                x6h1 x6h1VarC3 = t1o0Var.b.b.c();
                x6h1VarC3.i.add(new a7h1("dialog", (String) null, this.c, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("deny_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                t1o0Var.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("permission_deny", 1, Collections.singletonMap("permission_id", "android.permission-group.NEARBY_DEVICES")), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                break;
        }
    }
}
