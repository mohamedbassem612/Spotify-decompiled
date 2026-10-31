package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rss {
    public final kt91 a;
    public final kly0 b;
    public final r6h1 c;

    public rss(kt91 kt91Var, caq caqVar, r6h1 r6h1Var) {
        this.a = kt91Var;
        this.b = caqVar;
        this.c = r6h1Var;
    }

    public final void a(zva1 zva1Var, Function0 function0) {
        pss pssVar;
        Integer num;
        View.OnClickListener jl5Var;
        qss qssVar;
        if (zva1Var instanceof yva1) {
            int iOrdinal = ((yva1) zva1Var).a.ordinal();
            if (iOrdinal == 0) {
                pssVar = new pss(2131962843, 3, new qss(2, 1));
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return;
                }
                pssVar = new pss(2131962842, 2, new qss(1, 2));
            }
        } else {
            if (!zva1Var.equals(xva1.a)) {
                eg.o();
                return;
            }
            pssVar = new pss(2131962834, 1, null);
        }
        wqk0 wqk0Var = new wqk0(pssVar.b, this.c, (byte) 24);
        int i = pssVar.a;
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        Integer numValueOf = Integer.valueOf(i);
        lw6 lw6Var = new lw6(this, wqk0Var, (byte) 3);
        if (function0 == null || (qssVar = pssVar.c) == null) {
            num = null;
            jl5Var = null;
        } else {
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{numValueOf});
            jl5Var = new jl5(wqk0Var, qssVar, this, function0, (byte) 4);
            num = 2131962841;
        }
        er91 er91Var = new er91((fs91) null, "", numValueOf, (String) null, num, jl5Var, (cvr) null, lw6Var, false);
        kt91 kt91Var = this.a;
        if (kt91Var.g()) {
            kt91Var.k(er91Var);
        } else {
            kt91Var.o(er91Var);
        }
    }
}
