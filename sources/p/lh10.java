package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$AdStartedPlaying;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$AppBackgrounded;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$AppIsOffline;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$CarConnected;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$ConflictingMessagePresenting;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$InlineCardIncorrectTriggerType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DiscardReason$NowPlayingViewPresenting;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Rule;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class lh10 {
    public static DiscardReason a(Rule rule, String str) {
        switch (kh10.a[rule.ordinal()]) {
            case 1:
                return DiscardReason$AdStartedPlaying.INSTANCE;
            case 2:
                return DiscardReason$CarConnected.INSTANCE;
            case 3:
                return DiscardReason$AppBackgrounded.INSTANCE;
            case 4:
                return new DiscardReason$ConflictingMessagePresenting(str);
            case 5:
                return DiscardReason.ContextSwitched.INSTANCE;
            case 6:
                return DiscardReason$AppIsOffline.INSTANCE;
            case 7:
                return DiscardReason$NowPlayingViewPresenting.INSTANCE;
            case 8:
                return DiscardReason$InlineCardIncorrectTriggerType.INSTANCE;
            default:
                eg.o();
                return null;
        }
    }
}
