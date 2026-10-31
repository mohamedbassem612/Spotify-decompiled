package p;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k9s extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k9s(Object obj, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x023d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0250  */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        rtm0 rtm0Var;
        muo muoVar;
        k5y j5yVar;
        g5y g5yVar;
        boolean z;
        c5y c5yVar = (c5y) this.b;
        a5y a5yVar = (a5y) obj;
        iu30 iu30Var = (iu30) obj2;
        ((Number) obj4).intValue();
        m4c m4cVar = fkj0.X;
        x340 x340Var = (b0k) obj3;
        cir0 cir0Var = (cir0) x340Var.k(k2r0.a);
        boolean z2 = a5yVar.f;
        zou zouVar = a5yVar.a;
        if (z2 || !(zouVar instanceof apu)) {
            x340Var.i0(439258017);
            x340Var.r(false);
            rtm0Var = null;
        } else {
            x340Var.i0(439099143);
            boolean zG = x340Var.g(cir0Var.g());
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                a18 a18Var = (a18) c5yVar.e.get();
                ttm0 ttm0VarE = cwl1.E(cir0Var.g());
                a18Var.getClass();
                fns fnsVar = igu.a;
                rtm0 rtm0Var2 = new rtm0(ttm0VarE, pyf0.a.f);
                x340Var.s0(rtm0Var2);
                objT = rtm0Var2;
            }
            x340Var.r(false);
            rtm0Var = (rtm0) objT;
        }
        boolean zG2 = x340Var.g(rtm0Var);
        Object objT2 = x340Var.T();
        if (zG2 || objT2 == m4cVar) {
            objT2 = rtm0Var != null ? new muo(rtm0Var) : null;
            x340Var.s0(objT2);
        }
        muo muoVar2 = (muo) objT2;
        boolean zG3 = x340Var.g(rtm0Var);
        Object objT3 = x340Var.T();
        if (zG3 || objT3 == m4cVar) {
            objT3 = v8r.q(Boolean.FALSE);
            x340Var.s0(objT3);
        }
        ven0 ven0Var = (ven0) objT3;
        boolean zI = x340Var.i(rtm0Var);
        Object objT4 = x340Var.T();
        if (zI || objT4 == m4cVar) {
            objT4 = new i5w(rtm0Var, (byte) 19);
            x340Var.s0(objT4);
        }
        qxd0.i(rtm0Var, (iu30) objT4, x340Var);
        boolean zI2 = x340Var.i(rtm0Var) | x340Var.g(cir0Var) | x340Var.g(ven0Var);
        Object objT5 = x340Var.T();
        if (zI2 || objT5 == m4cVar) {
            l2w l2wVar = new l2w(rtm0Var, cir0Var, ven0Var, (lnm) null, (byte) 8);
            x340Var.s0(l2wVar);
            objT5 = l2wVar;
        }
        qxd0.s(rtm0Var, cir0Var, (vu30) objT5, x340Var);
        String str = a5yVar.b;
        String str2 = a5yVar.c;
        boolean z3 = a5yVar.e == 2;
        boolean z4 = a5yVar.f;
        if (zouVar != null) {
            if (zouVar instanceof zou) {
                ArrayList<you> arrayList = zouVar.a;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (you youVar : arrayList) {
                    String str3 = youVar.c;
                    arrayList2.add(new f5y(str3, youVar.a, str3.equals(str2)));
                }
                j5yVar = new i5y(mqo1.A(arrayList2));
            } else {
                if (!(zouVar instanceof apu)) {
                    eg.o();
                    return null;
                }
                ArrayList arrayList3 = ((apu) zouVar).a;
                ArrayList<iou> arrayList4 = new ArrayList();
                for (Object obj5 : arrayList3) {
                    if (!((iou) obj5).c.isEmpty()) {
                        arrayList4.add(obj5);
                    }
                }
                ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
                for (iou iouVar : arrayList4) {
                    String str4 = iouVar.b;
                    String str5 = iouVar.a;
                    ArrayList<gpu> arrayList6 = iouVar.c;
                    c5y c5yVar2 = c5yVar;
                    iu30 iu30Var2 = iu30Var;
                    muo muoVar3 = muoVar2;
                    ArrayList arrayList7 = new ArrayList(q7h.U(arrayList6, 10));
                    for (gpu gpuVar : arrayList6) {
                        String str6 = gpuVar.b;
                        String str7 = gpuVar.a;
                        h290 h290Var = gpuVar.f;
                        h290 h290Var2 = !h290Var.isEmpty() ? h290Var : null;
                        arrayList7.add(new m5y(str6, str7, h290Var2 != null ? o7h.y0(h290Var2, " · ", (String) null, (String) null, (iu30) null, 62) : null, h7w.E(gpuVar.e), gpuVar.b.equals(str2)));
                    }
                    arrayList5.add(new n5y(str4, str5, mqo1.A(arrayList7)));
                    muoVar2 = muoVar3;
                    c5yVar = c5yVar2;
                    iu30Var = iu30Var2;
                }
                c5yVar = c5yVar;
                iu30Var = iu30Var;
                muoVar = muoVar2;
                j5yVar = new j5y(mqo1.A(arrayList5));
            }
            if (a5yVar.d || u890.j(str2, str)) {
                g5yVar = null;
            } else {
                g5yVar = new g5y(str2);
            }
            if (a5yVar.f && u890.j(str2, str) && !z3) {
                z = true;
            } else {
                z = false;
            }
            nyx.a(2, (wux) null, apo.r(-1827310225, new k40(new l5y(z4, j5yVar, g5yVar, z3, z), c5yVar, a5yVar, iu30Var, muoVar, ven0Var), x340Var), x340Var, 3078, 6);
            return rih1.a;
        }
        j5yVar = h5y.a;
        muoVar = muoVar2;
        if (a5yVar.d) {
            g5yVar = null;
        } else {
            g5yVar = null;
        }
        if (a5yVar.f) {
            z = false;
        } else {
            z = false;
        }
        nyx.a(2, (wux) null, apo.r(-1827310225, new k40(new l5y(z4, j5yVar, g5yVar, z3, z), c5yVar, a5yVar, iu30Var, muoVar, ven0Var), x340Var), x340Var, 3078, 6);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        o091 o091Var;
        tob1 tob1Var;
        tob1 tob1Var2;
        tob1 tob1Var3;
        o091 o091Var2;
        tob1 tob1Var4;
        rcz rczVar = (rcz) obj2;
        ((Number) obj4).intValue();
        res resVar = (res) this.b;
        idd1 idd1Var = (idd1) resVar.g;
        jcz jczVar = (jcz) resVar.h;
        String str = rczVar.b;
        kcz kczVar = rczVar.d;
        x340 x340Var = (b0k) obj3;
        x340Var.i0(-484985144);
        String str2 = rczVar.a;
        x340Var.f0(2080716284, str2);
        Object objT = x340Var.T();
        Object obj5 = fkj0.X;
        if (objT == obj5) {
            objT = v8r.q(Boolean.FALSE);
            x340Var.s0(objT);
        }
        tob1 tob1Var5 = (ven0) objT;
        boolean zI = x340Var.i(tob1Var5);
        Object objT2 = x340Var.T();
        if (zI || objT2 == obj5) {
            objT2 = new hj6(tob1Var5, (lnm) null, (byte) 5);
            x340Var.s0(objT2);
        }
        rih1 rih1Var = rih1.a;
        qxd0.t(rih1Var, x340Var, (vu30) objT2);
        Object objT3 = x340Var.T();
        if (objT3 == obj5) {
            objT3 = rqt0.u(new wcz(jczVar.a, rczVar, (byte) 0));
            x340Var.s0(objT3);
        }
        boolean z2 = false;
        ven0 ven0VarG = rwq.g((mr20) objT3, ((whx0) jczVar.a.getValue()).a.get(str2), (o8n) null, x340Var, 0, 2);
        x340Var.f0(2080731582, str);
        if (str.length() == 0) {
            x340Var.i0(78217623);
            x340Var.r(false);
            z = false;
        } else {
            x340Var.i0(78268215);
            Object objT4 = x340Var.T();
            if (objT4 == obj5) {
                objT4 = rqt0.u(new wcz((zob1) idd1Var.getValue(), rczVar, (byte) 1));
                x340Var.s0(objT4);
            }
            boolean zBooleanValue = ((Boolean) rwq.g((mr20) objT4, Boolean.valueOf(((ijo) ((zob1) idd1Var.getValue()).getValue()).a.contains(str)), (o8n) null, x340Var, 0, 2).getValue()).booleanValue();
            x340Var.r(false);
            z = zBooleanValue;
        }
        x340Var.r(false);
        Object objT5 = x340Var.T();
        if (objT5 == obj5) {
            o091Var = null;
            m441 m441Var = new m441(new lqv((ubw0) resVar.e, (ubw0) resVar.f, str2, (lnm) null, (byte) 4));
            x340Var.s0(m441Var);
            objT5 = m441Var;
        } else {
            o091Var = null;
        }
        tob1 tob1VarG = rwq.g((mr20) objT5, (Object) null, (o8n) null, x340Var, 48, 2);
        boolean zE = x340Var.e(kczVar.ordinal());
        Object objT6 = x340Var.T();
        if (zE || objT6 == obj5) {
            objT6 = v8r.q(Boolean.FALSE);
            x340Var.s0(objT6);
        }
        tob1 tob1Var6 = (ven0) objT6;
        x340Var.f0(2080759665, kczVar);
        kcz kczVar2 = kcz.b;
        if (kczVar == kczVar2) {
            x340Var.i0(79133704);
            jr30 jr30Var = jczVar.c;
            Object objT7 = x340Var.T();
            if (objT7 == obj5) {
                objT7 = v8r.q(jr30Var.a(str2));
                x340Var.s0(objT7);
            }
            tob1 tob1Var7 = (ven0) objT7;
            boolean zI2 = x340Var.i(jr30Var) | x340Var.i(rczVar) | x340Var.i(tob1Var7) | x340Var.i(tob1Var6);
            Object objT8 = x340Var.T();
            if (zI2 || objT8 == obj5) {
                tob1Var = tob1Var6;
                objT8 = new lqv(jr30Var, rczVar, tob1Var7, tob1Var, (lnm) null, (byte) 5);
                x340Var.s0(objT8);
            } else {
                tob1Var = tob1Var6;
            }
            qxd0.t(rih1Var, x340Var, (vu30) objT8);
            Object objT9 = x340Var.T();
            if (objT9 == obj5) {
                objT9 = Boolean.valueOf(!((Boolean) tob1Var5.getValue()).booleanValue());
                x340Var.s0(objT9);
            }
            boolean zBooleanValue2 = ((Boolean) objT9).booleanValue();
            Boolean bool = (Boolean) tob1Var5.getValue();
            bool.booleanValue();
            boolean zI3 = x340Var.i(tob1Var5) | x340Var.i(tob1Var) | x340Var.i(tob1Var7) | x340Var.i(jr30Var) | x340Var.i(rczVar);
            Object objT10 = x340Var.T();
            if (zI3 || objT10 == obj5) {
                tob1 tob1Var8 = tob1Var;
                ary aryVar = new ary(zBooleanValue2, jr30Var, rczVar, (ven0) tob1Var5, (ven0) tob1Var8, (ven0) tob1Var7, (lnm) null);
                jr30Var = jr30Var;
                rczVar = rczVar;
                tob1Var2 = tob1Var5;
                tob1Var = tob1Var8;
                tob1Var7 = tob1Var7;
                x340Var.s0(aryVar);
                objT10 = aryVar;
            } else {
                tob1Var2 = tob1Var5;
            }
            qxd0.t(bool, x340Var, (vu30) objT10);
            Object objT11 = x340Var.T();
            if (objT11 == obj5) {
                objT11 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT11);
            }
            ven0 ven0Var = (ven0) objT11;
            j8z j8zVar = (j8z) tob1VarG.getValue();
            o091 o091Var3 = j8zVar != null ? j8zVar.a.h : o091Var;
            boolean zI4 = x340Var.i(tob1VarG) | x340Var.i(ven0Var) | x340Var.i(tob1Var7) | x340Var.i(jr30Var) | x340Var.i(rczVar) | x340Var.i(tob1Var);
            Object objT12 = x340Var.T();
            if (zI4 || objT12 == obj5) {
                tob1 tob1Var9 = tob1Var;
                tob1Var4 = tob1Var7;
                tob1Var3 = tob1VarG;
                df6 df6Var = new df6(jr30Var, rczVar, tob1Var3, ven0Var, tob1Var4, tob1Var9, (lnm) null, (byte) 8);
                tob1Var = tob1Var9;
                x340Var.s0(df6Var);
                objT12 = df6Var;
            } else {
                tob1Var4 = tob1Var7;
                tob1Var3 = tob1VarG;
            }
            qxd0.t(o091Var3, x340Var, (vu30) objT12);
            o091 o091Var4 = (Long) tob1Var4.getValue();
            x340Var.r(z2);
            o091Var2 = o091Var4;
        } else {
            z2 = false;
            tob1Var = tob1Var6;
            tob1Var2 = tob1Var5;
            tob1Var3 = tob1VarG;
            x340Var.i0(80880120);
            x340Var.r(false);
            o091Var2 = o091Var;
        }
        x340Var.r(z2);
        scz sczVarW = resVar.w(rczVar, new tcz((iix0) ven0VarG.getValue(), z, ((Boolean) tob1Var2.getValue()).booleanValue(), o091Var2, (kczVar == kczVar2 && o091Var2 == null && !((Boolean) tob1Var.getValue()).booleanValue()) ? true : z2, (j8z) tob1Var3.getValue()));
        x340Var.r(z2);
        x340Var.r(z2);
        return sczVarW;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        w7h1 w7h1Var2;
        int i;
        goj0 goj0VarA;
        pnt pntVar;
        w7h1 w7h1Var3;
        x340 x340Var;
        tob1 tob1Var;
        avl1 avl1Var;
        String str;
        byte b = this.a;
        zfz zfzVar = zfz.e;
        b7x b7xVar = b7x.a;
        String str2 = "";
        rih1 rih1Var = rih1.a;
        int i2 = 2;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                return new j9s((l9s) obj5, (Context) obj2, (ViewGroup) obj3, (iu30) obj4);
            case 1:
                ((kjs) obj5).b.invoke(new jn11(((Number) obj).intValue(), (String) obj2, (String) obj3, (in11) obj4));
                return rih1Var;
            case 2:
                ((Number) obj3).intValue();
                return new r8l0((g5l0) ((br0) obj5).c, 1);
            case 3:
                o5m0 o5m0Var = (o5m0) obj;
                h1t h1tVar = (h1t) obj5;
                idd1 idd1Var = h1tVar.g;
                r6h1 r6h1Var = o5m0Var.a;
                y6h1 y6h1Var = o5m0Var.b;
                int iOrdinal = ((mvm1) obj4).ordinal();
                if (iOrdinal == 0) {
                    String str3 = (String) idd1Var.getValue();
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("profile_button", (String) null, (Integer) null, str3, (String) null));
                    x6h1VarC.j = false;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    String str4 = (String) idd1Var.getValue();
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str4 != null ? str4 : "")), y6h1VarA, r6h1Var, System.currentTimeMillis());
                } else {
                    if (iOrdinal == 1) {
                        return o5m0Var.e();
                    }
                    if (iOrdinal == 2) {
                        x6h1 x6h1VarC2 = y6h1Var.c();
                        x6h1VarC2.i.add(new a7h1("create_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = false;
                        y6h1 y6h1VarA2 = x6h1VarC2.a();
                        String str5 = pvm1.b;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str5 != null ? str5 : "")), y6h1VarA2, r6h1Var, System.currentTimeMillis());
                    } else if (iOrdinal == 3) {
                        x6h1 x6h1VarC3 = y6h1Var.c();
                        x6h1VarC3.i.add(new a7h1("search_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        y6h1 y6h1VarA3 = x6h1VarC3.a();
                        String str6 = (h1tVar.c.o() && (h1tVar.d.a() instanceof twz0)) ? "spotify:collection:mainsearch" : pvm1.c;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str6 != null ? str6 : "")), y6h1VarA3, r6h1Var, System.currentTimeMillis());
                    } else if (iOrdinal == 4) {
                        x6h1 x6h1VarC4 = y6h1Var.c();
                        x6h1VarC4.i.add(new a7h1("recents_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = false;
                        y6h1 y6h1VarA4 = x6h1VarC4.a();
                        String str7 = pvm1.a;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str7 != null ? str7 : "")), y6h1VarA4, r6h1Var, System.currentTimeMillis());
                    } else {
                        if (iOrdinal != 5) {
                            eg.o();
                            return null;
                        }
                        x6h1 x6h1VarC5 = y6h1Var.c();
                        x6h1VarC5.i.add(new a7h1("download_center_button", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = false;
                        w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:internal:download-center")), x6h1VarC5.a(), r6h1Var, System.currentTimeMillis());
                    }
                }
                return w7h1Var;
            case 4:
                gml0 gml0Var = (gml0) obj;
                r6h1 r6h1Var2 = gml0Var.b.b;
                y6h1 y6h1Var2 = gml0Var.a;
                int iOrdinal2 = ((u8t) obj4).ordinal();
                if (iOrdinal2 == 0) {
                    x6h1 x6h1VarC6 = y6h1Var2.c();
                    x6h1VarC6.i.add(new a7h1("confirm_deletion", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    y6h1 y6h1VarA5 = x6h1VarC6.a();
                    String str8 = (String) ((umf0) obj5).d;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("delete_playlist", 1, Collections.singletonMap("playlist_to_be_deleted", str8 != null ? str8 : "")), y6h1VarA5, r6h1Var2, System.currentTimeMillis());
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC7 = y6h1Var2.c();
                    x6h1VarC7.i.add(new a7h1("cancel", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC7.j = false;
                    w7h1Var2 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC7.a(), r6h1Var2, System.currentTimeMillis());
                }
                return w7h1Var2;
            case 5:
                return new as0((Context) obj2, (let) obj5, (iu30) obj4);
            case 6:
                jjm0 jjm0Var = (jjm0) obj;
                set setVar = (set) obj2;
                int iIntValue = ((Number) obj4).intValue();
                x340 x340Var2 = (b0k) obj3;
                x340Var2.i0(-2116058988);
                Object objT = x340Var2.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = v8r.q(Boolean.FALSE);
                    x340Var2.s0(objT);
                }
                ven0 ven0Var = (ven0) objT;
                ven0 ven0VarH = rwq.h(((wet) obj5).a, x340Var2, 0);
                boolean zI = x340Var2.i(ven0Var);
                Object objT2 = x340Var2.T();
                if (zI || objT2 == m4cVar) {
                    i = 3;
                    objT2 = new wd2(ven0Var, (lnm) null, (byte) 3);
                    x340Var2.s0(objT2);
                } else {
                    i = 3;
                }
                jjm0Var.a((zu30) objT2, x340Var2, (iIntValue << i) & 112);
                hoj0 hoj0VarC = ((ioj0) ven0VarH.getValue()).c(pnt.class, setVar.a);
                if (hoj0VarC != null && (goj0VarA = hoj0VarC.a()) != null && (pntVar = (pnt) goj0VarA.a) != null) {
                    str2 = pntVar.a;
                }
                tet tetVar = new tet(str2, ((Boolean) ven0Var.getValue()).booleanValue());
                x340Var2.r(false);
                return tetVar;
            case 7:
                ((Number) obj3).intValue();
                return new ubl0((vbl0) ((qj0) obj5).e);
            case 8:
                a5l0 a5l0Var = (a5l0) obj;
                tgu tguVar = (tgu) obj4;
                fta ftaVar = ((ygu) obj5).d;
                y6h1 y6h1Var3 = a5l0Var.b;
                ji0 ji0Var = ((zgu) obj2).c;
                if (tguVar.equals(ogu.a) || tguVar.equals(pgu.a)) {
                    ftaVar.v(lm60.d, ji0Var);
                    String str9 = ji0Var.e;
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str9 != null ? str9 : "")), y6h1Var3, a5l0Var.a, System.currentTimeMillis());
                } else {
                    if (!tguVar.equals(qgu.a)) {
                        if (tguVar.equals(sgu.a)) {
                            ftaVar.v(xm60.e, ji0Var);
                            ftaVar.v(vm60.e, ji0Var);
                            return null;
                        }
                        if (tguVar instanceof rgu) {
                            ftaVar.v(new um60("image_fetch_failure", ((rgu) tguVar).a), ji0Var);
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    ftaVar.v(tm60.e, ji0Var);
                    ftaVar.v(mm60.d, ji0Var);
                    w7h1Var3 = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var3, a5l0Var.a, System.currentTimeMillis());
                }
                return w7h1Var3;
            case 9:
                nt81 nt81Var = (nt81) obj;
                iu30 iu30Var = (iu30) obj2;
                int iIntValue2 = ((Number) obj4).intValue();
                kiv kivVar = AndroidCompositionLocals_androidKt.a;
                x340 x340Var3 = (b0k) obj3;
                iac0 iac0Var = (iac0) x340Var3.k(jfe0.a);
                fnu fnuVar = (fnu) obj5;
                ven0 ven0VarH2 = rwq.h(((wnu) fnuVar.q.getValue()).c, x340Var3, 0);
                Boolean bool = (Boolean) ven0VarH2.getValue();
                bool.booleanValue();
                boolean zG = x340Var3.g(ven0VarH2) | x340Var3.i(iac0Var) | x340Var3.i(fnuVar) | ((((iIntValue2 & 112) ^ 48) > 32 && x340Var3.g(iu30Var)) || (iIntValue2 & 48) == 32);
                Object objT3 = x340Var3.T();
                if (zG || objT3 == fkj0.X) {
                    objT3 = new swn(iac0Var, ven0VarH2, fnuVar, iu30Var, (lnm) null, (byte) 22);
                    x340Var3.s0(objT3);
                }
                qxd0.s(iac0Var, bool, (vu30) objT3, x340Var3);
                nyx.a(0, (wux) null, apo.r(214664441, new won((Object) nt81Var, iu30Var, (Object) fnuVar, (byte) 22), x340Var3), x340Var3, 3072, 7);
                return rih1Var;
            case 10:
                etu etuVar = (etu) obj;
                iu30 iu30Var2 = (iu30) obj2;
                x340 x340Var4 = (b0k) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                int i3 = (iIntValue3 & 6) == 0 ? iIntValue3 | ((iIntValue3 & 8) == 0 ? x340Var4.g(etuVar) : x340Var4.i(etuVar) ? 4 : 2) : iIntValue3;
                if ((iIntValue3 & 48) == 0) {
                    i3 |= x340Var4.i(iu30Var2) ? 32 : 16;
                }
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(i3 & 1, (i3 & 147) != 146)) {
                    ((gtu) obj5).c.b(etuVar, iu30Var2, x340Var5, i3 & 126);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 11:
                jjm0 jjm0Var2 = (jjm0) obj;
                gvu gvuVar = (gvu) obj2;
                int iIntValue4 = ((Number) obj4).intValue();
                m4c m4cVar2 = fkj0.X;
                x340 x340Var6 = (b0k) obj3;
                x340Var6.i0(-791133139);
                String str10 = gvuVar.a;
                boolean zG2 = x340Var6.g(str10);
                avl1 avl1Var2 = (ovu) obj5;
                wxu wxuVar = ((ovu) avl1Var2).a;
                Object objT4 = x340Var6.T();
                if (zG2 || objT4 == m4cVar2) {
                    objT4 = rqt0.u(new mvu(wxuVar.getStatus(), gvuVar, (byte) 0));
                    x340Var6.s0(objT4);
                }
                ven0 ven0VarG = rwq.g((mr20) objT4, ((k2v) wxuVar.getStatus().getValue()).a.get(str10), (o8n) null, x340Var6, 0, 2);
                x340 x340Var7 = x340Var6;
                x340Var7.i0(-69724902);
                List<slq0> list = ((ovu) avl1Var2).b;
                int i4 = 10;
                ArrayList<olq0> arrayList = new ArrayList(q7h.U(list, 10));
                for (slq0 slq0Var : list) {
                    boolean zG3 = x340Var7.g(slq0Var) | x340Var7.g(str10);
                    Object objT5 = x340Var7.T();
                    if (zG3 || objT5 == m4cVar2) {
                        objT5 = rqt0.u(new mvu(slq0Var.getStatus(), gvuVar, (byte) 1));
                        x340Var7.s0(objT5);
                    }
                    x340 x340Var8 = x340Var7;
                    arrayList.add((qlq0) rwq.g((mr20) objT5, ((rlq0) slq0Var.getStatus().getValue()).a.get(str10), (o8n) null, x340Var8, 0, 2).getValue());
                    i4 = 10;
                    x340Var7 = x340Var8;
                }
                x340 x340Var9 = x340Var7;
                int i5 = i4;
                x340Var9.r(false);
                boolean z = gvuVar.d;
                h2v h2vVar = (h2v) ven0VarG.getValue();
                boolean zG4 = x340Var9.g(str10) | x340Var9.h(z);
                Object objT6 = x340Var9.T();
                xuu xuuVar = xuu.a;
                if (zG4 || objT6 == m4cVar2) {
                    objT6 = v8r.q(z ? xuuVar : xuu.b);
                    x340Var9.s0(objT6);
                }
                tob1 tob1Var2 = (ven0) objT6;
                h2v h2vVar2 = f2v.a;
                boolean zJ = u890.j(h2vVar, h2vVar2);
                lnm lnmVar = null;
                if (z && ((xuu) tob1Var2.getValue()) == xuuVar && zJ) {
                    x340Var9.i0(-2124254436);
                    boolean zI2 = x340Var9.i(tob1Var2) | x340Var9.i(avl1Var2) | x340Var9.g(str10);
                    Object objT7 = x340Var9.T();
                    if (zI2 || objT7 == m4cVar2) {
                        tob1Var = tob1Var2;
                        str = str10;
                        x340Var = x340Var9;
                        avl1Var = avl1Var2;
                        swn swnVar = new swn(avl1Var, str, tob1Var, (lnm) null, (byte) 24);
                        x340Var.s0(swnVar);
                        objT7 = swnVar;
                    } else {
                        tob1Var = tob1Var2;
                        str = str10;
                        x340Var = x340Var9;
                        avl1Var = avl1Var2;
                    }
                    qxd0.t(str, x340Var, (vu30) objT7);
                    x340Var.r(false);
                } else {
                    h2vVar2 = h2vVar2;
                    x340Var = x340Var9;
                    tob1Var = tob1Var2;
                    avl1Var = avl1Var2;
                    lnmVar = null;
                    x340Var.i0(-2123980551);
                    x340Var.r(false);
                }
                xuu xuuVar2 = (xuu) tob1Var.getValue();
                boolean zI3 = x340Var.i(avl1Var);
                Object objT8 = x340Var.T();
                if (zI3 || objT8 == m4cVar2) {
                    objT8 = new jvu(avl1Var, lnmVar, (byte) 0);
                    x340Var.s0(objT8);
                }
                jjm0Var2.a((zu30) objT8, x340Var, (iIntValue4 << 3) & 112);
                h2v h2vVar3 = (h2v) ven0VarG.getValue();
                h2v h2vVar4 = h2vVar3 == null ? h2vVar2 : h2vVar3;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, i5));
                for (olq0 olq0Var : arrayList) {
                    if (olq0Var == null) {
                        olq0Var = olq0.a;
                    }
                    arrayList2.add(olq0Var);
                }
                ivu ivuVar = new ivu(h2vVar4, arrayList2, gvuVar.a, gvuVar.b, gvuVar.c, xuuVar2);
                x340Var.r(false);
                return ivuVar;
            case 12:
                cp31 cp31Var = (cp31) obj5;
                fn31.T(smo1.e(flo1.l(op71.f(), (q8n) cp31Var.c)), (o8n) null, 0, new fe6(cp31Var, (km61) obj, (Integer) obj2, ((Number) obj3).intValue(), (lnm) null, (byte) 7), 3);
                return Boolean.FALSE;
            case 13:
                zll0 zll0Var = (zll0) obj;
                if (eov.a[((znv) obj4).ordinal()] == 1) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", ktv.c((String) ((cm0) obj5).c))), zll0Var.a, zll0Var.b.b, System.currentTimeMillis());
                }
                eg.o();
                return null;
            case 14:
                htv htvVar = (htv) obj;
                iu30 iu30Var3 = (iu30) obj2;
                x340 x340Var10 = (b0k) obj3;
                int iIntValue5 = ((Number) obj4).intValue();
                int i6 = (iIntValue5 & 6) == 0 ? iIntValue5 | (x340Var10.g(htvVar) ? 4 : 2) : iIntValue5;
                if ((iIntValue5 & 48) == 0) {
                    i6 |= x340Var10.i(iu30Var3) ? 32 : 16;
                }
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(i6 & 1, (i6 & 147) != 146)) {
                    ((vqv) ((mtv) obj5).e.get()).i(htvVar, iu30Var3, (qim0) null, x340Var11, i6 & 126);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 15:
                kvv kvvVar = (kvv) obj;
                iu30 iu30Var4 = (iu30) obj2;
                x340 x340Var12 = (b0k) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i7 = (iIntValue6 & 6) == 0 ? iIntValue6 | (x340Var12.g(kvvVar) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i7 |= x340Var12.i(iu30Var4) ? 32 : 16;
                }
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(i7 & 1, (i7 & 147) != 146)) {
                    ((kp5) ((yzu) obj5).a).i((i7 & 14) | ((i7 << 3) & 896), x340Var13, kvvVar, iu30Var4, (qim0) null);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 16:
                qwv qwvVar = (qwv) obj;
                iu30 iu30Var5 = (iu30) obj2;
                x340 x340Var14 = (b0k) obj3;
                int iIntValue7 = ((Number) obj4).intValue();
                int i8 = (iIntValue7 & 6) == 0 ? iIntValue7 | (x340Var14.g(qwvVar) ? 4 : 2) : iIntValue7;
                if ((iIntValue7 & 48) == 0) {
                    i8 |= x340Var14.i(iu30Var5) ? 32 : 16;
                }
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(i8 & 1, (i8 & 147) != 146)) {
                    ((qvv) ((uwv) obj5).d.get()).f(qwvVar, null, iu30Var5, x340Var15, ((i8 << 3) & 896) | (i8 & 14));
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 17:
                eyv eyvVar = (eyv) obj;
                iu30 iu30Var6 = (iu30) obj2;
                x340 x340Var16 = (b0k) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                int i9 = (iIntValue8 & 6) == 0 ? iIntValue8 | (x340Var16.g(eyvVar) ? 4 : 2) : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i9 |= x340Var16.i(iu30Var6) ? 32 : 16;
                }
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(i9 & 1, (i9 & 147) != 146)) {
                    ((bxv) ((iyv) obj5).d.get()).e(eyvVar, null, iu30Var6, x340Var17, (i9 & 14) | ((i9 << 3) & 896));
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 18:
                m3w m3wVar = (m3w) obj;
                iu30 iu30Var7 = (iu30) obj2;
                x340 x340Var18 = (b0k) obj3;
                int iIntValue9 = ((Number) obj4).intValue();
                int i10 = (iIntValue9 & 6) == 0 ? iIntValue9 | ((iIntValue9 & 8) == 0 ? x340Var18.g(m3wVar) : x340Var18.i(m3wVar) ? 4 : 2) : iIntValue9;
                if ((iIntValue9 & 48) == 0) {
                    i10 |= x340Var18.i(iu30Var7) ? 32 : 16;
                }
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(i10 & 1, (i10 & 147) != 146)) {
                    m3wVar.getClass();
                    o2w.b(m3wVar, iu30Var7, ((k2w) obj5).e, x340Var19, i10 & 112);
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case 19:
                f6x f6xVar = (f6x) obj;
                ((Number) obj3).intValue();
                d8r0 d8r0Var = f6xVar.c;
                mjl0 mjl0Var = new mjl0(new mjl0((urk0) ((br0) obj5).c, d8r0Var.b, d8r0Var.a, d8r0Var.e), "");
                sio1 sio1Var = f6xVar.d;
                if (sio1Var.equals(g6x.c)) {
                    return mjl0Var;
                }
                if (sio1Var.equals(h6x.c)) {
                    return new sqk0(new lvl0(mjl0Var, (byte) 2));
                }
                if (sio1Var instanceof i6x) {
                    return new sqk0(new lvl0(mjl0Var, ((i6x) sio1Var).c, (byte) 3), (byte) 0);
                }
                eg.o();
                return null;
            case 20:
                f6x f6xVar2 = (f6x) obj;
                ((Number) obj3).intValue();
                d8r0 d8r0Var2 = f6xVar2.c;
                mjl0 mjl0Var2 = new mjl0(new mjl0(((j6x) obj5).b, d8r0Var2.b, d8r0Var2.a, d8r0Var2.e), "");
                sio1 sio1Var2 = f6xVar2.d;
                if (sio1Var2.equals(g6x.c)) {
                    return null;
                }
                if (sio1Var2.equals(h6x.c)) {
                    return new sqk0(new lvl0(mjl0Var2, (byte) 2));
                }
                if (sio1Var2 instanceof i6x) {
                    return new sqk0(new lvl0(mjl0Var2, ((i6x) sio1Var2).c, (byte) 3), (byte) 0);
                }
                eg.o();
                return null;
            case 21:
                b0k b0kVar = (b0k) obj3;
                ((Number) obj4).intValue();
                nyx.a(2, (wux) null, apo.r(-451641807, new g6w((o2y) obj, (iu30) obj2, (s2y) obj5, (byte) 15), b0kVar), b0kVar, 3078, 6);
                return rih1Var;
            case 22:
                return a(obj, obj2, obj3, obj4);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                dey deyVar = (dey) obj;
                ((Number) obj3).intValue();
                i4m0 i4m0Var = (i4m0) ((br0) obj5).c;
                Integer numValueOf = Integer.valueOf(deyVar.c);
                int i11 = deyVar.d;
                String str11 = deyVar.e;
                i4m0Var.getClass();
                return new d4m0(new e4m0(i4m0Var, numValueOf, i11, str11));
            case 24:
                jey jeyVar = (jey) obj;
                ((Number) obj3).intValue();
                i4m0 i4m0Var2 = ((key) obj5).a;
                Integer numValueOf2 = Integer.valueOf(jeyVar.d);
                rj01 rj01Var = jeyVar.a;
                i2 = rj01Var.i.isEmpty() ? 2 : 1;
                String str12 = rj01Var.Y;
                i4m0Var2.getClass();
                return new e4m0(i4m0Var2, numValueOf2, i2, str12);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ((Number) obj3).intValue();
                return new jvk0(((fmy) obj5).d, (r6h1) obj4);
            case 26:
                return d(obj, obj2, obj3, obj4);
            case 27:
                xfz xfzVar = (xfz) obj;
                ((Number) obj3).intValue();
                urk0 urk0Var = (urk0) ((umf0) obj5).d;
                d8r0 d8r0Var3 = xfzVar.d;
                String str13 = d8r0Var3.b;
                String str14 = d8r0Var3.a;
                String str15 = d8r0Var3.e;
                grn1 grn1Var = xfzVar.e;
                if (grn1Var.equals(zfzVar)) {
                    return new mvl0(new lvl0(new mjl0(new mjl0(urk0Var, str13, str14, str15), ""), (byte) 1));
                }
                if (grn1Var instanceof agz) {
                    agz agzVar = (agz) grn1Var;
                    String str16 = agzVar.f;
                    return agzVar.e ? new hwl0(new lvl0(new mjl0(new mjl0(urk0Var, str13, str14, str15), ""), str16, (byte) 4)) : new svl0(new lvl0(new mjl0(new mjl0(urk0Var, str13, str14, str15), ""), str16, (byte) 3));
                }
                if (grn1Var instanceof yfz) {
                    return new hvl0(new lvl0(new mjl0(new mjl0(urk0Var, str13, str14, str15), ""), ((yfz) grn1Var).e, (byte) 0));
                }
                eg.o();
                return null;
            case 28:
                xfz xfzVar2 = (xfz) obj;
                ((Number) obj3).intValue();
                urk0 urk0Var2 = (urk0) ((rt01) obj5).d;
                d8r0 d8r0Var4 = xfzVar2.d;
                String str17 = d8r0Var4.b;
                String str18 = d8r0Var4.a;
                String str19 = d8r0Var4.e;
                grn1 grn1Var2 = xfzVar2.e;
                if (grn1Var2.equals(zfzVar)) {
                    return new mvl0(new lvl0(new mjl0(new mjl0(urk0Var2, str17, str18, str19), ""), (byte) 1));
                }
                if (grn1Var2 instanceof agz) {
                    agz agzVar2 = (agz) grn1Var2;
                    String str20 = agzVar2.f;
                    return agzVar2.e ? new hwl0(new lvl0(new mjl0(new mjl0(urk0Var2, str17, str18, str19), ""), str20, (byte) 4)) : new svl0(new lvl0(new mjl0(new mjl0(urk0Var2, str17, str18, str19), ""), str20, (byte) 3));
                }
                if (grn1Var2 instanceof yfz) {
                    return new hvl0(new lvl0(new mjl0(new mjl0(urk0Var2, str17, str18, str19), ""), ((yfz) grn1Var2).e, (byte) 0));
                }
                eg.o();
                return null;
            default:
                ((Number) obj3).intValue();
                i4m0 i4m0Var3 = ((rjz) obj5).a;
                int iC = l1d.C(((pjz) obj).a);
                if (iC != 0) {
                    if (iC == 1) {
                        i2 = 1;
                    } else {
                        if (iC != 2) {
                            eg.o();
                            return null;
                        }
                        i2 = 3;
                    }
                }
                i4m0Var3.getClass();
                return new f4m0(i4m0Var3, i2);
        }
    }
}
