package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ds20 extends onm {
    public List a;
    public Map b;
    public dw20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ es20 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds20(es20 es20Var, onm onmVar) {
        super(onmVar);
        this.e = es20Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.e(null, null, null, this);
    }
}
