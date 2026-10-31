package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class jss0 implements u2i1 {
    public static final jss0 a = new jss0();
    public static final List b = p7h.M(new t2i1[]{new t2i1("internal/personal-podcast/onboarding", e710.X0), new t2i1("internal/personal-podcast/onboarding/preset-picker", o810.W0), new t2i1("internal/personal-podcast/onboarding/preset-preview/{preset_id as text}", yb10.X0), new t2i1("internal/personal-podcast/onboarding/preset-submit/{preset_id as text}", eh10.X0), new t2i1("internal/personal-podcast/onboarding/custom-prompt", mi10.X0), new t2i1("internal/personal-podcast/onboarding/personalization/{preset_id as text}", si10.X0), new t2i1("internal/personal-podcast/onboarding/personalization/{preset_id as text}/location-picker", xi10.X0), new t2i1("internal/personal-podcast/onboarding/personalization/{preset_id as text}/questionnaire", dj10.W0)});
    public static final List c = p7h.M(new b3i1[]{mss0.d, qss0.d, rss0.e, sss0.e, lss0.d, nss0.e, oss0.e, pss0.e});
    public static final idd1 d = new idd1(v0r0.a1);

    public final List a() {
        return c;
    }

    public final List b() {
        return b;
    }

    public final v5b1 c(String str) {
        a3i1 a3i1Var = (a3i1) d.getValue();
        Set set = x6b1.e;
        x6b1 x6b1VarL = oqn1.l(str);
        if (x6b1VarL == null) {
            return null;
        }
        return a3i1Var.a(x6b1VarL);
    }
}
