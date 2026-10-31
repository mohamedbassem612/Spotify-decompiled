package p;

import android.app.Activity;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o1o0 {
    public final e831 a;
    public final xkm0 b;
    public final LinkedHashMap c;

    public o1o0(e831 e831Var, xkm0 xkm0Var, q8n q8nVar) {
        this.a = e831Var;
        this.b = xkm0Var;
        llm llmVarT = cy30.t(q8nVar);
        this.c = new LinkedHashMap();
        f0o1.d(e831Var, llmVarT, new xkm0(this, (byte) 27));
    }

    public final n1o0 a() {
        Activity activityA = this.a.a();
        if (activityA == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = this.c;
        Object obj = linkedHashMap.get(activityA);
        if (obj == null) {
            obj = (n1o0) this.b.invoke(activityA);
            linkedHashMap.put(activityA, obj);
        }
        return (n1o0) obj;
    }
}
