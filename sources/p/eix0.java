package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class eix0 extends onm {
    public List a;
    public Iterator b;
    public int c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ fix0 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eix0(fix0 fix0Var, onm onmVar) {
        super(onmVar);
        this.f = fix0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, null, null, this);
    }
}
