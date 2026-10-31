package p;

import android.content.Intent;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rda implements acr0 {
    public final /* synthetic */ byte a;
    public final Set b;

    public rda(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = Collections.singleton(tyu0.d);
                break;
            case 2:
                this.b = Collections.singleton(vyu0.d);
                break;
            case 3:
                this.b = Collections.singleton(r1d1.d);
                break;
            case 4:
                this.b = Collections.singleton(fwr0.e);
                break;
            case 5:
                this.b = Collections.singleton(rss0.e);
                break;
            case 6:
                this.b = Collections.singleton(qss0.d);
                break;
            case 7:
                this.b = Collections.singleton(rll1.e);
                break;
            default:
                this.b = Collections.singleton(hks0.d);
                break;
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return pda.class;
            case 1:
                return uwv.class;
            case 2:
                return iyv.class;
            case 3:
                return rse0.class;
            case 4:
                return eeg0.class;
            case 5:
                return v7w0.class;
            case 6:
                return h8w0.class;
            default:
                return gll1.class;
        }
    }

    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        rll1 rll1Var;
        byte b = this.a;
        aqr0 aqr0Var = aqr0.a;
        switch (b) {
            case 0:
                return aqr0Var;
            case 1:
                String strZ = s4b1Var.z();
                if (strZ != null) {
                    return new xwv(strZ);
                }
                hhg1.n("Missing page URI");
                return null;
            case 2:
                String strZ2 = s4b1Var.z();
                if (strZ2 != null) {
                    return new lyv(strZ2);
                }
                hhg1.n("Missing page URI");
                return null;
            case 3:
                return aqr0Var;
            case 4:
                String strZ3 = s4b1Var.z();
                if (strZ3 == null) {
                    strZ3 = "";
                }
                a3i1 a3i1Var = (a3i1) jwr0.d.getValue();
                Set set = x6b1.e;
                x6b1 x6b1VarL = oqn1.l(strZ3);
                v5b1 v5b1VarA = x6b1VarL == null ? null : a3i1Var.a(x6b1VarL);
                fwr0 fwr0Var = v5b1VarA instanceof fwr0 ? (fwr0) v5b1VarA : null;
                rll1Var = fwr0Var != null ? fwr0Var.a : null;
                return new geg0(rll1Var != null ? rll1Var : "", ibg0.TEEN, new lik1(strZ3));
            case 5:
                String dataString = intent.getDataString();
                if (dataString == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                rss0 rss0VarC = jss0.a.c(dataString);
                rss0 rss0Var = rss0VarC instanceof rss0 ? rss0VarC : null;
                if (rss0Var != null) {
                    return new x7w0(rss0Var.a);
                }
                eg.m("Required value was null.");
                return null;
            case 6:
                return i8w0.a;
            default:
                rll1 rll1Var2 = s4b1Var.d;
                rll1Var = rll1Var2 instanceof rll1 ? rll1Var2 : null;
                if (rll1Var != null) {
                    String str = rll1Var.a;
                    if (str.length() > 0 && str.length() < 128) {
                        for (int i = 0; i < str.length(); i++) {
                            char cCharAt = str.charAt(i);
                            if (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || (('0' <= cCharAt && cCharAt < ':') || cCharAt == '-' || cCharAt == '_'))) {
                            }
                        }
                        return new ill1(str, rll1Var.b);
                    }
                }
                return new ill1("error", b7x.a);
        }
    }

    public final Set e() {
        byte b = this.a;
        return this.b;
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "A benign destination to use in baselineprofile generation";
            case 1:
                return "Edit Playlists Privacy";
            case 2:
                return "Edit Playlists Profile Visibility";
            case 3:
                return "A support page for logging out all accounts on the device";
            case 4:
                return "Profile visibility settings page for a teen managed account";
            case 5:
                return "Personal podcast onboarding preset preview";
            case 6:
                return "Personal podcast onboarding preset picker";
            default:
                return "Chromeless web view for webview-prod apps";
        }
    }
}
