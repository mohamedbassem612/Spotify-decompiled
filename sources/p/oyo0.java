package p;

import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.view.View;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;
import com.spotify.nowplaying.musicinstallation.NowPlayingActivity;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oyo0 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oyo0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0109  */
    public final void accept(Object obj) {
        List<RemoteAction> listSingletonList;
        ContextTrack contextTrack;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((NowPlayingActivity) obj2).setPictureInPictureParams((PictureInPictureParams) obj);
                return;
            default:
                PlayerState playerState = (PlayerState) obj;
                bvs0 bvs0Var = (bvs0) obj2;
                dg30 dg30VarF0 = bvs0Var.f0();
                if (dg30VarF0 != null) {
                    PictureInPictureParams.Builder builderC = wu7.c();
                    if (playerState.restrictions().disallowSeekingReasons().isEmpty()) {
                        RemoteAction[] remoteActionArr = new RemoteAction[3];
                        wu7.k();
                        Icon iconCreateWithResource = Icon.createWithResource(bvs0Var.h0(), 2131232602);
                        String string = bvs0Var.P0().getString(2131959751);
                        String string2 = bvs0Var.P0().getString(2131959751);
                        t8r0 t8r0Var = bvs0Var.H1;
                        if (t8r0Var == null) {
                            u890.C("pipPlayerIntentsFactory");
                            throw null;
                        }
                        remoteActionArr[0] = new RemoteAction(iconCreateWithResource, string, string2, ((zo5) t8r0Var.a).a(AppLifecycleServicePendingIntent.PIP_PLAYER_SEEK_BACK_15_SEC, (Bundle) t8r0Var.b));
                        remoteActionArr[1] = bvs0Var.Y0(playerState.isPaused());
                        wu7.k();
                        Icon iconCreateWithResource2 = Icon.createWithResource(bvs0Var.h0(), 2131232611);
                        String string3 = bvs0Var.P0().getString(2131959752);
                        String string4 = bvs0Var.P0().getString(2131959752);
                        t8r0 t8r0Var2 = bvs0Var.H1;
                        if (t8r0Var2 == null) {
                            u890.C("pipPlayerIntentsFactory");
                            throw null;
                        }
                        remoteActionArr[2] = new RemoteAction(iconCreateWithResource2, string3, string4, ((zo5) t8r0Var2.a).a(AppLifecycleServicePendingIntent.PIP_PLAYER_SEEK_FORWARD_15_SEC, (Bundle) t8r0Var2.b));
                        listSingletonList = p7h.M(remoteActionArr);
                    } else {
                        listSingletonList = Collections.singletonList(bvs0Var.Y0(playerState.isPaused()));
                    }
                    dg30VarF0.setPictureInPictureParams(builderC.setActions(listSingletonList).build());
                    if (!playerState.isPlaying() || ((contextTrack = (ContextTrack) playerState.track().h()) != null && (!s3o1.v(contextTrack, false) || Boolean.parseBoolean((String) contextTrack.metadata().get(ContextTrack$Metadata.KEY_PIP_DISALLOWED))))) {
                        dg30VarF0.finish();
                    } else {
                        c3s c3sVar = bvs0Var.G1;
                        if (c3sVar == null) {
                            u890.C("isLocalPlaybackProvider");
                            throw null;
                        }
                        if (!c3sVar.d()) {
                            dg30VarF0.finish();
                        }
                    }
                }
                View view = bvs0Var.M1;
                if (view != null) {
                    view.setVisibility(((Boolean) playerState.track().i(bx8.n).e(Boolean.FALSE)).booleanValue() ? 0 : 8);
                    return;
                } else {
                    u890.C("adLabelView");
                    throw null;
                }
        }
    }
}
