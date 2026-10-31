package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class upp0 {
    public static String a() {
        Set set = s4b1.f;
        String strZ = uic.v("offline-playable", "all").z();
        return strZ == null ? "" : strZ;
    }

    public static boolean b(String str) {
        Set set = s4b1.f;
        if (uic.h(str, new blc0[]{blc0.CACHED_FILES, blc0.OFFLINE_BACKUP})) {
            return true;
        }
        v5b1 v5b1VarC = oxu0.a.c(str);
        jxu0 jxu0Var = v5b1VarC instanceof jxu0 ? (jxu0) v5b1VarC : null;
        return u890.j(jxu0Var != null ? jxu0Var.a : null, "offline-playable") && u890.j(jxu0Var.b, "all");
    }
}
