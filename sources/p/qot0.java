package p;

import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.player.model.command.options.PreparePlayOptions$Builder;
import com.spotify.player.model.command.options.SkipToTrack;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class qot0 {
    public static PreparePlayOptions a(SkipToTrack skipToTrack, long j, Long l, boolean z, int i) {
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        PreparePlayOptions$Builder preparePlayOptions$BuilderBuilder = PreparePlayOptions.builder();
        if (skipToTrack != null) {
            preparePlayOptions$BuilderBuilder.skipTo(skipToTrack);
        }
        if (z) {
            int i2 = t380.c;
            preparePlayOptions$BuilderBuilder.suppressions((Set<String>) new b291("mft"));
            PlayerOptionOverrides.Builder builder = PlayerOptionOverrides.builder();
            Boolean bool = Boolean.FALSE;
            preparePlayOptions$BuilderBuilder.playerOptionsOverride(builder.repeatingContext(bool).shufflingContext(bool).repeatingTrack(bool).build());
        }
        if (l != null && l.longValue() > -1) {
            preparePlayOptions$BuilderBuilder.seekToCreatorTimestamp(String.valueOf(l.longValue()));
        } else if (j >= 0) {
            preparePlayOptions$BuilderBuilder.seekTo(Long.valueOf(j));
        }
        return preparePlayOptions$BuilderBuilder.build();
    }
}
