package p;

import com.spotify.checkout.spotifycheckout.events.proto.CPHostedCheckoutBackButtonClicked;
import com.spotify.checkout.spotifycheckout.events.proto.CPHostedCheckoutChangeCountryOpened;
import com.spotify.checkout.spotifycheckout.events.proto.CPHostedCheckoutChangePaymentClicked;
import com.spotify.checkout.spotifycheckout.events.proto.CPHostedCheckoutChangeProductClicked;
import com.spotify.checkout.spotifycheckout.events.proto.CPHostedCheckoutCountryChanged;
import com.spotify.checkout.spotifycheckout.events.proto.CPHostedCheckoutDismissButtonClicked;
import com.spotify.checkout.spotifycheckout.events.proto.CPHostedCheckoutError;
import com.spotify.checkout.spotifycheckout.events.proto.CPHostedCheckoutErrorViewLinkClicked;
import com.spotify.checkout.spotifycheckout.events.proto.CPHostedCheckoutLoaded;
import com.spotify.checkout.spotifycheckout.events.proto.CPHostedCheckoutPaymentEjectedToWeb;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gmw implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kmw b;

    public /* synthetic */ gmw(kmw kmwVar, byte b) {
        this.a = b;
        this.b = kmwVar;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        kmw kmwVar = this.b;
        switch (b) {
            case 0:
                yt91 yt91Var = kmwVar.d;
                t2j0 t2j0Var = (t2j0) yt91Var.b;
                snc sncVarN = CPHostedCheckoutChangePaymentClicked.n();
                sncVarN.n((String) yt91Var.c);
                t2j0Var.a(sncVarN.build());
                break;
            case 1:
                yt91 yt91Var2 = kmwVar.d;
                t2j0 t2j0Var2 = (t2j0) yt91Var2.b;
                wnc wncVarN = CPHostedCheckoutDismissButtonClicked.n();
                wncVarN.n((String) yt91Var2.c);
                t2j0Var2.a(wncVarN.build());
                break;
            case 2:
                yt91 yt91Var3 = kmwVar.d;
                String str = ((bcw) obj).a;
                t2j0 t2j0Var3 = (t2j0) yt91Var3.b;
                ync yncVarN = CPHostedCheckoutErrorViewLinkClicked.n();
                yncVarN.n((String) yt91Var3.c);
                yncVarN.q(str);
                t2j0Var3.a(yncVarN.build());
                break;
            case 3:
                yt91 yt91Var4 = kmwVar.d;
                t2j0 t2j0Var4 = (t2j0) yt91Var4.b;
                qnc qncVarN = CPHostedCheckoutBackButtonClicked.n();
                qncVarN.n((String) yt91Var4.c);
                t2j0Var4.a(qncVarN.build());
                break;
            case 4:
                yt91 yt91Var5 = kmwVar.d;
                t2j0 t2j0Var5 = (t2j0) yt91Var5.b;
                znc zncVarN = CPHostedCheckoutLoaded.n();
                zncVarN.n((String) yt91Var5.c);
                zncVarN.q(((yqg) yt91Var5.d).g().getID());
                t2j0Var5.a(zncVarN.build());
                break;
            case 5:
                yt91 yt91Var6 = kmwVar.d;
                t2j0 t2j0Var6 = (t2j0) yt91Var6.b;
                xnc xncVarN = CPHostedCheckoutError.n();
                xncVarN.n((String) yt91Var6.c);
                xncVarN.q();
                t2j0Var6.a(xncVarN.build());
                break;
            case 6:
                yt91 yt91Var7 = kmwVar.d;
                t2j0 t2j0Var7 = (t2j0) yt91Var7.b;
                rnc rncVarN = CPHostedCheckoutChangeCountryOpened.n();
                rncVarN.n((String) yt91Var7.c);
                t2j0Var7.a(rncVarN.build());
                break;
            case 7:
                xbw xbwVar = (xbw) obj;
                yt91 yt91Var8 = kmwVar.d;
                String str2 = xbwVar.a;
                String str3 = xbwVar.b;
                t2j0 t2j0Var8 = (t2j0) yt91Var8.b;
                vnc vncVarN = CPHostedCheckoutCountryChanged.n();
                vncVarN.n((String) yt91Var8.c);
                vncVarN.q(str2);
                if (str3 != null) {
                    vncVarN.r(str3);
                }
                t2j0Var8.a(vncVarN.build());
                break;
            case 8:
                yt91 yt91Var9 = kmwVar.d;
                t2j0 t2j0Var9 = (t2j0) yt91Var9.b;
                unc uncVarN = CPHostedCheckoutChangeProductClicked.n();
                uncVarN.n((String) yt91Var9.c);
                t2j0Var9.a(uncVarN.build());
                break;
            default:
                icw icwVar = (icw) obj;
                yt91 yt91Var10 = kmwVar.d;
                String str4 = icwVar.a;
                String str5 = icwVar.b;
                String str6 = icwVar.c;
                t2j0 t2j0Var10 = (t2j0) yt91Var10.b;
                aoc aocVarN = CPHostedCheckoutPaymentEjectedToWeb.n();
                aocVarN.n((String) yt91Var10.c);
                aocVarN.r(str4);
                aocVarN.q(str5);
                aocVarN.s(str6);
                t2j0Var10.a(aocVarN.build());
                break;
        }
    }
}
