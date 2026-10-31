package p;

import com.spotify.corex.reading.proto.ReadSpan;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lp/ka8;", "", "", "audiobookId", "Lp/sy21;", "Lp/rih1;", "c", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "", "resumeAtMs", "Lcom/spotify/corex/reading/proto/ReadSpan;", "b", "(Ljava/lang/String;Ljava/lang/Long;Lp/lnm;)Ljava/lang/Object;", "chapterId", "a", "(Ljava/lang/String;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_ereader_endpointimpl-endpointimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface ka8 {
    @ay30("transcript-read-along/read/{audiobookId}/{chapterId}")
    @u360({"Accept: application/protobuf"})
    Object a(@t8s0("audiobookId") String str, @t8s0("chapterId") String str2, lnm<? super sy21<ReadSpan>> lnmVar);

    @ay30("transcript-read-along/read/{audiobookId}/")
    @u360({"Accept: application/protobuf"})
    Object b(@t8s0("audiobookId") String str, @u0z0("resumeAt") Long l, lnm<? super sy21<ReadSpan>> lnmVar);

    @nr50("transcript-read-along/read/{audiobookId}")
    @u360({"Accept: application/protobuf"})
    Object c(@t8s0("audiobookId") String str, lnm<? super sy21<rih1>> lnmVar);
}
