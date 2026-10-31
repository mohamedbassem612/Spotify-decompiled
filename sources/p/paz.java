package p;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class paz implements du11 {
    public static mjl0 b(String str, r6h1 r6h1Var) {
        List listB;
        a7h1 a7h1Var;
        y6h1 y6h1Var = (y6h1) o7h.C0(r6h1Var.a);
        Integer num = (y6h1Var == null || (listB = y6h1Var.b()) == null || (a7h1Var = (a7h1) o7h.C0(listB)) == null) ? null : a7h1Var.d;
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new mjl0(new bpl0(yon1.j5().c, str, r6h1Var), num, str);
    }

    public final w7h1 a(r6h1 r6h1Var, unb1 unb1Var, String str) {
        if (!(unb1Var instanceof jmb1)) {
            return null;
        }
        mjl0 mjl0VarB = b(str, r6h1Var);
        x6h1 x6h1VarC = mjl0VarB.b.c();
        x6h1VarC.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, str, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, mjl0VarB.c.a, System.currentTimeMillis());
    }

    public final w7h1 c(r6h1 r6h1Var, unb1 unb1Var, String str) {
        if (!(unb1Var instanceof jmb1)) {
            return null;
        }
        mjl0 mjl0VarB = b(str, r6h1Var);
        return new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), mjl0VarB.b, mjl0VarB.c.a, System.currentTimeMillis());
    }
}
