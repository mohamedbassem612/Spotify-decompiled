package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ef0 extends onm {
    public String a;
    public String b;
    public t45 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ gf0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef0(gf0 gf0Var, onm onmVar) {
        super(onmVar);
        this.e = gf0Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c((String) null, (ContextTrack) null, (String) null, (String) null, (t45) null, this);
    }
}
