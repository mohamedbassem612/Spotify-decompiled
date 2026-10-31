package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z2z implements ugm {
    public final lik1 a;
    public final s6z b;
    public final uny c;
    public final c3s d;
    public final an4 e;
    public final uu4 f;

    public z2z(lik1 lik1Var, s6z s6zVar, uny unyVar, c3s c3sVar, an4 an4Var, uu4 uu4Var) {
        this.a = lik1Var;
        this.b = s6zVar;
        this.c = unyVar;
        this.d = c3sVar;
        this.e = an4Var;
        this.f = uu4Var;
    }

    @Override // p.ugm
    public final void a(ngm ngmVar, pdm pdmVar, boolean z, tv80 tv80Var) {
        String str = ngmVar.a;
        PlayerState playerState = ngmVar.b;
        ContextTrack contextTrack = (ContextTrack) playerState.track().b();
        contextTrack.getClass();
        boolean zU = l4o1.U(contextTrack);
        c3s c3sVar = this.d;
        uu4 uu4Var = this.f;
        if (zU) {
            ContextTrack contextTrack2 = (ContextTrack) playerState.track().b();
            boolean z2 = uu4Var.a() && c3sVar.d();
            contextTrack2.getClass();
            String strA0 = l4o1.a0(contextTrack2, ContextTrack$Metadata.KEY_POINTER_URI);
            if (strA0 != null) {
                str = strA0;
            }
            wqy wqyVar = new wqy((String) null, true, true, true, true, pdmVar.o, false, false, (p860) null, (ugo0) null, (c821) null, (String) null, (ok51) null, z2, 8129);
            uny unyVar = this.c;
            fn31.T(smo1.e((q8n) unyVar.d), (o8n) null, 0, new ary((byte) 0, unyVar, this.a, str, wqyVar, tv80Var, (lnm) null), 3);
            return;
        }
        ContextTrack contextTrack3 = (ContextTrack) playerState.track().b();
        boolean z3 = this.e.a() && c3sVar.d();
        boolean z4 = uu4Var.a() && c3sVar.d();
        String strContextUri = playerState.contextUri();
        if (nhc1.Y(strContextUri, "spotify:playlist:", false)) {
            strContextUri = ihc1.Y0(strContextUri, '?');
        }
        j380 j380VarMetadata = contextTrack3.metadata();
        boolean z5 = pdmVar.f62p;
        boolean z6 = pdmVar.o;
        boolean z7 = pdmVar.n;
        boolean z8 = l4o1.Y(contextTrack3) || s3o1.v(contextTrack3, false);
        s6z.a(this.b, str, this.a, tv80Var, strContextUri, j380VarMetadata, new r6z((String) null, z5, pdmVar.c, z6, !pdmVar.b, !l4o1.Y(contextTrack3) && pdmVar.e, true, !l4o1.Y(contextTrack3) && pdmVar.d, z8, true, false, false, false, false, z, z7, (ugo0) null, (c821) null, z3, false, false, false, (ok51) null, false, (String) null, z4, (p860) null, 800799745), 64);
    }
}
