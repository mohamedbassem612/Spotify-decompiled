package p;

import android.os.Bundle;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vta1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yta1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vta1(yta1 yta1Var, byte b) {
        super(0);
        this.a = b;
        this.b = yta1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        byte b2 = 3;
        b7x b7xVar = b7x.a;
        byte b3 = 0;
        rih1 rih1Var = rih1.a;
        yta1 yta1Var = this.b;
        switch (b) {
            case 0:
                esa1 esa1Var = yta1Var.d;
                i8h1 i8h1Var = (i8h1) ((ynb0) esa1Var.b).get();
                x6h1 x6h1VarC = ((tdl0) esa1Var.c).b.c();
                x6h1VarC.i.add(new a7h1("message", "turn_off_speed_changes", (Integer) null, (String) null, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("secondary_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 1:
                yta1Var.c(new vta1(yta1Var, b3));
                return rih1Var;
            case 2:
                bua1 bua1Var = yta1Var.a;
                if (!(bua1Var instanceof bua1)) {
                    eg.m("Check failed.");
                    return null;
                }
                esa1 esa1Var2 = yta1Var.d;
                String str = bua1Var.b;
                i8h1 i8h1Var2 = (i8h1) ((ynb0) esa1Var2.b).get();
                x6h1 x6h1VarC3 = ((tdl0) esa1Var2.c).b.c();
                x6h1VarC3.i.add(new a7h1("message", "opt_in", (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                tv80 tv80VarM = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                fn31.T(yta1Var.i, (o8n) null, 0, new wta1(yta1Var, null, (byte) 0), 3);
                yta1Var.h.a(bua1Var.b, tv80VarM, (Bundle) null);
                return rih1Var;
            case 3:
                esa1 esa1Var3 = yta1Var.d;
                fua1 fua1Var = yta1Var.k;
                i8h1 i8h1Var3 = (i8h1) ((ynb0) esa1Var3.b).get();
                tdl0 tdl0Var = (tdl0) esa1Var3.c;
                int iB = fj30.B(fua1Var);
                x6h1 x6h1VarC5 = tdl0Var.b.c();
                x6h1VarC5.i.add(new a7h1("message", knl0.f(iB), (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = true;
                x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                x6h1VarC6.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC6.j = false;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 4:
                yta1Var.c(new vta1(yta1Var, b2));
                return rih1Var;
            case 5:
                esa1 esa1Var4 = yta1Var.d;
                i8h1 i8h1Var4 = (i8h1) ((ynb0) esa1Var4.b).get();
                x6h1 x6h1VarC7 = ((tdl0) esa1Var4.c).b.c();
                x6h1VarC7.i.add(new a7h1("message", "opt_in", (Integer) null, (String) null, (String) null));
                x6h1VarC7.j = true;
                x6h1 x6h1VarC8 = x6h1VarC7.a().c();
                x6h1VarC8.i.add(new a7h1("secondary_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC8.j = false;
                i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC8.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                return rih1Var;
            case 6:
                yta1Var.c(new vta1(yta1Var, (byte) 5));
                return rih1Var;
            case 7:
                esa1 esa1Var5 = yta1Var.d;
                i8h1 i8h1Var5 = (i8h1) ((ynb0) esa1Var5.b).get();
                x6h1 x6h1VarC9 = ((tdl0) esa1Var5.c).b.c();
                x6h1VarC9.i.add(new a7h1("message", "turn_off_speed_changes", (Integer) null, (String) null, (String) null));
                x6h1VarC9.j = true;
                x6h1 x6h1VarC10 = x6h1VarC9.a().c();
                x6h1VarC10.i.add(new a7h1("primary_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC10.j = false;
                i8h1Var5.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                fn31.T(yta1Var.i, (o8n) null, 0, new wta1(yta1Var, null, (byte) 1), 3);
                return rih1Var;
            default:
                if (yta1Var.a instanceof cua1) {
                    yta1Var.c(new vta1(yta1Var, (byte) 7));
                    return rih1Var;
                }
                eg.m("Check failed.");
                return null;
        }
    }
}
