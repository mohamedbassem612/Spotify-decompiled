package p;

import com.spotify.upselloffer.endpointimpl.proto.GetUpsellOfferRequest;
import com.spotify.upselloffer.endpointimpl.proto.GetUpsellOfferResponse;
import com.spotify.upselloffer.endpointimpl.proto.UpsellOffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class j0i1 {
    public final qnp0 a;

    public j0i1(qnp0 qnp0Var) {
        this.a = qnp0Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) {
        i0i1 i0i1Var;
        if (onmVar instanceof i0i1) {
            i0i1Var = (i0i1) onmVar;
            int i = i0i1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i0i1Var.c = i - Integer.MIN_VALUE;
            } else {
                i0i1Var = new i0i1(this, onmVar);
            }
        } else {
            i0i1Var = new i0i1(this, onmVar);
        }
        Object objA = i0i1Var.a;
        int i2 = i0i1Var.c;
        String str = null;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                qnp0 qnp0Var = this.a;
                cr40 cr40VarO = GetUpsellOfferRequest.o();
                cr40VarO.n(upn1.m());
                GetUpsellOfferRequest getUpsellOfferRequest = (GetUpsellOfferRequest) cr40VarO.build();
                i0i1Var.c = 1;
                objA = qnp0Var.a(getUpsellOfferRequest, i0i1Var);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            GetUpsellOfferResponse getUpsellOfferResponse = (GetUpsellOfferResponse) objA;
            if (!getUpsellOfferResponse.o() || !getUpsellOfferResponse.n().t()) {
                return inp0.a;
            }
            UpsellOffer upsellOfferN = getUpsellOfferResponse.n();
            String strO = upsellOfferN.o();
            String strR = upsellOfferN.r();
            String strN = upsellOfferN.n();
            if (upsellOfferN.s()) {
                strN.getClass();
                if (ihc1.y0(strN)) {
                    strN = null;
                }
            } else {
                strN = null;
            }
            String strQ = upsellOfferN.q();
            if (upsellOfferN.u()) {
                strQ.getClass();
                if (!ihc1.y0(strQ)) {
                    str = strQ;
                }
            }
            return new jnp0(strO, strR, strN, str);
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Unknown error";
            }
            return new hnp0(message);
        }
    }
}
