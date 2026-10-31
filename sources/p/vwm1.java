package p;

import com.spotify.esperanto.esperanto.CoroutineClientBase;
import j$.util.Base64;
import spotify.your_library.esperanto.proto.YourLibraryContainsRequest;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryDecorateRequest;
import spotify.your_library.esperanto.proto.YourLibraryRequest;
import spotify.your_library.esperanto.proto.YourLibraryResponse;
import spotify.your_library.proto.SetFilterOrder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vwm1 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(YourLibraryRequest yourLibraryRequest, onm onmVar) {
        nwm1 nwm1Var;
        if (onmVar instanceof nwm1) {
            nwm1Var = (nwm1) onmVar;
            int i = nwm1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nwm1Var.c = i - Integer.MIN_VALUE;
            } else {
                nwm1Var = new nwm1(this, onmVar);
            }
        } else {
            nwm1Var = new nwm1(this, onmVar);
        }
        Object objCallSingle = nwm1Var.a;
        int i2 = nwm1Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            nwm1Var.c = 1;
            objCallSingle = callSingle("spotify.your_library_esperanto.proto.YourLibraryService", "All", yourLibraryRequest, nwm1Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return YourLibraryResponse.s(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.your_library.esperanto.proto.YourLibraryResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(YourLibraryContainsRequest yourLibraryContainsRequest, onm onmVar) {
        owm1 owm1Var;
        if (onmVar instanceof owm1) {
            owm1Var = (owm1) onmVar;
            int i = owm1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                owm1Var.c = i - Integer.MIN_VALUE;
            } else {
                owm1Var = new owm1(this, onmVar);
            }
        } else {
            owm1Var = new owm1(this, onmVar);
        }
        Object objCallSingle = owm1Var.a;
        int i2 = owm1Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            owm1Var.c = 1;
            objCallSingle = callSingle("spotify.your_library_esperanto.proto.YourLibraryService", "Contains", yourLibraryContainsRequest, owm1Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return YourLibraryContainsResponse.q(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.your_library.esperanto.proto.YourLibraryContainsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(SetFilterOrder.SetFilterOrderRequest setFilterOrderRequest, onm onmVar) {
        pwm1 pwm1Var;
        if (onmVar instanceof pwm1) {
            pwm1Var = (pwm1) onmVar;
            int i = pwm1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pwm1Var.c = i - Integer.MIN_VALUE;
            } else {
                pwm1Var = new pwm1(this, onmVar);
            }
        } else {
            pwm1Var = new pwm1(this, onmVar);
        }
        Object objCallSingle = pwm1Var.a;
        int i2 = pwm1Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            pwm1Var.c = 1;
            objCallSingle = callSingle("spotify.your_library_esperanto.proto.YourLibraryService", "SetFilterOrder", setFilterOrderRequest, pwm1Var);
            d9n d9nVar = d9n.a;
            if (objCallSingle == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objCallSingle);
        }
        byte[] bArr = (byte[]) objCallSingle;
        try {
            return SetFilterOrder.SetFilterOrderResponse.n(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as spotify.your_library.proto.SetFilterOrder.SetFilterOrderResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    public final uji1 d(YourLibraryRequest yourLibraryRequest) {
        return new uji1(callStream("spotify.your_library_esperanto.proto.YourLibraryService", "StreamAll", yourLibraryRequest), (byte) 12);
    }

    public final uji1 e(YourLibraryDecorateRequest yourLibraryDecorateRequest) {
        return new uji1(callStream("spotify.your_library_esperanto.proto.YourLibraryService", "StreamDecorate", yourLibraryDecorateRequest), (byte) 14);
    }
}
