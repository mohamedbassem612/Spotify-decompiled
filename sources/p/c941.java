package p;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c941 implements Function0 {
    public final io31 a;
    public final u5f1 b;
    public final String c;

    public c941(io31 io31Var, u5f1 u5f1Var, String str) {
        this.a = io31Var;
        this.b = u5f1Var;
        this.c = str;
    }

    public final Object invoke() {
        io31 io31Var = this.a;
        io31Var.b.getClass();
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-your-library-page";
        x6h1VarI.f = "9.3.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = null;
        y6h1 y6h1VarA = x6h1VarI.a();
        List listSingletonList = Collections.singletonList("yourlibrary");
        if (ho31.a[0] != 1) {
            eg.o();
            return null;
        }
        x6h1 x6h1VarC = y6h1VarA.c();
        x6h1VarC.i.add(new a7h1("tooltip_deprecated", "euterpe", (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA2 = x6h1VarC.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA2;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = listSingletonList;
        ((i8h1) io31Var.a.get()).f(k7h1Var.a(), (Set) null);
        u5f1 u5f1Var = this.b;
        hma1 hma1VarEdit = u5f1Var.b.b(u5f1Var.a, this.c).edit();
        hma1VarEdit.a(v5f1.a, true);
        hma1VarEdit.h();
        return rih1.a;
    }
}
