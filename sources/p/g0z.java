package p;

import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoremobile.roundedcorner.RoundedConstraintLayout;
import com.spotify.watchfeed.uiusecases.element.videothumbnail.VideoThumbnailView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g0z extends w611 {
    public final odr U0;
    public final k0t V0;
    public final /* synthetic */ h0z W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0z(h0z h0zVar, odr odrVar) {
        super((RoundedConstraintLayout) odrVar.e);
        this.W0 = h0zVar;
        this.U0 = odrVar;
        k0t k0tVar = (k0t) h0zVar.g.get();
        k0tVar.c(new x500((VideoSurfaceView) odrVar.b, (VideoThumbnailView) ((s880) odrVar.c).g));
        this.V0 = k0tVar;
    }
}
