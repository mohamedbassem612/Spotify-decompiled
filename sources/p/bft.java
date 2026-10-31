package p;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bft extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bx21 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bft(bx21 bx21Var, byte b) {
        super(1);
        this.a = b;
        this.b = bx21Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bx21 bx21Var = this.b;
        switch (b) {
            case 0:
                return bx21Var;
            case 1:
                String str = (String) ((ContextTrack) ((PlayerState) obj).track().b()).metadata().get(ContextTrack$Metadata.KEY_PARENT_EPISODE_URI);
                return (str == null || !(ihc1.y0(str) ^ true)) ? bx21Var : new ugc1("");
            case 2:
                return bx21Var;
            case 3:
                return bx21Var;
            case 4:
                return bx21Var;
            default:
                return bx21Var;
        }
    }
}
