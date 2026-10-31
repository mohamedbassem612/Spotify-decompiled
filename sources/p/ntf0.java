package p;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.spotify.betamax.player.exception.UnplayablePlaybackException;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ntf0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ntf0(u601 u601Var, iu30 iu30Var, Object obj, ysw yswVar) {
        super(1);
        this.a = (byte) 3;
        this.c = u601Var;
        this.b = iu30Var;
        this.d = obj;
        this.e = yswVar;
    }

    public final Object invoke(Object obj) {
        ruz ruzVar;
        iac0 iac0Var;
        g5h g5hVar;
        g5h g5hVar2;
        iac0 iac0Var2;
        ruz ruzVar2;
        p6r0 p6r0Var;
        String str;
        tva1 tva1Var;
        tva1 tva1Var2;
        String str2;
        p6r0 p6r0Var2;
        t6k0 t6k0Var;
        int iNextIndex;
        byte b = this.a;
        o6x o6xVar = o6x.a;
        byte b2 = 12;
        byte b3 = 4;
        byte b4 = 0;
        byte b5 = 1;
        byte b6 = 3;
        rih1 rih1Var = rih1.a;
        byte b7 = 2;
        Object obj2 = this.e;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                e261 e261Var = (e261) obj;
                bmf0 bmf0Var = (bmf0) obj4;
                String str3 = bmf0Var.e;
                int length = str3.length();
                String strI = bmf0Var.b;
                if (length > 0) {
                    strI = xcg1.i(strI, ". ", str3);
                }
                b261.n(e261Var, strI);
                if (((ysf0) obj5).l) {
                    Boolean bool = bmf0Var.k;
                    if (bool != null) {
                        b261.y(e261Var, bool.booleanValue());
                    }
                    b261.g(e261Var, (String) obj2, new bsc0((iu30) obj3, bmf0Var, (byte) 21));
                }
                return rih1Var;
            case 1:
                y1g0 y1g0Var = new y1g0((Context) obj, (iu30) obj3);
                y1g0Var.post(new hw9((iu30) obj4, (u1g0) obj5, (ViewGroup.LayoutParams) obj2, y1g0Var, (byte) 9));
                return y1g0Var;
            case 2:
                rtb0 rtb0Var = (rtb0) obj;
                pbq pbqVar = (pbq) obj5;
                nu nuVar = (nu) pbqVar.i;
                cx0 cx0Var = (cx0) pbqVar.h;
                g7g0 g7g0Var = (g7g0) obj4;
                if (g7g0Var.h) {
                    ArrayList arrayList = g7g0Var.i;
                    crn1.j(rtb0Var, "artist", 2131958064, 2131958063, arrayList, cx0Var, nuVar, new j2i(844041382, new t20((lxr0) obj2, arrayList, (byte) 6), true));
                    cx0Var = cx0Var;
                    nuVar = nuVar;
                }
                if (g7g0Var.g) {
                    rtb0Var.d("section_spacer", "spacer", ryi.a);
                }
                if (g7g0Var.e) {
                    ArrayList arrayList2 = g7g0Var.f;
                    crn1.j(rtb0Var, "track", 2131958081, 2131958080, arrayList2, cx0Var, nuVar, new j2i(1936317758, new pj0((vyr0) obj3, g7g0Var, arrayList2, (byte) 2), true));
                }
                return rih1Var;
            case 3:
                FrameLayout frameLayout = (FrameLayout) obj;
                xhk1.f(frameLayout, (u601) obj4);
                frameLayout.setTag(2131428154, (iu30) obj3);
                ((isw) frameLayout.getTag(2131428153)).a(obj5, (ysw) obj2);
                return rih1Var;
            case 4:
                ks6 ks6Var = (ks6) obj4;
                kmy kmyVar = new kmy(1, ((f6h0) obj5).m, sen0.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 8, (byte) 1);
                ruz ruzVarA = ((cyp) obj2).a();
                q7r0 q7r0Var = (q7r0) obj3;
                iac0 iac0Var3 = q7r0Var.d.c;
                String strA = q7r0Var.a();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                p6r0 p6r0VarN2 = yon1.N2();
                otf0 otf0Var = new otf0(kmyVar, b2);
                o4h0 o4h0Var = new o4h0(ks6Var, otf0Var, b5);
                jtg0 jtg0Var = jtg0.Y0;
                bzg0 bzg0Var = bzg0.Z;
                LinkedHashMap linkedHashMap = ((ji50) obj).b;
                w7x w7xVar = w7x.a;
                linkedHashMap.put(n5h0.class, r4o1.P(jtg0Var, w7xVar, o4h0Var, bzg0Var));
                linkedHashMap.put(l5h0.class, r4o1.P(s4h0.g, w7xVar, new n4h0(ks6Var, b6), bzg0.S0));
                linkedHashMap.put(q5h0.class, r4o1.P(s4h0.h, w7xVar, new n4h0(ks6Var, (byte) 5), bzg0.T0));
                linkedHashMap.put(r5h0.class, r4o1.P(jtg0.N0, w7xVar, new n4h0(ks6Var, b4), bzg0.d));
                linkedHashMap.put(s5h0.class, r4o1.P(jtg0.O0, w7xVar, new o4h0(ks6Var, otf0Var, b4), bzg0.e));
                linkedHashMap.put(o5h0.class, r4o1.P(jtg0.Q0, w7xVar, new p4h0(ks6Var, kmyVar, b4), bzg0.f));
                linkedHashMap.put(m5h0.class, r4o1.P(jtg0.S0, w7xVar, new n4h0(ks6Var, b5), bzg0.g));
                linkedHashMap.put(t5h0.class, r4o1.P(jtg0.U0, w7xVar, new p4h0(ks6Var, kmyVar, b5), bzg0.h));
                linkedHashMap.put(y5h0.class, r4o1.P(jtg0.V0, w7xVar, new p4h0(ks6Var, kmyVar, b7), bzg0.i));
                linkedHashMap.put(x5h0.class, r4o1.P(jtg0.X0, w7xVar, new n4h0(ks6Var, b7), bzg0.t));
                linkedHashMap.put(p5h0.class, r4o1.P(jtg0.a1, w7xVar, new p4h0(ks6Var, kmyVar, b6), bzg0.X));
                r1q r1qVar = (r1q) ks6Var.h;
                d0r d0rVar = (d0r) ks6Var.a;
                q4h0 q4h0Var = new q4h0(kmyVar, (byte) 2);
                switch (r1qVar.a) {
                    case 0:
                        i2q i2qVar = (i2q) r1qVar.b;
                        ycm ycmVar = (ycm) i2qVar.c.Z0.get();
                        teq teqVar = i2qVar.b;
                        zwp zwpVar = (zwp) teqVar.qf.get();
                        b0d0 b0d0Var = (b0d0) teqVar.Z6.get();
                        l6q l6qVar = (l6q) teqVar.a.f9.get();
                        daq daqVar = i2qVar.a;
                        g5h g5hVar3 = new g5h(ycmVar, zwpVar, b0d0Var, l6qVar, (me30) daqVar.w7.get(), (mr4) daqVar.ri.get(), d0rVar, ruzVarA, iac0Var3, strA, p6r0VarN2, q4h0Var);
                        ruzVar = ruzVarA;
                        iac0Var = iac0Var3;
                        g5hVar = g5hVar3;
                        break;
                    case 1:
                        r7q r7qVar = r1qVar.b;
                        s7q s7qVar = (s7q) r7qVar.d;
                        ycm ycmVar2 = (ycm) s7qVar.Y4.get();
                        zwp zwpVar2 = (zwp) s7qVar.p5.get();
                        b0d0 b0d0Var2 = (b0d0) s7qVar.z6.get();
                        l6q l6qVar2 = (l6q) s7qVar.H6.get();
                        daq daqVar2 = r7qVar.b;
                        iac0Var2 = iac0Var3;
                        ruzVar2 = ruzVarA;
                        g5hVar2 = new g5h(ycmVar2, zwpVar2, b0d0Var2, l6qVar2, (me30) daqVar2.w7.get(), (mr4) daqVar2.ri.get(), d0rVar, ruzVar2, iac0Var2, strA, p6r0VarN2, q4h0Var);
                        ruzVar = ruzVar2;
                        g5hVar = g5hVar2;
                        iac0Var = iac0Var2;
                        break;
                    default:
                        thq thqVar = (thq) r1qVar.b;
                        teq teqVar2 = thqVar.c;
                        ycm ycmVar3 = (ycm) teqVar2.b.P.get();
                        zwp zwpVar3 = (zwp) teqVar2.qf.get();
                        b0d0 b0d0Var3 = (b0d0) teqVar2.Z6.get();
                        l6q l6qVar3 = (l6q) teqVar2.a.f9.get();
                        daq daqVar3 = thqVar.b;
                        iac0Var2 = iac0Var3;
                        ruzVar2 = ruzVarA;
                        g5hVar2 = new g5h(ycmVar3, zwpVar3, b0d0Var3, l6qVar3, (me30) daqVar3.w7.get(), (mr4) daqVar3.ri.get(), d0rVar, ruzVar2, iac0Var2, strA, p6r0VarN2, q4h0Var);
                        ruzVar = ruzVar2;
                        g5hVar = g5hVar2;
                        iac0Var = iac0Var2;
                        break;
                }
                linkedHashMap.put(i5h0.class, new r3r(new xzq(g5hVar, jtg0.b1), bzg0.Y, 4));
                s1q s1qVar = (s1q) ks6Var.i;
                d0r d0rVar2 = (d0r) ks6Var.a;
                q4h0 q4h0Var2 = new q4h0(kmyVar, b6);
                q4h0 q4h0Var3 = new q4h0(kmyVar, b3);
                switch (s1qVar.a) {
                    case 0:
                        i2q i2qVar2 = (i2q) s1qVar.b;
                        j2q j2qVar = i2qVar2.c;
                        ycm ycmVar4 = (ycm) j2qVar.Z0.get();
                        teq teqVar3 = i2qVar2.b;
                        tva1 tva1Var3 = new tva1(ycmVar4, (l6q) teqVar3.a.f9.get(), (o1q) j2qVar.N2.get(), (zwp) teqVar3.qf.get(), (b0d0) teqVar3.Z6.get(), d0rVar2, ruzVar, iac0Var, strA, p6r0VarN2, q4h0Var2, q4h0Var3);
                        p6r0Var = p6r0VarN2;
                        str = strA;
                        tva1Var = tva1Var3;
                        break;
                    case 1:
                        s7q s7qVar2 = (s7q) s1qVar.b.d;
                        str2 = strA;
                        p6r0Var2 = p6r0VarN2;
                        tva1Var2 = new tva1((ycm) s7qVar2.Y4.get(), (l6q) s7qVar2.H6.get(), (o1q) s7qVar2.D6.get(), (zwp) s7qVar2.p5.get(), (b0d0) s7qVar2.z6.get(), d0rVar2, ruzVar, iac0Var, str2, p6r0Var2, q4h0Var2, q4h0Var3);
                        tva1Var = tva1Var2;
                        p6r0Var = p6r0Var2;
                        str = str2;
                        break;
                    default:
                        teq teqVar4 = ((thq) s1qVar.b).c;
                        str2 = strA;
                        p6r0Var2 = p6r0VarN2;
                        tva1Var2 = new tva1((ycm) teqVar4.b.P.get(), (l6q) teqVar4.a.f9.get(), (o1q) teqVar4.b.D1.get(), (zwp) teqVar4.qf.get(), (b0d0) teqVar4.Z6.get(), d0rVar2, ruzVar, iac0Var, str2, p6r0Var2, q4h0Var2, q4h0Var3);
                        tva1Var = tva1Var2;
                        p6r0Var = p6r0Var2;
                        str = str2;
                        break;
                }
                linkedHashMap.put(v5h0.class, new r3r(new xzq(tva1Var, jtg0.c1), bzg0.N0, 4));
                linkedHashMap.put(k5h0.class, new r3r(new xzq(((o1q) ks6Var.t).a((d0r) ks6Var.a, ruzVar, iac0Var, str, p6r0Var, nik1.w6.a, new q4h0(kmyVar, (byte) 5)), jtg0.e1), bzg0.O0, 4));
                p1q p1qVar = (p1q) ks6Var.X;
                d0r d0rVar3 = (d0r) ks6Var.a;
                q4h0 q4h0Var4 = new q4h0(kmyVar, (byte) 6);
                switch (p1qVar.a) {
                    case 0:
                        t6k0Var = new t6k0((ycm) ((i2q) p1qVar.b).c.Z0.get(), d0rVar3, q4h0Var4);
                        break;
                    case 1:
                        t6k0Var = new t6k0((ycm) ((s7q) p1qVar.b.d).Y4.get(), d0rVar3, q4h0Var4);
                        break;
                    default:
                        t6k0Var = new t6k0((ycm) ((thq) p1qVar.b).c.b.P.get(), d0rVar3, q4h0Var4);
                        break;
                }
                linkedHashMap.put(u5h0.class, new r3r(new xzq(t6k0Var, s4h0.b), bzg0.P0, 4));
                linkedHashMap.put(w5h0.class, r4o1.P(s4h0.d, w7xVar, new p4h0(ks6Var, kmyVar, b3), bzg0.Q0));
                linkedHashMap.put(j5h0.class, r4o1.P(s4h0.f, w7xVar, new n4h0(ks6Var, b3), bzg0.R0));
                return rih1Var;
            case 5:
                return new qsc0(d3p1.F((d0r) obj, (o3r) obj5, (String) obj2), (q0i0) obj4, obj3, (byte) 7);
            case 6:
                jd6 jd6Var = (jd6) obj4;
                return h5p1.r(new p1e0(d3p1.F((d0r) jd6Var.b, jd6Var.c, (mey0) obj), (byte) 9), ((nwt) obj5).a(), ((clm) obj2).a, ((kko) jd6Var.f).a(), new k1((kai0) obj3, (lnm) null, (byte) 16));
            case 7:
                gei0 gei0Var = (gei0) obj4;
                return z8p1.n((mey0) obj, (clm) obj5, (epb1) obj2, (nwt) obj3, (kko) null, false, false, false, false, false, false, false, false, false, (ytp0) null, (uvy) null, true, gei0Var.b, gei0Var.c, 1572464);
            case 8:
                ((qtr) obj).b(new fei0((lo60) obj4, (vgm) obj5, (vu30) ((umf0) obj3).e, (dnc) obj2, (lnm) null));
                return rih1Var;
            case 9:
                qlb qlbVar = (qlb) obj4;
                return h5p1.r(new p1e0(d3p1.F(qlbVar.b, (o3r) qlbVar.f, (mey0) obj), (byte) 12), ((nwt) obj5).a(), ((clm) obj2).a, ((kko) qlbVar.e).a(), new k1((gei0) obj3, (lnm) null, (byte) 19));
            case 10:
                ((qtr) obj).b(new fei0((lo60) obj4, (vgm) obj5, (vu30) ((qlb) obj3).c, (dnc) obj2, (lnm) null));
                return rih1Var;
            case 11:
                qtr qtrVar = (qtr) obj;
                gii0 gii0Var = (gii0) obj4;
                kko kkoVar = gii0Var.e;
                p731 p731Var = gii0Var.g;
                qtrVar.c(new zbi0(kkoVar, null, (byte) 1));
                qtrVar.b(new nhi0((lo60) obj5, (dnc) obj3, (vgm) obj2, p731Var, (lnm) null, (byte) 0));
                return rih1Var;
            case 12:
                uuj0 uuj0Var = (uuj0) obj;
                ((iu30) obj3).invoke(new y7k0(uuj0Var));
                cio cioVarJ = ((t8k0) obj4).j((d8k0) obj5, uuj0Var);
                if (cioVarJ != null) {
                    ((ven0) obj2).setValue(new k8k0(cioVarJ));
                }
                return rih1Var;
            case 13:
                View view = (View) obj4;
                View.OnLayoutChangeListener sauVar = new sau((View) obj5, view, (hdn0) obj2, (hdn0) obj3, (byte) 1);
                view.addOnLayoutChangeListener(sauVar);
                return new w9d0(view, sauVar, (byte) 5);
            case 14:
                cas casVar = (a7m0) obj;
                casVar.a(ook0.f, ook0.h);
                ekf0 ekf0Var = (ekf0) obj4;
                casVar.b = RxEventSources.a(new ObservableSource[]{new ObservableFromPublisher(ekf0Var.b.t(bj20.Z).x(cj20.Z)).map(new jpa0(ekf0Var, (byte) 14)), yoi1.i(((zwz0) obj5).c(), o6xVar).map(s321.d1), yoi1.i(((hcb0) obj2).a(), o6xVar)});
                casVar.d = z7i0.W0;
                casVar.e = new mw1((Scheduler) obj3, (byte) 7);
                return rih1Var;
            case 15:
                rtb0 rtb0Var2 = (rtb0) obj;
                rqm0 rqm0Var = (rqm0) obj4;
                d0r d0rVar4 = (d0r) obj2;
                rtb0.c(rtb0Var2, (Object) null, new j2i(286396805, new iwf0((qx6) obj5, rqm0Var, d0rVar4, (byte) 27), true), 3);
                rtb0.c(rtb0Var2, (Object) null, q2j.b, 3);
                List list = rqm0Var.b;
                rtb0Var2.e(list.size(), (iu30) null, new ehf0(list, (byte) 24), new j2i(802480018, new rf1((byte) 21, (uqk) obj3, d0rVar4, list), true));
                return rih1Var;
            case 16:
                if (obj instanceof car0) {
                    cc0 cc0Var = ((lnn0) obj4).a;
                    hfb hfbVar = (hfb) obj5;
                    onr0 onr0Var = (onr0) obj2;
                    x9r0 x9r0Var = (car0) obj;
                    pnr0 pnr0Var = (pnr0) obj3;
                    cc0Var.getClass();
                    Looper mainLooper = Looper.getMainLooper();
                    if (mainLooper != null && !u890.j(Looper.myLooper(), mainLooper)) {
                        eg.m("ActivePageSet must be called on the main thread");
                        return null;
                    }
                    if (cc0Var.a.d()) {
                        Map map = (Map) cc0Var.c.getValue();
                        LinkedHashMap linkedHashMap2 = cc0Var.d;
                        Object arrayList3 = linkedHashMap2.get(onr0Var);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            linkedHashMap2.put(onr0Var, arrayList3);
                        }
                        List list2 = (List) arrayList3;
                        ListIterator listIterator = list2.listIterator(list2.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                iNextIndex = -1;
                            } else if (((bc0) listIterator.previous()).a == hfbVar) {
                                iNextIndex = listIterator.nextIndex();
                            }
                        }
                        if (x9r0Var instanceof x9r0) {
                            x9r0 x9r0Var2 = x9r0Var;
                            ac0 ac0Var = new ac0(x9r0Var2.a, x9r0Var2.b, null, x9r0Var2.c, pnr0Var, x9r0Var2.d, new tir0(3));
                            if (iNextIndex >= 0) {
                                ((bc0) list2.get(iNextIndex)).b = ac0Var;
                            } else {
                                list2.add(new bc0(hfbVar, ac0Var));
                            }
                        } else if (x9r0Var instanceof aar0) {
                            if (iNextIndex >= 0) {
                                aar0 aar0Var = (aar0) x9r0Var;
                                ((bc0) list2.get(iNextIndex)).b = ac0.a(((bc0) list2.get(iNextIndex)).b, aar0Var.a, aar0Var.b, null, aar0Var.c, null, 92);
                            }
                        } else if (x9r0Var instanceof bar0) {
                            if (iNextIndex >= 0) {
                                ((bc0) list2.get(iNextIndex)).b = ac0.a(((bc0) list2.get(iNextIndex)).b, null, null, ((bar0) x9r0Var).a, null, null, 123);
                            }
                        } else if (!(x9r0Var instanceof z9r0)) {
                            if (!(x9r0Var instanceof y9r0)) {
                                eg.o();
                                return null;
                            }
                            if (iNextIndex >= 0) {
                                if (u890.j(((bc0) list2.get(iNextIndex)).b.a, ((y9r0) x9r0Var).a)) {
                                    list2.remove(iNextIndex);
                                } else {
                                    onr0Var.name();
                                }
                            }
                        } else if (iNextIndex >= 0) {
                            ((bc0) list2.get(iNextIndex)).b = ac0.a(((bc0) list2.get(iNextIndex)).b, null, null, null, null, ((z9r0) x9r0Var).a, 63);
                        }
                        cc0Var.a(onr0Var, list2, map);
                    }
                }
                return rih1Var;
            case 17:
                ji50 ji50Var = (ji50) obj;
                zq41 zq41Var = (zq41) obj5;
                kyo0 kyo0Var = (kyo0) obj2;
                MobiusLoop mobiusLoop = (MobiusLoop) obj3;
                for (owo0 owo0Var : (Set) obj4) {
                    owo0Var.c(ji50Var, zq41Var, new iyo0(kyo0Var, mobiusLoop, owo0Var, (byte) 0));
                }
                return rih1Var;
            case 18:
                u2r u2rVar = (u2r) obj;
                u2rVar.b((t701) obj4);
                u2rVar.b((csy) obj5);
                u2rVar.b(six0.b((six0) obj2, (n6r0) obj3, 6));
                return rih1Var;
            case 19:
                abc0 abc0Var = (abc0) obj;
                abc0Var.c = new ofk0(obj4, obj5, obj2, obj3, (lnm) null, (byte) 14);
                abc0Var.a = new iyb0((Set) obj5, (lnm) null, (byte) 23);
                return rih1Var;
            case 20:
                long jLongValue = ((Number) obj).longValue();
                vzp0 vzp0Var = (vzp0) obj4;
                long jB = vzp0Var.b.b();
                v4g1 v4g1Var = vzp0Var.a;
                i4g1 i4g1Var = (i4g1) obj5;
                ry21 ry21Var = (ry21) obj2;
                v4g1Var.a(i4g1Var, new rna(jB, ry21Var, jLongValue, vzp0Var, (byte) 1));
                v4g1Var.a(i4g1Var, new ozp0((ln21) obj3, ry21Var, (byte) 4));
                return rih1Var;
            case 21:
                if (((String) obj2).length() == ((irq0) obj4).a) {
                    ((Function0) obj5).invoke();
                    b6t b6tVar = (k6a1) obj3;
                    if (b6tVar != null) {
                        b6tVar.a();
                    }
                }
                return rih1Var;
            case 22:
                return new der0((lzh) obj4, (b6r0) obj5, this.e, (xnn0) obj3, (Bundle) obj);
            case 23:
                gpv0 gpv0Var = (gpv0) obj4;
                if (gpv0Var != null) {
                    gpv0Var.f = (ees0) obj5;
                    gpv0Var.g = (Function0) obj2;
                    Double d = (Double) gpv0Var.c.getValue();
                    if (d != null) {
                        ((iu30) obj3).invoke(new uds0(d.doubleValue()));
                    }
                }
                return new xwm0(gpv0Var, (byte) 7);
            case 24:
                p4h p4hVarN = ((kb61) obj).N();
                fn31.T(p4hVarN.d, (o8n) null, 0, new el0(p4hVarN, (String) obj2, (String) obj4, (String) obj5, (String) obj3, (lnm) null, (byte) 14), 3);
                return rih1Var;
            case 25:
                ven0 ven0Var = (ven0) obj2;
                ven0 ven0Var2 = (ven0) obj5;
                o95 o95Var = (o95) ven0Var2.getValue();
                lnm lnmVar = null;
                if (o95Var == null) {
                    qr80 qr80Var = (qr80) ven0Var.getValue();
                    long j = qr80Var.a;
                    o95Var = new o95(qr80Var, rno1.g, (Object) null, 12);
                    ven0Var2.setValue(o95Var);
                }
                o95 o95Var2 = o95Var;
                if (!qr80.b(((qr80) o95Var2.e.getValue()).a, ((qr80) ven0Var.getValue()).a)) {
                    fn31.T((c9n) obj4, (o8n) null, 0, new dvq0((Object) o95Var2, obj3, ven0Var, lnmVar, (byte) 14), 3);
                }
                o95 o95Var3 = (o95) ven0Var2.getValue();
                return new qr80(o95Var3 != null ? qr80.c(((qr80) o95Var3.e()).a, ((qr80) ven0Var.getValue()).a) : 0L);
            case 26:
                ((qtr) obj).b(new nhi0((rit0) obj4, (yzc0) obj5, (y5v0) obj2, (i1r0) obj3, (lnm) null, (byte) 1));
                return rih1Var;
            case 27:
                long jLongValue2 = ((Number) obj).longValue();
                lgy lgyVar = ((p3u0) obj4).h;
                m0u0 m0u0Var = (m0u0) obj5;
                UnplayablePlaybackException unplayablePlaybackException = (UnplayablePlaybackException) obj2;
                Long l = (Long) obj3;
                if (l != null) {
                    jLongValue2 = l.longValue();
                }
                lgyVar.x(m0u0Var, unplayablePlaybackException, jLongValue2);
                return rih1Var;
            case 28:
                fhu0 fhu0Var = (fhu0) obj;
                hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
                sku0 sku0VarP = PlaylistDecorationPolicy.p();
                sku0VarP.S();
                sku0VarP.L();
                sku0VarP.E();
                sku0VarP.G();
                sku0VarP.W();
                sku0VarP.k0();
                sku0VarP.n(((iz00) obj4).a(Collections.singleton(rc11.a.b(qp31.class))));
                hru0VarS.x(sku0VarP);
                PlaylistRequestDecorationPolicy playlistRequestDecorationPolicyBuild = hru0VarS.build();
                playlistRequestDecorationPolicyBuild.getClass();
                Flowable flowableH = Flowable.h((Flowable) obj5, yoi1.i(((xrc0) obj2).k(fhu0Var.a, new trc0(playlistRequestDecorationPolicyBuild, (g3d0) null, (Set) null, false, qrc0.a, jqz0.a, (prc0) null, 0, (List) null, 462)), o6xVar).observeOn((Scheduler) obj3).map(bj20.a1).doOnError(xfs0.O0).onErrorReturn(cj20.a1).toFlowable(BackpressureStrategy.d), new jxp0(fhu0Var, (byte) 10));
                flowableH.getClass();
                return flowableH.t(Functions.a);
            default:
                rtb0 rtb0Var3 = (rtb0) obj;
                ulc ulcVar = (ulc) obj5;
                rtb0.c(rtb0Var3, (Object) null, s8j.a, 3);
                zpu0 zpu0Var = (zpu0) obj4;
                if (zpu0Var != null && zpu0Var.a.d.h.b.contains(wls0.f)) {
                    rtb0.c(rtb0Var3, (Object) null, new j2i(885873416, new ukm0(ulcVar, (Function0) obj2, (byte) 29), true), 3);
                }
                List list3 = zpu0Var != null ? zpu0Var.a.f : null;
                if (list3 == null) {
                    list3 = z6x.a;
                }
                rtb0Var3.e(list3.size(), new iio0(list3, (byte) 11), new iio0(list3, (byte) 12), new j2i(2039820996, new rf1((byte) 25, ulcVar, (vu30) obj3, list3), true));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ntf0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(1);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ntf0(Object obj, Object obj2, Object obj3, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ntf0(byte b, Object obj, Object obj2, Object obj3, String str) {
        super(1);
        this.a = b;
        this.e = str;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }
}
