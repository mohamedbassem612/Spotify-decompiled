package p;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q1i1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vbe1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q1i1(vbe1 vbe1Var, byte b) {
        super(3);
        this.a = b;
        this.b = vbe1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        w7h1 w7h1Var;
        byte b = this.a;
        vbe1 vbe1Var = this.b;
        switch (b) {
            case 0:
                l1i1 l1i1Var = (n1i1) obj2;
                tqw tqwVar = (tqw) obj3;
                if (l1i1Var instanceof l1i1) {
                    str = l1i1Var.a;
                } else {
                    if (!(l1i1Var instanceof m1i1)) {
                        eg.o();
                        return null;
                    }
                    str = ((m1i1) l1i1Var).a;
                }
                ((a1r0) vbe1Var.d).g();
                if (!ihc1.y0(str)) {
                    Set set = s4b1.f;
                    if (!uic.u(str) || tqwVar == null) {
                        zhh1 zhh1Var = (zhh1) vbe1Var.f;
                        Activity activity = (Activity) vbe1Var.g;
                        Uri uri = Uri.parse(str);
                        xxf xxfVar = yxf.b;
                        xxf xxfVar2 = xxf.b;
                        if (xxfVar == xxfVar2) {
                            n57.e("CheckoutSource must not be " + xxfVar2);
                        }
                        x8g x8gVar = zhh1Var.a;
                        v5g v5gVarB = x8gVar.c(uri) ? x8gVar.b(xxfVar, uri) : null;
                        activity.startActivity(v5gVarB != null ? x8g.a(activity, v5gVarB) : zhh1Var.b.a(activity, new lyf(xxfVar, new jyf(activity.getString(2131953829)), uri)));
                    } else {
                        ((lzn0) vbe1Var.c).a(str, n3o1.y(tqwVar), (Bundle) null);
                    }
                }
                return rih1.a;
            default:
                l1i1 l1i1Var2 = (n1i1) obj3;
                String strJ0 = ((w1i1) vbe1Var.e).J0();
                r6h1 r6h1Var = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-upsells-sheet";
                x6h1VarI.f = "1.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = strJ0;
                y6h1 y6h1VarA = x6h1VarI.a();
                boolean z = l1i1Var2 instanceof l1i1;
                b7x b7xVar = b7x.a;
                if (z) {
                    String str2 = l1i1Var2.a;
                    if (ihc1.y0(str2)) {
                        x6h1 x6h1VarC = y6h1VarA.c();
                        x6h1VarC.i.add(new a7h1("primary_cta_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), r6h1Var, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC2 = y6h1VarA.c();
                        x6h1VarC2.i.add(new a7h1("primary_cta_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC2.a(), r6h1Var, System.currentTimeMillis());
                    }
                } else {
                    if (!(l1i1Var2 instanceof m1i1)) {
                        eg.o();
                        return null;
                    }
                    String str3 = ((m1i1) l1i1Var2).a;
                    if (ihc1.y0(str3)) {
                        x6h1 x6h1VarC3 = y6h1VarA.c();
                        x6h1VarC3.i.add(new a7h1("secondary_cta_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis());
                    } else {
                        x6h1 x6h1VarC4 = y6h1VarA.c();
                        x6h1VarC4.i.add(new a7h1("secondary_cta_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str3)), x6h1VarC4.a(), r6h1Var, System.currentTimeMillis());
                    }
                }
                return w7h1Var;
        }
    }
}
