package p;

import com.spotify.assistedcuration.endpointsimpl.assistedcurationsearch.v1.SearchProto;
import com.spotify.assistedcuration.endpointsimpl.assistedcurationsearch.v1.SearchProto$MainViewUriResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J?\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\u000bJK\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lp/ue7;", "", "", "query", "entityTypes", "", "limit", "pageToken", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/assistedcuration/endpointsimpl/assistedcurationsearch/v1/SearchProto$MainViewUriResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "entityType", "experience", "Lcom/spotify/assistedcuration/endpointsimpl/assistedcurationsearch/v1/SearchProto$EntityViewUriResponse;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_assistedcuration_endpointsimpl-endpointsimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface ue7 {
    static /* synthetic */ Single b(ue7 ue7Var, String str, String str2, Integer num, String str3, String str4, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: searchEntityUrisOnly");
            return null;
        }
        if ((i & 4) != 0) {
            num = 20;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str3 = "";
        }
        return ue7Var.c(str, str2, num2, str3, (i & 16) != 0 ? null : str4);
    }

    static /* synthetic */ Single d(ue7 ue7Var, String str, String str2, Integer num, String str3, int i, Object obj) {
        if (obj != null) {
            hhg1.h("Super calls with default arguments not supported in this target, function: searchMainUrisOnly");
            return null;
        }
        if ((i & 4) != 0) {
            num = 20;
        }
        if ((i & 8) != 0) {
            str3 = "";
        }
        return ue7Var.a(str, str2, num, str3);
    }

    @ay30("assisted-curation/v1/search/uri")
    Single<SearchProto$MainViewUriResponse> a(@u0z0("query") String query, @u0z0("entity_types") String entityTypes, @u0z0("limit") Integer limit, @u0z0("page_token") String pageToken);

    @ay30("assisted-curation/v1/search/entity/uri")
    Single<SearchProto.EntityViewUriResponse> c(@u0z0("query") String query, @u0z0("entity_type") String entityType, @u0z0("limit") Integer limit, @u0z0("page_token") String pageToken, @u0z0("experience") String experience);
}
