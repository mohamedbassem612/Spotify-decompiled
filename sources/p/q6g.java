package p;

import com.spotify.gpb.trackingimpl.events.proto.CPBillingChoiceConfirmed;
import com.spotify.gpb.trackingimpl.events.proto.CPBillingChoiceError;
import com.spotify.gpb.trackingimpl.events.proto.CPBillingChoiceLoaded;
import com.spotify.gpb.trackingimpl.events.proto.CPBillingChoiceSelected;
import com.spotify.gpb.trackingimpl.events.proto.CPGpbCheckoutCancelled;
import com.spotify.gpb.trackingimpl.events.proto.CPGpbCheckoutError;
import com.spotify.gpb.trackingimpl.events.proto.CPGpbCheckoutInitialized;
import com.spotify.gpb.trackingimpl.events.proto.CPHostedCheckoutChangeProductClicked;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class q6g implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s6g b;

    public /* synthetic */ q6g(s6g s6gVar, byte b) {
        this.a = b;
        this.b = s6gVar;
    }

    public final void accept(Object obj) {
        String str;
        String str2;
        byte b = this.a;
        s6g s6gVar = this.b;
        switch (b) {
            case 0:
                b6y b6yVar = s6gVar.f;
                String str3 = s6gVar.c.b;
                String str4 = ((j6g) obj).a;
                knc kncVarN = CPGpbCheckoutCancelled.n();
                kncVarN.n(str4);
                kncVarN.q(b6y.b(str3));
                b6yVar.a.a(kncVarN.build());
                return;
            case 1:
                k6g k6gVar = (k6g) obj;
                b6y b6yVar2 = s6gVar.f;
                String str5 = s6gVar.c.b;
                String str6 = k6gVar.a;
                int i = k6gVar.b;
                mnc mncVarN = CPGpbCheckoutError.n();
                mncVarN.n(str6);
                mncVarN.q(b6y.b(str5));
                switch (i) {
                    case 1:
                        str = "NETWORK_ERROR";
                        break;
                    case 2:
                        str = "BACKEND_ERROR";
                        break;
                    case 3:
                        str = "INVALID_RESPONSE";
                        break;
                    case 4:
                        str = "SESSION_LOCKED";
                        break;
                    case 5:
                        str = "SESSION_COMPLETED";
                        break;
                    case 6:
                        str = "SESSION_EXPIRED";
                        break;
                    case 7:
                        str = "FAILED_PRECONDITION";
                        break;
                    case 8:
                        str = "GPB_SDK_ERROR";
                        break;
                    default:
                        throw null;
                }
                mncVarN.r(str);
                b6yVar2.a.a(mncVarN.build());
                return;
            case 2:
                hr0 hr0Var = s6gVar.e;
                String str7 = s6gVar.c.b;
                tnc tncVarN = CPHostedCheckoutChangeProductClicked.n();
                tncVarN.n(str7);
                hr0Var.a.a(tncVarN.build());
                return;
            case 3:
                m6g m6gVar = (m6g) obj;
                hr0 hr0Var2 = s6gVar.e;
                String str8 = s6gVar.c.b;
                List list = m6gVar.a;
                String str9 = m6gVar.b;
                inc incVarO = CPBillingChoiceLoaded.o();
                incVarO.q(str8);
                incVarO.n(list);
                if (str9 == null) {
                    str9 = "NONE";
                }
                incVarO.r(str9);
                hr0Var2.a.a(incVarO.build());
                return;
            case 4:
                hr0 hr0Var3 = s6gVar.e;
                String str10 = s6gVar.c.b;
                String str11 = ((n6g) obj).a;
                jnc jncVarN = CPBillingChoiceSelected.n();
                jncVarN.n(str10);
                jncVarN.q(str11);
                hr0Var3.a.a(jncVarN.build());
                return;
            case 5:
                hr0 hr0Var4 = s6gVar.e;
                String str12 = s6gVar.c.b;
                String str13 = ((h6g) obj).a;
                gnc gncVarN = CPBillingChoiceConfirmed.n();
                gncVarN.n(str12);
                gncVarN.q(str13);
                hr0Var4.a.a(gncVarN.build());
                return;
            case 6:
                hr0 hr0Var5 = s6gVar.e;
                String str14 = s6gVar.c.b;
                int i2 = ((i6g) obj).a;
                hnc hncVarN = CPBillingChoiceError.n();
                hncVarN.n(str14);
                if (i2 == 1) {
                    str2 = "client_connection_error";
                } else {
                    if (i2 != 2) {
                        throw null;
                    }
                    str2 = "client_response_error";
                }
                hncVarN.q(str2);
                hr0Var5.a.a(hncVarN.build());
                return;
            default:
                b6y b6yVar3 = s6gVar.f;
                String str15 = s6gVar.c.b;
                String str16 = ((l6g) obj).a;
                nnc nncVarN = CPGpbCheckoutInitialized.n();
                nncVarN.n(str16);
                nncVarN.q(b6y.b(str15));
                b6yVar3.a.a(nncVarN.build());
                return;
        }
    }
}
