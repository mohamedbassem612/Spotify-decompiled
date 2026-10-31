package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.checkout.pageactivityproxy.PageActivityProxy;
import com.spotify.localfiles.mediastoreimpl.LocalFilesProperties$TestHelper;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class x71 implements acr0 {
    public final /* synthetic */ byte a;
    public final Set b;

    public x71(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = Collections.singleton(blc0.N0);
                break;
            case 2:
                this.b = Collections.singleton(blc0.Cd);
                break;
            case 3:
                this.b = Collections.singleton(blc0.Pf);
                break;
            case 4:
                this.b = Collections.singleton(blc0.U2);
                break;
            case 5:
                this.b = Collections.singleton(blc0.m3);
                break;
            case 6:
                this.b = Collections.singleton(blc0.G3);
                break;
            case 7:
                this.b = Collections.singleton(blc0.C1);
                break;
            case 8:
                this.b = Collections.singleton(blc0.T3);
                break;
            case 9:
                this.b = Collections.singleton(blc0.p5);
                break;
            case 10:
                this.b = Collections.singleton(blc0.E3);
                break;
            case 11:
                this.b = Collections.singleton(blc0.je);
                break;
            case 12:
                this.b = Collections.singleton(blc0.qe);
                break;
            case 13:
                this.b = Collections.singleton(blc0.G4);
                break;
            case 14:
                this.b = Collections.singleton(blc0.K7);
                break;
            case 15:
                this.b = Collections.singleton(blc0.We);
                break;
            case 16:
                this.b = f46.S0(new blc0[]{blc0.h9, blc0.u9});
                break;
            case 17:
                this.b = Collections.singleton(blc0.P9);
                break;
            case 18:
                this.b = Collections.singleton(blc0.Ai);
                break;
            case 19:
                this.b = f46.S0(new blc0[]{blc0.db, blc0.eb, blc0.fb});
                break;
            case 20:
                this.b = f46.S0(new blc0[]{blc0.hb, blc0.gb});
                break;
            case 21:
                this.b = Collections.singleton(blc0.Md);
                break;
            case 22:
                this.b = Collections.singleton(blc0.Ej);
                break;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                this.b = Collections.singleton(blc0.Nd);
                break;
            case 24:
                this.b = Collections.singleton(blc0.Od);
                break;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                this.b = Collections.singleton(blc0.de);
                break;
            case 26:
                this.b = Collections.singleton(blc0.Gb);
                break;
            case 27:
                this.b = Collections.singleton(blc0.Uj);
                break;
            case 28:
                this.b = Collections.singleton(blc0.bg);
                break;
            case 29:
                this.b = Collections.singleton(blc0.e);
                break;
            default:
                this.b = Collections.singleton(blc0.g);
                break;
        }
    }

    public final Set a() {
        byte b = this.a;
        return this.b;
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return u71.class;
            case 1:
                return s22.class;
            case 2:
                return dua.class;
            case 3:
                return mdc.class;
            case 4:
                return tde.class;
            case 5:
                return yaf.class;
            case 6:
                return vyf.class;
            case 7:
                return mqg.class;
            case 8:
                return j2h.class;
            case 9:
                return knl.class;
            case 10:
                return gbn.class;
            case 11:
                return tnv.class;
            case 12:
                return k2w.class;
            case 13:
                return g5z.class;
            case 14:
                return v530.class;
            case 15:
                return d140.class;
            case 16:
                return cwa0.class;
            case 17:
                return p9d0.class;
            case 18:
                return zme0.class;
            case 19:
                return bbg0.class;
            case 20:
                return qfg0.class;
            case 21:
                return zmi0.class;
            case 22:
                return x4t0.class;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return n8t0.class;
            case 24:
                return nbt0.class;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return u2w0.class;
            case 26:
                return iiz0.class;
            case 27:
                return oa31.class;
            case 28:
                return kt61.class;
            default:
                return ehf1.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        List<String> pathSegments;
        mmr0 mmr0Var;
        String str;
        byte b = this.a;
        ibg0 ibg0Var = ibg0.CHILD;
        ibg0 ibg0Var2 = ibg0.TEEN;
        aqr0 aqr0Var = aqr0.a;
        String str2 = null;
        str2 = null;
        String str3 = "";
        switch (b) {
            case 0:
            case 1:
                return aqr0Var;
            case 2:
                boolean zQ = oon1.q(s4b1Var);
                String strZ = s4b1Var.z();
                return new hua(strZ != null ? strZ : "", zQ);
            case 3:
            case 4:
                return aqr0Var;
            case 5:
                String dataString = intent.getDataString();
                if (dataString == null) {
                    hhg1.n("View URI is required");
                    return null;
                }
                Set set = s4b1.f;
                String strB = pcf.b(uic.x(intent.getDataString()));
                if (strB != null) {
                    return new abf(dataString, strB, th61Var.a);
                }
                hhg1.n("Chat ID is required");
                return null;
            case 6:
                int i = PageActivityProxy.f1;
                lyf lyfVar = (Parcelable) ila0.s(intent, "EXTRA_INPUT", lyf.class);
                if (lyfVar != null) {
                    return lyfVar;
                }
                n57.e("Unsupported launch mode. Use " + rc11.a.b(ryf.class) + " instead.");
                return new lyf(uxf.b, new jyf((String) null), Uri.parse("https://www.spotify.com/premium"));
            case 7:
                Set set2 = s4b1.f;
                String strK = zjy.k(intent);
                if (strK == null) {
                    strK = "";
                }
                Uri uri = s4b1Var.a;
                if (uri != null && (pathSegments = uri.getPathSegments()) != null) {
                    str2 = (String) o7h.t0(1, pathSegments);
                }
                return new pqg(strK, "spotify:artist:".concat(str2 != null ? str2 : ""));
            case 8:
                String strZ2 = s4b1Var.z();
                return new l2h(strZ2 != null ? strZ2 : "");
            case 9:
                String strZ3 = s4b1Var.z();
                return new gnl(strZ3 != null ? strZ3 : "");
            case 10:
                int i2 = PageActivityProxy.f1;
                van vanVar = (Parcelable) ila0.s(intent, "EXTRA_INPUT", van.class);
                if (vanVar != null) {
                    return vanVar;
                }
                n57.e("Unsupported launch mode. Use " + rc11.a.b(bbn.class) + " instead.");
                return new van("", z6x.a, "", (String) null);
            case 11:
                String stringExtra = intent.getStringExtra("extra_bio");
                return new vnv(stringExtra != null ? stringExtra : "");
            case 12:
                String str4 = th61Var.a;
                String stringExtra2 = intent.getStringExtra("extra_social_handle");
                return new n3w(str4, stringExtra2 != null ? stringExtra2 : "", new lrz0(intent.getIntExtra("extra_rate_limit_max_changes", 0), intent.getIntExtra("extra_rate_limit_window_days", 0), 4, 0));
            case 13:
                Set set3 = s4b1.f;
                String strK2 = zjy.k(intent);
                return new o5z(strK2 != null ? strK2 : "");
            case 14:
                return new b630(th61Var.a);
            case 15:
                String strZ4 = s4b1Var.z();
                if (strZ4 == null) {
                    strZ4 = "";
                }
                if (i140.a[s4b1Var.c.ordinal()] == 1) {
                    String strJ = s4b1Var.j();
                    return new h140(strZ4, strJ != null ? strJ : "", th61Var.a);
                }
                eg.m("Link type doesn't match with any game result link type");
                return null;
            case 16:
                Bundle extras = intent.getExtras();
                int i3 = extras != null ? extras.getInt("education-entry-point-pages-count", 0) : 0;
                int iOrdinal = s4b1Var.c.ordinal();
                if (iOrdinal == 447) {
                    return new t8w(i3, txa0.a);
                }
                if (iOrdinal == 460) {
                    String strJ2 = s4b1Var.j();
                    return new t8w(i3, new uxa0(strJ2 != null ? strJ2 : ""));
                }
                hhg1.g(s4b1Var, "Unsupported link type: ");
                return null;
            case 17:
                return new r9d0(th61Var.a);
            case 18:
                String strZ5 = s4b1Var.z();
                if (strZ5 == null) {
                    strZ5 = "";
                }
                String strN = s4b1Var.n("listUri");
                str3 = strN != null ? strN : "";
                String strN2 = s4b1Var.n("currentCity");
                String strN3 = s4b1Var.n("currentGeonameId");
                return new dne0(strZ5, str3, strN3 != null ? nhc1.c0(strN3) : null, strN2);
            case 19:
                String strJ3 = s4b1Var.j();
                str3 = strJ3 != null ? strJ3 : "";
                mmr0 mmr0Var2 = hbg0.a[s4b1Var.c.ordinal()] == 1 ? new mmr0(ibg0Var2, nik1.U3.b("spotify:internal:managed-account-details:teen:".concat(str3))) : new mmr0(ibg0Var, nik1.T3.b("spotify:internal:managed-account-details:child:".concat(str3)));
                return new gbg0(str3, (ibg0) mmr0Var2.a, (lik1) mmr0Var2.b);
            case 20:
                String strO = s4b1Var.o(3);
                str3 = strO != null ? strO : "";
                if (tfg0.a[s4b1Var.c.ordinal()] == 1) {
                    mmr0Var = new mmr0(ibg0Var2, nik1.V3.b("spotify:internal:managed-account-details:teen:" + str3 + ":video-settings"));
                } else {
                    mmr0Var = new mmr0(ibg0Var, nik1.W3.b("spotify:internal:managed-account-details:child:" + str3 + ":video-settings"));
                }
                return new sfg0(str3, (ibg0) mmr0Var.a, (lik1) mmr0Var.b);
            case 21:
                return aqr0Var;
            case 22:
                String strJ4 = s4b1Var.j();
                if (strJ4 == null) {
                    strJ4 = "";
                }
                boolean zJ = u890.j(s4b1Var.n("showKeyboard"), LocalFilesProperties$TestHelper.TRUE);
                String strZ6 = s4b1Var.z();
                return new a5t0(strZ6 != null ? strZ6 : "", strJ4, zJ);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                String strZ7 = s4b1Var.z();
                if (strZ7 == null) {
                    strZ7 = "";
                }
                String strZ8 = s4b1Var.z();
                if (strZ8 != null && (str = (String) o7h.A0(ihc1.Q0(strZ8, new String[]{":"}, 0, 6))) != null) {
                    str3 = str;
                }
                return new p8t0(strZ7, str3, ihc1.h0(String.valueOf(intent.getData()), ":addon-", false));
            case 24:
                boolean zQ2 = oon1.q(s4b1Var);
                String strZ9 = s4b1Var.z();
                return new pbt0(strZ9 != null ? strZ9 : "", zQ2);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                String strZ10 = s4b1Var.z();
                return new w2w0(strZ10 != null ? strZ10 : "");
            case 26:
                String strZ11 = s4b1Var.z();
                return new niz0(strZ11 != null ? strZ11 : "", s4b1Var.n("challenge_id"), th61Var.a);
            case 27:
                return aqr0Var;
            case 28:
                return new mt61(new gu61(th61Var.a), intent.getBooleanExtra("provide_result", false));
            default:
                return aqr0Var;
        }
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "A page for adding plan members to Account Switching and switching to them";
            case 1:
                return "Page that allows users to edit their tax Address";
            case 2:
                return "Billing Page";
            case 3:
                return "Business information page";
            case 4:
                return "Page to allow family plan manages to change the parental PIN";
            case 5:
                return "A page with the members of a specific chat";
            case 6:
                return "Page that shows a Checkout-enabled WebView";
            case 7:
                return "Standalone page showing an artist's clips as a stack of carousels";
            case 8:
                return "Page showing the tracks and albums you've saved by an artist";
            case 9:
                return "Container root page";
            case 10:
                return "Provides a Country picker page to be used during checkout";
            case 11:
                return "A page that allows editing the user's bio";
            case 12:
                return "A page that allows editing the user's social handle (called username in the UI)";
            case 13:
                return "Settings page for podcast auto-download episode limits";
            case 14:
                return "page that contains feed of followed podcast content";
            case 15:
                return "Music quiz results route";
            case 16:
                return "Page to educate parents about the benefits of creating a kid account";
            case 17:
                return "A page that displays and allows changing the audience for listening activity";
            case 18:
                return "Trending Near You Location Search page";
            case 19:
                return "Page showing details for a managed account";
            case 20:
                return "Video settings page for a managed account";
            case 21:
                return "Page for member invite for multi member plans";
            case 22:
                return "The Page that aggregates various watch-feed entry points.";
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return "Plan Details Page";
            case 24:
                return "Plan Overview Page";
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return "Destination page for album before its release";
            case 26:
                return "Quizzes gameplay";
            case 27:
                return "Retrieval page";
            case 28:
                return "Settings search page";
            default:
                return "Page which starts audiobook premium top up purchase flow";
        }
    }
}
