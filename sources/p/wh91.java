package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.cosmos.rxrouter.RxRouter;
import com.spotify.esperanto.esperantocosmos.CosmosTransport;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.player.esperanto.proto.EsGetErrorRequest;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wh91 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wh91(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((maa1) this.b).e((b0k) obj, czo1.p(1));
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((mta) this.b).i((b0k) obj, czo1.p(1));
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0049  */
    private final Object e(Object obj, Object obj2) {
        vj90 uj90Var;
        boolean z;
        key0 key0Var = (key0) obj;
        yfb1 yfb1Var = (yfb1) obj2;
        hwq hwqVar = key0Var.a;
        j8e0 j8e0Var = key0Var.b;
        zfb1 zfb1Var = yfb1Var.a;
        Boolean bool = zfb1Var.a;
        uw9 uw9Var = zfb1Var.c;
        boolean z2 = yfb1Var.b;
        if (((dgb1) this.b).d) {
            uj90Var = new vj90(yfb1Var.d, yfb1Var.c);
        } else {
            uj90Var = new uj90(uyn1.F(zfb1Var));
        }
        vj90 vj90Var = uj90Var;
        if (yfb1Var.e && (j8e0Var instanceof j8e0)) {
            zuc0 zuc0Var = j8e0Var.e;
            if ((zuc0Var != null ? zuc0Var.b() : null) == ltt0.c) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        return new eob1(hwqVar, j8e0Var, bool, z2, z, uw9Var, vj90Var);
    }

    private final Object f(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        zgb1 zgb1Var = (zgb1) this.b;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean z = zgb1Var.Z;
            boolean z2 = zgb1Var.O0;
            if (z) {
                x340Var2.i0(1995195434);
                lfe1.a(zgb1Var.f, zgb1Var.g, zgb1Var.h, (qim0) null, !z2, (vu30) null, x340Var2, 0);
                x340Var2.r(false);
            } else {
                x340Var2.i0(1995456206);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                yxo1.i(zgb1Var.f, zgb1Var.g, zgb1Var.h, uyn1.z(12.0f, 0.0f, 2, nim0.a), !z2, (vu30) null, x340Var2, 0, 32);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            xib1 xib1Var = (xib1) this.b;
            yxb0 yxb0Var = xib1Var.b;
            yib1 yib1Var = xib1Var.c.a;
            xe10 xe10Var = yib1Var.a;
            String str = xe10Var.a;
            String str2 = xe10Var.b;
            String str3 = xe10Var.c;
            phx phxVar = new phx(8, 0L, str3 == null ? "" : str3, str, str2);
            ArrayList<xe10> arrayList = yib1Var.b;
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            for (xe10 xe10Var2 : arrayList) {
                String str4 = xe10Var2.a;
                String str5 = xe10Var2.b;
                String str6 = xe10Var2.c;
                arrayList2.add(new phx(8, 0L, str6 == null ? "" : str6, str4, str5));
            }
            otw.c(yxb0Var, new qib1(phxVar, mqo1.A(arrayList2)), (qim0) null, (ipb1) null, x340Var2, 64, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2) {
        ksb1 ksb1Var = (ksb1) obj2;
        qsb1 qsb1Var = (qsb1) this.b;
        int i = ((Bundle) obj).getInt("active_listener_count");
        Integer numValueOf = Integer.valueOf(i);
        if (i <= 0) {
            numValueOf = null;
        }
        return qsb1Var.g(ksb1Var, numValueOf);
    }

    private final Object i(Object obj, Object obj2) {
        ewb1 ewb1Var;
        cwb1 cwb1Var;
        iwb1 gwb1Var;
        bwb1 bwb1Var = (bwb1) obj;
        k1r k1rVar = (k1r) obj2;
        ((lwb1) this.b).e = bwb1Var.c;
        if (k1rVar instanceof j1r) {
            ewb1Var = new ewb1(bwb1Var.a, (String) null, (String) null, (String) null, true, (cwb1) null, (iwb1) null, false, 494);
        } else if (k1rVar instanceof i1r) {
            pyb1 pyb1Var = (pyb1) u890.k(k1rVar, (d0r) null, (n4r) null);
            jo70 jo70Var = pyb1Var.b;
            xkk1 xkk1Var = pyb1Var.c;
            if (jo70Var == null || xkk1Var == null) {
                cwb1Var = null;
            } else {
                up70 up70VarA = xkk1Var.a.a(vp70.b);
                String str = up70VarA != null ? up70VarA.a.a : null;
                if (str == null) {
                    str = "";
                }
                cwb1Var = new cwb1(str, jo70Var.a, o7h.y0(jo70Var.d, (CharSequence) null, (String) null, (String) null, cgb1.V0, 31));
            }
            rvb1 rvb1Var = pyb1Var.a;
            hxb1 hxb1Var = rvb1Var.f;
            if (hxb1Var instanceof fxb1) {
                fxb1 fxb1Var = (fxb1) hxb1Var;
                gwb1Var = new gwb1(fxb1Var.a, fxb1Var.c);
            } else if (hxb1Var instanceof exb1) {
                gwb1Var = fwb1.a;
            } else {
                if (!(hxb1Var instanceof gxb1)) {
                    eg.o();
                    return null;
                }
                gwb1Var = hwb1.a;
            }
            ewb1Var = new ewb1(rvb1Var.a, rvb1Var.b, rvb1Var.c, rvb1Var.d, false, cwb1Var, gwb1Var, bwb1Var.b, 256);
        } else {
            ewb1Var = new ewb1(bwb1Var.a, (String) null, (String) null, (String) null, false, (cwb1) null, (iwb1) null, false, 494);
        }
        return new ewb1(ewb1Var.a, ewb1Var.b, ewb1Var.c, ewb1Var.d, ewb1Var.e, ewb1Var.f, ewb1Var.g, ewb1Var.h, !ewb1Var.e && ihc1.y0(ewb1Var.b));
    }

    private final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        lgo1.l((m0c1) this.b, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2) {
        return new ick1(new gga1((bcc1) this.b, (byte) 29));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.o2u0 */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e8  */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException, o2u0 {
        Object obj3;
        w8a1 w8a1Var;
        Object obj4;
        long j;
        v7a1 v7a1Var;
        Object obj5;
        Object obj6;
        Object obj7;
        brq0 brq0Var;
        gbb1 hbb1Var;
        kbb1 kbb1VarX;
        kbb1 mbb1Var;
        String str;
        boolean z;
        x7i1 x7i1Var;
        byte b = this.a;
        byte b2 = 25;
        byte b3 = 18;
        String str2 = "";
        o2u0 o2u0VarValueOf = null;
        z = false;
        boolean z2 = false;
        rih1 rih1Var = rih1.a;
        Object obj8 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    eqr0.b(0, 2, ((oh91) obj8).b, x340Var2, (qim0) null);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                fn91 fn91Var = (fn91) obj8;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    boolean zI = x340Var4.i(fn91Var);
                    Object objT = x340Var4.T();
                    if (zI || objT == m4cVar) {
                        obj3 = objT;
                        en91 en91Var = new en91(fn91Var, (byte) 0);
                        x340Var4.s0(en91Var);
                        obj3 = en91Var;
                    }
                    Function0 function0 = (Function0) obj3;
                    boolean zI2 = x340Var4.i(fn91Var);
                    Object objT2 = x340Var4.T();
                    Object obj9 = objT2;
                    if (zI2 || objT2 == m4cVar) {
                        en91 en91Var2 = new en91(fn91Var, (byte) 1);
                        x340Var4.s0(en91Var2);
                        obj9 = en91Var2;
                    }
                    qtg.c(function0, (Function0) obj9, (qim0) null, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                ro91 ro91Var = (ro91) obj8;
                lmw lmwVar = ro91Var.d;
                lik1 lik1Var = ro91Var.a;
                w9u0 w9u0Var = ro91Var.b;
                Flowable flowable = ro91Var.c;
                h72 h72Var = (h72) ((wqq) ((jly0) new h72(((no91) lmwVar.b).b(lik1Var)).Y).get()).a.c;
                oo91 oo91Var = (oo91) h72Var.b;
                yqg yqgVarA = oo91Var.a();
                c8o.l(yqgVarA);
                jp00 jp00VarR = oo91Var.r();
                c8o.l(jp00VarR);
                Context context = oo91Var.context();
                c8o.l(context);
                ww81 ww81VarA = tjw0.a(jp00VarR, context);
                o241 o241VarI = oo91Var.i();
                c8o.l(o241VarI);
                mw7 mw7VarG0 = oo91Var.G0();
                c8o.l(mw7VarG0);
                Context context2 = oo91Var.context();
                c8o.l(context2);
                iir iirVar = new iir(context2);
                Scheduler schedulerD0 = oo91Var.d0();
                c8o.l(schedulerD0);
                t2j0 t2j0VarQ = oo91Var.q();
                c8o.l(t2j0VarQ);
                mzr0 mzr0Var = new mzr0(yqgVarA, ww81VarA, o241VarI, mw7VarG0, iirVar, schedulerD0, new hlr(t2j0VarQ));
                jo91 jo91VarN = ((oo91) h72Var.b).n();
                c8o.l(jo91VarN);
                pnq pnqVar = (pnq) ((jly0) h72Var.d).get();
                oo91 oo91Var2 = (oo91) h72Var.b;
                RxRouter rxRouterP = oo91Var2.p();
                c8o.l(rxRouterP);
                yau0 yau0Var = new yau0(new ujm(new CosmosTransport(new sn0(rxRouterP, (byte) 25))).callStream("spotify.player.esperanto.proto.ContextPlayer", "GetError", EsGetErrorRequest.GetErrorRequest.o()).map(fmv.T0));
                Scheduler schedulerY0 = oo91Var2.y0();
                c8o.l(schedulerY0);
                uu00 uu00VarA = oo91Var2.A();
                c8o.l(uu00VarA);
                l0x0 l0x0Var = new l0x0(yau0Var, new ytp0(schedulerY0, uu00VarA, new wgb((ipq) h72Var.e), (gx01) ((jly0) h72Var.f).get(), new fza((byte) 22)), new jl00(h72Var.H(), (byte) 18), (byte) 26);
                Scheduler schedulerG = oo91Var2.G();
                c8o.l(schedulerG);
                return new jpg0(new rt01(lik1Var, (iac0) obj2, w9u0Var, flowable, mzr0Var, jo91VarN, pnqVar, l0x0Var, schedulerG, (xqq) ((jly0) h72Var.X).get()), fe91.S0);
            case 3:
                long j2 = ((Offset) obj2).a;
                ((hav0) obj).a();
                ev91 ev91Var = (ev91) obj8;
                fn31.T(ev91Var.v1(), (o8n) null, 0, new kv2((Object) ev91Var, j2, (lnm) null, (byte) 13), 3);
                return rih1Var;
            case 4:
                ((i4o) obj8).invoke(obj, obj2);
                return rih1Var;
            case 5:
                byg bygVar = (byg) obj;
                tv80 tv80Var = (tv80) obj2;
                njm njmVar = ((w6a1) obj8).b;
                String str3 = bygVar.d;
                if (str3 != null) {
                    i1o1.y(njmVar, str3, tv80Var, bygVar.f, (rwm) null, (Integer) null, (String) null, 56);
                }
                return rih1Var;
            case 6:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String str4 = ((bc81) obj8).h;
                    uwr uwrVar = cbx.a;
                    uwo1.e(str4, (qim0) null, cbx.d(x340Var6).k, cbx.a(x340Var6).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, 2034);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 7:
                w8a1 w8a1Var2 = (w8a1) obj;
                y910 y910Var = (y910) obj2;
                List list = y910Var.c;
                List list2 = y910Var.a;
                lik1 lik1Var2 = (lik1) obj8;
                smc0 smc0VarN = k4p1.n();
                jic1 jic1Var = new jic1(Integer.valueOf(smc0VarN.b()), null);
                z6x z6xVar = z6x.a;
                smc0VarN.add(new ric1(2131962700, (List) z6xVar, (String) null, (String) null, false, jic1Var, 60));
                String str5 = w8a1Var2.a;
                smc0VarN.add(new pic1(str5, new jic1(Integer.valueOf(smc0VarN.b()), null)));
                List list3 = y910Var.b;
                ArrayList arrayList = new ArrayList();
                Iterator it = list3.iterator();
                while (true) {
                    o2u0 o2u0Var = o2u0VarValueOf;
                    String str6 = "cover-type";
                    if (!it.hasNext()) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj10 : list3) {
                            if (!u890.j((String) ((pvc0) obj10).f.get("cover-type"), "ORIGINAL")) {
                                arrayList2.add(obj10);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            r6h1 r6h1Var = r6h1.c;
                            y6h1 y6h1Var = y6h1.i;
                            x6h1 x6h1VarI = i3o1.i();
                            x6h1VarI.h = "music";
                            x6h1VarI.a = "mobile-song-dna-original-section";
                            x6h1VarI.f = "2.0.0";
                            x6h1VarI.g = "22.0.0";
                            y6h1 y6h1VarA = x6h1VarI.a();
                            smc0VarN.add(new ric1(2131962711, (List) z6xVar, (String) null, (String) null, false, new jic1(0, y6h1VarA), 60));
                            Iterator it2 = arrayList.iterator();
                            int i = 0;
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                int i2 = i + 1;
                                if (i < 0) {
                                    p7h.T();
                                    throw o2u0Var;
                                }
                                pvc0 pvc0Var = (pvc0) next;
                                smc0VarN.add(new iic1(pvc0Var.c, (String) pvc0Var.f.get("cover-type"), new jic1(Integer.valueOf(i2), y6h1VarA)));
                                it2 = it2;
                                list2 = list2;
                                i = i2;
                                str2 = str2;
                                str5 = str5;
                            }
                        }
                        List list4 = list2;
                        String str7 = str2;
                        String str8 = str5;
                        boolean zIsEmpty = list4.isEmpty();
                        q541 q541Var = q541.Sample;
                        q541 q541Var2 = q541.Interpolation;
                        if (zIsEmpty) {
                            w8a1Var = w8a1Var2;
                        } else {
                            List list5 = list4;
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it3 = list5.iterator();
                            while (it3.hasNext()) {
                                w8a1 w8a1Var3 = w8a1Var2;
                                String str9 = (String) ((pvc0) it3.next()).f.get("sample-type");
                                o2u0 o2u0VarO = str9 != null ? pxd0.O(str9) : o2u0Var;
                                if (o2u0VarO != null) {
                                    arrayList3.add(o2u0VarO);
                                }
                                w8a1Var2 = w8a1Var3;
                            }
                            w8a1Var = w8a1Var2;
                            Set setP1 = o7h.p1(arrayList3);
                            int i3 = (setP1.contains(q541Var) && setP1.contains(q541Var2)) ? 2131962717 : setP1.contains(q541Var2) ? 2131962715 : 2131962716;
                            r6h1 r6h1Var2 = r6h1.c;
                            y6h1 y6h1Var2 = y6h1.i;
                            x6h1 x6h1VarI2 = i3o1.i();
                            x6h1VarI2.h = "music";
                            x6h1VarI2.a = "mobile-song-dna-samples-section";
                            x6h1VarI2.f = "2.0.0";
                            x6h1VarI2.g = "22.0.0";
                            y6h1 y6h1VarA2 = x6h1VarI2.a();
                            smc0VarN.add(new ric1(i3, (List) z6xVar, (String) null, (String) null, false, new jic1(0, y6h1VarA2), 60));
                            Iterator it4 = list5.iterator();
                            int i4 = 0;
                            while (it4.hasNext()) {
                                Object next2 = it4.next();
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    p7h.T();
                                    throw o2u0Var;
                                }
                                Iterator it5 = it4;
                                pvc0 pvc0Var2 = (pvc0) next2;
                                String str10 = str6;
                                String str11 = pvc0Var2.c;
                                Map map = pvc0Var2.f;
                                smc0VarN.add(new mic1(str11, lik1Var2.a, (String) map.get("sample-type"), (String) map.get("musical-part-sampled"), (String) map.get("sampling-track-start-seconds"), new jic1(Integer.valueOf(i5), y6h1VarA2)));
                                it4 = it5;
                                str6 = str10;
                                i4 = i5;
                            }
                        }
                        String str12 = str6;
                        if (!list.isEmpty()) {
                            r6h1 r6h1Var3 = r6h1.c;
                            y6h1 y6h1Var3 = y6h1.i;
                            x6h1 x6h1VarI3 = i3o1.i();
                            x6h1VarI3.h = "music";
                            x6h1VarI3.a = "mobile-song-dna-sampled-in-section";
                            x6h1VarI3.f = "2.0.0";
                            x6h1VarI3.g = "22.0.0";
                            y6h1 y6h1VarA3 = x6h1VarI3.a();
                            List list6 = list;
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it6 = list6.iterator();
                            while (it6.hasNext()) {
                                List list7 = list6;
                                String str13 = (String) ((pvc0) it6.next()).f.get("sample-type");
                                o2u0 o2u0VarO2 = str13 != null ? pxd0.O(str13) : o2u0Var;
                                if (o2u0VarO2 != null) {
                                    arrayList4.add(o2u0VarO2);
                                }
                                list6 = list7;
                            }
                            List list8 = list6;
                            Set setP2 = o7h.p1(arrayList4);
                            smc0VarN.add(new ric1((setP2.contains(q541Var) && setP2.contains(q541Var2)) ? 2131962714 : setP2.contains(q541Var2) ? 2131962712 : 2131962713, (List) z6xVar, (String) null, (String) null, false, new jic1(0, y6h1VarA3), 60));
                            Iterator it7 = list8.iterator();
                            int i6 = 0;
                            while (it7.hasNext()) {
                                Object next3 = it7.next();
                                int i7 = i6 + 1;
                                if (i6 < 0) {
                                    p7h.T();
                                    throw o2u0Var;
                                }
                                pvc0 pvc0Var3 = (pvc0) next3;
                                String str14 = pvc0Var3.c;
                                Map map2 = pvc0Var3.f;
                                smc0VarN.add(new nic1(str14, lik1Var2.a, (String) map2.get("sample-type"), (String) map2.get("musical-part-sampled"), (String) map2.get("sampling-track-start-seconds"), new jic1(Integer.valueOf(i7), y6h1VarA3)));
                                it7 = it7;
                                i6 = i7;
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            r6h1 r6h1Var4 = r6h1.c;
                            y6h1 y6h1Var4 = y6h1.i;
                            x6h1 x6h1VarI4 = i3o1.i();
                            x6h1VarI4.h = "music";
                            x6h1VarI4.a = "mobile-song-dna-covers-section";
                            x6h1VarI4.f = "2.0.0";
                            x6h1VarI4.g = "22.0.0";
                            y6h1 y6h1VarA4 = x6h1VarI4.a();
                            ArrayList arrayList5 = new ArrayList(q7h.U(arrayList2, 10));
                            Iterator it8 = arrayList2.iterator();
                            while (it8.hasNext()) {
                                arrayList5.add(((pvc0) it8.next()).c);
                            }
                            String str15 = y910Var.e;
                            smc0VarN.add(new ric1(2131962710, arrayList5, str15 == null ? str7 : str15, y910Var.f, y910Var.g, new jic1(0, y6h1VarA4), 8));
                            int i8 = 0;
                            for (Object obj11 : arrayList2) {
                                int i9 = i8 + 1;
                                if (i8 < 0) {
                                    p7h.T();
                                    throw o2u0Var;
                                }
                                pvc0 pvc0Var4 = (pvc0) obj11;
                                smc0VarN.add(new iic1(pvc0Var4.c, (String) pvc0Var4.f.get(str12), new jic1(Integer.valueOf(i9), y6h1VarA4)));
                                i8 = i9;
                            }
                        }
                        ArrayList arrayListK = k4p1.k(smc0VarN);
                        rmc0 rmc0VarListIterator = arrayListK.listIterator(0);
                        int i10 = 0;
                        while (true) {
                            rmc0 rmc0Var = rmc0VarListIterator;
                            if (!rmc0Var.hasNext()) {
                                i10 = -1;
                            } else if (!(((sic1) rmc0Var.next()) instanceof pic1)) {
                                i10++;
                            }
                        }
                        lr80 it9 = p7h.K(arrayListK).iterator();
                        while (true) {
                            if (((sr80) it9).c) {
                                Object next4 = it9.next();
                                int iIntValue4 = ((Number) next4).intValue();
                                if (iIntValue4 > i10 && (arrayListK.get(iIntValue4) instanceof ric1)) {
                                    obj4 = next4;
                                }
                            } else {
                                obj4 = o2u0Var;
                            }
                        }
                        Integer num = (Integer) obj4;
                        if (num != null) {
                            int iIntValue5 = num.intValue();
                            ArrayList arrayList6 = new ArrayList(arrayListK);
                            ric1 ric1Var = (ric1) arrayList6.get(iIntValue5);
                            arrayList6.set(iIntValue5, new ric1(ric1Var.a, ric1Var.b, ric1Var.c, true, ric1Var.e, ric1Var.f, ric1Var.g));
                            arrayListK = arrayList6;
                        }
                        u7h u7hVar = y910Var.d;
                        if (u7hVar == null && (u7hVar = w8a1Var.c) == null) {
                            uwr uwrVar2 = cbx.a;
                            j = ((yex) zex.a.d).e;
                        } else {
                            j = u7hVar.a;
                        }
                        return new x8a1(j, str8, mqo1.A(arrayListK));
                    }
                    Object next5 = it.next();
                    if (u890.j((String) ((pvc0) next5).f.get("cover-type"), "ORIGINAL")) {
                        arrayList.add(next5);
                    }
                    o2u0VarValueOf = o2u0Var;
                }
                break;
            case 8:
                il11 il11Var = (il11) obj8;
                r2a1 r2a1Var = (r2a1) il11Var.c;
                epb1 epb1Var = new epb1((zob1) obj);
                ojm ojmVar = (ojm) il11Var.e;
                zvp zvpVar = (zvp) r2a1Var.c;
                switch (zvpVar.a) {
                    case 0:
                        gw70 gw70VarA0 = ((nwp) zvpVar.b.c).a.a0();
                        c8o.l(gw70VarA0);
                        v7a1Var = new v7a1(gw70VarA0, ojmVar, epb1Var);
                        break;
                    default:
                        v7a1Var = new v7a1((gw70) zvpVar.b.b.d8.get(), ojmVar, epb1Var);
                        break;
                }
                return new jpg0(f6o1.A(v7a1Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), y8a1.e1);
            case 9:
                ((Number) obj2).intValue();
                ((boe) obj8).f((b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                u7n0.p((rca1) obj8, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                x340 x340Var7 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                yta1 yta1Var = (yta1) obj8;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    los losVar = yta1Var.b;
                    aua1 aua1Var = yta1Var.a;
                    boolean zI3 = x340Var8.i(yta1Var);
                    Object objT3 = x340Var8.T();
                    if (zI3 || objT3 == m4cVar2) {
                        obj5 = objT3;
                        dr91 dr91Var = new dr91(yta1Var, b2);
                        x340Var8.s0(dr91Var);
                        obj5 = dr91Var;
                    }
                    qxd0.i(losVar, (iu30) obj5, x340Var8);
                    fua1 fua1Var = yta1Var.k;
                    boolean zI4 = x340Var8.i(yta1Var);
                    Object objT4 = x340Var8.T();
                    Object obj12 = objT4;
                    if (zI4 || objT4 == m4cVar2) {
                        kdt0 kdt0Var = new kdt0(yta1Var, (lnm) null, (byte) 27);
                        x340Var8.s0(kdt0Var);
                        obj12 = kdt0Var;
                    }
                    qxd0.t(fua1Var, x340Var8, (vu30) obj12);
                    if (aua1Var instanceof bua1) {
                        x340Var8.i0(-1704218822);
                        j9k1.i(yta1Var.m, yta1Var.n, (qim0) null, x340Var8, 0);
                        x340Var8.r(false);
                    } else if (aua1Var instanceof aua1) {
                        x340Var8.i0(-1703984834);
                        d32.a(yta1Var.o, (qim0) null, aua1Var.b, x340Var8, 0);
                        x340Var8.r(false);
                    } else {
                        if (!(aua1Var instanceof cua1)) {
                            throw p3d1.k(x340Var8, 776307370, false);
                        }
                        x340Var8.i0(776322490);
                        qqn1.d(yta1Var.p, yta1Var.q, (qim0) null, x340Var8, 0);
                        x340Var8.r(false);
                    }
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var9 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    pua1 pua1Var = (pua1) obj8;
                    tva1 tva1Var = pua1Var.c;
                    xua1 xua1Var = pua1Var.a;
                    otw.c(tva1Var, new mva1(xua1Var.a, xua1Var.b, xua1Var.c, xua1Var.d), (qim0) null, (ipb1) null, x340Var10, 0, 12);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var11 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                yxa1 yxa1Var = (yxa1) obj8;
                fya1 fya1Var = yxa1Var.a;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    Context context3 = (Context) x340Var12.k(AndroidCompositionLocals_androidKt.b);
                    cir0 cir0Var = (cir0) x340Var12.k(k2r0.a);
                    iac0 iac0Var = (iac0) x340Var12.k(jfe0.a);
                    Object objT5 = x340Var12.T();
                    m4c m4cVar3 = fkj0.X;
                    if (objT5 == m4cVar3) {
                        obj6 = objT5;
                        av0 av0Var = yxa1Var.i;
                        ji0 ji0Var = fya1Var.a;
                        o2u0 o2u0VarB = av0Var.b(ji0Var, ji0Var.g.b);
                        x340Var12.s0(o2u0VarB);
                        obj6 = o2u0VarB;
                    }
                    obj6 = objT5;
                    o2u0 o2u0Var2 = (o2u0) obj6;
                    if (o2u0Var2 != null) {
                        Object objT6 = x340Var12.T();
                        if (objT6 == m4cVar3) {
                            obj7 = objT6;
                            uoa uoaVarA = woa.a(yxa1Var.h, "embedded-npv-video-sb", o2u0Var2, (w2k1) null, (kma) null, (List) null, false, (bas) null, (sn10) null, 1020);
                            x340Var12.s0(uoaVarA);
                            obj7 = uoaVarA;
                        }
                        obj7 = objT6;
                        uoa uoaVar = (uoa) obj7;
                        boolean zG = x340Var12.g(iac0Var);
                        Object objT7 = x340Var12.T();
                        Object obj13 = objT7;
                        if (zG || objT7 == m4cVar3) {
                            ruz ruzVarA = yxa1Var.m.a(iac0Var.getLifecycle()).a();
                            x340Var12.s0(ruzVarA);
                            obj13 = ruzVarA;
                        }
                        w9u0 w9u0Var2 = (w9u0) obj13;
                        Object objT8 = x340Var12.T();
                        Object obj14 = objT8;
                        if (objT8 == m4cVar3) {
                            hrr0 hrr0VarQ = v8r.q(Boolean.FALSE);
                            x340Var12.s0(hrr0VarQ);
                            obj14 = hrr0VarQ;
                        }
                        ven0 ven0Var = (ven0) obj14;
                        boolean zI5 = x340Var12.i(yxa1Var) | x340Var12.i(ven0Var) | x340Var12.i(w9u0Var2);
                        Object objT9 = x340Var12.T();
                        Object obj15 = objT9;
                        if (zI5 || objT9 == m4cVar3) {
                            ny51 ny51Var = new ny51(yxa1Var, w9u0Var2, ven0Var, b3);
                            x340Var12.s0(ny51Var);
                            obj15 = ny51Var;
                        }
                        qxd0.i(rih1Var, (iu30) obj15, x340Var12);
                        ji0 ji0Var2 = fya1Var.a;
                        boolean zI6 = x340Var12.i(yxa1Var);
                        Object objT10 = x340Var12.T();
                        Object obj16 = objT10;
                        if (zI6 || objT10 == m4cVar3) {
                            kdt0 kdt0Var2 = new kdt0(yxa1Var, (lnm) null, (byte) 28);
                            x340Var12.s0(kdt0Var2);
                            obj16 = kdt0Var2;
                        }
                        qxd0.t(ji0Var2, x340Var12, (vu30) obj16);
                        String str16 = fya1Var.a.e;
                        gya1 gya1Var = yxa1Var.d;
                        boolean zI7 = x340Var12.i(gya1Var);
                        Object objT11 = x340Var12.T();
                        if (zI7 || objT11 == m4cVar3) {
                            objT11 = new d061(1, gya1Var, gya1.class, "shouldIntercept", "shouldIntercept(Ljava/lang/String;)Z", 0, (byte) 24);
                            x340Var12.s0(objT11);
                        }
                        iu30 iu30Var = (nla0) objT11;
                        dr41 dr41Var = yxa1Var.e;
                        cg0 cg0Var = yxa1Var.g;
                        yt91 yt91Var = yxa1Var.n;
                        boolean zI8 = x340Var12.i(yxa1Var);
                        Object objT12 = x340Var12.T();
                        Object obj17 = objT12;
                        if (zI8 || objT12 == m4cVar3) {
                            xxa1 xxa1Var = new xxa1(yxa1Var, false ? (byte) 1 : (byte) 0);
                            x340Var12.s0(xxa1Var);
                            obj17 = xxa1Var;
                        }
                        Function0 function1 = (Function0) obj17;
                        boolean zI9 = x340Var12.i(yxa1Var) | x340Var12.i(uoaVar);
                        Object objT13 = x340Var12.T();
                        Object obj18 = objT13;
                        if (zI9 || objT13 == m4cVar3) {
                            iv81 iv81Var = new iv81(yxa1Var, uoaVar, (byte) 26);
                            x340Var12.s0(iv81Var);
                            obj18 = iv81Var;
                        }
                        iu30 iu30Var2 = (iu30) obj18;
                        iu30 iu30Var3 = iu30Var;
                        boolean zI10 = x340Var12.i(yxa1Var) | x340Var12.i(context3) | x340Var12.i(cir0Var);
                        Object objT14 = x340Var12.T();
                        Object obj19 = objT14;
                        if (zI10 || objT14 == m4cVar3) {
                            m551 m551Var = new m551((Object) yxa1Var, (Object) context3, (Object) cir0Var, (byte) 21);
                            x340Var12.s0(m551Var);
                            obj19 = m551Var;
                        }
                        Function0 function2 = (Function0) obj19;
                        boolean zI11 = x340Var12.i(ven0Var) | x340Var12.i(yxa1Var);
                        Object objT15 = x340Var12.T();
                        Object obj20 = objT15;
                        if (zI11 || objT15 == m4cVar3) {
                            k7a1 k7a1Var = new k7a1((Object) yxa1Var, (Object) ven0Var, (byte) 5);
                            x340Var12.s0(k7a1Var);
                            obj20 = k7a1Var;
                        }
                        Function0 function3 = (Function0) obj20;
                        boolean zI12 = x340Var12.i(yxa1Var);
                        Object objT16 = x340Var12.T();
                        Object obj21 = objT16;
                        if (zI12 || objT16 == m4cVar3) {
                            xxa1 xxa1Var2 = new xxa1(yxa1Var, (byte) 1);
                            x340Var12.s0(xxa1Var2);
                            obj21 = xxa1Var2;
                        }
                        vvm1.m(str16, uoaVar, function1, iu30Var2, iu30Var3, dr41Var, function2, cg0Var, yt91Var, function3, (Function0) obj21, x340Var12, 0);
                    }
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var13 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    cct cctVar = ((rbt) ((s24) obj8).b).o;
                    x340Var14.i0(-271061196);
                    cctVar.c(x340Var14, 0);
                    x340Var14.r(false);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 15:
                b0b1 b0b1Var = (b0b1) obj;
                d0b1 d0b1Var = (d0b1) obj2;
                boolean z3 = b0b1Var.c;
                r8s r8sVar = (r8s) obj8;
                String strA = ((fza1) r8sVar.d).a(b0b1Var.a);
                ji0 ji0Var3 = d0b1Var.a;
                if (ji0Var3 == null) {
                    return new c0b1(60, b0b1Var.b, strA != null ? strA : "", !z3);
                }
                av0 av0Var2 = (av0) r8sVar.c;
                List list9 = ji0Var3.g.b;
                f01 f01Var = av0Var2.a;
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                for (Object obj22 : list9) {
                    a7j1 a7j1Var = (a7j1) obj22;
                    if (a7j1Var.b > a7j1Var.c) {
                        arrayList7.add(obj22);
                    } else {
                        arrayList8.add(obj22);
                    }
                }
                e01 e01VarA = f01Var.a(arrayList8);
                h01 h01Var = e01VarA == null ? null : new h01(e01VarA, !arrayList7.isEmpty() ? f01Var.a(arrayList7) : null);
                if (h01Var == null) {
                    brq0Var = null;
                } else {
                    o2u0 o2u0VarA = av0.a(ji0Var3, h01Var.a);
                    e01 e01Var = h01Var.b;
                    brq0Var = new brq0(o2u0VarA, e01Var != null ? av0.a(ji0Var3, e01Var) : null);
                }
                String str17 = b0b1Var.b;
                o2u0 o2u0Var3 = brq0Var != null ? brq0Var.a : null;
                o2u0 o2u0Var4 = brq0Var != null ? brq0Var.b : null;
                if (strA == null) {
                    strA = ji0Var3.c;
                }
                return new c0b1(str17, strA, o2u0Var3, o2u0Var4, ji0Var3, d0b1Var.b, !z3);
            case 16:
                if (((r3c) obj2) == null) {
                    ((r2b1) obj8).b();
                }
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                x340 x340Var15 = (b0k) obj;
                x340Var15.i0(858482690);
                af5 af5VarG = ((d8a) obj8).a.g(x340Var15);
                x340Var15.r(false);
                return af5VarG;
            case 18:
                sbb1 sbb1Var = (sbb1) obj;
                vbb1 vbb1Var = (vbb1) obj2;
                boolean z4 = vbb1Var.a;
                boolean z5 = sbb1Var.b;
                boolean z6 = vbb1Var.b;
                res resVar = (res) obj8;
                Map map3 = sbb1Var.e;
                Uri uri = (Uri) map3.get(fbb1.a);
                if (uri == null) {
                    uri = Uri.EMPTY;
                }
                Uri uri2 = (Uri) map3.get(fbb1.b);
                if (!z4 || uri2 == null) {
                    uri.getClass();
                    hbb1Var = new hbb1(uri);
                } else {
                    hbb1Var = new gbb1(uri2);
                }
                if (z4) {
                    resVar.h = null;
                    kbb1VarX = res.x(sbb1Var, hbb1Var);
                } else {
                    kl61 kl61Var = vbb1Var.c;
                    if (kl61Var instanceof kl61) {
                        uri.getClass();
                        Uri uri3 = kl61Var.a;
                        wbb1 wbb1Var = (wbb1) resVar.h;
                        if (wbb1Var != null && wbb1Var.b.equals(uri3)) {
                            Uri uri4 = wbb1Var.a;
                            Uri uri5 = Uri.EMPTY;
                            if (uri4.equals(uri5) && !uri.equals(uri5)) {
                                wbb1Var = new wbb1(uri, uri3);
                            }
                        } else {
                            wbb1Var = new wbb1(uri, uri3);
                        }
                        resVar.h = wbb1Var;
                        mbb1Var = new mbb1(new hbb1(uri3));
                    } else if (kl61Var instanceof ml61) {
                        ml61 ml61Var = (ml61) kl61Var;
                        uri.getClass();
                        String str18 = ml61Var.b;
                        boolean zH0 = str18 != null ? ihc1.h0(uri.toString(), str18, false) : false;
                        Uri uri6 = ml61Var.a;
                        hbb1 hbb1Var2 = new hbb1(uri);
                        if (zH0) {
                            resVar.h = null;
                            kbb1VarX = new lbb1(hbb1Var2, uri6 != null ? new pbb1(uri6) : qbb1.a);
                        } else {
                            wbb1 wbb1Var2 = (wbb1) resVar.h;
                            if (!(wbb1Var2 == null ? false : uri.equals(wbb1Var2.a)) || uri6 == null) {
                                resVar.h = null;
                                kbb1VarX = res.x(sbb1Var, hbb1Var2);
                            } else {
                                mbb1Var = new mbb1(new hbb1(uri6));
                            }
                        }
                    } else if ((kl61Var instanceof jl61) || (kl61Var instanceof il61)) {
                        resVar.h = null;
                        kbb1VarX = res.x(sbb1Var, hbb1Var);
                    } else {
                        if (!u890.j(kl61Var, ll61.a)) {
                            eg.o();
                            return null;
                        }
                        uri.getClass();
                        wbb1 wbb1Var3 = (wbb1) resVar.h;
                        hbb1 hbb1Var3 = new hbb1(uri);
                        if (wbb1Var3 == null || !uri.equals(wbb1Var3.a)) {
                            resVar.h = null;
                            kbb1VarX = res.x(sbb1Var, hbb1Var3);
                        } else {
                            mbb1Var = new mbb1(new hbb1(wbb1Var3.b));
                        }
                    }
                    kbb1VarX = mbb1Var;
                }
                Boolean bool = sbb1Var.c;
                if (bool != null) {
                    if (bool.booleanValue() && z6) {
                        z2 = true;
                    }
                    o2u0VarValueOf = Boolean.valueOf(z2);
                }
                return new ubb1(o2u0VarValueOf, z5, z6, kbb1VarX);
            case 19:
                mcb1 mcb1Var = (mcb1) obj;
                lcb1 lcb1Var = (lcb1) obj2;
                yt91 yt91Var2 = (yt91) ((z72) obj8).t;
                cxc0 cxc0Var = lcb1Var.a;
                kby kbyVar = cxc0Var != null ? cxc0Var.f : null;
                ly50 ly50Var = lcb1Var.b;
                boolean z7 = (cxc0Var == null || cxc0Var.a()) ? false : true;
                boolean z8 = cxc0Var != null && cxc0Var.i;
                boolean z9 = ((rbt) yt91Var2.c).d && z7 && !lcb1Var.c;
                ocb1 ocb1Var = new ocb1(((Context) yt91Var2.b).getString(ly50Var.d));
                boolean zJ = ((rsn0) yt91Var2.d).j();
                if (ly50Var.b) {
                    String str19 = kbyVar != null ? kbyVar.b : null;
                    if (str19 == null) {
                        str = "";
                    } else {
                        str = str19;
                    }
                } else {
                    str = "";
                }
                o2u0VarValueOf = kbyVar != null ? kbyVar.b : null;
                o2u0 o2u0Var5 = o2u0VarValueOf == null ? "" : o2u0VarValueOf;
                iy50 iy50Var = ly50Var.a;
                boolean z10 = iy50Var == iy50.c;
                boolean z11 = ly50Var.e;
                if (!z8) {
                    z = false;
                } else if ((kbyVar == null || (x7i1Var = kbyVar.w) == null) ? false : x7i1Var.b) {
                    z = true;
                } else {
                    z = false;
                }
                return new qcb1(mcb1Var.a, str, o2u0Var5, z10, z9, z11, zJ, z, ocb1Var, iy50Var);
            case 20:
                return a(obj, obj2);
            case 21:
                return d(obj, obj2);
            case 22:
                return e(obj, obj2);
            case 23:
                return f(obj, obj2);
            case 24:
                return g(obj, obj2);
            case 25:
                return h(obj, obj2);
            case 26:
                return i(obj, obj2);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return j(obj, obj2);
            case 28:
                return k(obj, obj2);
            default:
                ((Number) obj2).intValue();
                iko1.k((egc1) obj8, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wh91(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
