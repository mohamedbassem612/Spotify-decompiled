package p;

import com.spotify.mobius.MobiusLoop;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class n2a0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o2a0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2a0(o2a0 o2a0Var, byte b) {
        super(0);
        this.a = b;
        this.b = o2a0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        o2a0 o2a0Var = this.b;
        switch (b) {
            case 0:
                xok0 xok0Var = o2a0Var.O0;
                xok0Var.getClass();
                x6h1 x6h1VarC = xok0Var.b.c();
                x6h1VarC.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            case 1:
                xok0 xok0Var2 = o2a0Var.O0;
                xok0Var2.getClass();
                x6h1 x6h1VarC3 = xok0Var2.b.c();
                x6h1VarC3.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("end_jam", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = true;
                w7h1 w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("stop_hosting_social_listening_session", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                ou80 ou80Var = o2a0Var.X.m(w7h1Var, (xj61) null).a;
                o2a0Var.Y.a(w7h1Var, ou80Var);
                MobiusLoop mobiusLoop = o2a0Var.N0;
                if (mobiusLoop != null) {
                    mym.l(mobiusLoop, new d2a0(ou80Var));
                    return rih1Var;
                }
                u890.C("mobiusLoop");
                throw null;
            case 2:
                xok0 xok0Var3 = o2a0Var.O0;
                xok0Var3.getClass();
                x6h1 x6h1VarC5 = xok0Var3.b.c();
                x6h1VarC5.i.add(new a7h1("cta_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                y6h1 y6h1VarA = x6h1VarC5.a();
                aqn0 aqn0Var = aqn0.a;
                w7h1 w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:jam:participants")), y6h1VarA, r6h1.c, System.currentTimeMillis());
                ou80 ou80Var2 = o2a0Var.X.m(w7h1Var2, (xj61) null).a;
                o2a0Var.Y.a(w7h1Var2, ou80Var2);
                MobiusLoop mobiusLoop2 = o2a0Var.N0;
                if (mobiusLoop2 != null) {
                    mym.l(mobiusLoop2, new h2a0(ou80Var2));
                    return rih1Var;
                }
                u890.C("mobiusLoop");
                throw null;
            default:
                xok0 xok0Var4 = o2a0Var.O0;
                xok0Var4.getClass();
                x6h1 x6h1VarC6 = xok0Var4.b.c();
                x6h1VarC6.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                x6h1 x6h1VarC7 = x6h1VarC6.a().c();
                x6h1VarC7.i.add(new a7h1("queue_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = false;
                y6h1 y6h1VarA2 = x6h1VarC7.a();
                kqn0 kqn0Var = kqn0.a;
                w7h1 w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:queue")), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                ou80 ou80Var3 = o2a0Var.X.m(w7h1Var3, (xj61) null).a;
                o2a0Var.Y.a(w7h1Var3, ou80Var3);
                MobiusLoop mobiusLoop3 = o2a0Var.N0;
                if (mobiusLoop3 != null) {
                    mym.l(mobiusLoop3, new i2a0(ou80Var3));
                    return rih1Var;
                }
                u890.C("mobiusLoop");
                throw null;
        }
    }
}
