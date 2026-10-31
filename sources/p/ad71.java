package p;

import android.net.Uri;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ad71 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bd71 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ad71(bd71 bd71Var, byte b) {
        super(3);
        this.a = b;
        this.b = bd71Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        tv80 tv80VarY;
        String str;
        byte b = this.a;
        bd71 bd71Var = this.b;
        bwn0 bwn0Var = null;
        switch (b) {
            case 0:
                zc71 zc71Var = (zc71) obj;
                tqw tqwVar = (tqw) obj3;
                if (!((yc71) obj2).equals(yc71.a)) {
                    eg.o();
                    return null;
                }
                z0g z0gVarB = bd71Var.a.b();
                String str2 = z0gVarB != null ? z0gVarB.b : null;
                if (str2 == null) {
                    n57.e("No active session when opening parental consent URL.");
                } else {
                    if (tqwVar != null) {
                        tv80VarY = n3o1.y(tqwVar);
                    } else {
                        tv80VarY = bd71Var.g;
                        bd71Var.g = null;
                    }
                    dwr0 dwr0Var = bd71Var.b;
                    String strA = dwr0.a("https://www.spotify.com/account/in-app-parental-consent", str2, zc71Var.a);
                    g8h1 g8h1Var = dwr0Var.a;
                    Uri uri = Uri.parse(strA);
                    if (tv80VarY != null) {
                        g8h1Var.getClass();
                        bwn0Var = new bwn0(tv80VarY);
                    }
                    Uri uriB = g8h1Var.b(uri, bwn0Var);
                    bd71Var.e.invoke(uriB.toString(), tv80VarY);
                    dfa0 dfa0VarC = g8h1.c(uriB);
                    if (dfa0VarC != null && (str = dfa0VarC.f) != null) {
                        g8h1Var.b.j().a(new cwz(str.concat(":end")));
                    }
                }
                return rih1.a;
            default:
                zc71 zc71Var2 = (zc71) obj;
                if (!(((yc71) obj3) instanceof yc71)) {
                    eg.o();
                    return null;
                }
                a1g a1gVar = bd71Var.a;
                i8h1 i8h1Var = bd71Var.d;
                h4l0 h4l0Var = bd71Var.f;
                z0g z0gVarB2 = a1gVar.b();
                if (z0gVarB2 == null) {
                    n57.e("No active session when logging UBI for parental consent button hit.");
                    return null;
                }
                String strA2 = dwr0.a("https://www.spotify.com/account/in-app-parental-consent", z0gVarB2.b, zc71Var2.a);
                h4l0Var.getClass();
                y6h1 y6h1Var = h4l0Var.b;
                x6h1 x6h1VarC = y6h1Var.c();
                x6h1VarC.i.add(new a7h1("log_into_this_device_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                x7h1 x7h1Var = new x7h1("ui_navigate", 1, Collections.singletonMap("destination", strA2));
                r6h1 r6h1Var = r6h1.c;
                w7h1 w7h1Var = new w7h1("", "", z7h1Var, x7h1Var, y6h1VarA, r6h1Var, System.currentTimeMillis());
                if (!bd71Var.c.a()) {
                    x6h1 x6h1VarC2 = y6h1Var.c();
                    x6h1VarC2.i.add(new a7h1("non_ephemeral_custom_tab", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = true;
                    y6h1 y6h1VarA2 = x6h1VarC2.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA2;
                    ((xjn) k7h1Var).b = r6h1Var;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var.e = h4l0Var.c;
                    i8h1Var.i(k7h1Var.a());
                }
                if (z0gVarB2.a != 1) {
                    return w7h1Var;
                }
                bd71Var.g = i8h1Var.j(w7h1Var);
                return null;
        }
    }
}
