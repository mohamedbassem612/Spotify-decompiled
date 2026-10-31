package p;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fto0 {
    public final gwy0 a;

    public fto0(gwy0 gwy0Var) {
        this.a = gwy0Var;
    }

    public final Object a(Map map) {
        Object jwy0Var;
        String str = (String) map.get("collapse_id");
        if (str != null) {
            jwy0Var = new hwy0(str);
        } else {
            String str2 = (String) map.get("uri");
            if (str2 != null) {
                jwy0Var = new iwy0(str2);
            } else {
                String str3 = (String) map.get("uri_prefix");
                jwy0Var = str3 != null ? new jwy0(str3) : null;
            }
        }
        if (jwy0Var != null) {
            String str4 = (String) map.get("requesting_feature");
            if (str4 == null) {
                str4 = "unknown";
            }
            Object objA = this.a.a(str4, Collections.singletonList(jwy0Var), 2);
            if (objA == d9n.a) {
                return objA;
            }
        }
        return rih1.a;
    }
}
