package p;

import com.google.protobuf.Empty;
import com.spotify.connectivity.traffic.esperanto.proto.EsTrafficEvents$TrafficEvent;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import j$.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class oe30 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(EsTrafficEvents$TrafficEvent esTrafficEvents$TrafficEvent, lnm lnmVar) {
        d4g1 d4g1Var;
        if (lnmVar instanceof d4g1) {
            d4g1Var = (d4g1) lnmVar;
            int i = d4g1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d4g1Var.c = i - Integer.MIN_VALUE;
            } else {
                d4g1Var = new d4g1(this, lnmVar);
            }
        } else {
            d4g1Var = new d4g1(this, lnmVar);
        }
        Object objCallSingle = d4g1Var.a;
        int i2 = d4g1Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            d4g1Var.c = 1;
            objCallSingle = callSingle("spotify.connectivity.traffic.esperanto.proto.TrafficAdapter", "notifyTrafficEvent", esTrafficEvents$TrafficEvent, d4g1Var);
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
}
