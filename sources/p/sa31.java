package p;

import com.spotify.wrapped.v1.proto.RiveAnimation;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sa31 extends onm {
    public RiveAnimation a;
    public byte[] b;
    public /* synthetic */ Object c;
    public final /* synthetic */ va31 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa31(va31 va31Var, onm onmVar) {
        super(onmVar);
        this.d = va31Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
