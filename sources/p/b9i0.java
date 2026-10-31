package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b9i0 extends onm {
    public w8i0 a;
    public String b;
    public List c;
    public v9i0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ q9i0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9i0(q9i0 q9i0Var, onm onmVar) {
        super(onmVar);
        this.f = q9i0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.d(false, null, null, null, null, null, this);
    }
}
