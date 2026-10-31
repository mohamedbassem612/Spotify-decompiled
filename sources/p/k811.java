package p;

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.usersnearby.events.proto.UsersNearbyCheckInResult;
import com.spotify.voting.proto.v2.AppVersionNotSupported;
import com.spotify.voting.proto.v2.Artwork;
import com.spotify.voting.proto.v2.GetVotingResultsPageResponse;
import com.spotify.voting.proto.v2.Gradient;
import com.spotify.voting.proto.v2.ResultsScreen;
import com.spotify.voting.proto.v2.ShareData;
import com.spotify.voting.proto.v2.Winner;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTakeUntilPredicate;
import io.reactivex.rxjava3.internal.operators.mixed.MaybeFlatMapObservable;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import org.json.JSONException;
import org.json.JSONObject;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponse;
import spotify.your_library.esperanto.proto.YourLibraryContainsResponseEntity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k811 implements Function, bu11 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public k811(ne neVar) {
        String str;
        this.a = (byte) 2;
        this.c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault());
        this.d = neVar;
        JSONObject jSONObjectD = neVar.D();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String string = null;
        try {
            Iterator<String> itKeys = jSONObjectD.keys();
            while (itKeys.hasNext()) {
                JSONObject jSONObject = jSONObjectD.getJSONObject(itKeys.next());
                b4c b4cVar = new b4c(null, 31);
                b4cVar.a = jSONObject.getString("name");
                if (jSONObject.has("value")) {
                    b4cVar.b = jSONObject.getString("value");
                }
                if (jSONObject.has("timestamp")) {
                    try {
                        b4cVar.c = ((SimpleDateFormat) this.c).parse(jSONObject.getString("timestamp"));
                    } catch (ParseException e) {
                        i1k0.n("Caught JSONException when parsing referring URL query parameter timestamp " + e.getMessage());
                    }
                }
                if (jSONObject.has("validityWindow")) {
                    b4cVar.e = jSONObject.getLong("validityWindow");
                }
                if (jSONObject.has("isDeeplink")) {
                    b4cVar.d = jSONObject.getBoolean("isDeeplink");
                } else {
                    b4cVar.d = false;
                }
                String str2 = b4cVar.a;
                if (str2 != null) {
                    linkedHashMap.put(str2, b4cVar);
                }
            }
        } catch (JSONException e2) {
            i1k0.n("Caught JSONException when deserializing JSON for referring URL query parameters " + e2.getMessage());
        }
        this.b = linkedHashMap;
        ne neVar2 = (ne) this.d;
        f4t f4tVar = f4t.b;
        b4c b4cVar2 = (b4c) linkedHashMap.get("gclid");
        if ((b4cVar2 != null ? b4cVar2.b : null) == null) {
            String strF = neVar2.F("bnc_gclid_json_object");
            SharedPreferences.Editor editor = (SharedPreferences.Editor) neVar2.b;
            if (strF.equals("bnc_no_value")) {
                str = "bnc_no_value";
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject(strF);
                    if (((Long) jSONObject2.get("bnc_gclid_expiration_date")).longValue() - System.currentTimeMillis() > 0) {
                        string = jSONObject2.getString("bnc_gclid_value");
                    } else {
                        editor.remove("bnc_gclid_json_object").apply();
                    }
                } catch (JSONException e3) {
                    editor.remove("bnc_gclid_json_object").apply();
                    e3.printStackTrace();
                }
                str = string;
            }
            if (str == null || str.equals("bnc_no_value")) {
                return;
            }
            long j = ((SharedPreferences) neVar2.a).getLong("bnc_gclid_expiration_window", 2592000000L);
            f4t f4tVar2 = f4t.b;
            b4c b4cVar3 = new b4c("gclid", str, new Date(), j);
            linkedHashMap.put("gclid", b4cVar3);
            neVar2.X(A(linkedHashMap));
            editor.remove("bnc_gclid_json_object").apply();
            i1k0.B("Updated old Gclid (" + str + ") to new BranchUrlQueryParameter (" + b4cVar3 + ')');
        }
    }

    public JSONObject A(LinkedHashMap linkedHashMap) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (b4c b4cVar : linkedHashMap.values()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("name", b4cVar.a);
                Object obj = b4cVar.b;
                if (obj == null) {
                    obj = JSONObject.NULL;
                }
                jSONObject2.put("value", obj);
                Date date = b4cVar.c;
                jSONObject2.put("timestamp", date != null ? ((SimpleDateFormat) this.c).format(date) : null);
                jSONObject2.put("isDeeplink", b4cVar.d);
                jSONObject2.put("validityWindow", b4cVar.e);
                jSONObject.put(String.valueOf(b4cVar.a), jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            i1k0.n("Caught JSONException when serializing JSON for referring URL query parameters " + e.getMessage());
            return jSONObject;
        }
    }

    public URL B() {
        Uri.Builder builderAppendPath = new Uri.Builder().scheme("https").authority((String) this.c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        xz5 xz5Var = (xz5) this.b;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(xz5Var.a).appendPath("settings");
        c54 c54Var = xz5Var.b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", c54Var.c).appendQueryParameter("display_version", c54Var.b).build().toString());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    public Object a(fxv fxvVar, onm onmVar) {
        ua21 ua21Var;
        if (onmVar instanceof ua21) {
            ua21Var = (ua21) onmVar;
            int i = ua21Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ua21Var.c = i - Integer.MIN_VALUE;
            } else {
                ua21Var = new ua21(this, onmVar);
            }
        } else {
            ua21Var = new ua21(this, onmVar);
        }
        Object objD = ua21Var.a;
        int i2 = ua21Var.c;
        if (i2 == 0) {
            hm5.M(objD);
            pp31 pp31Var = (op31) this.c;
            List listL1 = o7h.l1(fxvVar.a);
            ua21Var.c = 1;
            objD = pp31Var.d(listL1, false, ua21Var);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objD);
        }
        if (((py21) objD) instanceof ly21) {
            kt91 kt91Var = (kt91) this.d;
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131955295});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            kt91Var.k(new er91((fs91) null, "", 2131955295, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        } else {
            ((s061) this.b).a();
        }
        return rih1.a;
    }

    public Object apply(Object obj) {
        o0a o0aVar;
        byte b = this.a;
        byte b2 = 0;
        o6x o6xVar = o6x.a;
        Object obj2 = this.c;
        Object obj3 = this.d;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                wsc0 wsc0Var = (wsc0) obj;
                kby kbyVar = wsc0Var.f;
                phi0 phi0Var = (phi0) obj4;
                nf61 nf61Var = (nf61) phi0Var.c;
                String strA = kbyVar.d.a(1);
                String str = kbyVar.b;
                j23 j23Var = (c23) phi0Var.d;
                List list = wsc0Var.e;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zuc0) it.next()).c);
                }
                j23 j23Var2 = j23Var;
                return nf61Var.a(j23Var2.d((String) obj2), Boolean.valueOf(((YourLibraryContainsResponseEntity) o7h.q0(((YourLibraryContainsResponse) obj3).o())).o()), str, strA, j23Var2.b(arrayList));
            case 1:
                phi0 phi0Var2 = (phi0) obj4;
                return new MaybeFlatMapObservable(cwl1.e0(o6xVar, new j811(phi0Var2, (String) obj2, null, (byte) 1)), new k811((Object) phi0Var2, obj, obj3, b2));
            case 2:
            case 3:
            default:
                PlayerState playerState = (PlayerState) obj;
                ContextTrack contextTrack = (ContextTrack) playerState.track().b();
                im0 im0Var = (im0) obj4;
                Completable completableIgnoreElement = ((w9u0) im0Var.t).a(new l9u0()).ignoreElement();
                int iOrdinal = ((n621) obj3).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        return completableIgnoreElement.c(j2h1.D(o6xVar, new g1y(im0Var, contextTrack, playerState, (m621) obj2, (lnm) null, (byte) 2)));
                    }
                    if (iOrdinal == 2) {
                        return j2h1.D(o6xVar, new zfe(im0Var, contextTrack, playerState, (lnm) null, (byte) 10));
                    }
                    eg.o();
                    return null;
                }
                if (((jo91) im0Var.X).b()) {
                    return ((ip91) im0Var.g).j();
                }
                mzr0 mzr0Var = (mzr0) im0Var.h;
                return completableIgnoreElement.c(j2h1.D((q8n) mzr0Var.d, new p651(mzr0Var, contextTrack.uri(), playerState.contextUri(), contextTrack.uid(), (lnm) null, (byte) 17)));
            case 4:
                PlayerState playerState2 = (PlayerState) obj;
                tqw tqwVar = (tqw) obj2;
                rig0 rig0Var = ((ni11) obj4).c;
                ri11 ri11Var = (ri11) obj3;
                if (!(rig0Var instanceof rig0)) {
                    Set set = ri11.P0;
                    return new CompletableFromAction(new wf0(ri11Var, playerState2, tqwVar, (byte) 17));
                }
                int i = rig0Var.a;
                Set set2 = ri11.P0;
                return new CompletableFromAction(new afe(ri11Var, i, tqwVar, (byte) 2));
            case 5:
                return new CompletableFromAction(new lig((tig0) obj, (ti11) obj4, (tqw) obj3, (PlayerState) obj2, (byte) 5));
            case 6:
                PlayerState playerState3 = (PlayerState) obj;
                tqw tqwVar2 = (tqw) obj2;
                gj11 gj11Var = (gj11) obj3;
                rig0 rig0Var2 = ((zi11) obj4).d;
                if (rig0Var2 instanceof rig0) {
                    int i2 = rig0Var2.a;
                    Set set3 = gj11.X;
                    return new CompletableFromAction(new afe(gj11Var, i2, tqwVar2, (byte) 3));
                }
                if (!rig0Var2.equals(sig0.a)) {
                    eg.o();
                    return null;
                }
                Set set4 = gj11.X;
                rh11 rh11Var = gj11Var.e;
                if (!rh11Var.a() && ((Number) playerState3.position(gj11Var.c.b()).e(3000L)).longValue() < 3000) {
                    b2 = 1;
                } else if (rh11Var.a() || rh11Var.e()) {
                    b2 = 2;
                }
                if (b2 == 0) {
                    return CompletableEmpty.a;
                }
                int iC = l1d.C(b2);
                if (iC == 0) {
                    o0aVar = o0a.PREV_TRACK;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    o0aVar = o0a.RESTART_TRACK;
                }
                return new CompletableFromAction(new lig(gj11Var, playerState3, o0aVar, tqwVar2, (byte) 6));
        }
    }

    public jhm b(String str, int i, boolean z) {
        return new jhm("remote_downloads_manage", z ? umx.c : tmx.c, (fhm) null, Integer.valueOf(z ? 2131959448 : 2131959450), (String) null, false, i != 0 ? new tm81(i, 6, "remote_downloads_manage", (iu30) null, false) : null, new ihm(new ygm(2), z ? hhm.b : hhm.a, new ghm(i021.d, i021.e), new nt01(str, this, (byte) 13)), 116);
    }

    public void c() {
        ((CompositeDisposable) this.c).g();
    }

    public xu30 d() {
        return new rt11((n6r0) this.b, (String) this.c, (byte) 1);
    }

    public h3h1 e(String str) {
        return new h3h1(new cu11(this, str, (byte) 0));
    }

    public h3h1 f(String str) {
        return new h3h1(new cu11(this, str, (byte) 4));
    }

    public w7h1 g(n8h1 n8h1Var, unb1 unb1Var, String str) {
        return ((paz) this.d).c(((u3l0) n8h1Var).b(), unb1Var, str);
    }

    public h3h1 h(String str) {
        return new h3h1(new cu11(this, str, (byte) 1));
    }

    public h3h1 j(String str) {
        return new h3h1(new cu11(this, str, (byte) 5));
    }

    public h3h1 k(String str) {
        return new h3h1(new cu11(this, str, (byte) 3));
    }

    public Object l(Map map, ciw0 ciw0Var, ck01 ck01Var, x321 x321Var) {
        Object objY = fn31.Y((o8n) this.d, new ciw0(this, map, ciw0Var, ck01Var, (lnm) null), x321Var);
        return objY == d9n.a ? objY : rih1.a;
    }

    public JSONObject m(u861 u861Var) throws JSONException {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ne neVar = (ne) this.d;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.b;
        JSONObject jSONObject = new JSONObject();
        if ((u861Var instanceof s3c) || (u861Var instanceof a961)) {
            f4t f4tVar = f4t.b;
            b4c b4cVar = (b4c) linkedHashMap2.get("gclid");
            if (b4cVar != null && (str = b4cVar.b) != null && !str.equals("bnc_no_value")) {
                long time = new Date().getTime();
                Date date = b4cVar.c;
                Long lValueOf = date != null ? Long.valueOf(date.getTime()) : null;
                long j = b4cVar.e;
                long j2 = 1000 * j;
                if (lValueOf != null) {
                    if (j == 0 || time < lValueOf.longValue() + j2) {
                        jSONObject.put("gclid", b4cVar.b);
                        if (u861Var instanceof a961) {
                            jSONObject.put("is_deeplink_gclid", b4cVar.d);
                        }
                        b4cVar.d = false;
                        neVar.X(A(linkedHashMap2));
                    } else {
                        linkedHashMap2.remove("gclid");
                        neVar.X(A(linkedHashMap2));
                    }
                }
            }
        }
        if (jSONObject.length() > 0) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject.get(next));
            }
        }
        return new JSONObject(linkedHashMap);
    }

    public h3h1 q() {
        return new h3h1(ss11.V0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object r(onm onmVar) {
        wn21 wn21Var;
        t2j0 t2j0Var = ((cof0) this.c).a;
        if (onmVar instanceof wn21) {
            wn21Var = (wn21) onmVar;
            int i = wn21Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                wn21Var.c = i - Integer.MIN_VALUE;
            } else {
                wn21Var = new wn21(this, onmVar);
            }
        } else {
            wn21Var = new wn21(this, onmVar);
        }
        Object objY = wn21Var.a;
        int i2 = wn21Var.c;
        if (i2 == 0) {
            hm5.M(objY);
            geo0 geo0Var = geo0.b;
            ic01 ic01Var = new ic01(this, (lnm) null, (byte) 13);
            wn21Var.c = 1;
            objY = fn31.Y(geo0Var, ic01Var, wn21Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        auf aufVar = (auf) objY;
        vtf vtfVar = (vtf) this.d;
        String str = vtfVar.b;
        String str2 = vtfVar.c;
        if (aufVar instanceof ztf) {
            oki1 oki1VarN = UsersNearbyCheckInResult.n();
            oki1VarN.s(str2);
            oki1VarN.n();
            oki1VarN.t(str);
            t2j0Var.a(oki1VarN.build());
            return juf.a;
        }
        if (!(aufVar instanceof xtf)) {
            eg.o();
            return null;
        }
        xtf xtfVar = (xtf) aufVar;
        boolean z = xtfVar instanceof ytf;
        String str3 = "Unknown";
        if (z) {
            ytf ytfVar = (ytf) xtfVar;
            int i3 = ytfVar.a;
            String str4 = ytfVar.b;
            str3 = i3 + ":" + ((Object) (str4.length() != 0 ? str4 : "Unknown"));
        } else {
            if (!(xtfVar instanceof wtf)) {
                eg.o();
                return null;
            }
            String strR = rc11.a.b(((wtf) xtfVar).a.getClass()).r();
            if (strR != null) {
                str3 = strR;
            }
        }
        String str5 = "client";
        if (z) {
            int i4 = ((ytf) xtfVar).a;
            if (500 <= i4 && i4 < 600) {
                str5 = "server";
            }
        } else if (!(xtfVar instanceof wtf)) {
            eg.o();
            return null;
        }
        oki1 oki1VarN2 = UsersNearbyCheckInResult.n();
        oki1VarN2.s(str2);
        oki1VarN2.t(str);
        oki1VarN2.r(str3);
        oki1VarN2.q(str5);
        t2j0Var.a(oki1VarN2.build());
        return iuf.a;
    }

    public w7h1 s(n8h1 n8h1Var, unb1 unb1Var, String str) {
        return ((paz) this.d).a(((u3l0) n8h1Var).b(), unb1Var, str);
    }

    public h3h1 t(String str) {
        return new h3h1(new cu11(this, str, (byte) 2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object u(String str, String str2, onm onmVar) {
        r431 r431Var;
        Object z531Var;
        lnm lnmVar;
        if (onmVar instanceof r431) {
            r431Var = (r431) onmVar;
            int i = r431Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r431Var.c = i - Integer.MIN_VALUE;
            } else {
                r431Var = new r431(this, onmVar);
            }
        } else {
            r431Var = new r431(this, onmVar);
        }
        Object objD = r431Var.a;
        int i2 = r431Var.c;
        lnm lnmVar2 = null;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objD);
            jxk1 jxk1Var = (jxk1) this.b;
            r431Var.c = 1;
            objD = jxk1Var.d(str, str2, r431Var);
            if (objD != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objD);
                return objD;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objD);
        GetVotingResultsPageResponse getVotingResultsPageResponse = (GetVotingResultsPageResponse) objD;
        int iO = getVotingResultsPageResponse.o();
        if ((iO == 0 ? -1 : v431.a[l1d.C(iO)]) == 1) {
            AppVersionNotSupported appVersionNotSupportedN = getVotingResultsPageResponse.n();
            z531Var = new y531(new yc30(appVersionNotSupportedN.getMinVersion(), appVersionNotSupportedN.getTitle(), appVersionNotSupportedN.getSubtitle(), appVersionNotSupportedN.o(), appVersionNotSupportedN.p()));
            lnmVar = null;
        } else {
            String str3 = "null";
            if (getVotingResultsPageResponse.o() != 1) {
                int iO2 = getVotingResultsPageResponse.o();
                if (iO2 == 1) {
                    str3 = "RESULTS_PAGE";
                } else if (iO2 == 2) {
                    str3 = "APP_VERSION_NOT_SUPPORTED";
                } else if (iO2 == 3) {
                    str3 = "RESPONSE_NOT_SET";
                }
                hhg1.f("Unexpected GetVotingResultsPage response case: ".concat(str3));
                return null;
            }
            ResultsScreen resultsScreenO = getVotingResultsPageResponse.p().o();
            h290<Winner> h290VarT = resultsScreenO.t();
            ArrayList arrayList = new ArrayList(q7h.U(h290VarT, 10));
            for (Winner winner : h290VarT) {
                winner.getClass();
                lnm imageUrl = winner.getImageUrl();
                imageUrl.getClass();
                lnm lnmVar3 = !ihc1.y0(imageUrl) ? imageUrl : lnmVar2;
                String strP = winner.p();
                String strQ = winner.q();
                String strO = winner.o();
                Gradient gradientN = winner.n();
                f531 f531Var = new f531(gradientN.p(), gradientN.o());
                Artwork artworkS = winner.s();
                q431 q431VarE = aq8.E(artworkS);
                if (q431VarE == null) {
                    lnm lnmVar4 = lnmVar2;
                    int iQ = artworkS.q();
                    if (iQ == 1) {
                        str3 = "LOTTIE_ANIMATED";
                    } else if (iQ == 2) {
                        str3 = "LOTTIE_STATIC";
                    } else if (iQ == 3) {
                        str3 = "TYPE_NOT_SET";
                    }
                    hhg1.f("Unsupported artwork type or no URL: ".concat(str3));
                    return lnmVar4;
                }
                ShareData shareDataR = winner.r();
                arrayList.add(new h631(lnmVar3, strP, strQ, strO, f531Var, q431VarE, new c631(shareDataR.getMessageText(), shareDataR.getImageUrl(), shareDataR.p(), shareDataR.n())));
                lnmVar2 = lnmVar2;
            }
            lnmVar = lnmVar2;
            if (arrayList.isEmpty()) {
                hhg1.n("GetVotingResultsPage returned no winners");
                return lnmVar;
            }
            String title = resultsScreenO.getTitle();
            String subtitle = resultsScreenO.getSubtitle();
            lnm lnmVarN = resultsScreenO.n();
            if (!resultsScreenO.u()) {
                lnmVarN = lnmVar;
            }
            lnm lnmVarE = lnmVarN != null ? aq8.E(lnmVarN) : lnmVar;
            lnm lnmVarP = resultsScreenO.p();
            lnmVarP.getClass();
            z531Var = new z531(new n531(title, subtitle, lnmVarE, arrayList, new b631(resultsScreenO.s(), resultsScreenO.r(), resultsScreenO.q()), !ihc1.y0(lnmVarP) ? lnmVarP : lnmVar, null));
        }
        if (!(z531Var instanceof z531)) {
            return z531Var;
        }
        hgo0 hgo0Var = new hgo0(this, (z531) z531Var, lnmVar, (byte) 14);
        r431Var.c = 2;
        Object objS = smo1.s(hgo0Var, r431Var);
        return objS == d9nVar ? d9nVar : objS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object v(String str, onm onmVar) {
        ds21 ds21Var;
        if (onmVar instanceof ds21) {
            ds21Var = (ds21) onmVar;
            int i = ds21Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ds21Var.d = i - Integer.MIN_VALUE;
            } else {
                ds21Var = new ds21(this, onmVar);
            }
        } else {
            ds21Var = new ds21(this, onmVar);
        }
        Object objI = ds21Var.b;
        int i2 = ds21Var.d;
        if (i2 == 0) {
            hm5.M(objI);
            h5y0 h5y0Var = new h5y0(o4p1.r(yoi1.g(((uu00) this.b).b(new oi("reserved-share", false, new sc21(str, (byte) 6)))), (q8n) this.c), (byte) 24);
            ds21Var.a = str;
            ds21Var.d = 1;
            objI = b5p1.i(h5y0Var, ds21Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = ds21Var.a;
            hm5.M(objI);
        }
        return ((uv00) objI).a(jek.class, str).b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object w(String str, onm onmVar) {
        s431 s431Var;
        if (onmVar instanceof s431) {
            s431Var = (s431) onmVar;
            int i = s431Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                s431Var.d = i - Integer.MIN_VALUE;
            } else {
                s431Var = new s431(this, onmVar);
            }
        } else {
            s431Var = new s431(this, onmVar);
        }
        Object objG = s431Var.b;
        int i2 = s431Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objG);
                ob01 ob01Var = new ob01(this, str, (lnm) null, (byte) 5);
                s431Var.a = str;
                s431Var.d = 1;
                objG = aq8.G(1, ob01Var, s431Var);
                d9n d9nVar = d9n.a;
                if (objG == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = s431Var.a;
                hm5.M(objG);
            }
            return (Bitmap) objG;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "VotingResults: winner image failed to load, skipping it: %s", new Object[]{str});
            return null;
        }
    }

    public void x(String str, String str2) {
        ((CompositeDisposable) this.c).b(new FlowableTakeUntilPredicate(((Flowable) this.d).J(new qpp0((byte) 25)).t(Functions.a), new nkx0((byte) 21)).subscribe(new v321(this, str, str2)));
    }

    public void y(String str) {
        ne neVar = (ne) this.d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        if (n3c.h().k.a) {
            i1k0.m("Skipping referring URL query parameter parsing due to disabled tracking.");
            return;
        }
        Uri uri = Uri.parse(str);
        if (!uri.isHierarchical()) {
            i1k0.m("Skipping referring URL query parameter parsing because the URI is not hierarchical. URI: ".concat(str));
            return;
        }
        for (String str2 : uri.getQueryParameterNames()) {
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            String queryParameter = uri.getQueryParameter(str2);
            i1k0.B("Found URL Query Parameter - Key: " + lowerCase + ", Value: " + queryParameter);
            String lowerCase2 = lowerCase.toLowerCase(locale);
            f4t f4tVar = f4t.b;
            if (Collections.singletonList("gclid").contains(lowerCase2)) {
                b4c b4cVar = (b4c) linkedHashMap.get(lowerCase);
                if (b4cVar == null) {
                    b4cVar = new b4c(lowerCase, 30);
                }
                b4cVar.b = queryParameter;
                b4cVar.c = new Date();
                b4cVar.d = true;
                if (b4cVar.e == 0) {
                    b4cVar.e = lowerCase.equals("gclid") ? ((SharedPreferences) neVar.a).getLong("bnc_gclid_expiration_window", 2592000000L) / 1000 : 0L;
                }
                linkedHashMap.put(lowerCase, b4cVar);
            }
        }
        neVar.X(A(linkedHashMap));
        i1k0.B("Current referringURLQueryParameters: " + neVar.D());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object z(q431 q431Var, onm onmVar) {
        t431 t431Var;
        if (onmVar instanceof t431) {
            t431Var = (t431) onmVar;
            int i = t431Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                t431Var.d = i - Integer.MIN_VALUE;
            } else {
                t431Var = new t431(this, onmVar);
            }
        } else {
            t431Var = new t431(this, onmVar);
        }
        Object obj = t431Var.b;
        int i2 = t431Var.d;
        boolean z = true;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                ob01 ob01Var = new ob01(this, q431Var, (lnm) null, (byte) 6);
                t431Var.a = q431Var;
                t431Var.d = 1;
                Object objG = aq8.G(1, ob01Var, t431Var);
                q431Var = d9n.a;
                if (objG == q431Var) {
                    return q431Var;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                q431Var = t431Var.a;
                hm5.M(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "VotingResults: confetti failed to load, skipping it: %s", new Object[]{q431Var.getUrl()});
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public /* synthetic */ k811(Object obj, Object obj2, String str, byte b) {
        this.a = b;
        this.b = obj;
        this.c = str;
        this.d = obj2;
    }

    public /* synthetic */ k811(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = obj3;
    }

    public k811(uyp uypVar, h7l0 h7l0Var) {
        this.a = (byte) 18;
        this.b = uypVar;
        this.d = h7l0Var;
        this.c = new idd1(new g521(this, (byte) 2));
    }

    public k811(vpp0 vpp0Var, pcl pclVar) {
        this.a = (byte) 14;
        this.b = vpp0Var;
        this.d = pclVar;
        this.c = new idd1(n521.c);
    }

    public k811(uyp uypVar, h7l0 h7l0Var, byte b) {
        this.a = (byte) 20;
        this.b = uypVar;
        this.d = h7l0Var;
        this.c = new idd1(new g521(this, (byte) 4));
    }

    public k811(Flowable flowable, t2j0 t2j0Var) {
        this.a = (byte) 12;
        this.c = new CompositeDisposable();
        this.b = t2j0Var;
        this.d = flowable;
    }

    public k811(xz5 xz5Var, o8n o8nVar) {
        this.a = (byte) 13;
        this.b = xz5Var;
        this.d = o8nVar;
        this.c = "firebase-settings.crashlytics.com";
    }
}
