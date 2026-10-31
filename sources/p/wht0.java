package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.Restrictions;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wht0 {
    public final muz a;

    public wht0(muz muzVar) {
        this.a = muzVar;
    }

    public static Restrictions b() {
        Set<String> setSingleton = Collections.singleton("player_context_disallow");
        return Restrictions.builder().disallowSkippingNextReasons(setSingleton).disallowSkippingPrevReasons(setSingleton).disallowTogglingShuffleReasons(setSingleton).disallowSetQueueReasons(setSingleton).disallowAddToQueueReasons(setSingleton).disallowPeekingNextReasons(setSingleton).disallowPeekingPrevReasons(setSingleton).disallowRemoteControlReasons(setSingleton).disallowTogglingRepeatTrackReasons(setSingleton).disallowTogglingRepeatContextReasons(setSingleton).disallowSeekingReasons(setSingleton).disallowTransferringPlaybackReasons(setSingleton).build();
    }

    public final Observable a(long j, Context context) {
        PreparePlayOptions.Builder builderSuppressions = PreparePlayOptions.builder().suppressions(Suppressions.create(Collections.singleton("mft")));
        if (j > 0) {
            builderSuppressions = builderSuppressions.seekTo(Long.valueOf(j));
        }
        return this.a.a(PlayCommand.create(context, PlayOrigin.create("listening-parties")).toBuilder().options(builderSuppressions.build()).build()).filter(eh10.Y0).f(mi10.Y0).n();
    }
}
