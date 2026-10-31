package p;

import com.spotify.campfire.sharelist.impl.proto.ShareListRequest;
import com.spotify.campfire.sharelist.impl.proto.SharelistResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lp/j971;", "", "Lcom/spotify/campfire/sharelist/impl/proto/ShareListRequest;", "shareListRequest", "Lcom/spotify/campfire/sharelist/impl/proto/SharelistResponse;", "c", "(Lcom/spotify/campfire/sharelist/impl/proto/ShareListRequest;Lp/lnm;)Ljava/lang/Object;", "b", "a", "src_main_java_com_spotify_campfire_sharelist_impl-impl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface j971 {
    @wyq0("speechless/v1/retrieve/addToGroupSuggestions")
    Object a(@elb ShareListRequest shareListRequest, lnm<? super SharelistResponse> lnmVar);

    @wyq0("speechless/v1/retrieve/createGroupSuggestions")
    Object b(@elb ShareListRequest shareListRequest, lnm<? super SharelistResponse> lnmVar);

    @wyq0("speechless/v1/retrieve/sharelist")
    Object c(@elb ShareListRequest shareListRequest, lnm<? super SharelistResponse> lnmVar);
}
