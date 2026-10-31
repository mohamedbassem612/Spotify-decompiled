package p;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.adsinternal.adscore.model.Format;
import com.spotify.fandomcollectibles.protos.BaseStory;
import com.spotify.mobius.MobiusLoop;
import com.spotify.scrollsita.v1.EmbeddedAd;
import com.spotify.scrollsita.v1.EmbeddedAdCardTrackingUrls;
import com.spotify.scrollsita.v1.EmbeddedAdMetadata;
import com.spotify.scrollsita.v1.ImageAsset;
import com.spotify.scrollsita.v1.ImageBrandAd;
import com.spotify.scrollsita.v1.Leavebehinds;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ccb1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccb1(ArrayList arrayList, vi11 vi11Var) {
        super(1);
        this.a = (byte) 17;
        this.b = arrayList;
        this.c = vi11Var;
    }

    public final Object invoke(Object obj) {
        int i;
        EmbeddedAdMetadata embeddedAdMetadataO;
        ImageAsset imageAsset;
        ji0 ji0Var;
        w7h1 w7h1Var;
        xgd1 xgd1Var;
        byte b = this.a;
        byte b2 = 6;
        b7x b7xVar = b7x.a;
        ou80 ou80Var = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                wp20 wp20Var = ((dcb1) obj2).a;
                jnq jnqVar = (jnq) ((srq) obj3).a.b;
                lzn0 lzn0Var = (lzn0) ((jbq) jnqVar.b).b.i.get();
                c8o.l(lzn0Var);
                String strD = ((qop) jnqVar.d).d();
                rbt rbtVar = (rbt) jnqVar.c;
                koc0 koc0Var = rbtVar.r;
                jbq jbqVar = (jbq) jnqVar.b;
                teq teqVar = jbqVar.b;
                in8 in8Var = new in8((lzn0) teqVar.i.get());
                Context context = (Context) jbqVar.a.x1.a;
                c8o.l(context);
                rsn0 rsn0Var = (rsn0) teqVar.F5.get();
                c8o.l(rsn0Var);
                yt91 yt91Var = new yt91(context, rbtVar, rsn0Var, (byte) 20);
                mr20 mr20Var = rbtVar.f;
                ktv ktvVar = (ktv) teqVar.n6.get();
                c8o.l(ktvVar);
                return new kpg0(new z72(lzn0Var, strD, koc0Var, rbtVar, in8Var, yt91Var, mr20Var, ktvVar, wp20Var, (zob1) obj), v3b1.U0);
            case 1:
                return rqt0.u(new a1b1(((koc0) obj3).d(), (fcb1) obj2, (byte) 2));
            case 2:
                g2z g2zVar = (g2z) obj3;
                ((err0) g2zVar.d).t((int) (((elb0) obj).b() & 4294967295L));
                ((iu30) obj2).invoke(new l160(((err0) g2zVar.c).s(), ((err0) g2zVar.d).s()));
                return rih1Var;
            case 3:
                kd31 kd31Var = (kd31) obj;
                int iIntValue = ((Number) ((tob1) obj3).getValue()).intValue();
                g2z g2zVar2 = (g2z) obj2;
                boolean zBooleanValue = ((Boolean) ((hrr0) g2zVar2.b).getValue()).booleanValue();
                int iS = ((err0) g2zVar2.d).s();
                float fMax = 0.0f;
                if (zBooleanValue) {
                    float f = iS;
                    fMax = Math.max(0.0f, (iIntValue + f) / f);
                }
                kd31Var.b(fMax);
                return rih1Var;
            case 4:
                ((qtr) obj).b(new u08((xu30) obj3, (xu30) obj2, ou80Var, (byte) 15));
                return rih1Var;
            case 5:
                yxb0 yxb0Var = (yxb0) obj3;
                fn31.T((c9n) yxb0Var.f, (o8n) null, 0, new sb91(yxb0Var, (tqw) obj2, ou80Var, (byte) 22), 3);
                return rih1Var;
            case 6:
                m2l0 m2l0Var = (m2l0) obj;
                String str = ((bp90) ((c9c0) ((ua91) obj3).c).e.a().getValue()).b ? (String) obj2 : nik1.b2.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), m2l0Var.a, r6h1.c, System.currentTimeMillis());
            case 7:
                return ((vu30) obj3).invoke(obj, ((zob1) obj2).getValue());
            case 8:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) obj3;
                qzb1 qzb1Var = new qzb1(bottomSheetBehavior, (ven0) obj2);
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.t(qzb1Var);
                }
                return new w9d0(bottomSheetBehavior, qzb1Var, (byte) 20);
            case 9:
                p5t0.u((p5t0) obj, (q5t0) obj3, 0, 0, new l5b1((t6c1) obj2, (byte) 21), 4);
                return rih1Var;
            case 10:
                return new m8c1((xu30) obj3, (f8c1) obj, (BaseStory) obj2);
            case 11:
                return new n8c1((xu30) obj3, (g8c1) obj, (com.spotify.culturalmoments.stories.v1.BaseStory) obj2);
            case 12:
                if (((Boolean) obj).booleanValue()) {
                    ((fbc1) obj3).invoke();
                } else {
                    ((fbc1) obj2).invoke();
                }
                return rih1Var;
            case 13:
                gdc1 gdc1Var = (gdc1) obj3;
                View viewInflate = LayoutInflater.from((Activity) obj2).inflate(2131626208, (ViewGroup) null, false);
                int i2 = 2131431105;
                RecyclerView recyclerViewT = m5n1.t(viewInflate, 2131431105);
                if (recyclerViewT != null) {
                    i2 = 2131431356;
                    if (((TextView) m5n1.t(viewInflate, 2131431356)) != null) {
                        gdc1Var.h = new hp91((LinearLayout) viewInflate, recyclerViewT, (byte) 22);
                        lcb0 lcb0Var = gdc1Var.c;
                        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
                        hp91 hp91Var = gdc1Var.h;
                        if (hp91Var == null) {
                            u890.C("binding");
                            throw null;
                        }
                        ((RecyclerView) hp91Var.c).setLayoutManager(linearLayoutManager);
                        recyclerViewT.setAccessibilityDelegate(new vwd((byte) 4));
                        recyclerViewT.setAdapter(lcb0Var);
                        recyclerViewT.setOnScrollListener(new zl7(gdc1Var, (byte) 22));
                        hp91 hp91Var2 = gdc1Var.h;
                        if (hp91Var2 == null) {
                            u890.C("binding");
                            throw null;
                        }
                        ((RecyclerView) hp91Var2.c).setAdapter(lcb0Var);
                        ljo1 ljo1Var = gdc1Var.l;
                        if (ljo1Var != null) {
                            gdc1Var.d(ljo1Var);
                        }
                        gdc1Var.l = null;
                        hp91 hp91Var3 = gdc1Var.h;
                        if (hp91Var3 != null) {
                            return (LinearLayout) hp91Var3.b;
                        }
                        u890.C("binding");
                        throw null;
                    }
                }
                bhn0.i("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
                return null;
            case 14:
                int iOrdinal = ((vco) obj).ordinal();
                if (iOrdinal == 0) {
                    i = 2;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    i = 1;
                }
                jdc1 jdc1Var = (jdc1) obj3;
                gdc1 gdc1Var2 = jdc1Var.W0;
                ji0 ji0Var2 = (ji0) obj2;
                String str2 = ji0Var2.t;
                int iN = jdc1Var.n();
                pbq pbqVar = gdc1Var2.i;
                ua91 ua91Var = (ua91) pbqVar.b;
                String str3 = ji0Var2.e;
                String str4 = ji0Var2.a;
                String str5 = ji0Var2.c;
                Set set = s4b1.f;
                if (uic.u(str3)) {
                    ((lzn0) ua91Var.e).h(str3);
                } else {
                    ((ko0) ua91Var.c).c((Activity) ua91Var.d, new a580(str3, str4, str5, str2));
                }
                ua91 ua91Var2 = (ua91) ua91Var.b;
                r6h1 r6h1Var = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-ads-cta-cards";
                x6h1VarI.f = "2.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.c = null;
                x6h1VarI.e = "playlist";
                y6h1 y6h1VarA = x6h1VarI.a();
                String str6 = ji0Var2.h;
                String str7 = ji0Var2.e;
                x6h1 x6h1VarC = y6h1VarA.c();
                x6h1VarC.i.add(new a7h1("cta_card", str6, (Integer) null, str7, (String) null));
                x6h1VarC.j = true;
                ((i8h1) ua91Var2.b).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", str3)), x6h1VarC.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
                ua91 ua91Var3 = (ua91) pbqVar.h;
                String str8 = ji0Var2.h;
                z6x z6xVar = (List) ji0Var2.Q0.get("clicked");
                if (z6xVar == null) {
                    z6xVar = z6x.a;
                }
                ua91Var3.A(str8, z6xVar, "clicked", str2);
                hr0 hr0Var = (hr0) pbqVar.i;
                String str9 = (String) pbqVar.e;
                hr0Var.a(d3d1.d, i, str9 == null ? "" : str9, iN, ji0Var2.h, ji0Var2.t);
                return rih1Var;
            case 15:
                Section section = (Section) obj;
                lv4 lv4Var = (lv4) obj3;
                if ((!lv4Var.l() && !lv4Var.m()) || !section.c0()) {
                    return null;
                }
                Leavebehinds leavebehindsZ = section.z();
                String str10 = (String) obj2;
                if (leavebehindsZ.o().isEmpty()) {
                    return null;
                }
                h290<ImageBrandAd> h290VarO = leavebehindsZ.o();
                ArrayList arrayList = new ArrayList();
                for (ImageBrandAd imageBrandAd : h290VarO) {
                    EmbeddedAd embeddedAdN = imageBrandAd.n();
                    if (embeddedAdN == null || (embeddedAdMetadataO = imageBrandAd.o()) == null || (imageAsset = (ImageAsset) o7h.s0(embeddedAdN.r())) == null) {
                        ji0Var = null;
                    } else {
                        String strN = embeddedAdMetadataO.n();
                        String strN2 = embeddedAdN.n();
                        String str11 = strN2 == null ? "" : strN2;
                        String strP = embeddedAdN.p();
                        String str12 = strP == null ? "" : strP;
                        xkg0 xkg0Var = new xkg0();
                        String strO = embeddedAdN.o();
                        if (strO == null) {
                            strO = "";
                        }
                        String strS = embeddedAdN.s();
                        if (strS == null) {
                            strS = "";
                        }
                        xkg0Var.put("displayImage", imageAsset.getUrl());
                        String strO2 = imageAsset.o();
                        if (strO2 == null) {
                            strO2 = "";
                        }
                        String strS2 = embeddedAdMetadataO.s();
                        if (strS2 == null) {
                            strS2 = "";
                        }
                        xkg0Var.put("product_name", strS2);
                        xkg0 xkg0VarB = xkg0Var.b();
                        fgh0 fgh0Var = new fgh0(6, Collections.singletonList(new gq70(0, 0, new p57(imageAsset.getUrl()))), (List) null);
                        String strQ = embeddedAdMetadataO.q();
                        String strO3 = embeddedAdMetadataO.o();
                        String str13 = strO3 == null ? "" : strO3;
                        String strR = embeddedAdMetadataO.r();
                        Format format = Format.BANNER;
                        String strT = embeddedAdMetadataO.t();
                        xkg0 xkg0Var2 = new xkg0();
                        EmbeddedAdCardTrackingUrls embeddedAdCardTrackingUrls = (EmbeddedAdCardTrackingUrls) embeddedAdMetadataO.u().get("viewed");
                        h290 h290VarO2 = embeddedAdCardTrackingUrls != null ? embeddedAdCardTrackingUrls.o() : null;
                        h290 h290Var = z6x.a;
                        if (h290VarO2 == null) {
                            h290VarO2 = h290Var;
                        }
                        xkg0Var2.put("viewed", h290VarO2);
                        EmbeddedAdCardTrackingUrls embeddedAdCardTrackingUrls2 = (EmbeddedAdCardTrackingUrls) embeddedAdMetadataO.u().get("clicked");
                        h290 h290VarO3 = embeddedAdCardTrackingUrls2 != null ? embeddedAdCardTrackingUrls2.o() : null;
                        if (h290VarO3 == null) {
                            h290VarO3 = h290Var;
                        }
                        xkg0Var2.put("clicked", h290VarO3);
                        ji0Var = new ji0(strN, "", str11, "", str12, 1, xkg0VarB, fgh0Var, strQ, str13, strR, false, false, format, false, h290Var, strT, xkg0Var2.b(), 2);
                    }
                    if (ji0Var != null) {
                        arrayList.add(ji0Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new jxo0(new tyb0(str10, arrayList));
            case 16:
                muc1 muc1Var = ((fvc1) obj3).a;
                c921.y(muc1Var.c, (o8n) null, 0, new ku91(muc1Var, ((ewc1) obj2).getSurface(), (pd21) obj, (lnm) null, (byte) 8), 3);
                return rih1Var;
            case 17:
                ArrayList arrayList2 = (ArrayList) obj3;
                ((rtb0) obj).e(arrayList2.size(), new qbb0(arrayList2, (byte) 29), new byc1(arrayList2, (byte) 0), new j2i(2039820996, new ot(arrayList2, (vi11) obj2), true));
                return rih1Var;
            case 18:
                r0d1 r0d1Var = (r0d1) ((dr41) obj3).b;
                r0d1Var.f.b(r0d1Var.h.n(r0d1Var.a).subscribe(new wf0(r0d1Var, (p0d1) obj2, (tv80) obj, (byte) 22)));
                return rih1Var;
            case 19:
                if (((s0d1) obj) == s0d1.a) {
                    t0d1 t0d1Var = (t0d1) obj2;
                    l0d1 l0d1Var = ((u0d1) obj3).V0;
                    vku vkuVar = l0d1Var.Y1;
                    mts mtsVar = l0d1Var.X1;
                    if (mtsVar == null) {
                        u890.C("supplementOpener");
                        throw null;
                    }
                    vkuVar.a(mtsVar.a(t0d1Var.c));
                }
                return rih1Var;
            case 20:
                g9d1 g9d1Var = (g9d1) obj3;
                c380 c380Var = g9d1Var.a;
                ((rtb0) obj).e(c380Var.size(), (iu30) null, new rw11(c380Var, (byte) 24), new j2i(2039820996, new d311(b2, g9d1Var, (h9d1) obj2, c380Var), true));
                return rih1Var;
            case 21:
                y281 y281Var = ((i9d1) obj3).a;
                oud oudVar = (oud) obj2;
                oudVar.getClass();
                return new kpg0(new smp0((usq) ((jly0) new jmq(y281Var, oudVar).c).get(), oudVar), d6d1.f);
            case 22:
                ((qzh) ((mfx0) obj3).b).f((nad1) ((ven0) obj2).getValue());
                return rih1Var;
            case 23:
                ji50 ji50Var = (ji50) obj;
                for (oi51 oi51Var : ((iyq0) obj3).b) {
                    Set setC = oi51Var.c();
                    LinkedHashMap linkedHashMap = ((tcr0) obj2).a;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        rcr0 rcr0Var = (rcr0) entry.getKey();
                        Set set2 = setC;
                        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                            Iterator it = set2.iterator();
                            while (it.hasNext()) {
                                if (((scr0) it.next()).a.equals(rcr0Var)) {
                                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                                }
                                break;
                            }
                        }
                    }
                    oi51Var.a(ji50Var, new tcr0(linkedHashMap2));
                }
                return rih1Var;
            case 24:
                gfd1 gfd1Var = (gfd1) obj;
                tcr0 tcr0Var = (tcr0) obj3;
                ne neVar = (ne) obj2;
                for (ufr0 ufr0Var : ((vfr0) tcr0Var.a(qcr0.a)).c) {
                    gfd1.a(gfd1Var, ufr0Var.a, ufr0Var.b, new rsc1((iyq0) neVar.c, ufr0Var, tcr0Var, (byte) 2));
                }
                return rih1Var;
            case 25:
                return new uhd1(obj3, (c380) obj2);
            case 26:
                String str14 = (String) obj;
                qhd1 qhd1Var = (qhd1) obj2;
                Iterator it2 = ((khd1) obj3).a.iterator();
                while (it2.hasNext()) {
                    xgd1 xgd1Var2 = ((ygd1) it2.next()).a;
                    if (u890.j(xgd1Var2.e.getUri(), str14)) {
                        String uri = xgd1Var2.e.getUri();
                        wqn0 wqn0VarH = qhd1Var.h();
                        bqk0 bqk0Var = qhd1Var.X0;
                        if (!u890.j(uri, wqn0VarH.getUri())) {
                            ((LinkedHashMap) qhd1Var.Q0.d).clear();
                        }
                        ygd1 ygd1VarI = qhd1Var.i();
                        wqn0 wqn0Var = (ygd1VarI == null || (xgd1Var = ygd1VarI.a) == null) ? null : xgd1Var.e;
                        if (u890.j(wqn0Var, ypn0.a)) {
                            bqk0Var.getClass();
                            x6h1 x6h1VarC2 = bqk0Var.b.c();
                            x6h1VarC2.i.add(new a7h1("home", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC2.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", uri != null ? uri : "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
                        } else if (u890.j(wqn0Var, lqn0.a)) {
                            bqk0Var.getClass();
                            x6h1 x6h1VarC3 = bqk0Var.b.c();
                            x6h1VarC3.i.add(new a7h1("recently_played", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC3.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", uri != null ? uri : "")), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis());
                        } else if (u890.j(wqn0Var, upn0.a)) {
                            bqk0Var.getClass();
                            x6h1 x6h1VarC4 = bqk0Var.b.c();
                            x6h1VarC4.i.add(new a7h1("browse", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC4.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", uri != null ? uri : "")), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis());
                        } else {
                            if (!u890.j(wqn0Var, cqn0.a)) {
                                eg.m("Unknown navigable entity");
                                return null;
                            }
                            bqk0Var.getClass();
                            x6h1 x6h1VarC5 = bqk0Var.b.c();
                            x6h1VarC5.i.add(new a7h1("your_library", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC5.j = false;
                            w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", uri != null ? uri : "")), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis());
                        }
                        w7h1 w7h1Var2 = w7h1Var;
                        ou80 ou80Var2 = qhd1Var.i.m(w7h1Var2, (xj61) null).a;
                        qhd1Var.X.a(w7h1Var2, ou80Var2);
                        MobiusLoop mobiusLoop = qhd1Var.T0;
                        if (mobiusLoop != null) {
                            mym.l(mobiusLoop, new rgd1(ou80Var2, xgd1Var2.e));
                        }
                        return rih1Var;
                    }
                }
                bhn0.t("Collection contains no element matching the predicate.");
                return null;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                li51 li51Var = (li51) obj;
                String str15 = li51Var.a;
                qhd1 qhd1Var2 = (qhd1) obj3;
                if (qhd1Var2.R0.o(6)) {
                    ouk0 ouk0Var = (ouk0) obj2;
                    x6h1 x6h1VarC6 = ouk0Var.b.c();
                    x6h1VarC6.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    w7h1 w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str15 != null ? str15 : "")), x6h1VarC6.a(), ouk0Var.a, System.currentTimeMillis());
                    ou80Var = qhd1Var2.i.m(w7h1Var3, (xj61) null).a;
                    qhd1Var2.X.a(w7h1Var3, ou80Var);
                }
                MobiusLoop mobiusLoop2 = qhd1Var2.T0;
                if (mobiusLoop2 != null) {
                    mym.l(mobiusLoop2, new qgd1(new nqn0(str15, li51Var.b, li51Var.c), ou80Var));
                }
                return rih1Var;
            case 28:
                cd10 cd10Var = (cd10) obj;
                qhd1 qhd1Var3 = (qhd1) obj3;
                r6h1 r6h1Var2 = (r6h1) obj2;
                t64 t64Var = qhd1Var3.X;
                i8h1 i8h1Var = qhd1Var3.i;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-carapplibrary-fab";
                x6h1VarI2.f = "1.0.0";
                x6h1VarI2.g = "22.0.0";
                y6h1 y6h1VarA2 = x6h1VarI2.a();
                if (cd10Var.equals(ad10.c)) {
                    fqn0 fqn0Var = fqn0.a;
                    x6h1 x6h1VarC7 = y6h1VarA2.c();
                    x6h1VarC7.i.add(new a7h1("npv_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = true;
                    w7h1 w7h1Var4 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:now-playing-view")), x6h1VarC7.a(), r6h1Var2, System.currentTimeMillis());
                    ou80 ou80Var3 = i8h1Var.m(w7h1Var4, (xj61) null).a;
                    t64Var.a(w7h1Var4, ou80Var3);
                    MobiusLoop mobiusLoop3 = qhd1Var3.V0;
                    if (mobiusLoop3 != null) {
                        mym.l(mobiusLoop3, new id10(ou80Var3));
                    }
                } else {
                    if (!cd10Var.equals(bd10.c)) {
                        eg.o();
                        return null;
                    }
                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                    yon1.U4();
                    x6h1 x6h1VarC8 = y6h1VarA2.c();
                    x6h1VarC8.i.add(new a7h1("search_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC8.j = true;
                    w7h1 w7h1Var5 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:search")), x6h1VarC8.a(), r6h1Var2, System.currentTimeMillis());
                    ou80 ou80Var4 = i8h1Var.m(w7h1Var5, (xj61) null).a;
                    t64Var.a(w7h1Var5, ou80Var4);
                    MobiusLoop mobiusLoop4 = qhd1Var3.V0;
                    if (mobiusLoop4 != null) {
                        mym.l(mobiusLoop4, new jd10(ou80Var4));
                    }
                }
                return rih1Var;
            default:
                String str16 = (String) obj3;
                if (str16 == null) {
                    str16 = "";
                }
                return new b3(str16, ((n3z) obj2).a, "");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ccb1(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccb1(u0d1 u0d1Var, int i, t0d1 t0d1Var) {
        super(1);
        this.a = (byte) 19;
        this.b = u0d1Var;
        this.c = t0d1Var;
    }
}
