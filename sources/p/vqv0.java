package p;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.Timestamp;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import com.spotify.identity.proto.v3.Identity;
import com.spotify.upcomingreleases.v1.Artist;
import com.spotify.upcomingreleases.v1.GetUpcomingReleasesPageResponse;
import com.spotify.upcomingreleases.v1.ListeningPartiesSection;
import com.spotify.upcomingreleases.v1.ListeningParty;
import com.spotify.upcomingreleases.v1.Prerelease;
import com.spotify.upcomingreleases.v1.PrereleasesSection;
import com.spotify.upcomingreleases.v1.Section;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import j$.time.Instant;
import j$.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vqv0 implements Function, ya, qiw, f601, r6b0, vsa {
    public final /* synthetic */ byte a;
    public final Object b;

    public vqv0(j810 j810Var) {
        this.a = (byte) 3;
        this.b = new h6a(new fu20(new m9r0(o4p1.r(f5p1.m(j810Var.b, rc11.a.b(h810.class)), j810Var.a), this, (byte) 26), new nw5(2, (lnm) null, (byte) 21), (byte) 1), (byte) 11);
    }

    public static w611 q(View view) {
        return RecyclerView.U(view);
    }

    public boolean accept(Object obj) {
        return ((hq4) this.b).a();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0185  */
    public Object apply(Object obj) {
        Single singleJust;
        ii51 ji51Var;
        ii51 ii51Var;
        byte b = this.a;
        byte b2 = 3;
        ii51 ii51Var2 = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                wqv0 wqv0Var = (wqv0) obj2;
                mqv0 mqv0Var = wqv0Var.a;
                if (mqv0Var.c) {
                    singleJust = ((Single) wqv0Var.f.b).flatMap(new k0p1(mqv0Var.a));
                } else {
                    singleJust = Single.just("");
                    singleJust.getClass();
                }
                return singleJust.onErrorReturn(new l1p0(wqv0Var, (byte) 21)).flatMap(new qkn0(wqv0Var, (byte) 28));
            case 1:
                return ((gal) obj2).j((mvv0) obj);
            case 4:
                j8x0 j8x0Var = (j8x0) obj;
                tzr0 tzr0Var = (tzr0) obj2;
                List list = j8x0Var.b;
                if (list.isEmpty()) {
                    return Observable.just(j8x0Var);
                }
                ArrayList<obx0> arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof obx0) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (obx0 obx0Var : arrayList) {
                    Set set = s4b1.f;
                    String strS = uic.x(obx0Var.b).s();
                    mmr0 mmr0Var = strS != null ? new mmr0(obx0Var.b, strS) : null;
                    if (mmr0Var != null) {
                        arrayList2.add(mmr0Var);
                    }
                }
                Map mapT = sqg0.T(arrayList2);
                return ((v5n) tzr0Var.d).d(o7h.j0(mapT.values())).map(new l0x0(j8x0Var, mapT, tzr0Var, (byte) 3));
            case 7:
                w7x w7xVar = (Set) ((cma1) obj).a;
                if (w7xVar == null) {
                    w7xVar = w7x.a;
                }
                return Boolean.valueOf(w7xVar.contains(((m560) obj2).a));
            case 9:
                b5z0 b5z0Var = (b5z0) obj;
                return ((t6z0) obj2).i.b(new oi("queue", false, new hox0(b5z0Var, (byte) 26))).filter(y1x0.d).take(1L).map(new uqv0(b5z0Var, (byte) 10)).onErrorReturn(new mlw0(b5z0Var, (byte) 11));
            case 15:
                return (ObservableSource) ((wvq0) obj2).invoke(obj);
            case 16:
                s211 s211VarA = ((cxc0) obj).f.x.a(s211.class);
                s211VarA.getClass();
                return ((uu00) ((pux0) obj2).c).b(new oi("album", false, new k011(s211VarA.a, (byte) 1))).filter(f2x0.f).timeout(10L, TimeUnit.SECONDS).map(new dgb((byte) 22));
            case 18:
                return rqt0.F(igu.b, new b201((o4e0) obj2, (zc7) obj, (lnm) null, (byte) 22));
            case 19:
                ZoneId zoneId = ((mw11) obj2).c;
                h290<Section> h290VarO = ((GetUpcomingReleasesPageResponse) obj).n().o();
                ArrayList arrayList3 = new ArrayList();
                for (Section section : h290VarO) {
                    int iP = section.p();
                    int i = iP == 0 ? -1 : pnh1.a[l1d.C(iP)];
                    if (i == 1) {
                        PrereleasesSection prereleasesSectionO = section.o();
                        int i2 = pnh1.b[prereleasesSectionO.o().ordinal()];
                        if (i2 == 1) {
                            h290<Prerelease> h290VarP = prereleasesSectionO.p();
                            ArrayList arrayList4 = new ArrayList(q7h.U(h290VarP, 10));
                            for (Prerelease prerelease : h290VarP) {
                                prerelease.getClass();
                                arrayList4.add(ajo1.D(prerelease, false));
                            }
                            ji51Var = new ji51(2, prereleasesSectionO.q().o(), arrayList4);
                        } else if (i2 != 2) {
                            ii51Var = null;
                        } else {
                            h290<Prerelease> h290VarP2 = prereleasesSectionO.p();
                            ArrayList arrayList5 = new ArrayList(q7h.U(h290VarP2, 10));
                            for (Prerelease prerelease2 : h290VarP2) {
                                prerelease2.getClass();
                                arrayList5.add(ajo1.D(prerelease2, true));
                            }
                            ji51Var = new ji51(3, prereleasesSectionO.q().o(), arrayList5);
                        }
                        ii51Var = ji51Var;
                    } else if (i != 2) {
                        ii51Var = ii51Var2;
                    } else {
                        ListeningPartiesSection listeningPartiesSectionN = section.n();
                        if (pnh1.c[listeningPartiesSectionN.o().ordinal()] == 1) {
                            h290 h290VarP3 = listeningPartiesSectionN.p();
                            ArrayList arrayList6 = new ArrayList(q7h.U(h290VarP3, 10));
                            Iterator it = h290VarP3.iterator();
                            while (it.hasNext()) {
                                ListeningParty listeningParty = (ListeningParty) it.next();
                                listeningParty.getClass();
                                String uri = listeningParty.getUri();
                                String imageUrl = listeningParty.getImageUrl();
                                Timestamp timestampN = listeningParty.n();
                                Iterator it2 = it;
                                long epochSecond = Instant.ofEpochSecond(timestampN.q(), timestampN.p()).atZone(zoneId).toEpochSecond();
                                List<Artist> artistsList = listeningParty.getArtistsList();
                                ArrayList arrayList7 = new ArrayList();
                                for (Artist artist : artistsList) {
                                    artist.getClass();
                                    arrayList7.add(new rs6(artist.getUri(), artist.getName(), artist.getImageUrl()));
                                }
                                arrayList6.add(new lkd0(epochSecond, uri, imageUrl, arrayList7));
                                it = it2;
                            }
                            ii51Var = new ii51(arrayList6);
                        } else {
                            ii51Var = null;
                        }
                    }
                    if (ii51Var != null) {
                        arrayList3.add(ii51Var);
                    }
                    ii51Var2 = null;
                }
                return new tnh1(arrayList3);
            case 21:
                j101 j101Var = (j101) obj;
                return rqt0.F(o6x.a, new d821(obj2, (Object) j101Var, (lnm) ii51Var2, b2)).onErrorReturn(new uqv0(j101Var, (byte) 22));
            case 26:
                mot motVar = (mot) ((bo31) obj2).t.invoke(((mn3) obj).d);
                if (motVar.equals(kot.a)) {
                    return jq3.a;
                }
                if (motVar instanceof lot) {
                    lot lotVar = (lot) motVar;
                    return new iq3(lotVar.a, lotVar.b);
                }
                eg.o();
                return null;
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return ((Boolean) obj).booleanValue() ? new i5w0(((u741) obj2).d) : j5.a;
            default:
                va41 va41Var = (va41) obj;
                rn70 rn70VarN = Identity.KidProfile.n();
                rn70VarN.n(va41Var.d);
                Identity.KidProfile kidProfileBuild = rn70VarN.build();
                sn70 sn70VarO = Identity.KidProfileUpdateRequest.o();
                sn70VarO.n(kidProfileBuild);
                Identity.KidProfileUpdateRequest kidProfileUpdateRequestBuild = sn70VarO.build();
                String str = va41Var.c;
                kidProfileUpdateRequestBuild.getClass();
                return ((co70) obj2).c(str, kidProfileUpdateRequestBuild).d(Observable.just(new kb41(true))).onErrorReturn(l9x0.i);
        }
    }

    public void b() {
        ((s141) this.b).b.onNext(new jbl(-1, "Client Disconnected"));
    }

    public void c(iua iuaVar) {
        int i = iuaVar.a;
        s141 s141Var = (s141) this.b;
        if (i == 0) {
            s141Var.b.onNext(ibl.a);
        } else {
            s141Var.b.onNext(new jbl(i, iuaVar.c));
        }
    }

    public void d(View view, int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.addView(view, i);
        w611 w611VarU = RecyclerView.U(view);
        z511 z511Var = recyclerView.P0;
        if (z511Var != null && w611VarU != null) {
            z511Var.t(w611VarU);
        }
        ArrayList arrayList = recyclerView.f1;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((h611) recyclerView.f1.get(size)).c(view);
            }
        }
    }

    public void e(ajn0 ajn0Var, Object obj) {
        cb01 cb01Var = (cb01) this.b;
        String strB = ajn0Var.b();
        if ("k".equals(strB)) {
            if (obj instanceof Integer) {
                h6b0 h6b0Var = (h6b0) h6b0.b.get((Integer) obj);
                if (h6b0Var == null) {
                    h6b0Var = h6b0.UNKNOWN;
                }
                cb01Var.g = h6b0Var;
                return;
            }
            return;
        }
        if ("mv".equals(strB)) {
            if (obj instanceof int[]) {
                cb01Var.a = (int[]) obj;
            }
        } else {
            if ("xs".equals(strB)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    cb01Var.b = str;
                    return;
                }
                return;
            }
            if (!"xi".equals(strB)) {
                "pn".equals(strB);
            } else if (obj instanceof Integer) {
                cb01Var.c = ((Integer) obj).intValue();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x006a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x006b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006b -> B:21:0x006f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object g(p.hp1 r9, p.onm r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p.xd31
            if (r0 == 0) goto L13
            r0 = r10
            p.xd31 r0 = (p.xd31) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            p.xd31 r0 = new p.xd31
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.e
            int r1 = r0.g
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L30
            int r9 = r0.d
            java.util.Iterator r1 = r0.c
            p.p811 r3 = r0.b
            p.hp1 r4 = r0.a
            p.hm5.M(r10)
            r7 = r4
            r4 = r9
            r9 = r7
            goto L6f
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r8)
            r8 = 0
            return r8
        L37:
            p.p811 r10 = p.cy30.u(r10)
            java.util.Set r1 = r9.c
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
        L44:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L82
            java.lang.Object r4 = r1.next()
            p.hmg r4 = (p.hmg) r4
            java.lang.Object r5 = r8.b
            p.iyc0 r5 = (p.iyc0) r5
            java.lang.String r6 = r4.a
            java.util.List r4 = r4.b
            r0.a = r9
            r0.b = r10
            r0.c = r1
            r0.d = r3
            r0.g = r2
            java.lang.Object r4 = p.iyc0.c(r5, r6, r4, r0)
            p.d9n r5 = p.d9n.a
            if (r4 != r5) goto L6b
            return r5
        L6b:
            r7 = r3
            r3 = r10
            r10 = r4
            r4 = r7
        L6f:
            p.py21 r10 = (p.py21) r10
            boolean r5 = r10 instanceof p.ly21
            if (r5 == 0) goto L7f
            java.lang.Object r5 = r3.a
            if (r5 != 0) goto L7f
            p.ly21 r10 = (p.ly21) r10
            p.jy21 r10 = r10.a
            r3.a = r10
        L7f:
            r10 = r3
            r3 = r4
            goto L44
        L82:
            java.lang.Object r8 = r10.a
            if (r8 == 0) goto L8e
            p.ztm0 r9 = new p.ztm0
            p.jy21 r8 = (p.jy21) r8
            r9.<init>(r8)
            goto La1
        L8e:
            p.aum0 r0 = new p.aum0
            java.util.Set r8 = r9.b
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r2 = p.o7h.l1(r8)
            r4 = 0
            r5 = 13
            r1 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            r9 = r0
        La1:
            p.ns1 r8 = new p.ns1
            r8.<init>(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p.vqv0.g(p.hp1, p.onm):java.lang.Object");
    }

    public r6b0 h(heg hegVar, ajn0 ajn0Var) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(v021 v021Var, onm onmVar) {
        j621 j621Var;
        if (onmVar instanceof j621) {
            j621Var = (j621) onmVar;
            int i = j621Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                j621Var.d = i - Integer.MIN_VALUE;
            } else {
                j621Var = new j621(this, onmVar);
            }
        } else {
            j621Var = new j621(this, onmVar);
        }
        Object obj = j621Var.b;
        int i2 = j621Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            Completable completableC = ((byp0) this.b).c(v021Var.a, v021Var.b.c);
            j621Var.a = v021Var;
            j621Var.d = 1;
            Object objI = fc11.i(completableC, j621Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v021Var = j621Var.a;
            hm5.M(obj);
        }
        m0u m0uVar = v021Var.b;
        return new n121(m0uVar.c.a, v021Var.c, m0uVar.f);
    }

    public void j(View view, int i, ViewGroup.LayoutParams layoutParams) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        w611 w611VarU = RecyclerView.U(view);
        if (w611VarU != null) {
            if (!w611VarU.x() && !w611VarU.C()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(w611VarU);
                q58.i(recyclerView.G(), sb);
                return;
            } else {
                if (RecyclerView.c2) {
                    w611VarU.toString();
                }
                w611VarU.t &= -257;
            }
        } else if (RecyclerView.b2) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String strG = recyclerView.G();
            sb2.append(", index: ");
            sb2.append(i);
            sb2.append(strG);
            throw new IllegalArgumentException(sb2.toString());
        }
        RecyclerView.c(recyclerView, view, i, layoutParams);
    }

    public yvd0 k(int i, int i2) {
        Resources resources = (Resources) this.b;
        return new yvd0(resources.getString(i), resources.getString(i2), resources.getString(2131957581), (String) null);
    }

    public void l(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            w611 w611VarU = RecyclerView.U(childAt);
            if (w611VarU != null) {
                if (w611VarU.x() && !w611VarU.C()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(w611VarU);
                    q58.i(recyclerView.G(), sb);
                    return;
                } else {
                    if (RecyclerView.c2) {
                        w611VarU.toString();
                    }
                    w611VarU.j(256);
                }
            }
        } else if (RecyclerView.b2) {
            nkx0.l("No view at offset ", i, recyclerView.G());
            return;
        }
        RecyclerView.d(recyclerView, i);
    }

    public s6b0 m(ajn0 ajn0Var) {
        String strB = ajn0Var.b();
        if ("d1".equals(strB)) {
            return new za01(this, (byte) 0);
        }
        if ("d2".equals(strB)) {
            return new za01(this, (byte) 1);
        }
        return null;
    }

    public View o(int i) {
        return ((RecyclerView) this.b).getChildAt(i);
    }

    public int p() {
        return ((RecyclerView) this.b).getChildCount();
    }

    public int r(View view) {
        return ((RecyclerView) this.b).indexOfChild(view);
    }

    public void s(View view) {
        w611 w611VarU = RecyclerView.U(view);
        if (w611VarU != null) {
            View view2 = w611VarU.a;
            RecyclerView recyclerView = (RecyclerView) this.b;
            int i = w611VarU.Q0;
            if (i != -1) {
                w611VarU.P0 = i;
            } else {
                WeakHashMap weakHashMap = b8k1.a;
                w611VarU.P0 = view2.getImportantForAccessibility();
            }
            if (recyclerView.Y()) {
                w611VarU.Q0 = 4;
                recyclerView.V1.add(w611VarU);
            } else {
                WeakHashMap weakHashMap2 = b8k1.a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public void t() {
        fns fnsVar = igu.a;
        fn31.T(smo1.e(pyf0.a.f), (o8n) null, 0, new kdt0((q401) this.b, (lnm) null, (byte) 9), 3);
    }

    public void u(View view) {
        w611 w611VarU = RecyclerView.U(view);
        if (w611VarU != null) {
            RecyclerView recyclerView = (RecyclerView) this.b;
            int i = w611VarU.P0;
            if (recyclerView.Y()) {
                w611VarU.Q0 = i;
                recyclerView.V1.add(w611VarU);
            } else {
                View view2 = w611VarU.a;
                WeakHashMap weakHashMap = b8k1.a;
                view2.setImportantForAccessibility(i);
            }
            w611VarU.P0 = 0;
        }
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 5:
                kvc1 kvc1Var = (kvc1) obj2;
                kvc1Var.f = ((Boolean) obj).booleanValue();
                kvc1Var.h();
                break;
            default:
                ((EncoreButton) ((sj21) obj2).a.i).setEnabled(((Boolean) obj).booleanValue());
                break;
        }
    }

    public void w() {
        RecyclerView recyclerView = (RecyclerView) this.b;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            recyclerView.v(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
    }

    public void x(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.v(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object y(jru jruVar, onm onmVar) {
        pp21 pp21Var;
        if (onmVar instanceof pp21) {
            pp21Var = (pp21) onmVar;
            int i = pp21Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pp21Var.c = i - Integer.MIN_VALUE;
            } else {
                pp21Var = new pp21(this, onmVar);
            }
        } else {
            pp21Var = new pp21(this, onmVar);
        }
        Object objA = pp21Var.a;
        int i2 = pp21Var.c;
        boolean z = true;
        if (i2 == 0) {
            hm5.M(objA);
            xj61 xj61Var = jruVar.e;
            if (!xj61Var.a.isEmpty()) {
                mar0 mar0Var = (mar0) this.b;
                pp21Var.c = 1;
                objA = mar0Var.a(xj61Var, pp21Var);
                Object obj = d9n.a;
                if (objA == obj) {
                    return obj;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objA);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) objA).entrySet()) {
            if (((Boolean) ((mmr0) entry.getKey()).b).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Collection collectionValues = linkedHashMap.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it = collectionValues.iterator();
            while (it.hasNext()) {
                if (((ams0) it.next()) != ams0.a) {
                    z = false;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public void a() {
    }

    public /* synthetic */ vqv0(mlw0 mlw0Var) {
        this.a = (byte) 8;
        this.b = (dsn1) mlw0Var.b;
    }

    public /* synthetic */ vqv0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public void n(ajn0 ajn0Var, jeg jegVar) {
    }

    public void f(ajn0 ajn0Var, heg hegVar, ajn0 ajn0Var2) {
    }
}
