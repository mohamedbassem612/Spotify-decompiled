package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hci1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mci1 a;

    public hci1(mci1 mci1Var) {
        this.a = mci1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        dci1 dci1Var = (dci1) obj;
        e821 e821Var = this.a.a;
        String str = dci1Var.a;
        String str2 = dci1Var.b;
        xk xkVar = (xk) e821Var.b;
        il ilVar = il.b;
        lik1 lik1VarF = xkVar.f(ilVar);
        edi1 edi1Var = (edi1) e821Var.d;
        String str3 = lik1VarF.a;
        i8h1 i8h1VarA = edi1Var.a();
        x6h1 x6h1VarC = edi1Var.b.b.c();
        x6h1VarC.i.add(new a7h1("continue_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        xkVar.c(ilVar, i8h1VarA.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), mno1.h(new mmr0[]{new mmr0("name", str), new mmr0("birthday", str2)}));
        return rih1.a;
    }
}
