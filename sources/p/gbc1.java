package p;

import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class gbc1 implements Init {
    public static final gbc1 a = new gbc1();

    public final First e0(Object obj) {
        long jPow;
        lbc1 lbc1Var = (lbc1) obj;
        u4c1 u4c1Var = lbc1Var.a;
        if (!u890.j(u4c1Var, r4c1.a) && !u890.j(u4c1Var, s4c1.a)) {
            return First.b(lbc1Var);
        }
        int i = lbc1Var.b;
        if (i > 0) {
            if (i > 5) {
                i = 5;
            }
            jPow = (long) (Math.pow(2.0d, i) * 200.0d);
        } else {
            jPow = 0;
        }
        return First.c(lbc1Var, Collections.singleton(new y9c1(jPow)));
    }
}
