package p;

import com.spotify.betamax.transcoder.BetamaxTranscoderException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ipa implements ppa {
    public final long a;
    public final oo71 b;
    public final /* synthetic */ opa c;

    public ipa(opa opaVar, long j, oo71 oo71Var) {
        this.c = opaVar;
        this.a = j;
        this.b = oo71Var;
    }

    public final void b(long j, long j2) {
        this.b.b(j, j2);
    }

    public final void c(long j, int i, String str) {
        this.b.c(j, i, str);
    }

    public final void f(long j, boolean z) {
        rgc rgcVar = (rgc) this.c.j.get(Long.valueOf(this.a));
        if (rgcVar != null) {
            if (z) {
                rgcVar.a.addAndGet(j);
            } else {
                rgcVar.b.addAndGet(j);
            }
        }
    }

    public final void g(BetamaxTranscoderException betamaxTranscoderException, long j) {
        this.b.g(betamaxTranscoderException, j);
    }

    public final void a(int i, long j, long j2) {
    }
}
