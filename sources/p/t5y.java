package p;

import com.spotify.corex.readalong.v1.proto.TranscriptExcerpt;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001JC\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u0006H'¢\u0006\u0004\b\f\u0010\rJ9\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lp/t5y;", "", "", "episodeId", "", "startMs", "", "min", "max", "Lio/reactivex/rxjava3/core/Single;", "Lp/sy21;", "Lcom/spotify/corex/readalong/v1/proto/TranscriptExcerpt;", "a", "(Ljava/lang/String;JII)Lio/reactivex/rxjava3/core/Single;", "endMs", "b", "(Ljava/lang/String;JJ)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_transcript_excerptsimpl-excerptsimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface t5y {
    @ay30("transcript-read-along/excerpt/v2/episode/{episodeID}")
    @u360({"Accept: application/protobuf"})
    Single<sy21<TranscriptExcerpt>> a(@t8s0("episodeID") String episodeId, @u0z0("startMs") long startMs, @u0z0("minimumCharacters") int min, @u0z0("maximumCharacters") int max);

    @ay30("transcript-read-along/excerpt/v2/episode/{episodeID}")
    @u360({"Accept: application/protobuf"})
    Single<sy21<TranscriptExcerpt>> b(@t8s0("episodeID") String episodeId, @u0z0("startMs") long startMs, @u0z0("endMs") long endMs);
}
