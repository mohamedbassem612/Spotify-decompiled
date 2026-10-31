package p;

import com.spotify.engagesdk.engagesigninrequest.workers.EngageOnBroadcastSignInHandler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class r6y extends onm {
    public w6y a;
    public /* synthetic */ Object b;
    public final /* synthetic */ EngageOnBroadcastSignInHandler c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6y(EngageOnBroadcastSignInHandler engageOnBroadcastSignInHandler, onm onmVar) {
        super(onmVar);
        this.c = engageOnBroadcastSignInHandler;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.D((vuk) null, this);
    }
}
