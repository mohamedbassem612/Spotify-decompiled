package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.android.AndroidLogger;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sm2 extends AndroidLogger {
    public final gid a;

    public sm2(gid gidVar) {
        this.a = gidVar;
    }

    public final void a(Object obj, Object obj2, Next next) {
        xm2 xm2Var = (xm2) obj;
        nm2 nm2Var = (nm2) obj2;
        gid gidVar = this.a;
        py9 py9Var = (py9) gidVar.c;
        i8h1 i8h1Var = (i8h1) gidVar.b;
        String str = xm2Var.a.b;
        super.a(xm2Var, nm2Var, next);
        if (nm2Var.equals(cm2.a)) {
            x6h1 x6h1VarC = py9Var.c.c();
            x6h1VarC.i.add(new a7h1("bad_connection_popup", (String) null, (Integer) null, str, (String) null));
            x6h1VarC.j = true;
            y6h1 y6h1VarA = x6h1VarC.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA;
            ((xjn) k7h1Var).b = py9Var.b;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var.f(k7h1Var.a(), (Set) null);
            return;
        }
        boolean zEquals = nm2Var.equals(cm2.b);
        b7x b7xVar = b7x.a;
        if (zEquals) {
            if (xm2Var instanceof tm2) {
                String str2 = ((tm2) xm2Var).b.b;
                x6h1 x6h1VarC2 = py9Var.c.c();
                x6h1VarC2.i.add(new a7h1("bad_connection_popup", (String) null, (Integer) null, str2, (String) null));
                x6h1VarC2.j = true;
                i8h1Var.m(new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), py9Var.b, System.currentTimeMillis()), (xj61) null);
                return;
            }
            if (xm2Var instanceof um2) {
                String str3 = ((um2) xm2Var).b.b;
                x6h1 x6h1VarC3 = py9Var.c.c();
                x6h1VarC3.i.add(new a7h1("age_verification_popup", (String) null, (Integer) null, str3, (String) null));
                x6h1VarC3.j = true;
                i8h1Var.m(new w7h1("", "", new z7h1("swipe", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), py9Var.b, System.currentTimeMillis()), (xj61) null);
                return;
            }
            return;
        }
        if (!nm2Var.equals(cm2.c)) {
            if (!nm2Var.equals(cm2.d)) {
                if (nm2Var instanceof hm2) {
                    gidVar.g(str);
                    return;
                }
                return;
            }
            if (!(xm2Var instanceof tm2)) {
                if (xm2Var instanceof um2) {
                    gidVar.g(((um2) xm2Var).b.b);
                    return;
                }
                return;
            }
            String str4 = ((tm2) xm2Var).b.b;
            x6h1 x6h1VarC4 = py9Var.c.c();
            x6h1VarC4.i.add(new a7h1("bad_connection_popup", (String) null, (Integer) null, str4, (String) null));
            x6h1VarC4.j = true;
            x6h1 x6h1VarC5 = x6h1VarC4.a().c();
            x6h1VarC5.i.add(new a7h1("try_again_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC5.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("retry", 1, b7xVar), x6h1VarC5.a(), py9Var.b, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (xm2Var instanceof tm2) {
            String str5 = ((tm2) xm2Var).b.b;
            x6h1 x6h1VarC6 = py9Var.c.c();
            x6h1VarC6.i.add(new a7h1("bad_connection_popup", (String) null, (Integer) null, str5, (String) null));
            x6h1VarC6.j = true;
            x6h1 x6h1VarC7 = x6h1VarC6.a().c();
            x6h1VarC7.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC7.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC7.a(), py9Var.b, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (xm2Var instanceof um2) {
            String str6 = ((um2) xm2Var).b.b;
            x6h1 x6h1VarC8 = py9Var.c.c();
            x6h1VarC8.i.add(new a7h1("age_verification_popup", (String) null, (Integer) null, str6, (String) null));
            x6h1VarC8.j = true;
            x6h1 x6h1VarC9 = x6h1VarC8.a().c();
            x6h1VarC9.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC9.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC9.a(), py9Var.b, System.currentTimeMillis()), (xj61) null);
        }
    }
}
