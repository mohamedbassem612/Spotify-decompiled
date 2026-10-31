package p;

import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class iw4 {
    public final zle1 a;
    public final tif1 b;
    public t45 c;
    public boolean d;
    public Function0 e;
    public UUID f;

    public iw4(zle1 zle1Var) {
        tif1 tif1VarF = gex0.f();
        this.a = zle1Var;
        this.b = tif1VarF;
        this.c = ((s45) zle1Var).a("navigate_to_page");
        this.d = true;
    }

    public static void d(iw4 iw4Var, Function0 function0) {
        iw4Var.f = null;
        iw4Var.e = function0;
        iw4Var.e(1, true);
    }

    public final void a(int i) {
        t45 t45Var = this.c;
        if (t45Var != null) {
            t45Var.g(c13.b(i));
        }
        this.b.f(c13.b(i), "ntp");
    }

    public final void b(int i) {
        String str;
        t45 t45Var = this.c;
        if (t45Var != null) {
            t45Var.a("outcome", c13.c(i));
            a(1);
            Function0 function0 = this.e;
            if (function0 != null && (str = (String) function0.invoke()) != null) {
                t45Var.a("page_identifier", str);
            }
            pne1 pne1VarE = t45Var.e();
            UUID uuid = this.f;
            if (uuid != null) {
                pne1VarE = pne1.a(pne1VarE, null, uuid, 447);
            }
            ((s45) this.a).b(pne1VarE);
        }
        this.c = null;
    }

    public final void c() {
        boolean z = this.d;
        int i = 1;
        if (!z) {
            if (z) {
                eg.o();
                return;
            }
            i = 2;
        }
        b(i);
    }

    public final void e(int i, boolean z) {
        t45 t45Var = this.c;
        if (t45Var != null) {
            t45Var.l(c13.b(i), null, z);
        }
        tif1.a(this.b, c13.b(i), "ntp", 4);
    }
}
