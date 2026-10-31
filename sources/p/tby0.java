package p;

import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;
import spotify.spotbot.v2.promptable_playlist.Promptableplaylist;
import spotify.spotbot.v2.promptable_playlist.Promptableplaylist$CreatePromptablePlaylistResponse;
import spotify.spotbot.v2.promptable_playlist.Promptableplaylist$EditPromptablePlaylistResponse;
import spotify.spotbot.v2.promptable_playlist.Promptableplaylist$SuggestionResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0015\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0017À\u0006\u0001"}, d2 = {"Lp/tby0;", "", "Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$CreatePromptablePlaylistRequest;", "body", "Lp/sy21;", "Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$CreatePromptablePlaylistResponse;", "d", "(Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$CreatePromptablePlaylistRequest;Lp/lnm;)Ljava/lang/Object;", "Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$EditPromptablePlaylistRequest;", "Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$EditPromptablePlaylistResponse;", "c", "(Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$EditPromptablePlaylistRequest;Lp/lnm;)Ljava/lang/Object;", "Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$RefreshPromptablePlaylistRequest;", "Ljava/lang/Void;", "a", "(Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$RefreshPromptablePlaylistRequest;Lp/lnm;)Ljava/lang/Object;", "Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$GetPromptablePlaylistRequest;", "Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$SuggestionResponse;", "e", "(Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$GetPromptablePlaylistRequest;Lp/lnm;)Ljava/lang/Object;", "Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$GetPromptHelperCarouselRequest;", "b", "(Lspotify/spotbot/v2/promptable_playlist/Promptableplaylist$GetPromptHelperCarouselRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_promptedplaylists_dataimpl-dataimpl"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public interface tby0 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("spotbot-api2/spotify.spotbot.v2.promptable_playlist.PromptablePlaylistApi/RefreshPromptablePlaylist")
    Object a(@elb Promptableplaylist.RefreshPromptablePlaylistRequest refreshPromptablePlaylistRequest, lnm<? super sy21<Void>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("spotbot-api2/spotify.spotbot.v2.promptable_playlist.PromptablePlaylistApi/GetPromptHelperCarousel")
    Object b(@elb Promptableplaylist.GetPromptHelperCarouselRequest getPromptHelperCarouselRequest, lnm<? super sy21<Object>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("spotbot-api2/spotify.spotbot.v2.promptable_playlist.PromptablePlaylistApi/EditPromptablePlaylist")
    Object c(@elb Promptableplaylist.EditPromptablePlaylistRequest editPromptablePlaylistRequest, lnm<? super sy21<Promptableplaylist$EditPromptablePlaylistResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("spotbot-api2/spotify.spotbot.v2.promptable_playlist.PromptablePlaylistApi/CreatePromptablePlaylist")
    Object d(@elb Promptableplaylist.CreatePromptablePlaylistRequest createPromptablePlaylistRequest, lnm<? super sy21<Promptableplaylist$CreatePromptablePlaylistResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("spotbot-api2/spotify.spotbot.v2.promptable_playlist.PromptablePlaylistApi/GetPromptablePlaylistSuggestions")
    Object e(@elb Promptableplaylist.GetPromptablePlaylistRequest getPromptablePlaylistRequest, lnm<? super sy21<Promptableplaylist$SuggestionResponse>> lnmVar);
}
