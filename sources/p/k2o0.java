package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class k2o0 implements acr0 {
    public final /* synthetic */ byte a;
    public final Set b;

    public k2o0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = Collections.singleton(blc0.Qc);
                break;
            case 2:
                this.b = Collections.singleton(blc0.Rc);
                break;
            case 3:
                this.b = Collections.singleton(blc0.Wa);
                break;
            case 4:
                this.b = Collections.singleton(blc0.sc);
                break;
            case 5:
                this.b = Collections.singleton(blc0.tc);
                break;
            case 6:
                this.b = Collections.singleton(blc0.wc);
                break;
            case 7:
                this.b = Collections.singleton(blc0.Tc);
                break;
            case 8:
                this.b = Collections.singleton(blc0.Vc);
                break;
            case 9:
                this.b = Collections.singleton(blc0.zf);
                break;
            case 10:
                this.b = Collections.singleton(blc0.w5);
                break;
            case 11:
                this.b = Collections.singleton(blc0.ye);
                break;
            case 12:
                this.b = Collections.singleton(blc0.Sa);
                break;
            case 13:
                this.b = f46.S0(new blc0[]{blc0.Qe, blc0.ad});
                break;
            case 14:
                this.b = Collections.singleton(blc0.Re);
                break;
            case 15:
                this.b = Collections.singleton(blc0.Ue);
                break;
            case 16:
                this.b = Collections.singleton(blc0.Ze);
                break;
            case 17:
                this.b = Collections.singleton(blc0.Te);
                break;
            case 18:
                this.b = Collections.singleton(blc0.N4);
                break;
            case 19:
                this.b = Collections.singleton(blc0.w3);
                break;
            case 20:
                this.b = Collections.singleton(blc0.Tj);
                break;
            case 21:
                this.b = Collections.singleton(blc0.Ah);
                break;
            case 22:
                this.b = Collections.singleton(blc0.mf);
                break;
            case 23:
                this.b = Collections.singleton(blc0.C5);
                break;
            case 24:
                this.b = Collections.singleton(blc0.Bf);
                break;
            case 25:
                this.b = Collections.singleton(blc0.Cf);
                break;
            case 26:
                this.b = Collections.singleton(blc0.L6);
                break;
            case 27:
                this.b = Collections.singleton(blc0.sf);
                break;
            case 28:
                this.b = Collections.singleton(blc0.Lg);
                break;
            case 29:
                this.b = Collections.singleton(blc0.tf);
                break;
            default:
                this.b = Collections.singleton(blc0.Pc);
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
                return g2o0.class;
            case 1:
                return p3o0.class;
            case 2:
                return a4o0.class;
            case 3:
                return iqo0.class;
            case 4:
                return lfq0.class;
            case 5:
                return asq0.class;
            case 6:
                return wtr0.class;
            case 7:
                return d1t0.class;
            case 8:
                return z6u0.class;
            case 9:
                return qgv0.class;
            case 10:
                return gwv0.class;
            case 11:
                return bmx0.class;
            case 12:
                return m2y0.class;
            case 13:
                return sbz0.class;
            case 14:
                return tcz0.class;
            case 15:
                return qjz0.class;
            case 16:
                return wkz0.class;
            case 17:
                return drz0.class;
            case 18:
                return u001.class;
            case 19:
                return q501.class;
            case 20:
                return ll01.class;
            case 21:
                return c111.class;
            case 22:
                return jh11.class;
            case 23:
                return q221.class;
            case 24:
                return cj21.class;
            case 25:
                return nk21.class;
            case 26:
                return s531.class;
            case 27:
                return to51.class;
            case 28:
                return rh71.class;
            default:
                return d691.class;
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x0212  */
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        p6r0 p6r0VarG1;
        chr0 chr0Var;
        String str;
        ykz0 ykz0Var;
        byte b = this.a;
        aqr0 aqr0Var = aqr0.a;
        String str2 = "";
        String strZ = null;
        Object obj = null;
        switch (b) {
            case 0:
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    hhg1.n("Intent has no extras!");
                    return null;
                }
                Object objT = jhc1.t(extras, "bluetooth.permission.info.bottom.sheet.args", h2o0.class);
                if (objT != null) {
                    return new j2o0((h2o0) objT);
                }
                hhg1.n("No arguments in bundle!");
                return null;
            case 1:
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    hhg1.n("Intent has no extras!");
                    return null;
                }
                Object objT2 = jhc1.t(extras2, "bluetooth.permission.request.bottom.sheet.args", q3o0.class);
                if (objT2 != null) {
                    return new s3o0((q3o0) objT2);
                }
                hhg1.n("No arguments in bundle!");
                return null;
            case 2:
                Bundle extras3 = intent.getExtras();
                if (extras3 == null) {
                    hhg1.n("Intent has no extras!");
                    return null;
                }
                Object objT3 = jhc1.t(extras3, "bluetooth.permission.request.full.screen.sheet.args", d4o0.class);
                if (objT3 != null) {
                    return new f4o0((d4o0) objT3);
                }
                hhg1.n("No arguments in bundle!");
                return null;
            case 3:
                String strZ2 = s4b1Var.z();
                str2 = strZ2 != null ? strZ2 : "";
                Uri uri = s4b1Var.a;
                String queryParameter = uri != null ? uri.getQueryParameter("config") : null;
                ipo0 ipo0Var = ipo0.a;
                if (queryParameter != null) {
                    try {
                        ipo0 ipo0VarValueOf = ipo0.valueOf(queryParameter);
                        if (ipo0VarValueOf != null) {
                            ipo0Var = ipo0VarValueOf;
                        }
                    } catch (IllegalArgumentException e) {
                        Logger.e(e, "Unexpected config received when navigating to opt in page: ".concat(queryParameter), new Object[0]);
                    }
                }
                return new qro0(str2, ipo0Var);
            case 4:
                String strO = s4b1Var.o(2);
                str2 = strO != null ? strO : "";
                return new pfq0(str2, "spotify:show:".concat(str2));
            case 5:
                String strO2 = s4b1Var.o(2);
                str2 = strO2 != null ? strO2 : "";
                return new psq0(str2, "spotify:show:".concat(str2));
            case 6:
                Bundle extras4 = intent.getExtras();
                boolean z = (extras4 != null ? extras4.getParcelable("key_flow_type") : null) instanceof wxa0;
                String str3 = th61Var.a;
                int i = z ? 2131959581 : 2131959580;
                if (z) {
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    p6r0VarG1 = yon1.G1("KID_ACCOUNT_TRANSITION_EDUCATION", "kid-account-transition/education", 891, "kid-account-transition");
                } else {
                    AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                    p6r0VarG1 = yon1.G1("KID_ACCOUNT_CREATION_EDUCATION", "kid-account-creation/education", 877, "kid-account-creation");
                }
                return new ytr0(str3, i, p6r0VarG1, nik1.O3);
            case 7:
                String stringExtra = intent.getStringExtra("pageUri");
                return new f1t0(stringExtra != null ? stringExtra : "", intent.getStringExtra("interactionId"));
            case 8:
                String queryParameter2 = Uri.parse(String.valueOf(s4b1Var.a)).getQueryParameter("reason");
                return new b7u0((queryParameter2 != null ? queryParameter2 : "").equals("start_slow") ? 1 : 2);
            case 9:
                return sgv0.a;
            case 10:
                return aqr0Var;
            case 11:
                return emx0.a;
            case 12:
                String strN = s4b1Var.n("pageType");
                for (Object obj2 : chr0.e) {
                    int iOrdinal = ((chr0) obj2).ordinal();
                    if (iOrdinal == 0) {
                        str = "playlist";
                    } else if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            eg.o();
                            return null;
                        }
                        str = "playlist";
                    } else {
                        str = "bluejay";
                    }
                    if (str.equals(strN)) {
                        obj = obj2;
                        chr0Var = (chr0) obj;
                        if (chr0Var == null) {
                            chr0Var = chr0.a;
                        }
                        return new u67(chr0Var);
                    }
                }
                chr0Var = (chr0) obj;
                if (chr0Var == null) {
                    chr0Var = chr0.a;
                }
                return new u67(chr0Var);
            case 13:
                return new qaz0(1);
            case 14:
                Bundle extras5 = intent.getExtras();
                String string = extras5 != null ? extras5.getString("upsellReasonKey") : null;
                if (string == null) {
                    string = "reorder_restricted";
                }
                return new vcz0(string);
            case 15:
                String strZ3 = s4b1Var.z();
                if (strZ3 == null) {
                    strZ3 = "";
                }
                String strJ = s4b1Var.j();
                if (strJ != null) {
                    Set set = s4b1.f;
                    strZ = uic.x(Uri.decode(strJ)).z();
                }
                return new ujz0(strZ3, strZ != null ? strZ : "");
            case 16:
                Bundle extras6 = intent.getExtras();
                if (extras6 != null && (ykz0Var = (ykz0) jhc1.t(extras6, "quiz_sources_params", ykz0.class)) != null) {
                    return ykz0Var;
                }
                hhg1.n("QuizSourcesBottomSheetParameters is required");
                return null;
            case 17:
                Bundle extras7 = intent.getExtras();
                frz0 frz0Var = extras7 != null ? (frz0) jhc1.t(extras7, "rate_bad_question_page_contract_input", frz0.class) : null;
                if (frz0Var != null) {
                    return new grz0(frz0Var);
                }
                eg.m("Missing RateBadQuestionBottomSheetPageInput in intent extras");
                return null;
            case 18:
                String stringExtra2 = intent.getStringExtra("parent_entity_uri");
                String stringExtra3 = intent.getStringExtra("entity_id");
                String strN2 = s4b1Var.n("entityUri");
                String strN3 = s4b1Var.n("contextUri");
                String strN4 = s4b1Var.n("playTimestamp");
                if (stringExtra2 == null) {
                    String strF = strN3 != null ? strN4 != null ? f4i1.f(strN3, "?playTimestamp=", strN4) : strN3 : null;
                    stringExtra2 = strF == null ? "" : strF;
                }
                if (stringExtra3 != null) {
                    str2 = stringExtra3;
                } else if (strN2 != null) {
                    str2 = strN2;
                }
                return new w001(stringExtra2, str2);
            case 19:
                Bundle extras8 = intent.getExtras();
                String string2 = extras8 != null ? extras8.getString("contribution_id") : null;
                if (string2 == null) {
                    hhg1.n("contributionId is required to open the reactions sheet");
                    return null;
                }
                ArrayList arrayListU = jhc1.u(extras8, "reactions", c401.class);
                if (arrayListU != null) {
                    return new s501(string2, arrayListU);
                }
                hhg1.n("reactions are required to open the reactions sheet");
                return null;
            case 20:
                String dataString = intent.getDataString();
                return new nl01(ihc1.X0(dataString != null ? dataString : "", ":"));
            case 21:
                String strJ2 = s4b1Var.j();
                return new f111(strJ2 != null ? strJ2 : "");
            case 22:
                String strJ3 = s4b1Var.j();
                return new nh11(strJ3 != null ? strJ3 : "");
            case 23:
                String stringExtra4 = intent.getStringExtra("entity-uri");
                y6b1 y6b1Var = new y6b1(stringExtra4 != null ? stringExtra4 : "", false);
                if (u221.a[y6b1Var.c.ordinal()] == 1) {
                    String str4 = y6b1Var.e;
                    str4.getClass();
                    y6b1Var = y6b1.a(str4);
                }
                return new t221(y6b1Var.toString());
            case 24:
                String strJ4 = s4b1Var.j();
                str2 = strJ4 != null ? strJ4 : "";
                String stringExtra5 = intent.getStringExtra("key_message_id");
                if (stringExtra5 != null) {
                    return new gj21(str2, stringExtra5);
                }
                hhg1.n("Required value was null.");
                return null;
            case 25:
                return aqr0Var;
            case 26:
                String strZ4 = s4b1Var.z();
                str2 = strZ4 != null ? strZ4 : "";
                String strN5 = s4b1Var.n("id");
                Bundle extras9 = intent.getExtras();
                String string3 = extras9 != null ? extras9.getString("music_guesser_playlist_uri") : null;
                Bundle extras10 = intent.getExtras();
                return new w531(str2, strN5, extras10 != null ? extras10.getByteArray("complete_game_request") : null, string3);
            case 27:
                Bundle extras11 = intent.getExtras();
                return new vo51(extras11 != null ? extras11.getString("imageUri") : null);
            case 28:
                Object objS = ila0.s(intent, "share.sheet.error", th71.class);
                if (objS != null) {
                    return (th71) objS;
                }
                hhg1.n("Required value was null.");
                return null;
            default:
                Bundle extras12 = intent.getExtras();
                return new f691(extras12 != null ? extras12.getString("imageUri") : null);
        }
    }

    public final e6w0 d() {
        byte b = this.a;
        a6w0 a6w0Var = a6w0.a;
        ed5 ed5Var = ed5.c;
        switch (b) {
            case 0:
                return new b6w0(false);
            case 1:
                return new b6w0(false);
            case 2:
                return new c6w0(1, true, (hd5) null, 12);
            case 3:
                return new b6w0(true);
            case 4:
                return new c6w0(3, true, (hd5) null, 12);
            case 5:
                return a6w0Var;
            case 6:
                return new c6w0(1, true, (hd5) null, 12);
            case 7:
                return new c6w0(1, false, (hd5) null, 14);
            case 8:
                return new b6w0(false);
            case 9:
                return new b6w0(true);
            case 10:
                return new b6w0(false);
            case 11:
                return a6w0Var;
            case 12:
                return new b6w0(true);
            case 13:
                return new b6w0(false);
            case 14:
                return new b6w0(false);
            case 15:
                return new b6w0(true);
            case 16:
                return new b6w0(true);
            case 17:
                return new b6w0(true);
            case 18:
                return new b6w0(true);
            case 19:
                return new b6w0(false);
            case 20:
                return new c6w0(2, true, (hd5) null, 12);
            case 21:
                return new c6w0(1, true, ed5Var, 8);
            case 22:
                return new c6w0(1, true, (hd5) null, 12);
            case 23:
                return new b6w0(true);
            case 24:
                return new c6w0(1, false, ed5Var, 8);
            case 25:
                return new b6w0(false);
            case 26:
                return new c6w0(1, false, fd5.c, 8);
            case 27:
                return new b6w0(false);
            case 28:
                return new b6w0(true);
            default:
                return new b6w0(false);
        }
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Page corresponding to the Bluetooth Permission Info sheet";
            case 1:
                return "Page corresponding to the Bluetooth Permission Request Bottom Sheet";
            case 2:
                return "Page corresponding to the Full Screen Bluetooth Permission Request sheet";
            case 3:
                return "Bottom sheet for prompted playlist notification opt-in";
            case 4:
                return "Page Match onboarding page to start scanning";
            case 5:
                return "Page Match outbound scanning page to capture book pages";
            case 6:
                return "Education page within the parental consent flow";
            case 7:
                return "PIN gate for parental control";
            case 8:
                return "Playback Timeout Error Page";
            case 9:
                return "Post-download info bottom sheet for remote downloads onboarding.";
            case 10:
                return "Premium play modes upsell for MFT+";
            case 11:
                return "Promo Disclosure Page";
            case 12:
                return "Bottom sheet with suggested prompts for the host artifact page";
            case 13:
                return "Queue bottom sheet using PageAPI";
            case 14:
                return "A bottom sheet upsell shown for queue upsell reasons.";
            case 15:
                return "Quiz recommendations bottom sheet";
            case 16:
                return "Quiz question sources bottom sheet";
            case 17:
                return "Bottom sheet for rating a quiz question as bad";
            case 18:
                return "Bottom sheet displaying reactions for comments";
            case 19:
                return "Reactions Sheet Page";
            case 20:
                return "Wrapped receipt bottom sheet";
            case 21:
                return "The fullscreen page for npv recommendations";
            case 22:
                return "Page showing details for a regular member sub-account";
            case 23:
                return "A page that shows a list of all the devices that the user can download the entity to";
            case 24:
                return "A page for displaying the report a problem flow";
            case 25:
                return "A bottom sheet for reporting concert issues";
            case 26:
                return "Music Guesser Results";
            case 27:
                return "A bottom sheet upsell shown when user tries to seek.";
            case 28:
                return "Share sheet error page";
            default:
                return "A bottom sheet upsell shown when user reaches skip limit.";
        }
    }
}
