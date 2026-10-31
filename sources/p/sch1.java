package p;

import com.spotify.messages.BetamaxPlaybackSession;
import com.spotify.p4p.ucp.suggestedprompts.v1.GetSuggestedPromptsRequest;
import com.spotify.p4p.ucp.suggestedprompts.v1.GetSuggestedPromptsResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lp/sch1;", "", "Lcom/spotify/p4p/ucp/suggestedprompts/v1/GetSuggestedPromptsRequest;", "request", "Lcom/spotify/p4p/ucp/suggestedprompts/v1/GetSuggestedPromptsResponse;", "a", "(Lcom/spotify/p4p/ucp/suggestedprompts/v1/GetSuggestedPromptsRequest;Lp/lnm;)Ljava/lang/Object;", "Lp/bh80;", "Lp/eh80;", "b", "(Lp/bh80;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_promptedplaylists_ucpapiimpl-ucpapiimpl"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public interface sch1 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf"})
    @wyq0("ucp-p4p/suggested-prompts")
    Object a(@elb GetSuggestedPromptsRequest getSuggestedPromptsRequest, lnm<? super GetSuggestedPromptsResponse> lnmVar);

    @u360({"Content-Type: application/json", "Accept: application/json"})
    @wyq0("ucp-p4p/prompt-suggestions")
    Object b(@elb bh80 bh80Var, lnm<? super eh80> lnmVar);
}
