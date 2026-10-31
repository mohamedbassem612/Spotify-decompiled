package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xbb implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ scb a;

    public xbb(scb scbVar) {
        this.a = scbVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        teb tebVar = (teb) this.a.a.b;
        if (!tebVar.b) {
            tebVar.b = true;
            ((ohv0) tebVar.e).a(new mhv0(((gp41) tebVar.d).a, "email", ew80.b, (String) null));
            i8h1 i8h1Var = (i8h1) tebVar.f;
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-login-and-sign-up-screen";
            x6h1VarI.f = "1.0.0";
            x6h1VarI.g = "22.0.0";
            y6h1 y6h1VarA = x6h1VarI.a();
            p7h.M(new String[]{"start/choosesignup", "start/chooselogin"});
            x6h1 x6h1VarC = y6h1VarA.c();
            x6h1VarC.i.add(new a7h1("email_field", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            i8h1Var.j(new w7h1("", "", new z7h1("key_stroke", 1, b7x.a), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()));
        }
        return rih1.a;
    }
}
