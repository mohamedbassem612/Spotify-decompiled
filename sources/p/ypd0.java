package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ypd0 implements ugm {
    public final lik1 a;
    public final ye90 b;
    public final uu4 c;

    public ypd0(lik1 lik1Var, ye90 ye90Var, uu4 uu4Var) {
        this.a = lik1Var;
        this.b = ye90Var;
        this.c = uu4Var;
    }

    @Override // p.ugm
    public final void a(ngm ngmVar, pdm pdmVar, boolean z, tv80 tv80Var) {
        Observable observableJust;
        PlayerState playerState = ngmVar.b;
        ContextTrack contextTrack = (ContextTrack) playerState.track().b();
        String str = ngmVar.a;
        contextTrack.getClass();
        String strF0 = l4o1.f0(contextTrack);
        String str2 = strF0 == null ? "" : strF0;
        String strContextUri = playerState.contextUri();
        boolean z2 = pdmVar.c;
        boolean zA = this.c.a();
        j380 j380VarMetadata = contextTrack.metadata();
        ye90 ye90Var = this.b;
        p410 p410Var = (p410) ye90Var.b;
        bqd0 bqd0Var = new bqd0(z2, z, zA);
        eny enyVar = (eny) ((eea0) p410Var.c).b;
        String str3 = (String) j380VarMetadata.get("parent_uri");
        String strY0 = o7h.y0(t2p1.k(j380VarMetadata), (CharSequence) null, (String) null, (String) null, (iu30) null, 63);
        String str4 = (String) j380VarMetadata.get("image_url");
        if (str4 == null) {
            str4 = "";
        }
        String str5 = (String) j380VarMetadata.get(ContextTrack$Metadata.KEY_ARTIST_NAME);
        if (str5 == null) {
            str5 = "";
        }
        String str6 = (String) j380VarMetadata.get(ContextTrack$Metadata.KEY_ALBUM_TITLE);
        String strT = f0o1.t(p7h.M(new String[]{str5, str6 != null ? str6 : ""}));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        if (str3 != null && nhc1.Y(str3, "spotify:artist:", false)) {
            observableJust = enyVar.a(str3, blc0.u1).timeout(10L, timeUnit, Single.error(new TimeoutException())).map(new wp20(str, str2, str4, strY0, str3)).toObservable();
        } else if (str3 == null || !nhc1.Y(str3, "spotify:show:", false)) {
            if (ihc1.y0(strT)) {
                strT = null;
            }
            observableJust = Observable.just(new wpd0(str, str2, str4, strY0, (xpd0) null, (nqd0) null, strT, 48));
        } else {
            observableJust = enyVar.a(str3, blc0.fh).timeout(10L, timeUnit, Single.error(new TimeoutException())).map(new ur00(str, str2, str4, strY0, str3, (byte) 24)).toObservable();
        }
        Observable map = observableJust.map(new haa0(p410Var, strContextUri, bqd0Var, (byte) 24));
        mfm mfmVarA = ((i4q) ye90Var.c).a(this.a);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        mfm.b(mfmVarA, map, yon1.G1("CONTEXTMENU_LIVEROOM", "contextmenu/liveroom", 432, "contextmenu"), new bjm(4, str, strContextUri), tv80Var, 16);
    }
}
