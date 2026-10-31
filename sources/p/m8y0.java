package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m8y0 implements r2g {
    public static final Set g = f46.S0(new String[]{"promptable_playlist", "promptable_playlist_music_agent_engine"});
    public final String a;
    public final uyp b;
    public final mr20 d;
    public final yd91 c = new yd91(3, new h2y0(this, (byte) 11));
    public final o3r e = w3p1.o(new l4r(pwc0.b, 1, e6y0.Q0, new j4r(new hox0(this, 17)), e6y0.R0), e6y0.O0);
    public final r2n0 f = new r2n0(this);

    public m8y0(String str, uyp uypVar, koc0 koc0Var) {
        this.a = str;
        this.b = uypVar;
        this.d = rqt0.u(new j5b0(((roc0) koc0Var).d(), (byte) 27));
    }

    @Override // p.xe91
    public final l381 c() {
        return this.f;
    }

    @Override // p.xe91
    public final yd91 d() {
        return this.c;
    }

    @Override // p.xe91
    public final mr20 getShow() {
        return this.d;
    }
}
