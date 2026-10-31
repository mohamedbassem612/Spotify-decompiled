package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobius.MobiusLoop;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ab51 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ db51 b;

    public /* synthetic */ ab51(db51 db51Var, byte b) {
        this.a = b;
        this.b = db51Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        w8c0 w8c0Var = w8c0.a;
        rih1 rih1Var = rih1.a;
        db51 db51Var = this.b;
        switch (b) {
            case 0:
                db51Var.c();
                return rih1Var;
            case 1:
                String str = (String) obj;
                if (((ap41) db51Var).b.i != w8c0Var) {
                    Logger.b(gvg.e(System.identityHashCode(db51Var), "[CAL] SearchScreen(", ") onSearchTextChanged"), new Object[0]);
                    xok0 xok0Var = db51Var.U0;
                    xok0Var.getClass();
                    x6h1 x6h1VarC = xok0Var.b.c();
                    x6h1VarC.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    w7h1 w7h1Var = new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("change_search_query", 1, Collections.singletonMap("search_query_string", str == null ? "" : str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                    db51Var.R0.a(w7h1Var, db51Var.Q0.m(w7h1Var, (xj61) null).a);
                    MobiusLoop mobiusLoop = db51Var.V0;
                    if (mobiusLoop == null) {
                        u890.C("mobiusLoop");
                        throw null;
                    }
                    mym.l(mobiusLoop, new k151(str));
                }
                return rih1Var;
            default:
                String str2 = (String) obj;
                if (((ap41) db51Var).b.i != w8c0Var) {
                    Logger.b(gvg.e(System.identityHashCode(db51Var), "[CAL] SearchScreen(", ") onSearchSubmitted"), new Object[0]);
                    xok0 xok0Var2 = db51Var.U0;
                    xok0Var2.getClass();
                    x6h1 x6h1VarC3 = xok0Var2.b.c();
                    x6h1VarC3.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                    x6h1VarC4.i.add(new a7h1("input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    w7h1 w7h1Var2 = new w7h1("", "", new z7h1("key_stroke", 1, b7xVar), new x7h1("search", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                    db51Var.R0.a(w7h1Var2, db51Var.Q0.m(w7h1Var2, (xj61) null).a);
                    MobiusLoop mobiusLoop2 = db51Var.V0;
                    if (mobiusLoop2 == null) {
                        u890.C("mobiusLoop");
                        throw null;
                    }
                    mym.l(mobiusLoop2, new l151(str2));
                }
                return rih1Var;
        }
    }
}
