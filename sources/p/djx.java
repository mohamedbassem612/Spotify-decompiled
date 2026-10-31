package p;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.TextUnit;
import com.spotify.campaigns.paragraph.view.ParagraphView;
import com.spotify.collection.componentrecycler.ComponentRecyclerAdapter;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.reprise.encorethemeinstaller.EncoreThemeInstaller;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class djx extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djx(i7d i7dVar, if00 if00Var, iu30 iu30Var, LinkedHashMap linkedHashMap) {
        super(1);
        this.a = (byte) 11;
        this.b = i7dVar;
        this.c = iu30Var;
        this.d = linkedHashMap;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComparatorFound */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComponentProducerFound */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComponentViewBinderFound */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComponentViewWrapperFound */
    /* JADX WARN: Code duplicated, block: B:225:0x0698  */
    /* JADX WARN: Code duplicated, block: B:228:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:231:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:290:0x06b4 A[SYNTHETIC] */
    public final Object invoke(Object obj) throws ComponentRecyclerAdapter.DuplicateComponentViewWrapperFound, ComponentRecyclerAdapter.DuplicateComponentProducerFound, ComponentRecyclerAdapter.DuplicateComparatorFound, ComponentRecyclerAdapter.DuplicateComponentViewBinderFound {
        ek60 ek60VarListIterator;
        ek60 ek60Var;
        Set setP1;
        byte b = this.a;
        boolean z = true;
        int i = 0;
        hl51 hl51VarA = null;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                pfo pfoVar = (pfo) obj;
                mhx mhxVar = (mhx) obj4;
                if (pfoVar.equals(pfo.b)) {
                    boolean zJ = ((rsn0) mhxVar.d).j();
                    lzn0 lzn0Var = (lzn0) mhxVar.c;
                    if (zJ) {
                        lzn0Var.e();
                    } else {
                        lzn0Var.f(new dwn0(nik1.z0.a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                    }
                } else {
                    if (!pfoVar.equals(pfo.a)) {
                        eg.o();
                        return null;
                    }
                    y570 y570Var = (y570) obj3;
                    ifl1 ifl1Var = ((l670) obj2).c;
                    if (((j570) y570Var.j().get("shareClick")) != null) {
                        ifl1Var.d(new u570("shareClick", y570Var, gg11.g));
                    }
                }
                return rih1Var;
            case 1:
                View view = (View) obj4;
                v3k v3kVarA = gtl1.a(view);
                view.setTag(2131427576, (v340) obj3);
                return new ht0((EncoreThemeInstaller) obj2, view, v3kVarA);
            case 2:
                float fFloatValue = ((Number) obj).floatValue();
                List listM = p7h.M(new ParagraphView[]{(ParagraphView) obj4, (ParagraphView) obj3});
                ArrayList arrayList = new ArrayList();
                for (biy biyVar : (List) obj2) {
                    r7h.W(p7h.M(new View[]{biyVar.a, biyVar.b}), arrayList);
                }
                Iterator it = o7h.N0(arrayList, listM).iterator();
                while (it.hasNext()) {
                    ((View) it.next()).setTranslationX(fFloatValue);
                }
                return rih1Var;
            case 3:
                hv4 hv4Var = (hv4) obj3;
                return new spu0((fza1) obj4, new q98(dzy.t.a, hv4Var, (yqg) obj2), hv4Var.b());
            case 4:
                int iIntValue = ((Number) obj).intValue();
                i8h1 i8h1Var = ((qpy) obj4).T0;
                ouk0 ouk0Var = (ouk0) obj3;
                Integer numValueOf = Integer.valueOf(iIntValue);
                apd apdVar = (apd) o7h.t0(iIntValue, ((fpd) obj2).getItems());
                String strL = apdVar != null ? l0p1.l(apdVar) : null;
                x6h1 x6h1VarC = ouk0Var.b.c();
                x6h1VarC.i.add(new a7h1("item", (String) null, numValueOf, strL, (String) null));
                x6h1VarC.j = true;
                y6h1 y6h1VarA = x6h1VarC.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = ouk0Var.a;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var.a(), (Set) null);
                return rih1Var;
            case 5:
                c8e1 c8e1Var = (c8e1) obj;
                ((ven0) obj2).setValue(c8e1Var);
                af5 af5Var = c8e1Var.a;
                if (!u890.j(af5Var.b, (String) obj4)) {
                    ((iu30) obj3).invoke(af5Var.b);
                }
                return rih1Var;
            case 6:
                tpy tpyVar = (tpy) obj;
                dqy dqyVar = (dqy) obj4;
                Integer num = dqyVar.c;
                bw91 bw91Var = dqyVar.e;
                bw91 bw91Var2 = dqyVar.d;
                String str = tpyVar.a;
                int iC = l1d.C(tpyVar.d);
                if (iC == 0) {
                    fl51 fl51Var = new fl51(str, tpyVar.b);
                    if (num == null || bw91Var.size() + bw91Var2.size() < num.intValue()) {
                        if (!bw91Var2.isEmpty()) {
                            ek60 ek60VarListIterator2 = bw91Var2.listIterator();
                            while (true) {
                                ek60 ek60Var2 = ek60VarListIterator2;
                                if (ek60Var2.hasNext()) {
                                    if (u890.j(((ll51) ek60Var2.next()).a, str)) {
                                    }
                                }
                            }
                            if (bw91Var.isEmpty()) {
                                bw91Var.add(fl51Var);
                            } else {
                                ek60VarListIterator = bw91Var.listIterator();
                                do {
                                    ek60Var = ek60VarListIterator;
                                    if (ek60Var.hasNext()) {
                                        bw91Var.add(fl51Var);
                                    }
                                } while (!u890.j(((fl51) ek60Var.next()).a, str));
                            }
                        } else if (bw91Var.isEmpty()) {
                            bw91Var.add(fl51Var);
                        } else {
                            ek60VarListIterator = bw91Var.listIterator();
                            do {
                                ek60Var = ek60VarListIterator;
                                if (ek60Var.hasNext()) {
                                    bw91Var.add(fl51Var);
                                }
                            } while (!u890.j(((fl51) ek60Var.next()).a, str));
                        }
                    }
                } else if (iC != 1) {
                    if (iC == 2) {
                        r7h.a0(bw91Var, new kov(str, (byte) 14));
                    } else if (iC == 3) {
                        if (dqyVar.c() && bw91Var2.size() > dqyVar.a && !str.equals(dqyVar.b) && !bw91Var2.isEmpty()) {
                            ek60 ek60VarListIterator3 = bw91Var2.listIterator();
                            while (true) {
                                ek60 ek60Var3 = ek60VarListIterator3;
                                if (ek60Var3.hasNext()) {
                                    if (u890.j(((ll51) ek60Var3.next()).a, str)) {
                                        r7h.a0(bw91Var2, new kov(str, (byte) 13));
                                        hl51VarA = dqyVar.a();
                                    }
                                }
                            }
                        }
                        if (hl51VarA != null) {
                            ((iu30) obj3).invoke(hl51VarA);
                        }
                    } else if (iC != 4) {
                        eg.o();
                        return null;
                    }
                } else if (num != null) {
                    ((iu30) ((yzu) obj2).d).invoke(num);
                }
                return rih1Var;
            case 7:
                uv11 uv11Var = (uv11) obj;
                return new wcm(uv11Var.a, ((lik1) obj4).a, (String) null, (ucm) null, (Function0) null, new ua8((uny) obj3, (Function0) obj2, uv11Var), false, (String) null, (String) null, 988);
            case 8:
                pbq pbqVar = (pbq) obj4;
                qtw qtwVarA = f6o1.A(new ldo((bzo) pbqVar.b, new dgy(3, (Integer) null, (Integer) null)), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
                d0r d0rVar = (d0r) obj3;
                o3r o3rVar = (o3r) pbqVar.e;
                return cso1.y(new bs0(d0rVar, o3rVar, yty.f, qtwVarA), d3p1.F(d0rVar, o3rVar, (String) obj2), yty.g);
            case 9:
                c1i c1iVar = (c1i) obj;
                i5z i5zVar = (i5z) obj4;
                i5zVar.a.getClass();
                c1iVar.a = f5z.a((ir61) obj3);
                jd11 jd11Var = rc11.a;
                c1iVar.a(jd11Var.b(fgc0.class), fgc0.d, new f38(i5zVar.b, (byte) 1), null);
                tka0 tka0VarB = jd11Var.b(r9b0.class);
                a1i a1iVar = r9b0.c;
                v9b0 v9b0Var = i5zVar.c;
                LinkedHashMap linkedHashMap = c1iVar.b;
                if (linkedHashMap.containsKey(tka0VarB)) {
                    throw new ComponentRecyclerAdapter.DuplicateComparatorFound(tka0VarB);
                }
                linkedHashMap.put(tka0VarB, a1iVar);
                LinkedHashMap linkedHashMap2 = c1iVar.e;
                if (linkedHashMap2.containsKey(tka0VarB)) {
                    throw new ComponentRecyclerAdapter.DuplicateComponentViewWrapperFound(tka0VarB);
                }
                linkedHashMap2.put(tka0VarB, v9b0Var);
                c1iVar.f = new h5z((nty) obj2, (byte) 0);
                return rih1Var;
            case 10:
                throw null;
            case 11:
                hf00 hf00Var = (hf00) obj;
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) obj2;
                i7d i7dVar = (i7d) obj4;
                iu30 iu30Var = (iu30) obj3;
                if ((hf00Var instanceof cf00) || (hf00Var instanceof df00)) {
                    throw null;
                }
                if (hf00Var instanceof ef00) {
                    iu30Var.invoke(gh00.a);
                } else {
                    if (hf00Var instanceof ff00) {
                        throw null;
                    }
                    if (!(hf00Var instanceof gf00)) {
                        eg.o();
                        return null;
                    }
                    gf00 gf00Var = (gf00) hf00Var;
                    int i2 = gf00Var.a;
                    tr80 tr80Var = gf00Var.b;
                    if (linkedHashMap3.containsKey(Integer.valueOf(i2))) {
                        tr80 tr80Var2 = (tr80) linkedHashMap3.get(Integer.valueOf(i2));
                        if (tr80Var2 == null || tr80Var2.equals(tr80Var)) {
                            setP1 = w7x.a;
                        } else {
                            Set setB1 = o7h.b1(tr80Var, tr80Var2);
                            linkedHashMap3.put(Integer.valueOf(i2), tr80Var);
                            setP1 = setB1;
                        }
                    } else {
                        linkedHashMap3.put(Integer.valueOf(i2), tr80Var);
                        setP1 = o7h.p1(tr80Var);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it2 = setP1.iterator();
                    while (it2.hasNext()) {
                    }
                    Iterator it3 = o7h.p1(arrayList2).iterator();
                    if (it3.hasNext()) {
                        throw null;
                    }
                }
                return rih1Var;
            case 12:
                AppCompatTextView qq00Var = new qq00((Context) obj, null, 0);
                qq00Var.setClipToOutline(true);
                qq00Var.setTextAppearance(2132018006);
                qq00Var.setLineSpacing(TextUnit.c(fc11.G(2)), 1.0f);
                qq00Var.setTextIsSelectable(false);
                qq00Var.setOnClickListener(new jl5((oq00) obj4, (o0i) obj3, qq00Var, (ven0) obj2, (byte) 5));
                return qq00Var;
            case 13:
                p5t0 p5t0Var = (p5t0) obj;
                float fFloatValue2 = ((Number) ((o95) obj4).e()).floatValue();
                ArrayList arrayList3 = (ArrayList) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                lr80 it4 = yoi1.M(p7h.K(arrayList3)).iterator();
                while (((sr80) it4).c) {
                    int iNextInt = it4.nextInt();
                    p5t0.u(p5t0Var, (q5t0) arrayList3.get(iNextInt), iNextInt == 0 ? 0 : jch0.U(((Number) arrayList4.get(iNextInt)).floatValue() * fFloatValue2), 0, fa00.i, 4);
                }
                return rih1Var;
            case 14:
                Object obj5 = ((e331) obj).a;
                nif1 nif1Var = (nif1) obj3;
                if (((AtomicBoolean) obj4).compareAndSet(false, true)) {
                    nif1Var.e("await_final_response");
                    nif1Var.stop();
                    kj41 kj41Var = (kj41) obj2;
                    kj41Var.setAttribute("outcome", e331.a(obj5) == null ? ((uv00) obj5).c() ? "success" : "partial" : "error");
                    kj41Var.stop();
                }
                return rih1Var;
            case 15:
                re10 re10Var = (re10) obj4;
                cas casVar = (a7m0) obj;
                casVar.a = new hzw(re10Var, (byte) 22);
                qe10 qe10Var = re10Var.b;
                l6s l6sVar = qe10Var.a;
                mr20 mr20VarA = ((ov20) l6sVar.c).a("restrict-showing-your-updates", false);
                o6x o6xVar = o6x.a;
                Observable observableSwitchMap = yoi1.i(mr20VarA, o6xVar).switchMap(new her(l6sVar, (byte) 10));
                ll3 ll3Var = (ll3) l6sVar.a;
                mr20 huzVar = new huz(new p3t(yoi1.g(Observable.combineLatest(observableSwitchMap, yoi1.i(hu20.e(new m441(new hsc(ll3Var, (lnm) null, (byte) 26)), new b7c((lnm) null, ll3Var, (byte) 7)), o6xVar), f331.Z)), (byte) 20), (byte) 3);
                mr20 yc2Var = new yc2(new m441(new tya(o4p1.k(rqt0.u(new mt(qe10Var.b.a, (byte) 9)), -1, 2), (lnm) null, (byte) 4)), (byte) 9);
                FlowEventSources.a.getClass();
                casVar.b = new b(qe10Var.c, new mr20[]{huzVar, yc2Var});
                casVar.d = new mw1((Scheduler) obj3, (byte) 4);
                casVar.e = new mw1((Scheduler) obj2, (byte) 5);
                casVar.a(a9o.P0, xc10.f);
                return rih1Var;
            case 16:
                String strC1 = (String) obj;
                String str2 = (String) obj4;
                StringBuilder sb = new StringBuilder();
                int length = strC1.length();
                while (i < length) {
                    char cCharAt = strC1.charAt(i);
                    if ('0' <= cCharAt && cCharAt < ':') {
                        sb.append(cCharAt);
                    }
                    i++;
                }
                String string = sb.toString();
                if (str2.length() == 4 && string.length() > 4 && ((String) obj3) != null) {
                    int length2 = ihc1.f0(str2, string).length();
                    strC1 = ihc1.c1(4, string.substring(length2, string.length() - ihc1.g0(ihc1.l0(length2, str2), string).length()));
                }
                ((iu30) obj2).invoke(strC1);
                return rih1Var;
            case 17:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                if (((wv10) obj4).t) {
                    ((zv10) obj3).b.k.m((Object) null, bool);
                }
                ((iu30) obj2).invoke(new ev10(zBooleanValue));
                return rih1Var;
            case 18:
                int i3 = (int) (((yr80) obj).a & 4294967295L);
                ven0 ven0Var = (ven0) obj3;
                if (i3 > ((Number) ven0Var.getValue()).intValue() && ((Number) ven0Var.getValue()).intValue() > 0) {
                    fn31.T((c9n) obj4, (o8n) null, 0, new kw10((j5c) obj2, null, (byte) 0), 3);
                }
                ven0Var.setValue(Integer.valueOf(i3));
                return rih1Var;
            case 19:
                kex kexVar = (kex) obj;
                t820 t820Var = (t820) obj4;
                if (t820Var.a) {
                    kexVar.a("ClearButton", new j2i(-1296382837, new vgz((Function0) obj3, (byte) 15), true));
                }
                vu30 vu30Var = (vu30) obj2;
                for (Object obj6 : t820Var.b) {
                    int i4 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    o820 o820Var = (o820) obj6;
                    kexVar.a(o820Var.b, new j2i(-1578096805, new say(o820Var, vu30Var, i, (byte) 6), true));
                    i = i4;
                }
                return rih1Var;
            case 20:
                ArrayList arrayList5 = (ArrayList) obj4;
                ((kex) obj).b(arrayList5.size(), new j2i(-1673449743, new cy00(arrayList5, (k620) obj3, (iu30) obj2, (byte) 3), true), new ib5(arrayList5, (byte) 16));
                return rih1Var;
            case 21:
                ((qtr) obj).b(new v63((iu30) obj4, (iu30) obj3, (ne) obj2, (lnm) null, (byte) 1));
                return rih1Var;
            case 22:
                String str3 = (String) obj;
                e720 e720Var = new e720(new s620(2, (ArrayList) obj4, (ArrayList) obj3));
                b431 b431Var = ((a630) obj2).W0;
                if (b431Var != null) {
                    b431Var.a(e720Var, str3);
                    return rih1Var;
                }
                u890.C("filterAndSortLauncher");
                throw null;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                p5t0 p5t0Var2 = (p5t0) obj;
                q5t0 q5t0Var = (q5t0) obj3;
                q5t0 q5t0Var2 = (q5t0) obj4;
                if (q5t0Var2 != null) {
                    p5t0Var2.k(q5t0Var2, 0, (q5t0Var.b - q5t0Var2.b) / 2, 0.0f);
                }
                p5t0Var2.k(q5t0Var, q5t0Var2 != null ? q5t0Var2.a : 0, 0, 0.0f);
                p5t0Var2.k((q5t0) obj2, 0, q5t0Var.b, 0.0f);
                return rih1Var;
            case 24:
                iac0 iac0Var = (iac0) obj;
                ii30 ii30Var = (ii30) obj4;
                ArrayList arrayList6 = ii30Var.g;
                zf30 zf30Var = (zf30) obj3;
                if (arrayList6.isEmpty()) {
                    z = false;
                } else {
                    Iterator it5 = arrayList6.iterator();
                    do {
                        if (!it5.hasNext()) {
                            z = false;
                        }
                    } while (!u890.j(((mmr0) it5.next()).a, zf30Var.a1));
                }
                if (iac0Var != null && !z) {
                    lj30 lj30VarN0 = zf30Var.n0();
                    lj30VarN0.b();
                    tac0 tac0Var = lj30VarN0.e;
                    if (tac0Var.i.a(w8c0.c)) {
                        tac0Var.a((hac0) ii30Var.i.invoke((hnn0) obj2));
                    }
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new rq30((gqg) obj4, (wh71) obj3, (oud) obj, (q8n) obj2);
            case 26:
                dhl dhlVar = (dhl) obj;
                ube ubeVar = dhlVar.e;
                ihl ihlVar = dhlVar.c;
                zx30 zx30Var = (zx30) obj4;
                if (zx30Var.d.length() > 0) {
                    yf.p(ubeVar, ((ihl) obj3).g, 4.0f, 4);
                } else if (zx30Var.c.length() > 0) {
                    yf.p(ubeVar, ((ihl) obj2).g, 0.0f, 6);
                } else {
                    yf.p(ubeVar, ihlVar.e, 16.0f, 4);
                }
                xid.r(dhlVar.d, ihlVar.d, 16.0f, 4);
                xid.r(dhlVar.f, ihlVar.f, 16.0f, 4);
                yf.p(dhlVar.g, ihlVar.g, 16.0f, 4);
                dhlVar.g(new e5u((p3v) null, "spread"));
                return rih1Var;
            case 27:
                long j = ((Offset) obj).a;
                c5f0 c5f0Var = (c5f0) obj4;
                if (c5f0Var != null) {
                    hrr0 hrr0Var = c5f0Var.a;
                    if (!((Boolean) hrr0Var.getValue()).booleanValue()) {
                        hrr0Var.setValue(Boolean.TRUE);
                        ((Function0) obj3).invoke();
                        ((l811) obj2).a = true;
                    }
                } else {
                    ((Function0) obj3).invoke();
                    ((l811) obj2).a = true;
                }
                return rih1Var;
            case 28:
                long j2 = ((Offset) obj).a;
                ((u5u) obj4).a = null;
                fn31.T((c9n) obj3, (o8n) null, 0, new vj40((pob0) obj2, (lnm) null, (byte) 1), 3);
                return rih1Var;
            default:
                long jB = ((q350) obj4).a.b();
                q811 q811Var = (q811) obj3;
                Long l = (Long) q811Var.a;
                if (jB - (l != null ? l.longValue() : 0L) >= 1000) {
                    q811Var.a = Long.valueOf(jB);
                    ((Function0) obj2).invoke();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ djx(Object obj, Object obj2, Object obj3, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djx(if00 if00Var, xfx xfxVar, p40 p40Var, iu30 iu30Var) {
        super(1);
        this.a = (byte) 10;
        this.b = xfxVar;
        this.c = p40Var;
        this.d = iu30Var;
    }
}
