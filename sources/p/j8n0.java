package p;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j8n0 extends onm {
    public Collection a;
    public Map b;
    public xgn0 c;
    public xgn0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ p8n0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8n0(p8n0 p8n0Var, onm onmVar) {
        super(onmVar);
        this.f = p8n0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
