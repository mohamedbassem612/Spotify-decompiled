package p;

import com.spotify.checkout.proto.model.v1.proto.Error;
import com.spotify.checkout.proto.model.v1.proto.FollowLinkCta;
import com.spotify.checkout.proto.model.v1.proto.GetCheckoutPageResponse;
import com.spotify.checkout.proto.model.v1.proto.j;
import com.spotify.checkout.proto.model.v1.proto.k;
import com.spotify.checkout.proto.model.v1.proto.m;
import com.spotify.checkout.proto.model.v1.proto.n;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class acm0 extends hab0 implements iu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acm0(String str, String str2, String str3) {
        super(1);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final Object invoke(Object obj) {
        n nVarW = GetCheckoutPageResponse.w();
        j jVarT = Error.t();
        jVarT.u("Ooops! Something went wrong");
        jVarT.t("There was some problem with your purchase");
        m mVarQ = Error.PrimaryLinkSecondaryCloseCta.q();
        i630 i630VarQ = FollowLinkCta.q();
        i630VarQ.q(this.a);
        i630VarQ.n(this.b);
        mVarQ.n(i630VarQ);
        k kVarP = Error.CloseCta.p();
        kVarP.n(this.c);
        mVarQ.q(kVarP);
        jVarT.s(mVarQ);
        nVarW.r((Error) jVarT.build());
        return (GetCheckoutPageResponse) nVarW.build();
    }
}
