package p;

import com.spotify.ads.esperanto.proto.PostEventV2Request;
import com.spotify.ads.esperanto.proto.PostEventV2Response;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import j$.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lu0 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(PostEventV2Request postEventV2Request, onm onmVar) {
        ku0 ku0Var;
        if (onmVar instanceof ku0) {
            ku0Var = (ku0) onmVar;
            int i = ku0Var.c;
            if ((i & os00.INVALID_ID) != 0) {
                ku0Var.c = i - os00.INVALID_ID;
            } else {
                ku0Var = new ku0(this, onmVar);
            }
        } else {
            ku0Var = new ku0(this, onmVar);
        }
        Object objCallSingle = ku0Var.a;
        int i2 = ku0Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            ku0Var.c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.AdOpportunity", "postEventV2", postEventV2Request, ku0Var);
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
            return PostEventV2Response.o(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.ads.esperanto.proto.PostEventV2Response: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }
}
