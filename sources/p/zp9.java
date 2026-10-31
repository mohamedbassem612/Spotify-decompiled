package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zp9 extends onm {
    public vr20 a;
    public ContextTrack b;
    public /* synthetic */ Object c;
    public final /* synthetic */ yu3 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zp9(yu3 yu3Var, onm onmVar) {
        super(onmVar);
        this.d = yu3Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f((vr20) null, (ContextTrack) null, this);
    }
}
