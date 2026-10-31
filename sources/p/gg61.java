package p;

import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gg61 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final /* synthetic */ wf61 b;

    public gg61(wf61 wf61Var) {
        this.b = wf61Var;
    }

    public final j4e a() {
        zod.n("Must be called from the main thread.");
        ca61 ca61VarC = this.b.c();
        b4e b4eVar = (ca61VarC == null || !(ca61VarC instanceof b4e)) ? null : (b4e) ca61VarC;
        return b4eVar != null ? tho1.z(b4eVar) : j4e.c;
    }

    public final eg61 b(wcr wcrVar, boolean z) {
        LinkedHashMap linkedHashMap = this.a;
        Object objB = linkedHashMap.get(wcrVar);
        if (objB == null) {
            Objects.toString(wcrVar);
            objB = epo1.B(wcrVar);
            linkedHashMap.put(wcrVar, objB);
        }
        eg61 eg61Var = (eg61) objB;
        if (z) {
            Objects.toString(wcrVar);
            linkedHashMap.remove(wcrVar);
        }
        return eg61Var;
    }
}
