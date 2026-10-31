package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ini1 implements acr0 {
    public static final Set c = f46.S0(new String[]{"party", "party-dev", "party-staging"});
    public final ynb0 a;
    public final Set b = Collections.singleton(wni1.d);

    public ini1(ynb0 ynb0Var) {
        this.a = ynb0Var;
    }

    public final Class b() {
        return fni1.class;
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        String strN = s4b1Var.n("entityUri");
        if (strN == null) {
            strN = "";
        }
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(strN);
        String strJ = s4b1VarX.j();
        int i = 0;
        if (s4b1VarX.c == blc0.Bj && o7h.i0(c, s4b1VarX.o(1)) && strJ != null && !nhc1.Y(strJ, "share-", false)) {
            i = 1;
        }
        if (i != 0) {
            return new hni1(i, strN);
        }
        eg.m("entityUri doesn't match any Users Nearby feature");
        return null;
    }

    public final e6w0 d() {
        return new b6w0(false);
    }

    public final Set e() {
        return this.b;
    }

    public final String getDescription() {
        return "Users Nearby";
    }

    public final boolean isEnabled() {
        pni1 pni1Var = (pni1) this.a.get();
        return pni1Var.a() && pni1Var.b.isEnabled();
    }
}
