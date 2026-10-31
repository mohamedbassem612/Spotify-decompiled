package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gci1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mci1 a;

    public gci1(mci1 mci1Var) {
        this.a = mci1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        edi1 edi1Var = (edi1) this.a.a.d;
        i8h1 i8h1VarA = edi1Var.a();
        x6h1 x6h1VarC = edi1Var.b.b.c();
        x6h1VarC.i.add(new a7h1("name_input_field", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        i8h1VarA.m(new w7h1("", "", new z7h1("key_stroke", 1, b7x.a), new x7h1("text_edit", 1, Collections.singletonMap("field_to_be_changed", "name")), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
        return rih1.a;
    }
}
