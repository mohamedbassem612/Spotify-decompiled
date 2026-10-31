package p;

import com.spotify.adsinternal.adscommon.events.proto.AdError;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class j5d1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ esa1 a;
    public final /* synthetic */ c6d1 b;

    public j5d1(esa1 esa1Var, c6d1 c6d1Var) {
        this.a = esa1Var;
        this.b = c6d1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        jx0 jx0Var;
        String str;
        w4d1 w4d1Var = (w4d1) obj;
        g7d1 g7d1Var = w4d1Var.a;
        yf yfVar = w4d1Var.b;
        c6d1 c6d1Var = this.b;
        int iOrdinal = c6d1Var.b.ordinal();
        if (iOrdinal == 0) {
            jx0Var = jx0.c;
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            jx0Var = jx0.i;
        }
        int iOrdinal2 = c6d1Var.a.ordinal();
        if (iOrdinal2 == 0) {
            str = "brand_survey";
        } else {
            if (iOrdinal2 != 1) {
                eg.o();
                return null;
            }
            str = "topic_survey";
        }
        wn0 wn0VarN = AdError.n();
        wn0VarN.n(g7d1Var.a);
        String str2 = g7d1Var.h;
        if (str2 == null) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        wn0VarN.t(str2);
        wn0VarN.r((String) yfVar.a);
        wn0VarN.q((String) yfVar.b);
        String str3 = g7d1Var.g;
        String str4 = str3 != null ? str3 : null;
        wn0VarN.s(str4 != null ? str4 : "");
        wn0VarN.w(jx0Var.a);
        wn0VarN.y(g7d1Var.k);
        wn0VarN.u(str);
        ((t2j0) this.a.c).a(wn0VarN.build());
        return rih1.a;
    }
}
