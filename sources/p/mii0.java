package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public interface mii0 {
    static /* synthetic */ cm0 b(mii0 mii0Var, Function0 function0, epb1 epb1Var, kko kkoVar, ohi0 ohi0Var, Function0 function1, hs00 hs00Var, zox0 zox0Var, apx0 apx0Var, y6w0 y6w0Var, p731 p731Var, int i) {
        hs00 hs00Var2 = hs00Var;
        cgi0 cgi0Var = new cgi0(63);
        if ((i & 64) != 0) {
            hs00Var2 = null;
        }
        if ((i & 128) != 0) {
            zox0Var = null;
        }
        if ((i & 256) != 0) {
            apx0Var = null;
        }
        return mii0Var.a(function0, epb1Var, kkoVar, ohi0Var, cgi0Var, function1, hs00Var2, zox0Var, apx0Var, (i & 512) != 0 ? null : y6w0Var, p731Var);
    }

    cm0 a(Function0 function0, epb1 epb1Var, kko kkoVar, ohi0 ohi0Var, cgi0 cgi0Var, Function0 function1, hs00 hs00Var, iu30 iu30Var, iu30 iu30Var2, vu30 vu30Var, p731 p731Var);
}
