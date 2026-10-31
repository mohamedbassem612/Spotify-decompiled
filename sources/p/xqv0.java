package p;

import com.spotify.checkout.premiumcheckout.model.v1.proto.GetCheckoutPageRequest;
import com.spotify.checkout.premiumcheckout.model.v1.proto.GetCheckoutPageResponse;
import com.spotify.messages.BetamaxPlaybackSession;
import io.reactivex.rxjava3.core.Single;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lp/xqv0;", "", "Lcom/spotify/checkout/premiumcheckout/model/v1/proto/GetCheckoutPageRequest;", "body", "Lio/reactivex/rxjava3/core/Single;", "Lcom/spotify/checkout/premiumcheckout/model/v1/proto/GetCheckoutPageResponse;", "a", "(Lcom/spotify/checkout/premiumcheckout/model/v1/proto/GetCheckoutPageRequest;)Lio/reactivex/rxjava3/core/Single;", "src_main_java_com_spotify_checkout_premiumcheckout-premiumcheckout"}, k = 1, mv = {2, 3, 0}, xi = BetamaxPlaybackSession.CLIENT_METADATA_FIELD_NUMBER)
public interface xqv0 {
    @u360({"Content-Type: application/x-protobuf", "Accept: application/x-protobuf", "Content-Encoding: identity"})
    @wyq0("www-checkout-android/spotify.checkout.inAppChoice.v1.Checkout/GetCheckoutPage")
    Single<GetCheckoutPageResponse> a(@elb GetCheckoutPageRequest body);
}
