package p;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class m4c0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ n4c0 b;
    public final /* synthetic */ n3u c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4c0(n4c0 n4c0Var, n3u n3uVar) {
        super(0);
        this.b = n4c0Var;
        this.c = n3uVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        n3u n3uVar = this.c;
        n4c0 n4c0Var = this.b;
        switch (b) {
            case 0:
                String str = n3uVar.a;
                if (n3uVar.equals(n3u.e)) {
                    m42 m42Var = n4c0Var.g;
                    if (m42Var == null) {
                        u890.C("premiumUpsellListener");
                        throw null;
                    }
                    String str2 = o4c0.a;
                    m42Var.invoke(str2);
                    x390 x390Var = n4c0Var.c;
                    i8h1 i8h1Var = (i8h1) x390Var.b;
                    r5l0 r5l0Var = (r5l0) x390Var.c;
                    x6h1 x6h1VarC = r5l0Var.b.c();
                    x6h1VarC.i.add(new a7h1("error_dialog", (String) null, (Integer) null, (String) null, str));
                    x6h1VarC.j = true;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("navigate_to_premium_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC2.a(), r5l0Var.a, System.currentTimeMillis()), (xj61) null);
                } else {
                    n4c0Var.c.q(str);
                }
                n4c0Var.d.invoke();
                return rih1Var;
            default:
                n4c0Var.c.q(n3uVar.a);
                n4c0Var.d.invoke();
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4c0(n3u n3uVar, n4c0 n4c0Var) {
        super(0);
        this.c = n3uVar;
        this.b = n4c0Var;
    }
}
