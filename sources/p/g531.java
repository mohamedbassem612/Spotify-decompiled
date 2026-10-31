package p;

import com.spotify.gamesservice.musicguesser.v1.GameResultsPage;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class g531 extends onm {
    public w531 a;
    public GameResultsPage b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ i531 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g531(i531 i531Var, onm onmVar) {
        super(onmVar);
        this.e = i531Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
