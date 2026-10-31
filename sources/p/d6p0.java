package p;

import com.spotify.mobius.MobiusLoop;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class d6p0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e6p0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6p0(e6p0 e6p0Var, byte b) {
        super(0);
        this.a = b;
        this.b = e6p0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        e6p0 e6p0Var = this.b;
        switch (b) {
            case 0:
                bqk0 bqk0Var = e6p0Var.Q0;
                bqk0Var.getClass();
                x6h1 x6h1VarC = bqk0Var.b.c();
                x6h1VarC.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            default:
                bqk0 bqk0Var2 = e6p0Var.Q0;
                bqk0Var2.getClass();
                x6h1 x6h1VarC3 = bqk0Var2.b.c();
                x6h1VarC3.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("sillywalk_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                w7h1 w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                ou80 ou80Var = e6p0Var.Y.m(w7h1Var, (xj61) null).a;
                e6p0Var.Z.a(w7h1Var, ou80Var);
                MobiusLoop mobiusLoop = e6p0Var.P0;
                if (mobiusLoop != null) {
                    mym.l(mobiusLoop, new l3p0(ou80Var));
                    return rih1.a;
                }
                u890.C("mobiusLoop");
                throw null;
        }
    }
}
