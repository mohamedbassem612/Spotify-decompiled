package p;

import com.spotify.stickers.v1.GetManyStickersRequest;
import com.spotify.stickers.v1.GetStickerResponse;
import com.spotify.stickers.v1.GetSurfaceResponse;
import com.spotify.stickers.v1.SearchSurfaceStickersResponse;
import com.spotify.stream_reporting_esperanto.proto.StreamStartRequestOuterClass$StreamStartRequest;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u0007J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0007JN\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0003\u0010\u0013\u001a\u00020\u00122\b\b\u0003\u0010\u0014\u001a\u00020\u00022\u000e\b\u0003\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H§@¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Lp/oyb1;", "", "", "surface", "Lp/sy21;", "Lcom/spotify/stickers/v1/GetSurfaceResponse;", "b", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "stickerId", "Lcom/spotify/stickers/v1/GetStickerResponse;", "e", "Lcom/spotify/stickers/v1/GetManyStickersRequest;", "request", "a", "(Lcom/spotify/stickers/v1/GetManyStickersRequest;Lp/lnm;)Ljava/lang/Object;", "packId", "c", "query", "", "pageSize", "pageToken", "", "filterTagIds", "Lcom/spotify/stickers/v1/SearchSurfaceStickersResponse;", "f", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_stickers_datasourceimpl-datasourceimpl"}, k = 1, mv = {2, 3, 0}, xi = StreamStartRequestOuterClass$StreamStartRequest.PREVIEW_IMPRESSION_URI_FIELD_NUMBER)
public interface oyb1 {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object d(oyb1 oyb1Var, String str, String str2, int i, String str3, List list, lnm lnmVar, int i2, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: searchSurfaceStickers");
            return null;
        }
        if ((i2 & 4) != 0) {
            i = 20;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = "";
        }
        String str4 = str3;
        if ((i2 & 16) != 0) {
            list = z6x.a;
        }
        return oyb1Var.f(str, str2, i3, str4, list, lnmVar);
    }

    @u360({"Accept: application/protobuf"})
    @wyq0("stickers/v1/stickers:batchGet")
    Object a(@elb GetManyStickersRequest getManyStickersRequest, lnm<? super sy21<Object>> lnmVar);

    @ay30("stickers/v1/surfaces/{surface}")
    @u360({"Accept: application/protobuf"})
    Object b(@t8s0("surface") String str, lnm<? super sy21<GetSurfaceResponse>> lnmVar);

    @ay30("stickers/v1/sticker-packs/{packId}")
    @u360({"Accept: application/protobuf"})
    Object c(@t8s0("packId") String str, lnm<? super sy21<Object>> lnmVar);

    @ay30("stickers/v1/stickers/{stickerId}")
    @u360({"Accept: application/protobuf"})
    Object e(@t8s0("stickerId") String str, lnm<? super sy21<GetStickerResponse>> lnmVar);

    @ay30("stickers/v1/surfaces/{surface}/stickers:search")
    @u360({"Accept: application/protobuf"})
    Object f(@t8s0("surface") String str, @u0z0("query") String str2, @u0z0("page_size") int i, @u0z0("page_token") String str3, @u0z0("filter_tag_ids") List<String> list, lnm<? super sy21<SearchSurfaceStickersResponse>> lnmVar);
}
