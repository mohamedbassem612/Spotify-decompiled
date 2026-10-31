package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ow60 implements acr0 {
    public final /* synthetic */ byte a;
    public final Set b;

    public ow60(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = Collections.singleton(blc0.S4);
                break;
            case 2:
                this.b = Collections.singleton(blc0.N7);
                break;
            case 3:
                this.b = Collections.singleton(blc0.qc);
                break;
            case 4:
                this.b = f46.S0(new blc0[]{blc0.I6, blc0.J6});
                break;
            case 5:
                this.b = Collections.singleton(blc0.s8);
                break;
            case 6:
                this.b = Collections.singleton(blc0.t8);
                break;
            case 7:
                this.b = Collections.singleton(blc0.u8);
                break;
            case 8:
                this.b = Collections.singleton(blc0.v8);
                break;
            case 9:
                this.b = Collections.singleton(blc0.B8);
                break;
            case 10:
                this.b = f46.S0(new blc0[]{blc0.f9, blc0.r9});
                break;
            case 11:
                this.b = f46.S0(new blc0[]{blc0.j9, blc0.w9});
                break;
            case 12:
                this.b = f46.S0(new blc0[]{blc0.k9, blc0.x9});
                break;
            case 13:
                this.b = f46.S0(new blc0[]{blc0.l9, blc0.y9});
                break;
            case 14:
                this.b = Collections.singleton(blc0.s9);
                break;
            case 15:
                this.b = Collections.singleton(blc0.rc);
                break;
            case 16:
                this.b = Collections.singleton(blc0.Q9);
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                this.b = Collections.singleton(blc0.T9);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                this.b = Collections.singleton(blc0.na);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                this.b = Collections.singleton(blc0.Ic);
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                this.b = Collections.singleton(blc0.Jc);
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                this.b = Collections.singleton(blc0.Oa);
                break;
            case 22:
                this.b = f46.S0(new blc0[]{blc0.sb, blc0.tb});
                break;
            case 23:
                this.b = Collections.singleton(blc0.Id);
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                this.b = Collections.singleton(blc0.Kd);
                break;
            case 25:
                this.b = Collections.singleton(blc0.Ld);
                break;
            case 26:
                this.b = Collections.singleton(blc0.Jd);
                break;
            case 27:
                this.b = Collections.singleton(blc0.V7);
                break;
            case 28:
                this.b = Collections.singleton(blc0.Bb);
                break;
            case 29:
                this.b = Collections.singleton(blc0.q3);
                break;
            default:
                this.b = Collections.singleton(blc0.w8);
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
                return kw60.class;
            case 1:
                return ht70.class;
            case 2:
                return hx70.class;
            case 3:
                return e880.class;
            case 4:
                return ia90.class;
            case 5:
                return hs90.class;
            case 6:
                return ft90.class;
            case 7:
                return rx90.class;
            case 8:
                return hz90.class;
            case 9:
                return ica0.class;
            case 10:
                return sva0.class;
            case 11:
                return uwa0.class;
            case 12:
                return jxa0.class;
            case 13:
                return mxa0.class;
            case 14:
                return oya0.class;
            case 15:
                return jab0.class;
            case 16:
                return vdd0.class;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return afd0.class;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return ire0.class;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return sze0.class;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return t0f0.class;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return bpf0.class;
            case 22:
                return x6i0.class;
            case 23:
                return ili0.class;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return dmi0.class;
            case 25:
                return rmi0.class;
            case 26:
                return hpi0.class;
            case 27:
                return uem0.class;
            case 28:
                return pqm0.class;
            default:
                return bgn0.class;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:327:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:73:0x012f  */
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        String queryParameter;
        int iX;
        int i;
        fs90 ds90Var;
        ks90 ks90Var;
        yxa0 yxa0Var;
        yxa0 yxa0Var2;
        dxr0 dxr0Var;
        yq00 yq00Var;
        yxa0 yxa0Var3;
        yxa0 yxa0Var4;
        yxa0 uxa0Var;
        yq00 yq00Var2;
        ArrayList<Integer> integerArrayList;
        String strZ;
        List listL1;
        ArrayList<String> stringArrayList;
        byte b = this.a;
        yq00 yq00Var3 = wq00.a;
        aqr0 aqr0Var = aqr0.a;
        zzy zzyVar = xzy.b;
        zzy zzyVar2 = yzy.b;
        zzy zzyVar3 = vzy.b;
        zzy zzyVar4 = uzy.b;
        List listL2 = z6x.a;
        yxa0 yxa0Var5 = txa0.a;
        MessageResponseToken og90Var = null;
        switch (b) {
            case 0:
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    hhg1.n("Intent has no extras!");
                    return null;
                }
                Parcelable parcelable = extras.getParcelable("hostapproval.hostapprovalsheet.impl.page");
                parcelable.getClass();
                return (nw60) parcelable;
            case 1:
                String stringExtra = intent.getStringExtra("entity-uri");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                return new lt70(stringExtra, intent.getStringExtra("media-url"));
            case 2:
                Bundle extras2 = intent.getExtras();
                og90Var = extras2 != null ? (jx70) extras2.getParcelable("image-picker-extras") : null;
                return og90Var != null ? new ix70(og90Var.a, og90Var.b) : new ix70(false, false);
            case 3:
                String strJ = s4b1Var.j();
                if (strJ == null) {
                    strJ = "";
                }
                String strConcat = "spotify:show:".concat(strJ);
                Uri uri = s4b1Var.a;
                if (uri != null && (queryParameter = uri.getQueryParameter("isbn")) != null) {
                    if (nhc1.Y(queryParameter, "connected:", false) && queryParameter.length() > 10) {
                        og90Var = new og90(ihc1.U0(queryParameter, "connected:", queryParameter));
                    } else if (queryParameter.equals("skipped")) {
                        og90Var = rg90.a;
                    } else if (queryParameter.equals("remove")) {
                        og90Var = pg90.a;
                    }
                }
                return new r880(strJ, strConcat, og90Var);
            case 4:
                String strZ2 = s4b1Var.z();
                if (strZ2 == null) {
                    strZ2 = "";
                }
                Bundle extras3 = intent.getExtras();
                return new ka90(strZ2, extras3 != null ? extras3.getString("music_guesser_playlist_uri") : null);
            case 5:
                Bundle extras4 = intent.getExtras();
                if (extras4 == null) {
                    hhg1.n("Intent has no extras!");
                    return null;
                }
                if (!u890.j(extras4.getString("jam_invite_learn_more_page_viewer_context_type_key"), "PARTICIPANT")) {
                    String string = extras4.getString("jam_invite_learn_more_page_pending_requests_join_type_key");
                    if (string != null) {
                        try {
                            iX = ab80.x(string);
                        } catch (IllegalArgumentException unused) {
                            iX = 1;
                        }
                        if (iX == 0) {
                            i = 1;
                        } else {
                            i = iX;
                        }
                    } else {
                        i = 1;
                    }
                    ds90Var = new ds90(i);
                    break;
                } else {
                    String string2 = extras4.getString("jam_invite_learn_more_page_host_user_id_key");
                    if (string2 == null) {
                        string2 = "";
                    }
                    String string3 = extras4.getString("jam_invite_learn_more_page_host_display_name_key");
                    if (string3 == null) {
                        string3 = "";
                    }
                    ds90Var = new es90(string2, extras4.getBoolean("jam_invite_learn_more_page_host_approval_required_key", false), string3, extras4.getBoolean("jam_invite_learn_more_page_can_block_host_key", false));
                }
                if (ds90Var instanceof ds90) {
                    ks90Var = new ks90(1, ((ds90) ds90Var).a, null, null, false, false, 60);
                } else {
                    if (!(ds90Var instanceof es90)) {
                        eg.o();
                        return null;
                    }
                    es90 es90Var = (es90) ds90Var;
                    ks90Var = new ks90(2, 0, es90Var.a, es90Var.b, es90Var.c, es90Var.d, 2);
                }
                return ks90Var;
            case 6:
                Bundle extras5 = intent.getExtras();
                if (extras5 == null) {
                    hhg1.n("Intent has no extras!");
                    return null;
                }
                Object objT = jhc1.t(extras5, "jam.invite.sheet.args", gt90.class);
                objT.getClass();
                return (gt90) objT;
            case 7:
                Bundle extras6 = intent.getExtras();
                if (extras6 == null) {
                    hhg1.n("Intent has no extras!");
                    return null;
                }
                String string4 = extras6.getString("jam_manage_participants_sheet_session_id_key");
                if (string4 != null) {
                    return new tx90(string4);
                }
                hhg1.n("No arguments in bundle!");
                return null;
            case 8:
                return aqr0Var;
            case 9:
                Bundle extras7 = intent.getExtras();
                if (extras7 == null) {
                    hhg1.n("Intent has no extras!");
                    return null;
                }
                Object objT2 = jhc1.t(extras7, "join.jam.sheet.args", kca0.class);
                objT2.getClass();
                return (kca0) objT2;
            case 10:
                Bundle extras8 = intent.getExtras();
                String string5 = extras8 != null ? extras8.getString("birthday") : null;
                Bundle extras9 = intent.getExtras();
                String string6 = extras9 != null ? extras9.getString("maxBirthday") : null;
                Bundle extras10 = intent.getExtras();
                String string7 = extras10 != null ? extras10.getString("minBirthday") : null;
                Bundle extras11 = intent.getExtras();
                og90Var = extras11 != null ? (okr0) extras11.getParcelable("pages") : null;
                Bundle extras12 = intent.getExtras();
                return new jwa(string5, string7, string6, og90Var != null ? ((okr0) og90Var).a : 0, og90Var != null ? ((okr0) og90Var).b : 0, (extras12 == null || (yxa0Var = (yxa0) extras12.getParcelable("flow_type")) == null) ? yxa0Var5 : yxa0Var);
            case 11:
                Bundle extras13 = intent.getExtras();
                String string8 = extras13 != null ? extras13.getString("name") : null;
                Bundle extras14 = intent.getExtras();
                og90Var = extras14 != null ? (okr0) extras14.getParcelable("pages") : null;
                Bundle extras15 = intent.getExtras();
                if (extras15 == null || (yxa0Var2 = (yxa0) extras15.getParcelable("flow_type")) == null) {
                    yxa0Var2 = yxa0Var5;
                }
                return new yjn0(og90Var != null ? ((okr0) og90Var).a : 0, og90Var != null ? ((okr0) og90Var).b : 0, string8, yxa0Var2);
            case 12:
                Bundle extras16 = intent.getExtras();
                if (extras16 == null || (dxr0Var = (dxr0) extras16.getParcelable("default_control")) == null) {
                    lwr0 lwr0Var = lwr0.a;
                    dxr0Var = new dxr0(lwr0Var, lwr0Var);
                }
                dxr0 dxr0Var2 = dxr0Var;
                Bundle extras17 = intent.getExtras();
                og90Var = extras17 != null ? (okr0) extras17.getParcelable("pages") : null;
                Bundle extras18 = intent.getExtras();
                yxa0 yxa0Var6 = (extras18 == null || (yxa0Var3 = (yxa0) extras18.getParcelable("key_flow_type")) == null) ? yxa0Var5 : yxa0Var3;
                Bundle extras19 = intent.getExtras();
                return new lxa0(dxr0Var2, og90Var != null ? ((okr0) og90Var).a : 0, og90Var != null ? ((okr0) og90Var).b : 0, yxa0Var6, (extras19 == null || (yq00Var = (yq00) extras19.getParcelable("expected_account_type")) == null) ? yq00Var3 : yq00Var);
            case 13:
                Bundle extras20 = intent.getExtras();
                String string9 = extras20 != null ? extras20.getString("pin") : null;
                Bundle extras21 = intent.getExtras();
                og90Var = extras21 != null ? (okr0) extras21.getParcelable("pages") : null;
                Bundle extras22 = intent.getExtras();
                if (extras22 == null || (yxa0Var4 = (yxa0) extras22.getParcelable("key_flow_type")) == null) {
                    yxa0Var4 = yxa0Var5;
                }
                return new z1t0(og90Var != null ? ((okr0) og90Var).a : 0, og90Var != null ? ((okr0) og90Var).b : 0, string9, yxa0Var4);
            case 14:
                String strJ2 = s4b1Var.j();
                String str = strJ2 == null ? "" : strJ2;
                Bundle extras23 = intent.getExtras();
                if (extras23 == null || (uxa0Var = (yxa0) extras23.getParcelable("key_flow_type")) == null) {
                    uxa0Var = new uxa0(str);
                }
                yxa0 yxa0Var7 = uxa0Var;
                Bundle extras24 = intent.getExtras();
                og90Var = extras24 != null ? (okr0) extras24.getParcelable("pages") : null;
                Bundle extras25 = intent.getExtras();
                yq00 yq00Var4 = (extras25 == null || (yq00Var2 = (yq00) extras25.getParcelable("expected_account_type")) == null) ? yq00Var3 : yq00Var2;
                Bundle extras26 = intent.getExtras();
                return new thg1(str, yxa0Var7 instanceof wxa0 ? ((wxa0) yxa0Var7).a : new wig1(str), yxa0Var7, og90Var != null ? ((okr0) og90Var).a : 0, og90Var != null ? ((okr0) og90Var).b : 0, yq00Var4, extras26 != null ? extras26.getBoolean("has_addons_terminated_by_transition", false) : false);
            case 15:
                String strO = s4b1Var.o(2);
                if (strO == null) {
                    strO = "";
                }
                return new sab0(strO, "spotify:show:".concat(strO));
            case 16:
                String strJ3 = s4b1Var.j();
                return new xdd0(strJ3 != null ? Uri.decode(strJ3) : "", intent.getStringExtra("entityUri"), intent.getStringExtra("contextUri"), intent.getBooleanExtra("isPlaying", false), intent.getLongExtra("timestamp", 0L), intent.getBooleanExtra("isOpenedFromChat", false), intent.getBooleanExtra("isFollowing", false), intent.getStringExtra("groupChatId"));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return cfd0.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return aqr0Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                String strN = s4b1Var.n("entryPoint");
                if (u890.j(strN, "accountCreation")) {
                    zzyVar = zzyVar4;
                } else if (u890.j(strN, "accountTransition")) {
                    zzyVar = zzyVar3;
                } else if (u890.j(strN, "parentalConsent")) {
                    zzyVar = zzyVar2;
                }
                String strJ4 = s4b1Var.j();
                if (strJ4 != null) {
                    return new c0f0(strJ4, zzyVar);
                }
                eg.m("childId is missing from the URI");
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                String strJ5 = s4b1Var.j();
                if (strJ5 == null) {
                    strJ5 = "";
                }
                String strN2 = s4b1Var.n("entryPoint");
                if (u890.j(strN2, "accountCreation")) {
                    zzyVar = zzyVar4;
                } else if (u890.j(strN2, "accountTransition")) {
                    zzyVar = zzyVar3;
                } else if (u890.j(strN2, "parentalConsent")) {
                    zzyVar = zzyVar2;
                }
                Bundle extras27 = intent.getExtras();
                if (extras27 != null && extras27.containsKey("is_free_override")) {
                    og90Var = Boolean.valueOf(extras27.getBoolean("is_free_override"));
                }
                return new y0f0(og90Var, strJ5, zzyVar);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                Bundle extras28 = intent.getExtras();
                yof0 yof0Var = extras28 != null ? (yof0) jhc1.t(extras28, "lyrics_share_selector_contract_input", yof0.class) : null;
                if (yof0Var != null) {
                    return new epf0(yof0Var.a, yof0Var.b, yof0Var.c);
                }
                og90Var = extras28 != null ? extras28.getString("lyrics_share_selector_entity_uri") : null;
                if (og90Var == null) {
                    og90Var = "";
                }
                if (extras28 != null && (integerArrayList = extras28.getIntegerArrayList("lyrics_share_selector_selected_lines")) != null) {
                    listL2 = o7h.l1(integerArrayList);
                }
                return new epf0(og90Var, listL2, new bff0(a860.e("FF353535"), a860.e("FF565656"), a860.e("FFFFFFFF"), a860.e("FFCDCDCD"), a860.e("FF1ED760"), true));
            case 22:
                Bundle extras29 = intent.getExtras();
                if (extras29 == null) {
                    hhg1.n("Intent has no extras bundle");
                    return null;
                }
                Object objT3 = jhc1.t(extras29, "mediatrimmer.args", u3i0.class);
                if (objT3 == null) {
                    hhg1.n("No media trimmer arguments in bundle.");
                    return null;
                }
                u3i0 u3i0Var = (u3i0) objT3;
                if (a7i0.a[s4b1Var.c.ordinal()] == 1) {
                    Set set = s4b1.f;
                    strZ = uic.B(s4b1Var.h()).z();
                    if (strZ == null) {
                        strZ = "";
                    }
                } else {
                    Set set2 = s4b1.f;
                    strZ = uic.p(s4b1Var.h()).z();
                    if (strZ == null) {
                        strZ = "";
                    }
                }
                return new z6i0(u3i0.a(u3i0Var, strZ, (String) null, 30));
            case 23:
                String strJ6 = s4b1Var.j();
                if (strJ6 == null) {
                    strJ6 = "";
                }
                return new lli0(strJ6, u890.j(s4b1Var.n("source"), "qs") ? 2 : 1);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                String strJ7 = s4b1Var.j();
                if (strJ7 == null) {
                    strJ7 = "";
                }
                return new gmi0(strJ7);
            case 25:
                String strJ8 = s4b1Var.j();
                if (strJ8 == null) {
                    strJ8 = "";
                }
                return new umi0(strJ8);
            case 26:
                String strJ9 = s4b1Var.j();
                if (strJ9 == null) {
                    strJ9 = "";
                }
                MessageResponseToken serializableExtra = intent.getSerializableExtra("navigation_source");
                og90Var = serializableExtra instanceof wxn0 ? (wxn0) serializableExtra : null;
                if (og90Var == null) {
                    og90Var = wxn0.c;
                }
                return new kpi0(strJ9, og90Var);
            case 27:
                Bundle extras30 = intent.getExtras();
                og90Var = extras30 != null ? (MessageResponseToken) extras30.getParcelable("token") : null;
                og90Var.getClass();
                return new wem0(og90Var);
            case 28:
                Set set3 = s4b1.f;
                String strK = zjy.k(intent);
                if (strK == null) {
                    strK = "";
                }
                Bundle extras31 = intent.getExtras();
                if (extras31 == null) {
                    listL1 = listL2;
                } else {
                    listL1 = (!extras31.containsKey("multi_event_card_uris") || (stringArrayList = extras31.getStringArrayList("multi_event_card_uris")) == null) ? null : o7h.l1(stringArrayList);
                    if (listL1 == null) {
                        listL1 = listL2;
                    }
                }
                Bundle extras32 = intent.getExtras();
                if (extras32 == null) {
                    og90Var = "";
                } else {
                    og90Var = extras32.containsKey("multi_event_card_artist_uri") ? extras32.getString("multi_event_card_artist_uri") : null;
                    if (og90Var == null) {
                        og90Var = "";
                    }
                }
                return new rqm0(strK, listL1, og90Var);
            default:
                String strB = pcf.b(s4b1Var);
                if (strB != null) {
                    return new dgn0(strB, s4b1Var.l());
                }
                hhg1.n("Chat ID cannot be null");
                return null;
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case 0:
                return new b6w0(true);
            case 1:
                return new c6w0(1, true, ed5.c, 8);
            case 2:
                return new c6w0(1, true, (hd5) null, 12);
            case 3:
                return a6w0.a;
            case 4:
                return new c6w0(1, false, fd5.c, 8);
            case 5:
                return new b6w0(true);
            case 6:
                return new b6w0(true);
            case 7:
                return new b6w0(true);
            case 8:
                return new b6w0(true);
            case 9:
                return new b6w0(true);
            case 10:
                return new c6w0(1, true, (hd5) null, 12);
            case 11:
                return new c6w0(1, true, (hd5) null, 12);
            case 12:
                return new c6w0(1, true, (hd5) null, 12);
            case 13:
                return new c6w0(1, true, (hd5) null, 12);
            case 14:
                return new c6w0(1, true, (hd5) null, 12);
            case 15:
                return new c6w0(2, true, (hd5) null, 12);
            case 16:
                return new b6w0(true);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new b6w0(false);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new c6w0(3, false, (hd5) null, 12);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new c6w0(1, true, (hd5) null, 12);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new c6w0(1, true, (hd5) null, 12);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new c6w0(1, true, (hd5) null, 12);
            case 22:
                return new c6w0(1, true, (hd5) null, 12);
            case 23:
                return new c6w0(1, true, (hd5) null, 12);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new c6w0(1, true, (hd5) null, 12);
            case 25:
                return new c6w0(1, true, (hd5) null, 12);
            case 26:
                return new c6w0(1, true, (hd5) null, 12);
            case 27:
                return new c6w0(3, false, (hd5) null, 14);
            case 28:
                return new b6w0(false);
            default:
                return new c6w0(3, false, (hd5) null, 14);
        }
    }

    public final String getDescription() {
        switch (this.a) {
            case 0:
                return "Page corresponding to the Host Approval Sheet";
            case 1:
                return "Image gallery to display companion content";
            case 2:
                return "Image Picker Page";
            case 3:
                return "Page Match inbound scanning page to capture book pages";
            case 4:
                return "Music Guesser Intro";
            case 5:
                return "Page corresponding to jam invite learn more page";
            case 6:
                return "Page corresponding to Jam Invite Sheet";
            case 7:
                return "Page corresponding to the Jam Manage Participants Sheet";
            case 8:
                return "Page corresponding to the host managing jam controls for Participants";
            case 9:
                return "Page corresponding to Joining a Jam";
            case 10:
                return "Date of birth page in the kid account creation flow";
            case 11:
                return "Name page in the kid account creation flow";
            case 12:
                return "Initial parental control page with kid account creation flow";
            case 13:
                return "Pin page in the kid account creation flow";
            case 14:
                return "Consent page in the kid account transition flow";
            case 15:
                return "Page Match landing page";
            case 16:
                return "A page that displays a user's listening activity";
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return "A page that displays onboarding information for listening activity feature";
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return "Server-driven lock state page";
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return "A page to allow the Plan Manager to login to the kid account on the current device";
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return "A page that allows a Plan Manager to login as the new Managed Account on a different device";
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return "Bottom sheet for selecting lyrics lines to share";
            case 22:
                return "Media Trimmer page";
            case 23:
                return "Member details page";
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return "Update birthday page in the parental control flow";
            case 25:
                return "Update name page in the parental control flow";
            case 26:
                return "Remove a member from family plan";
            case 27:
                return "A modal message that is shown via the messaging platform";
            case 28:
                return "A bottom sheet displaying multiple concert events";
            default:
                return "A bottom sheet page to select mute duration for a chat";
        }
    }
}
