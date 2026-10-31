package p;

import com.spotify.player.model.PlayerError;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ci11 extends onm {
    public PlayerError a;
    public /* synthetic */ Object b;
    public final /* synthetic */ cff c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci11(cff cffVar, lnm lnmVar) {
        super(lnmVar);
        this.c = cffVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b((PlayerError) null, this);
    }
}
