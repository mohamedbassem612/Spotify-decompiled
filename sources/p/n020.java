package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n020 extends onm {
    public List a;
    public Set b;
    public /* synthetic */ Object c;
    public final /* synthetic */ kp00 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n020(kp00 kp00Var, onm onmVar) {
        super(onmVar);
        this.d = kp00Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.e(null, null, this);
    }
}
