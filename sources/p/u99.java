package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import com.spotify.pam.v2.Action;
import com.spotify.pam.v2.ActionTypeMap;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u99 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ z99 a;

    public u99(z99 z99Var) {
        this.a = z99Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        w7h1 w7h1Var;
        tv80 tv80VarM;
        Action actionN;
        h99 h99Var = (h99) obj;
        ajq0 ajq0Var = this.a.a;
        ptf1 ptf1Var = (ptf1) ajq0Var.c;
        int i = h99Var.c;
        s2c1 s2c1Var = h99Var.a;
        String uri = s2c1Var.i;
        String str = s2c1Var.i;
        Object obj2 = null;
        if (h99Var.b) {
            c380 c380Var = s2c1Var.l;
            if (c380Var != null) {
                for (Object obj3 : c380Var) {
                    if (((ActionTypeMap) obj3).o() == s80.ASTRO_GET_DETAILS) {
                        obj2 = obj3;
                        break;
                    }
                }
                ActionTypeMap actionTypeMap = (ActionTypeMap) obj2;
                if (actionTypeMap == null || (actionN = actionTypeMap.n()) == null || (uri = actionN.getUri()) == null) {
                    uri = "";
                }
            } else {
                uri = "";
            }
            tv80VarM = ptf1Var.n(s2c1Var, i, h99Var.d, uri);
        } else {
            int i2 = s2c1Var.f ? 1 : 2;
            i8h1 i8h1Var = (i8h1) ((z1p) ptf1Var.c).get();
            boolean zY = nhc1.Y(uri, "spotify:", false);
            y6h1 y6h1Var = ((yok0) ptf1Var.b).b;
            b7x b7xVar = b7x.a;
            if (zY) {
                x6h1 x6h1VarC = y6h1Var.c();
                x6h1VarC.i.add(new a7h1("plans", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                Integer numValueOf = Integer.valueOf(i);
                x6h1 x6h1VarC2 = y6h1VarA.c();
                x6h1VarC2.i.add(new a7h1("storefront_card", (String) null, numValueOf, str, ktk0.f(i2)));
                x6h1VarC2.j = true;
                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", uri)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
            } else {
                x6h1 x6h1VarC3 = y6h1Var.c();
                x6h1VarC3.i.add(new a7h1("plans", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                y6h1 y6h1VarA2 = x6h1VarC3.a();
                Integer numValueOf2 = Integer.valueOf(i);
                x6h1 x6h1VarC4 = y6h1VarA2.c();
                x6h1VarC4.i.add(new a7h1("storefront_card", (String) null, numValueOf2, str, ktk0.f(i2)));
                x6h1VarC4.j = true;
                w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", uri)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
            }
            tv80VarM = i8h1Var.m(w7h1Var, (xj61) null);
        }
        ajq0.w(ajq0Var, uri, tv80VarM);
        return rih1.a;
    }
}
