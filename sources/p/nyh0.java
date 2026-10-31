package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nyh0 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ p5b0 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyh0(p5b0 p5b0Var, lnm lnmVar) {
        super(lnmVar);
        this.b = p5b0Var;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b((ContextTrack) null, this);
    }
}
