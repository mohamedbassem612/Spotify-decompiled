package p;

import android.os.Bundle;
import com.spotify.support.assertion.Assertion;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q9x0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xmu0 b;

    public /* synthetic */ q9x0(xmu0 xmu0Var, byte b) {
        this.a = b;
        this.b = xmu0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.support.assertion.Assertion$RecoverableAssertionError */
    public final void accept(Object obj) throws Assertion.RecoverableAssertionError {
        tv80 tv80VarM;
        int i;
        byte b = this.a;
        Bundle bundle = null;
        xmu0 xmu0Var = this.b;
        switch (b) {
            case 0:
                q8x0 q8x0Var = (q8x0) obj;
                String strG = pcf.g(q8x0Var.c);
                tv80 tv80Var = q8x0Var.d;
                lzn0 lzn0Var = (lzn0) xmu0Var.b;
                if (tv80Var != null) {
                    lzn0Var.a(strG, tv80Var, (Bundle) null);
                    return;
                } else {
                    lzn0Var.h(strG);
                    return;
                }
            default:
                r8x0 r8x0Var = (r8x0) obj;
                String str = r8x0Var.c;
                int i2 = r8x0Var.d;
                nbx0 nbx0Var = r8x0Var.e;
                s880 s880Var = (s880) xmu0Var.c;
                idd1 idd1Var = (idd1) s880Var.a;
                i8h1 i8h1Var = (i8h1) s880Var.b;
                Set set = s4b1.f;
                int iOrdinal = uic.x(((sbx0) ((hvp0) s880Var.c).b).a).c.ordinal();
                b7x b7xVar = b7x.a;
                if (iOrdinal == 705) {
                    uql0 uql0Var = (uql0) ((idd1) s880Var.e).getValue();
                    uql0Var.getClass();
                    x6h1 x6h1VarC = uql0Var.a.c();
                    x6h1VarC.i.add(new a7h1("recently_played_artists", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    Integer numValueOf = Integer.valueOf(i2);
                    x6h1 x6h1VarC2 = y6h1VarA.c();
                    x6h1VarC2.i.add(new a7h1("artist", (String) null, numValueOf, str, (String) null));
                    x6h1VarC2.j = true;
                    bundle = null;
                    tv80VarM = i8h1Var.m(new w7h1("gui", "user", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (iOrdinal == 706) {
                    tpl0 tpl0Var = (tpl0) ((idd1) s880Var.h).getValue();
                    tpl0Var.getClass();
                    x6h1 x6h1VarC3 = tpl0Var.b.c();
                    x6h1VarC3.i.add(new a7h1("blocked_users_list", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC3.a();
                    Integer numValueOf2 = Integer.valueOf(i2);
                    x6h1 x6h1VarC4 = y6h1VarA2.c();
                    x6h1VarC4.i.add(new a7h1("blocked_user", (String) null, numValueOf2, str, (String) null));
                    x6h1VarC4.j = false;
                    bundle = null;
                    tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC4.a(), tpl0Var.a, System.currentTimeMillis()), (xj61) null);
                } else if (iOrdinal == 717) {
                    hql0 hql0Var = (hql0) ((idd1) s880Var.f).getValue();
                    hql0Var.getClass();
                    x6h1 x6h1VarC5 = hql0Var.b.c();
                    x6h1VarC5.i.add(new a7h1("followers_list", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    y6h1 y6h1VarA3 = x6h1VarC5.a();
                    Integer numValueOf3 = Integer.valueOf(i2);
                    x6h1 x6h1VarC6 = y6h1VarA3.c();
                    x6h1VarC6.i.add(new a7h1("follower", (String) null, numValueOf3, str, (String) null));
                    x6h1VarC6.j = true;
                    tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC6.a(), hql0Var.a, System.currentTimeMillis()), (xj61) null);
                } else if (iOrdinal == 718) {
                    jql0 jql0Var = (jql0) ((idd1) s880Var.g).getValue();
                    jql0Var.getClass();
                    x6h1 x6h1VarC7 = jql0Var.b.c();
                    x6h1VarC7.i.add(new a7h1("following_list", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    y6h1 y6h1VarA4 = x6h1VarC7.a();
                    Integer numValueOf4 = Integer.valueOf(i2);
                    x6h1 x6h1VarC8 = y6h1VarA4.c();
                    x6h1VarC8.i.add(new a7h1("following", (String) null, numValueOf4, str, (String) null));
                    x6h1VarC8.j = true;
                    tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC8.a(), jql0Var.a, System.currentTimeMillis()), (xj61) null);
                } else if (iOrdinal != 720) {
                    if (iOrdinal != 723) {
                        throw new Assertion.RecoverableAssertionError("Unsupported link type", (String) null);
                    }
                    sql0 sql0Var = (sql0) ((idd1) s880Var.d).getValue();
                    sql0Var.getClass();
                    x6h1 x6h1VarC9 = sql0Var.a.c();
                    x6h1VarC9.i.add(new a7h1("public_playlists", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC9.j = false;
                    y6h1 y6h1VarA5 = x6h1VarC9.a();
                    Integer numValueOf5 = Integer.valueOf(i2);
                    x6h1 x6h1VarC10 = y6h1VarA5.c();
                    x6h1VarC10.i.add(new a7h1("playlist", (String) null, numValueOf5, str, (String) null));
                    x6h1VarC10.j = true;
                    tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC10.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (nbx0Var.equals(fbx0.a)) {
                    pql0 pql0Var = (pql0) idd1Var.getValue();
                    pql0Var.getClass();
                    x6h1 x6h1VarC11 = pql0Var.a.c();
                    x6h1VarC11.i.add(new a7h1("friends_list", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC11.j = false;
                    y6h1 y6h1VarA6 = x6h1VarC11.a();
                    Integer numValueOf6 = Integer.valueOf(i2);
                    x6h1 x6h1VarC12 = y6h1VarA6.c();
                    x6h1VarC12.i.add(new a7h1("friend", (String) null, numValueOf6, str, (String) null));
                    x6h1VarC12.j = true;
                    tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC12.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (nbx0Var.equals(hbx0.a)) {
                    pql0 pql0Var2 = (pql0) idd1Var.getValue();
                    pql0Var2.getClass();
                    x6h1 x6h1VarC13 = pql0Var2.a.c();
                    x6h1VarC13.i.add(new a7h1("invited_list", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC13.j = false;
                    y6h1 y6h1VarA7 = x6h1VarC13.a();
                    Integer numValueOf7 = Integer.valueOf(i2);
                    x6h1 x6h1VarC14 = y6h1VarA7.c();
                    x6h1VarC14.i.add(new a7h1("invited_user", (String) null, numValueOf7, str, (String) null));
                    x6h1VarC14.j = true;
                    tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC14.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else if (nbx0Var.equals(gbx0.a)) {
                    pql0 pql0Var3 = (pql0) idd1Var.getValue();
                    pql0Var3.getClass();
                    x6h1 x6h1VarC15 = pql0Var3.a.c();
                    x6h1VarC15.i.add(new a7h1("friend_requests_list", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC15.j = false;
                    y6h1 y6h1VarA8 = x6h1VarC15.a();
                    Integer numValueOf8 = Integer.valueOf(i2);
                    x6h1 x6h1VarC16 = y6h1VarA8.c();
                    x6h1VarC16.i.add(new a7h1("friend_request", (String) null, numValueOf8, str, (String) null));
                    x6h1VarC16.j = true;
                    tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC16.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                } else {
                    if (!(nbx0Var instanceof kbx0)) {
                        throw new Assertion.RecoverableAssertionError("Unsupported friend item type", (String) null);
                    }
                    pql0 pql0Var4 = (pql0) idd1Var.getValue();
                    pql0Var4.getClass();
                    x6h1 x6h1VarC17 = pql0Var4.a.c();
                    x6h1VarC17.i.add(new a7h1("suggested_users_list", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC17.j = false;
                    y6h1 y6h1VarA9 = x6h1VarC17.a();
                    Integer numValueOf9 = Integer.valueOf(i2);
                    switch (l1d.C(((kbx0) nbx0Var).a)) {
                        case 0:
                            i = 8;
                            break;
                        case 1:
                            i = 3;
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = 1;
                            break;
                        case 4:
                            i = 6;
                            break;
                        case 5:
                            i = 4;
                            break;
                        case 6:
                            i = 5;
                            break;
                        case 7:
                            i = 7;
                            break;
                        case 8:
                            i = 9;
                            break;
                        default:
                            eg.o();
                            return;
                    }
                    x6h1 x6h1VarC18 = y6h1VarA9.c();
                    x6h1VarC18.i.add(new a7h1("suggested_user", (String) null, numValueOf9, str, knl0.b(i)));
                    x6h1VarC18.j = true;
                    tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC18.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                ((lzn0) xmu0Var.b).a(str, tv80VarM, bundle);
                return;
        }
    }
}
