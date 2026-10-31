package p;

import com.spotify.nowplayingmini.uicomponents.seekbar.FadingSeekBarView;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fh10 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gh10 b;

    public /* synthetic */ fh10(gh10 gh10Var, byte b) {
        this.a = b;
        this.b = gh10Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        gh10 gh10Var = this.b;
        switch (b) {
            case 0:
                PlayerState playerState = (PlayerState) obj;
                ((ContextTrack) playerState.track().b()).uri();
                boolean zIsEmpty = playerState.restrictions().disallowSeekingReasons().isEmpty();
                if (gh10Var.i && !zIsEmpty) {
                    FadingSeekBarView fadingSeekBarView = gh10Var.j;
                    if (fadingSeekBarView == null) {
                        u890.C("viewBinder");
                        throw null;
                    }
                    fadingSeekBarView.U0.a();
                }
                FadingSeekBarView fadingSeekBarView2 = gh10Var.j;
                if (fadingSeekBarView2 != null) {
                    fadingSeekBarView2.setSeekingEnabled(zIsEmpty);
                    return;
                } else {
                    u890.C("viewBinder");
                    throw null;
                }
            default:
                fvf1 fvf1Var = (fvf1) obj;
                if (gh10Var.i) {
                    return;
                }
                gh10Var.h = (int) fvf1Var.a;
                FadingSeekBarView fadingSeekBarView3 = gh10Var.j;
                if (fadingSeekBarView3 == null) {
                    u890.C("viewBinder");
                    throw null;
                }
                fadingSeekBarView3.setDuration((int) fvf1Var.b);
                fadingSeekBarView3.setPosition(gh10Var.h);
                fadingSeekBarView3.setPositionText(gh10Var.h);
                return;
        }
    }
}
