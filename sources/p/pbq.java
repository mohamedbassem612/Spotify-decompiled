package p;

import android.content.Context;
import android.opengl.Matrix;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.checkout.spotifycheckout.SpotifyCheckoutActivity;
import com.spotify.collection2.itemdata.proto.CollectionItemdata;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.encoreconsumermobile.elements.artwork.ArtworkView;
import com.spotify.encoremobile.component.icons.IconEnhance;
import com.spotify.encoremobile.component.icons.IconSpotifyLogo;
import com.spotify.list_collection.save_source.proto.SaveSource;
import com.spotify.music.SpotifyMainActivity;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.player.model.BitrateLevel;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlaybackQuality;
import com.spotify.puffin.core.data.filtermetadata.database.FilterMetadataDatabase;
import com.spotify.puffin.core.data.headphonefilterstate.database.HeadphoneFilterStateDatabase;
import com.spotify.widgets.npvwidget.WidgetsProxyActivity;
import com.spotify.widgets.npvwidget.k;
import com.spotify.widgets.npvwidget.m;
import com.spotify.widgets.npvwidget.t;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableCreate;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;
import spotify.autodownload.esperanto.proto.EnabledShowsCountRequest;
import spotify.collection.esperanto.proto.CollectionAddRemoveItem;
import spotify.collection.esperanto.proto.CollectionAddRemoveItemsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public class pbq implements dl4, kc91 {
    public Object X;
    public final /* synthetic */ byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public final Object f;
    public final Object g;
    public Object h;
    public final Object i;
    public final Object t;

    public pbq(String str, ArrayList arrayList, koc0 koc0Var, gw70 gw70Var, o5b0 o5b0Var, wmy wmyVar, r6h1 r6h1Var, q8n q8nVar) {
        this.a = (byte) 14;
        this.f = str;
        this.b = arrayList;
        this.g = gw70Var;
        this.h = o5b0Var;
        this.i = wmyVar;
        this.t = r6h1Var;
        int iS = zno1.s(q7h.U(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS < 16 ? 16 : iS);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t1v0 t1v0Var = (t1v0) it.next();
            yd91 yd91VarD = t1v0Var.b.d();
            linkedHashMap.put(t1v0Var.a, new l260((maa) yd91VarD.c.invoke(), yd91VarD.a, yd91VarD.b));
        }
        this.X = linkedHashMap;
        this.c = ((roc0) koc0Var).d();
        xe01 xe01VarT = d5p1.t(new fu20(h4p1.g(new xtz(this, (lnm) null)), new y160(this, (lnm) null, (byte) 2), (byte) 1), smo1.e(q8nVar), new alb1(0L, Long.MAX_VALUE), (Object) null);
        this.d = xe01VarT;
        this.e = d5p1.t(rqt0.u(new xr0(xe01VarT, (byte) 16)), smo1.e(q8nVar), new alb1(0L, Long.MAX_VALUE), Boolean.TRUE);
    }

    public static jo70 H(zlm zlmVar) {
        jo70 jo70Var = (jo70) zlmVar.d.get(l4o1.b0(zlmVar.a));
        return jo70Var == null ? new jo70((String) null, (String) null, (String) null, (List) null, (io70) null, 31) : jo70Var;
    }

    public static String I(zlm zlmVar) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(l4o1.a0(zlmVar.a, ContextTrack$Metadata.KEY_CONTEXT_URI));
        v5b1 v5b1Var = s4b1VarX.d;
        return u890.j(v5b1Var != null ? v5b1Var.getType() : null, wyu0.f) ? uic.y(s4b1VarX.h()).z() : l4o1.a0(zlmVar.a, ContextTrack$Metadata.KEY_CONTEXT_URI);
    }

    public static jo70 J(zlm zlmVar) {
        io70 io70Var = H(zlmVar).e;
        if (io70Var != null) {
            jo70 jo70Var = (jo70) zlmVar.d.get(io70Var.b);
            if (jo70Var != null) {
                return jo70Var;
            }
        }
        return new jo70((String) null, (String) null, (String) null, (List) null, (io70) null, 31);
    }

    public static pbq N(LayoutInflater layoutInflater) {
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131625219, (ViewGroup) null, false);
        int i = 2131427732;
        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131427732);
        if (textView != null) {
            i = 2131429710;
            TextView textView2 = (TextView) m5n1.t(constraintLayoutInflate, 2131429710);
            if (textView2 != null) {
                i = 2131429714;
                IconEnhance iconEnhanceT = m5n1.t(constraintLayoutInflate, 2131429714);
                if (iconEnhanceT != null) {
                    i = 2131429715;
                    IconSpotifyLogo iconSpotifyLogoT = m5n1.t(constraintLayoutInflate, 2131429715);
                    if (iconSpotifyLogoT != null) {
                        i = 2131429948;
                        if (m5n1.t(constraintLayoutInflate, 2131429948) != null) {
                            i = 2131429959;
                            ArtworkView artworkViewT = m5n1.t(constraintLayoutInflate, 2131429959);
                            if (artworkViewT != null) {
                                i = 2131430482;
                                if (((LinearLayout) m5n1.t(constraintLayoutInflate, 2131430482)) != null) {
                                    i = 2131430493;
                                    TextView textView3 = (TextView) m5n1.t(constraintLayoutInflate, 2131430493);
                                    if (textView3 != null) {
                                        ConstraintLayout constraintLayout = constraintLayoutInflate;
                                        i = 2131430725;
                                        TextView textView4 = (TextView) m5n1.t(constraintLayoutInflate, 2131430725);
                                        if (textView4 != null) {
                                            i = 2131431035;
                                            View viewT = m5n1.t(constraintLayoutInflate, 2131431035);
                                            if (viewT != null) {
                                                i = 2131431125;
                                                if (((LinearLayout) m5n1.t(constraintLayoutInflate, 2131431125)) != null) {
                                                    i = 2131431371;
                                                    TextView textView5 = (TextView) m5n1.t(constraintLayoutInflate, 2131431371);
                                                    if (textView5 != null) {
                                                        return new pbq((Object) constraintLayout, (Object) textView, (Object) textView2, (Object) iconEnhanceT, (Object) iconSpotifyLogoT, (Object) artworkViewT, (Object) textView3, (Object) textView4, (Object) viewT, (Object) textView5, (byte) 21);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }

    public static boolean P(zlm zlmVar) {
        return Boolean.parseBoolean((String) zlmVar.a.metadata().get(ContextTrack$Metadata.KEY_IS_ADVERTISEMENT));
    }

    public static boolean Q(zlm zlmVar) {
        return l4o1.u(zlmVar.a) && zlmVar.e == ktl.b;
    }

    public static /* bridge */ /* synthetic */ ivj b(pbq pbqVar) {
        return (ivj) pbqVar.g;
    }

    public static /* bridge */ /* synthetic */ q7r0 d(pbq pbqVar) {
        return (q7r0) pbqVar.b;
    }

    public static /* bridge */ /* synthetic */ dv01 e(pbq pbqVar) {
        return (dv01) pbqVar.h;
    }

    public static /* bridge */ /* synthetic */ cv01 f(pbq pbqVar) {
        return (cv01) pbqVar.f;
    }

    public static final void i(xtb0 xtb0Var, p410 p410Var, b8f1 b8f1Var, hdn0 hdn0Var) {
        if (((err0) xtb0Var.e.b).s() == 0) {
            err0 err0Var = (err0) hdn0Var;
            err0Var.t(((err0) xtb0Var.e.c).s());
            ((bpb1) p410Var.e).m((Object) null, Integer.valueOf(err0Var.s() - ((int) b8f1Var.c.s())));
        }
    }

    public static final /* synthetic */ osm0 j(pbq pbqVar) {
        return (osm0) pbqVar.X;
    }

    public static final /* synthetic */ ttm0 k(pbq pbqVar) {
        return (utm0) pbqVar.d;
    }

    public static l0l l(List list) {
        Object obj;
        Object next;
        List list2 = list;
        Iterator it = list2.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((l0l) next).isActive());
        l0l l0lVar = (l0l) next;
        if (l0lVar != null) {
            return l0lVar;
        }
        for (Object obj2 : list2) {
            if (((l0l) obj2).l()) {
                obj = obj2;
                break;
            }
        }
        return (l0l) obj;
    }

    public static /* synthetic */ Object u(pbq pbqVar, Set set, Set set2, Map map, Map map2, boolean z, onm onmVar, int i) {
        int i2 = i & 8;
        Map map3 = b7x.a;
        if (i2 != 0) {
            map = map3;
        }
        if ((i & 16) != 0) {
            map2 = map3;
        }
        if ((i & 32) != 0) {
            z = false;
        }
        return pbqVar.t(set, set2, map, map2, z, onmVar);
    }

    public static CollectionAddRemoveItemsRequest y(List list, tv80 tv80Var) {
        if (tv80Var != null) {
            oc41 oc41VarP = SaveSource.p();
            oc41VarP.n(tv80Var.a.a);
            SaveSource saveSourceBuild = oc41VarP.build();
            if (saveSourceBuild != null) {
                c0h c0hVarQ = CollectionAddRemoveItemsRequest.q();
                List<String> list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (String str : list2) {
                    b0h b0hVarN = CollectionAddRemoveItem.n();
                    b0hVarN.r(str);
                    h4h h4hVarT = CollectionItemdata.ItemData.t();
                    h4hVarT.r(saveSourceBuild);
                    b0hVarN.q(h4hVarT);
                    arrayList.add(b0hVarN.build());
                }
                c0hVarQ.n(arrayList);
                return c0hVarQ.build();
            }
        }
        c0h c0hVarQ2 = CollectionAddRemoveItemsRequest.q();
        c0hVarQ2.q(list);
        return c0hVarQ2.build();
    }

    public uei0 A() {
        har0 har0Var = new har0(((uk00) this.g).b);
        boolean zD = ((w25) this.i).d();
        yy4 yy4Var = (yy4) this.h;
        return new uei0(true, har0Var, true, false, false, false, zD, yy4Var.e(), yy4Var.c(), 1520);
    }

    public hce1 A0() {
        HeadphoneFilterStateDatabase headphoneFilterStateDatabase = (HeadphoneFilterStateDatabase) ((dlq) this.b).c.get();
        c8o.l(headphoneFilterStateDatabase);
        i7d i7dVar = (i7d) this.f;
        Flowable flowable = (Flowable) i7dVar.N0;
        c8o.l(flowable);
        Scheduler scheduler = (Scheduler) i7dVar.t;
        c8o.l(scheduler);
        na naVar = new na(flowable, scheduler, (byte) 17);
        luk lukVar = (luk) i7dVar.a;
        c8o.l(lukVar);
        x5u x5uVar = new x5u(new ppy0(false, lukVar), (byte) 10);
        c8o.l(scheduler);
        return new hce1(headphoneFilterStateDatabase, naVar, x5uVar, scheduler, (byte) 18);
    }

    public bv01 B() {
        return new bv01((nxo) this.t, (vu01) ((jly0) this.e).get(), q901.j(), (nxo) this.X, Y());
    }

    public cik1 B0() {
        cv01 cv01Var = (cv01) this.f;
        RetrofitMaker retrofitMaker = (RetrofitMaker) cv01Var.t.get();
        c8o.l(retrofitMaker);
        zfm1 zfm1VarB = q901.B(retrofitMaker);
        fns fnsVar = igu.a;
        b3s b3sVar = b3s.c;
        xr01 xr01VarK = cv01Var.k();
        c8o.l(xr01VarK);
        t2j0 t2j0VarB = cv01Var.b();
        c8o.l(t2j0VarB);
        return new cik1(zfm1VarB, b3sVar, xr01VarK, t2j0VarB, (byte) 9);
    }

    public x010 C() {
        ezc ezcVarG = yoi1.g(((g0l) this.g).j());
        b7n b7nVar = (b7n) this.c;
        return new x010(ezcVarG, h5p1.s(b7nVar.a(k6n.a), b7nVar.a(u6n.a), b7nVar.a(v6n.a), new h8f0(4, null)), new w1t(3, (lnm) null, (byte) 1), (byte) 1);
    }

    public zxl1 C0() {
        daq daqVar = (daq) this.b;
        return new zxl1((o241) daqVar.u4.get(), (r241) daqVar.R5.get(), (byte) 5);
    }

    public t1v0 D() {
        Object next;
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            next = it.next();
            l381 l381VarC = ((t1v0) next).b.c();
            i1r i1rVarB = ((rzq) ((wmy) this.i).d).b(l381VarC.b().a(rih1.a));
            if ((i1rVarB instanceof i1r) && l381VarC.t(i1rVarB.a)) {
                return (t1v0) next;
            }
        }
        next = null;
        return (t1v0) next;
    }

    public wr00 E() {
        y390 y390Var = (y390) ((cv01) this.f).A.get();
        c8o.l(y390Var);
        return y390Var.a(Y(), r6h1.c);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        */
    public p.j2i0 F(p.zlm r33) {
        /*
            Method dump skipped, instruction units count: 1492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pbq.F(p.zlm):p.j2i0");
    }

    public yfu G() {
        i7d i7dVar = (i7d) this.f;
        RetrofitMaker retrofitMaker = (RetrofitMaker) i7dVar.d;
        c8o.l(retrofitMaker);
        s920 s920VarR = imy0.r(retrofitMaker);
        Context context = (Context) i7dVar.c;
        c8o.l(context);
        String strW = imy0.w(context);
        dlq dlqVar = (dlq) this.b;
        FilterMetadataDatabase filterMetadataDatabase = (FilterMetadataDatabase) dlqVar.b.get();
        c8o.l(filterMetadataDatabase);
        Scheduler scheduler = (Scheduler) i7dVar.t;
        c8o.l(scheduler);
        return new yfu(s920VarR, new uny(strW, new kp00(filterMetadataDatabase, scheduler, (byte) 15), new vgq0((g420) dlqVar.a.d.get(), (byte) 25)), (byte) 12);
    }

    public ConstraintLayout K() {
        return (ConstraintLayout) this.f;
    }

    public v1r0 L() {
        return (v1r0) this.e;
    }

    public float[] M(l291 l291Var, fwq0 fwq0Var) {
        float[] fArr = (float[]) this.b;
        Matrix.setIdentityM(fArr, 0);
        float[] fArr2 = (float[]) this.f;
        Matrix.setIdentityM(fArr2, 0);
        float[] fArr3 = (float[]) this.i;
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = (float[]) this.g;
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = (float[]) this.h;
        Matrix.setIdentityM(fArr5, 0);
        float[] fArr6 = (float[]) this.t;
        Matrix.setIdentityM(fArr6, 0);
        float[] fArr7 = (float[]) this.X;
        Matrix.setIdentityM(fArr7, 0);
        float[] fArr8 = (float[]) this.c;
        Matrix.setIdentityM(fArr8, 0);
        float[] fArr9 = (float[]) this.d;
        Matrix.setIdentityM(fArr9, 0);
        Pair pairC = fwq0Var.c();
        Matrix.translateM(fArr2, 0, ((Float) pairC.first).floatValue(), ((Float) pairC.second).floatValue(), 0.0f);
        ((l291) this.e).getClass();
        int i = l291Var.a;
        l291 l291Var2 = (l291) this.e;
        float f = i / l291Var2.a;
        float f2 = l291Var.b;
        Matrix.scaleM(fArr, 0, f, f2 / l291Var2.b, 1.0f);
        Pair pairA = fwq0Var.a();
        Matrix.scaleM(fArr4, 0, ((Float) pairA.first).floatValue(), ((Float) pairA.second).floatValue(), 1.0f);
        Matrix.invertM(fArr5, 0, fArr4, 0);
        Pair pairD = fwq0Var.d();
        Matrix.translateM(fArr3, 0, ((Float) pairD.first).floatValue() * (-1.0f), ((Float) pairD.second).floatValue() * (-1.0f), 0.0f);
        Matrix.rotateM(fArr6, 0, fwq0Var.b(), 0.0f, 0.0f, 1.0f);
        Matrix.scaleM(fArr7, 0, f2 / i, 1.0f, 1.0f);
        Matrix.invertM(fArr8, 0, fArr7, 0);
        Matrix.multiplyMM(fArr9, 0, fArr9, 0, fArr2, 0);
        Matrix.multiplyMM(fArr9, 0, fArr9, 0, fArr, 0);
        Matrix.multiplyMM(fArr9, 0, fArr9, 0, fArr4, 0);
        Matrix.multiplyMM(fArr9, 0, fArr9, 0, fArr3, 0);
        Matrix.multiplyMM(fArr9, 0, fArr9, 0, fArr5, 0);
        Matrix.multiplyMM(fArr9, 0, fArr9, 0, fArr7, 0);
        Matrix.multiplyMM(fArr9, 0, fArr9, 0, fArr6, 0);
        Matrix.multiplyMM(fArr9, 0, fArr9, 0, fArr8, 0);
        Matrix.multiplyMM(fArr9, 0, fArr9, 0, fArr4, 0);
        return fArr9;
    }

    public void O() {
        qsm0 qsm0VarA = ((bbr0) this.h).b0(qsm0.class).a();
        this.X = ((msm0) this.f).a(qsm0VarA != null ? qsm0VarA.a : (ign0) ((iu30) this.b).invoke((iac0) this.g));
    }

    public String R(int i, String str, String str2) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            return ((Context) this.f).getString(i, str, str2);
        }
        if (str != null && str.length() != 0) {
            return str;
        }
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        return str2;
    }

    public void S(String str, bum0 bum0Var, List list) {
        faa0 faa0Var;
        zpa1 zpa1Var = (zpa1) ((idd1) this.e).getValue();
        if (zpa1Var != null && (bum0Var instanceof aum0) && u890.j(list, o7h.j0(((av1) this.h).d))) {
            aum0 aum0Var = (aum0) bum0Var;
            List list2 = (List) aum0Var.d.get(str);
            if (list2 != null) {
                cqa1 cqa1Var = (cqa1) this.d;
                List list3 = aum0Var.c;
                cqa1Var.getClass();
                if (list2.isEmpty()) {
                    return;
                }
                String str2 = bo1.a;
                Set set = s4b1.f;
                if (!bo1.a(uic.x(str)) || str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks")) {
                    return;
                }
                if ((nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false)) || bo1.c(str) || (faa0Var = (faa0) cqa1Var.c.put(str, fn31.T(cqa1Var.b, (o8n) null, 0, new bj81((byte) 5, cqa1Var, zpa1Var, str, list3, list2, (lnm) null), 3))) == null) {
                    return;
                }
                faa0Var.d((CancellationException) null);
            }
        }
    }

    public s880 T() {
        cv01 cv01Var = (cv01) this.f;
        ftr ftrVar = (ftr) cv01Var.i.get();
        c8o.l(ftrVar);
        kly0 kly0Var = cv01Var.j;
        Context context = (Context) kly0Var.get();
        c8o.l(context);
        kly0 kly0Var2 = cv01Var.k;
        zwm1 zwm1Var = (zwm1) kly0Var2.get();
        c8o.l(zwm1Var);
        agc0 agc0VarC = cv01Var.c();
        c8o.l(agc0VarC);
        Context context2 = (Context) cv01Var.j.get();
        c8o.l(context2);
        bx5 bx5Var = new bx5(context2.getApplicationContext());
        Context context3 = (Context) kly0Var.get();
        c8o.l(context3);
        iw01 iw01Var = new iw01(zwm1Var, agc0VarC, bx5Var, context3);
        zwm1 zwm1Var2 = (zwm1) kly0Var2.get();
        c8o.l(zwm1Var2);
        Context context4 = (Context) cv01Var.j.get();
        c8o.l(context4);
        bx5 bx5Var2 = new bx5(context4.getApplicationContext());
        Context context5 = (Context) kly0Var.get();
        c8o.l(context5);
        agc0 agc0VarC2 = cv01Var.c();
        c8o.l(agc0VarC2);
        iw01 iw01Var2 = new iw01(zwm1Var2, bx5Var2, context5, agc0VarC2);
        bb01 bb01Var = new bb01(x(), (byte) 1);
        agc0 agc0VarC3 = cv01Var.c();
        c8o.l(agc0VarC3);
        return new s880(ftrVar, context, iw01Var, iw01Var2, bb01Var, agc0VarC3, new cua((byte) 22), q());
    }

    public mr20 U(l0l l0lVar, boolean z) {
        if (l0lVar == null) {
            return new huz((Object) null, (byte) 10);
        }
        if (l0lVar.l()) {
            return new huz(Boolean.valueOf(z), (byte) 10);
        }
        String strJ = l0lVar.j();
        return (strJ == null || strJ.length() == 0) ? new huz((Object) null, (byte) 10) : new rgb(((bah1) this.e).b(l0lVar.j()), (byte) 6);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x023a  */
    /* JADX WARN: Code duplicated, block: B:59:0x023d A[SYNTHETIC] */
    public ArrayList V(yf51 yf51Var, int i, d8r0 d8r0Var, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        cbo cboVarH;
        ArrayList arrayList = yf51Var.c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof ci40) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int i2 = 0;
        for (Object obj2 : arrayList2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            lby lbyVar = ((ci40) obj2).a;
            i53 i53Var = lbyVar.e;
            if (i53Var instanceof i53) {
                n63 n63Var = (n63) this.b;
                cboVarH = cua.h(new gul(n63Var.a(lbyVar, i53Var, z, d8r0Var, str, tb51.g(n63Var.a, lbyVar), i2, Integer.valueOf(i), yf51Var.a)));
            } else if (i53Var instanceof jb6) {
                cboVarH = cua.h(new iul(((gl6) this.h).a(lbyVar, (jb6) i53Var, z, d8r0Var, str, i2, Integer.valueOf(i), yf51Var.a)));
            } else if (i53Var instanceof jjf1) {
                cboVarH = cua.h(new wvl(((ezb1) this.f).h(lbyVar, (jjf1) i53Var, z, z2, d8r0Var, str, i2, Integer.valueOf(i), yf51Var.a, z3, z4)));
            } else if (i53Var instanceof tfu0) {
                yeu0 yeu0Var = (yeu0) this.g;
                Integer numValueOf = Integer.valueOf(i);
                String str2 = yf51Var.a;
                boolean zB = ((fza1) yeu0Var.c).b(lbyVar.a);
                cboVarH = cua.h(new nvl(new fhu0(lbyVar.a, lbyVar.b, tb51.i((tb51) yeu0Var.b, lbyVar, false, zB, 2), lbyVar.c, str, d8r0Var, i2, ((tfu0) i53Var).c, numValueOf, str2, zB, lbyVar.g)));
            } else if (i53Var instanceof v68) {
                zwg zwgVar = (zwg) this.i;
                cboVarH = cua.h(new kul(zwgVar.t(lbyVar, (v68) i53Var, z2, d8r0Var, str, tb51.g((tb51) zwgVar.a, lbyVar), i2, Integer.valueOf(i), yf51Var.a)));
            } else if (i53Var instanceof cu7) {
                yzu yzuVar = (yzu) this.t;
                cboVarH = cua.h(yzuVar.u(lbyVar, (cu7) i53Var, d8r0Var, str, tb51.g((tb51) yzuVar.a, lbyVar), i2, z2, z4, Integer.valueOf(i), yf51Var.a));
            } else if (i53Var instanceof k48) {
                scx0 scx0Var = (scx0) this.X;
                k48 k48Var = (k48) i53Var;
                Integer numValueOf2 = Integer.valueOf(i);
                String str3 = yf51Var.a;
                cboVarH = cua.h(new uvl(new e381(lbyVar.a, lbyVar.b, tb51.g(scx0Var.a, lbyVar), k48Var.b, lbyVar.c, str, d8r0Var, i2, numValueOf2, str3, k48Var.c)));
            } else if (i53Var instanceof i6k) {
                cboVarH = cua.h(new qul(((ln8) this.c).b(lbyVar, (i6k) i53Var, d8r0Var, str, i2, Integer.valueOf(i), yf51Var.a)));
            } else {
                if (i53Var instanceof xui1) {
                    cboVarH = cua.h(new zvl(new svi1(lbyVar.a, lbyVar.b, tb51.g((tb51) ((ltf1) this.d).b, lbyVar), lbyVar.c, d8r0Var, str, i2, Integer.valueOf(i), yf51Var.a)));
                } else if (i53Var instanceof ji40) {
                    bm00 bm00Var = (bm00) this.e;
                    cboVarH = cua.h(new avl(new ri40(lbyVar.a, lbyVar.b, tb51.i((tb51) bm00Var.b, lbyVar, false, false, 6), lbyVar.c, str, d8r0Var, i2, Integer.valueOf(i), yf51Var.a, lbyVar.g)));
                } else {
                    cboVarH = null;
                }
                if (cboVarH != null) {
                    arrayList3.add(cboVarH);
                }
                i2 = i3;
            }
            if (cboVarH != null) {
                arrayList3.add(cboVarH);
            }
            i2 = i3;
        }
        return arrayList3;
    }

    public dp5 W() {
        return new dp5((wu01) ((jly0) this.d).get(), (byte) 28);
    }

    public gfr X() {
        i7d i7dVar = (i7d) this.f;
        g0l g0lVar = (g0l) i7dVar.e;
        c8o.l(g0lVar);
        eqy0 eqy0Var = (eqy0) ((dlq) this.b).f.get();
        c8o.l(eqy0Var);
        na naVar = new na(g0lVar, eqy0Var, (byte) 14);
        Observable observable = (Observable) i7dVar.f;
        c8o.l(observable);
        mw7 mw7Var = (mw7) i7dVar.Q0;
        c8o.l(mw7Var);
        dma1 dma1Var = (dma1) i7dVar.g;
        c8o.l(dma1Var);
        return new gfr(naVar, observable, new na(mw7Var, new t0t(dma1Var), (byte) 19), (byte) 10);
    }

    public iac0 Y() {
        iac0 iac0Var = ((q7r0) this.b).d.c;
        c8o.m(iac0Var);
        return iac0Var;
    }

    public zhq0 Z() {
        lr01 lr01Var = (lr01) ((jly0) this.c).get();
        fns fnsVar = igu.a;
        b3s b3sVar = b3s.c;
        t2j0 t2j0VarB = ((cv01) this.f).b();
        c8o.l(t2j0VarB);
        return new zhq0(lr01Var, t2j0VarB);
    }

    public zob1 a() {
        return (xe01) this.e;
    }

    public poj0 a0() {
        cv01 cv01Var = (cv01) this.f;
        uu00 uu00Var = (uu00) cv01Var.s.get();
        c8o.l(uu00Var);
        fns fnsVar = igu.a;
        b3s b3sVar = b3s.c;
        xr01 xr01VarK = cv01Var.k();
        c8o.l(xr01VarK);
        t2j0 t2j0VarB = cv01Var.b();
        c8o.l(t2j0VarB);
        return new poj0(uu00Var, b3sVar, xr01VarK, t2j0VarB, (byte) 25);
    }

    public tyt0 b0() {
        ynb0 ynb0VarA = xqu.a((nxo) this.i);
        cv01 cv01Var = (cv01) this.f;
        agc0 agc0VarC = cv01Var.c();
        c8o.l(agc0VarC);
        npm1 npm1Var = (npm1) cv01Var.x.get();
        c8o.l(npm1Var);
        g7h g7hVar = (g7h) cv01Var.y.get();
        c8o.l(g7hVar);
        xrc0 xrc0VarD = cv01Var.d();
        c8o.l(xrc0VarD);
        yqg yqgVar = (yqg) cv01Var.a.get();
        c8o.l(yqgVar);
        return new tyt0(ynb0VarA, agc0VarC, npm1Var, g7hVar, xrc0VarD, yqgVar);
    }

    public void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(70457543);
        int i2 = (x340Var.i(this) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            mod.b(oi7.a.a((gw70) this.g), apo.r(917539847, new n260(this, (byte) 1), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n260(this, i);
        }
    }

    public phi0 c0() {
        cv01 cv01Var = (cv01) this.f;
        xrc0 xrc0VarD = cv01Var.d();
        c8o.l(xrc0VarD);
        fns fnsVar = igu.a;
        b3s b3sVar = b3s.c;
        xr01 xr01VarK = cv01Var.k();
        c8o.l(xr01VarK);
        t2j0 t2j0VarB = cv01Var.b();
        c8o.l(t2j0VarB);
        return new phi0(xrc0VarD, (q8n) b3sVar, xr01VarK, t2j0VarB);
    }

    public dxy d0() {
        bn70 bn70VarJ = q901.j();
        fns fnsVar = igu.a;
        b3s b3sVar = b3s.c;
        cv01 cv01Var = (cv01) this.f;
        kv01 kv01Var = (kv01) cv01Var.e.get();
        c8o.l(kv01Var);
        yix0 yix0Var = (yix0) cv01Var.c.get();
        c8o.l(yix0Var);
        xr01 xr01VarK = cv01Var.k();
        c8o.l(xr01VarK);
        t2j0 t2j0VarB = cv01Var.b();
        c8o.l(t2j0VarB);
        return new dxy((Object) bn70VarJ, (Object) b3sVar, (Object) kv01Var, (Object) yix0Var, (Object) xr01VarK, (Object) t2j0VarB, (byte) 19);
    }

    public jkp0 e0() {
        RxRouter rxRouter = (RxRouter) ((i7d) this.f).b;
        c8o.l(rxRouter);
        return imy0.v(rxRouter);
    }

    public l0x0 f0() {
        cv01 cv01Var = (cv01) this.f;
        opm opmVar = (opm) cv01Var.C.get();
        c8o.l(opmVar);
        t2j0 t2j0VarB = cv01Var.b();
        c8o.l(t2j0VarB);
        xr01 xr01VarK = cv01Var.k();
        c8o.l(xr01VarK);
        return new l0x0(opmVar, t2j0VarB, xr01VarK, (byte) 23);
    }

    public void g(al20 al20Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(838715774);
        if ((i & 384) == 0) {
            i2 = (x340Var.i(this) ? 256 : 128) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 129) != 128)) {
            ven0 ven0VarJ = f4p1.j((m441) ((yjq) this.t).f, Boolean.FALSE, (iac0) null, x340Var, 48, 14);
            d36 d36Var = new d36(16.0f, true, new um5(false));
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new dl20(this, (byte) 0);
                x340Var.s0(objT);
            }
            h3h1 h3h1Var = new h3h1((iu30) objT);
            WeakHashMap weakHashMap = osl1.x;
            vk80 vk80VarC = hqq0.C(lhc.g(x340Var).g, x340Var);
            qim0 qim0VarF = u291.f(uyn1.w(bmq0.L(nim0.a, k1o1.q(x340Var), (g6o0) null), uyn1.j(16.0f, 0.0f, 16.0f, 16.0f, 2)), 1.0f);
            boolean zI2 = x340Var.i(ven0VarJ) | x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new zf10(ven0VarJ, this, (byte) 13);
                x340Var.s0(objT2);
            }
            s3o1.d(qim0VarF, (xtb0) null, vk80VarC, d36Var, (nl3) null, (iq20) null, false, h3h1Var, (iu30) objT2, x340Var, 0, 234);
            boolean zI3 = x340Var.i(this);
            Object objT3 = x340Var.T();
            if (zI3 || objT3 == m4cVar) {
                objT3 = new dl20(this, (byte) 2);
                x340Var.s0(objT3);
            }
            qxd0.i(rih1.a, (iu30) objT3, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(this, al20Var, iu30Var, i, (byte) 5);
        }
    }

    public kdy0 g0() {
        ivj ivjVar = (ivj) this.g;
        gw70 gw70VarB = ivjVar.b();
        c8o.l(gw70VarB);
        hyy0 hyy0Var = new hyy0(gw70VarB, new sua((byte) 22), x());
        cv01 cv01Var = (cv01) this.f;
        ycm ycmVar = (ycm) cv01Var.b.get();
        c8o.l(ycmVar);
        kv01 kv01Var = (kv01) cv01Var.e.get();
        c8o.l(kv01Var);
        idd1 idd1Var = new idd1(new vwz0(kv01Var, (byte) 10));
        agc0 agc0VarC = cv01Var.c();
        c8o.l(agc0VarC);
        dp5 dp5VarW = W();
        agc0 agc0VarC2 = cv01Var.c();
        c8o.l(agc0VarC2);
        uxy0 uxy0Var = new uxy0((Object) dp5VarW, (Object) new mta(agc0VarC2, (byte) 22), (byte) 7);
        agc0 agc0VarC3 = cv01Var.c();
        c8o.l(agc0VarC3);
        mta mtaVar = new mta(agc0VarC3, (byte) 22);
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        rwj rwjVar = new rwj(hyy0Var, ycmVar, idd1Var, agc0VarC, uxy0Var, new pux0(mtaVar, new brl0(yon1.E4().c, (byte) 4), (byte) 16));
        gw70 gw70VarB2 = ivjVar.b();
        c8o.l(gw70VarB2);
        y1t0 y1t0Var = new y1t0(gw70VarB2, new sua((byte) 22));
        ycm ycmVar2 = (ycm) cv01Var.b.get();
        c8o.l(ycmVar2);
        kv01 kv01Var2 = (kv01) cv01Var.e.get();
        c8o.l(kv01Var2);
        idd1 idd1Var2 = new idd1(new vwz0(kv01Var2, (byte) 10));
        dp5 dp5VarW2 = W();
        jxa jxaVar = new jxa((byte) 22);
        ov20 ov20Var = (ov20) cv01Var.n.get();
        c8o.l(ov20Var);
        return new kdy0((Object) rwjVar, (Object) new et90(y1t0Var, ycmVar2, idd1Var2, new uxy0(dp5VarW2, jxaVar, ov20Var), new s6z0(new jxa((byte) 22), new brl0(yon1.E4().c, (byte) 4))), (Object) new cx0((byte) 25), (Object) new nu((byte) 27), (byte) 13);
    }

    public void h(int i, j2i j2iVar, b0k b0kVar) {
        pbq pbqVar;
        p410 p410Var;
        xtb0 xtb0Var;
        b8f1 b8f1Var;
        float f;
        wen0 wen0Var;
        b0k b0kVar2;
        tob1 tob1Var;
        drr0 drr0Var;
        pbq pbqVar2 = (pbq) this.b;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(299545716);
        int i2 = i | (b0kVar3.i(this) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            wat watVar = (wat) b0kVar3.k(t4k.h);
            p410 p410Var2 = ((a360) this.i).a;
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                vvu vvuVar = new vvu(d3p1.F((d0r) this.f, lvx.m(), rih1.a), (byte) 20);
                b0kVar3.s0(vvuVar);
                objT = vvuVar;
            }
            Boolean bool = Boolean.FALSE;
            ven0 ven0VarJ = f4p1.j((mr20) objT, bool, (iac0) null, b0kVar3, 48, 14);
            ven0 ven0VarJ2 = f4p1.j(new mt((bpb1) p410Var2.h, (byte) 16), 0, (iac0) null, b0kVar3, 48, 14);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = rqt0.u(new x72(((koc0) this.g).d(), (byte) 21));
                b0kVar3.s0(objT2);
            }
            ven0 ven0VarJ3 = f4p1.j((mr20) objT2, bool, (iac0) null, b0kVar3, 48, 14);
            xtb0 xtb0VarA = aub0.a(0, b0kVar3, 3);
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = bb00.h(0, b0kVar3);
            }
            hdn0 hdn0Var = (hdn0) objT3;
            boolean zG = b0kVar3.g(pbqVar2);
            Object objT4 = b0kVar3.T();
            if (zG || objT4 == m4cVar) {
                bpb1 bpb1VarB = (xe01) pbqVar2.e;
                if (bpb1VarB == null) {
                    bpb1VarB = gio1.b(Boolean.TRUE);
                }
                objT4 = bpb1VarB;
                b0kVar3.s0(objT4);
            }
            ven0 ven0VarK = f4p1.k((zob1) objT4, (iac0) null, b0kVar3, 7);
            boolean zE = b0kVar3.e(((Number) ven0VarJ2.getValue()).intValue());
            Object objT5 = b0kVar3.T();
            if (zE || objT5 == m4cVar) {
                objT5 = new b8f1(-3.4028235E38f, -((Number) ven0VarJ2.getValue()).intValue(), 0.0f);
                b0kVar3.s0(objT5);
            }
            b8f1 b8f1Var2 = (b8f1) objT5;
            on00 on00VarN = kkn.n(b8f1Var2, b0kVar3);
            d260 d260Var = new d260(xtb0VarA, p410Var2, b8f1Var2, hdn0Var);
            Boolean bool2 = (Boolean) ven0VarJ.getValue();
            bool2.getClass();
            Boolean bool3 = (Boolean) ven0VarJ3.getValue();
            bool3.getClass();
            boolean zI = b0kVar3.i(b8f1Var2) | b0kVar3.i(ven0VarJ2);
            Object objT6 = b0kVar3.T();
            if (zI || objT6 == m4cVar) {
                objT6 = new y160(b8f1Var2, ven0VarJ2, (lnm) null, (byte) 0);
                b0kVar3.s0(objT6);
            }
            qxd0.s(bool2, bool3, (vu30) objT6, b0kVar3);
            boolean zI2 = b0kVar3.i(xtb0VarA) | b0kVar3.i(b8f1Var2) | b0kVar3.i(hdn0Var) | b0kVar3.i(p410Var2);
            Object objT7 = b0kVar3.T();
            if (zI2 || objT7 == m4cVar) {
                p410Var = p410Var2;
                lqv lqvVar = new lqv(xtb0VarA, b8f1Var2, p410Var, hdn0Var, (lnm) null, (byte) 21);
                xtb0Var = xtb0VarA;
                b8f1Var = b8f1Var2;
                b0kVar3.s0(lqvVar);
                objT7 = lqvVar;
            } else {
                p410Var = p410Var2;
                xtb0Var = xtb0VarA;
                b8f1Var = b8f1Var2;
            }
            qxd0.s(xtb0Var, b8f1Var, (vu30) objT7, b0kVar3);
            Object objT8 = b0kVar3.T();
            if (objT8 == m4cVar) {
                objT8 = yv91.a(new w77(xtb0Var, ven0VarJ, (byte) 3));
                b0kVar3.s0(objT8);
            }
            tob1 tob1Var2 = (tob1) objT8;
            Object objT9 = b0kVar3.T();
            if (objT9 == m4cVar) {
                f = 0.0f;
                objT9 = us71.i(0.0f, b0kVar3);
            } else {
                f = 0.0f;
            }
            drr0 drr0Var2 = (drr0) objT9;
            Object objT10 = b0kVar3.T();
            if (objT10 == m4cVar) {
                objT10 = us71.i(f, b0kVar3);
            }
            drr0 drr0Var3 = (drr0) objT10;
            b0kVar3.i0(100787409);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(b0kVar3).d;
            float fX0 = watVar.X0(48.0f);
            b0kVar3.r(false);
            float fX1 = watVar.X0(6.0f);
            Object objT11 = b0kVar3.T();
            if (objT11 == m4cVar) {
                objT11 = gio1.b(Float.valueOf(1.0f));
                b0kVar3.s0(objT11);
            }
            wen0 wen0Var2 = (wen0) objT11;
            boolean zI3 = b0kVar3.i(this) | b0kVar3.i(ven0VarK) | b0kVar3.i(drr0Var3) | b0kVar3.i(hdn0Var) | b0kVar3.i(tob1Var2) | b0kVar3.i(b8f1Var) | b0kVar3.d(fX0) | b0kVar3.d(fX1) | b0kVar3.i(wen0Var2);
            Object objT12 = b0kVar3.T();
            if (zI3 || objT12 == m4cVar) {
                wen0Var = wen0Var2;
                b0kVar2 = b0kVar3;
                tob1Var = tob1Var2;
                objT12 = new z160(this, tob1Var, b8f1Var, fX0, fX1, ven0VarK, drr0Var3, hdn0Var, wen0Var, (lnm) null);
                hdn0Var = hdn0Var;
                b0kVar2.s0(objT12);
            } else {
                wen0Var = wen0Var2;
                b0kVar2 = b0kVar3;
                tob1Var = tob1Var2;
            }
            qxd0.s(b8f1Var, pbqVar2, (vu30) objT12, b0kVar2);
            boolean zG2 = b0kVar2.g(wen0Var);
            Object objT13 = b0kVar2.T();
            if (zG2 || objT13 == m4cVar) {
                objT13 = new r2f1(wen0Var);
                b0kVar2.s0(objT13);
            }
            r2f1 r2f1Var = (r2f1) objT13;
            WeakHashMap weakHashMap = osl1.x;
            u85 u85Var = lhc.g(b0kVar2).h;
            gra graVar = een.e;
            boolean zI4 = b0kVar2.i(drr0Var2) | b0kVar2.i(drr0Var3) | b0kVar2.i(u85Var) | b0kVar2.i(watVar);
            Object objT14 = b0kVar2.T();
            if (zI4 || objT14 == m4cVar) {
                lhx lhxVar = new lhx(u85Var, watVar, drr0Var3, drr0Var2, (byte) 15);
                drr0Var = drr0Var2;
                b0kVar2.s0(lhxVar);
                objT14 = lhxVar;
            } else {
                drr0Var = drr0Var2;
            }
            b0k b0kVar4 = b0kVar2;
            pbqVar = this;
            w2g0.c(ern1.x(nim0.a, (iu30) objT14), graVar, apo.r(2119488330, new a260(this, watVar, on00VarN, ven0VarJ2, ven0VarJ, j2iVar, xtb0Var, d260Var, ven0VarJ3, drr0Var3, p410Var, r2f1Var, drr0Var, tob1Var, b8f1Var, hdn0Var), b0kVar4), b0kVar4, 3072, 4);
            b0kVar3 = b0kVar4;
        } else {
            pbqVar = this;
            b0kVar3.b0();
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new jj50(pbqVar, j2iVar, i, (byte) 5);
        }
    }

    public kls0 h0() {
        dp5 dp5VarW = W();
        Context context = (Context) ((cv01) this.f).j.get();
        c8o.l(context);
        return new kls0(dp5VarW, new bw8(context.getApplicationContext()));
    }

    public ytp0 i0() {
        cv01 cv01Var = (cv01) this.f;
        b7r0 b7r0Var = (b7r0) cv01Var.o.get();
        c8o.l(b7r0Var);
        q7r0 q7r0Var = (q7r0) this.b;
        hgd0 hgd0VarF = cv01Var.f();
        c8o.l(hgd0VarF);
        waz0 waz0Var = (waz0) cv01Var.G.get();
        c8o.l(waz0Var);
        return new ytp0((Object) b7r0Var, (Object) q7r0Var, (Object) hgd0VarF, (Object) waz0Var, (Object) q(), (byte) 24);
    }

    public in8 j0() {
        lzn0 lzn0Var = (lzn0) ((cv01) this.f).m.get();
        c8o.l(lzn0Var);
        return new in8(lzn0Var);
    }

    public kdy0 k0() {
        fns fnsVar = igu.a;
        b3s b3sVar = b3s.c;
        c9c c9cVar = new c9c((byte) 24);
        cv01 cv01Var = (cv01) this.f;
        uu00 uu00Var = (uu00) cv01Var.s.get();
        c8o.l(uu00Var);
        xaz0 xaz0Var = new xaz0(c9cVar, new ko71(uu00Var), new twa());
        xr01 xr01VarK = cv01Var.k();
        c8o.l(xr01VarK);
        t2j0 t2j0VarB = cv01Var.b();
        c8o.l(t2j0VarB);
        return new kdy0((Object) b3sVar, (Object) xaz0Var, (Object) xr01VarK, (Object) t2j0VarB, (byte) 15);
    }

    public bf3 l0() {
        yqg yqgVar = (yqg) ((cv01) this.f).a.get();
        c8o.l(yqgVar);
        return new bf3(yqgVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(String str, ArrayList arrayList, tv80 tv80Var, onm onmVar) {
        nbs nbsVar;
        if (onmVar instanceof nbs) {
            nbsVar = (nbs) onmVar;
            int i = nbsVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                nbsVar.e = i - Integer.MIN_VALUE;
            } else {
                nbsVar = new nbs(this, onmVar);
            }
        } else {
            nbsVar = new nbs(this, onmVar);
        }
        Object objJ = nbsVar.c;
        int i2 = nbsVar.e;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleA = ((r5h) this.i).a(y(arrayList, tv80Var));
            nbsVar.a = str;
            nbsVar.b = arrayList;
            nbsVar.e = 1;
            objJ = fc11.j(singleA, nbsVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = nbsVar.b;
            str = nbsVar.a;
            hm5.M(objJ);
        }
        return new aum0(Collections.singletonList(str), null, arrayList, null, 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m0(String str, ArrayList arrayList, tv80 tv80Var, onm onmVar) {
        rbs rbsVar;
        if (onmVar instanceof rbs) {
            rbsVar = (rbs) onmVar;
            int i = rbsVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                rbsVar.e = i - Integer.MIN_VALUE;
            } else {
                rbsVar = new rbs(this, onmVar);
            }
        } else {
            rbsVar = new rbs(this, onmVar);
        }
        Object objJ = rbsVar.c;
        int i2 = rbsVar.e;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleC = ((r5h) this.i).c(y(arrayList, tv80Var));
            rbsVar.a = str;
            rbsVar.b = arrayList;
            rbsVar.e = 1;
            objJ = fc11.j(singleC, rbsVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = rbsVar.b;
            str = rbsVar.a;
            hm5.M(objJ);
        }
        return new aum0(null, Collections.singletonList(str), arrayList, null, 9);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0123  */
    /* JADX WARN: Code duplicated, block: B:52:0x012d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0131  */
    /* JADX WARN: Code duplicated, block: B:57:0x013c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object n(String str, List list, onm onmVar, tv80 tv80Var) {
        obs obsVar;
        String str2;
        tv80 tv80Var2;
        List list2;
        urc0 urc0Var;
        urc0 urc0Var2;
        String str3;
        ly21 ly21Var;
        y0o y0oVar;
        Object objInvoke;
        if (onmVar instanceof obs) {
            obsVar = (obs) onmVar;
            int i = obsVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                obsVar.g = i - Integer.MIN_VALUE;
            } else {
                obsVar = new obs(this, onmVar);
            }
        } else {
            obsVar = new obs(this, onmVar);
        }
        obs obsVar2 = obsVar;
        Object objM = obsVar2.e;
        int i2 = obsVar2.g;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objM);
            zlo zloVar = new zlo(this, str, list, (lnm) null, (byte) 14);
            obsVar2.a = list;
            str2 = str;
            obsVar2.b = str2;
            tv80Var2 = tv80Var;
            obsVar2.c = tv80Var2;
            obsVar2.g = 1;
            objM = rc2.M(10000L, zloVar, obsVar2);
            if (objM != d9nVar) {
                list2 = list;
            }
            return d9nVar;
        }
        if (i2 == 1) {
            tv80 tv80Var3 = obsVar2.c;
            String str4 = obsVar2.b;
            List list3 = obsVar2.a;
            hm5.M(objM);
            tv80Var2 = tv80Var3;
            str2 = str4;
            list2 = list3;
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            urc0Var2 = obsVar2.d;
            str3 = obsVar2.b;
            List list4 = obsVar2.a;
            hm5.M(objM);
        }
        ly21Var = (py21) objM;
        y0oVar = new y0o(str3, urc0Var2, (byte) 25);
        ly21Var.getClass();
        if (ly21Var instanceof ly21) {
            objInvoke = new ztm0(ly21Var.a);
        } else {
            if (ly21Var instanceof oy21) {
                eg.o();
                return null;
            }
            objInvoke = y0oVar.invoke(((oy21) ly21Var).a);
        }
        return (bum0) objInvoke;
        List list5 = (List) objM;
        if (list5.size() == 0) {
            urc0Var = new urc0(list2, z6x.a);
        } else {
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (Object obj : list2) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                if (u890.j(o7h.t0(i3, list5), Boolean.FALSE)) {
                    arrayList.add(obj);
                }
                i3 = i4;
            }
            urc0Var = new urc0(list2, arrayList);
        }
        zxc0 zxc0Var = tv80Var2 != null ? new zxc0(tv80Var2.a) : null;
        List list6 = urc0Var.b;
        if (list6.isEmpty() && !urc0Var.a.isEmpty()) {
            return new aum0(null, null, list2, null, 11);
        }
        xyc0 xyc0Var = (iyc0) this.b;
        av1 av1Var = (av1) this.h;
        String str5 = av1Var.c;
        String str6 = av1Var.e;
        obsVar2.a = null;
        obsVar2.b = str2;
        obsVar2.c = null;
        obsVar2.d = urc0Var;
        obsVar2.g = 2;
        String str7 = str2;
        Object objD = xyc0Var.d(str7, list6, str5, str6, zxc0Var, obsVar2);
        if (objD != d9nVar) {
            urc0Var2 = urc0Var;
            objM = objD;
            str3 = str7;
            ly21Var = (py21) objM;
            y0oVar = new y0o(str3, urc0Var2, (byte) 25);
            ly21Var.getClass();
            if (ly21Var instanceof ly21) {
                objInvoke = new ztm0(ly21Var.a);
            } else {
                if (ly21Var instanceof oy21) {
                    eg.o();
                    return null;
                }
                objInvoke = y0oVar.invoke(((oy21) ly21Var).a);
            }
            return (bum0) objInvoke;
        }
        return d9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n0(String str, List list, onm onmVar, tv80 tv80Var) {
        sbs sbsVar;
        if (onmVar instanceof sbs) {
            sbsVar = (sbs) onmVar;
            int i = sbsVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbsVar.e = i - Integer.MIN_VALUE;
            } else {
                sbsVar = new sbs(this, onmVar);
            }
        } else {
            sbsVar = new sbs(this, onmVar);
        }
        Object objL = sbsVar.c;
        int i2 = sbsVar.e;
        if (i2 == 0) {
            hm5.M(objL);
            xyc0 xyc0Var = (iyc0) this.b;
            sbsVar.a = list;
            sbsVar.b = str;
            sbsVar.e = 1;
            objL = xyc0Var.l(str, list, sbsVar, tv80Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = sbsVar.b;
            list = sbsVar.a;
            hm5.M(objL);
        }
        ly21 ly21Var = (py21) objL;
        r3j r3jVar = new r3j(str, list, (byte) 1);
        ly21Var.getClass();
        if (ly21Var instanceof ly21) {
            return new ztm0(ly21Var.a);
        }
        if (ly21Var instanceof oy21) {
            return r3jVar.invoke(((oy21) ly21Var).a);
        }
        eg.o();
        return null;
    }

    public e4b1 o() {
        aas aasVar = (aas) ((cv01) this.f).F.get();
        c8o.l(aasVar);
        return new e4b1(aasVar, (byte) 8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o0(String str, ArrayList arrayList, tv80 tv80Var, onm onmVar) {
        tbs tbsVar;
        if (onmVar instanceof tbs) {
            tbsVar = (tbs) onmVar;
            int i = tbsVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tbsVar.e = i - Integer.MIN_VALUE;
            } else {
                tbsVar = new tbs(this, onmVar);
            }
        } else {
            tbsVar = new tbs(this, onmVar);
        }
        Object obj = tbsVar.c;
        int i2 = tbsVar.e;
        if (i2 == 0) {
            hm5.M(obj);
            CompletableCreate completableCreateD = j2h1.D(o6x.a, new qpm1((rpm1) this.g, arrayList, tv80Var != null ? new ppm1(tv80Var) : null, (lnm) null));
            tbsVar.a = str;
            tbsVar.b = arrayList;
            tbsVar.e = 1;
            Object objI = fc11.i(completableCreateD, tbsVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = tbsVar.b;
            str = tbsVar.a;
            hm5.M(obj);
        }
        return new aum0(null, Collections.singletonList(str), arrayList, null, 9);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(String str, ArrayList arrayList, tv80 tv80Var, onm onmVar) {
        pbs pbsVar;
        if (onmVar instanceof pbs) {
            pbsVar = (pbs) onmVar;
            int i = pbsVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                pbsVar.e = i - Integer.MIN_VALUE;
            } else {
                pbsVar = new pbs(this, onmVar);
            }
        } else {
            pbsVar = new pbs(this, onmVar);
        }
        Object obj = pbsVar.c;
        int i2 = pbsVar.e;
        if (i2 == 0) {
            hm5.M(obj);
            CompletableCreate completableCreateD = j2h1.D(o6x.a, new qpm1(tv80Var != null ? new ppm1(tv80Var) : null, (rpm1) this.g, arrayList, (lnm) null));
            pbsVar.a = str;
            pbsVar.b = arrayList;
            pbsVar.e = 1;
            Object objI = fc11.i(completableCreateD, pbsVar);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = pbsVar.b;
            str = pbsVar.a;
            hm5.M(obj);
        }
        return new aum0(Collections.singletonList(str), null, arrayList, null, 10);
    }

    public String p0(zlm zlmVar, Function0 function0) {
        jo70 jo70VarH = H(zlmVar);
        ktl ktlVar = zlmVar.e;
        boolean z = zlmVar.f;
        vbs vbsVar = (vbs) this.d;
        j341 j341VarJ = cev0.J(jo70VarH, ktlVar, z, vbsVar.c);
        String strA = j341VarJ != null ? j341VarJ.a(new yih0(this, (byte) 2)) : null;
        if (strA != null) {
            return strA;
        }
        String strS = l0p1.s(H(zlmVar), ktlVar, vbsVar.b && z && vbsVar.c);
        int length = strS.length();
        Object objInvoke = strS;
        if (length == 0) {
            objInvoke = function0.invoke();
        }
        return (String) objInvoke;
    }

    public vh4 q() {
        luk lukVar = (luk) ((cv01) this.f).r.get();
        c8o.l(lukVar);
        return new vh4(lukVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q0(List list, onm onmVar) {
        ubs ubsVar;
        if (onmVar instanceof ubs) {
            ubsVar = (ubs) onmVar;
            int i = ubsVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ubsVar.c = i - Integer.MIN_VALUE;
            } else {
                ubsVar = new ubs(this, onmVar);
            }
        } else {
            ubsVar = new ubs(this, onmVar);
        }
        Object objJ = ubsVar.a;
        int i2 = ubsVar.c;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleA = ((w0r) this.X).a(list);
            ubsVar.c = 1;
            objJ = fc11.j(singleA, ubsVar);
            if (objJ != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objJ);
                return objJ;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objJ);
        yjq yjqVar = (yjq) this.t;
        ubsVar.c = 2;
        Object objD = yjqVar.D((List) objJ, ubsVar);
        return objD == d9nVar ? d9nVar : objD;
    }

    public w35 r() {
        luk lukVar = (luk) ((ttd1) this.b).c.get();
        c8o.l(lukVar);
        return new w35(false, false, false, false, 10, 0, lukVar);
    }

    public void r0(String str) {
        if (str == null) {
            str = "";
        }
        this.b = str;
    }

    public String s(String str, zlm zlmVar) {
        spq0 spq0VarPlaybackQuality;
        PlaybackQuality playbackQuality;
        Context context = (Context) this.f;
        if (((at4) this.b).f() && ((crd) this.c).a() && zlmVar.c) {
            su00 su00Var = zlmVar.b;
            BitrateLevel bitrateLevel = (su00Var == null || (spq0VarPlaybackQuality = su00Var.a.playbackQuality()) == null || (playbackQuality = (PlaybackQuality) spq0VarPlaybackQuality.h()) == null) ? null : playbackQuality.bitrateLevel();
            if (bitrateLevel == BitrateLevel.HIFI || bitrateLevel == BitrateLevel.HIFI_24) {
                String string = context.getString(2131959398, str, context.getString(2131957740));
                string.getClass();
                return string;
            }
        }
        return str;
    }

    public void s0(String str) {
        this.d = str;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01d6 A[Catch: Exception -> 0x0090, TryCatch #0 {Exception -> 0x0090, blocks: (B:19:0x0076, B:53:0x0246, B:44:0x01d0, B:46:0x01d6, B:48:0x01ea, B:49:0x01ee, B:54:0x0250, B:24:0x00b7, B:39:0x019b, B:41:0x01a1, B:42:0x01a4, B:33:0x0138, B:35:0x013e, B:43:0x01af, B:32:0x011a), top: B:87:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:48:0x01ea A[Catch: Exception -> 0x0090, TryCatch #0 {Exception -> 0x0090, blocks: (B:19:0x0076, B:53:0x0246, B:44:0x01d0, B:46:0x01d6, B:48:0x01ea, B:49:0x01ee, B:54:0x0250, B:24:0x00b7, B:39:0x019b, B:41:0x01a1, B:42:0x01a4, B:33:0x0138, B:35:0x013e, B:43:0x01af, B:32:0x011a), top: B:87:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0243  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0191 -> B:39:0x019b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0243 -> B:53:0x0246). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public java.lang.Object t(java.util.Set r24, java.util.Set r25, java.util.Map r26, java.util.Map r27, boolean r28, p.onm r29) {
        /*
            Method dump skipped, instruction units count: 791
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.pbq.t(java.util.Set, java.util.Set, java.util.Map, java.util.Map, boolean, p.onm):java.lang.Object");
    }

    public void t0(String str) {
        if (str == null) {
            str = "";
        }
        this.e = str;
    }

    public void u0(String str) {
        this.h = str;
    }

    public m210 v() {
        return new m210((String) this.f, (String) this.g, (String) this.b, (String) this.h, "", (String) this.i, (String) this.t, (String) this.X, (String) this.c, (String) this.d, (String) this.e);
    }

    public void v0(vir0 vir0Var) {
        this.c = vir0Var;
        z0();
    }

    public void w(Object obj) {
        byte b = this.a;
        Object obj2 = this.t;
        Object obj3 = this.i;
        Object obj4 = this.f;
        Object obj5 = this.g;
        switch (b) {
            case 0:
                SpotifyCheckoutActivity spotifyCheckoutActivity = (SpotifyCheckoutActivity) obj;
                daq daqVar = (daq) this.b;
                spotifyCheckoutActivity.h1 = (j22) daqVar.Io.get();
                spotifyCheckoutActivity.e1 = (jgu) daqVar.a.g0.get();
                bih1 bih1VarC = svf.C((z5p) daqVar.dk.get());
                SpotifyCheckoutActivity spotifyCheckoutActivity2 = (SpotifyCheckoutActivity) obj4;
                f3b1 f3b1Var = (f3b1) spotifyCheckoutActivity2.a1.getValue();
                c8o.m(f3b1Var);
                zxf source = f3b1Var.getSource();
                c8o.m(source);
                spotifyCheckoutActivity.q1 = bih1VarC.e(source, spotifyCheckoutActivity2);
                spotifyCheckoutActivity.k1 = (nww0) daqVar.Jn.get();
                spotifyCheckoutActivity.g1 = (a2k) ((jly0) this.c).get();
                spotifyCheckoutActivity.l1 = svf.o();
                spotifyCheckoutActivity.j1 = (gw70) daqVar.d8.get();
                spotifyCheckoutActivity.i1 = new cua((byte) 19);
                spotifyCheckoutActivity.m1 = x0();
                spotifyCheckoutActivity.o1 = (b2r0) ((jly0) this.d).get();
                spotifyCheckoutActivity.p1 = (gik1) ((jly0) this.e).get();
                f3b1 f3b1Var2 = (f3b1) spotifyCheckoutActivity2.a1.getValue();
                c8o.m(f3b1Var2);
                f3b1 f3b1Var3 = (f3b1) spotifyCheckoutActivity2.a1.getValue();
                c8o.m(f3b1Var3);
                RetrofitMaker retrofitMaker = (RetrofitMaker) daqVar.Y3.get();
                dma1 dma1Var = (dma1) daqVar.C5.get();
                ubm0 ubm0Var = ubm0.a;
                g3b1 g3b1VarA = ubm0.a(retrofitMaker, dma1Var);
                c8o.m(g3b1VarA);
                vhc vhcVar = new vhc((byte) 25);
                String string = ((j0u) daqVar.lh.get()).a.toString();
                c8o.m(string);
                spotifyCheckoutActivity.f1 = new m3b1(f3b1Var2, new kmw(f3b1Var3, g3b1VarA, vhcVar, string, x0()), (Scheduler) daqVar.r3.get(), (Scheduler) daqVar.z1.get());
                break;
            case 1:
                WidgetsProxyActivity widgetsProxyActivity = (WidgetsProxyActivity) obj;
                daq daqVar2 = (daq) this.b;
                ((t3b1) widgetsProxyActivity).b1 = (jgu) daqVar2.a.g0.get();
                ((t3b1) widgetsProxyActivity).c1 = new tuk(xqu.a((obq) obj5));
                Context context = (Context) daqVar2.x1.a;
                lzn0 lzn0Var = (lzn0) ((obq) obj3).get();
                xs80 xs80Var = (xs80) daqVar2.b3.get();
                m mVar = new m((i8h1) daqVar2.A5.get(), (mwn0) daqVar2.Wd.get());
                mwn0 mwn0Var = (mwn0) daqVar2.Wd.get();
                y610 y610Var = (y610) daqVar2.Tf.get();
                ruz ruzVarQ = f2u0.q(xqu.a(daqVar2.Hg), new cve0((yqg) daqVar2.J1.get()));
                m mVar2 = new m((i8h1) daqVar2.A5.get(), (mwn0) daqVar2.Wd.get());
                y210 y210Var = new y210((g510) daqVar2.L5.get(), (q8n) daqVar2.E1.get());
                Context context2 = (Context) daqVar2.x1.a;
                widgetsProxyActivity.f1 = new t(context, lzn0Var, xs80Var, mVar, mwn0Var, new k(y610Var, ruzVarQ, mVar2, y210Var, context2, new vnr(context2), new ae5((t2j0) daqVar2.f2.get()), new gal((Context) daqVar2.x1.a, (oj3) daqVar2.u8.get(), (byte) 17), (xm41) daqVar2.l5.get(), (q8n) daqVar2.E1.get()), (xm41) daqVar2.l5.get(), (obq) obj2, (obq) this.X);
                break;
            default:
                brm1 brm1Var = (brm1) obj;
                teq teqVar = (teq) obj5;
                ((hip) brm1Var).F1 = (jgu) teqVar.b.u.get();
                brm1Var.I1 = (wnh1) ((jly0) this.d).get();
                brm1Var.J1 = (t8h1) ((jly0) this.e).get();
                Observable map = ((o241) C0().b).a("your-episodes-remove-played-episodes", "never").map(c4x0.Z0);
                Observable map2 = ((o241) C0().b).a("your-episodes-remove-unplayed-episodes", "never").map(e4x0.X0);
                daq daqVar3 = (daq) this.b;
                Single singleFirstOrError = Observable.combineLatest(map, map2, ((mt8) daqVar3.Co.get()).a(EnabledShowsCountRequest.n()).map(j561.X).map(b4x0.Y0), a4x0.Y0).firstOrError();
                q1n0 q1n0Var = (q1n0) teqVar.t.get();
                i1n0 i1n0Var = (i1n0) teqVar.H2.get();
                blc0 blc0Var = lqm1.a;
                brm1Var.G1 = new s880(singleFirstOrError, q1n0Var, i1n0Var, kmq0.p((brm1) obj4), new zrj1(new zrj1((xfx) ((p2q) this.h).get(), new h5a1((th30) teqVar.m1.get(), (byte) 29), (gqm1) daqVar3.A9.get(), (byte) 20), new cik1(new cn3((Context) daqVar3.x1.a, false), new oh20((xfx) ((p2q) this.h).get()), new mxa1((i8h1) daqVar3.A5.get(), (z4m0) ((jly0) obj3).get(), (x4m0) ((jly0) obj2).get(), (y4m0) ((jly0) this.X).get()), (t8h1) ((jly0) this.e).get(), (byte) 13), new erm1(new dr41(C0(), (byte) 4), new ep31(C0(), (byte) 7), (lzn0) teqVar.i.get(), (Scheduler) daqVar3.z1.get()), (gqm1) daqVar3.A9.get()));
                brm1Var.H1 = (SpotifyMainActivity) teqVar.f.a;
                break;
        }
    }

    public yt91 w0() {
        cv01 cv01Var = (cv01) this.f;
        uu00 uu00Var = (uu00) cv01Var.s.get();
        c8o.l(uu00Var);
        fns fnsVar = igu.a;
        b3s b3sVar = b3s.c;
        t2j0 t2j0VarB = cv01Var.b();
        c8o.l(t2j0VarB);
        return new yt91(uu00Var, b3sVar, t2j0VarB, (byte) 15);
    }

    public i3h x() {
        cv01 cv01Var = (cv01) this.f;
        Context context = (Context) cv01Var.j.get();
        c8o.l(context);
        ltm1 ltm1Var = (ltm1) cv01Var.l.get();
        c8o.l(ltm1Var);
        agc0 agc0VarC = cv01Var.c();
        c8o.l(agc0VarC);
        return new i3h(context, ltm1Var, agc0VarC);
    }

    public yt91 x0() {
        daq daqVar = (daq) this.b;
        t2j0 t2j0Var = (t2j0) daqVar.f2.get();
        f3b1 f3b1Var = (f3b1) ((SpotifyCheckoutActivity) this.f).a1.getValue();
        c8o.m(f3b1Var);
        return new yt91(t2j0Var, f3b1Var.Z(), (yqg) daqVar.J1.get(), (byte) 17);
    }

    public q3b1 y0() {
        ivj ivjVar = (ivj) this.g;
        gw70 gw70VarB = ivjVar.b();
        pe peVarJ = c13.j(gw70VarB, ivjVar);
        c8o.l(ivjVar.f());
        return new q3b1(gw70VarB, peVarJ);
    }

    public jpg0 z(epb1 epb1Var, d0r d0rVar, xk00 xk00Var, cgi0 cgi0Var) {
        ojv0 ojv0Var = (ojv0) this.e;
        hs00 hs00Var = (hs00) this.X;
        bpb1 bpb1Var = xk00Var.b;
        p731 p731Var = xk00Var.l;
        w25 w25Var = (w25) this.i;
        boolean zE = w25Var.E();
        Object obj = this.t;
        if (zE) {
            wgi0 wgi0Var = (wgi0) this.b;
            n0g0 n0g0Var = new n0g0(0, xk00Var.h, pk00.class, "playerGroupProvider", "playerGroupProvider()Lcom/spotify/multiplayer/multiplayerapi/PlayerGroupProvider;", 0, (byte) 5);
            kko kkoVar = xk00Var.a;
            if (!w25Var.i0()) {
                p731Var = null;
            }
            return new jpg0(new aso(f6o1.A(wgi0Var.b(d0rVar, n0g0Var, kkoVar, p731Var, A(), new wei0(((hl00) this.d).q(), ((yy4) this.h).b(), 4), (16384 & 64) != 0 ? new cgi0(63) : cgi0Var, (16384 & 128) != 0 ? z7i0.g : (Function0) obj, (16384 & 256) != 0 ? null : hs00Var, (16384 & 512) != 0 ? null : new mgi0(xk00Var), (16384 & 1024) != 0 ? null : new ngi0(xk00Var), (16384 & 2048) != 0 ? null : new yih0(this, (byte) 10), ojv0Var, (16384 & 8192) != 0 ? null : bpb1Var, (16384 & 16384) != 0 ? null : null), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new lgi0(this, (byte) 0)), pfi0.f);
        }
        fgi0 fgi0Var = (fgi0) this.f;
        n0g0 n0g0Var2 = new n0g0(0, xk00Var.h, pk00.class, "playerGroupProvider", "playerGroupProvider()Lcom/spotify/multiplayer/multiplayerapi/PlayerGroupProvider;", 0, (byte) 6);
        kko kkoVar2 = xk00Var.a;
        if (!w25Var.i0()) {
            p731Var = null;
        }
        return new jpg0(new aso(f6o1.A(fgi0Var.b(n0g0Var2, epb1Var, kkoVar2, p731Var, A(), cgi0Var, (Function0) obj, hs00Var, new mgi0(xk00Var), new ngi0(xk00Var), new yih0(this, (byte) 10), ojv0Var, bpb1Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new lgi0(this, (byte) 1)), pfi0.g);
    }

    public void z0() {
        w7u0 w7u0Var;
        bbr0 bbr0Var = (bbr0) this.h;
        stm0 stm0VarA = bbr0Var.b0(stm0.class).a();
        if (stm0VarA == null || !stm0VarA.b) {
            w7u0Var = bbr0Var.b0(x7u0.class).a() != null ? w7u0.b : w7u0.a;
        } else {
            w7u0Var = w7u0.c;
        }
        if (!((iac0) this.g).getLifecycle().b().a(w8c0.d) || !j0o1.o((vir0) this.c, w7u0Var)) {
            utm0 utm0Var = (utm0) this.d;
            if (utm0Var != null) {
                utm0Var.d();
            }
            this.d = null;
            return;
        }
        if (((utm0) this.d) != null) {
            return;
        }
        stm0 stm0VarA2 = bbr0Var.b0(stm0.class).a();
        esm0 esm0Var = new esm0((String) ((Function0) this.i).invoke(), new gyq0(this, (byte) 4));
        osm0 osm0Var = (osm0) this.X;
        if (osm0Var != null) {
            this.d = osm0Var.b(esm0Var, stm0VarA2 != null ? stm0VarA2.a : (byte) 3);
        } else {
            u890.C("multiPlayer");
            throw null;
        }
    }

    public pbq(msm0 msm0Var, iu30 iu30Var, iac0 iac0Var, bbr0 bbr0Var, Function0 function0, b7r0 b7r0Var) {
        this.a = (byte) 24;
        this.f = msm0Var;
        this.b = iu30Var;
        this.g = iac0Var;
        this.h = bbr0Var;
        this.i = function0;
        this.t = b7r0Var;
        this.c = new tir0(3);
        iac0Var.getLifecycle().a(new e72(this, (byte) 7));
        this.e = new v1r0(new xy50(this, (byte) 21), new wvq0(this, (byte) 4), new u6j0(this, (byte) 22));
    }

    public pbq(ezb1 ezb1Var, n63 n63Var, yeu0 yeu0Var, gl6 gl6Var, zwg zwgVar, yzu yzuVar, scx0 scx0Var, ln8 ln8Var, ltf1 ltf1Var, bm00 bm00Var, cua cuaVar) {
        this.a = (byte) 12;
        this.f = ezb1Var;
        this.b = n63Var;
        this.g = yeu0Var;
        this.h = gl6Var;
        this.i = zwgVar;
        this.t = yzuVar;
        this.X = scx0Var;
        this.c = ln8Var;
        this.d = ltf1Var;
        this.e = bm00Var;
    }

    public /* synthetic */ pbq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, byte b) {
        this.a = b;
        this.f = obj;
        this.b = obj2;
        this.g = obj3;
        this.h = obj4;
        this.i = obj5;
        this.t = obj6;
        this.X = obj7;
        this.c = obj8;
        this.d = obj9;
        this.e = obj10;
    }

    public pbq(xrc0 xrc0Var, iyc0 iyc0Var, rpm1 rpm1Var, av1 av1Var, agc0 agc0Var, cfr cfrVar, r5h r5hVar, yjq yjqVar, w0r w0rVar, vlo vloVar, xrm1 xrm1Var, cqa1 cqa1Var) {
        this.a = (byte) 6;
        this.f = xrc0Var;
        this.b = iyc0Var;
        this.g = rpm1Var;
        this.h = av1Var;
        this.i = r5hVar;
        this.t = yjqVar;
        this.X = w0rVar;
        this.c = vloVar;
        this.d = cqa1Var;
        this.e = new idd1(new dor(this, (byte) 19));
    }

    public pbq(gdc1 gdc1Var, ua91 ua91Var, x390 x390Var, ua91 ua91Var2, hr0 hr0Var, FlowableMap flowableMap, Scheduler scheduler) {
        this.a = (byte) 28;
        this.f = gdc1Var;
        this.b = ua91Var;
        this.g = x390Var;
        this.h = ua91Var2;
        this.i = hr0Var;
        this.t = flowableMap;
        this.X = scheduler;
        this.c = new vku();
        this.d = new LinkedHashSet();
    }

    public pbq(lik1 lik1Var, i8h1 i8h1Var, los losVar, il20 il20Var, ams amsVar, yjq yjqVar, mhp mhpVar) {
        this.a = (byte) 11;
        this.f = lik1Var;
        this.b = i8h1Var;
        this.g = losVar;
        this.h = il20Var;
        this.i = amsVar;
        this.t = yjqVar;
        this.X = mhpVar;
        this.c = new idd1(new fl20(this, (byte) 1));
        this.d = new idd1(new fl20(this, (byte) 0));
        this.e = new xok0(lik1Var.a, (byte) 1);
    }

    public pbq() {
        this.a = (byte) 23;
        this.b = fn31.A();
        this.f = fn31.A();
        this.i = fn31.A();
        this.t = fn31.A();
        this.g = fn31.A();
        this.h = fn31.A();
        this.X = fn31.A();
        this.c = fn31.A();
        this.d = fn31.A();
    }

    public pbq(Context context, at4 at4Var, yqg yqgVar, ln91 ln91Var, aai0 aai0Var, p370 p370Var, fad0 fad0Var, fza1 fza1Var, crd crdVar, vbs vbsVar) {
        this.a = (byte) 19;
        this.f = context;
        this.b = at4Var;
        this.g = yqgVar;
        this.h = ln91Var;
        this.i = aai0Var;
        this.t = fad0Var;
        this.X = fza1Var;
        this.c = crdVar;
        this.d = vbsVar;
        this.e = new idd1(new tzf0(this, (byte) 29));
    }

    public pbq(iac0 iac0Var, bzo bzoVar, t1p t1pVar, d771 d771Var, ycm ycmVar, yzu yzuVar, f771 f771Var, s1p s1pVar, qe4 qe4Var) {
        this.a = (byte) 8;
        this.f = iac0Var;
        this.b = bzoVar;
        this.g = t1pVar;
        this.h = d771Var;
        this.i = ycmVar;
        this.t = yzuVar;
        this.X = f771Var;
        this.c = s1pVar;
        this.d = qe4Var;
        this.e = w3p1.o(new l4r(new xv00(rc11.a.b(f7l1.class)), 2, lyy.g, new j4r(lyy.i), lyy.h), lyy.t);
    }

    public pbq(yo00 yo00Var, so00 so00Var, rdd1 rdd1Var, int i, int i2, int i3, int i4) {
        this.a = (byte) 29;
        this.f = yo00Var;
        this.g = so00Var;
        this.h = rdd1Var;
        this.i = new dqe1();
        this.t = rdd1Var.a(yo00Var.t, new owu(this, (byte) 4));
        this.X = new zjc1(this, i);
        this.c = new akc1(this, i2);
        this.d = new bkc1(this, i3);
        this.e = new ckc1(this, i4);
        yjc1 yjc1Var = new yjc1(this);
        this.b = yjc1Var;
        yo00Var.m.a(yjc1Var);
    }

    public pbq(ttd1 ttd1Var, zuj zujVar, q7r0 q7r0Var) {
        this.a = (byte) 5;
        this.f = q7r0Var;
        this.b = ttd1Var;
        this.c = iy81.a(new tsq(this, 1, (byte) 1));
        this.d = xqu.b(new tsq(this, 2, (byte) 1));
        this.e = xqu.b(new tsq(this, 5, (byte) 1));
        this.g = xqu.b(new tsq(this, 4, (byte) 1));
        this.h = xqu.b(new tsq(this, 6, (byte) 1));
        this.i = new tsq(this, 3, (byte) 1);
        this.t = new tsq(this, 0, (byte) 1);
        this.X = xqu.b(new tsq(this, 7, (byte) 1));
    }

    public pbq(String str) {
        this.a = (byte) 10;
        this.f = str == null ? "" : str;
        this.b = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.t = "";
        this.X = "";
        this.c = "";
        this.d = "";
        this.e = "";
    }

    public pbq(i7d i7dVar, dlq dlqVar) {
        this.a = (byte) 3;
        this.f = i7dVar;
        this.b = dlqVar;
        this.g = new ykq(this, 1, (byte) 2);
        this.h = new ykq(this, 0, (byte) 2);
        this.i = new ykq(this, 2, (byte) 2);
        this.t = new ykq(this, 3, (byte) 2);
        this.X = new ykq(this, 4, (byte) 2);
        this.c = new ykq(this, 5, (byte) 2);
        this.d = new ykq(this, 6, (byte) 2);
        this.e = new ykq(this, 7, (byte) 2);
    }

    public pbq(cv01 cv01Var, ivj ivjVar, dv01 dv01Var, q7r0 q7r0Var) {
        this.a = (byte) 4;
        this.f = cv01Var;
        this.b = q7r0Var;
        this.g = ivjVar;
        this.h = dv01Var;
        this.c = iy81.a(new nxo(this, 2, (byte) 7));
        this.i = new nxo(this, 3, (byte) 7);
        this.d = xqu.b(new nxo(this, 1, (byte) 7));
        this.t = new nxo(this, 0, (byte) 7);
        this.e = xqu.b(new nxo(this, 4, (byte) 7));
        this.X = new nxo(this, 5, (byte) 7);
    }

    public pbq(yqg yqgVar, d0r d0rVar, pbq pbqVar, roc0 roc0Var, d160 d160Var, a360 a360Var, bpb1 bpb1Var, uu0 uu0Var, top topVar, mr20 mr20Var) {
        this.a = (byte) 13;
        this.f = d0rVar;
        this.b = pbqVar;
        this.g = roc0Var;
        this.h = d160Var;
        this.i = a360Var;
        this.t = bpb1Var;
        this.X = uu0Var;
        this.c = topVar;
        this.d = mr20Var;
        this.e = new kzt(yqgVar);
    }

    public pbq(daq daqVar, SpotifyCheckoutActivity spotifyCheckoutActivity) {
        this.a = (byte) 0;
        this.b = daqVar;
        this.f = spotifyCheckoutActivity;
        byte b = 4;
        this.g = new obq(daqVar, this, 1, b);
        this.h = new obq(daqVar, this, 3, b);
        this.i = new obq(daqVar, this, 2, b);
        this.t = new obq(daqVar, this, b, b);
        this.X = new obq(daqVar, this, 5, b);
        this.c = xqu.b(new obq(daqVar, this, 0, b));
        this.d = xqu.b(new obq(daqVar, this, 6, b));
        this.e = xqu.b(new obq(daqVar, this, 7, b));
    }

    public pbq(daq daqVar, WidgetsProxyActivity widgetsProxyActivity) {
        this.a = (byte) 1;
        this.b = daqVar;
        this.f = widgetsProxyActivity;
        byte b = 10;
        this.c = xqu.b(new obq(daqVar, this, 2, b));
        this.d = xqu.b(new obq(daqVar, this, 1, b));
        this.g = new obq(daqVar, this, 0, b);
        this.e = xqu.b(new obq(daqVar, this, 5, b));
        this.h = xqu.b(new obq(daqVar, this, 4, b));
        this.i = new obq(daqVar, this, 3, b);
        this.t = new obq(daqVar, this, 6, b);
        this.X = new obq(daqVar, this, 7, b);
    }

    public pbq(daq daqVar, teq teqVar, brm1 brm1Var) {
        this.a = (byte) 2;
        this.b = daqVar;
        this.g = teqVar;
        this.f = brm1Var;
        byte b = 15;
        this.c = xqu.b(new p2q(daqVar, teqVar, this, 1, b));
        this.d = xqu.b(new p2q(daqVar, teqVar, this, 0, b));
        this.e = xqu.b(new p2q(daqVar, teqVar, this, 2, b));
        this.h = new p2q(daqVar, teqVar, this, 3, b);
        this.i = xqu.b(new p2q(daqVar, teqVar, this, 4, b));
        this.t = xqu.b(new p2q(daqVar, teqVar, this, 5, b));
        this.X = xqu.b(new p2q(daqVar, teqVar, this, 6, b));
    }
}
