package p;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.car.app.b;
import androidx.car.app.k;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.mobius.Next;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.playlistmixing.laterinplaylistpage.domain.OutTrackNotFoundException;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gs90 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gs90(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2) {
        String str;
        Object next;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        Object obj3 = fkj0.X;
        tbb0 tbb0Var = (tbb0) this.b;
        icb0 icb0Var = tbb0Var.b;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objT = x340Var2.T();
            if (objT == obj3) {
                objT = d3p1.F(tbb0Var.g, tbb0Var.h, icb0Var.a);
                x340Var2.s0(objT);
            }
            k1r k1rVar = (k1r) rwq.h((zob1) objT, x340Var2, 0).getValue();
            String str2 = null;
            List list = k1rVar instanceof i1r ? (List) u890.k(k1rVar, (d0r) null, (n4r) null) : z6x.a;
            hng1 hng1Var = tbb0Var.f;
            r6q r6qVar = tbb0Var.c;
            String str3 = icb0Var.a;
            ven0 ven0VarH = rwq.h(hng1Var.b, x340Var2, 0);
            Object objT2 = x340Var2.T();
            if (objT2 == obj3) {
                objT2 = tbb0Var.e.a(str3);
                x340Var2.s0(objT2);
            }
            ven0 ven0VarG = rwq.g((mr20) objT2, (Object) null, (o8n) null, x340Var2, 48, 2);
            kng1 kng1Var = (kng1) ven0VarH.getValue();
            if (kng1Var instanceof ing1) {
                str = ((ing1) kng1Var).a;
            } else {
                if (!(kng1Var instanceof jng1)) {
                    eg.o();
                    return null;
                }
                str = (String) ven0VarG.getValue();
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((xab0) it.next()).a);
            }
            String strR = str != null ? a6o1.r(str, arrayList) : null;
            boolean zG = x340Var2.g(str3);
            Object objT3 = x340Var2.T();
            if (zG || objT3 == obj3) {
                objT3 = new dcb0(str3);
                x340Var2.s0(objT3);
            }
            dcb0 dcb0Var = (dcb0) objT3;
            Object objT4 = x340Var2.T();
            if (objT4 == obj3) {
                objT4 = new pr90(tbb0Var, (byte) 21);
                x340Var2.s0(objT4);
            }
            Function0 function0 = (Function0) objT4;
            Object objT5 = x340Var2.T();
            if (objT5 == obj3) {
                objT5 = new uv7(tbb0Var, function0, (byte) 1);
                x340Var2.s0(objT5);
            }
            sbb0 sbb0Var = (sbb0) objT5;
            boolean zG2 = x340Var2.g(r6qVar) | x340Var2.g(sbb0Var) | x340Var2.g(dcb0Var);
            Object objT6 = x340Var2.T();
            if (zG2 || objT6 == obj3) {
                objT6 = r6qVar.a(sbb0Var, function0, dcb0Var);
                x340Var2.s0(objT6);
            }
            ccb0 ccb0Var = (ccb0) objT6;
            String string = tbb0Var.d.getString(2131963367);
            if (strR == null) {
                Iterator it2 = list2.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!((xab0) next).b);
                xab0 xab0Var = (xab0) next;
                if (xab0Var != null) {
                    str2 = xab0Var.a;
                }
            } else {
                str2 = strR;
            }
            acb0 acb0Var = new acb0(string, str2, list, false);
            otw.c(ccb0Var, acb0Var, (qim0) null, wpb1.C("TranscriptLanguagePickerStateHolder", ccb0Var, acb0Var, x340Var2, 6, 8), x340Var2, 0, 4);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.playlistmixing.laterinplaylistpage.domain.OutTrackNotFoundException */
    /* JADX WARN: Code duplicated, block: B:59:0x0147  */
    private final Object d(Object obj, Object obj2) throws OutTrackNotFoundException {
        ahb0 ahb0Var;
        lhg1 lhg1Var;
        Object next;
        cib0 cib0Var;
        dib0 dib0Var = (dib0) obj;
        Bundle bundle = (Bundle) obj2;
        fib0 fib0Var = (fib0) this.b;
        if (bundle != null && (cib0Var = (cib0) jhc1.t(bundle, "later_in_playlist_model", cib0.class)) != null) {
            return cib0Var;
        }
        wsc0 wsc0Var = dib0Var.a;
        hib0 hib0Var = fib0Var.a.b;
        String str = hib0Var.b;
        List list = wsc0Var.e;
        Iterator it = list.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (u890.j(((zuc0) it.next()).a, str)) {
                break;
            }
            i2++;
        }
        if (i2 < 0) {
            throw new OutTrackNotFoundException(f4i1.f("Outgoing row ", str, " was not found in the playlist"));
        }
        zuc0 zuc0Var = (zuc0) list.get(i2);
        List<zuc0> listK0 = o7h.k0(list, i2 + 1);
        ArrayList arrayList = new ArrayList(q7h.U(listK0, 10));
        for (zuc0 zuc0Var2 : listK0) {
            arrayList.add(new ahb0(zuc0Var2.c, zuc0Var2.a, zuc0Var2.f(), zuc0Var2.g, false));
        }
        String str2 = hib0Var.d;
        if (str2 != null) {
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!u890.j(((ahb0) next).b, str2));
            ahb0Var = (ahb0) next;
        } else {
            ahb0Var = null;
        }
        if (ahb0Var != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (!u890.j(((ahb0) obj3).b, ahb0Var.b)) {
                    arrayList2.add(obj3);
                }
            }
            arrayList = arrayList2;
        }
        smc0 smc0VarN = k4p1.n();
        smc0VarN.add(ahb0Var != null ? new ahb0(ahb0Var.a, ahb0Var.b, ahb0Var.c, ahb0Var.d, true) : new ahb0(hib0Var.c, null, false, b7x.a, true));
        smc0VarN.addAll(arrayList);
        smc0 smc0VarK = k4p1.k(smc0VarN);
        ArrayList arrayList3 = new ArrayList(q7h.U(smc0VarK, 10));
        rmc0 rmc0VarListIterator = smc0VarK.listIterator(0);
        while (true) {
            rmc0 rmc0Var = rmc0VarListIterator;
            if (!rmc0Var.hasNext()) {
                return new cib0(hib0Var.a, zuc0Var.c, hib0Var.b, arrayList3, (qhs0) null);
            }
            Object next2 = rmc0Var.next();
            int i3 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            ahb0 ahb0Var2 = (ahb0) next2;
            ahb0 ahb0Var3 = (ahb0) o7h.t0(i3, smc0VarK);
            if (ahb0Var3 != null) {
                lhg1 lhg1VarB = kkg1.b(ahb0Var2.d);
                if (lhg1VarB == null) {
                    lhg1VarB = null;
                } else if (!kkg1.d(ahb0Var3.a, ahb0Var2.a, lhg1VarB) || !jch0.E(lhg1VarB.b, ahb0Var2.d, ahb0Var3.d)) {
                    lhg1VarB = null;
                }
                lhg1Var = lhg1VarB;
            } else {
                lhg1Var = null;
            }
            String str3 = ahb0Var2.a;
            String str4 = ahb0Var2.b;
            boolean z = ahb0Var2.c;
            Map map = ahb0Var2.d;
            boolean z2 = ahb0Var2.e;
            arrayList3.add(new rib0(str3, str4, z, map, z2, z2 ? null : Integer.valueOf(i - 1), lhg1Var));
            i = i3;
        }
    }

    private final Object e(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            String str = ((ued1) this.b).a;
            uwr uwrVar = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var2).g, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2042);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2) {
        return ((qih1) this.b).a(((Number) obj).intValue());
    }

    private final Object g(Object obj, Object obj2) {
        List list = (List) obj2;
        return list.isEmpty() ? oxb0.a : new pxb0(list, (String) ((rwj) this.b).f);
    }

    private final Object h(Object obj, Object obj2) {
        fzb0 fzb0Var = (fzb0) this.b;
        return new jpg0(f6o1.A(fzb0Var.a.a(new uxb0(1, true)), (ViewGroup.LayoutParams) null, ScrollCardType.LEAVEBEHIND_ADS, 1), new pdb0(fzb0Var, (byte) 8));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        fs90 ds90Var;
        String str;
        n2c0 n2c0Var;
        qj0 qj0Var;
        String str2;
        byte b = this.a;
        String string = null;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                hs90 hs90Var = (hs90) obj3;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ks90 ks90Var = hs90Var.d;
                    int iC = l1d.C(ks90Var.a);
                    if (iC == 0) {
                        ds90Var = new ds90(ks90Var.b);
                    } else {
                        if (iC != 1) {
                            eg.o();
                            return null;
                        }
                        ds90Var = new es90(ks90Var.c, ks90Var.e, ks90Var.d, ks90Var.f);
                    }
                    if (ds90Var instanceof ds90) {
                        x340Var2.i0(-1229252633);
                        okp okpVar = hs90Var.a;
                        vbl0 vbl0Var = new vbl0();
                        tnm tnmVar = (tnm) okpVar.a.c;
                        is90 is90Var = (is90) tnmVar.b;
                        vu60 vu60Var = (vu60) is90Var.c.get();
                        c8o.l(vu60Var);
                        Context context = (Context) is90Var.d.get();
                        c8o.l(context);
                        pkp pkpVar = (pkp) ((jly0) tnmVar.c).get();
                        qkp qkpVar = (qkp) ((jly0) tnmVar.d).get();
                        rkp rkpVar = (rkp) ((jly0) tnmVar.e).get();
                        los losVar = (los) ((jly0) tnmVar.f).get();
                        xvo xvoVar = (xvo) is90Var.k.get();
                        c8o.l(xvoVar);
                        otw.c(new cm0(vu60Var, context, pkpVar, qkpVar, rkpVar, losVar, xvoVar, vbl0Var), new vw60(((ds90) ds90Var).a), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        x340Var2.r(false);
                    } else {
                        if (!(ds90Var instanceof es90)) {
                            throw p3d1.k(x340Var2, 1900007514, false);
                        }
                        x340Var2.i0(-1228881811);
                        skp skpVar = hs90Var.b;
                        sbl0 sbl0Var = new sbl0();
                        tnm tnmVar2 = (tnm) skpVar.a.c;
                        is90 is90Var2 = (is90) tnmVar2.b;
                        Context context2 = (Context) is90Var2.d.get();
                        c8o.l(context2);
                        z710 z710Var = (z710) is90Var2.f.get();
                        c8o.l(z710Var);
                        pkp pkpVar2 = (pkp) ((jly0) tnmVar2.c).get();
                        los losVar2 = (los) ((jly0) tnmVar2.f).get();
                        b7b b7bVar = (b7b) is90Var2.i.get();
                        c8o.l(b7bVar);
                        r630 r630Var = (r630) is90Var2.h.get();
                        c8o.l(r630Var);
                        lzn0 lzn0Var = (lzn0) is90Var2.g.get();
                        c8o.l(lzn0Var);
                        xvo xvoVar2 = (xvo) is90Var2.k.get();
                        c8o.l(xvoVar2);
                        es90 es90Var = (es90) ds90Var;
                        otw.c(new r8s(context2, z710Var, pkpVar2, losVar2, b7bVar, r630Var, lzn0Var, xvoVar2, sbl0Var), new d0s0(es90Var.a, es90Var.c, es90Var.b, es90Var.d), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                        x340Var2.r(false);
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ft90 ft90Var = (ft90) obj3;
                    otw.c(ft90Var.b, new pt90(ft90Var.c, ft90Var.d), (qim0) null, (ipb1) null, x340Var4, 0, 12);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                acq0.v((qw90) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                hqq0.p((ix90) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                boolean zY = x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2);
                rih1 rih1Var2 = rih1.a;
                if (zY) {
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarO = td6.o(lhc.g(x340Var6).g, 32, nim0.a);
                    hz90 hz90Var = (hz90) obj3;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM = x340Var6.m();
                    qim0 qim0VarE = zr7.E(x340Var6, qim0VarO);
                    hzj.A.getClass();
                    if (x340Var6.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(hmb0.t1);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(gfh0VarC, x340Var6, y580.O0);
                    nko1.H(xos0VarM, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE, x340Var6, y580.Y);
                    b0a0 b0a0Var = hz90Var.e;
                    ikp ikpVar = hz90Var.d;
                    up90 up90Var = hz90Var.c;
                    c9c0 c9c0Var = hz90Var.b;
                    if (((no4) b0a0Var.a.get()).t()) {
                        x340Var6.i0(-1115801130);
                        otw.c(new cs90(c9c0Var, up90Var, ikpVar, (byte) 0), rih1Var2, (qim0) null, (ipb1) null, x340Var6, 48, 12);
                        x340Var6.r(false);
                    } else {
                        x340Var6.i0(-1115511249);
                        otw.c(new cs90(c9c0Var, up90Var, ikpVar, (byte) 1), rih1Var2, (qim0) null, (ipb1) null, x340Var6, 48, 12);
                        x340Var6.r(false);
                    }
                    x340Var6.r(true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var2;
            case 5:
                List list = (List) obj;
                List list2 = (List) obj2;
                b5a0 b5a0Var = (b5a0) obj3;
                k kVar = b5a0Var.a;
                if (list2 != null && list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        if (!((qvc) obj4).b) {
                            arrayList.add(obj4);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj5 : list2) {
                        if (!((qvc) obj5).b) {
                            arrayList2.add(obj5);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((qvc) it.next()).a);
                    }
                    Set setP1 = o7h.p1(arrayList3);
                    ArrayList arrayList4 = new ArrayList(q7h.U(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((qvc) it2.next()).a);
                    }
                    Set setV0 = dm61.v0(setP1, o7h.p1(arrayList4));
                    ArrayList arrayList5 = new ArrayList(q7h.U(arrayList, 10));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        arrayList5.add(((qvc) it3.next()).a);
                    }
                    Set setP2 = o7h.p1(arrayList5);
                    ArrayList arrayList6 = new ArrayList(q7h.U(arrayList2, 10));
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        arrayList6.add(((qvc) it4.next()).a);
                    }
                    Set setV1 = dm61.v0(setP2, o7h.p1(arrayList6));
                    if (!setV0.isEmpty()) {
                        string = kVar.getString(2131963272, o7h.y0(setV0, (CharSequence) null, (String) null, (String) null, (iu30) null, 63));
                    } else if (!setV1.isEmpty()) {
                        string = kVar.getString(2131963273, o7h.y0(setV1, (CharSequence) null, (String) null, (String) null, (iu30) null, 63));
                    }
                    if (string != null) {
                        lwc lwcVar = new lwc(string);
                        k kVar2 = (k) b5a0Var.c.b;
                        CharSequence charSequenceB = hon1.B(lwcVar);
                        Objects.requireNonNull(kVar2);
                        Objects.requireNonNull(charSequenceB);
                        b bVarE = kVar2.e(b.class);
                        bVarE.getClass();
                        bVarE.c.a("app", "showToast", new mp5(charSequenceB, 1, (byte) 0));
                    }
                }
                return rih1Var;
            case 6:
                uca0 uca0Var = (uca0) obj;
                pa10 pa10Var = (pa10) obj2;
                qo90 qo90Var = uca0Var.a;
                eww0 eww0Var = pa10Var.a;
                return eww0Var == null ? wca0.a : new vca0(pno1.g(qo90Var.d).a, uca0Var.d, uca0Var.e, y9g1.k(eww0Var, qo90Var), uca0Var.c, uca0Var.f, y9g1.m(uca0Var.g, (b0a0) ((pzw) obj3).h), pa10Var.d);
            case 7:
                tda0 tda0Var = (tda0) obj;
                pa10 pa10Var2 = (pa10) obj2;
                qo90 qo90Var2 = tda0Var.a;
                eww0 eww0Var2 = pa10Var2.a;
                return eww0Var2 == null ? vda0.a : new uda0(pno1.g(qo90Var2.d).a, tda0Var.e, tda0Var.g, y9g1.k(eww0Var2, qo90Var2), tda0Var.c, tda0Var.f, y9g1.m(tda0Var.h, (b0a0) ((dea0) obj3).i), pa10Var2.d);
            case 8:
                ((Number) obj2).intValue();
                fj30.l((n041) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 9:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                boolean zY2 = x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2);
                rih1 rih1Var3 = rih1.a;
                if (zY2) {
                    otw.c((orm0) obj3, rih1Var3, (qim0) null, (ipb1) null, x340Var8, 48, 12);
                } else {
                    x340Var8.b0();
                }
                return rih1Var3;
            case 10:
                ura0 ura0Var = (ura0) obj;
                vra0 vra0Var = (vra0) obj2;
                rq2 rq2Var = ura0Var.b;
                boolean z = vra0Var.b;
                String str3 = ura0Var.c;
                boolean z2 = ura0Var.a;
                if (!z2 || z) {
                    if (z2 || !z) {
                        return (vra0Var.a == rq2Var && vra0Var.d.equals(str3)) ? Next.j() : Next.h(vra0.a(vra0Var, rq2Var, false, null, str3, null, 0, null, false, null, null, null, null, false, 8182));
                    }
                    return Next.h(vra0.a(vra0Var, null, false, null, str3, "", 0, null, false, null, null, null, null, false, 8101));
                }
                boolean z3 = ura0Var.e == null && !q1o1.k(((mta0) obj3).d);
                vra0 vra0VarA = vra0.a(vra0Var, rq2Var, true, null, str3, null, ura0Var.d, ura0Var.e, false, ura0Var.f, ura0Var.g, null, null, ura0Var.h, 3220);
                if (z3) {
                    fg91 fg91Var = fg91.b;
                    vra0VarA = vra0.a(vra0VarA, null, false, fg91Var, null, null, 0, null, false, null, null, fg91Var, null, false, 7163);
                }
                vra0 vra0Var2 = vra0VarA;
                xj61 xj61Var = new xj61();
                if (z3) {
                    xj61Var.add(new bsa0(rq2Var, ura0Var.f, ura0Var.h));
                }
                xj61Var.add(csa0.a);
                xj61Var.add(new asa0(str3));
                return Next.i(vra0Var2, cwl1.j(xj61Var));
            case 11:
                WindowInsets windowInsets = (WindowInsets) obj2;
                ((hua0) obj3).c(windowInsets);
                return windowInsets;
            case 12:
                int iIntValue5 = ((Number) obj).intValue();
                t8w t8wVar = ((cwa0) obj3).g;
                yxa0 yxa0Var = t8wVar.b;
                int i = t8wVar.a;
                yxa0 yxa0Var2 = t8wVar.b;
                if (u890.j(yxa0Var2, txa0.a) || (yxa0Var2 instanceof vxa0)) {
                    str = nik1.r3.a;
                } else {
                    if (!(yxa0Var2 instanceof uxa0)) {
                        if (yxa0Var2 instanceof wxa0) {
                            eg.m("ParentalConsentTransition should not reach the Education page");
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    str = cfm0.i("spotify:internal:kid-account-transition:consent:", ((uxa0) yxa0Var).a, nik1.G3).a;
                }
                return new s8w(iIntValue5, i, str, yxa0Var);
            case 13:
                x340 x340Var9 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                n2c0 n2c0Var2 = (n2c0) obj3;
                x340 x340Var10 = x340Var9;
                if (!x340Var10.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x340Var10.b0();
                } else if (n2c0Var2.f) {
                    x340Var10.i0(-1918796837);
                    lvx.c(n2c0Var2.a, n2c0Var2.b, 0, x340Var10, (qim0) null);
                    x340Var10.r(false);
                } else {
                    x340Var10.i0(-1918690166);
                    x340Var10.r(false);
                }
                return rih1Var;
            case 14:
                qwa0 qwa0Var = (qwa0) obj;
                Bundle bundle = (Bundle) obj2;
                nwa0 nwa0Var = (nwa0) obj3;
                if (bundle != null && (n2c0Var = (n2c0) jhc1.t(bundle, "legal_page_model", n2c0.class)) != null) {
                    return n2c0Var;
                }
                int i2 = qwa0Var.a;
                int i3 = qwa0Var.b;
                tpw0 tpw0Var = qwa0Var.c;
                pwa0 pwa0Var = nwa0Var.d;
                pe peVar = nwa0Var.e;
                return new n2c0(i2, i3, tpw0Var, pwa0Var.a, qwa0Var.d, !peVar.b(3) && peVar.d(), false, qwa0Var.c != tpw0.e);
            case 15:
                x340 x340Var11 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    mxa0 mxa0Var = (mxa0) obj3;
                    suo1.q(mxa0Var.b, mxa0Var.c, mxa0Var.d, mxa0Var.e, (qim0) null, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 16:
                s1b0 s1b0Var = (s1b0) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                wp20 wp20Var = (wp20) obj3;
                ye90 ye90Var = (ye90) wp20Var.a;
                boolean z4 = s1b0Var instanceof q1b0;
                b7x b7xVar = b7x.a;
                if (z4) {
                    i8h1 i8h1Var = (i8h1) ye90Var.b;
                    x6h1 x6h1VarC = ((xok0) ye90Var.c).b.c();
                    x6h1VarC.i.add(new a7h1("avatar_list", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    Integer numValueOf = Integer.valueOf(iIntValue8);
                    x6h1 x6h1VarC2 = y6h1VarA.c();
                    x6h1VarC2.i.add(new a7h1("avatar", (String) null, numValueOf, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    String str4 = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                } else {
                    if (!(s1b0Var instanceof r1b0)) {
                        eg.o();
                        return null;
                    }
                    i8h1 i8h1Var2 = (i8h1) ye90Var.b;
                    x6h1 x6h1VarC3 = ((xok0) ye90Var.c).b.c();
                    x6h1VarC3.i.add(new a7h1("colored_initial_letter_list", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC3.a();
                    Integer numValueOf2 = Integer.valueOf(iIntValue8);
                    x6h1 x6h1VarC4 = y6h1VarA2.c();
                    x6h1VarC4.i.add(new a7h1("colored_initial_letter", (String) null, numValueOf2, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    String str5 = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                }
                m42 m42Var = (m42) wp20Var.b;
                if (m42Var != null) {
                    m42Var.invoke(new r9h(s1b0Var));
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                u2r u2rVar = (u2r) obj;
                dxy dxyVar = (dxy) obj3;
                String string2 = ((Context) dxyVar.b).getString(2131957129);
                iv00 iv00VarA = ((s8q) dxyVar.c).a((String) obj2, false);
                lvc0 lvc0Var = (lvc0) dxyVar.d;
                kxc0 kxc0Var = (kxc0) dxyVar.f;
                uxc0 uxc0Var = (uxc0) dxyVar.g;
                u2rVar.b(bo70.a);
                u2rVar.b(iv00VarA);
                bdc1 bdc1Var = bdc1.a;
                u2rVar.b(lvc0Var.a(bdc1Var));
                u2rVar.b(kxc0Var.a(bdc1Var));
                u2rVar.b(uxc0Var.a());
                kno1.o(u2rVar);
                c680.t(u2rVar, string2);
                jd0 jd0Var = jd0.g;
                jd11 jd11Var = rc11.a;
                xs31.d(u2rVar, jd0Var, new xv00(jd11Var.b(prl.class)), fjd.d, fjd.e);
                wlu wluVar = new wlu(jd11Var.b(jo70.class));
                wd2 wd2Var = new wd2(4, (lnm) null);
                tka0 tka0VarB = jd11Var.b(ko70.class);
                u2rVar.e.add(new l20(new g1o(wluVar, tka0VarB, (byte) 8), new k2(new t2r(wluVar, tka0VarB, wd2Var, (lnm) null), (lnm) null, (byte) 3)));
                Iterator it5 = ((Set) dxyVar.e).iterator();
                while (it5.hasNext()) {
                    ((pdt0) it5.next()).a(u2rVar);
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new w60((dmh1) obj, (List) obj2, (gnq0) obj3);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                o860 o860Var = (o860) obj3;
                esw eswVar = (esw) o860Var.b;
                iu30 iu30Var = (iu30) o860Var.c;
                bmp bmpVar = eswVar.m;
                switch (bmpVar.a) {
                    case 0:
                        qj0Var = new qj0(new urk0((byte) 4), ((kop) bmpVar.b.c).d(), iu30Var);
                        break;
                    default:
                        qj0Var = new qj0(new urk0((byte) 4), ((apq) bmpVar.b.c).d(), iu30Var);
                        break;
                }
                return new kpg0(new mb51(qj0Var, t5b0.U0, kkg.a), t5b0.V0);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                x340 x340Var13 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                jab0 jab0Var = (jab0) obj3;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    q7r0 q7r0VarG = ((cir0) x340Var14.k(k2r0.a)).g();
                    d0r d0rVarC = cwl1.C(q7r0VarG);
                    glp glpVar = jab0Var.c;
                    lzn0 lzn0Var2 = jab0Var.d;
                    wdm wdmVar = (wdm) glpVar.a.c;
                    bxo bxoVar = (bxo) ((jly0) wdmVar.c).get();
                    jly0 jly0Var = (jly0) wdmVar.d;
                    mab0 mab0Var = (mab0) wdmVar.b;
                    cxo cxoVar = (cxo) jly0Var.get();
                    hlp hlpVar = (hlp) ((jly0) wdmVar.e).get();
                    ilp ilpVar = (ilp) ((jly0) wdmVar.f).get();
                    jlp jlpVar = (jlp) ((jly0) wdmVar.g).get();
                    axo axoVar = (axo) ((jly0) wdmVar.h).get();
                    klp klpVar = (klp) ((jly0) wdmVar.i).get();
                    llp llpVar = (llp) ((jly0) wdmVar.t).get();
                    flp flpVar = (flp) ((jly0) wdmVar.X).get();
                    kg90 kg90Var = (kg90) mab0Var.e.get();
                    c8o.l(kg90Var);
                    luk lukVar = (luk) mab0Var.f.get();
                    c8o.l(lukVar);
                    psy psyVar = new psy(bxoVar, cxoVar, hlpVar, ilpVar, jlpVar, axoVar, klpVar, llpVar, flpVar, kg90Var, new w8r0(false, lukVar), d0rVarC, lzn0Var2, q7r0VarG);
                    sab0 sab0Var = jab0Var.b;
                    i1o1.e(psyVar, new pab0(sab0Var.a, sab0Var.b), d0rVarC, (qim0) null, (ipb1) null, tui.a, (xu30) null, 0, (xu30) null, x340Var14, 196608, 236);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return a(obj, obj2);
            case 22:
                x340 x340Var15 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ubb0 ubb0Var = (ubb0) obj3;
                    l6o1.k(ubb0Var.b, ubb0Var.c, ubb0Var.d, x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 23:
                return d(obj, obj2);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                wib0 wib0Var = (wib0) obj;
                mmr0 mmr0Var = (mmr0) obj2;
                vib0 vib0Var = (vib0) mmr0Var.a;
                vlw0 vlw0Var = (vlw0) mmr0Var.b;
                jo70 jo70Var = vib0Var.a;
                xkk1 xkk1Var = vib0Var.b;
                bjb0 bjb0Var = (bjb0) obj3;
                pjw0 pjw0Var = vib0Var.c;
                njw0 njw0Var = pjw0Var != null ? pjw0Var.b : null;
                ljw0 ljw0Var = njw0Var instanceof ljw0 ? (ljw0) njw0Var : null;
                if (ljw0Var != null && (str2 = ljw0Var.a.a.a.a) != null && str2.length() > 0) {
                    string = str2;
                }
                boolean zA = bjb0Var.c.a(bjb0.f(vib0Var.d), bjb0.f(vib0Var.e));
                rib0 rib0Var = wib0Var.a;
                return new xib0(wib0Var, jo70Var, xkk1Var, string, vlw0Var, zA, (rib0Var.e || rib0Var.b == null || !rib0Var.c || vib0Var.f.b) ? false : true);
            case 25:
                return e(obj, obj2);
            case 26:
                return f(obj, obj2);
            case 27:
                return g(obj, obj2);
            case 28:
                return h(obj, obj2);
            default:
                amp ampVar = ((o1c0) obj3).a;
                sck1 sck1Var = ((q7r0) obj).d.d;
                kop kopVar = (kop) ampVar.a.c;
                y651 y651Var = kopVar.b;
                lmp lmpVar = (lmp) kopVar.r.get();
                y451 y451Var = new y451(xqu.a(kopVar.s));
                sco0 sco0VarI = kopVar.a.I();
                c8o.l(sco0VarI);
                g931 g931Var = new g931(lmpVar, y451Var, sco0VarI);
                Scheduler schedulerP0 = kopVar.a.p0();
                c8o.l(schedulerP0);
                ww41 ww41Var = kopVar.a;
                Resources resourcesR = ww41Var.r();
                c8o.l(resourcesR);
                up41 up41Var = new up41(new l1e(resourcesR), (byte) 2);
                c351 c351Var = new c351(kopVar.x(), kopVar.j(), new n0v0((tb51) kopVar.t.get(), (byte) 5), new bm00((tb51) kopVar.t.get(), (byte) 9), new gl6((tb51) kopVar.t.get()), kopVar.c(), kopVar.o(), kopVar.e(), new ln8((tb51) kopVar.t.get()), new scx0((tb51) kopVar.t.get()), kopVar.g(), new ltf1((tb51) kopVar.t.get(), (byte) 10), new v6a0((tb51) kopVar.t.get(), kopVar.d(), (byte) 2), kopVar.p(), kopVar.d());
                m39 m39Var = new m39(kopVar.d());
                c681 c681Var = new c681((tb51) kopVar.t.get(), (byte) 23);
                x6o0 x6o0Var = new x6o0((tb51) kopVar.t.get(), (byte) 25);
                scx0 scx0Var = new scx0((tb51) kopVar.t.get());
                gl6 gl6Var = new gl6((tb51) kopVar.t.get());
                tb51 tb51Var = (tb51) kopVar.t.get();
                fza1 fza1VarJ = ww41Var.J();
                c8o.l(fza1VarJ);
                sjq0 sjq0Var = new sjq0(tb51Var, fza1VarJ, (byte) 29);
                n63 n63Var = new n63((tb51) kopVar.t.get(), (o5r) kopVar.v.get());
                ggv ggvVarF0 = ww41Var.F0();
                c8o.l(ggvVarF0);
                o5r o5rVar = (o5r) kopVar.v.get();
                Resources resourcesR2 = ww41Var.r();
                c8o.l(resourcesR2);
                w29 w29Var = new w29(c681Var, x6o0Var, scx0Var, gl6Var, sjq0Var, n63Var, new uny(ggvVarF0, o5rVar, resourcesR2, (byte) 8), new cp5((tb51) kopVar.t.get(), (byte) 25), new bb01((tb51) kopVar.t.get(), (byte) 26), new gl6((tb51) kopVar.t.get()), new dgb((byte) 27), kopVar.d(), new twa(), new ye90((tb51) kopVar.t.get(), kopVar.d(), (byte) 7), kopVar.p(), kopVar.g(), (byte) 0);
                ov41 ov41Var = new ov41(kopVar.d());
                n63 n63VarC = kopVar.c();
                gl6 gl6Var2 = new gl6((tb51) kopVar.t.get());
                zwg zwgVarE = kopVar.e();
                scx0 scx0Var2 = new scx0((tb51) kopVar.t.get());
                yzu yzuVarJ = kopVar.j();
                bm00 bm00Var = new bm00((tb51) kopVar.t.get(), (byte) 9);
                yeu0 yeu0VarO = kopVar.o();
                n0v0 n0v0Var = new n0v0((tb51) kopVar.t.get(), (byte) 5);
                ezb1 ezb1VarX = kopVar.x();
                zgz0 zgz0Var = new zgz0((tb51) kopVar.t.get(), (byte) 3);
                g931 g931VarW = kopVar.w();
                ln8 ln8Var = new ln8((tb51) kopVar.t.get());
                Resources resourcesR3 = ww41Var.r();
                c8o.l(resourcesR3);
                sd51 sd51Var = new sd51(n63VarC, gl6Var2, zwgVarE, scx0Var2, yzuVarJ, bm00Var, yeu0VarO, n0v0Var, ezb1VarX, zgz0Var, g931VarW, ln8Var, new vx40(resourcesR3, (tb51) kopVar.t.get(), (byte) 9), kopVar.g(), new ltf1((tb51) kopVar.t.get(), (byte) 10), new v6a0((tb51) kopVar.t.get(), kopVar.d(), (byte) 2), kopVar.p(), kopVar.d());
                Resources resourcesR4 = ww41Var.r();
                c8o.l(resourcesR4);
                xaz0 xaz0Var = new xaz0(resourcesR4, (byte) 20);
                Resources resourcesR5 = ww41Var.r();
                c8o.l(resourcesR5);
                yrg0 yrg0Var = new yrg0(new p1f0(up41Var, c351Var, m39Var, w29Var, ov41Var, sd51Var, xaz0Var, new cqp0(resourcesR5, kopVar.d())), new sjb((byte) 18), new pob((byte) 2, false));
                jb51 jb51VarS0 = ww41Var.s0();
                c8o.l(jb51VarS0);
                gyh gyhVar = kopVar.b.f;
                hc51 hc51VarA0 = ww41Var.a0();
                c8o.l(hc51VarA0);
                c8o.l(ww41Var.I());
                return new d751(y651Var, g931Var, schedulerP0, yrg0Var, jb51VarS0, gyhVar, hc51VarA0, (Bundle) obj2, sck1Var);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gs90(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
