package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ic10 {
    public final LinkedHashMap a;

    public ic10(kc10 kc10Var) {
        this.a = sqg0.X(kc10Var.a);
    }

    public final void a(jc10 jc10Var, Object obj) {
        LinkedHashMap linkedHashMap = this.a;
        if (obj != null) {
            linkedHashMap.put(jc10Var, obj);
        } else {
            linkedHashMap.remove(jc10Var);
        }
    }

    public ic10() {
        this.a = new LinkedHashMap();
    }
}
