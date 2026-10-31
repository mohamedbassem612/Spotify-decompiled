package p;

import com.spotify.authentication.login5esperanto.EsAuthenticateContext$AuthenticateContext;
import com.spotify.authentication.login5esperanto.EsCodeRequired$CodeRequiredResendRequest;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cg8 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ AtomicReference b;
    public final /* synthetic */ fg8 c;
    public final /* synthetic */ EsAuthenticateContext$AuthenticateContext d;
    public final /* synthetic */ Single e;
    public final /* synthetic */ Function0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cg8(AtomicReference atomicReference, fg8 fg8Var, EsAuthenticateContext$AuthenticateContext esAuthenticateContext$AuthenticateContext, Single single, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.b = atomicReference;
        this.c = fg8Var;
        this.d = esAuthenticateContext$AuthenticateContext;
        this.e = single;
        this.f = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        Single single = this.e;
        EsAuthenticateContext$AuthenticateContext esAuthenticateContext$AuthenticateContext = this.d;
        fg8 fg8Var = this.c;
        AtomicReference atomicReference = this.b;
        Function0 function0 = this.f;
        switch (b) {
            case 0:
                if (((Boolean) atomicReference.get()).booleanValue()) {
                    Single singleJust = Single.just(new u341(new ug8(400, "Attempted to continue an aborted challenge")));
                    singleJust.getClass();
                    return singleJust;
                }
                wve0 wve0Var = fg8Var.a;
                slz slzVarN = EsCodeRequired$CodeRequiredResendRequest.n();
                slzVarN.n(esAuthenticateContext$AuthenticateContext);
                return wve0Var.callSingle("spotify.authentication.login5.impl.proto.Login5", "codeRequiredResend", (EsCodeRequired$CodeRequiredResendRequest) slzVarN.build()).map(sa20.Y).filter(b6j0.h).f(new cp5(function0, fg8Var)).k(single.map(new zf8(fg8Var, single, function0, (byte) 2)));
            default:
                if (((Boolean) atomicReference.get()).booleanValue()) {
                    Single singleJust2 = Single.just(new iww(new ug8(400, "Attempted to continue an aborted challenge")));
                    singleJust2.getClass();
                    return singleJust2;
                }
                wve0 wve0Var2 = fg8Var.a;
                slz slzVarN2 = EsCodeRequired$CodeRequiredResendRequest.n();
                slzVarN2.n(esAuthenticateContext$AuthenticateContext);
                return wve0Var2.callSingle("spotify.authentication.login5.impl.proto.Login5", "codeRequiredResend", (EsCodeRequired$CodeRequiredResendRequest) slzVarN2.build()).map(sa20.Y).filter(drm0.i).f(new kr60(function0, fg8Var)).k(single.map(new zf8(fg8Var, single, function0, (byte) 4)));
        }
    }
}
