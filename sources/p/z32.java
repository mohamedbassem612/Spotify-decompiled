package p;

import com.spotify.ads.esperanto.proto.GetAdsRequest;
import com.spotify.ads.esperanto.proto.GetAdsResponse;
import com.spotify.esperanto.esperanto.CoroutineClientBase;
import j$.util.Base64;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z32 extends CoroutineClientBase {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(GetAdsRequest getAdsRequest, onm onmVar) {
        y32 y32Var;
        if (onmVar instanceof y32) {
            y32Var = (y32) onmVar;
            int i = y32Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                y32Var.c = i - Integer.MIN_VALUE;
            } else {
                y32Var = new y32(this, onmVar);
            }
        } else {
            y32Var = new y32(this, onmVar);
        }
        Object objCallSingle = y32Var.a;
        int i2 = y32Var.c;
        if (i2 == 0) {
            hm5.M(objCallSingle);
            y32Var.c = 1;
            objCallSingle = callSingle("spotify.ads.esperanto.proto.Ads", "GetAds", getAdsRequest, y32Var);
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
            return GetAdsResponse.r(bArr);
        } catch (Exception e) {
            bhn0.o(f4i1.f("Unable to parse data as com.spotify.ads.esperanto.proto.GetAdsResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e);
            return null;
        }
    }
}
