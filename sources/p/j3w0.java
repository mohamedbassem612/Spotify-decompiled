package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j3w0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k3w0 b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3w0(k3w0 k3w0Var, int i, byte b) {
        super(0);
        this.a = b;
        this.b = k3w0Var;
        this.c = i;
    }

    public final Object invoke() {
        String str;
        byte b = this.a;
        int i = 3;
        int i2 = this.c;
        k3w0 k3w0Var = this.b;
        switch (b) {
            case 0:
                q4w0 q4w0Var = (q4w0) k3w0Var.a.A(i2);
                p3w0 p3w0Var = k3w0Var.b;
                int i3 = q4w0Var.b;
                if (i3 == 1) {
                    str = "Presave";
                } else if (i3 == 2) {
                    str = "Presaved";
                } else {
                    if (i3 != 3) {
                        throw null;
                    }
                    str = "Listen Now";
                }
                String str2 = str;
                zok0 zok0Var = p3w0Var.b;
                x6h1 x6h1VarC = zok0Var.b.c();
                x6h1VarC.i.add(new a7h1("presave_button", str2, (Integer) null, (String) null, str2));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var.e = zok0Var.c;
                return k7h1Var.a();
            default:
                ljd0 ljd0Var = (ljd0) k3w0Var.a.A(i2);
                p3w0 p3w0Var2 = k3w0Var.b;
                String str3 = ljd0Var.a;
                int i4 = ljd0Var.b;
                wcl0 wcl0Var = p3w0Var2.c;
                if (wcl0Var == null) {
                    int iC = l1d.C(i4);
                    if (iC != 0) {
                        if (iC == 1) {
                            i = 2;
                        } else {
                            if (iC != 2) {
                                eg.o();
                                return null;
                            }
                            i = 1;
                        }
                    }
                    wcl0Var = new wcl0(i, null, str3, r6h1.c);
                    p3w0Var2.c = wcl0Var;
                }
                return wcl0Var.e().a;
        }
    }
}
