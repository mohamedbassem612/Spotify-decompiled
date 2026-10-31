package p;

import com.spotify.corex.readalongtranscript.proto.ReadAlongTranscript;
import com.spotify.messages.BetamaxPlaybackSession;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lp/qa01;", "", "", "episodeId", "", "excludeCompanionContent", "excludeChapters", "Lp/sy21;", "Lcom/spotify/corex/readalongtranscript/proto/ReadAlongTranscript;", "a", "(Ljava/lang/String;ZZLp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_transcript_endpointsimpl-endpointsimpl"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public interface qa01 {
    @ay30("transcript-read-along/v2/episode/{episodeID}")
    @u360({"Accept: application/protobuf"})
    Object a(@t8s0("episodeID") String str, @u0z0("excludeCC") boolean z, @u0z0("excludeChapters") boolean z2, lnm<? super sy21<ReadAlongTranscript>> lnmVar);
}
