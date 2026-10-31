package p;

import com.google.protobuf.Empty;
import com.spotify.ads.esperanto.proto.DeleteRequestHeadersRequest;
import com.spotify.ads.esperanto.proto.SetRequestHeadersRequest;
import com.spotify.ads.esperanto.proto.UpdateSlotEnabledRequest;
import com.spotify.ads.esperanto.proto.UpdateSlotResponse;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import j$.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oo61 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(DeleteRequestHeadersRequest deleteRequestHeadersRequest, onm onmVar) {
        ko61 ko61Var;
        if (onmVar instanceof ko61) {
            ko61Var = (ko61) onmVar;
            int i = ko61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ko61Var.c = i - Integer.MIN_VALUE;
            } else {
                ko61Var = new ko61(this, onmVar);
            }
        } else {
            ko61Var = new ko61(this, onmVar);
        }
        Object objCallSingle = ko61Var.a;
        int i2 = ko61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            ko61Var.c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Settings", "deleteRequestHeaders", deleteRequestHeadersRequest, ko61Var);
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
            return Empty.q(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(SetRequestHeadersRequest setRequestHeadersRequest, onm onmVar) {
        lo61 lo61Var;
        if (onmVar instanceof lo61) {
            lo61Var = (lo61) onmVar;
            int i = lo61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lo61Var.c = i - Integer.MIN_VALUE;
            } else {
                lo61Var = new lo61(this, onmVar);
            }
        } else {
            lo61Var = new lo61(this, onmVar);
        }
        Object objCallSingle = lo61Var.a;
        int i2 = lo61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            lo61Var.c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Settings", "setRequestHeaders", setRequestHeadersRequest, lo61Var);
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
            return Empty.q(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.google.protobuf.Empty: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(UpdateSlotEnabledRequest updateSlotEnabledRequest, onm onmVar) {
        mo61 mo61Var;
        if (onmVar instanceof mo61) {
            mo61Var = (mo61) onmVar;
            int i = mo61Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mo61Var.c = i - Integer.MIN_VALUE;
            } else {
                mo61Var = new mo61(this, onmVar);
            }
        } else {
            mo61Var = new mo61(this, onmVar);
        }
        Object objCallSingle = mo61Var.a;
        int i2 = mo61Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            mo61Var.c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Settings", "updateSlotEnabled", updateSlotEnabledRequest, mo61Var);
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
            return UpdateSlotResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.ads.esperanto.proto.UpdateSlotResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }
}
