package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tcr0 {
    public final LinkedHashMap a;

    public tcr0(LinkedHashMap linkedHashMap) {
        this.a = linkedHashMap;
    }

    public final Object a(rcr0 rcr0Var) {
        Object obj = this.a.get(rcr0Var);
        if (obj != null) {
            return obj;
        }
        n9v.h("Requested service of kind ", rcr0Var, " is not available");
        return null;
    }
}
