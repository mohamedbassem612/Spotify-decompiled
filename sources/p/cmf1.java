package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cmf1 implements ugm {
    public final lik1 a;
    public final ssf1 b;
    public final c3s c;
    public final an4 d;
    public final uu4 e;

    public cmf1(lik1 lik1Var, ssf1 ssf1Var, c3s c3sVar, an4 an4Var, uu4 uu4Var, mta mtaVar) {
        this.a = lik1Var;
        this.b = ssf1Var;
        this.c = c3sVar;
        this.d = an4Var;
        this.e = uu4Var;
    }

    @Override // p.ugm
    public final void a(ngm ngmVar, pdm pdmVar, boolean z, tv80 tv80Var) {
        CharSequence charSequence;
        PlayerState playerState = ngmVar.b;
        ContextTrack contextTrack = (ContextTrack) playerState.track().b();
        contextTrack.getClass();
        if (l4o1.L(contextTrack)) {
            playerState.contextUri();
            contextTrack.uri();
            return;
        }
        boolean zA = this.d.a();
        c3s c3sVar = this.c;
        boolean z2 = zA && c3sVar.d();
        boolean z3 = this.e.a() && c3sVar.d();
        String strContextUri = playerState.contextUri();
        if (nhc1.Y(strContextUri, "spotify:playlist:", false)) {
            strContextUri = ihc1.Y0(strContextUri, '?');
        }
        boolean zY = nhc1.Y(strContextUri, "spotify:playlist:", false);
        String str = ngmVar.a;
        j380 j380VarMetadata = contextTrack.metadata();
        boolean z4 = (!pdmVar.g || (charSequence = (CharSequence) contextTrack.metadata().get(ContextTrack$Metadata.KEY_ALBUM_URI)) == null || charSequence.length() == 0) ? false : true;
        CharSequence charSequence2 = (CharSequence) contextTrack.metadata().get(ContextTrack$Metadata.KEY_ARTIST_URI);
        boolean z5 = (charSequence2 == null || charSequence2.length() == 0) ? false : true;
        boolean z6 = pdmVar.c;
        boolean z7 = pdmVar.a;
        boolean z8 = !pdmVar.h;
        boolean z9 = !pdmVar.b;
        this.b.b(new dmf1(str, this.a, strContextUri, new vsf1(contextTrack.uid(), zY ? contextTrack.uid() : null, z7, contextTrack.provider(), pdmVar.f, z6, z4, false, z9, z5, zY ? strContextUri : null, pdmVar.d, z8, false, true, pdmVar.m, (ugo0) null, (ok51) null, z, (g371) null, z2, pdmVar.j || hzg0.a.contains(playerState.playOrigin().featureIdentifier()), pdmVar.k, pdmVar.l, false, false, false, false, (p860) null, (String) null, z3, false, -129089024, 53), j380VarMetadata), tv80Var);
    }
}
