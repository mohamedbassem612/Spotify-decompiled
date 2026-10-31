package p;

import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageRequest;
import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.GetSessionStatusRequest;
import com.spotify.checkout.proto.model.v1.proto.GetSessionStatusResponse;
import com.spotify.checkout.proto.model.v1.proto.SubmitCheckoutRequest;
import com.spotify.checkout.proto.model.v1.proto.SubmitCheckoutResponse;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH'¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lp/t6g;", "", "Lcom/spotify/checkout/proto/model/v1/proto/GetCheckoutPageRequest;", "body", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/checkout/proto/model/v1/proto/GetCheckoutPageResponse;", "c", "(Lcom/spotify/checkout/proto/model/v1/proto/GetCheckoutPageRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/checkout/proto/model/v1/proto/GetSessionStatusRequest;", "Lcom/spotify/checkout/proto/model/v1/proto/GetSessionStatusResponse;", "b", "(Lcom/spotify/checkout/proto/model/v1/proto/GetSessionStatusRequest;)Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/checkout/proto/model/v1/proto/SubmitCheckoutRequest;", "Lcom/spotify/checkout/proto/model/v1/proto/SubmitCheckoutResponse;", "a", "(Lcom/spotify/checkout/proto/model/v1/proto/SubmitCheckoutRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_gpb_choicescreenuc-choicescreenuc"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface t6g {
    @u360({"Accept: application/protobuf"})
    @wyq0("commerce-unified-checkout-service/spotify.unifiedcheckout.v1.android.UnifiedCheckoutAndroidService/SubmitCheckout")
    Single<SubmitCheckoutResponse> a(@elb SubmitCheckoutRequest body);

    @u360({"Accept: application/protobuf"})
    @wyq0("commerce-unified-checkout-service/spotify.unifiedcheckout.v1.android.UnifiedCheckoutAndroidService/GetSessionStatus")
    Single<GetSessionStatusResponse> b(@elb GetSessionStatusRequest body);

    @u360({"Accept: application/protobuf"})
    @wyq0("commerce-unified-checkout-service/spotify.unifiedcheckout.v1.android.UnifiedCheckoutAndroidService/GetCheckoutPage")
    Single<GetCheckoutPageResponse> c(@elb GetCheckoutPageRequest body);
}
