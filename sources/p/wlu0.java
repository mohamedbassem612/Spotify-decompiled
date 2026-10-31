package p;

import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lp/wlu0;", "", "", "playlistId", "", "maxGenres", "maxArtists", "maxTracks", "title", "Lio/reactivex/rxjava3/core/Single;", "Lp/bj40;", "a", "(Ljava/lang/String;IIILjava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_assistedcuration_content-content"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface wlu0 {
    @ay30("playlistextender/v2/top-genre-tracks")
    Single<bj40> a(@u0z0("playlist_id") String playlistId, @u0z0("max_genres") int maxGenres, @u0z0("max_artists") int maxArtists, @u0z0("max_tracks") int maxTracks, @u0z0("title") String title);
}
