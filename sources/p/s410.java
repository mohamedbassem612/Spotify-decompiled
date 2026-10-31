package p;

import com.spotify.player.model.Context;
import com.spotify.player.model.ContextPage;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.SkipToTrack;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s410 {
    public static v410 a(PreparePlayOptions preparePlayOptions, String str) {
        spq0 spq0VarTrackUri;
        spq0 spq0VarSkipTo;
        String str2 = null;
        SkipToTrack skipToTrack = (preparePlayOptions == null || (spq0VarSkipTo = preparePlayOptions.skipTo()) == null) ? null : (SkipToTrack) spq0VarSkipTo.h();
        if (skipToTrack != null && (spq0VarTrackUri = skipToTrack.trackUri()) != null) {
            str2 = (String) spq0VarTrackUri.h();
        }
        return str2 != null ? new u410(Context.builder(str).pages(Collections.singletonList(ContextPage.builder().tracks(Collections.singletonList(ContextTrack.create(str2))).build())).build()) : t410.a;
    }
}
