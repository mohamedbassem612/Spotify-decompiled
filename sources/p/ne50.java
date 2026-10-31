package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\bJ\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lp/ne50;", "", "", "bannerType", "Lp/dxc;", "Ljava/lang/Void;", "a", "(Ljava/lang/String;)Lp/dxc;", "p/me50", "src_main_java_com_spotify_allboarding_allboardingimpl-allboardingimpl"}, k = 1, mv = {2, 3, 0}, xi = ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER)
public interface ne50 {
    public static final me50 a = me50.a;
    public static final String b = "audiobook-onboarding";
    public static final String c = "podcast-onboarding";

    @wyq0("gravity-taste/v1/dismiss-banner/{banner-type}")
    dxc<Void> a(@t8s0("banner-type") String bannerType);
}
