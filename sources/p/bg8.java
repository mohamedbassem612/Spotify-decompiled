package p;

import com.spotify.authentication.login5esperanto.EsAuthenticateContext$AuthenticateContext;
import com.spotify.authentication.login5esperanto.EsCodeRequired$CodeRequiredProceedRequest;
import com.spotify.authentication.login5esperanto.EsInteractionRequired$InteractionRequiredProceedRequest;
import com.spotify.authentication.login5esperanto.EsRecaptchaInfo;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bg8 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ fg8 c;
    public final /* synthetic */ EsAuthenticateContext$AuthenticateContext d;
    public final /* synthetic */ Single e;
    public final /* synthetic */ Function0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bg8(AtomicReference atomicReference, fg8 fg8Var, EsAuthenticateContext$AuthenticateContext esAuthenticateContext$AuthenticateContext, Single single, Function0 function0, byte b) {
        super(2);
        this.a = b;
        this.b = atomicReference;
        this.c = fg8Var;
        this.d = esAuthenticateContext$AuthenticateContext;
        this.e = single;
        this.f = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        EsRecaptchaInfo.RecaptchaInfo recaptchaInfo;
        byte b = this.a;
        Single single = this.e;
        EsAuthenticateContext$AuthenticateContext esAuthenticateContext$AuthenticateContext = this.d;
        fg8 fg8Var = this.c;
        AtomicReference atomicReference = this.b;
        Function0 function0 = this.f;
        switch (b) {
            case 0:
                String str = (String) obj;
                yi01 yi01Var = (yi01) obj2;
                if (((Boolean) atomicReference.get()).booleanValue()) {
                    Single singleJust = Single.just(new n341(new ug8(400, "Attempted to continue an aborted challenge")));
                    singleJust.getClass();
                    return singleJust;
                }
                wve0 wve0Var = fg8Var.a;
                qlz qlzVarN = EsCodeRequired$CodeRequiredProceedRequest.n();
                qlzVarN.q(esAuthenticateContext$AuthenticateContext);
                qlzVarN.n(str);
                if (yi01Var != null) {
                    tqz tqzVarO = EsRecaptchaInfo.RecaptchaInfo.o();
                    tqzVarO.n(yi01Var.a());
                    String strB = yi01Var.b();
                    if (strB != null) {
                        tqzVarO.q(strB);
                    }
                    recaptchaInfo = (EsRecaptchaInfo.RecaptchaInfo) tqzVarO.build();
                } else {
                    recaptchaInfo = null;
                }
                if (recaptchaInfo != null) {
                    qlzVarN.r(recaptchaInfo);
                }
                return wve0Var.callSingle("spotify.authentication.login5.impl.proto.Login5", "codeRequiredProceed", (EsCodeRequired$CodeRequiredProceedRequest) qlzVarN.build()).map(a020.Y).filter(qz70.i).f(new a42(function0, fg8Var)).k(single.map(new zf8(fg8Var, single, function0, (byte) 1)));
            default:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                if (((Boolean) atomicReference.get()).booleanValue()) {
                    Single singleJust2 = Single.just(new yv80(new ug8(400, "Attempted to continue an aborted challenge")));
                    singleJust2.getClass();
                    return singleJust2;
                }
                wve0 wve0Var2 = fg8Var.a;
                wnz wnzVarN = EsInteractionRequired$InteractionRequiredProceedRequest.n();
                wnzVarN.n(esAuthenticateContext$AuthenticateContext);
                wnzVarN.q(str2);
                wnzVarN.r(str3);
                return wve0Var2.callSingle("spotify.authentication.login5.impl.proto.Login5", "interactionRequiredProceed", (EsInteractionRequired$InteractionRequiredProceedRequest) wnzVarN.build()).map(ta20.Y).filter(cq41.i).f(new dg8(function0, fg8Var)).k(single.map(new zf8(fg8Var, single, function0, (byte) 5)));
        }
    }
}
