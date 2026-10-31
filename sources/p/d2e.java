package p;

import com.spotify.casita.v1.resolved.ResolvedHome;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J®\u0001\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00052\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lp/d2e;", "", "", "cacheControlHeader", "encodedTargetDevice", "", "incrementalHomeEnabled", "refreshToken", "isTablet", "resource", "feedId", "eagerload", "timezone", "dsaModeEnabled", "locale", "pageToken", "slotBasedLoadingEnabled", "sessionId", "Lp/sy21;", "Lcom/spotify/casita/v1/resolved/ResolvedHome;", "b", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_home_evopage_mobius-mobius"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface d2e {
    static Object a(d2e d2eVar, String str, String str2, boolean z, String str3, Boolean bool, String str4, String str5, String str6, String str7, boolean z2, String str8, String str9, Boolean bool2, String str10, lnm lnmVar, int i, Object obj) {
        if (obj == null) {
            return d2eVar.b(str, str2, z, (i & 8) != 0 ? null : str3, bool, (i & 32) != 0 ? "home" : str4, (i & 64) != 0 ? "default" : str5, str6, str7, z2, str8, (i & 2048) != 0 ? null : str9, (i & 4096) != 0 ? null : bool2, (i & 8192) != 0 ? null : str10, lnmVar);
        }
        hhg1.h("Super calls with default arguments not supported in this target, function: home");
        return null;
    }

    @ay30("casita/v1/{resource}/{feedId}")
    @u360({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    Object b(@dv50("Cache-Control") String str, @dv50("X-Target-Device") String str2, @dv50("X-Incremental-Home-Enabled") boolean z, @dv50("X-Refresh-Token") String str3, @dv50("X-Is-Tablet") Boolean bool, @t8s0("resource") String str4, @t8s0("feedId") String str5, @u0z0(encoded = true, value = "eagerload") String str6, @u0z0("timezone") String str7, @u0z0("mobile-only-dsa-enabled") boolean z2, @u0z0("locale") String str8, @u0z0("pagetoken") String str9, @u0z0("slot-based-loading-enabled") Boolean bool2, @dv50("X-Session-Id") String str10, lnm<? super sy21<ResolvedHome>> lnmVar);
}
