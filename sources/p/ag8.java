package p;

import com.spotify.authentication.login5esperanto.EsAuthenticateContext$AuthenticateContext;
import com.spotify.authentication.login5esperanto.EsAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest;
import com.spotify.authentication.login5esperanto.EsCodeRequired$CodeRequiredProceedRequest;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ag8 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ fg8 c;
    public final /* synthetic */ EsAuthenticateContext$AuthenticateContext d;
    public final /* synthetic */ Single e;
    public final /* synthetic */ Function0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ag8(AtomicReference atomicReference, fg8 fg8Var, EsAuthenticateContext$AuthenticateContext esAuthenticateContext$AuthenticateContext, Single single, Function0 function0, byte b) {
        super(1);
        this.a = b;
        this.b = atomicReference;
        this.c = fg8Var;
        this.d = esAuthenticateContext$AuthenticateContext;
        this.e = single;
        this.f = function0;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Single single = this.e;
        EsAuthenticateContext$AuthenticateContext esAuthenticateContext$AuthenticateContext = this.d;
        fg8 fg8Var = this.c;
        AtomicReference atomicReference = this.b;
        Function0 function0 = this.f;
        switch (b) {
            case 0:
                byte[] bArr = (byte[]) obj;
                if (((Boolean) atomicReference.get()).booleanValue()) {
                    Single singleJust = Single.just(new om8(new ug8(400, "Attempted to continue an aborted challenge")));
                    singleJust.getClass();
                    return singleJust;
                }
                wve0 wve0Var = fg8Var.a;
                clz clzVarN = EsAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest.n();
                clzVarN.n(esAuthenticateContext$AuthenticateContext);
                clzVarN.q(phc.e(0, bArr, bArr.length));
                return wve0Var.callSingle("spotify.authentication.login5.impl.proto.Login5", "authnPlatformRequiredProceed", (EsAuthnPlatformRequired$AuthnPlatformRequiredProceedRequest) clzVarN.build()).map(zz10.Y).filter(v560.i).f(new fl1(function0, fg8Var)).k(single.map(new zf8(fg8Var, single, function0, (byte) 0)));
            default:
                String str = (String) obj;
                if (((Boolean) atomicReference.get()).booleanValue()) {
                    Single singleJust2 = Single.just(new bww(new ug8(400, "Attempted to continue an aborted challenge")));
                    singleJust2.getClass();
                    return singleJust2;
                }
                wve0 wve0Var2 = fg8Var.a;
                qlz qlzVarN = EsCodeRequired$CodeRequiredProceedRequest.n();
                qlzVarN.q(esAuthenticateContext$AuthenticateContext);
                qlzVarN.n(str);
                return wve0Var2.callSingle("spotify.authentication.login5.impl.proto.Login5", "codeRequiredProceed", (EsCodeRequired$CodeRequiredProceedRequest) qlzVarN.build()).map(a020.Y).filter(zhm0.h).f(new q04(function0, fg8Var)).k(single.map(new zf8(fg8Var, single, function0, (byte) 3)));
        }
    }
}
