package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class b741 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e741 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b741(e741 e741Var, byte b) {
        super(1);
        this.a = b;
        this.b = e741Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        e741 e741Var = this.b;
        switch (b) {
            case 0:
                wdr wdrVar = e741Var.h;
                i8h1 i8h1Var = wdrVar.a;
                x6h1 x6h1VarC = ((xok0) wdrVar.b.b).b.c();
                x6h1VarC.i.add(new a7h1("container_nudge_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                e741Var.c.a(i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:connect-device-picker")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a, false);
                x4f1.b(e741Var.d);
                break;
            default:
                wdr wdrVar2 = e741Var.h;
                i8h1 i8h1Var2 = wdrVar2.a;
                x6h1 x6h1VarC2 = ((xok0) wdrVar2.b.b).b.c();
                x6h1VarC2.i.add(new a7h1("container_nudge_view", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = true;
                i8h1Var2.m(new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("no_action", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                x4f1.b(e741Var.d);
                break;
        }
        return rih1Var;
    }
}
