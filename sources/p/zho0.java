package p;

import com.spotify.spotifyuserprofile.v0.CreateNoteRequest;
import com.spotify.spotifyuserprofile.v0.CreateNoteResponse;
import com.spotify.spotifyuserprofile.v0.DeleteNoteResponse;
import com.spotify.spotifyuserprofile.v0.EditNoteResponse;
import com.spotify.spotifyuserprofile.v0.UpdateNoteRequest;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lp/zho0;", "", "Lcom/spotify/spotifyuserprofile/v0/CreateNoteRequest;", "request", "Lcom/spotify/spotifyuserprofile/v0/CreateNoteResponse;", "b", "(Lcom/spotify/spotifyuserprofile/v0/CreateNoteRequest;Lp/lnm;)Ljava/lang/Object;", "", "noteId", "Lcom/spotify/spotifyuserprofile/v0/UpdateNoteRequest;", "Lcom/spotify/spotifyuserprofile/v0/EditNoteResponse;", "a", "(Ljava/lang/String;Lcom/spotify/spotifyuserprofile/v0/UpdateNoteRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/spotifyuserprofile/v0/DeleteNoteResponse;", "c", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_tasteprofile_tasteprofilepage-tasteprofilepage"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public interface zho0 {
    @yyq0("spotify-user-profile-service/v1/notes/{note_id}")
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    Object a(@t8s0("note_id") String str, @elb UpdateNoteRequest updateNoteRequest, lnm<? super EditNoteResponse> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("spotify-user-profile-service/v1/notes")
    Object b(@elb CreateNoteRequest createNoteRequest, lnm<? super CreateNoteResponse> lnmVar);

    @juo("spotify-user-profile-service/v1/notes/{note_id}")
    @u360({"Accept: application/x-protobuf"})
    Object c(@t8s0("note_id") String str, lnm<? super DeleteNoteResponse> lnmVar);
}
