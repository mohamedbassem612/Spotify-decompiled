package p;

import android.os.SystemClock;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto;
import j$.time.Duration;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gbs0 {
    public final fcs0 a;
    public final bx5 b;

    public gbs0(fcs0 fcs0Var, bx5 bx5Var) {
        this.a = fcs0Var;
        this.b = bx5Var;
    }

    public static w220 a(PaymentSdkNativeServiceProto.FormField formField) {
        int i;
        hk80 gk80Var;
        String id;
        int iQ = formField.q();
        int i2 = 3;
        String str = "";
        switch (iQ == 0 ? -1 : zas0.d[l1d.C(iQ)]) {
            case 1:
                String name = formField.s().getName();
                String strQ = formField.s().q();
                int i3 = zas0.a[formField.s().t().ordinal()];
                if (i3 == 1) {
                    i = 2;
                } else if (i3 == 2) {
                    i = 3;
                } else if (i3 != 3) {
                    i = i3 != 4 ? 1 : 5;
                } else {
                    i = 4;
                }
                String strR = formField.s().r();
                String strO = formField.s().o();
                String str2 = strO.length() == 0 ? null : strO;
                h290<PaymentSdkNativeServiceProto.InputField.InputValidationRule> h290VarU = formField.s().u();
                ArrayList arrayList = new ArrayList();
                for (PaymentSdkNativeServiceProto.InputField.InputValidationRule inputValidationRule : h290VarU) {
                    int iQ2 = inputValidationRule.q();
                    int i4 = iQ2 == 0 ? -1 : zas0.b[l1d.C(iQ2)];
                    if (i4 == 1) {
                        gk80Var = new gk80(inputValidationRule.o().o(), inputValidationRule.n());
                    } else if (i4 == 2) {
                        gk80Var = new ik80(inputValidationRule.p().o(), inputValidationRule.n());
                    } else if (i4 == i2) {
                        gk80Var = new jk80(inputValidationRule.n());
                    } else if (i4 != 4) {
                        gk80Var = i4 != 5 ? null : new hk80(inputValidationRule.n());
                    } else {
                        gk80Var = new fk80(inputValidationRule.n());
                    }
                    if (gk80Var != null) {
                        arrayList.add(gk80Var);
                    }
                    i2 = 3;
                }
                c380 c380VarA = mqo1.A(arrayList);
                String strS = formField.s().s();
                String str3 = strS.length() == 0 ? null : strS;
                String strP = formField.s().p();
                return new s220(name, strQ, i, strR, str2, c380VarA, str3, (String) null, strP == null ? "" : strP);
            case 2:
                int i5 = zas0.c[formField.u().p().ordinal()];
                return new v220(formField.u().n(), i5 != 1 ? i5 != 2 ? 2 : 1 : 3);
            case 3:
                String strQ2 = formField.p().q();
                String name2 = formField.p().getName();
                h290<PaymentSdkNativeServiceProto.DropdownField.DropdownChoice> h290VarN = formField.p().n();
                ArrayList arrayList2 = new ArrayList(q7h.U(h290VarN, 10));
                for (PaymentSdkNativeServiceProto.DropdownField.DropdownChoice dropdownChoice : h290VarN) {
                    arrayList2.add(new z9v(dropdownChoice.n(), dropdownChoice.getId()));
                }
                c380 c380VarA2 = mqo1.A(arrayList2);
                String strP2 = formField.p().p();
                if (strP2.length() == 0) {
                    strP2 = null;
                }
                if (strP2 == null) {
                    PaymentSdkNativeServiceProto.DropdownField.DropdownChoice dropdownChoice2 = (PaymentSdkNativeServiceProto.DropdownField.DropdownChoice) o7h.s0(formField.p().n());
                    id = dropdownChoice2 != null ? dropdownChoice2.getId() : null;
                    if (id != null) {
                        str = id;
                    }
                } else {
                    str = strP2;
                }
                return new q220(strQ2, name2, str, c380VarA2);
            case 4:
                String strQ3 = formField.o().q();
                String name3 = formField.o().getName();
                h290<PaymentSdkNativeServiceProto.ChipsField.ChipsChoice> h290VarN2 = formField.o().n();
                ArrayList arrayList3 = new ArrayList(q7h.U(h290VarN2, 10));
                for (PaymentSdkNativeServiceProto.ChipsField.ChipsChoice chipsChoice : h290VarN2) {
                    arrayList3.add(new m4g(chipsChoice.n(), chipsChoice.getId(), chipsChoice.getDescription()));
                }
                c380 c380VarA3 = mqo1.A(arrayList3);
                String strP3 = formField.o().p();
                if (strP3.length() == 0) {
                    strP3 = null;
                }
                if (strP3 == null) {
                    PaymentSdkNativeServiceProto.ChipsField.ChipsChoice chipsChoice2 = (PaymentSdkNativeServiceProto.ChipsField.ChipsChoice) o7h.s0(formField.o().n());
                    id = chipsChoice2 != null ? chipsChoice2.getId() : null;
                    if (id != null) {
                        str = id;
                    }
                } else {
                    str = strP3;
                }
                return new p220(strQ3, name3, str, c380VarA3);
            case 5:
                String name4 = formField.n().getName();
                String strP4 = formField.n().p();
                String strO2 = formField.n().o();
                return new o220(name4, strP4, strO2.length() != 0 ? strO2 : null);
            case 6:
                return new r220(formField.r().n());
            case 7:
                PaymentSdkNativeServiceProto.PciField pciFieldT = formField.t();
                PaymentSdkNativeServiceProto.PciField.PciTranslations pciTranslationsV = pciFieldT.v();
                PaymentSdkNativeServiceProto.PciField.PciErrorMessages pciErrorMessagesR = pciFieldT.r();
                return new t220(pciFieldT.getName(), pciFieldT.w(), mqo1.A(pciFieldT.u()), new les0(pciTranslationsV.p(), pciTranslationsV.x(), pciTranslationsV.u(), pciTranslationsV.v(), pciTranslationsV.w(), pciTranslationsV.q(), pciTranslationsV.n(), pciTranslationsV.o(), pciTranslationsV.r(), pciTranslationsV.s(), pciTranslationsV.y(), pciTranslationsV.z()), new sds0(pciErrorMessagesR.q(), pciErrorMessagesR.s(), pciErrorMessagesR.t(), pciErrorMessagesR.o(), pciErrorMessagesR.p(), pciErrorMessagesR.r(), pciErrorMessagesR.u()), pciFieldT.s(), pciFieldT.q(), pciFieldT.o(), pciFieldT.n(), pciFieldT.t(), 1, 0.0d);
            default:
                hhg1.n(cy30.j(PaymentSdkNativeServiceProto.FormField.class, "Unexpected field type: "));
                return null;
        }
    }

    public static rz21 b(PaymentSdkNativeServiceProto.ResponseAction responseAction) {
        cz21 cz21Var;
        ez21 ez21Var;
        dz21 dz21Var;
        int iW = responseAction != null ? responseAction.w() : 0;
        switch (iW == 0 ? -1 : zas0.e[l1d.C(iW)]) {
            case 1:
                return new iz21(responseAction.s().o());
            case 2:
                return new az21(responseAction.q().getMessage(), responseAction.q().o());
            case 3:
                return new mz21(responseAction.u().getMessage(), responseAction.u().o());
            case 4:
                return new xy21(responseAction.o().getMessage(), responseAction.o().o());
            case 5:
                return yy21.a;
            case 6:
                return new pz21(Duration.ofMillis(responseAction.x().o()));
            case 7:
                Duration durationOfMillis = Duration.ofMillis(responseAction.t().q());
                String strP = responseAction.t().p();
                String strN = responseAction.t().n();
                return new lz21(strP, strN.length() != 0 ? strN : null, durationOfMillis);
            case 8:
                String strS = responseAction.r().s();
                String strN2 = responseAction.r().n();
                h290<PaymentSdkNativeServiceProto.ResponseAction.DisplayPending.Step> h290VarU = responseAction.r().u();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarU, 10));
                for (PaymentSdkNativeServiceProto.ResponseAction.DisplayPending.Step step : h290VarU) {
                    String title = step.getTitle();
                    String strN3 = step.n();
                    int i = 1;
                    switch (step.o().ordinal()) {
                        case 0:
                        case 1:
                        case 6:
                            break;
                        case 2:
                            i = 2;
                            break;
                        case 3:
                            i = 3;
                            break;
                        case 4:
                            i = 4;
                            break;
                        case 5:
                            i = 5;
                            break;
                        default:
                            eg.o();
                            return null;
                    }
                    arrayList.add(new fz21(i, title, strN3));
                }
                c380 c380VarA = mqo1.A(arrayList);
                PaymentSdkNativeServiceProto.ResponseAction.DisplayPending.DeferredRequest deferredRequestP = responseAction.r().p();
                if (!responseAction.r().v()) {
                    deferredRequestP = null;
                }
                if (deferredRequestP != null) {
                    Duration durationOfMillis2 = Duration.ofMillis(deferredRequestP.p());
                    PaymentSdkNativeServiceProto.ResponseAction.DisplayPending.DeferredRequest.Countdown countdownN = deferredRequestP.n();
                    if (!deferredRequestP.q()) {
                        countdownN = null;
                    }
                    cz21Var = new cz21(durationOfMillis2, countdownN != null ? new bz21((countdownN.o() * 1000) + SystemClock.elapsedRealtime(), countdownN.n()) : null);
                } else {
                    cz21Var = null;
                }
                PaymentSdkNativeServiceProto.ResponseAction.DisplayPending.QrCode qrCodeT = responseAction.r().t();
                if (!responseAction.r().y()) {
                    qrCodeT = null;
                }
                if (qrCodeT != null) {
                    String strO = qrCodeT.o();
                    String strP2 = qrCodeT.p();
                    if (strP2.length() == 0) {
                        strP2 = null;
                    }
                    ez21Var = new ez21(strO, strP2);
                } else {
                    ez21Var = null;
                }
                PaymentSdkNativeServiceProto.ResponseAction.DisplayPending.Form formR = responseAction.r().r();
                if (!responseAction.r().x()) {
                    formR = null;
                }
                if (formR != null) {
                    String id = formR.getId();
                    String strN4 = formR.n();
                    h290<PaymentSdkNativeServiceProto.FormField> h290VarQ = formR.q();
                    ArrayList arrayList2 = new ArrayList(q7h.U(h290VarQ, 10));
                    for (PaymentSdkNativeServiceProto.FormField formField : h290VarQ) {
                        formField.getClass();
                        arrayList2.add(a(formField));
                    }
                    c380 c380VarA2 = mqo1.A(arrayList2);
                    String strP3 = formR.p();
                    if (strP3.length() == 0) {
                        strP3 = null;
                    }
                    dz21Var = new dz21(id, strN4, strP3, c380VarA2);
                } else {
                    dz21Var = null;
                }
                return new gz21(strS, strN2, c380VarA, cz21Var, ez21Var, dz21Var, responseAction.r().w() ? responseAction.r().q() : null);
            case 9:
                return kz21.a;
            case 10:
                return vy21.a;
            case 11:
                String url = responseAction.v().getUrl();
                String strN5 = responseAction.v().n();
                return new nz21(url, strN5.length() != 0 ? strN5 : null);
            case 12:
                return new wy21(responseAction.n().getUrl());
            default:
                return hz21.a;
        }
    }
}
