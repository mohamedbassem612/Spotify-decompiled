package p;

import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$Form;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$FormField;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$GetPaymentSessionResponse;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$LegalTerm;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$PaymentMethod;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$PaymentSessionResponse;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto$ResponseAction;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cbs0 implements Function {
    public final /* synthetic */ lbw a;

    public cbs0(gbs0 gbs0Var, lbw lbwVar) {
        this.a = lbwVar;
    }

    public final Object apply(Object obj) {
        xxz jvzVar;
        ee30 ee30Var;
        mmr0 mmr0Var;
        q2c0 q2c0Var;
        Object objError = ((e331) obj).a;
        lbw lbwVar = this.a;
        String str = lbwVar.a;
        if (!(objError instanceof m231)) {
            PaymentSdkNativeServiceProto$GetPaymentSessionResponse paymentSdkNativeServiceProto$GetPaymentSessionResponse = (PaymentSdkNativeServiceProto$GetPaymentSessionResponse) objError;
            int iP = paymentSdkNativeServiceProto$GetPaymentSessionResponse.p();
            int i = iP == 0 ? -1 : bbs0.a[l1d.C(iP)];
            if (i != -1) {
                String str2 = null;
                int i2 = 3;
                int i3 = 2;
                if (i == 1) {
                    PaymentSdkNativeServiceProto$PaymentSessionResponse paymentSdkNativeServiceProto$PaymentSessionResponseO = paymentSdkNativeServiceProto$GetPaymentSessionResponse.o();
                    String str3 = lbwVar.a;
                    String str4 = lbwVar.b;
                    ycs0 ycs0Var = new ycs0(paymentSdkNativeServiceProto$PaymentSessionResponseO.r().r(), paymentSdkNativeServiceProto$PaymentSessionResponseO.r().q(), paymentSdkNativeServiceProto$PaymentSessionResponseO.r().o(), paymentSdkNativeServiceProto$PaymentSessionResponseO.r().n());
                    String strO = paymentSdkNativeServiceProto$PaymentSessionResponseO.q().o();
                    String strN = paymentSdkNativeServiceProto$PaymentSessionResponseO.q().n();
                    h290<PaymentSdkNativeServiceProto$PaymentMethod> h290VarP = paymentSdkNativeServiceProto$PaymentSessionResponseO.p();
                    int i4 = 10;
                    ArrayList arrayList = new ArrayList(q7h.U(h290VarP, 10));
                    for (PaymentSdkNativeServiceProto$PaymentMethod paymentSdkNativeServiceProto$PaymentMethod : h290VarP) {
                        PaymentSdkNativeServiceProto$Form paymentSdkNativeServiceProto$FormO = paymentSdkNativeServiceProto$PaymentMethod.o();
                        try {
                            String id = paymentSdkNativeServiceProto$FormO.getId();
                            String strO2 = paymentSdkNativeServiceProto$FormO.o();
                            String str5 = strO2.length() == 0 ? str2 : strO2;
                            String strN2 = paymentSdkNativeServiceProto$FormO.n();
                            String str6 = strN2.length() == 0 ? str2 : strN2;
                            h290<PaymentSdkNativeServiceProto$FormField> h290VarQ = paymentSdkNativeServiceProto$FormO.q();
                            ArrayList arrayList2 = new ArrayList(q7h.U(h290VarQ, i4));
                            for (PaymentSdkNativeServiceProto$FormField paymentSdkNativeServiceProto$FormField : h290VarQ) {
                                paymentSdkNativeServiceProto$FormField.getClass();
                                arrayList2.add(gbs0.a(paymentSdkNativeServiceProto$FormField));
                            }
                            ee30Var = new ee30(id, str5, str6, false, mqo1.A(arrayList2));
                        } catch (IllegalArgumentException unused) {
                            ee30Var = null;
                        }
                        if (ee30Var != null) {
                            mmr0Var = new mmr0(ee30Var, Boolean.TRUE);
                        } else {
                            String id2 = paymentSdkNativeServiceProto$PaymentMethod.o().getId();
                            String strO3 = paymentSdkNativeServiceProto$PaymentMethod.o().o();
                            String str7 = strO3.length() == 0 ? null : strO3;
                            String strN3 = paymentSdkNativeServiceProto$PaymentMethod.o().n();
                            mmr0Var = new mmr0(new ee30(id2, str7, strN3.length() == 0 ? null : strN3, false, mqo1.A(z6x.a)), Boolean.FALSE);
                        }
                        ee30 ee30Var2 = (ee30) mmr0Var.a;
                        boolean zBooleanValue = ((Boolean) mmr0Var.b).booleanValue();
                        String id3 = paymentSdkNativeServiceProto$PaymentMethod.getId();
                        String strU = paymentSdkNativeServiceProto$PaymentMethod.u().length() == 0 ? null : paymentSdkNativeServiceProto$PaymentMethod.u();
                        String strQ = paymentSdkNativeServiceProto$PaymentMethod.q();
                        String subtitle = paymentSdkNativeServiceProto$PaymentMethod.getSubtitle();
                        String str8 = subtitle.length() == 0 ? null : subtitle;
                        String strN4 = paymentSdkNativeServiceProto$PaymentMethod.n();
                        String str9 = strN4.length() == 0 ? null : strN4;
                        boolean z = paymentSdkNativeServiceProto$PaymentMethod.p() && zBooleanValue;
                        c380 c380VarA = mqo1.A(paymentSdkNativeServiceProto$PaymentMethod.s());
                        h290<PaymentSdkNativeServiceProto$LegalTerm> h290VarR = paymentSdkNativeServiceProto$PaymentMethod.r();
                        ArrayList arrayList3 = new ArrayList();
                        for (PaymentSdkNativeServiceProto$LegalTerm paymentSdkNativeServiceProto$LegalTerm : h290VarR) {
                            int i5 = zas0.f[paymentSdkNativeServiceProto$LegalTerm.p().ordinal()];
                            if (i5 == 1) {
                                q2c0Var = q2c0.b;
                            } else if (i5 == i3) {
                                q2c0Var = q2c0.c;
                            } else if (i5 != i2) {
                                q2c0Var = i5 != 4 ? null : q2c0.d;
                            } else {
                                q2c0Var = q2c0.a;
                            }
                            p2c0 p2c0Var = q2c0Var == null ? null : new p2c0(q2c0Var, paymentSdkNativeServiceProto$LegalTerm.o(), paymentSdkNativeServiceProto$LegalTerm.n());
                            if (p2c0Var != null) {
                                arrayList3.add(p2c0Var);
                            }
                            i2 = 3;
                            i3 = 2;
                        }
                        arrayList.add(new xbs0(id3, strU, strQ, str8, str9, z, c380VarA, ee30Var2, mqo1.A(arrayList3), !paymentSdkNativeServiceProto$PaymentMethod.v() ? null : new imr0(paymentSdkNativeServiceProto$PaymentMethod.t().getTitle(), paymentSdkNativeServiceProto$PaymentMethod.t().n(), paymentSdkNativeServiceProto$PaymentMethod.t().o())));
                        i4 = 10;
                        str2 = null;
                        i2 = 3;
                        i3 = 2;
                    }
                    tcs0 tcs0Var = new tcs0(str3, str4, ycs0Var, strO, strN, mqo1.A(arrayList));
                    PaymentSdkNativeServiceProto$ResponseAction.Error errorO = paymentSdkNativeServiceProto$PaymentSessionResponseO.o();
                    if (!paymentSdkNativeServiceProto$PaymentSessionResponseO.s()) {
                        errorO = null;
                    }
                    jvzVar = new ayz(tcs0Var, errorO != null ? new iz21(errorO.o()) : null);
                } else if (i == 2) {
                    jvzVar = new czz(str);
                } else if (i == 3) {
                    jvzVar = new jvz(str);
                } else {
                    if (i != 4 && i != 5) {
                        eg.o();
                        return null;
                    }
                    jvzVar = new xxz(2, str, paymentSdkNativeServiceProto$GetPaymentSessionResponse.n().o(), (Throwable) null);
                }
            } else {
                jvzVar = new jvz(str);
            }
            objError = Single.just(jvzVar);
        }
        Throwable thA = e331.a(objError);
        if (thA != null) {
            objError = Single.error(thA);
        }
        return (SingleSource) objError;
    }
}
