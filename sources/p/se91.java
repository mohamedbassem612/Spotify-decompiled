package p;

import com.spotify.home.slotloading.proto.GetMainHomeLayoutResponse;
import com.spotify.home.slotloading.proto.GetSlotContentResponse;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J6\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tJl\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u000f\u001a\u00020\u000e2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lp/se91;", "", "", "cacheControlHeader", "feed", "sessionId", "Lp/sy21;", "Lcom/spotify/home/slotloading/proto/GetMainHomeLayoutResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "", "slotType", "timezone", "eagerload", "", "dsaModeEnabled", "refreshToken", "Lcom/spotify/home/slotloading/proto/GetSlotContentResponse;", "b", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_home_slotloading-slotloading"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface se91 {
    static /* synthetic */ Object c(se91 se91Var, String str, int i, String str2, String str3, String str4, boolean z, String str5, String str6, lnm lnmVar, int i2, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: slotContent");
            return null;
        }
        if ((i2 & 16) != 0) {
            str4 = null;
        }
        if ((i2 & 32) != 0) {
            z = false;
        }
        if ((i2 & 64) != 0) {
            str5 = null;
        }
        if ((i2 & 128) != 0) {
            str6 = null;
        }
        return se91Var.b(str, i, str2, str3, str4, z, str5, str6, lnmVar);
    }

    static /* synthetic */ Object d(se91 se91Var, String str, String str2, String str3, lnm lnmVar, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: pageLayout");
            return null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return se91Var.a(str, str2, str3, lnmVar);
    }

    @ay30("casita/v1-beta/page-layout")
    @u360({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    Object a(@dv50("Cache-Control") String str, @u0z0("feed") String str2, @dv50("X-Session-Id") String str3, lnm<? super sy21<GetMainHomeLayoutResponse>> lnmVar);

    @ay30("casita/v1-beta/slot-content")
    @u360({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    Object b(@dv50("Cache-Control") String str, @u0z0("slotType") int i, @u0z0("feed") String str2, @u0z0("timezone") String str3, @u0z0(encoded = true, value = "eagerload") String str4, @u0z0("mobile-only-dsa-enabled") boolean z, @dv50("X-Refresh-Token") String str5, @dv50("X-Session-Id") String str6, lnm<? super sy21<GetSlotContentResponse>> lnmVar);
}
