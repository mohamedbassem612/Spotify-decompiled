package p;

import com.spotify.voting.proto.v2.VotingSharePage;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mxk1 extends onm {
    public String a;
    public VotingSharePage b;
    public eyk1 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ cik1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxk1(cik1 cik1Var, onm onmVar) {
        super(onmVar);
        this.e = cik1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.i(null, null, null, null, this);
    }
}
