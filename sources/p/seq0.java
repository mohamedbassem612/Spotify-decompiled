package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class seq0 implements acr0 {
    public final /* synthetic */ byte a;
    public final Set b;

    public seq0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = Collections.singleton(hyu0.e);
                break;
            case 2:
                this.b = Collections.singleton(vst0.d);
                break;
            case 3:
                this.b = Collections.singleton(o0a1.d);
                break;
            case 4:
                this.b = Collections.singleton(zd11.d);
                break;
            case 5:
                this.b = Collections.singleton(iwr0.e);
                break;
            case 6:
                this.b = Collections.singleton(oab.d);
                break;
            case 7:
                this.b = Collections.singleton(jyu0.f);
                break;
            case 8:
                this.b = Collections.singleton(twd1.d);
                break;
            case 9:
                this.b = Collections.singleton(qj11.f);
                break;
            case 10:
                this.b = Collections.singleton(f03.e);
                break;
            case 11:
                this.b = Collections.singleton(l43.d);
                break;
            case 12:
                this.b = f46.S0(new b3i1[]{syu0.e, ah3.e});
                break;
            case 13:
                this.b = Collections.singleton(pab.d);
                break;
            default:
                this.b = f46.S0(new b3i1[]{mss0.d, iss0.e});
                break;
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return qeq0.class;
            case 1:
                return equ0.class;
            case 2:
                return sbz0.class;
            case 3:
                return m001.class;
            case 4:
                return pd11.class;
            case 5:
                return yb21.class;
            case 6:
                return u591.class;
            case 7:
                return pua1.class;
            case 8:
                return zvd1.class;
            case 9:
                return yuf1.class;
            case 10:
                return rah1.class;
            case 11:
                return b4i1.class;
            case 12:
                return yzj1.class;
            default:
                return upk1.class;
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x0176  */
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        String strF;
        r591 r591Var;
        String strZ;
        byte b = this.a;
        aqr0 aqr0Var = aqr0.a;
        String str = "";
        String strM = null;
        s4b1 s4b1VarY = null;
        Object obj = null;
        switch (b) {
            case 0:
                String dataString = intent.getDataString();
                if (dataString == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                String strY0 = ihc1.Y0(dataString, '?');
                v5b1 v5b1VarC = jss0.a.c(strY0);
                if ((v5b1VarC instanceof mss0 ? (mss0) v5b1VarC : null) != null) {
                    strF = "spotify:internal:personal-podcast:onboarding:preset-picker";
                } else {
                    if (x6c0.b(strY0) == null) {
                        k220.f("Unsupported personal podcast onboarding URI: ".concat(strY0));
                        return null;
                    }
                    iss0 iss0VarB = x6c0.b(strY0);
                    if (iss0VarB == null) {
                        eg.m("Required value was null.");
                        return null;
                    }
                    strF = f4i1.f("spotify:internal:personal-podcast:onboarding:preset-preview:", iss0VarB.a, "");
                }
                return new req0(strF);
            case 1:
                Set set = s4b1.f;
                String strZ2 = uic.y(s4b1Var.h()).z();
                if (strZ2 != null) {
                    return new fqu0(strZ2);
                }
                bhn0.s(s4b1Var, "Unable to extract playlist URI for ");
                return null;
            case 2:
                return new qaz0(2);
            case 3:
                String strN = s4b1Var.n("entityUri");
                if (strN == null || strN.length() <= 0) {
                    strN = null;
                }
                if (strN == null) {
                    hhg1.n("ReactionSheetPageRoute requires a non-empty entityUri query parameter");
                    return null;
                }
                String str2 = th61Var.a;
                if (str2.length() <= 0) {
                    str2 = null;
                }
                if (str2 != null) {
                    Set set2 = s4b1.f;
                    String strZ3 = uic.C(str2, (String) null).z();
                    strM = strZ3 == null ? l1d.m("spotify:user:", Uri.encode(str2)) : strZ3;
                }
                return new o001(strN, strM);
            case 4:
                String strN2 = s4b1Var.n("entity");
                if (strN2 == null) {
                    strN2 = "";
                }
                String stringExtra = intent.getStringExtra("reflection_section_id");
                String str3 = str;
                if (stringExtra != null) {
                    str3 = stringExtra;
                }
                return new rd11(strN2, str3);
            case 5:
                return new cc21(((iwr0) s4b1Var.d).a);
            case 6:
                String stringExtra2 = intent.getStringExtra("skip_forward_show_uri");
                if (stringExtra2 != null) {
                    return new w591(stringExtra2);
                }
                String stringExtra3 = intent.getStringExtra("skip_forward_selected");
                if (stringExtra3 != null) {
                    for (Object obj2 : r591.e) {
                        if (u890.j(((r591) obj2).name(), stringExtra3)) {
                            obj = obj2;
                            r591Var = (r591) obj;
                            if (r591Var == null) {
                                r591Var = r591.a;
                            }
                        }
                    }
                    r591Var = (r591) obj;
                    if (r591Var == null) {
                        r591Var = r591.a;
                    }
                } else {
                    r591Var = r591.a;
                }
                return new x591(r591Var);
            case 7:
                String strZ4 = s4b1Var.z();
                if (strZ4 == null) {
                    strZ4 = "";
                }
                List listQ0 = ihc1.Q0(strZ4, new String[]{":"}, 0, 6);
                String str4 = (String) (3 < listQ0.size() ? listQ0.get(3) : "");
                Object obj3 = str;
                if (4 < listQ0.size()) {
                    obj3 = listQ0.get(4);
                }
                String strDecode = Uri.decode((String) obj3);
                strDecode.getClass();
                return new xua1(strZ4, strDecode, l1d.m("spotify:playlist:", str4), th61Var.a);
            case 8:
                return aqr0Var;
            case 9:
                String strZ5 = s4b1Var.z();
                String str5 = str;
                if (strZ5 != null) {
                    str5 = strZ5;
                }
                nj11 nj11Var = nj11.a;
                a3i1 a3i1Var = (a3i1) nj11.d.getValue();
                Set set3 = x6b1.e;
                x6b1 x6b1VarL = oqn1.l(str5);
                v5b1 v5b1VarA = x6b1VarL == null ? null : a3i1Var.a(x6b1VarL);
                qj11 qj11Var = v5b1VarA instanceof qj11 ? (qj11) v5b1VarA : null;
                if (qj11Var == null) {
                    hhg1.f("Invalid track preview upsell URI: ".concat(str5));
                    return null;
                }
                String str6 = qj11Var.a;
                if (str6.equals("content-windowing")) {
                    return new avf1(str5, qj11Var.b, cvf1.a);
                }
                hhg1.n("Unknown track preview upsell type: ".concat(str6));
                return null;
            case 10:
                Set set4 = s4b1.f;
                v5b1 v5b1Var = s4b1Var.d;
                f03 f03Var = v5b1Var instanceof f03 ? (f03) v5b1Var : null;
                String strZ6 = uic.y(f03Var != null ? f03Var.a : s4b1Var.h()).z();
                strZ6.getClass();
                return new wah1(strZ6, (ResultReceiver) ila0.s(intent, "ucp_actions_result_receiver", ResultReceiver.class));
            case 11:
                return aqr0Var;
            case 12:
                Bundle extras = intent.getExtras();
                b0k1 b0k1Var = extras != null ? (b0k1) jhc1.t(extras, "video_selection_sheet_page_parameters", b0k1.class) : null;
                if (b0k1Var == null) {
                    String dataString2 = intent.getDataString();
                    if (dataString2 == null) {
                        dataString2 = "";
                    }
                    a3i1 a3i1Var2 = (a3i1) bh3.d.getValue();
                    Set set5 = x6b1.e;
                    x6b1 x6b1VarL2 = oqn1.l(dataString2);
                    v5b1 v5b1VarA2 = x6b1VarL2 == null ? null : a3i1Var2.a(x6b1VarL2);
                    ah3 ah3Var = v5b1VarA2 instanceof ah3 ? (ah3) v5b1VarA2 : null;
                    if (ah3Var != null) {
                        Set set6 = s4b1.f;
                        s4b1VarY = uic.b(ah3Var.a);
                    } else {
                        v5b1 v5b1VarC2 = oxu0.a.c(dataString2);
                        syu0 syu0Var = v5b1VarC2 instanceof syu0 ? (syu0) v5b1VarC2 : null;
                        if (syu0Var != null) {
                            Set set7 = s4b1.f;
                            s4b1VarY = uic.y(syu0Var.a);
                        }
                    }
                    String str7 = str;
                    if (s4b1VarY != null && (strZ = s4b1VarY.z()) != null) {
                        str7 = str;
                        str7 = strZ;
                    }
                    str7 = str;
                    b0k1Var = new b0k1(str7);
                }
                return b0k1Var;
            default:
                return aqr0Var;
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case 0:
                return new b6w0(true);
            case 1:
                return new b6w0(false);
            case 2:
                return new b6w0(false);
            case 3:
                return new b6w0(true);
            case 4:
                return new b6w0(true);
            case 5:
                return new c6w0(1, true, (hd5) null, 12);
            case 6:
                return new b6w0(true);
            case 7:
                return new b6w0(true);
            case 8:
                return new z5w0(new c6w0(1, false, (hd5) null, 14));
            case 9:
                return new b6w0(false);
            case 10:
                return new b6w0(true);
            case 11:
                return new b6w0(false);
            case 12:
                return new c6w0(2, false, (hd5) null, 14);
            default:
                return new b6w0(true);
        }
    }

    public final Set e() {
        byte b = this.a;
        return this.b;
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Personal podcast onboarding flow";
            case 1:
                return "Playlist Participants Page";
            case 2:
                return "Queue Peek bottom sheet using PageAPI";
            case 3:
                return "Bottom sheet showing reactions for a given entity";
            case 4:
                return "Reflection survey bottom sheet";
            case 5:
                return "Page for a parent or guardian to stop managing a teen account";
            case 6:
                return "Bottom sheet for selecting skip forward behavior";
            case 7:
                return "Speed Control Bottom Sheet";
            case 8:
                return "A page informing a managed teen that they can access messaging and listening activity at age 16";
            case 9:
                return "A Reinvent Free upsell bottom sheet with a track preview";
            case 10:
                return "Bottom sheet showing available UCP playlist actions";
            case 11:
                return "Bottom sheet displaying usage limits for AI-powered features";
            case 12:
                return "Bottom sheet for selecting which music videos to download";
            default:
                return "Bottom sheet for updating Bluejay voice settings";
        }
    }
}
