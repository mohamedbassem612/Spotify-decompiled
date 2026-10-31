package p;

import com.spotify.externalintegration.ubi.UbiSpecificationId;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tih0 extends onm {
    public UbiSpecificationId a;
    public /* synthetic */ Object b;
    public final /* synthetic */ uih0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tih0(uih0 uih0Var, onm onmVar) {
        super(onmVar);
        this.c = uih0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
