package p;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t51 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v51 b;
    public final /* synthetic */ f51 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t51(f51 f51Var, v51 v51Var, byte b) {
        super(0);
        this.a = b;
        this.c = f51Var;
        this.b = v51Var;
    }

    public final Object invoke() {
        v51 v51Var;
        w7h1 w7h1Var;
        v51 v51Var2;
        w7h1 w7h1Var2;
        w7h1 w7h1Var3;
        w7h1 w7h1Var4;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        v51 v51Var3 = this.b;
        f51 f51Var = this.c;
        switch (b) {
            case 0:
                i8h1 i8h1Var = v51Var3.f;
                int iC = l1d.C(f51Var.c);
                if (iC != 0) {
                    v51Var = v51Var3;
                    if (iC == 1) {
                        y6h1 y6h1Var = y6h1.i;
                        x6h1 x6h1VarI = i3o1.i();
                        x6h1VarI.h = "music";
                        x6h1VarI.a = "mobile-age-signal-signup-ask-parent";
                        x6h1VarI.f = "1.0.0";
                        x6h1VarI.g = "22.0.0";
                        x6h1 x6h1VarR = kk0.r(x6h1VarI, "age-signal/signup/ask-parent");
                        x6h1VarR.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarR.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarR.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        if (iC != 2) {
                            eg.o();
                            return null;
                        }
                        y6h1 y6h1Var2 = y6h1.i;
                        x6h1 x6h1VarI2 = i3o1.i();
                        x6h1VarI2.h = "music";
                        x6h1VarI2.a = "mobile-age-signal-signup-parent-setup";
                        x6h1VarI2.f = "1.1.0";
                        x6h1VarI2.g = "22.0.0";
                        x6h1 x6h1VarR2 = kk0.r(x6h1VarI2, "age-signal/signup/managed-account");
                        x6h1VarR2.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarR2.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarR2.a(), r6h1.c, System.currentTimeMillis());
                    }
                } else {
                    v51Var = v51Var3;
                    y6h1 y6h1Var3 = y6h1.i;
                    x6h1 x6h1VarI3 = i3o1.i();
                    x6h1VarI3.h = "music";
                    x6h1VarI3.a = "mobile-age-signal-signup-confirm-age";
                    x6h1VarI3.f = "1.0.0";
                    x6h1VarI3.g = "22.0.0";
                    x6h1 x6h1VarR3 = kk0.r(x6h1VarI3, "age-signal/signup/confirm-age");
                    x6h1VarR3.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR3.j = false;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarR3.a(), r6h1.c, System.currentTimeMillis());
                }
                i8h1Var.j(w7h1Var);
                v51Var.Z.onNext(u41.a);
                return rih1Var;
            case 1:
                i8h1 i8h1Var2 = v51Var3.f;
                int iC2 = l1d.C(f51Var.c);
                if (iC2 != 0) {
                    v51Var2 = v51Var3;
                    if (iC2 == 1) {
                        y6h1 y6h1Var4 = y6h1.i;
                        x6h1 x6h1VarI4 = i3o1.i();
                        x6h1VarI4.h = "music";
                        x6h1VarI4.a = "mobile-age-signal-signup-ask-parent";
                        x6h1VarI4.f = "1.0.0";
                        x6h1VarI4.g = "22.0.0";
                        x6h1 x6h1VarR4 = kk0.r(x6h1VarI4, "age-signal/signup/ask-parent");
                        x6h1VarR4.i.add(new a7h1("go_back_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarR4.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarR4.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        if (iC2 != 2) {
                            eg.o();
                            return null;
                        }
                        y6h1 y6h1Var5 = y6h1.i;
                        x6h1 x6h1VarI5 = i3o1.i();
                        x6h1VarI5.h = "music";
                        x6h1VarI5.a = "mobile-age-signal-signup-parent-setup";
                        x6h1VarI5.f = "1.1.0";
                        x6h1VarI5.g = "22.0.0";
                        x6h1 x6h1VarR5 = kk0.r(x6h1VarI5, "age-signal/signup/managed-account");
                        x6h1VarR5.i.add(new a7h1("go_back_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarR5.j = false;
                        w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarR5.a(), r6h1.c, System.currentTimeMillis());
                    }
                } else {
                    v51Var2 = v51Var3;
                    y6h1 y6h1Var6 = y6h1.i;
                    x6h1 x6h1VarI6 = i3o1.i();
                    x6h1VarI6.h = "music";
                    x6h1VarI6.a = "mobile-age-signal-signup-confirm-age";
                    x6h1VarI6.f = "1.0.0";
                    x6h1VarI6.g = "22.0.0";
                    x6h1 x6h1VarR6 = kk0.r(x6h1VarI6, "age-signal/signup/confirm-age");
                    x6h1VarR6.i.add(new a7h1("go_back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarR6.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarR6.a(), r6h1.c, System.currentTimeMillis());
                }
                i8h1Var2.j(w7h1Var2);
                v51Var2.Q0.onNext(new kn00(false, (tn00) null));
                return rih1Var;
            case 2:
                int iC3 = l1d.C(f51Var.c);
                if (iC3 != 0) {
                    if (iC3 == 1) {
                        y6h1 y6h1Var7 = y6h1.i;
                        x6h1 x6h1VarI7 = i3o1.i();
                        x6h1VarI7.h = "music";
                        x6h1VarI7.a = "mobile-age-signal-signup-ask-parent";
                        x6h1VarI7.f = "1.0.0";
                        x6h1VarI7.g = "22.0.0";
                        x6h1 x6h1VarR7 = kk0.r(x6h1VarI7, "age-signal/signup/ask-parent");
                        x6h1VarR7.i.add(new a7h1("go_back_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarR7.j = false;
                        w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarR7.a(), r6h1.c, System.currentTimeMillis());
                    } else {
                        if (iC3 != 2) {
                            eg.o();
                            return null;
                        }
                        y6h1 y6h1Var8 = y6h1.i;
                        x6h1 x6h1VarI8 = i3o1.i();
                        x6h1VarI8.h = "music";
                        x6h1VarI8.a = "mobile-age-signal-signup-parent-setup";
                        x6h1VarI8.f = "1.1.0";
                        x6h1VarI8.g = "22.0.0";
                        x6h1 x6h1VarR8 = kk0.r(x6h1VarI8, "age-signal/signup/managed-account");
                        x6h1VarR8.i.add(new a7h1("ask_guardian_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarR8.j = false;
                        y6h1 y6h1VarA = x6h1VarR8.a();
                        String str = nik1.a7.a;
                        z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                        if (str == null) {
                            str = "";
                        }
                        w7h1Var4 = new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, r6h1.c, System.currentTimeMillis());
                    }
                    w7h1Var3 = w7h1Var4;
                } else {
                    w7h1Var3 = null;
                }
                if (w7h1Var3 != null) {
                    v51Var3.f.j(w7h1Var3);
                }
                return rih1Var;
            default:
                int i = f51Var.c;
                t51 t51Var = new t51(f51Var, v51Var3, (byte) 2);
                u51 u51Var = new u51(v51Var3, (byte) 0);
                u51 u51Var2 = new u51(v51Var3, (byte) 1);
                int iC4 = l1d.C(i);
                if (iC4 != 0) {
                    if (iC4 == 1) {
                        t51Var.invoke();
                        u51Var.invoke();
                    } else {
                        if (iC4 != 2) {
                            eg.o();
                            return null;
                        }
                        t51Var.invoke();
                        u51Var2.invoke();
                    }
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t51(v51 v51Var, f51 f51Var, byte b) {
        super(0);
        this.a = b;
        this.b = v51Var;
        this.c = f51Var;
    }
}
