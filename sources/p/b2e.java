package p;

import com.spotify.home.funkispage.v1.proto.Feeds;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lp/b2e;", "", "", "cacheControl", "", "dsaModeEnabled", "locale", "Lcom/spotify/home/funkispage/v1/proto/Feeds;", "a", "(Ljava/lang/String;ZLjava/lang/String;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_accessibility_compose-compose"}, k = 1, mv = {2, 3, 0}, xi = PlaylistDecorationPolicy.AI_CURATION_REFERENCE_ID_FIELD_NUMBER)
public interface b2e {
    @ay30("casita/v1/feeds")
    @u360({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    Object a(@dv50("Cache-Control") String str, @u0z0("mobile-only-dsa-enabled") boolean z, @u0z0("locale") String str2, lnm<? super Feeds> lnmVar);
}
