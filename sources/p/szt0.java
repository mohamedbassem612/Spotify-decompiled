package p;

import com.spotify.betamax.player.exception.BetamaxException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class szt0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c0u0 b;
    public final /* synthetic */ BetamaxException c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public /* synthetic */ szt0(c0u0 c0u0Var, BetamaxException betamaxException, long j, long j2, byte b) {
        this.a = b;
        this.b = c0u0Var;
        this.c = betamaxException;
        this.d = j;
        this.e = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.L(this.c, this.d, this.e);
                break;
            default:
                this.b.i(this.c, this.d, this.e);
                break;
        }
    }
}
