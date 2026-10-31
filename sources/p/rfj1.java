package p;

import com.spotify.player.model.PlayOrigin;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class rfj1 implements nwo0 {
    public final g2q a;
    public final phi0 b;
    public final v65 c;
    public final lv4 d;
    public final q8n e;
    public final v290 f;
    public final s4p0 g;
    public final mr20 h;

    public rfj1(g2q g2qVar, phi0 phi0Var, v65 v65Var, lv4 lv4Var, q8n q8nVar, v290 v290Var, s4p0 s4p0Var, mr20 mr20Var) {
        this.a = g2qVar;
        this.b = phi0Var;
        this.c = v65Var;
        this.d = lv4Var;
        this.e = q8nVar;
        this.f = v290Var;
        this.g = s4p0Var;
        this.h = mr20Var;
    }

    @Override // p.nwo0
    public final owo0 a(q2p0 q2p0Var, ivn0 ivn0Var, v1r0 v1r0Var, kko kkoVar) {
        return new sfj1(this.a, this.b, ivn0Var, v1r0Var, q2p0Var.c().b(), new tgt0(PlayOrigin.create("video-preview-carousel-npv-scroll")), this.c, this.d, this.e, this.f, kkoVar, this.h, this.g);
    }
}
