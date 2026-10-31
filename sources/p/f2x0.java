package p;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.gander.v2.proto.ResetLatestCursorResponse;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function6;
import io.reactivex.rxjava3.functions.Predicate;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class f2x0 implements Function, av30, Predicate, k1q0, s2i1, Init, Function6, au11, BiFunction {
    public final /* synthetic */ byte a;
    public static final f2x0 b = new f2x0((byte) 0);
    public static final f2x0 c = new f2x0((byte) 1);
    public static final f2x0 d = new f2x0((byte) 2);
    public static final f2x0 e = new f2x0((byte) 3);
    public static final f2x0 f = new f2x0((byte) 4);
    public static final f2x0 g = new f2x0((byte) 5);
    public static final f2x0 h = new f2x0((byte) 6);
    public static final f2x0 i = new f2x0((byte) 7);
    public static final f2x0 t = new f2x0((byte) 8);
    public static final f2x0 X = new f2x0((byte) 9);
    public static final f2x0 Y = new f2x0((byte) 10);
    public static final f2x0 Z = new f2x0((byte) 11);
    public static final f2x0 N0 = new f2x0((byte) 12);
    public static final f2x0 O0 = new f2x0((byte) 13);
    public static final f2x0 P0 = new f2x0((byte) 14);
    public static final f2x0 Q0 = new f2x0((byte) 15);
    public static final f2x0 R0 = new f2x0((byte) 16);
    public static final f2x0 S0 = new f2x0((byte) 17);
    public static final f2x0 T0 = new f2x0((byte) 18);
    public static final f2x0 U0 = new f2x0((byte) 19);
    public static final f2x0 V0 = new f2x0((byte) 21);
    public static final f2x0 W0 = new f2x0((byte) 22);
    public static final f2x0 X0 = new f2x0((byte) 23);
    public static final f2x0 Y0 = new f2x0((byte) 25);
    public static final f2x0 Z0 = new f2x0((byte) 26);
    public static final f2x0 a1 = new f2x0((byte) 27);

    public f2x0(y87 y87Var) {
        this.a = (byte) 29;
    }

    public static boolean b(luk lukVar) {
        return new mq4(false, lukVar).a();
    }

    public static boolean d(gj5 gj5Var) {
        return !gj5Var.getIntent().getBooleanExtra("taste-onboarding.initiated", false);
    }

    public void a(wax waxVar) {
        waxVar.c(rlo1.class, x4o1.a);
        waxVar.c(xso1.class, jeo1.a);
        waxVar.c(ulo1.class, e5o1.a);
        waxVar.c(omo1.class, i5o1.a);
        waxVar.c(jmo1.class, f5o1.a);
        waxVar.c(mmo1.class, l5o1.a);
        waxVar.c(eio1.class, i0o1.a);
        waxVar.c(dio1.class, e0o1.a);
        waxVar.c(nko1.class, r3o1.a);
        waxVar.c(zro1.class, jdo1.a);
        waxVar.c(zho1.class, a0o1.a);
        waxVar.c(who1.class, wzn1.a);
        waxVar.c(mno1.class, x7o1.a);
        waxVar.c(suo1.class, t2o1.a);
        waxVar.c(dko1.class, h3o1.a);
        waxVar.c(rjo1.class, o2o1.a);
        waxVar.c(pno1.class, a8o1.a);
        waxVar.c(qro1.class, zco1.a);
        waxVar.c(tro1.class, fdo1.a);
        waxVar.c(pro1.class, wco1.a);
        waxVar.c(zmo1.class, p6o1.a);
        waxVar.c(puo1.class, exn1.a);
        waxVar.c(bno1.class, v6o1.a);
        waxVar.c(poo1.class, y8o1.a);
        waxVar.c(yoo1.class, l9o1.a);
        waxVar.c(voo1.class, i9o1.a);
        waxVar.c(too1.class, d9o1.a);
        waxVar.c(iqo1.class, yao1.a);
        waxVar.c(mqo1.class, cbo1.a);
        waxVar.c(rqo1.class, cco1.a);
        waxVar.c(oqo1.class, ubo1.a);
        waxVar.c(wmo1.class, k6o1.a);
        waxVar.c(vqo1.class, dco1.a);
        waxVar.c(zqo1.class, gco1.a);
        waxVar.c(bro1.class, mco1.a);
        waxVar.c(ero1.class, nco1.a);
        waxVar.c(lro1.class, sco1.a);
        waxVar.c(iro1.class, tco1.a);
        waxVar.c(fqo1.class, gao1.a);
        waxVar.c(flo1.class, p4o1.a);
        waxVar.c(wpo1.class, qao1.a);
        waxVar.c(upo1.class, kao1.a);
        waxVar.c(aqo1.class, uao1.a);
        waxVar.c(wro1.class, ido1.a);
        waxVar.c(oto1.class, ifo1.a);
        waxVar.c(mgo1.class, jyn1.a);
        waxVar.c(ggo1.class, byn1.a);
        waxVar.c(dgo1.class, ayn1.a);
        waxVar.c(lgo1.class, fyn1.a);
        waxVar.c(vgo1.class, qyn1.a);
        waxVar.c(qgo1.class, myn1.a);
        waxVar.c(wgo1.class, tyn1.a);
        waxVar.c(zgo1.class, wyn1.a);
        waxVar.c(fho1.class, czn1.a);
        waxVar.c(gho1.class, dzn1.a);
        waxVar.c(iho1.class, izn1.a);
        waxVar.c(lrn1.class, nwn1.a);
        waxVar.c(rrn1.class, vwn1.a);
        waxVar.c(prn1.class, rwn1.a);
        waxVar.c(zko1.class, g4o1.a);
        waxVar.c(gio1.class, o0o1.a);
        waxVar.c(lnn1.class, urn1.a);
        waxVar.c(nmn1.class, yrn1.a);
        waxVar.c(ijo1.class, n1o1.a);
        waxVar.c(hon1.class, bsn1.a);
        waxVar.c(don1.class, gsn1.a);
        waxVar.c(cpn1.class, qtn1.a);
        waxVar.c(yon1.class, rtn1.a);
        waxVar.c(oon1.class, isn1.a);
        waxVar.c(jon1.class, lsn1.a);
        waxVar.c(eqn1.class, kun1.a);
        waxVar.c(bqn1.class, oun1.a);
        waxVar.c(oqn1.class, dvn1.a);
        waxVar.c(mqn1.class, mvn1.a);
        waxVar.c(irn1.class, fwn1.a);
        waxVar.c(grn1.class, kwn1.a);
        waxVar.c(wqn1.class, pvn1.a);
        waxVar.c(qqn1.class, tvn1.a);
        waxVar.c(ern1.class, xvn1.a);
        waxVar.c(crn1.class, bwn1.a);
        waxVar.c(fuo1.class, vdo1.a);
        waxVar.c(pto1.class, p0o1.a);
        waxVar.c(yto1.class, e6o1.a);
        waxVar.c(xto1.class, z5o1.a);
        waxVar.c(sto1.class, a3o1.a);
        waxVar.c(cuo1.class, rdo1.a);
        waxVar.c(buo1.class, odo1.a);
        waxVar.c(guo1.class, ydo1.a);
        waxVar.c(tto1.class, x3o1.a);
        waxVar.c(ouo1.class, nfo1.a);
        waxVar.c(luo1.class, qfo1.a);
        waxVar.c(kuo1.class, lfo1.a);
        waxVar.c(cso1.class, aeo1.a);
        waxVar.c(wko1.class, c4o1.a);
        waxVar.c(ilo1.class, q4o1.a);
        waxVar.c(ago1.class, ixn1.a);
        waxVar.c(eko1.class, m3o1.a);
        waxVar.c(blo1.class, k4o1.a);
        waxVar.c(ljo1.class, p1o1.a);
        waxVar.c(xio1.class, y0o1.a);
        waxVar.c(ajo1.class, c1o1.a);
        waxVar.c(sio1.class, v0o1.a);
        waxVar.c(ejo1.class, h1o1.a);
        waxVar.c(smo1.class, u5o1.a);
        waxVar.c(qmo1.class, q5o1.a);
        waxVar.c(kln1.class, trn1.a);
        waxVar.c(gto1.class, seo1.a);
        waxVar.c(kto1.class, xeo1.a);
        waxVar.c(jto1.class, ueo1.a);
        waxVar.c(xfo1.class, dxn1.a);
        waxVar.c(tho1.class, uzn1.a);
        waxVar.c(oho1.class, qzn1.a);
        waxVar.c(nho1.class, nzn1.a);
        waxVar.c(fno1.class, n7o1.a);
        waxVar.c(kno1.class, t7o1.a);
        waxVar.c(hno1.class, r7o1.a);
        waxVar.c(ton1.class, itn1.a);
        waxVar.c(qon1.class, otn1.a);
        waxVar.c(rno1.class, b8o1.a);
        waxVar.c(boo1.class, l8o1.a);
        waxVar.c(vno1.class, f8o1.a);
        waxVar.c(zno1.class, j8o1.a);
        waxVar.c(upn1.class, utn1.a);
        waxVar.c(qpn1.class, ztn1.a);
        waxVar.c(hso1.class, geo1.a);
        waxVar.c(eso1.class, eeo1.a);
        waxVar.c(zso1.class, meo1.a);
        waxVar.c(cto1.class, peo1.a);
        waxVar.c(bpo1.class, r9o1.a);
        waxVar.c(rpo1.class, cao1.a);
        waxVar.c(epo1.class, v9o1.a);
        waxVar.c(ppo1.class, z9o1.a);
        waxVar.c(kqn1.class, run1.a);
        waxVar.c(hqn1.class, uun1.a);
        waxVar.c(iko1.class, q3o1.a);
        waxVar.c(ujo1.class, e3o1.a);
        waxVar.c(foo1.class, q8o1.a);
        waxVar.c(loo1.class, u8o1.a);
        waxVar.c(ioo1.class, r8o1.a);
        waxVar.c(zpn1.class, dun1.a);
        waxVar.c(xpn1.class, iun1.a);
    }

    public Object apply(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                return new x2x0((String) obj);
            case 1:
                dwx0 dwx0Var = (dwx0) obj;
                return new mmr0(Boolean.valueOf(dwx0Var.e), dwx0Var.f);
            case 2:
            case 4:
            case 10:
            case 13:
            case 14:
            case 15:
            default:
                PlayerState playerState = (PlayerState) obj;
                if (playerState.isBuffering()) {
                    str = "buffering";
                } else if (playerState.isPaused()) {
                    str = "paused";
                } else {
                    str = playerState.isPlaying() ? "playing" : "loading";
                }
                return new i5w0(new rzk1(str, o4p1.o(playerState)));
            case 3:
                ccg1 ccg1Var = (ccg1) obj;
                return new mmr0(Boolean.valueOf(ccg1Var.k), Integer.valueOf(ccg1Var.h));
            case 5:
                return Boolean.TRUE;
            case 6:
                return Boolean.valueOf(((ResetLatestCursorResponse) obj).n());
            case 7:
                Map map = ((xa10) obj).a;
                return map == null ? Single.error(new IOException("Wrong response")) : Single.just(Boolean.valueOf(map.containsKey("samsung")));
            case 8:
                qal qalVar = (tal) obj;
                if (qalVar instanceof sal) {
                    return new f051(ral.a);
                }
                if (qalVar instanceof qal) {
                    return new f051(new pal(qalVar.a));
                }
                eg.o();
                return null;
            case 9:
                return new mq70((List) null, 7);
            case 11:
                return spq0.a(((fo91) obj).a);
            case 12:
                return new lp81((gn2) obj);
            case 16:
                v8i0.j("LP pause effect failed: ", ((feh) obj).a);
                return rih1.a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return ((ContextTrack) ((PlayerState) obj).track().b()).uri();
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                Logger.e((Throwable) obj, "Failed to lookup track when trying to navigate to an album.", new Object[0]);
                Set set = s4b1.f;
                return Single.just(new ern0(uic.x("spotify:home")));
        }
    }

    public Object c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return new gwj1(((Boolean) obj).booleanValue(), (zvj1) obj2, (Optional) obj3, ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue(), (twj1) obj6);
    }

    public First e0(Object obj) {
        bni1 bni1Var = (bni1) obj;
        return First.c(bni1Var, dm61.B0(new eli1[]{tki1.a, bni1Var.l ? vki1.a : null}));
    }

    public v5b1 i(String str, LinkedHashMap linkedHashMap, xkg0 xkg0Var, String str2) {
        return new jfa1(xkg0Var, str2, str);
    }

    public lu11 k(fe00 fe00Var, unb1 unb1Var) {
        if (fe00Var.equals(be00.a)) {
            return eu11.a;
        }
        if (fe00Var.equals(ce00.a)) {
            return iu11.a;
        }
        if (fe00Var.equals(de00.a)) {
            return ku11.a;
        }
        if (fe00Var.equals(ee00.a)) {
            return ju11.a;
        }
        return null;
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 2:
                Collection collectionValues = ((Map) obj).values();
                if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                    Iterator it = collectionValues.iterator();
                    while (it.hasNext()) {
                        if (((wu21) it.next()) instanceof uu21) {
                            return false;
                        }
                    }
                }
                return true;
            case 4:
                wv00 wv00Var = (uv00) obj;
                return wv00Var.c() || !wv00Var.f;
            case 10:
                return ((cma1) obj).b == 1;
            default:
                return !((sp91) obj).i.isEmpty();
        }
    }

    public hsl1 x(View view, hsl1 hsl1Var) {
        esl1 esl1Var = hsl1Var.a;
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        int iMax = !(view2 != null ? u890.j(view2.getTag(2131431015), Boolean.TRUE) : false) ? Math.max(esl1Var.i(519).d, esl1Var.i(8).d) : 0;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(2131167007);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(2131167006);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            bhn0.i("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = 0;
        marginLayoutParams.bottomMargin = dimensionPixelSize2 + iMax;
        marginLayoutParams.leftMargin = dimensionPixelSize;
        marginLayoutParams.rightMargin = dimensionPixelSize;
        view.setLayoutParams(marginLayoutParams);
        return hsl1Var;
    }

    public /* synthetic */ f2x0(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj, Object obj2) {
        fwq fwqVar = (fwq) obj;
        Map map = (Map) obj2;
        if (map.isEmpty()) {
            return fwqVar;
        }
        List<yrd> list = fwqVar.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (yrd yrdVar : list) {
            List<avd> list2 = yrdVar.g;
            ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
            for (avd avdVarA : list2) {
                cvd cvdVar = avdVarA.d;
                if (cvdVar instanceof cvd) {
                    List<g> list3 = cvdVar.a;
                    ArrayList arrayList3 = new ArrayList(q7h.U(list3, 10));
                    for (g gVarJ : list3) {
                        Boolean bool = (Boolean) map.get(gVarJ.getUri());
                        if ((gVarJ instanceof g) && bool != null) {
                            gVarJ = g.j(gVarJ, false, (ArrayList) null, bool.booleanValue(), 2047);
                        }
                        arrayList3.add(gVarJ);
                    }
                    avdVarA = avd.a(avdVarA, (String) null, new cvd(arrayList3), 7);
                }
                arrayList2.add(avdVarA);
            }
            arrayList.add(yrd.a(yrdVar, arrayList2));
        }
        return fwq.a(fwqVar, arrayList, false, false, false, false, false, (sfu0) null, false, false, false, 4094);
    }
}
