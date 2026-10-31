package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gi1 implements acr0 {
    public final /* synthetic */ byte a;
    public final Set b;

    public gi1(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = Collections.singleton(m7l.e);
                break;
            case 2:
                this.b = Collections.singleton(agc.d);
                break;
            case 3:
                this.b = Collections.singleton(dgc.d);
                break;
            case 4:
                this.b = Collections.singleton(egc.d);
                break;
            case 5:
                this.b = Collections.singleton(ed8.f);
                break;
            case 6:
                this.b = Collections.singleton(fd8.e);
                break;
            case 7:
                this.b = Collections.singleton(gwr0.e);
                break;
            case 8:
                this.b = Collections.singleton(l0a1.d);
                break;
            case 9:
                this.b = Collections.singleton(lab.d);
                break;
            case 10:
                this.b = Collections.singleton(rab.d);
                break;
            case 11:
                this.b = Collections.singleton(mab.d);
                break;
            case 12:
                this.b = Collections.singleton(ynn.d);
                break;
            case 13:
                this.b = Collections.singleton(kxu0.d);
                break;
            case 14:
                this.b = Collections.singleton(nss0.e);
                break;
            case 15:
                this.b = Collections.singleton(txu0.e);
                break;
            case 16:
                this.b = f46.S0(new b3i1[]{uxu0.e, sxu0.e});
                break;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                this.b = Collections.singleton(vxu0.e);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                this.b = Collections.singleton(wxu0.e);
                break;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                this.b = Collections.singleton(o43.d);
                break;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                this.b = Collections.singleton(m440.e);
                break;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                this.b = Collections.singleton(k6a0.d);
                break;
            case 22:
                this.b = Collections.singleton(ctf0.d);
                break;
            case 23:
                this.b = Collections.singleton(fa40.d);
                break;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                this.b = Collections.singleton(iyu0.d);
                break;
            case 25:
                this.b = Collections.singleton(ua81.e);
                break;
            case 26:
                this.b = Collections.singleton(gyu0.d);
                break;
            case 27:
                this.b = Collections.singleton(eyu0.e);
                break;
            case 28:
                this.b = Collections.singleton(pj11.e);
                break;
            case 29:
                this.b = Collections.singleton(uvm.d);
                break;
            default:
                this.b = Collections.singleton(x8r0.g);
                break;
        }
    }

    public final Class b() {
        switch (this.a) {
            case 0:
                return bi1.class;
            case 1:
                return lz5.class;
            case 2:
                return ll9.class;
            case 3:
                return io9.class;
            case 4:
                return et9.class;
            case 5:
                return wje.class;
            case 6:
                return eme.class;
            case 7:
                return x1g.class;
            case 8:
                return zlh.class;
            case 9:
                return ayk.class;
            case 10:
                return qdl.class;
            case 11:
                return wdl.class;
            case 12:
                return knn.class;
            case 13:
                return kpn.class;
            case 14:
                return rso.class;
            case 15:
                return xpv.class;
            case 16:
                return mtv.class;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return lvv.class;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return s7w.class;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return s2y.class;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return u540.class;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return cx60.class;
            case 22:
                return ubb0.class;
            case 23:
                return uwb0.class;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return h3d0.class;
            case 25:
                return pni0.class;
            case 26:
                return j9k0.class;
            case 27:
                return ghk0.class;
            case 28:
                return vum0.class;
            default:
                return qio0.class;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0175  */
    /* JADX WARN: Code duplicated, block: B:145:0x022c  */
    /* JADX WARN: Code duplicated, block: B:276:0x047b  */
    /* JADX WARN: Code duplicated, block: B:294:0x04b3  */
    public final Parcelable c(Intent intent, s4b1 s4b1Var, th61 th61Var) {
        String queryParameter;
        Long lD0;
        Long lD1;
        ed8 ed8Var;
        fd8 fd8Var;
        uzy uzyVar;
        zel zelVar;
        lbr lbrVar;
        List list;
        m440 m440Var;
        String string;
        byte b = this.a;
        aqr0 aqr0Var = aqr0.a;
        qxc0 og90Var = null;
        switch (b) {
            case 0:
                String strO = s4b1Var.o(2);
                if (strO == null) {
                    strO = "";
                }
                qxc0 qxc0VarO = s4b1Var.o(3);
                qxc0 qxc0Var = qxc0VarO != null ? qxc0VarO : "";
                String strO2 = s4b1Var.o(4);
                long jLongValue = 0;
                long jLongValue2 = (strO2 == null || (lD1 = nhc1.d0(10, strO2)) == null) ? 0L : lD1.longValue();
                String strN = s4b1Var.n("chapterOffsetMs");
                if (strN != null && (lD0 = nhc1.d0(10, strN)) != null) {
                    jLongValue = lD0.longValue();
                }
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
                return new fi1(strO, qxc0Var, jLongValue2, jLongValue, og90Var);
            case 1:
                m7l m7lVar = s4b1Var.d;
                m7l m7lVar2 = m7lVar instanceof m7l ? m7lVar : null;
                if (m7lVar2 != null) {
                    String str = m7lVar2.a;
                    qxc0 stringExtra = intent.getStringExtra("apple_tv_device_ip");
                    og90Var = new nz5(str, stringExtra != null ? stringExtra : "");
                } else {
                    ncn0.d(s4b1Var, " URI is not supported, only the Apple TV PIN entry URI is supported.");
                }
                return og90Var;
            case 2:
            case 3:
            case 4:
                return aqr0Var;
            case 5:
                String dataString = intent.getDataString();
                if (dataString != null) {
                    gd8 gd8Var = gd8.a;
                    a3i1 a3i1Var = (a3i1) gd8.d.getValue();
                    Set set = x6b1.e;
                    x6b1 x6b1VarL = oqn1.l(dataString);
                    v5b1 v5b1VarA = x6b1VarL == null ? null : a3i1Var.a(x6b1VarL);
                    if (v5b1VarA instanceof ed8) {
                        ed8Var = (ed8) v5b1VarA;
                    } else {
                        ed8Var = null;
                    }
                } else {
                    ed8Var = null;
                }
                String str2 = ed8Var != null ? ed8Var.a : null;
                if (str2 == null) {
                    str2 = "";
                }
                String strConcat = "spotify:show:".concat(str2);
                og90Var = ed8Var != null ? ed8Var.b : null;
                return new zje(strConcat, "spotify:episode:".concat(og90Var != null ? og90Var : ""));
            case 6:
                String dataString2 = intent.getDataString();
                if (dataString2 != null) {
                    gd8 gd8Var2 = gd8.a;
                    a3i1 a3i1Var2 = (a3i1) gd8.d.getValue();
                    Set set2 = x6b1.e;
                    x6b1 x6b1VarL2 = oqn1.l(dataString2);
                    v5b1 v5b1VarA2 = x6b1VarL2 == null ? null : a3i1Var2.a(x6b1VarL2);
                    if (v5b1VarA2 instanceof fd8) {
                        fd8Var = (fd8) v5b1VarA2;
                    } else {
                        fd8Var = null;
                    }
                } else {
                    fd8Var = null;
                }
                og90Var = fd8Var != null ? fd8Var.a : null;
                return new gme("spotify:show:".concat(og90Var != null ? og90Var : ""));
            case 7:
                gwr0 gwr0Var = (gwr0) s4b1Var.d;
                Bundle extras = intent.getExtras();
                String str3 = gwr0Var.a;
                String strN2 = s4b1Var.n("entryPoint");
                if (u890.j(strN2, "accountCreation")) {
                    uzyVar = uzy.b;
                } else if (u890.j(strN2, "accountTransition")) {
                    uzyVar = vzy.b;
                } else {
                    uzyVar = u890.j(strN2, "parentalConsent") ? yzy.b : xzy.b;
                }
                if (extras != null) {
                    if (!extras.containsKey("is_free_override")) {
                        extras = null;
                    }
                    if (extras != null) {
                        og90Var = Boolean.valueOf(extras.getBoolean("is_free_override"));
                    }
                }
                return new b2g(og90Var, str3, uzyVar);
            case 8:
                String strN3 = s4b1Var.n("entity_target");
                if (strN3 == null || strN3.length() <= 0) {
                    strN3 = null;
                }
                if (strN3 != null) {
                    return new hmh(strN3, th61Var.a);
                }
                hhg1.n("CommentsPageRoute requires a non-empty entity_target query parameter");
                return null;
            case 9:
                Bundle extras2 = intent.getExtras();
                if (extras2 == null) {
                    eg.m("ConfirmGenerationPage requires intent extras");
                    return null;
                }
                Object objT = jhc1.t(extras2, "bluejay_confirm_params", pxk.class);
                if (objT != null) {
                    return (pxk) objT;
                }
                eg.m("Missing ConfirmGeneration params parcelable in bundle");
                return null;
            case 10:
                Bundle extras3 = intent.getExtras();
                mdl mdlVar = extras3 != null ? (mdl) jhc1.t(extras3, "connector_apps_authentication_input", mdl.class) : null;
                if (mdlVar != null) {
                    return mdlVar;
                }
                eg.m("Connector apps authentication requires input");
                return null;
            case 11:
                Bundle extras4 = intent.getExtras();
                return (extras4 == null || (zelVar = (zel) jhc1.t(extras4, "bluejay_connector_apps_params", zel.class)) == null) ? new zel(vel.a) : zelVar;
            case 12:
                return new mnn(th61Var.a);
            case 13:
                String str4 = th61Var.a;
                qxc0 stringExtra2 = intent.getStringExtra("source_view_uri");
                return new mpn(str4, stringExtra2 != null ? stringExtra2 : "", intent.getBooleanExtra("is_from_folder", false));
            case 14:
                Bundle extras5 = intent.getExtras();
                eso esoVar = extras5 != null ? (eso) jhc1.t(extras5, "bluejay_onboarding_generate_customization_input", eso.class) : null;
                if (esoVar == null) {
                    Bundle extras6 = intent.getExtras();
                    esoVar = extras6 != null ? (dso) jhc1.t(extras6, "bluejay_onboarding_edit_customization_input", dso.class) : null;
                }
                if (esoVar == null) {
                    eg.m("Required value was null.");
                    return null;
                }
                if (esoVar.w().isEmpty()) {
                    hhg1.n("Customization plan must not be empty");
                    return null;
                }
                List listW = esoVar.w();
                ArrayList arrayList = new ArrayList(q7h.U(listW, 10));
                Iterator it = listW.iterator();
                while (it.hasNext()) {
                    arrayList.add(new jvb1(((evb1) it.next()).a));
                }
                if (o7h.j0(arrayList).size() != esoVar.w().size()) {
                    hhg1.n("Customization plan must contain unique step keys");
                    return null;
                }
                List listW2 = esoVar.w();
                if (!(listW2 instanceof Collection) || !listW2.isEmpty()) {
                    Iterator it2 = listW2.iterator();
                    while (it2.hasNext()) {
                        if (ihc1.y0(((evb1) it2.next()).a)) {
                            hhg1.n("Customization step key must not be blank");
                            return null;
                        }
                    }
                }
                List<evb1> listW3 = esoVar.w();
                if (!(listW3 instanceof Collection) || !listW3.isEmpty()) {
                    for (evb1 evb1Var : listW3) {
                        mvb1 mvb1Var = evb1Var.c;
                        if (mvb1Var != null && !evb1Var.b.K0(mvb1Var)) {
                            hhg1.n("Customization plan contains an incompatible initial result");
                            return null;
                        }
                    }
                }
                return esoVar;
            case 15:
                String strH = s4b1Var.h();
                Set set3 = s4b1.f;
                String strZ = uic.y(strH).z();
                strZ.getClass();
                String strZ2 = uic.x("spotify:internal:playlist-edit-coverart:".concat(strH)).z();
                strZ2.getClass();
                return new zpv(strZ2, strZ);
            case 16:
                Set set4 = s4b1.f;
                String strZ3 = uic.y(s4b1Var.h()).z();
                if (strZ3 == null) {
                    hhg1.n("Missing list URI");
                    return null;
                }
                String strZ4 = s4b1Var.z();
                if (strZ4 == null) {
                    hhg1.n("Missing page URI");
                    return null;
                }
                Bundle extras7 = intent.getExtras();
                g3d0 g3d0Var = extras7 != null ? (g3d0) jhc1.t(extras7, "list-sort-order", g3d0.class) : null;
                Bundle extras8 = intent.getExtras();
                if (extras8 == null) {
                    og90Var = w7x.a;
                } else {
                    ArrayList arrayListU = jhc1.u(extras8, "filters", orc0.class);
                    og90Var = arrayListU != null ? o7h.p1(arrayListU) : null;
                    if (og90Var == null) {
                        og90Var = w7x.a;
                    }
                }
                qxc0 qxc0Var2 = og90Var;
                Bundle extras9 = intent.getExtras();
                lbr lbrVar2 = jbr.a;
                if (extras9 != null && (lbrVar = (lbr) jhc1.t(extras9, "deep_link", lbr.class)) != null) {
                    lbrVar2 = lbrVar;
                }
                return new ptv(strZ4, strZ3, qxc0Var2, g3d0Var, lbrVar2);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                Set set5 = s4b1.f;
                String strZ5 = uic.y(s4b1Var.h()).z();
                strZ5.getClass();
                String strZ6 = uic.x("spotify:internal:playlist-edit-metadata:".concat(s4b1Var.h())).z();
                strZ6.getClass();
                return new nvv(strZ6, strZ5);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                String strZ7 = s4b1Var.z();
                if (strZ7 == null) {
                    strZ7 = "";
                }
                qxc0 qxc0VarN = s4b1Var.n("editor_usernames");
                try {
                    list = (List) nfa0.d.a(qxc0VarN != null ? qxc0VarN : "", new r36(chc1.a, (byte) 0));
                    break;
                } catch (Exception unused) {
                    list = z6x.a;
                }
                return new v7w(strZ7, list);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return aqr0Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                String dataString3 = intent.getDataString();
                if (dataString3 != null) {
                    a3i1 a3i1Var3 = (a3i1) n440.d.getValue();
                    Set set6 = x6b1.e;
                    x6b1 x6b1VarL3 = oqn1.l(dataString3);
                    v5b1 v5b1VarA3 = x6b1VarL3 == null ? null : a3i1Var3.a(x6b1VarL3);
                    if (v5b1VarA3 instanceof m440) {
                        m440Var = (m440) v5b1VarA3;
                    } else {
                        m440Var = null;
                    }
                } else {
                    m440Var = null;
                }
                String strN4 = s4b1Var.n("source");
                og90Var = m440Var != null ? m440Var.a : null;
                return new w540("spotify:show:".concat(og90Var != null ? og90Var : ""), u890.j(strN4, "direct_sales"));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return aqr0Var;
            case 22:
                Bundle extras10 = intent.getExtras();
                fcb0 fcb0Var = extras10 != null ? (fcb0) jhc1.t(extras10, "language_picker_parameters", fcb0.class) : null;
                if (fcb0Var != null) {
                    return fcb0Var;
                }
                hhg1.n("Missing language picker parameters");
                return null;
            case 23:
                return aqr0Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                Bundle extras11 = intent.getExtras();
                String string2 = extras11 != null ? extras11.getString("key_list_uri") : null;
                if (string2 == null) {
                    hhg1.n("Missing list URI in extras when creating list sort page");
                    return null;
                }
                String str5 = th61Var.a;
                Bundle extras12 = intent.getExtras();
                return new l3d0(string2, str5, extras12 != null ? (qxc0) jhc1.t(extras12, "key_entity", qxc0.class) : null);
            case 25:
                Bundle extras13 = intent.getExtras();
                sni0 sni0Var = extras13 != null ? (sni0) jhc1.t(extras13, "member_options_bottom_sheet_page_parameters", sni0.class) : null;
                if (sni0Var == null) {
                    String dataString4 = intent.getDataString();
                    if (dataString4 == null) {
                        dataString4 = "";
                    }
                    a3i1 a3i1Var4 = (a3i1) sa81.d.getValue();
                    Set set7 = x6b1.e;
                    x6b1 x6b1VarL4 = oqn1.l(dataString4);
                    v5b1 v5b1VarA4 = x6b1VarL4 == null ? null : a3i1Var4.a(x6b1VarL4);
                    ua81 ua81Var = v5b1VarA4 instanceof ua81 ? (ua81) v5b1VarA4 : null;
                    og90Var = ua81Var != null ? ua81Var.a : null;
                    sni0Var = new sni0(og90Var != null ? "spotify:show:".concat(og90Var) : "", "");
                }
                return sni0Var;
            case 26:
                String stringExtra3 = intent.getStringExtra("list-uri");
                if (stringExtra3 == null) {
                    hhg1.n("Missing list URI in intent");
                    return null;
                }
                Object objS = ila0.s(intent, "bottom-sheet", a9k0.class);
                if (objS != null) {
                    return new l9k0(stringExtra3, (a9k0) objS);
                }
                hhg1.n("Missing bottom sheet in intent");
                return null;
            case 27:
                eyu0 eyu0Var = s4b1Var.d;
                eyu0 eyu0Var2 = eyu0Var instanceof eyu0 ? eyu0Var : null;
                if (eyu0Var2 == null) {
                    ncn0.d(s4b1Var, " URI is not supported, only the mixing reorder URI is supported.");
                    return null;
                }
                Set set8 = s4b1.f;
                String strZ8 = uic.y(eyu0Var2.a).z();
                if (strZ8 != null) {
                    return new ihk0(eyu0Var2.d, strZ8);
                }
                bhn0.k("Unable to convert ", s4b1Var, " URI to a playlist V2 URI.");
                return null;
            case 28:
                String strZ9 = s4b1Var.z();
                if (strZ9 == null) {
                    strZ9 = "";
                }
                nj11 nj11Var = nj11.a;
                a3i1 a3i1Var5 = (a3i1) nj11.d.getValue();
                Set set9 = x6b1.e;
                x6b1 x6b1VarL5 = oqn1.l(strZ9);
                v5b1 v5b1VarA5 = x6b1VarL5 == null ? null : a3i1Var5.a(x6b1VarL5);
                pj11 pj11Var = v5b1VarA5 instanceof pj11 ? (pj11) v5b1VarA5 : null;
                og90Var = pj11Var != null ? pj11Var.a : null;
                return new xum0(strZ9, og90Var != null ? og90Var : "");
            default:
                Bundle extras14 = intent.getExtras();
                sio0 sio0Var = (extras14 == null || (string = extras14.getString("playlist_uri")) == null) ? null : new sio0(string);
                if (sio0Var != null) {
                    return sio0Var;
                }
                hhg1.n("Playlist URI is required");
                return null;
        }
    }

    public final e6w0 d() {
        switch (this.a) {
            case 0:
                return new b6w0(false);
            case 1:
                return new b6w0(true);
            case 2:
                return new b6w0(true);
            case 3:
                return new c6w0(2, false, (hd5) null, 6);
            case 4:
                return new b6w0(true);
            case 5:
                return new b6w0(true);
            case 6:
                return new b6w0(true);
            case 7:
                return new c6w0(1, true, (hd5) null, 12);
            case 8:
                return new b6w0(true);
            case 9:
                return new b6w0(true);
            case 10:
                return new c6w0(2, true, (hd5) null, 12);
            case 11:
                return new b6w0(true);
            case 12:
                return new c6w0(3, false, new gd5(2130771997, 2130771998), 8);
            case 13:
                return new b6w0(false);
            case 14:
                return new b6w0(true);
            case 15:
                return new c6w0(1, true, (hd5) null, 12);
            case 16:
                return new c6w0(1, true, (hd5) null, 12);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new b6w0(true);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new b6w0(true);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new b6w0(false);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new b6w0(true);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new c6w0(1, true, (hd5) null, 12);
            case 22:
                return new b6w0(true);
            case 23:
                return new b6w0(false);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new b6w0(false);
            case 25:
                return new b6w0(true);
            case 26:
                return new b6w0(true);
            case 27:
                return new c6w0(1, true, (hd5) null, 12);
            case 28:
                return new b6w0(false);
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
                return "Page Match add page number page";
            case 1:
                return "Apple TV pairing PIN entry";
            case 2:
                return "BYOM full chapters list bottom sheet";
            case 3:
                return "BYOM now playing view";
            case 4:
                return "BYOM volume control bottom sheet";
            case 5:
                return "Confirmation bottom sheet when tapping a chapter different from the current resume point";
            case 6:
                return "Bottom sheet listing the chapters of an audiobook, opened from the Now Playing View";
            case 7:
                return "Help a managed child log into Spotify";
            case 8:
                return "Bottom sheet showing comments for a given entity";
            case 9:
                return "Bottom sheet to confirm and launch a Bluejay episode generation";
            case 10:
                return "Launches connector app authentication in an AndroidX Auth Tab";
            case 11:
                return "Bottom sheet for managing Bluejay connector apps";
            case 12:
                return "Create menu page";
            case 13:
                return "Create Playlist Menu Page";
            case 14:
                return "Personal podcast preset customization";
            case 15:
                return "Edit Playlist Cover Art";
            case 16:
                return "Edit Playlist Items";
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return "Edit Playlist Metadata Page";
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return "Bottom sheet for picking an editor from an editorial playlist";
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return "Bottom sheet page for user to choose how much DJ talks";
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return "Bottom sheet for gated content (upsell, engagement, purchase)";
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return "Full-screen Jam host onboarding page";
            case 22:
                return "Standalone lyrics language picker bottom sheet";
            case 23:
                return "A page with more information about account linking";
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return "list sort page";
            case 25:
                return "Member options bottom sheet";
            case 26:
                return "overlap messaging";
            case 27:
                return "Page for showing suggested track order for a mixed playlist";
            case 28:
                return "Time Cap Multi-Song upsell for MFT+";
            default:
                return "Reminder that playlist notes are included when sharing";
        }
    }
}
