package p;

import java.util.Collections;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yab extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bbb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yab(bbb bbbVar, byte b) {
        super(1);
        this.a = b;
        this.b = bbbVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 0;
        bbb bbbVar = this.b;
        byte b3 = 1;
        switch (b) {
            case 0:
                bbbVar.c(11);
                w6b1 w6b1VarA = f7b1.a(blc0.ph);
                String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
                if (str == null) {
                    str = "";
                }
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-login-and-sign-up-screen";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                y6h1 y6h1VarA = x6h1VarI.a();
                p7h.M(new String[]{"start/choosesignup", "start/chooselogin"});
                x6h1 x6h1VarC = y6h1VarA.c();
                x6h1VarC.i.add(new a7h1("email_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                nyn1.Q(bbbVar.c, new lsn0((String) null, bbbVar.f.j(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis())).a));
                boolean zV = bbbVar.g.v();
                kg0 kg0Var = bbbVar.b;
                if (zV) {
                    kg0.e(kg0Var, new gjt(fjt.a, (String) null), (ifl1) null);
                } else {
                    kg0.e(kg0Var, new yit(y2f0.a, bk8.a, (n5o) null, 12), (ifl1) null);
                }
                return rih1Var;
            case 1:
                bbbVar.a.m(44, jj8.e);
                q5o q5oVar = bbbVar.h;
                xab1 xab1Var = q5oVar.i;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                q5oVar.i = fn31.T(q5oVar.e, (o8n) null, 0, new hxn(q5oVar, c6o.b, (lnm) null, (byte) 1), 3);
                return rih1Var;
            case 2:
                if (zab.a[((jj8) obj).ordinal()] == 1) {
                    return new yab(bbbVar, b3);
                }
                return null;
            default:
                if (abb.a[((jj8) obj).ordinal()] == 1) {
                    return new yab(bbbVar, b2);
                }
                return null;
        }
    }
}
