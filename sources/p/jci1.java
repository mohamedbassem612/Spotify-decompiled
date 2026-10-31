package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jci1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mci1 a;

    public jci1(mci1 mci1Var) {
        this.a = mci1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        char c;
        String str;
        e821 e821Var = this.a.a;
        int i = ((bci1) obj).a;
        edi1 edi1Var = (edi1) e821Var.d;
        edi1Var.getClass();
        int iC = l1d.C(i);
        if (iC == 0) {
            c = 1;
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            c = 2;
        }
        i8h1 i8h1VarA = edi1Var.a();
        h7l0 h7l0Var = edi1Var.b;
        x6h1 x6h1VarC = h7l0Var.b.c();
        x6h1VarC.i.add(new a7h1("birthday_input_group", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        if (c == 1) {
            str = "date_not_valid";
        } else {
            if (c != 2) {
                throw null;
            }
            str = "format_not_valid";
        }
        x6h1VarC2.i.add(new a7h1("birthday_input_field_error", (String) null, (Integer) null, (String) null, str));
        x6h1VarC2.j = true;
        y6h1 y6h1VarA = x6h1VarC2.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = h7l0Var.c;
        i8h1VarA.f(k7h1Var.a(), (Set) null);
        return rih1.a;
    }
}
