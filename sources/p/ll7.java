package p;

import com.spotify.personalizedepisodes.contentservice.v1.GetAttachmentStatusResponse;
import com.spotify.personalizedepisodes.contentservice.v1.UploadAttachmentRequest;
import com.spotify.personalizedepisodes.contentservice.v1.UploadAttachmentResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\r\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lp/ll7;", "", "Lcom/spotify/personalizedepisodes/contentservice/v1/UploadAttachmentRequest;", "request", "Lp/sy21;", "Lcom/spotify/personalizedepisodes/contentservice/v1/UploadAttachmentResponse;", "c", "(Lcom/spotify/personalizedepisodes/contentservice/v1/UploadAttachmentRequest;Lp/lnm;)Ljava/lang/Object;", "", "attachmentId", "a", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/personalizedepisodes/contentservice/v1/GetAttachmentStatusResponse;", "b", "src_main_java_com_spotify_bluejay_data_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface ll7 {
    @juo("personalized-episodes/v1/content/attachments/{attachment_id}")
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    Object a(@t8s0("attachment_id") String str, lnm<? super sy21<Object>> lnmVar);

    @ay30("personalized-episodes/v1/content/attachments/{attachment_id}/status")
    @u360({"Accept: application/x-protobuf"})
    Object b(@t8s0("attachment_id") String str, lnm<? super sy21<GetAttachmentStatusResponse>> lnmVar);

    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("personalized-episodes/v1/content/attachments")
    Object c(@elb UploadAttachmentRequest uploadAttachmentRequest, lnm<? super sy21<UploadAttachmentResponse>> lnmVar);
}
