package p;

import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$CallbackProceedData;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$ProceedData;
import com.spotify.payment.endpoint.proto.c;
import com.spotify.payment.endpoint.proto.d;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fbs0 implements Function {
    public final /* synthetic */ hbs0 a;

    public fbs0(hbs0 hbs0Var) {
        this.a = hbs0Var;
    }

    public final Object apply(Object obj) {
        PaymentSdkNativeServiceProto$CallbackProceedData paymentSdkNativeServiceProto$CallbackProceedData;
        zfw zfwVar = (bgw) obj;
        hbs0 hbs0Var = this.a;
        fcs0 fcs0Var = hbs0Var.a;
        lcs0 lcs0VarN = PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest.n();
        lcs0VarN.r(zfwVar.b());
        lcs0VarN.n(zfwVar.a());
        lcs0VarN.q(zfwVar.c());
        if (zfwVar instanceof yfw) {
            c cVarN = PaymentSdkNativeServiceProto$CallbackProceedData.n();
            cVarN.n(PaymentSdkNativeServiceProto$ProceedData.PendingData.n());
            paymentSdkNativeServiceProto$CallbackProceedData = (PaymentSdkNativeServiceProto$CallbackProceedData) cVarN.build();
        } else {
            if (!(zfwVar instanceof zfw)) {
                eg.o();
                return null;
            }
            c cVarN2 = PaymentSdkNativeServiceProto$CallbackProceedData.n();
            d dVarO = PaymentSdkNativeServiceProto$CallbackProceedData.UrlProceedData.o();
            dVarO.n(zfwVar.d);
            cVarN2.q(dVarO);
            paymentSdkNativeServiceProto$CallbackProceedData = (PaymentSdkNativeServiceProto$CallbackProceedData) cVarN2.build();
        }
        lcs0VarN.s(paymentSdkNativeServiceProto$CallbackProceedData);
        return fcs0Var.a((PaymentSdkNativeServiceProto$CallbackProceedPaymentRequest) lcs0VarN.build()).map(new mre0(zfwVar, hbs0Var)).onErrorReturn(new m4e0(zfwVar, (byte) 28));
    }
}
