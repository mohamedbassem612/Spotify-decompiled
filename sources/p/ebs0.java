package p;

import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$ProceedData;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$ProceedPaymentRequest;
import com.spotify.payment.endpoint.proto.a0;
import com.spotify.payment.endpoint.proto.z;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ebs0 implements Function {
    public final /* synthetic */ gbs0 a;

    public ebs0(gbs0 gbs0Var) {
        this.a = gbs0Var;
    }

    public final Object apply(Object obj) {
        PaymentSdkNativeServiceProto$ProceedData paymentSdkNativeServiceProto$ProceedData;
        agw agwVar = (agw) obj;
        String strQ = agwVar.q();
        gbs0 gbs0Var = this.a;
        fcs0 fcs0Var = gbs0Var.a;
        qcs0 qcs0VarN = PaymentSdkNativeServiceProto$ProceedPaymentRequest.n();
        qcs0VarN.r(strQ);
        qcs0VarN.n(agwVar.a());
        qcs0VarN.q(agwVar.r());
        if (agwVar instanceof wfw) {
            z zVarN = PaymentSdkNativeServiceProto$ProceedData.n();
            a0 a0VarO = PaymentSdkNativeServiceProto$ProceedData.FormData.o();
            wfw wfwVar = (wfw) agwVar;
            a0VarO.q(wfwVar.c);
            a0VarO.n(wfwVar.e);
            zVarN.n(a0VarO);
            paymentSdkNativeServiceProto$ProceedData = (PaymentSdkNativeServiceProto$ProceedData) zVarN.build();
        } else {
            if (!(agwVar instanceof xfw)) {
                eg.o();
                return null;
            }
            z zVarN2 = PaymentSdkNativeServiceProto$ProceedData.n();
            zVarN2.q(PaymentSdkNativeServiceProto$ProceedData.PendingData.n());
            paymentSdkNativeServiceProto$ProceedData = (PaymentSdkNativeServiceProto$ProceedData) zVarN2.build();
        }
        qcs0VarN.s(paymentSdkNativeServiceProto$ProceedData);
        return fcs0Var.b((PaymentSdkNativeServiceProto$ProceedPaymentRequest) qcs0VarN.build(), agwVar.s()).map(new zhq0(strQ, gbs0Var, agwVar)).onErrorReturn(new myq0(strQ, agwVar, (byte) 9));
    }
}
