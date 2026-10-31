package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface zu0 extends d0u0 {
    @Override // p.d0u0
    default c0u0 a(m0u0 m0u0Var, oot0 oot0Var, np00 np00Var, String str) {
        xu0 xu0Var;
        Map mapB = m0u0Var.b();
        String str2 = (String) mapB.get("ad_id");
        if (str2 == null) {
            xu0Var = null;
        } else {
            String str3 = (String) mapB.get("duration");
            xu0Var = new xu0(str3 != null ? nhc1.d0(10, str3) : null, str2, (String) mapB.get("media.manifest_id"));
        }
        if (xu0Var == null) {
            return null;
        }
        return q(xu0Var, new yu0(m0u0Var, oot0Var, np00Var));
    }

    c0u0 q(xu0 xu0Var, yu0 yu0Var);
}
