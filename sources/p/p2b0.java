package p;

import com.spotify.kidsview.v2.proto.GetManagedAccountDetailsViewResponse;
import com.spotify.kidsview.v2.proto.SetManagedAccountSettingsRequest;
import com.spotify.kidsview.v2.proto.SetManagedAccountSettingsResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lp/p2b0;", "", "", "teenId", "Lp/rih1;", "b", "(Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "managedAccountId", "type", "Lcom/spotify/kidsview/v2/proto/GetManagedAccountDetailsViewResponse;", "a", "(Ljava/lang/String;Ljava/lang/String;Lp/lnm;)Ljava/lang/Object;", "Lcom/spotify/kidsview/v2/proto/SetManagedAccountSettingsRequest;", "request", "Lcom/spotify/kidsview/v2/proto/SetManagedAccountSettingsResponse;", "c", "(Ljava/lang/String;Ljava/lang/String;Lcom/spotify/kidsview/v2/proto/SetManagedAccountSettingsRequest;Lp/lnm;)Ljava/lang/Object;", "src_main_java_com_spotify_genalpha_datasourceimpl-datasourceimpl"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface p2b0 {
    @ay30("kids-view/v2/managed-account-details/{type}/{id}")
    @u360({"Accept: application/x-protobuf"})
    Object a(@t8s0("id") String str, @t8s0("type") String str2, lnm<? super GetManagedAccountDetailsViewResponse> lnmVar);

    @juo("teen-link/teen/{teenId}")
    Object b(@t8s0("teenId") String str, lnm<? super rih1> lnmVar);

    @yyq0("kids-view/v2/managed-account-settings/{type}/{id}")
    @u360({"Accept: application/x-protobuf", svt.d})
    Object c(@t8s0("id") String str, @t8s0("type") String str2, @elb SetManagedAccountSettingsRequest setManagedAccountSettingsRequest, lnm<? super SetManagedAccountSettingsResponse> lnmVar);
}
