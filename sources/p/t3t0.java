package p;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.LruCache;
import androidx.compose.ui.geometry.Offset;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.collection.componentrecycler.ComponentRecyclerAdapter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t3t0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3t0(c9n c9nVar, q8n q8nVar, LruCache lruCache, Uri uri, Context context, ven0 ven0Var) {
        super(1);
        this.a = (byte) 10;
        this.b = c9nVar;
        this.c = q8nVar;
        this.d = lruCache;
        this.e = uri;
        this.g = context;
        this.f = ven0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComparatorFound */
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.collection.componentrecycler.ComponentRecyclerAdapter$DuplicateComponentViewWrapperFound */
    /* JADX WARN: Code duplicated, block: B:30:0x0170 A[Catch: all -> 0x0174, TryCatch #0 {all -> 0x0174, blocks: (B:28:0x0165, B:30:0x0170, B:33:0x0176), top: B:81:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0176 A[Catch: all -> 0x0174, TRY_LEAVE, TryCatch #0 {all -> 0x0174, blocks: (B:28:0x0165, B:30:0x0170, B:33:0x0176), top: B:81:0x0165 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Object invoke(Object obj) throws ComponentRecyclerAdapter.DuplicateComponentViewWrapperFound, ComponentRecyclerAdapter.DuplicateComparatorFound {
        mmr0 mmr0Var;
        k3r k3rVar;
        Object obj2;
        y281 y281Var;
        l811 l811Var;
        ssw0 ssw0Var;
        ArrayList arrayList;
        fuu fuuVarG;
        Object obj3 = null;
        switch (this.a) {
            case 0:
                c380 c380Var = (c380) this.b;
                ((rtb0) obj).e(c380Var.size(), new iio0(c380Var, (byte) 9), new iio0(c380Var, (byte) 10), new j2i(802480018, new cbf(c380Var, (Map) this.c, (kly0) this.d, (o0i) this.e, (ven0) this.f, (fvd) this.g, (byte) 3), true));
                return rih1.a;
            case 1:
                c1i c1iVar = (c1i) obj;
                jd11 jd11Var = rc11.a;
                tka0 tka0VarB = jd11Var.b(izf1.class);
                a1i a1iVar = y0w0.a;
                bjx bjxVar = (bjx) this.b;
                xfx xfxVar = (xfx) bjxVar.b;
                c1iVar.a(tka0VarB, a1iVar, new f38(new zfx(xfxVar.c, (byte) 17), (byte) 5), (kui0) this.c);
                c1iVar.a(jd11Var.b(kh51.class), y0w0.b, new f38(new yfx(xfxVar.e, (byte) 1), (byte) 6), (t1i) null);
                tka0 tka0VarB2 = jd11Var.b(r3w0.class);
                a1i a1iVar2 = y0w0.d;
                wfx wfxVar = xfxVar.c;
                c1iVar.a(tka0VarB2, a1iVar2, new f38(new agx(wfxVar, (agx) bjxVar.d, (iac0) bjxVar.e, (gik1) ((kly0) bjxVar.f).get(), new lh2(3, (p3w0) bjxVar.g, p3w0.class, "videoCardImpression", "videoCardImpression(Ljava/lang/String;ILjava/lang/String;)Lcom/spotify/ubi/android/eventdefinitions/UbiImpressionEvent;", 0, (byte) 15), (byte) 1), (byte) 7), (kui0) this.d);
                c1iVar.a(jd11Var.b(mui0.class), y0w0.e, new f38(new zfx(wfxVar, (byte) 6), (byte) 8), (kui0) this.e);
                c1iVar.a(jd11Var.b(szu0.class), y0w0.f, new f38(new zfx(wfxVar, (byte) 16), (byte) 9), (kui0) this.f);
                tka0 tka0VarB3 = jd11Var.b(o4n.class);
                a1i a1iVar3 = y0w0.c;
                p4n p4nVar = (p4n) bjxVar.c;
                LinkedHashMap linkedHashMap = c1iVar.b;
                if (linkedHashMap.containsKey(tka0VarB3)) {
                    throw new ComponentRecyclerAdapter.DuplicateComparatorFound(tka0VarB3);
                }
                linkedHashMap.put(tka0VarB3, a1iVar3);
                LinkedHashMap linkedHashMap2 = c1iVar.e;
                if (linkedHashMap2.containsKey(tka0VarB3)) {
                    throw new ComponentRecyclerAdapter.DuplicateComponentViewWrapperFound(tka0VarB3);
                }
                linkedHashMap2.put(tka0VarB3, p4nVar);
                c1iVar.a(jd11Var.b(ljd0.class), y0w0.g, new f38(bjxVar, (byte) 10), (kui0) this.g);
                return rih1.a;
            case 2:
                List list = (List) this.b;
                ((rtb0) obj).e(list.size(), (iu30) null, new iio0(list, (byte) 13), new j2i(2039820996, new cbf(list, (op41) this.c, (hz5) this.d, (iu30) this.e, (iu30) this.f, (p40) this.g, (byte) 4), true));
                return rih1.a;
            case 3:
                abc0 abc0Var = (abc0) obj;
                abc0Var.c = new pwm0((o0i) this.e, (obl1) this.b, (ven0) this.f, (sd5) this.c, (ven0) this.d, (ven0) this.g, (lnm) null);
                abc0Var.a = new vk1((ven0) this.g, (lnm) null, (byte) 27);
                return rih1.a;
            case 4:
                ji50 ji50Var = (ji50) obj;
                qs11 qs11Var = new qs11((hpc) this.f, (byte) 0);
                w7x w7xVar = w7x.a;
                br11 br11Var = br11.c1;
                rs11 rs11Var = rs11.b;
                LinkedHashMap linkedHashMap3 = ji50Var.b;
                linkedHashMap3.put(bpc.class, r4o1.Q(br11Var, w7xVar, qs11Var, rs11Var));
                linkedHashMap3.put(apc.class, new r3r(new xzq(((zs11) this.c).a(ji50Var.a, (ls11) this.b, (toc) this.d), br11.Y0), h211.d1, 4));
                e4p1.h(ji50Var, (it8) this.e);
                linkedHashMap3.put(cpc.class, r4o1.Q(br11.e1, w7xVar, new jli0((lzn0) this.g, (byte) 1), rs11.c));
                return rih1.a;
            case 5:
                fr21 fr21Var = (fr21) obj;
                String str = fr21Var.a;
                jkr0 jkr0Var = (jkr0) this.b;
                if (!jkr0Var.k.b() && jkr0Var.o() == 1) {
                    ((ven0) this.f).setValue(Boolean.FALSE);
                    nr21 nr21Var = (nr21) this.c;
                    if (nr21Var != null) {
                        int iIndexOf = ((List) this.d).indexOf(fr21Var);
                        if (!nr21Var.c) {
                            i8h1 i8h1Var = nr21Var.a;
                            x6h1 x6h1VarC = nr21Var.b(1).b.c();
                            x6h1VarC.i.add(new a7h1("shows", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC.j = false;
                            y6h1 y6h1VarA = x6h1VarC.a();
                            Integer numValueOf = Integer.valueOf(iIndexOf);
                            x6h1 x6h1VarC2 = y6h1VarA.c();
                            x6h1VarC2.i.add(new a7h1("show_row", (String) null, numValueOf, str, (String) null));
                            x6h1VarC2.j = true;
                            y6h1 y6h1VarA2 = x6h1VarC2.a();
                            b7x b7xVar = b7x.a;
                            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                        }
                    }
                    ((ven0) this.g).setValue(str);
                    fn31.T((c9n) this.e, (o8n) null, 0, new hc60(jkr0Var, (lnm) null, (byte) 4), 3);
                }
                return rih1.a;
            case 6:
                e261 e261Var = (e261) obj;
                fu31 fu31Var = (fu31) this.b;
                if (!fu31Var.b.g) {
                    b261.A(e261Var, (String) this.c);
                }
                String str2 = (String) this.d;
                String str3 = (String) this.e;
                String str4 = (String) this.f;
                iu30 iu30Var = (iu30) this.g;
                smc0 smc0VarN = k4p1.n();
                smc0VarN.add(new epo(str2, new wg31(iu30Var, (byte) 8)));
                if (fu31Var.a > 0) {
                    smc0VarN.add(new epo(str3, new wg31(iu30Var, (byte) 9)));
                }
                if (fu31Var.c != null) {
                    smc0VarN.add(new epo(str4, new wg31(iu30Var, (byte) 10)));
                }
                b261.p(e261Var, k4p1.k(smc0VarN));
                return rih1.a;
            case 7:
                jh5 jh5Var = (jh5) this.b;
                for (Object obj4 : (List) obj) {
                    if (u890.j((jh5) ((mmr0) obj4).a, jh5Var)) {
                        obj3 = obj4;
                        mmr0Var = (mmr0) obj3;
                        if (mmr0Var != null && (k3rVar = (k3r) mmr0Var.b) != null) {
                            obj2 = this.c;
                            y281Var = (y281) this.d;
                            l811Var = (l811) this.e;
                            ssw0Var = (ssw0) this.f;
                            arrayList = (ArrayList) this.g;
                            synchronized (obj2) {
                                try {
                                    y281Var.getClass();
                                    fuuVarG = y281.g(k3rVar);
                                    if (l811Var.a) {
                                        ssw0Var.l(fuuVarG);
                                    } else {
                                        arrayList.add(fuuVarG);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return rih1.a;
                    }
                }
                mmr0Var = (mmr0) obj3;
                if (mmr0Var != null) {
                    obj2 = this.c;
                    y281Var = (y281) this.d;
                    l811Var = (l811) this.e;
                    ssw0Var = (ssw0) this.f;
                    arrayList = (ArrayList) this.g;
                    synchronized (obj2) {
                        y281Var.getClass();
                        fuuVarG = y281.g(k3rVar);
                        if (l811Var.a) {
                            ssw0Var.l(fuuVarG);
                        } else {
                            arrayList.add(fuuVarG);
                        }
                    }
                }
                return rih1.a;
            case 8:
                return hu20.e((mr20) this.b, new m6z((byte) 2, (g891) this.c, (mr20) this.d, (mr20) this.e, (mr20) this.f, (mr20) this.g, (lnm) null));
            case 9:
                Context context = (Context) obj;
                Activity activity = (Activity) context;
                CoordinatorLayout coordinatorLayoutFindViewById = activity.findViewById(2131427752);
                uyb1 uyb1Var = new uyb1(activity, new j2i(-135732336, new j2r0((j2i) this.f, (byte) 21), true), (i8h1) this.b, (l6h1) this.c, (gw70) this.d, (op80) this.e);
                uyb1Var.getViewTreeObserver().addOnGlobalLayoutListener(new ngf((iu30) this.g, uyb1Var, (byte) 3));
                if (uyb1Var.getParent() == null && coordinatorLayoutFindViewById != null) {
                    coordinatorLayoutFindViewById.addView(uyb1Var);
                }
                qyb1 qyb1Var = new qyb1(context, uyb1Var);
                qyb1Var.setVisibility(8);
                qyb1Var.addOnAttachStateChangeListener(new y22(uyb1Var, (byte) 17));
                return qyb1Var;
            case 10:
                return new kcf1(fn31.T((c9n) this.b, (o8n) null, 0, new bj81((q8n) this.c, (LruCache) this.d, (Uri) this.e, (Context) this.g, (ven0) this.f, (lnm) null, (byte) 16), 3), (byte) 8);
            default:
                ((xu30) this.c).invoke(Integer.valueOf(iel1.b((ven0) this.f, (ven0) this.d, (ven0) this.e, (ven0) this.g, Float.intBitsToFloat((int) (((Offset) obj).a >> 32)), (int) (((nav0) this.b).Y0 >> 32))), Boolean.FALSE, ssj0.a);
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3t0(o0i o0iVar, obl1 obl1Var, ven0 ven0Var, sd5 sd5Var, ven0 ven0Var2, ven0 ven0Var3) {
        super(1);
        this.a = (byte) 3;
        this.e = o0iVar;
        this.b = obl1Var;
        this.f = ven0Var;
        this.c = sd5Var;
        this.d = ven0Var2;
        this.g = ven0Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t3t0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3t0(jkr0 jkr0Var, ven0 ven0Var, nr21 nr21Var, List list, c9n c9nVar, ven0 ven0Var2) {
        super(1);
        this.a = (byte) 5;
        this.b = jkr0Var;
        this.f = ven0Var;
        this.c = nr21Var;
        this.d = list;
        this.e = c9nVar;
        this.g = ven0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3t0(nav0 nav0Var, xu30 xu30Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4) {
        super(1);
        this.a = (byte) 11;
        this.b = nav0Var;
        this.c = xu30Var;
        this.f = ven0Var;
        this.d = ven0Var2;
        this.e = ven0Var3;
        this.g = ven0Var4;
    }
}
