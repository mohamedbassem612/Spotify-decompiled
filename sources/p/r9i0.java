package p;

import com.spotify.speechlessupload.proto.v1.GetChatMediaUploadStatusRequest;
import com.spotify.speechlessupload.proto.v1.GetChatMediaUploadStatusResponse;
import com.spotify.speechlessupload.proto.v1.InitiateUploadRequest;
import com.spotify.speechlessupload.proto.v1.InitiateUploadResponse;
import com.spotify.speechlessupload.proto.v1.SubmitChatMediaUploadRequest;
import com.spotify.speechlessupload.proto.v1.SubmitChatMediaUploadResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lp/r9i0;", "", "Lcom/spotify/speechlessupload/proto/v1/InitiateUploadRequest;", "request", "Lcom/spotify/speechlessupload/proto/v1/InitiateUploadResponse;", "c", "(Lcom/spotify/speechlessupload/proto/v1/InitiateUploadRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/speechlessupload/proto/v1/SubmitChatMediaUploadRequest;", "Lcom/spotify/speechlessupload/proto/v1/SubmitChatMediaUploadResponse;", "a", "(Lcom/spotify/speechlessupload/proto/v1/SubmitChatMediaUploadRequest;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/speechlessupload/proto/v1/GetChatMediaUploadStatusRequest;", "Lcom/spotify/speechlessupload/proto/v1/GetChatMediaUploadStatusResponse;", "b", "(Lcom/spotify/speechlessupload/proto/v1/GetChatMediaUploadStatusRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_campfire_mediaupload_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface r9i0 {
    @wyq0("speechless-upload/v1/upload/submitChatMediaUpload")
    Object a(@elb SubmitChatMediaUploadRequest submitChatMediaUploadRequest, lnm<? super SubmitChatMediaUploadResponse> lnmVar);

    @wyq0("speechless-upload/v1/upload/getChatMediaUploadStatus")
    Object b(@elb GetChatMediaUploadStatusRequest getChatMediaUploadStatusRequest, lnm<? super GetChatMediaUploadStatusResponse> lnmVar);

    @wyq0("speechless-upload/v1/upload/initiateUpload")
    Object c(@elb InitiateUploadRequest initiateUploadRequest, lnm<? super InitiateUploadResponse> lnmVar);
}
