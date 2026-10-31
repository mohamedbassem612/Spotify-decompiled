package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m1o implements acr0 {
    public final f89 a;
    public final vn8 b;

    public m1o(f89 f89Var, vn8 vn8Var) {
        this.a = f89Var;
        this.b = vn8Var;
    }

    public final Set a() {
        xj61 xj61Var = new xj61();
        xj61Var.add(blc0.u1);
        xj61Var.add(blc0.A1);
        if (!((f25) this.b.a.get()).a()) {
            xj61Var.add(blc0.m2);
        }
        return cwl1.j(xj61Var);
    }

    public final Class b() {
        return ((yf4) this.a.b.get()).a() ? w2o.class : h1o.class;
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        int iOrdinal = s4b1Var.c.ordinal();
        int i = 1;
        if (iOrdinal != 44 && iOrdinal != 50) {
            if (iOrdinal != 88) {
                eg.m("Link type doesn't match with any Creator link type");
                return null;
            }
            i = 2;
        }
        String strE = s4b1Var.E();
        if (strE == null) {
            strE = "";
        }
        return new l1o(strE, th61Var.a, i, s4b1Var.d());
    }

    public final String getDescription() {
        return "Creator page";
    }
}
