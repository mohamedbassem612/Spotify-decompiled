package p;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cx1 implements jsw {
    public final g431 a;
    public final wt1 b;
    public final j8m0 c;
    public final bv1 d;
    public final tx4 e;
    public final fb8 f;
    public final hxo g;
    public final d0r h;
    public final t7o0 i;
    public final yx1 j;
    public final hcv k;
    public final ixo l;
    public final av1 m;

    public cx1(g431 g431Var, wt1 wt1Var, j8m0 j8m0Var, bv1 bv1Var, tx4 tx4Var, fb8 fb8Var, hxo hxoVar, d0r d0rVar, t7o0 t7o0Var, yx1 yx1Var, hcv hcvVar, ixo ixoVar, av1 av1Var) {
        this.a = g431Var;
        this.b = wt1Var;
        this.c = j8m0Var;
        this.d = bv1Var;
        this.e = tx4Var;
        this.f = fb8Var;
        this.g = hxoVar;
        this.h = d0rVar;
        this.i = t7o0Var;
        this.j = yx1Var;
        this.k = hcvVar;
        this.l = ixoVar;
        this.m = av1Var;
    }

    public final boolean b() {
        return true;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(ww1 ww1Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) {
        b0k b0kVar2;
        qng qngVar;
        Object obj;
        fu1 fu1Var;
        int i2;
        ju1 ju1Var;
        qng qngVar2;
        tu1 tu1Var;
        int i3;
        boolean z;
        Object obj2;
        Map.Entry entry;
        int i4;
        String str;
        ww1 ww1Var2 = ww1Var;
        Object obj3 = fkj0.X;
        av1 av1Var = this.m;
        gy1 gy1Var = av1Var.i;
        fu1 fu1Var2 = ww1Var2.a;
        c380 c380Var = fu1Var2.l;
        c380 c380Var2 = fu1Var2.k;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(604038054);
        int i5 = (i & 6) == 0 ? (b0kVar3.i(ww1Var2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i5 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 3072) == 0) {
            i5 |= b0kVar3.i(this) ? 2048 : 1024;
        }
        int i6 = i5;
        if (b0kVar3.Y(i6 & 1, (i6 & 1043) != 1042)) {
            if (gy1Var instanceof zx1) {
                b0kVar3.i0(-1015093468);
                d0r d0rVar = this.h;
                boolean zG = b0kVar3.g(d0rVar);
                Object objT = b0kVar3.T();
                if (zG || objT == obj3) {
                    hxo hxoVar = this.g;
                    switch (hxoVar.a) {
                        case SplitInstallErrorCode.NO_ERROR /* 0 */:
                            ib3 ib3Var = (ib3) ((fwo) hxoVar.b).c;
                            tai1 tai1Var = (tai1) ((kt1) ib3Var.b).N.get();
                            c8o.l(tai1Var);
                            z710 z710Var = (z710) ((kt1) ib3Var.b).F.get();
                            c8o.l(z710Var);
                            objT = new qng(d0rVar, tai1Var, z710Var, ((Boolean) ((kt1) ib3Var.b).R.get()).booleanValue());
                            break;
                        default:
                            ai0 ai0Var = (ai0) ((fwo) hxoVar.b).c;
                            tai1 tai1Var2 = (tai1) ((xu1) ai0Var.b).O.get();
                            c8o.l(tai1Var2);
                            z710 z710Var2 = (z710) ((xu1) ai0Var.b).u.get();
                            c8o.l(z710Var2);
                            objT = new qng(d0rVar, tai1Var2, z710Var2, ((Boolean) ((xu1) ai0Var.b).S.get()).booleanValue());
                            break;
                    }
                    b0kVar3.s0(objT);
                }
                qngVar = (qng) objT;
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1015002266);
                b0kVar3.r(false);
                qngVar = null;
            }
            Object objT2 = b0kVar3.T();
            if (objT2 == obj3) {
                objT2 = new ju1();
                b0kVar3.s0(objT2);
            }
            ju1 ju1Var2 = (ju1) objT2;
            boolean zG2 = b0kVar3.g(c380Var2) | b0kVar3.g(c380Var) | b0kVar3.g(qngVar);
            Object objT3 = b0kVar3.T();
            if (zG2 || objT3 == obj3) {
                zu1 zu1Var = av1Var.b;
                List listN = p7h.N(zu1Var != null ? new yv51(zu1Var.a, zu1Var.b) : null);
                tu1 tu1Var2 = new tu1();
                for (Iterator it = listN.iterator(); it.hasNext(); it = it) {
                    tu1Var2 = new p030((yv51) it.next()).N(tu1Var2);
                }
                gy1 gy1Var2 = av1Var.i;
                boolean zE = this.e.e();
                boolean z2 = av1Var.t;
                ArrayList arrayListN0 = o7h.N0(c380Var, c380Var2);
                fb8 fb8Var = this.f;
                quc0 quc0Var = fb8Var.b;
                Context context = fb8Var.a;
                int iS = zno1.s(q7h.U(arrayListN0, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS >= 16 ? iS : 16);
                Iterator it2 = arrayListN0.iterator();
                while (it2.hasNext()) {
                    Iterator it3 = it2;
                    pt1 pt1Var = (pt1) it2.next();
                    gy1 gy1Var3 = gy1Var2;
                    String strA = pt1Var.a();
                    qng qngVar3 = qngVar;
                    String string = "";
                    if (pt1Var instanceof nt1) {
                        nt1 nt1Var = (nt1) pt1Var;
                        Resources resources = context.getResources();
                        tu1Var = tu1Var2;
                        int i7 = nt1Var.g;
                        i3 = i6;
                        z = z2;
                        String quantityString = resources.getQuantityString(2131820554, i7, Integer.valueOf(i7));
                        Resources resources2 = context.getResources();
                        int i8 = nt1Var.f;
                        String quantityString2 = resources2.getQuantityString(2131820553, i8, Integer.valueOf(i8));
                        if (i8 > 0 && i7 > 0) {
                            string = f4i1.f(quantityString, quc0Var.b(), quantityString2);
                        } else if (i7 > 0) {
                            string = quantityString;
                        } else if (i8 > 0) {
                            string = quantityString2;
                        }
                    } else {
                        tu1Var = tu1Var2;
                        i3 = i6;
                        z = z2;
                        if (!(pt1Var instanceof ot1)) {
                            eg.o();
                            return;
                        }
                        ot1 ot1Var = (ot1) pt1Var;
                        int i9 = ot1Var.N0;
                        String str2 = ot1Var.a;
                        if (!str2.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") && !str2.equals("spotify:collection:tracks") && !str2.equals("spotify:internal:collection:tracks")) {
                            if ((!nhc1.Y(str2, "spotify:user:", false) || !nhc1.R(str2, ":collection", false)) && i9 != 2) {
                                String str3 = bo1.a;
                                Set set = s4b1.f;
                                blc0 blc0Var = uic.x(str2).c;
                                if (blc0Var == blc0.C4 || blc0Var == blc0.D4 || i9 == 1) {
                                    obj2 = obj3;
                                    fu1Var2 = fu1Var2;
                                    string = context.getString(2131951963);
                                } else if (!bo1.d(uic.x(str2).c)) {
                                    StringBuilder sb = new StringBuilder();
                                    boolean z3 = ot1Var.X;
                                    Map map = ot1Var.Z;
                                    if (z3) {
                                        obj2 = obj3;
                                        fu1Var2 = fu1Var2;
                                    } else {
                                        if (!ot1Var.t && (str = ot1Var.i) != null) {
                                            sb.append(context.getString(2131951929, str));
                                        }
                                        if (sb.length() > 0) {
                                            sb.append(" • ");
                                        }
                                        if (map.isEmpty()) {
                                            obj2 = obj3;
                                            sb.append(context.getString(2131951958));
                                        } else {
                                            Iterator it4 = map.entrySet().iterator();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    obj2 = obj3;
                                                    sb.append(context.getString(2131951958));
                                                } else if (((Number) ((Map.Entry) it4.next()).getValue()).intValue() != 0) {
                                                    Integer num = (Integer) map.get(zhu0.f);
                                                    if ((num != null ? num.intValue() : 0) > 0) {
                                                        int iC1 = o7h.c1(map.values());
                                                        sb.append(context.getResources().getQuantityString(2131820560, iC1, Integer.valueOf(iC1)));
                                                        obj2 = obj3;
                                                    } else {
                                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                        for (Map.Entry entry2 : map.entrySet()) {
                                                            if (((Number) entry2.getValue()).intValue() > 0) {
                                                                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
                                                            }
                                                        }
                                                        ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                                                        Iterator it5 = linkedHashMap2.entrySet().iterator();
                                                        while (it5.hasNext()) {
                                                            Map.Entry entry3 = (Map.Entry) it5.next();
                                                            Resources resources3 = context.getResources();
                                                            Iterator it6 = it5;
                                                            int iOrdinal = ((zhu0) entry3.getKey()).ordinal();
                                                            if (iOrdinal != 0) {
                                                                entry = entry3;
                                                                if (iOrdinal == 1) {
                                                                    i4 = 2131820558;
                                                                } else if (iOrdinal == 2) {
                                                                    i4 = 2131820555;
                                                                } else if (iOrdinal != 3) {
                                                                    i4 = iOrdinal != 4 ? 2131820560 : 2131820557;
                                                                } else {
                                                                    i4 = 2131820556;
                                                                }
                                                            } else {
                                                                entry = entry3;
                                                                i4 = 2131820559;
                                                            }
                                                            arrayList.add(resources3.getQuantityString(i4, ((Number) entry.getValue()).intValue(), entry.getValue()));
                                                            it5 = it6;
                                                            obj3 = obj3;
                                                        }
                                                        obj2 = obj3;
                                                        List listT0 = arrayList;
                                                        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
                                                            listT0 = o7h.T0(arrayList);
                                                        }
                                                        sb.append(o7h.y0(listT0, quc0Var.b(), (String) null, (String) null, (iu30) null, 62));
                                                    }
                                                }
                                            }
                                        }
                                        if ((gy1Var instanceof fy1) && ot1Var.h) {
                                            if (sb.length() > 0) {
                                                sb.append(" • ");
                                            }
                                            sb.append(context.getString(2131951959));
                                        }
                                    }
                                    string = sb.toString();
                                }
                            }
                            linkedHashMap.put(strA, string);
                            gy1Var2 = gy1Var3;
                            it2 = it3;
                            tu1Var2 = tu1Var;
                            qngVar = qngVar3;
                            z2 = z;
                            i6 = i3;
                            fu1Var2 = fu1Var2;
                            obj3 = obj2;
                        }
                    }
                    obj2 = obj3;
                    fu1Var2 = fu1Var2;
                    linkedHashMap.put(strA, string);
                    gy1Var2 = gy1Var3;
                    it2 = it3;
                    tu1Var2 = tu1Var;
                    qngVar = qngVar3;
                    z2 = z;
                    i6 = i3;
                    fu1Var2 = fu1Var2;
                    obj3 = obj2;
                }
                obj = obj3;
                qng qngVar4 = qngVar;
                fu1Var = fu1Var2;
                i2 = i6;
                ju1Var = ju1Var2;
                objT3 = new dx1(tu1Var2, ju1Var, gy1Var2, zE, z2, mqo1.B(linkedHashMap), qngVar4, new n2(this, ju1Var2, (byte) 18), this.i);
                qngVar2 = qngVar4;
                b0kVar3.s0(objT3);
            } else {
                obj = obj3;
                ju1Var = ju1Var2;
                qngVar2 = qngVar;
                fu1Var = fu1Var2;
                i2 = i6;
            }
            dx1 dx1Var = (dx1) objT3;
            ven0 ven0VarS = v8r.s(iu30Var, b0kVar3);
            boolean zG3 = b0kVar3.g(fu1Var.d()) | b0kVar3.g(qngVar2);
            Object objT4 = b0kVar3.T();
            if (zG3 || objT4 == obj) {
                xj0 xj0Var = new xj0(ven0VarS, (byte) 10);
                Set setD = fu1Var.d();
                bx1 bx1Var = new bx1(xj0Var, (byte) 2);
                bx1 bx1Var2 = new bx1(xj0Var, (byte) 3);
                wt1 wt1Var = this.b;
                ju1 ju1Var3 = ju1Var;
                objT4 = new ow1(bx1Var, bx1Var2, new ax1(wt1Var, xj0Var, (byte) 1), new vt1(wt1Var, av1Var, qngVar2, setD, xj0Var, (byte) 1), new q01(0, ju1Var3, ju1.class, "back", "back()V", 0, (byte) 5), new n891(wt1Var, av1Var, xj0Var, (byte) 10), new n2(wt1Var, ju1Var3, (byte) 17), new t6(wt1Var, av1Var, xj0Var, (byte) 6), new ax1(xj0Var, wt1Var), new ax1(wt1Var, xj0Var, (byte) 0), new bx1(xj0Var, (byte) 0), new q01(0, wt1Var, wt1.class, "logTextFilterKeyStroke", "logTextFilterKeyStroke()V", 0, (byte) 3), new ab(this.c, (byte) 26), new q01(0, wt1Var, wt1.class, "logSheetDragExpanded", "logSheetDragExpanded()V", 0, (byte) 4), new d4(wt1Var, xj0Var, (byte) 23), new j1(2, this.d, bv1.class, "updatePeekHeight", "updatePeekHeight(II)I", 0, (byte) 4), new bx1(xj0Var, (byte) 1));
                b0kVar3.s0(objT4);
            }
            fu1 fu1Var3 = fu1Var;
            p9p1.a(this.a, this.j, fu1Var3.b.b(), iu30Var, b0kVar3, (i2 << 6) & 7168);
            b0kVar2 = b0kVar3;
            vvm1.i(this.l, fu1Var3, iu30Var, b0kVar2, (i2 << 3) & 896);
            ww1Var2 = ww1Var;
            e9p1.a(fu1Var3, iu30Var, dx1Var, (ow1) objT4, ww1Var2.b, null, b0kVar2, i2 & 112);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new l8(i, this, ww1Var2, iu30Var, kswVar, (byte) 6);
        }
    }
}
