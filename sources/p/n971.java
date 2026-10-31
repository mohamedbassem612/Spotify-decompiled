package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class n971 extends onm {
    public h290 a;
    public Map b;
    public boolean c;
    public /* synthetic */ Object d;
    public final /* synthetic */ s971 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n971(s971 s971Var, onm onmVar) {
        super(onmVar);
        this.e = s971Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, false, this);
    }
}
