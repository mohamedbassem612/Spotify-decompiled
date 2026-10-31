package p;

import com.spotify.player.model.PlayerOptions;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
@o661
public final class rt5 extends cv5 {
    public static final qt5 Companion = new qt5();
    public Boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    public rt5(PlayerState playerState) {
        PlayerOptions playerOptionsOptions;
        boolean z = false;
        if (playerState != null && (playerOptionsOptions = playerState.options()) != null && playerOptionsOptions.shufflingContext()) {
            z = true;
        }
        this(Boolean.valueOf(z));
    }

    public rt5(Boolean bool) {
        this.b = bool;
    }
}
