package p;

import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i5v0 implements ugm {
    public final /* synthetic */ byte a;
    public final z2z b;
    public final cmf1 c;

    public /* synthetic */ i5v0(z2z z2zVar, cmf1 cmf1Var, byte b) {
        this.a = b;
        this.b = z2zVar;
        this.c = cmf1Var;
    }

    @Override // p.ugm
    public final void a(ngm ngmVar, pdm pdmVar, boolean z, tv80 tv80Var) {
        byte b = this.a;
        cmf1 cmf1Var = this.c;
        z2z z2zVar = this.b;
        switch (b) {
            case 0:
                if (!l4o1.H((ContextTrack) ngmVar.b.track().b())) {
                    z2zVar.a(ngmVar, pdmVar, z, tv80Var);
                } else {
                    cmf1Var.a(ngmVar, pdmVar, z, tv80Var);
                }
                break;
            default:
                if (!l4o1.P((ContextTrack) ngmVar.b.track().b())) {
                    cmf1Var.a(ngmVar, pdmVar, z, tv80Var);
                } else {
                    z2zVar.a(ngmVar, pdmVar, z, tv80Var);
                }
                break;
        }
    }
}
