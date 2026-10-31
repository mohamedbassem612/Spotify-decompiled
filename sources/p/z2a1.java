package p;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import com.spotify.nowplaying.scroll.view.TouchBlockingFrameLayout;
import com.spotify.nowplayingmodes.adsmode.data.AdsModeModel;
import com.spotify.nowplayingmodes.adsmode.events.proto.AdFeedbackEvent;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import io.reactivex.rxjava3.subjects.SingleSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z2a1 implements Consumer {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ z2a1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void accept(Object obj) {
        Object j1a1Var;
        int streamMaxVolume;
        int streamMaxVolume2;
        int streamMaxVolume3;
        switch (this.a) {
            case 0:
                b2a1 b2a1Var = (b2a1) obj;
                ((jut) this.b).j(b2a1Var.a, b2a1Var.b);
                return;
            case 1:
                m2a1 m2a1Var = ((n2a1) obj).a;
                if (m2a1Var instanceof d2a1) {
                    j1a1Var = new c1a1(((d2a1) m2a1Var).a);
                } else if (m2a1Var instanceof e2a1) {
                    j1a1Var = new d1a1(((e2a1) m2a1Var).a);
                } else if (m2a1Var.equals(f4x0.N0)) {
                    j1a1Var = e1a1.a;
                } else if (m2a1Var.equals(i5x0.N0)) {
                    j1a1Var = f1a1.a;
                } else if (m2a1Var.equals(p5x0.P0)) {
                    j1a1Var = g1a1.a;
                } else if (m2a1Var instanceof f2a1) {
                    j1a1Var = new a1a1(((f2a1) m2a1Var).a);
                } else if (m2a1Var instanceof c2a1) {
                    j1a1Var = new b1a1(((c2a1) m2a1Var).a);
                } else if (m2a1Var.equals(r5x0.P0)) {
                    j1a1Var = h1a1.a;
                } else if (m2a1Var.equals(r6x0.P0)) {
                    j1a1Var = i1a1.a;
                } else if (m2a1Var instanceof k2a1) {
                    j1a1Var = new p1a1(((k2a1) m2a1Var).a);
                } else if (m2a1Var instanceof h2a1) {
                    j1a1Var = new m1a1(((h2a1) m2a1Var).a);
                } else if (m2a1Var instanceof g2a1) {
                    j1a1Var = new l1a1(((g2a1) m2a1Var).a);
                } else if (m2a1Var instanceof l2a1) {
                    l2a1 l2a1Var = (l2a1) m2a1Var;
                    j1a1Var = new o1a1(l2a1Var.a, l2a1Var.b);
                } else if (m2a1Var instanceof i2a1) {
                    i2a1 i2a1Var = (i2a1) m2a1Var;
                    j1a1Var = new n1a1(i2a1Var.a, i2a1Var.b);
                } else {
                    if (!(m2a1Var instanceof j2a1)) {
                        eg.o();
                        return;
                    }
                    j1a1Var = new j1a1(((j2a1) m2a1Var).a);
                }
                r1a1 r1a1Var = (r1a1) this.b;
                r1a1Var.a.c(new jyh0(r1a1Var, j1a1Var, (byte) 23));
                return;
            case 2:
                b5a1 b5a1Var = (b5a1) this.b;
                rku rkuVar = b5a1Var.o;
                Observable observableNever = Observable.never();
                z4a1 z4a1Var = z4a1.a;
                Context context = b5a1Var.a;
                kt91 kt91Var = b5a1Var.f;
                Scheduler scheduler = b5a1Var.m;
                jut jutVar = b5a1Var.h;
                z1s z1sVar = b5a1Var.i;
                dxz0 dxz0Var = b5a1Var.k;
                b0a0 b0a0Var = b5a1Var.g;
                RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
                subtypeEffectHandlerBuilderC.g(auo0.class, new lk1(scheduler, (byte) 1));
                subtypeEffectHandlerBuilderC.c(luo0.class, new rt60(z1sVar, (byte) 6));
                subtypeEffectHandlerBuilderC.c(ouo0.class, new rt60(z1sVar, (byte) 9));
                subtypeEffectHandlerBuilderC.c(muo0.class, new rt60(z1sVar, (byte) 7));
                subtypeEffectHandlerBuilderC.c(nuo0.class, new rt60(z1sVar, (byte) 8));
                subtypeEffectHandlerBuilderC.g(kuo0.class, new zd1(context, kt91Var, scheduler));
                subtypeEffectHandlerBuilderC.g(juo0.class, new nm3(context, kt91Var, scheduler));
                subtypeEffectHandlerBuilderC.g(euo0.class, new nm3(context, kt91Var));
                subtypeEffectHandlerBuilderC.g(duo0.class, new so(kt91Var, context, (byte) 23));
                subtypeEffectHandlerBuilderC.c(guo0.class, new rt60(z1sVar, (byte) 5));
                subtypeEffectHandlerBuilderC.c(buo0.class, new dy40(jutVar, (byte) 12));
                subtypeEffectHandlerBuilderC.c(huo0.class, new rt60(z1sVar, (byte) 2));
                subtypeEffectHandlerBuilderC.c(iuo0.class, new rt60(z1sVar, (byte) 3));
                subtypeEffectHandlerBuilderC.c(fuo0.class, new rt60(z1sVar, (byte) 4));
                subtypeEffectHandlerBuilderC.c(cuo0.class, new y43(b0a0Var, dxz0Var, context, z1sVar, (byte) 9));
                MobiusLoop.Builder builderD = Mobius.d(z4a1Var, RxConnectables.a(subtypeEffectHandlerBuilderC.h()));
                xx91 xx91Var = b5a1Var.b;
                inr inrVar = b5a1Var.d;
                Observable observable = b5a1Var.e;
                kor korVar = b5a1Var.j;
                zeu0 zeu0Var = b5a1Var.l;
                c9c0 c9c0Var = b5a1Var.c;
                xx91 xx91Var2 = xx91Var;
                ObservableSource map = xx91Var2.k.f().distinctUntilChanged().map(qs10.S0);
                ObservableSource map2 = korVar.f.map(vf61.b1);
                r1a1 r1a1Var2 = xx91Var2.j;
                ObservableSource map3 = r1a1Var2.b.subscribeOn(r1a1Var2.a).map(as10.Q0);
                Observable observableD = inrVar.d();
                r6k0 r6k0Var = new r6k0(c9c0Var.b.current(), (byte) 20);
                o6x o6xVar = o6x.a;
                rkuVar.b(observableNever.compose(RxMobius.b(builderD.h(RxEventSources.a(new ObservableSource[]{map, map2, map3, Observable.combineLatest(observableD, yoi1.i(r6k0Var, o6xVar), fj10.Q0), observable.map(ok10.P0), zeu0Var.a().debounce(500L, TimeUnit.MILLISECONDS).withLatestFrom(yoi1.i(pno1.j(c9c0Var), o6xVar), sl10.T0)})).b(new a5a1(b5a1Var)), new evo0(new k5a1(), (ya0) null, (puo0) null, false))).doOnSubscribe(wx91.d).doOnDispose(zm5.d).ignoreElements().subscribe());
                return;
            case 3:
                ((u7b1) this.b).a((PlayerState) obj);
                return;
            case 4:
                n57.m("Could not play entity with uri: " + ((xjb1) this.b).d + ", error: " + ((Throwable) obj).getMessage() + " ");
                return;
            case 5:
                Logger.e((Throwable) obj, "AccountSwitching: error fetching close action", new Object[0]);
                ((bkb1) this.b).a.Z0(false, (ny51) null);
                return;
            case 6:
                ((bqb1) ((tp7) this.b).c).a(2, (String) obj);
                return;
            case 7:
                ((sjw0) this.b).j.onNext(u19.e);
                return;
            case 8:
                ((uk4) this.b).v((egi1) obj);
                return;
            case 9:
                pbq pbqVar = ((gdc1) this.b).i;
                kby kbyVar = ((cxc0) obj).f;
                String str = kbyVar.a;
                String str2 = (String) o7h.A0(ihc1.Q0(str, new String[]{":"}, 0, 6));
                String str3 = kbyVar.b;
                vku vkuVar = (vku) pbqVar.c;
                if (ihc1.y0(str3)) {
                    return;
                }
                pbqVar.e = str;
                vkuVar.a(((x390) pbqVar.g).b(new l72(5, str, str2, str3, d3d1.MUSIC_PLAYLIST)).observeOn((Scheduler) pbqVar.X).subscribe(new ddc1(pbqVar, (byte) 0), new ddc1(pbqVar, (byte) 1)));
                vkuVar.a(((FlowableMap) pbqVar.t).subscribe(new ddc1(pbqVar, (byte) 2)));
                return;
            case 10:
                ((zmc1) this.b).b.a.onNext((fpy0) obj);
                return;
            case 11:
                ((anc1) this.b).b.a.onNext((gpy0) obj);
                return;
            case 12:
                ((jcd1) this.b).b(1, (String) obj);
                return;
            case 13:
                ((j6p0) this.b).n();
                return;
            case 14:
                w90 w90Var = (w90) obj;
                vzx vzxVar = (vzx) this.b;
                j62 j62Var = (j62) vzxVar.i;
                up0 up0Var = (up0) vzxVar.t;
                t2j0 t2j0Var = (t2j0) vzxVar.h;
                kt91 kt91Var2 = (kt91) vzxVar.Y;
                zm4 zm4Var = (zm4) vzxVar.X;
                uw7 uw7Var = (mw7) vzxVar.Z;
                l62 l62Var = w90Var.a;
                String str4 = l62Var.b;
                String str5 = l62Var.V0;
                int i = w90Var.b;
                long j = w90Var.c;
                String str6 = "";
                if (ihc1.y0("")) {
                    if (i == 1) {
                        str6 = "like_menu";
                    } else if (i == 2) {
                        str6 = "cancel_like";
                    } else if (i == 3) {
                        str6 = "dislike_menu";
                    } else {
                        if (i != 4) {
                            throw null;
                        }
                        str6 = "cancel_dislike";
                    }
                }
                sp0 sp0VarN = AdFeedbackEvent.n();
                String str7 = l62Var.i;
                AdsModeModel.Product product = l62Var.S0;
                String str8 = l62Var.g;
                String str9 = l62Var.f;
                AdsModeModel.Format format = l62Var.R0;
                sp0VarN.v(str7);
                sp0VarN.s(l62Var.c);
                sp0VarN.q(l62Var.X);
                sp0VarN.n(l62Var.t);
                sp0VarN.r(str4);
                uw7 uw7Var2 = uw7Var;
                AudioManager audioManager = uw7Var2.a;
                double d = uw7Var2.d();
                try {
                    streamMaxVolume = audioManager.getStreamMaxVolume(3);
                    break;
                } catch (NullPointerException unused) {
                    streamMaxVolume = 0;
                }
                sp0VarN.x(d / ((double) streamMaxVolume));
                sp0VarN.w(j);
                String str10 = format.a;
                String str11 = format.a;
                sp0VarN.u(str10);
                sp0VarN.t(str6);
                t2j0Var.a(sp0VarN.build());
                int iC = l1d.C(i);
                if (iC != 0) {
                    if (iC == 1) {
                        j62.i(j62Var, l62Var.i, str5, l62Var.R0, l62Var.S0, false);
                        return;
                    }
                    if (iC != 2) {
                        if (iC == 3) {
                            j62.h(j62Var, l62Var.i, str5, l62Var.R0, l62Var.S0, false);
                            return;
                        } else {
                            eg.o();
                            return;
                        }
                    }
                    ou80 ou80VarH = j62.h(j62Var, l62Var.i, str5, l62Var.R0, l62Var.S0, true);
                    es10 es10Var = zm4Var.d() ? es10.a : fs10.a;
                    if (str9.length() != 0) {
                        str8 = str9;
                    }
                    String str12 = !ihc1.y0(str8) ? str8 : null;
                    String str13 = l62Var.i;
                    String str14 = l62Var.c;
                    String str15 = l62Var.X;
                    String str16 = l62Var.t;
                    String str17 = product.a;
                    Long lValueOf = Long.valueOf(j);
                    double d2 = uw7Var2.d();
                    try {
                        streamMaxVolume3 = audioManager.getStreamMaxVolume(3);
                        break;
                    } catch (NullPointerException unused2) {
                        streamMaxVolume3 = 0;
                    }
                    up0Var.b(es10Var, str12, str13, str14, str15, str16, str4, str5, str11, str17, lValueOf, Double.valueOf(d2 / ((double) streamMaxVolume3)), ou80VarH.a);
                    return;
                }
                if (zm4Var.d()) {
                    j62.i(j62Var, l62Var.i, str5, l62Var.R0, l62Var.S0, true);
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131951845});
                    n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                    er91 er91Var = new er91((fs91) null, "", 2131951845, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                    if (kt91Var2.g()) {
                        kt91Var2.k(er91Var);
                        return;
                    } else {
                        kt91Var2.o(er91Var);
                        return;
                    }
                }
                gs10 gs10Var = gs10.a;
                if (str9.length() != 0) {
                    str8 = str9;
                }
                String str18 = !ihc1.y0(str8) ? str8 : null;
                String str19 = l62Var.i;
                String str20 = l62Var.c;
                String str21 = l62Var.X;
                String str22 = l62Var.t;
                String str23 = product.a;
                Long lValueOf2 = Long.valueOf(j);
                double d3 = uw7Var2.d();
                try {
                    streamMaxVolume2 = audioManager.getStreamMaxVolume(3);
                    break;
                } catch (NullPointerException unused3) {
                    streamMaxVolume2 = 0;
                }
                up0Var.b(gs10Var, str18, str19, str20, str21, str22, str4, str5, str11, str23, lValueOf2, Double.valueOf(d3 / ((double) streamMaxVolume2)), (String) null);
                return;
            case 15:
                ((c1f1) this.b).b.h(((Uri) obj).toString());
                return;
            case 16:
                Logger.e((Throwable) obj, "Error fetching data for " + ((icf1) this.b), new Object[0]);
                return;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                khf1 khf1Var = (lhf1) obj;
                if (khf1Var instanceof khf1) {
                    awa awaVar = (awa) this.b;
                    Intent intent = new Intent("android.intent.action.VIEW", khf1Var.a);
                    View view = awaVar.b;
                    if (intent.resolveActivity(view.getContext().getPackageManager()) != null) {
                        view.getContext().startActivity(intent);
                    }
                    ((lzn0) awaVar.d).e();
                    return;
                }
                return;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ((TouchBlockingFrameLayout) this.b).a = true;
                return;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                nnf1 nnf1Var = (nnf1) this.b;
                if (zBooleanValue) {
                    nnf1Var.Y0().F();
                    return;
                } else {
                    wnh1.H(nnf1Var.Y0());
                    return;
                }
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if80 if80Var = (jf80) obj;
                if (if80Var instanceof if80) {
                    ((ViewGroup) ((l570) ((tpf1) this.b)).a).addView(if80Var.a.d().b, new ViewGroup.LayoutParams(-1, -2));
                    return;
                }
                return;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                ((SingleSubject) this.b).onSuccess((b9h1) obj);
                return;
            case 22:
                h7h1 h7h1Var = (h7h1) this.b;
                zy20 zy20Var = (zy20) h7h1Var.a.get();
                if (((Boolean) obj).booleanValue()) {
                    Iterator it = zy20Var.a.iterator();
                    while (it.hasNext()) {
                        ((yy20) it.next()).a();
                    }
                } else if (!h7h1Var.c) {
                    Iterator it2 = zy20Var.a.iterator();
                    while (it2.hasNext()) {
                        ((yy20) it2.next()).c();
                    }
                }
                h7h1Var.c = false;
                return;
            case 23:
                PlayerState playerState = (PlayerState) obj;
                j8h1 j8h1Var = (j8h1) this.b;
                j8h1Var.b.a = (String) playerState.playbackId().h();
                String strContextUri = (String) playerState.contextMetadata().get("reporting.uri");
                rfb0 rfb0Var = j8h1Var.a;
                if (strContextUri == null || strContextUri.length() == 0) {
                    strContextUri = playerState.contextUri();
                }
                rfb0Var.a = strContextUri;
                return;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                x8h1 x8h1Var = (x8h1) this.b;
                ArrayList arrayList = x8h1Var.d;
                int i2 = x8h1Var.e;
                int i3 = zBooleanValue2 ? 2 : 3;
                x8h1Var.e = i3;
                if (i2 == 1) {
                    if (i3 == 2) {
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            x8h1Var.b((w8h1) it3.next());
                        }
                    } else {
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            x8h1Var.a((w8h1) it4.next());
                        }
                    }
                    arrayList.clear();
                    return;
                }
                return;
            case 25:
                ((AtomicLong) ((kz50) this.b).f).set(System.currentTimeMillis());
                return;
            case 26:
                g9r g9rVar = (g9r) this.b;
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                lzm0 lzm0Var = lzm0.a;
                wo70 wo70Var = (oo70) g9rVar.c;
                if (zBooleanValue3) {
                    wo70Var.a(lzm0Var);
                    return;
                } else {
                    wo70Var.g(lzm0Var);
                    return;
                }
            case 27:
                dfn0 dfn0Var = ((q9l1) this.b).n;
                r160 r160Var = ((z8u) obj).a;
                if (r160Var != null) {
                    bpb1 bpb1Var = dfn0Var.c;
                    s8l1 s8l1Var = new s8l1(r160Var);
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, s8l1Var);
                    return;
                }
                bpb1 bpb1Var2 = dfn0Var.c;
                t8l1 t8l1Var = t8l1.a;
                bpb1Var2.getClass();
                bpb1Var2.m((Object) null, t8l1Var);
                return;
            case 28:
                s981 s981Var = (s981) obj;
                fii1 fii1Var = (fii1) this.b;
                if ((s981Var instanceof q981) || (s981Var instanceof r981)) {
                    fii1Var.getClass();
                    return;
                } else {
                    eg.o();
                    return;
                }
            default:
                y5j1 y5j1Var = (y5j1) this.b;
                boolean z = ((twj1) obj) instanceof rwj1;
                y5j1Var.d1.setVisibility(z ? 0 : 8);
                y5j1Var.b1.setVisibility(z ? 8 : 0);
                return;
        }
    }
}
