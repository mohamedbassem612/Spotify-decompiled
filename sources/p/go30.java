package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class go30 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kp5 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ hrr0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ go30(kp5 kp5Var, Function0 function0, hrr0 hrr0Var, byte b) {
        super(0);
        this.a = b;
        this.b = kp5Var;
        this.c = function0;
        this.d = hrr0Var;
    }

    public final Object invoke() {
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        kp5 kp5Var = this.b;
        hrr0 hrr0Var = this.d;
        switch (b) {
            case 0:
                kp5Var.getClass();
                int iC = l1d.C(1);
                if (iC == 0) {
                    i = 2;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    i = 1;
                }
                i8h1 i8h1Var = (i8h1) kp5Var.a;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-send-friend-request-bottom-sheet";
                x6h1VarI.f = "1.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = dsl0.b(i);
                x6h1 x6h1VarR = kk0.r(x6h1VarI, "friend-invite-sheet");
                x6h1VarR.i.add(new a7h1("dismiss_interaction", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR.j = false;
                y6h1 y6h1VarA = x6h1VarR.a();
                b7x b7xVar = b7x.a;
                i8h1Var.m(new w7h1("", "", new z7h1("drag", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                hrr0Var.setValue(Boolean.FALSE);
                kp5Var.r();
                function0.invoke();
                return rih1Var;
            default:
                hrr0Var.setValue(Boolean.FALSE);
                kp5Var.r();
                function0.invoke();
                return rih1Var;
        }
    }
}
