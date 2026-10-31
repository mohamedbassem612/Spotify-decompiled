package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rlb0 extends onm {
    public t45 a;
    public fq60 b;
    public p811 c;
    public UUID d;
    public /* synthetic */ Object e;
    public final /* synthetic */ pb00 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rlb0(pb00 pb00Var, onm onmVar) {
        super(onmVar);
        this.f = pb00Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.a(null, false, null, null, this);
    }
}
