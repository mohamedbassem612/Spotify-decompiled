package p;

import android.os.Bundle;
import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i4o extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4o(ror rorVar, int i) {
        super(2);
        this.a = (byte) 11;
        this.b = rorVar;
    }

    /* JADX WARN: Code duplicated, block: B:176:0x043b  */
    /* JADX WARN: Code duplicated, block: B:378:0x08ea  */
    /* JADX WARN: Code duplicated, block: B:379:0x08ed  */
    /* JADX WARN: Code duplicated, block: B:383:0x0901  */
    /* JADX WARN: Code duplicated, block: B:385:0x090f  */
    /* JADX WARN: Code duplicated, block: B:388:0x0922  */
    /* JADX WARN: Code duplicated, block: B:389:0x0924 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:390:0x0926  */
    /* JADX WARN: Code duplicated, block: B:405:0x0910 A[SYNTHETIC] */
    public final Object invoke(Object obj, Object obj2) {
        a4o y3oVar;
        Object next;
        goe goeVar;
        String str;
        ArrayList arrayList;
        String str2;
        String str3;
        ArrayList arrayList2;
        boolean z;
        boolean z2;
        npy npyVar;
        String strZ;
        npy npyVar2;
        boolean z3;
        String str4;
        ecx ecxVarD;
        tst tstVar;
        String str5;
        int i;
        String str6;
        byte b = this.a;
        aey aeyVar = aey.d;
        nim0 nim0Var = nim0.a;
        byte b2 = 6;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                e4o e4oVar = (e4o) obj2;
                String str7 = ((b4o) obj).a;
                it8 it8Var = ((m4o) obj3).i;
                boolean z4 = e4oVar.f;
                String str8 = e4oVar.b;
                boolean z5 = e4oVar.d;
                List list = e4oVar.c;
                if (z5 && !z4 && e4oVar.e) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (u890.j(((x4i1) it.next()).b, str8)) {
                                    int size = list.size();
                                    if (2 <= size && size < 11) {
                                        if (((ahu0) ((yfc0) it8Var.b).b).d) {
                                            List<x4i1> list3 = list;
                                            ArrayList arrayList3 = new ArrayList(q7h.U(list3, 10));
                                            Iterator it2 = list3.iterator();
                                            while (it2.hasNext()) {
                                                arrayList3.add(((x4i1) it2.next()).a);
                                            }
                                            Iterator it3 = e4oVar.a.iterator();
                                            do {
                                                if (it3.hasNext()) {
                                                    next = it3.next();
                                                    ArrayList arrayListK = ((goe) next).k();
                                                    arrayList2 = new ArrayList(q7h.U(arrayListK, 10));
                                                    Iterator it4 = arrayListK.iterator();
                                                    while (it4.hasNext()) {
                                                        arrayList2.add(((w4i1) it4.next()).e);
                                                    }
                                                } else {
                                                    next = null;
                                                }
                                                goeVar = (goe) next;
                                                if (goeVar != null) {
                                                    str = goeVar.a;
                                                } else {
                                                    str = null;
                                                }
                                                arrayList = new ArrayList(q7h.U(list3, 10));
                                                for (x4i1 x4i1Var : list3) {
                                                    str2 = x4i1Var.b;
                                                    str3 = x4i1Var.c;
                                                    if (str3 == null) {
                                                        str3 = str2;
                                                    }
                                                    arrayList.add(new w4i1(str2, str3, x4i1Var.g, x4i1Var.e));
                                                }
                                                y3oVar = new z3o(str8, str, arrayList);
                                            } while (!o7h.p1(arrayList2).equals(o7h.p1(arrayList3)));
                                            goeVar = (goe) next;
                                            if (goeVar != null) {
                                                str = goeVar.a;
                                            } else {
                                                str = null;
                                            }
                                            arrayList = new ArrayList(q7h.U(list3, 10));
                                            while (r2.hasNext()) {
                                                str2 = x4i1Var.b;
                                                str3 = x4i1Var.c;
                                                if (str3 == null) {
                                                    str3 = str2;
                                                }
                                                arrayList.add(new w4i1(str2, str3, x4i1Var.g, x4i1Var.e));
                                            }
                                            y3oVar = new z3o(str8, str, arrayList);
                                        } else {
                                            y3oVar = null;
                                        }
                                    }
                                }
                            }
                            if (z4) {
                                y3oVar = null;
                            } else {
                                y3oVar = null;
                            }
                        }
                    } else if (z4) {
                        y3oVar = null;
                    } else {
                        y3oVar = null;
                    }
                } else if (z4 || !((pxg) it8Var.c).a.i) {
                    y3oVar = null;
                } else {
                    y3oVar = new y3o(str8);
                }
                return new c4o(str7, y3oVar);
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tkx tkxVar = tkx.c;
                    uwr uwrVar = cbx.a;
                    w0h1.a(tkxVar, isl.a, anm1.N("curation_row_action_icon", u291.r(nim0Var, ((gdx) obj3).d)), cbx.a(x340Var2).d.a, 0L, false, x340Var2, tkx.d | 48, 48);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                lqo lqoVar = (lqo) obj3;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tbr0 tbr0VarC = ((cir0) x340Var4.k(k2r0.a)).c();
                    cm01 cm01Var = (cm01) lqoVar.f.get();
                    boolean zI = x340Var4.i(lqoVar) | x340Var4.i(tbr0VarC);
                    Object objT = x340Var4.T();
                    if (zI || objT == fkj0.X) {
                        objT = new y0o(lqoVar, tbr0VarC, b2);
                        x340Var4.s0(objT);
                    }
                    eio1.g(cm01Var, (iu30) objT, (qim0) null, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                return f6o1.A(new kpg0(new br0(((ovo) obj3).a), eno.Y0), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            case 4:
                return f6o1.A(new kpg0(new br0((ez01) ((n9e) obj3).b), eno.Z0), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
            case 5:
                iu30 iu30Var = ((l0r) obj3).f;
                return Boolean.valueOf(((Boolean) iu30Var.invoke(obj)).booleanValue() == ((Boolean) iu30Var.invoke(obj2)).booleanValue());
            case 6:
                return new cdk1(((r3r) obj3).a);
            case 7:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    eqr0.b(0, 2, ((h5r) obj3).b, x340Var6, (qim0) null);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    uwo1.e(((v9r) obj3).a, (qim0) null, (lee1) null, 0L, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, 2030);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 9:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                odr odrVar = (odr) obj3;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    ven0 ven0VarH = rwq.h((bpb1) odrVar.d, x340Var10, 0);
                    ven0 ven0VarH2 = rwq.h((bpb1) odrVar.e, x340Var10, 0);
                    mj mjVar = (mj) ven0VarH.getValue();
                    if (mjVar == null) {
                        x340Var10.i0(-1002810875);
                        x340Var10.r(false);
                    } else {
                        x340Var10.i0(-1002810874);
                        iu30 iu30Var2 = (iu30) ven0VarH2.getValue();
                        if (iu30Var2 == null) {
                            x340Var10.i0(-1069418203);
                            Object objT2 = x340Var10.T();
                            if (objT2 == fkj0.X) {
                                objT2 = r5r.Q0;
                                x340Var10.s0(objT2);
                            }
                            iu30Var2 = (iu30) objT2;
                            z = false;
                        } else {
                            z = false;
                            x340Var10.i0(-1697065626);
                        }
                        x340Var10.r(z);
                        dxo1.a(mjVar, iu30Var2, (gw70) odrVar.c, (qim0) null, x340Var10, 0);
                        x340Var10.r(z);
                    }
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 10:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (!x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x340Var12.b0();
                } else if (((Boolean) ((hrr0) ((yir) obj3).c).getValue()).booleanValue()) {
                    x340Var12.i0(-2128526732);
                    nyx.a(0, (wux) null, yhi.a, x340Var12, 3072, 7);
                    x340Var12.r(false);
                } else {
                    x340Var12.i0(-2128446969);
                    x340Var12.r(false);
                }
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                ((ror) obj3).a((b0k) obj, czo1.p(7));
                return rih1Var;
            case 12:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                h98 h98Var = (h98) obj3;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    ven0 ven0VarH3 = rwq.h((bpb1) h98Var.c, x340Var14, 0);
                    ven0 ven0VarH4 = rwq.h((bpb1) h98Var.d, x340Var14, 0);
                    kvt kvtVar = (kvt) ven0VarH3.getValue();
                    if (kvtVar == null) {
                        x340Var14.i0(661597688);
                        x340Var14.r(false);
                    } else {
                        x340Var14.i0(661597689);
                        iu30 iu30Var3 = (iu30) ven0VarH4.getValue();
                        if (iu30Var3 == null) {
                            x340Var14.i0(-1280511327);
                            Object objT3 = x340Var14.T();
                            if (objT3 == fkj0.X) {
                                objT3 = r5r.e1;
                                x340Var14.s0(objT3);
                            }
                            iu30Var3 = (iu30) objT3;
                            z2 = false;
                        } else {
                            z2 = false;
                            x340Var14.i0(-2119517078);
                        }
                        x340Var14.r(z2);
                        k4k.e(kvtVar, iu30Var3, (qim0) null, x340Var14, 8);
                        x340Var14.r(z2);
                    }
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                nzj nzjVar = (nzj) obj3;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    nyx.a(2, (wux) null, apo.r(111852898, new g1o(rwq.h(nzjVar.b, x340Var16, 0), rwq.h(nzjVar.c, x340Var16, 0), (byte) 14), x340Var16), x340Var16, 3078, 6);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 14:
                zdy zdyVar = (zdy) obj;
                i1r i1rVar = (k1r) obj2;
                aey aeyVar2 = zdyVar.d;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                if (i1rVar2 == null || (npyVar = (npy) i1rVar2.a) == null) {
                    npyVar = new npy(false, false, false, new mum1(), false, 1);
                }
                boolean z6 = npyVar.a;
                boolean z7 = zdyVar.i || (npyVar.b && aeyVar2 == aeyVar);
                ttm1 ttm1Var = zdyVar.h;
                if (ttm1Var == null || (strZ = ((oi) ((tm) obj3).e).z(ttm1Var, npyVar.d, zdyVar.l, false)) == null) {
                    strZ = zdyVar.g;
                }
                return new zdy(zdyVar.a, zdyVar.b, zdyVar.c, aeyVar2, zdyVar.e, z6, strZ, zdyVar.h, z7, zdyVar.j, zdyVar.k, zdyVar.l, zdyVar.m, zdyVar.n, zdyVar.o, zdyVar.p);
            case 15:
                lpy lpyVar = (lpy) obj;
                i1r i1rVar3 = (k1r) obj2;
                aey aeyVar3 = lpyVar.e;
                i1r i1rVar4 = i1rVar3 instanceof i1r ? i1rVar3 : null;
                if (i1rVar4 == null || (npyVar2 = (npy) i1rVar4.a) == null) {
                    npyVar2 = new npy(false, false, false, new mum1(), false, 1);
                }
                switch (aeyVar3.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                        z3 = true;
                        break;
                    case 12:
                    case 13:
                    case 14:
                        z3 = false;
                        break;
                    default:
                        eg.o();
                        return null;
                }
                boolean z8 = npyVar2.a;
                boolean z9 = lpyVar.i || (npyVar2.b && aeyVar3 == aeyVar);
                ttm1 ttm1Var2 = lpyVar.h;
                if (ttm1Var2 != null) {
                    String strZ2 = ((oi) ((pt) obj3).i).z(ttm1Var2, npyVar2.d, lpyVar.n, npyVar2.c && aeyVar3 == aey.b);
                    if (strZ2 == null) {
                        str4 = null;
                    } else {
                        str4 = strZ2;
                    }
                } else {
                    str4 = null;
                }
                boolean z10 = npyVar2.e && z3;
                int i2 = npyVar2.f;
                return new mpy(lpyVar, z8, z9, str4, z10, i2 != 1, z3 ? i2 : 1);
            case 16:
                ((Number) obj2).intValue();
                x340 x340Var17 = (b0k) obj;
                x340Var17.i0(-239291106);
                if (((maz) obj3).f == 1) {
                    cbx.a.getClass();
                    ecxVarD = uwr.a();
                } else {
                    cbx.a.getClass();
                    ecxVarD = uwr.d();
                }
                qim0 qim0VarF = hno1.f(nim0Var, ecxVarD);
                x340Var17.r(false);
                return qim0VarF;
            case 17:
                x340 x340Var18 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                yyr yyrVar = (yyr) obj3;
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    m920 m920Var = (m920) b2p1.C(yyrVar.c, x340Var19).getValue();
                    if (m920Var == null) {
                        x340Var19.i0(821453427);
                        x340Var19.r(false);
                    } else {
                        x340Var19.i0(821453428);
                        nyx.a(2, (wux) null, apo.r(1393724068, new g1o(m920Var, yyrVar, (byte) 15), x340Var19), x340Var19, 3078, 6);
                        x340Var19.r(false);
                    }
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case 18:
                if (s1s.a[((zea0) obj2).ordinal()] == 1) {
                    ((nxr) obj3).invoke();
                    return rih1Var;
                }
                eg.o();
                return null;
            case 19:
                x340 x340Var20 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    uwo1.e(((s6j0) obj3).b, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var21, 0, 0, 2046);
                } else {
                    x340Var21.b0();
                }
                return rih1Var;
            case 20:
                return ((jcs) obj3).b.getString(2131961389, (String) obj, (String) obj2);
            case 21:
                u2t0 u2t0Var = (u2t0) obj;
                boolean zM = ((z0t) ((res) obj3).e).a.m();
                boolean z11 = u2t0Var.d;
                List list4 = u2t0Var.a;
                Set set = u2t0Var.c;
                a3t0 a3t0Var = u2t0Var.b;
                return new v2t0(kqn1.p(list4, 0, set, a3t0Var == a3t0.a ? as3.b : as3.c, true, false), a3t0Var, zM && !z11, !z11);
            case 22:
                dgs dgsVar = (dgs) obj3;
                dgsVar.q.onNext(v7v0.a);
                dgsVar.a.a((String) obj, (tv80) obj2, (Bundle) null);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                zor.i((zor) ((goq) obj3).c, ((tv80) obj2).a.a, 6);
                ((nqs) obj).a();
                return rih1Var;
            case 24:
                ito itoVar = (ito) obj;
                yvg1 yvg1Var = (yvg1) obj2;
                g23 g23Var = (g23) ((mxr) obj3).d;
                if (g23Var != null) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) g23Var.d;
                    BehaviorSubject behaviorSubjectF = (BehaviorSubject) linkedHashMap.get(itoVar);
                    if (behaviorSubjectF == null) {
                        behaviorSubjectF = BehaviorSubject.f();
                        linkedHashMap.put(itoVar, behaviorSubjectF);
                    }
                    behaviorSubjectF.onNext(yvg1Var);
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                int iIntValue11 = ((Number) obj).intValue();
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                wyr wyrVar = (wyr) obj3;
                inl1 inl1Var = (inl1) wyrVar.f;
                wyrVar.b((inl1Var.f * iIntValue11) + inl1Var.d, zBooleanValue);
                return rih1Var;
            case 26:
                x340 x340Var22 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                qdg qdgVar = (qdg) obj3;
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    boolean zI2 = x340Var23.i(qdgVar);
                    Object objT4 = x340Var23.T();
                    if (zI2 || objT4 == fkj0.X) {
                        objT4 = new ots(qdgVar, (byte) 19);
                        x340Var23.s0(objT4);
                    }
                    z47.f(0, (Function0) objT4, x340Var23, (qim0) null);
                } else {
                    x340Var23.b0();
                }
                return rih1Var;
            case 27:
                return new kpg0(new szj(new w460((lzn0) ((jkt) obj3).b, true, false, false, (a1r0) null, 60), uyn1.j(16.0f, 8.0f, 16.0f, 0.0f, 8)), ket.b1);
            case 28:
                jc3 jc3Var = (jc3) ((jkt) obj3).b;
                return new sma1(new jpg0(zu70.a(jc3Var.c, new epb1((zob1) obj), jc3Var.a, jc3Var.b, jc3Var.d, new tbo0((byte) 4), 4032), zlt.g), new rma1((Integer) null, 2131167033, (Integer) null, 5));
            default:
                b0k b0kVar = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                xrt xrtVar = (xrt) obj3;
                b0k b0kVar2 = (x340) b0kVar;
                if (b0kVar2.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    cir0 cir0Var = (cir0) b0kVar2.k(k2r0.a);
                    hur hurVar = new hur(cwl1.H(cir0Var.g()));
                    dst dstVar = xrtVar.e;
                    n27 n27Var = dstVar.b;
                    int iOrdinal = dstVar.a.ordinal();
                    rst rstVar = rst.a;
                    String str9 = "https://trending-near-you-cdn.spotifycdn.com/images/just-ask.png";
                    if (iOrdinal != 0) {
                        if (iOrdinal == 1) {
                            int iC = xrtVar.d.c();
                            String str10 = dstVar.c;
                            String str11 = dstVar.d;
                            int iC2 = l1d.C(iC);
                            if (iC2 == 0 || iC2 == 1 || iC2 == 2 || iC2 == 3) {
                                i = 2131954947;
                            } else if (iC2 == 4) {
                                i = 2131954956;
                            } else {
                                eg.o();
                            }
                            tstVar = new tst((n27Var == null || (str6 = n27Var.a) == null) ? "https://trending-near-you-cdn.spotifycdn.com/images/just-ask.png" : str6, n27Var != null ? new qst(n27Var.b, n27Var.c) : rstVar, mqo1.s(new pst[]{new pst(eox.c, 2131954951, 2131954950, null), new pst(knx.c, 2131954954, 2131954953, 2131954952)}), i, iC == 5 ? null : str10, str11);
                        } else {
                            eg.o();
                        }
                        return null;
                    }
                    String str12 = dstVar.c;
                    String str13 = dstVar.d;
                    if (n27Var != null && (str5 = n27Var.a) != null) {
                        str9 = str5;
                    }
                    tstVar = new tst(str9, n27Var != null ? new qst(n27Var.b, n27Var.c) : rstVar, mqo1.s(new pst[]{new pst(eox.c, 2131954951, 2131954950, null), new pst(knx.c, 2131954954, 2131954953, 2131954952)}), 2131954947, str12, str13);
                    boolean zI3 = b0kVar2.i(xrtVar) | b0kVar2.i(hurVar) | b0kVar2.i(cir0Var);
                    Object objT5 = b0kVar2.T();
                    byte b3 = 16;
                    if (zI3 || objT5 == m4cVar) {
                        objT5 = new ssm(xrtVar, hurVar, cir0Var, b3);
                        b0kVar2.s0(objT5);
                    }
                    q3p1.b(0, 1, (Function0) objT5, b0kVar2, false);
                    lqc lqcVar = xrtVar.b;
                    boolean zI4 = b0kVar2.i(xrtVar) | b0kVar2.i(hurVar) | b0kVar2.i(cir0Var);
                    Object objT6 = b0kVar2.T();
                    if (zI4 || objT6 == m4cVar) {
                        objT6 = new m3n(xrtVar, hurVar, cir0Var, b3);
                        b0kVar2.s0(objT6);
                    }
                    lqcVar.n(tstVar, (iu30) objT6, b0kVar2, 384);
                } else {
                    b0kVar2.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i4o(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
