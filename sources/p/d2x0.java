package p;

import com.spotify.identity.proto.v3.Identity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class d2x0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Identity.UserProfile b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2x0(Identity.UserProfile userProfile, byte b) {
        super(0);
        this.a = b;
        this.b = userProfile;
    }

    public final Object invoke() {
        byte b = this.a;
        Identity.UserProfile userProfile = this.b;
        switch (b) {
            case 0:
                return userProfile.t();
            default:
                return userProfile.r();
        }
    }
}
