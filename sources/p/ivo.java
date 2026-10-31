package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ivo implements acr0 {
    public final /* synthetic */ byte a;
    public final Set b;

    public ivo(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = Collections.singleton(blc0.Gd);
                break;
            case 3:
                this.b = Collections.singleton(blc0.d1);
                break;
            case 4:
                this.b = Collections.singleton(blc0.n6);
                break;
            case 5:
                this.b = Collections.singleton(blc0.qf);
                break;
            case 6:
                this.b = Collections.singleton(blc0.i3);
                break;
            case 7:
                this.b = Collections.singleton(blc0.Ua);
                break;
            case 8:
                this.b = Collections.singleton(blc0.A5);
                break;
            case 9:
                this.b = Collections.singleton(blc0.Xg);
                break;
            case 10:
                this.b = f46.S0(new blc0[]{blc0.v6, blc0.w6});
                break;
            case 11:
                this.b = f46.S0(new blc0[]{blc0.x6, blc0.y6});
                break;
            case 12:
                this.b = Collections.singleton(blc0.k2);
                break;
            case 13:
                this.b = Collections.singleton(blc0.Gi);
                break;
            case 14:
                this.b = Collections.singleton(blc0.M6);
                break;
            case 15:
                this.b = Collections.singleton(blc0.k1);
                break;
            case 16:
                this.b = nx20.b;
                break;
            case 17:
                this.b = Collections.singleton(blc0.R7);
                break;
            case 18:
                this.b = Collections.singleton(blc0.K6);
                break;
            case 19:
                this.b = f46.S0(new blc0[]{blc0.zc, blc0.Ac});
                break;
            case 20:
                this.b = f46.S0(new blc0[]{blc0.u7, blc0.s7});
                break;
            case 21:
                this.b = Collections.singleton(blc0.p7);
                break;
            case 22:
                this.b = Collections.singleton(blc0.q7);
                break;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                this.b = Collections.singleton(blc0.r7);
                break;
            case 24:
                this.b = Collections.singleton(blc0.t7);
                break;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                this.b = Collections.singleton(blc0.w7);
                break;
            case 26:
                this.b = Collections.singleton(blc0.x7);
                break;
            case 27:
                this.b = Collections.singleton(blc0.y7);
                break;
            case 28:
                this.b = Collections.singleton(blc0.R9);
                break;
            case 29:
                this.b = Collections.singleton(blc0.S9);
                break;
            default:
                this.b = Collections.singleton(blc0.Gc);
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
                return evo.class;
            case 1:
                return e8t.class;
            case 2:
                return lat.class;
            case 3:
                return fnu.class;
            case 4:
                return azu.class;
            case 5:
                return o2v.class;
            case 6:
                return tov.class;
            case 7:
                return t3w.class;
            case 8:
                return c5y.class;
            case 9:
                return x7y.class;
            case 10:
                return msy.class;
            case 11:
                return ouy.class;
            case 12:
                return pfz.class;
            case 13:
                return zm10.class;
            case 14:
                return t620.class;
            case 15:
                return cl20.class;
            case 16:
                return bx20.class;
            case 17:
                return is30.class;
            case 18:
                return g340.class;
            case 19:
                return zb40.class;
            case 20:
                return l750.class;
            case 21:
                return y750.class;
            case 22:
                return s850.class;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return e950.class;
            case 24:
                return u950.class;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return gb50.class;
            case 26:
                return sb50.class;
            case 27:
                return lc50.class;
            case 28:
                return bh50.class;
            default:
                return dk50.class;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:272:0x0413  */
    /* JADX WARN: Instruction removed from duplicated block: B:110:0x01c3, please report this as an issue */
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        String strZ;
        Uri uri;
        String strConcat;
        e720 e720Var;
        lx20 lx20Var;
        gc40 ec40Var;
        mmr0 mmr0Var;
        String string;
        v850 v850Var;
        String string2;
        String strDecode;
        String strDecode2;
        byte b = this.a;
        aqr0 aqr0Var = aqr0.a;
        int i = 0;
        String str = "";
        Object obj = null;
        v850 v850Var2 = null;
        gc50Var = null;
        gc50 gc50Var = null;
        numC0 = null;
        Integer numC0 = null;
        Object obj2 = null;
        switch (b) {
            case 0:
                int iOrdinal = s4b1Var.c.ordinal();
                if (iOrdinal == 45 || iOrdinal == 95 || iOrdinal == 885 ? (strZ = s4b1Var.z()) != null : (uri = s4b1Var.a) != null && (strZ = uri.getQueryParameter("target")) != null) {
                    str = strZ;
                }
                return new hvo(str, th61Var.a, intent.getExtras());
            case 1:
                String strJ = s4b1Var.j();
                return new g8t(strJ != null ? strJ : "");
            case 2:
                String strO = s4b1Var.o(s4b1Var.p() - 2);
                String strO2 = s4b1Var.o(s4b1Var.p() - 1);
                if (strO == null) {
                    strO = "";
                }
                return new nat(strO, strO2 != null ? strO2 : "", false);
            case 3:
                Uri uri2 = s4b1Var.a;
                String queryParameter = uri2 != null ? uri2.getQueryParameter("inputMode") : null;
                for (int i2 : l1d.H(2)) {
                    if (ab80.j(i2).equals(queryParameter)) {
                        i = i2;
                        return new mnu(i != 0 ? i : 2);
                    }
                }
                return new mnu(i != 0 ? i : 2);
            case 4:
                String strN = s4b1Var.n("parentPageId");
                if (strN == null) {
                    strN = "";
                }
                String strN2 = s4b1Var.n("parentPageUri");
                return new czu(strN, strN2 != null ? strN2 : "");
            case 5:
                Uri uri3 = s4b1Var.a;
                return new q2v(uri3 != null ? uri3.getQueryParameter("imageUrl") : null, uri3 != null ? uri3.getQueryParameter("entityName") : null, uri3 != null ? uri3.getQueryParameter("entityType") : null);
            case 6:
                String strB = pcf.b(s4b1Var);
                if (strB != null) {
                    Bundle extras = intent.getExtras();
                    return new bpv(strB, s4b1Var.l(), extras != null ? extras.getString("groupName") : null);
                }
                hhg1.n("Chat ID cannot be null");
                return null;
            case 7:
                Set set = s4b1.f;
                String strZ2 = uic.y(s4b1Var.h()).z();
                strZ2.getClass();
                String stringExtra = intent.getStringExtra("edit_ucp_prompt_text");
                String stringExtra2 = intent.getStringExtra("edit_ucp_prompt_id");
                boolean booleanExtra = intent.getBooleanExtra("edit_ucp_prompt_add_new", false);
                Bundle extras2 = intent.getExtras();
                return new b4w(strZ2, extras2 != null ? (ResultReceiver) extras2.getParcelable("edit_ucp_prompt_result_receiver") : null, stringExtra, stringExtra2, booleanExtra);
            case 8:
                return e5y.a;
            case 9:
                w7y w7yVar = (w7y) intent.getParcelableExtra("engagementDialogData");
                String strG = s4b1Var.G(s4b1Var.p() - 1, s4b1Var.p());
                String str2 = w7yVar != null ? w7yVar.a : null;
                String str3 = str2 == null ? "" : str2;
                String str4 = w7yVar != null ? w7yVar.b : null;
                String str5 = str4 == null ? "" : str4;
                String str6 = w7yVar != null ? w7yVar.c : null;
                String str7 = str6 == null ? "" : str6;
                String str8 = w7yVar != null ? w7yVar.d : null;
                String str9 = str8 == null ? "" : str8;
                String str10 = w7yVar != null ? w7yVar.e : null;
                String str11 = str10 == null ? "" : str10;
                String str12 = w7yVar != null ? w7yVar.f : null;
                String str13 = str12 == null ? "" : str12;
                String str14 = w7yVar != null ? w7yVar.g : null;
                return new z7y(strG, str3, str5, str7, str9, str11, str13, str14 == null ? "" : str14, intent.getStringExtra("showImageUri"), intent.getBooleanExtra("is_audiobook", false));
            case 10:
                blc0 blc0Var = s4b1Var.c;
                String strJ2 = s4b1Var.j();
                if (strJ2 == null) {
                    hhg1.n("Missing entity ID in EntitySegmentsBottomSheet URI");
                    return null;
                }
                int iOrdinal2 = blc0Var.ordinal();
                if (iOrdinal2 == 305) {
                    strConcat = "spotify:episode:".concat(strJ2);
                } else {
                    if (iOrdinal2 != 306) {
                        hhg1.o(blc0Var, "Unexpected link type for EntitySegmentsBottomSheet: ");
                        return null;
                    }
                    strConcat = "spotify:track:".concat(strJ2);
                }
                return new ruy(strConcat);
            case 11:
                String strZ3 = s4b1Var.z();
                if (strZ3 == null) {
                    strZ3 = "";
                }
                String strJ3 = s4b1Var.j();
                str = strJ3 != null ? strJ3 : "";
                if (ihc1.h0(strZ3, ":entity-segments:episode:", false)) {
                    strZ3 = "spotify:episode:".concat(str);
                } else if (ihc1.h0(strZ3, ":entity-segments:track:", false)) {
                    strZ3 = "spotify:track:".concat(str);
                }
                return new ruy(strZ3);
            case 12:
                String stringExtra3 = intent.getStringExtra("bookUri");
                return new qfz(stringExtra3 != null ? stringExtra3 : "", intent.getBooleanExtra("openReaderOnKeepReading", false));
            case 13:
                String strZ4 = s4b1Var.z();
                if (strZ4 == null) {
                    strZ4 = "";
                }
                String strJ4 = s4b1Var.j();
                return new bn10(strZ4, (strJ4 != null ? strJ4 : "").toUpperCase(Locale.ROOT), oon1.q(s4b1Var));
            case 14:
                Bundle extras3 = intent.getExtras();
                if (extras3 != null) {
                    e720Var = (e720) extras3.getParcelable("filter_and_sort_config_parameter");
                    if (e720Var == null) {
                        z6x z6xVar = z6x.a;
                        e720Var = new e720(new s620(1, z6xVar, z6xVar));
                    }
                } else {
                    e720Var = null;
                }
                if (e720Var != null) {
                    return e720Var;
                }
                hhg1.n("Required value was null.");
                return null;
            case 15:
                String str15 = th61Var.a;
                String stringExtra4 = intent.getStringExtra("item_uri");
                String str16 = stringExtra4 == null ? "" : stringExtra4;
                String stringExtra5 = intent.getStringExtra("source_view_uri");
                String str17 = stringExtra5 == null ? "" : stringExtra5;
                String stringExtra6 = intent.getStringExtra("source_context_uri");
                String str18 = stringExtra6 == null ? "" : stringExtra6;
                boolean booleanExtra2 = intent.getBooleanExtra("is_item_being_curated", false);
                tv80 parcelableExtra = intent.getParcelableExtra("interaction_logging_result");
                return new il20(str16, str15, str17, str18, booleanExtra2, parcelableExtra instanceof tv80 ? parcelableExtra : null);
            case 16:
                Set set2 = nx20.b;
                blc0 blc0Var2 = s4b1Var.c;
                for (Object obj3 : nx20.c) {
                    if (((nx20) obj3).a == blc0Var2) {
                        obj2 = obj3;
                        lx20Var = (nx20) obj2;
                        if (lx20Var == null) {
                            n57.e("No matching FmaUpsellSource found for Link: " + s4b1Var);
                            lx20Var = lx20.d;
                        }
                        return new dx20(lx20Var);
                    }
                }
                lx20Var = (nx20) obj2;
                if (lx20Var == null) {
                    n57.e("No matching FmaUpsellSource found for Link: " + s4b1Var);
                    lx20Var = lx20.d;
                }
                return new dx20(lx20Var);
            case 17:
                Bundle extras4 = intent.getExtras();
                MessageResponseToken messageResponseToken = extras4 != null ? (MessageResponseToken) extras4.getParcelable("token") : null;
                messageResponseToken.getClass();
                return new ks30(messageResponseToken);
            case 18:
                String strZ5 = s4b1Var.z();
                if (strZ5 == null) {
                    strZ5 = "";
                }
                String strN3 = s4b1Var.n("id");
                str = strN3 != null ? strN3 : "";
                Bundle extras5 = intent.getExtras();
                return new i340(strZ5, str, extras5 != null ? extras5.getString("music_guesser_playlist_uri") : null);
            case 19:
                blc0 blc0Var3 = s4b1Var.c;
                int iOrdinal3 = blc0Var3.ordinal();
                if (iOrdinal3 == 621) {
                    ec40Var = new ec40(s4b1Var.h());
                } else {
                    if (iOrdinal3 != 622) {
                        hhg1.g(blc0Var3, "Invalid link type: ");
                        return null;
                    }
                    ec40Var = new fc40(s4b1Var.h());
                }
                return new hc40(ec40Var);
            case 20:
                int iOrdinal4 = s4b1Var.c.ordinal();
                if (iOrdinal4 == 354) {
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    mmr0Var = new mmr0(yon1.G1("GRADUATION_POSTPONED", "graduation/postponed", 769, "graduation"), nik1.c4);
                } else {
                    if (iOrdinal4 != 356) {
                        hhg1.g(s4b1Var, "Unsupported link type: ");
                        return null;
                    }
                    AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                    mmr0Var = new mmr0(yon1.G1("GRADUATION_REQUESTED", "graduation/requested", 771, "graduation"), nik1.d4);
                }
                return new o750((p6r0) mmr0Var.a, (lik1) mmr0Var.b, fj30.C(intent), nik1.e4);
            case 21:
                return new a850(fj30.C(intent));
            case 22:
                Bundle extras6 = intent.getExtras();
                boolean z = extras6 != null ? extras6.getBoolean("managed_by_graduation_launcher_plugin") : false;
                v850 v850VarC = fj30.C(intent);
                Bundle extras7 = intent.getExtras();
                if (extras7 != null && (string = extras7.getString("graduation_age")) != null) {
                    numC0 = nhc1.c0(string);
                }
                return new u850(z, v850VarC, numC0);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return aqr0Var;
            case 24:
                return new w950(fj30.C(intent));
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return aqr0Var;
            case 26:
                return new ub50(fj30.C(intent));
            case 27:
                String strJ5 = s4b1Var.j();
                str = strJ5 != null ? strJ5 : "";
                Bundle extras8 = intent.getExtras();
                v850 v850Var3 = v850.a;
                if (extras8 != null && (string2 = extras8.getString("graduation_view_request_child_id")) != null) {
                    String string3 = extras8.getString("graduation_view_request_flow");
                    if (string3 != null) {
                        for (Object obj4 : v850.d) {
                            if (u890.j(((v850) obj4).name(), string3)) {
                                obj = obj4;
                                v850Var2 = (v850) obj;
                            }
                        }
                        v850Var2 = (v850) obj;
                    }
                    if (v850Var2 == null) {
                        v850Var2 = v850Var3;
                    }
                    gc50Var = new gc50(string2, v850Var2);
                }
                if (gc50Var != null && (v850Var = gc50Var.b) != null) {
                    v850Var3 = v850Var;
                }
                return new nc50(str, v850Var3);
            case 28:
                String strJ6 = s4b1Var.j();
                if (strJ6 != null && (strDecode = Uri.decode(strJ6)) != null) {
                    str = strDecode;
                }
                return new dh50(str);
            default:
                String strJ7 = s4b1Var.j();
                if (strJ7 != null && (strDecode2 = Uri.decode(strJ7)) != null) {
                    str = strDecode2;
                }
                return new fk50(str, intent.getBooleanExtra("isOpenedFromChat", false));
        }
    }

    public final e6w0 d() {
        byte b = this.a;
        a6w0 a6w0Var = a6w0.a;
        switch (b) {
            case 0:
                return a6w0Var;
            case 1:
                return new c6w0(1, true, (hd5) null, 12);
            case 2:
                return new c6w0(1, false, (hd5) null, 14);
            case 3:
                return new b6w0(true);
            case 4:
                return new b6w0(false);
            case 5:
                return new b6w0(false);
            case 6:
                return new c6w0(3, false, (hd5) null, 14);
            case 7:
                return new b6w0(true);
            case 8:
                return new b6w0(false);
            case 9:
                return new c6w0(1, false, (hd5) null, 14);
            case 10:
                return new b6w0(true);
            case 11:
                return a6w0Var;
            case 12:
                return new b6w0(true);
            case 13:
                return new c6w0(1, true, (hd5) null, 12);
            case 14:
                return new b6w0(false);
            case 15:
                return new b6w0(true);
            case 16:
                return new b6w0(false);
            case 17:
                return new c6w0(3, false, (hd5) null, 14);
            case 18:
                return new c6w0(1, false, fd5.c, 8);
            case 19:
                return new b6w0(false);
            case 20:
                return new c6w0(1, false, (hd5) null, 14);
            case 21:
                return new c6w0(1, false, (hd5) null, 14);
            case 22:
                return new c6w0(1, false, (hd5) null, 14);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new c6w0(1, false, (hd5) null, 14);
            case 24:
                return new c6w0(1, false, (hd5) null, 14);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new c6w0(1, false, (hd5) null, 14);
            case 26:
                return new c6w0(1, false, (hd5) null, 14);
            case 27:
                return new c6w0(1, true, (hd5) null, 12);
            case 28:
                return new b6w0(false);
            default:
                return new b6w0(false);
        }
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "DNA host page";
            case 1:
                return "Page for deleting a managed account";
            case 2:
                return "SKU Selection Page";
            case 3:
                return "Page for DJ Interactivity";
            case 4:
                return "Dialog to confirm downloading over cellular data";
            case 5:
                return "A bottom sheet upsell shown when user tries to download content.";
            case 6:
                return "A page sheet for editing group chat details";
            case 7:
                return "Bottom sheet for editing UCP prompted playlist prompt";
            case 8:
                return "Bottom sheet page for user to select DJ language";
            case 9:
                return "Providing experiences for all things “gated” e.g. paywalled, partner-subscribed";
            case 10:
                return "Bottom sheet list of all segments for a given entity";
            case 11:
                return "Full screen list of all segments for a given entity";
            case 12:
                return "E-reader playback gate bottom sheet";
            case 13:
                return "Impl of the unboxing feature flow";
            case 14:
                return "filter and sort controls page";
            case 15:
                return "First Save";
            case 16:
                return "Page for FMA Upsell BottomSheet";
            case 17:
                return "A fullscreen message that is shown via the messaging platform";
            case 18:
                return "Music Guesser Gameplay";
            case 19:
                return "The parental control bottom sheet Page for blocking a specific track or artist";
            case 20:
                return "A page that confirms a choice has been made on the education message";
            case 21:
                return "A page that informs a managed account that their graduation request was approved";
            case 22:
                return "A page that informs a managed account that they are now eligible for graduation";
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return "A page that initiates the graduation process, fetching the token and then logging off the user";
            case 24:
                return "A page that informs a managed account that their graduation request was rejected";
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return "A page that reminds the user on a managed account of the controls the plan manager has";
            case 26:
                return "A page contains new T&Cs for the semi-managed account state";
            case 27:
                return "A page for a plan manager to approve or deny a graduation request";
            case 28:
                return "A bottom sheet reached from a group chat that lets a user choose which group members can see their listening activity";
            default:
                return "A sheet listing a group chat's members with their current or recent listening activity";
        }
    }

    public ivo(a7a1 a7a1Var) {
        Set setS0;
        this.a = (byte) 0;
        if (a7a1Var.a) {
            setS0 = f46.S0(new blc0[]{blc0.Kh, blc0.Eh, blc0.v1, blc0.t2});
        } else {
            setS0 = w7x.a;
        }
        this.b = setS0;
    }
}
