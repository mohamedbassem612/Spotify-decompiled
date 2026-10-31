package p;

import com.spotify.ads.esperanto.proto.UnmanagedEventRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pe00 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ re00 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe00(re00 re00Var, onm onmVar) {
        super(onmVar);
        this.b = re00Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.b((UnmanagedEventRequest) null, this);
    }
}
