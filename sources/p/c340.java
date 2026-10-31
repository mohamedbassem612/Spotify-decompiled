package p;

import com.spotify.gamesservice.musicguesser.v1.GetGameResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class c340 extends onm {
    public String a;
    public GetGameResponse b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ d340 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c340(d340 d340Var, onm onmVar) {
        super(onmVar);
        this.e = d340Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
