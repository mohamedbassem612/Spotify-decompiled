package p;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import com.google.protobuf.h;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.messages.UbiProd1Impression;
import com.spotify.pending_events.esperanto.proto.AddPendingEventResponse;
import com.spotify.player.model.ContextTrack;
import com.spotify.promptedplaylists.ucpapiimpl.UpdatePromptPayload;
import com.spotify.unboxinghub.api.v1.proto.BenefitsHeader;
import com.spotify.unboxinghub.api.v1.proto.BenefitsHero;
import com.spotify.unboxinghub.api.v1.proto.Card;
import com.spotify.unboxinghub.api.v1.proto.GetMainHubPageRequest;
import com.spotify.unboxinghub.api.v1.proto.GetMainHubPageResponse;
import com.spotify.unboxinghub.api.v1.proto.GridItem;
import com.spotify.unboxinghub.api.v1.proto.HighlightedLabel;
import com.spotify.unboxinghub.api.v1.proto.Media;
import com.spotify.unboxinghub.api.v1.proto.ProgressTracker;
import com.spotify.unboxinghub.api.v1.proto.Section;
import com.spotify.widgets.widgetstate.CurrentTrackMetadata;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ffe1 implements ix30, cy81, Function, BiFunction {
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;

    public ffe1(byte b) {
        this.a = b;
        switch (b) {
            case 16:
                this.b = new ConcurrentHashMap();
                this.c = new AtomicInteger(0);
                break;
        }
    }

    public static e0h1 d(List list) {
        return list.isEmpty() ? e0h1.c : new e0h1(list);
    }

    public Object a(String str, String str2, boolean z, s3w s3wVar) {
        uuh1 uuh1VarN = UpdatePromptPayload.n();
        uuh1VarN.r(z ? znh1.UPDATE_ACTION_UPDATE_AND_GENERATE : znh1.UPDATE_ACTION_UPDATE_ONLY);
        uuh1VarN.n(str2);
        return r(str, "UPDATE_PROMPT", (UpdatePromptPayload) uuh1VarN.build(), s3wVar);
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 4:
                Map map = (Map) obj;
                hce1 hce1Var = (hce1) this.b;
                vnd1 vnd1Var = (vnd1) hce1Var.d;
                icf1 icf1Var = (icf1) this.c;
                xkg0 xkg0Var = new xkg0();
                if (((di4) vnd1Var.b).K()) {
                    xkg0Var.put("x-search-request-id", icf1Var.b);
                    xkg0Var.put("x-search-timestamp", String.valueOf(((yqg) vnd1Var.c).b()));
                }
                return ((vi11) hce1Var.b).Q(map, xkg0Var.b()).doAfterSuccess(new z0u0(hce1Var, icf1Var, (byte) 25)).doOnError(new z2a1(icf1Var, (byte) 16));
            case 5:
            case 7:
            case 10:
            default:
                AddPendingEventResponse addPendingEventResponse = (AddPendingEventResponse) obj;
                return addPendingEventResponse.o() ? Single.just(new b9h1((z8h1) this.b, (UbiProd1Impression) this.c, new a9h1(addPendingEventResponse.p(), addPendingEventResponse.q()))) : Single.error(new c9h1("Can't add pending event", addPendingEventResponse.n()));
            case 6:
                Boolean bool = (Boolean) obj;
                String str = (String) this.c;
                rsf1 rsf1Var = (rsf1) this.b;
                String strF = rsf1Var.c0.h ? fno1.f(str) : null;
                return rsf1Var.u.b(new oi("track_menu_builder", false, new e971((Object) str, (Object) strF, (Object) rsf1Var, (Object) bool, (byte) 20))).filter(y6x0.S0).map(new xot(str, strF, (byte) 8));
            case 8:
                return new hvf1((ContextTrack) ((spq0) this.b).h(), (Integer) obj, ((Integer) this.c).intValue());
            case 9:
                s4b1 s4b1Var = (s4b1) this.c;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                qwf1 qwf1Var = (qwf1) this.b;
                if (zBooleanValue) {
                    return qwf1Var.e(s4b1Var);
                }
                Single singleFlatMap = rqt0.F(qwf1Var.Y, new b0f1(qwf1Var, (lnm) null, (byte) 5)).flatMap(new pwf1(s4b1Var, qwf1Var));
                singleFlatMap.getClass();
                return singleFlatMap;
            case 11:
                Boolean bool2 = (Boolean) obj;
                kl1 kl1Var = (kl1) this.c;
                w4g1 w4g1Var = (w4g1) this.b;
                boolean z = w4g1Var.d;
                return ((a6z) kl1Var.d).k(w4g1Var.b, (String) null, (Map) null, (lik1) kl1Var.b, new r6z((String) null, !z, false, false, bool2.booleanValue() || z, false, true, false, false, !z, false, false, bool2.booleanValue(), kl1Var.a, false, !bool2.booleanValue(), (ugo0) null, (c821) null, false, false, false, false, (ok51) null, false, (String) null, false, (p860) null, 1073695781));
        }
    }

    public xok0 b(String str) {
        return new xok0(str, ((edr0) this.c).b(of61.a));
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Comparable c(onm onmVar) {
        eog1 eog1Var;
        l420 l420Var;
        Uri uri;
        if (onmVar instanceof eog1) {
            eog1Var = (eog1) onmVar;
            int i = eog1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                eog1Var.d = i - Integer.MIN_VALUE;
            } else {
                eog1Var = new eog1(this, onmVar);
            }
        } else {
            eog1Var = new eog1(this, onmVar);
        }
        Object objA = eog1Var.b;
        int i2 = eog1Var.d;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objA);
            o771 o771Var = (o771) this.c;
            eog1Var.d = 1;
            objA = n771.a(o771Var, ".png", eog1Var);
            if (objA != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 == 1) {
            hm5.M(objA);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l420Var = eog1Var.a;
            hm5.M(objA);
        }
        uri = (Uri) objA;
        if (uri == null) {
            l420Var.deleteOnExit();
        }
        return uri;
        l420 l420Var2 = (l420) objA;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(0);
        gya gyaVar = (gya) this.b;
        eog1Var.a = l420Var2;
        eog1Var.d = 2;
        Object objA2 = eya.a(gyaVar, bitmapCreateBitmap, l420Var2, eog1Var);
        if (objA2 != d9nVar) {
            objA = objA2;
            l420Var = l420Var2;
            uri = (Uri) objA;
            if (uri == null) {
                l420Var.deleteOnExit();
            }
            return uri;
        }
        return d9nVar;
    }

    public tdl0 e() {
        hsg1 hsg1Var = ((fug1) this.c).a;
        if (u890.j(hsg1Var, asg1.d)) {
            return new tdl0(2);
        }
        if (u890.j(hsg1Var, bsg1.d)) {
            return new tdl0(3);
        }
        if (u890.j(hsg1Var, dsg1.d)) {
            return new tdl0(5);
        }
        if (u890.j(hsg1Var, esg1.d)) {
            return new tdl0(6);
        }
        if (u890.j(hsg1Var, csg1.d)) {
            return new tdl0(4);
        }
        if (u890.j(hsg1Var, fsg1.d)) {
            return new tdl0(7);
        }
        if (u890.j(hsg1Var, gsg1.d)) {
            return new tdl0(8);
        }
        eg.o();
        return null;
    }

    public int f(String str) {
        int andIncrement;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Integer num = (Integer) concurrentHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(str);
                if (num2 != null) {
                    andIncrement = num2.intValue();
                } else {
                    andIncrement = ((AtomicInteger) this.c).getAndIncrement();
                    concurrentHashMap.putIfAbsent(str, Integer.valueOf(andIncrement));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return andIncrement;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object g(boolean z, onm onmVar) {
        rgh1 rgh1Var;
        Iterator it;
        pc60 pc60Var;
        if (onmVar instanceof rgh1) {
            rgh1Var = (rgh1) onmVar;
            int i = rgh1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rgh1Var.c = i - Integer.MIN_VALUE;
            } else {
                rgh1Var = new rgh1(this, onmVar);
            }
        } else {
            rgh1Var = new rgh1(this, onmVar);
        }
        Object objB = rgh1Var.a;
        int i2 = rgh1Var.c;
        String str = null;
        if (i2 == 0) {
            hm5.M(objB);
            go40 go40VarN = GetMainHubPageRequest.n();
            go40VarN.n();
            GetMainHubPageRequest getMainHubPageRequestBuild = go40VarN.build();
            sgh1 sgh1Var = z ? (sgh1) this.c : (sgh1) this.b;
            getMainHubPageRequestBuild.getClass();
            rgh1Var.c = 1;
            objB = sgh1Var.b(getMainHubPageRequestBuild, rgh1Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objB);
        }
        GetMainHubPageResponse getMainHubPageResponse = (GetMainHubPageResponse) objB;
        BenefitsHeader benefitsHeaderO = getMainHubPageResponse.n().o();
        s370 s370Var = new s370(benefitsHeaderO.getTitle(), benefitsHeaderO.o());
        ArrayList arrayList = new ArrayList();
        Iterator it2 = getMainHubPageResponse.n().p().iterator();
        while (it2.hasNext()) {
            Section section = (Section) it2.next();
            if (section.u()) {
                BenefitsHero benefitsHeroP = section.p();
                String strR = benefitsHeroP.r();
                String title = benefitsHeroP.getTitle();
                String subtitle = benefitsHeroP.getSubtitle();
                Media mediaP = benefitsHeroP.p();
                arrayList.add(new w370(strR, title, subtitle, new yfh0(mediaP.n(), mediaP.p()), benefitsHeroP.t(), benefitsHeroP.u() ? benefitsHeroP.q() : str, benefitsHeroP.getId(), benefitsHeroP.n(), benefitsHeroP.v() ? new fsd1(benefitsHeroP.s().n(), benefitsHeroP.s().p()) : str));
            } else {
                if (section.s()) {
                    arrayList.add(new y370(section.n().getTitle()));
                    h290<Card> h290VarN = section.n().n();
                    ArrayList arrayList2 = new ArrayList(q7h.U(h290VarN, 10));
                    for (Card card : h290VarN) {
                        arrayList2.add(new q370(card.getTitle(), card.getDescription(), card.o(), card.getId(), card.n()));
                    }
                    arrayList.add(new t370(mqo1.A(arrayList2)));
                } else if (section.t()) {
                    arrayList.add(new y370(section.o().getTitle()));
                    h290<GridItem> h290VarO = section.o().o();
                    ArrayList arrayList3 = new ArrayList(q7h.U(h290VarO, 10));
                    for (GridItem gridItem : h290VarO) {
                        gridItem.getClass();
                        String title2 = gridItem.getTitle();
                        String strP = gridItem.p();
                        String strO = gridItem.o();
                        String strQ = gridItem.q();
                        String strT = gridItem.t();
                        String strS = gridItem.s();
                        String id = gridItem.getId();
                        boolean zN = gridItem.n();
                        if (gridItem.u()) {
                            HighlightedLabel highlightedLabelR = gridItem.r();
                            pc60Var = new pc60(highlightedLabelR.p(), highlightedLabelR.n());
                        } else {
                            pc60Var = null;
                        }
                        arrayList3.add(new r370(title2, strP, strO, strQ, strT, strS, id, zN, pc60Var));
                        it2 = it2;
                    }
                    it = it2;
                    arrayList.add(new u370(mqo1.A(arrayList3)));
                } else {
                    it = it2;
                    if (section.v()) {
                        arrayList.add(new v370(section.q().p(), section.q().n()));
                    } else if (section.w()) {
                        ProgressTracker progressTrackerR = section.r();
                        arrayList.add(new x370(progressTrackerR.getTitle(), progressTrackerR.getSubtitle(), new fsd1(progressTrackerR.o().n(), progressTrackerR.o().p())));
                    }
                }
                it2 = it;
                str = null;
            }
            it = it2;
            it2 = it;
            str = null;
        }
        return new a470(s370Var, mqo1.A(arrayList));
    }

    public Shader h() {
        return (Shader) this.c;
    }

    public void i(String str) {
        if (((izj) this.b).c(Uri.parse(str))) {
            return;
        }
        dlg1 dlg1Var = (dlg1) this.c;
        zhh1 zhh1Var = (zhh1) ((bih1) dlg1Var.a).c;
        gj5 gj5Var = (gj5) dlg1Var.b;
        zxf zxfVar = (zxf) dlg1Var.c;
        Uri uri = Uri.parse(str);
        xxf xxfVar = xxf.b;
        if (zxfVar.equals(xxfVar)) {
            n57.e("CheckoutSource must not be " + xxfVar);
        }
        x8g x8gVar = zhh1Var.a;
        v5g v5gVarB = x8gVar.c(uri) ? x8gVar.b(zxfVar, uri) : null;
        gj5Var.startActivity(v5gVarB != null ? x8g.a(gj5Var, v5gVarB) : zhh1Var.b.a(gj5Var, new lyf(zxfVar, new jyf(gj5Var.getString(2131953829)), uri)));
    }

    public void j(xzn1 xzn1Var) {
        fpl0 fpl0Var = (fpl0) this.c;
        ynb0 ynb0Var = (ynb0) this.b;
        boolean zEquals = xzn1Var.equals(osg0.c);
        b7x b7xVar = b7x.a;
        if (zEquals) {
            i8h1 i8h1Var = (i8h1) ynb0Var.get();
            fpl0Var.getClass();
            x6h1 x6h1VarC = fpl0Var.b.c();
            x6h1VarC.i.add(new a7h1("accept_button", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = false;
            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), fpl0Var.a, System.currentTimeMillis()), (xj61) null);
            return;
        }
        if (xzn1Var.equals(osg0.d)) {
            ((i8h1) ynb0Var.get()).f(fpl0Var.e(), (Set) null);
            return;
        }
        if (!xzn1Var.equals(osg0.e)) {
            eg.o();
            return;
        }
        i8h1 i8h1Var2 = (i8h1) ynb0Var.get();
        fpl0Var.getClass();
        x6h1 x6h1VarC2 = fpl0Var.b.c();
        x6h1VarC2.i.add(new a7h1("reject_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = false;
        i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), fpl0Var.a, System.currentTimeMillis()), (xj61) null);
    }

    public void k() {
        i8h1 i8h1Var = (i8h1) this.b;
        x6h1 x6h1VarC = ((bqk0) this.c).b.c();
        x6h1VarC.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public void l() {
        i8h1 i8h1Var = (i8h1) this.b;
        bqk0 bqk0Var = (bqk0) this.c;
        x6h1 x6h1VarC = bqk0Var.b.c();
        x6h1VarC.i.add(new a7h1("content", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("empty_state_view", (String) null, (Integer) null, (String) null, ""));
        x6h1VarC2.j = true;
        y6h1 y6h1VarA = x6h1VarC2.a();
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = y6h1VarA;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        k7h1Var.e = bqk0Var.c;
        i8h1Var.f(k7h1Var.a(), (Set) null);
    }

    public tv80 m(String str) {
        i8h1 i8h1Var = (i8h1) ((z1p) this.c).get();
        x6h1 x6h1VarC = ((yok0) this.b).b.c();
        x6h1VarC.i.add(new a7h1("help_row", (String) null, (Integer) null, str, (String) null));
        x6h1VarC.j = false;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    public tv80 n(iby ibyVar, String str) {
        i8h1 i8h1Var = (i8h1) this.b;
        g5l0 g5l0Var = (g5l0) this.c;
        x6h1 x6h1VarC = g5l0Var.c.c();
        x6h1VarC.i.add(new a7h1("related_content", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        y6h1 y6h1VarA = x6h1VarC.a();
        String str2 = ibyVar.b;
        x6h1 x6h1VarC2 = y6h1VarA.c();
        x6h1VarC2.i.add(new a7h1("row", (String) null, (Integer) null, str2, (String) null));
        x6h1VarC2.j = true;
        return i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC2.a(), g5l0Var.b, System.currentTimeMillis()), (xj61) null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c3 A[PHI: r0
      0x00c3: PHI (r0v9 java.lang.String) = (r0v8 java.lang.String), (r0v5 java.lang.String) binds: [B:56:0x00d1, B:51:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    public CurrentTrackMetadata o(ContextTrack contextTrack, b7g1 b7g1Var, String str, String str2, String str3) {
        String str4;
        String str5;
        int i;
        a42 a42Var = (a42) this.b;
        String strY0 = null;
        a7g1 a7g1Var = b7g1Var instanceof a7g1 ? (a7g1) b7g1Var : null;
        String strY1 = "";
        if (str.length() == 0) {
            str4 = "";
        } else {
            String string = ((aai0) a42Var.b).e(Uri.parse(str), 2, 2).toString();
            string.getClass();
            str4 = string;
        }
        String strF0 = a7g1Var != null ? a7g1Var.a.a : null;
        if (strF0 == null) {
            strF0 = "";
        }
        if (strF0.length() == 0 && (strF0 = l4o1.f0(contextTrack)) == null) {
            strF0 = "";
        }
        String str6 = strF0;
        boolean zG = true;
        if (a7g1Var != null) {
            jo70 jo70Var = a7g1Var.a;
            int iC = l1d.C(a7g1Var.c.a);
            if (iC == 0) {
                strY0 = "";
            } else if (iC == 1 || iC == 2 || iC == 9 || iC == 10) {
                List list = jo70Var.d;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str7 = ((ho70) it.next()).a;
                    if (str7.length() == 0) {
                        str7 = null;
                    }
                    if (str7 != null) {
                        arrayList.add(str7);
                    }
                }
                strY0 = o7h.y0(arrayList, ", ", (String) null, (String) null, (iu30) null, 62);
            } else {
                io70 io70Var = jo70Var.e;
                if (io70Var == null || (strY0 = io70Var.a) == null) {
                    strY0 = "";
                }
            }
        }
        if (strY0 == null) {
            strY0 = "";
        }
        if (strY0.length() == 0) {
            String strA0 = (String) this.c;
            if (l4o1.E(contextTrack) && !u890.j(l4o1.f0(contextTrack), strA0)) {
                strY1 = strA0;
            } else if (l4o1.P(contextTrack)) {
                strA0 = l4o1.a0(contextTrack, "album_title");
                if (strA0 != null) {
                    strY1 = strA0;
                }
            } else {
                strY1 = o7h.y0(l4o1.m(contextTrack), ", ", (String) null, (String) null, (iu30) null, 62);
            }
            str5 = strY1;
        } else {
            str5 = strY0;
        }
        if (a7g1Var == null || (i = a7g1Var.c.a) == 0) {
            zG = l4o1.G(contextTrack);
        } else if (i != 7 && i != 6) {
            zG = false;
        }
        return new CurrentTrackMetadata(contextTrack.uri(), str3, str4, a42Var.h(str4), str6, str5, str2, l4o1.a0(contextTrack, "album_uri"), zG);
    }

    public void onFailure(Throwable th) {
        throw new IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
    }

    public void onSuccess(Object obj) {
        o0c.q("Unexpected result from SurfaceRequest. Surface was provided twice.", ((n29) obj).a != 3);
        j2h1.o("TextureViewImpl");
        ((SurfaceTexture) this.b).release();
        hfe1 hfe1Var = ((gfe1) this.c).a;
        if (hfe1Var.j != null) {
            hfe1Var.j = null;
        }
    }

    public void p(y6r0 y6r0Var) {
        p7h1 p7h1Var = (p7h1) this.b;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (u890.j(((k480) entry.getKey()).a, y6r0Var.a)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        p7h1Var.a.put(y6r0Var, linkedHashMap);
    }

    public void q(Shader shader) {
        Matrix matrix = (Matrix) this.b;
        if (matrix != null && shader != null) {
            shader.setLocalMatrix(matrix);
        }
        this.c = shader;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(String str, String str2, h hVar, onm onmVar) {
        wbh1 wbh1Var;
        String str3;
        if (onmVar instanceof wbh1) {
            wbh1Var = (wbh1) onmVar;
            int i = wbh1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wbh1Var.d = i - Integer.MIN_VALUE;
            } else {
                wbh1Var = new wbh1(this, onmVar);
            }
        } else {
            wbh1Var = new wbh1(this, onmVar);
        }
        Object objA = wbh1Var.b;
        int i2 = wbh1Var.d;
        if (i2 == 0) {
            hm5.M(objA);
            String str4 = (String) ((Function0) this.c).invoke();
            iyc0 iyc0Var = (iyc0) this.b;
            ayc0 ayc0Var = new ayc0(str2, (phc) null, hVar.toByteString(), false, str4, 10);
            wbh1Var.a = str4;
            wbh1Var.d = 1;
            objA = iyc0.a(iyc0Var, str, ayc0Var, wbh1Var);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            str3 = str4;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = wbh1Var.a;
            hm5.M(objA);
        }
        return ((py21) objA).b(new yvf1(this, (byte) 3), new ysf1(str3, this));
    }

    public void s(float[] fArr) {
        Matrix matrix;
        if (fArr == null) {
            matrix = null;
            this.b = null;
        } else {
            Matrix matrix2 = (Matrix) this.b;
            if (matrix2 == null) {
                matrix2 = new Matrix();
                this.b = matrix2;
            }
            y9g1.v(matrix2, fArr);
            matrix = matrix2;
        }
        Shader shader = (Shader) this.c;
        if (shader != null) {
            shader.setLocalMatrix(matrix);
        }
    }

    public q480 t(y6r0 y6r0Var, ArrayList arrayList) {
        q480 q480Var = (q480) ((ConcurrentHashMap) this.c).compute(new k480(y6r0Var.a, arrayList), pzq.c);
        if (q480Var != null) {
            return q480Var;
        }
        eg.m("Unexpected - result should never be null");
        return null;
    }

    public Object u(String str, String str2, String str3, boolean z, s3w s3wVar) {
        uuh1 uuh1VarN = UpdatePromptPayload.n();
        uuh1VarN.r(z ? znh1.UPDATE_ACTION_UPDATE_AND_GENERATE : znh1.UPDATE_ACTION_UPDATE_ONLY);
        uuh1VarN.n(str3);
        uuh1VarN.q(str2);
        return r(str, "UPDATE_PROMPT", (UpdatePromptPayload) uuh1VarN.build(), s3wVar);
    }

    public void z() {
        ParagraphView paragraphView = (ParagraphView) this.b;
        paragraphView.setVisibility(0);
        paragraphView.setAlpha(0.0f);
        paragraphView.x(((nro) this.c).i);
    }

    public ffe1(p7h1 p7h1Var) {
        this.a = (byte) 22;
        this.b = p7h1Var;
        this.c = new ConcurrentHashMap();
    }

    public ffe1(iyc0 iyc0Var) {
        this.a = (byte) 26;
        vbh1 vbh1Var = vbh1.b;
        this.b = iyc0Var;
        this.c = vbh1Var;
    }

    public ffe1(gfe1 gfe1Var, SurfaceTexture surfaceTexture) {
        this.a = (byte) 0;
        this.c = gfe1Var;
        this.b = surfaceTexture;
    }

    public /* synthetic */ ffe1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public Object apply(Object obj, Object obj2) {
        e910 e910Var = (e910) obj;
        return new e910(e910Var.a, e910Var.b, e910Var.c, e910Var.d, e910Var.e, e910Var.f, e910Var.g, ((waz0) this.b).b((bbz0) obj2, ((iyf1) this.c).a), e910Var.i, e910Var.j, e910Var.k);
    }
}
