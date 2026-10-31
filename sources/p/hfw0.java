package p;

import com.spotify.base.java.logging.Logger;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class hfw0 {
    public final i8h1 a;
    public op80 b;

    public hfw0(i8h1 i8h1Var) {
        this.a = i8h1Var;
    }

    public final tv80 a(String str, String str2, boolean z) {
        r6h1 r6h1Var;
        iu30 iu30Var;
        tv80 tv80VarM = null;
        if (str.length() <= 0) {
            hhg1.n("sectionSourceId must not be empty.");
            return null;
        }
        if (this.b == null) {
            Logger.k("No interactionId generated: instrumentationEnvironment is null.", new Object[0]);
        }
        op80 op80Var = this.b;
        if (op80Var != null && z) {
            Integer numN = l0o1.n(op80Var);
            h3h1 h3h1VarC = j0o1.C(op80Var);
            if (h3h1VarC == null || (iu30Var = h3h1VarC.b) == null) {
                r6h1Var = null;
            } else {
                r6h1Var = (r6h1) iu30Var.invoke(Integer.valueOf(numN != null ? numN.intValue() : 0));
            }
            if (r6h1Var != null) {
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-preview";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.c = numN;
                x6h1VarI.d = str;
                tv80VarM = this.a.m(new w7h1("", "", new z7h1("auto", 1, b7x.a), new x7h1("play_preview", 1, Collections.singletonMap("item_to_be_previewed", str2)), x6h1VarI.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
            }
            if (tv80VarM == null) {
                Logger.k(jhc1.J("\n            \"No interactionId generated: \\n\n            - Position: " + numN + ", \\n\n            - UbiParentAbsolutePath: " + h3h1VarC + " \\n\n            - ParentAbsoluteLocation: " + r6h1Var + "\n            "), new Object[0]);
            }
        }
        return tv80VarM;
    }
}
