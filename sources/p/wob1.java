package p;

import com.google.protobuf.Empty;
import com.spotify.ads.esperanto.proto.PutStateRequest;
import com.spotify.ads.esperanto.proto.StateRequest;
import com.spotify.ads.esperanto.proto.StateResponse;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import j$.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wob1 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(StateRequest stateRequest, onm onmVar) {
        uob1 uob1Var;
        if (onmVar instanceof uob1) {
            uob1Var = (uob1) onmVar;
            int i = uob1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                uob1Var.c = i - Integer.MIN_VALUE;
            } else {
                uob1Var = new uob1(this, onmVar);
            }
        } else {
            uob1Var = new uob1(this, onmVar);
        }
        Object objCallSingle = uob1Var.a;
        int i2 = uob1Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            uob1Var.c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.State", "GetState", stateRequest, uob1Var);
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
            return StateResponse.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.ads.esperanto.proto.StateResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(PutStateRequest putStateRequest, onm onmVar) {
        vob1 vob1Var;
        if (onmVar instanceof vob1) {
            vob1Var = (vob1) onmVar;
            int i = vob1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vob1Var.c = i - Integer.MIN_VALUE;
            } else {
                vob1Var = new vob1(this, onmVar);
            }
        } else {
            vob1Var = new vob1(this, onmVar);
        }
        Object objCallSingle = vob1Var.a;
        int i2 = vob1Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            vob1Var.c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.State", "PutState", putStateRequest, vob1Var);
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
