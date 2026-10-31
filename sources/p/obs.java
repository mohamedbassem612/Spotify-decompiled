package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class obs extends onm {
    public List a;
    public String b;
    public tv80 c;
    public urc0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ pbq f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obs(pbq pbqVar, onm onmVar) {
        super(onmVar);
        this.f = pbqVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.n(null, null, this, null);
    }
}
