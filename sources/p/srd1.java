package p;

import com.spotify.ads.esperanto.proto.PutTargetingRequest;
import com.spotify.ads.esperanto.proto.TargetingResponse;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import j$.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class srd1 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(PutTargetingRequest putTargetingRequest, onm onmVar) {
        rrd1 rrd1Var;
        if (onmVar instanceof rrd1) {
            rrd1Var = (rrd1) onmVar;
            int i = rrd1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rrd1Var.c = i - Integer.MIN_VALUE;
            } else {
                rrd1Var = new rrd1(this, onmVar);
            }
        } else {
            rrd1Var = new rrd1(this, onmVar);
        }
        Object objCallSingle = rrd1Var.a;
        int i2 = rrd1Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            rrd1Var.c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Targeting", "PutTargeting", putTargetingRequest, rrd1Var);
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
            return TargetingResponse.p(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.ads.esperanto.proto.TargetingResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }
}
