package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class lag1 {
    public final t5y a;
    public final uu00 b;

    public lag1(t5y t5yVar, uu00 uu00Var, mag1 mag1Var) {
        this.a = t5yVar;
        this.b = uu00Var;
    }

    public static Single b(lag1 lag1Var, String str, long j) {
        return lag1Var.a(str, j, new jag1());
    }

    public final Single a(String str, long j, kag1 kag1Var) {
        Set set = s4b1.f;
        String strJ = uic.x(str).j();
        if (strJ == null) {
            strJ = "";
        }
        String str2 = strJ;
        return this.b.b(new oi("transcript-excerpts", false, new ysf1(str, (byte) 9))).filter(n9x0.T0).map(new mcn1(str, (byte) 12)).onErrorReturn(o9x0.T0).firstOrError().flatMap(new b0i0(this, str2, j, kag1Var, str));
    }
}
