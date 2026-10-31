package p;

import com.spotify.browsita.v1.resolved.ResolvedBrowse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JB\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004H§@¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lp/s9c;", "", "", "cacheControl", "", "isTablet", "timezone", "notPersonalised", "Lp/sy21;", "Lcom/spotify/browsita/v1/resolved/ResolvedBrowse;", "a", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_browse_clientnative-clientnative"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface s9c {
    static /* synthetic */ Object b(s9c s9cVar, String str, Boolean bool, String str2, Boolean bool2, lnm lnmVar, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: getContent");
            return null;
        }
        if ((i & 8) != 0) {
            bool2 = null;
        }
        return s9cVar.a(str, bool, str2, bool2, lnmVar);
    }

    @ay30("browsita/v1/browse")
    @u360({"Content-Type: application/protobuf", "Accept: application/protobuf"})
    Object a(@dv50("Cache-Control") String str, @dv50("X-Is-Tablet") Boolean bool, @u0z0("timezone") String str2, @u0z0("not-personalised") Boolean bool2, lnm<? super sy21<ResolvedBrowse>> lnmVar);
}
