package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hhr {
    public final i8h1 a;

    public hhr(i8h1 i8h1Var) {
        this.a = i8h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-wear-app-onboarding-notification";
        x6h1VarI.f = "2.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.e = "wearAppOnboarding";
        x6h1VarI.a();
    }

    public static yok0 a(int i) {
        int iC = l1d.C(i);
        int i2 = 1;
        if (iC != 0) {
            if (iC == 1) {
                i2 = 2;
            } else {
                if (iC != 2) {
                    eg.o();
                    return null;
                }
                i2 = 3;
            }
        }
        r6h1 r6h1Var = r6h1.c;
        return new yok0(i2);
    }

    public void b(int i, String str) {
        int iC = l1d.C(i);
        b7x b7xVar = b7x.a;
        i8h1 i8h1Var = this.a;
        if (iC != 0) {
            if (iC != 1) {
                eg.o();
                return;
            }
            y6h1 y6h1Var = y6h1.i;
            x6h1 x6h1VarI = i3o1.i();
            x6h1VarI.h = "music";
            x6h1VarI.a = "mobile-your-library-audiobook-progress-nudge";
            x6h1VarI.f = "2.0.0";
            x6h1VarI.g = "22.0.0";
            x6h1VarI.d = str;
            y6h1 y6h1VarA = x6h1VarI.a();
            Collections.singletonList("any");
            i8h1Var.m(new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
            return;
        }
        y6h1 y6h1Var2 = y6h1.i;
        x6h1 x6h1VarI2 = i3o1.i();
        x6h1VarI2.h = "music";
        x6h1VarI2.a = "mobile-your-library-audiobook-progress-nudge";
        x6h1VarI2.f = "2.0.0";
        x6h1VarI2.g = "22.0.0";
        x6h1VarI2.d = str;
        x6h1 x6h1VarR = kk0.r(x6h1VarI2, "any");
        x6h1VarR.i.add(new a7h1("overlay", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarR.j = false;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarR.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }
}
