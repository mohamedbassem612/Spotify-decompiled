package p;

import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;
import spotify.spotbot.v2.promptable_playlist.Refinement;
import spotify.spotbot.v2.promptable_playlist.Refinement$AttachRefinementSessionResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lp/za11;", "", "Lspotify/spotbot/v2/promptable_playlist/Refinement$AttachRefinementSessionRequest;", "body", "Lp/sy21;", "Lspotify/spotbot/v2/promptable_playlist/Refinement$AttachRefinementSessionResponse;", "b", "(Lspotify/spotbot/v2/promptable_playlist/Refinement$AttachRefinementSessionRequest;Lp/lnm;)Ljava/lang/Object;", "Lspotify/spotbot/v2/promptable_playlist/Refinement$DiscardRefinementSessionRequest;", "Ljava/lang/Void;", "c", "(Lspotify/spotbot/v2/promptable_playlist/Refinement$DiscardRefinementSessionRequest;Lp/lnm;)Ljava/lang/Object;", "Lspotify/spotbot/v2/promptable_playlist/Refinement$SaveRefinementSessionRequest;", "a", "(Lspotify/spotbot/v2/promptable_playlist/Refinement$SaveRefinementSessionRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_promptedplaylists_refinementimpl-refinementimpl"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public interface za11 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("spotbot-api2/spotify.spotbot.v2.promptable_playlist.PromptablePlaylistApi/SaveRefinementSession")
    Object a(@elb Refinement.SaveRefinementSessionRequest saveRefinementSessionRequest, lnm<? super sy21<Void>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("spotbot-api2/spotify.spotbot.v2.promptable_playlist.PromptablePlaylistApi/AttachRefinementSession")
    Object b(@elb Refinement.AttachRefinementSessionRequest attachRefinementSessionRequest, lnm<? super sy21<Refinement$AttachRefinementSessionResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("spotbot-api2/spotify.spotbot.v2.promptable_playlist.PromptablePlaylistApi/DiscardRefinementSession")
    Object c(@elb Refinement.DiscardRefinementSessionRequest discardRefinementSessionRequest, lnm<? super sy21<Void>> lnmVar);
}
