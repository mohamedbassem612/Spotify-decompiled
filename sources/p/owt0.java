package p;

import android.content.Intent;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class owt0 {
    public static void a(Intent intent, PlayerState playerState, yqg yqgVar) {
        ContextTrack contextTrack = playerState.track().c() ? (ContextTrack) playerState.track().b() : null;
        intent.putExtra("id", contextTrack != null ? contextTrack.uri() : "");
        intent.putExtra("track", contextTrack != null ? (String) contextTrack.metadata().get(ContextTrack$Metadata.KEY_TITLE) : "");
        intent.putExtra("artist", contextTrack != null ? (String) contextTrack.metadata().get(ContextTrack$Metadata.KEY_ARTIST_NAME) : "");
        intent.putExtra("album", contextTrack != null ? (String) contextTrack.metadata().get(ContextTrack$Metadata.KEY_ALBUM_TITLE) : "");
        intent.putExtra("albumId", contextTrack != null ? (String) contextTrack.metadata().get(ContextTrack$Metadata.KEY_ALBUM_URI) : "");
        long jLongValue = playerState.duration().c() ? ((Long) playerState.duration().b()).longValue() : 0L;
        intent.putExtra("duration", jLongValue);
        spq0 spq0VarPosition = playerState.position(yqgVar.b());
        long jLongValue2 = spq0VarPosition.c() ? ((Long) spq0VarPosition.b()).longValue() : 0L;
        intent.putExtra("position", jLongValue2);
        intent.putExtra("length", (int) jLongValue);
        intent.putExtra("playbackPosition", (int) jLongValue2);
    }
}
