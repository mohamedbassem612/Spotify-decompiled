package p;

import android.net.Uri;
import android.os.Parcelable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wcy0 extends hab0 implements dv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wcy0(Object obj, byte b) {
        super(6);
        this.a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        jjm0 jjm0Var = (jjm0) obj;
        si81 si81Var = (si81) obj2;
        ti81 ti81Var = (ti81) obj3;
        iu30 iu30Var = (iu30) obj4;
        int iIntValue = ((Number) obj6).intValue();
        pt ptVar = (pt) this.b;
        x340 x340Var = (b0k) obj5;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = v8r.q(ti81Var.a);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = v8r.q(ti81Var.b);
            x340Var.s0(objT2);
        }
        ven0 ven0Var2 = (ven0) objT2;
        Object objT3 = x340Var.T();
        if (objT3 == m4cVar) {
            objT3 = v8r.q(ti81Var.c);
            x340Var.s0(objT3);
        }
        ven0 ven0Var3 = (ven0) objT3;
        Object objT4 = x340Var.T();
        if (objT4 == m4cVar) {
            objT4 = v8r.q(ti81Var.d);
            x340Var.s0(objT4);
        }
        ven0 ven0Var4 = (ven0) objT4;
        boolean zI = x340Var.i(ptVar) | x340Var.i(ven0Var) | x340Var.i(ven0Var3) | x340Var.i(ven0Var2) | x340Var.i(ven0Var4);
        Object objT5 = x340Var.T();
        if (zI || objT5 == m4cVar) {
            sew0 sew0Var = new sew0((byte) 29, ptVar, ven0Var, ven0Var3, ven0Var2, ven0Var4, (lnm) null);
            x340Var.s0(sew0Var);
            objT5 = sew0Var;
        }
        rih1 rih1Var = rih1.a;
        qxd0.t(rih1Var, x340Var, (vu30) objT5);
        ven0 ven0VarB = ptVar.B(si81Var.d, x340Var);
        ven0 ven0VarB2 = ptVar.B(si81Var.c, x340Var);
        String str = (String) ven0Var.getValue();
        Uri uri = (Uri) ven0Var2.getValue();
        String str2 = (String) ven0Var3.getValue();
        u7h u7hVar = (u7h) ven0Var4.getValue();
        li81 li81Var = (li81) ven0VarB2.getValue();
        boolean z = true;
        iu30Var.invoke(new ti81(str, uri, str2, u7hVar, si81Var.a || (!si81Var.b && li81Var == null), si81Var.b, li81Var, (li81) ven0VarB.getValue()));
        boolean zI2 = x340Var.i(ptVar);
        if ((((iIntValue & 112) ^ 48) <= 32 || !x340Var.i(si81Var)) && (iIntValue & 48) != 32) {
            z = false;
        }
        boolean z2 = zI2 | z;
        Object objT6 = x340Var.T();
        if (z2 || objT6 == m4cVar) {
            objT6 = new w63((Object) ptVar, (Object) si81Var, (lnm) null, (byte) 22);
            x340Var.s0(objT6);
        }
        jjm0Var.a((zu30) objT6, x340Var, (iIntValue << 3) & 112);
        return rih1Var;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        jjm0 jjm0Var = (jjm0) obj;
        zi81 zi81Var = (zi81) obj2;
        aj81 aj81Var = (aj81) obj3;
        iu30 iu30Var = (iu30) obj4;
        int iIntValue = ((Number) obj6).intValue();
        res resVar = (res) this.b;
        ki81 ki81Var = zi81Var.a;
        x340 x340Var = (b0k) obj5;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = v8r.q(aj81Var.a);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = v8r.q(aj81Var.b);
            x340Var.s0(objT2);
        }
        ven0 ven0Var2 = (ven0) objT2;
        Object objT3 = x340Var.T();
        if (objT3 == m4cVar) {
            objT3 = v8r.q(aj81Var.c);
            x340Var.s0(objT3);
        }
        ven0 ven0Var3 = (ven0) objT3;
        Object objT4 = x340Var.T();
        if (objT4 == m4cVar) {
            objT4 = v8r.q(aj81Var.d);
            x340Var.s0(objT4);
        }
        ven0 ven0Var4 = (ven0) objT4;
        boolean zI = x340Var.i(resVar) | x340Var.i(ven0Var) | x340Var.i(ven0Var3) | x340Var.i(ven0Var2) | x340Var.i(ven0Var4);
        Object objT5 = x340Var.T();
        if (zI || objT5 == m4cVar) {
            objT5 = new bj81((byte) 0, (Object) resVar, (Object) ven0Var, (Object) ven0Var3, (Object) ven0Var2, (Object) ven0Var4, (lnm) null);
            x340Var.s0(objT5);
        }
        rih1 rih1Var = rih1.a;
        qxd0.t(rih1Var, x340Var, (vu30) objT5);
        boolean zG = x340Var.g(ki81Var);
        Object objT6 = x340Var.T();
        if (zG || objT6 == m4cVar) {
            gu guVar = (gu) resVar.h;
            idd1 idd1Var = guVar.l;
            ji81 ji81Var = ki81Var.a;
            if (ji81Var instanceof hi81) {
                i = 1;
                objT6 = new ypg0(new fu(1, (hi81) ji81Var, new idd1(new eu(guVar, (byte) 1)), new idd1(new eu(guVar, (byte) 2)), (byte) 0), (zob1) idd1Var.getValue());
            } else {
                i = 1;
                if (!(ji81Var instanceof ii81)) {
                    eg.o();
                    return null;
                }
                objT6 = new ypg0(new ym((fr) guVar.k.get(), 1, (byte) 1), (zob1) idd1Var.getValue());
            }
            x340Var.s0(objT6);
        } else {
            i = 1;
        }
        ven0 ven0VarH = rwq.h((zob1) objT6, x340Var, 0);
        ho41 ho41Var = zi81Var.b;
        if (((li81) ven0VarH.getValue()) == null) {
            i = 0;
        }
        ho41Var.a = i;
        iu30Var.invoke(new aj81((String) ven0Var.getValue(), (Uri) ven0Var2.getValue(), (String) ven0Var3.getValue(), (u7h) ven0Var4.getValue(), zi81Var.a, (li81) ven0VarH.getValue()));
        boolean zI2 = x340Var.i(resVar);
        Object objT7 = x340Var.T();
        if (zI2 || objT7 == m4cVar) {
            objT7 = new cj81(resVar, (lnm) null, (byte) 0);
            x340Var.s0(objT7);
        }
        jjm0Var.a((zu30) objT7, x340Var, (iIntValue << 3) & 112);
        return rih1Var;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        jjm0 jjm0Var = (jjm0) obj;
        rih1 rih1Var = (rih1) obj2;
        xwb1 xwb1Var = (xwb1) obj3;
        iu30 iu30Var = (iu30) obj4;
        int iIntValue = ((Number) obj6).intValue();
        cxb1 cxb1Var = (cxb1) this.b;
        x340 x340Var = (b0k) obj5;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = d3p1.F(cxb1Var.d, cxb1Var.f, rih1Var);
            x340Var.s0(objT);
        }
        ven0 ven0VarH = rwq.h((zob1) objT, x340Var, 0);
        String string = ihc1.e1((String) rwq.h(cxb1Var.a, x340Var, 0).getValue()).toString();
        boolean z = string.length() >= 3;
        boolean zI = x340Var.i(cxb1Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new td1(cxb1Var, (lnm) null, (byte) 14);
            x340Var.s0(objT2);
        }
        jjm0Var.a((zu30) objT2, x340Var, (iIntValue << 3) & 112);
        if (z) {
            k1r k1rVar = (k1r) ven0VarH.getValue();
            k1rVar.getClass();
            if (k1rVar instanceof i1r) {
                String lowerCase = string.toLowerCase(Locale.ROOT);
                ArrayList arrayList = ((ywb1) u890.k((k1r) ven0VarH.getValue(), (d0r) null, (n4r) null)).a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj7 : arrayList) {
                    List list = ((zwb1) obj7).b;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (ihc1.h0(((String) it.next()).toLowerCase(Locale.ROOT), lowerCase, false)) {
                                arrayList2.add(obj7);
                                break;
                            }
                        }
                    }
                }
                List listD1 = o7h.d1(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(q7h.U(listD1, 10));
                Iterator it2 = listD1.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((zwb1) it2.next()).a);
                }
                xwb1Var = new xwb1(arrayList3);
            }
        } else {
            xwb1Var = new xwb1();
        }
        iu30Var.invoke(xwb1Var);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        jjm0 jjm0Var = (jjm0) obj;
        mxb1 mxb1Var = (mxb1) obj3;
        iu30 iu30Var = (iu30) obj4;
        int iIntValue = ((Number) obj6).intValue();
        pxb1 pxb1Var = (pxb1) this.b;
        x340 x340Var = (b0k) obj5;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        rih1 rih1Var = rih1.a;
        if (objT == m4cVar) {
            objT = d3p1.F(pxb1Var.a, pxb1Var.d, rih1Var);
            x340Var.s0(objT);
        }
        ven0 ven0VarH = rwq.h((zob1) objT, x340Var, 0);
        boolean zI = x340Var.i(pxb1Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new cj81(pxb1Var, (lnm) null, (byte) 2);
            x340Var.s0(objT2);
        }
        jjm0Var.a((zu30) objT2, x340Var, (iIntValue << 3) & 112);
        k1r k1rVar = (k1r) ven0VarH.getValue();
        k1rVar.getClass();
        if (k1rVar instanceof i1r) {
            List<rvb1> list = ((oxb1) u890.k((k1r) ven0VarH.getValue(), (d0r) null, (n4r) null)).a;
            ArrayList arrayList = new ArrayList(q7h.U(list, 10));
            for (rvb1 rvb1Var : list) {
                arrayList.add(new nxb1(rvb1Var.b, rvb1Var.c));
            }
            mxb1Var = new mxb1(arrayList);
        }
        iu30Var.invoke(mxb1Var);
        return rih1Var;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        jjm0 jjm0Var = (jjm0) obj;
        j1c1 j1c1Var = (j1c1) obj3;
        iu30 iu30Var = (iu30) obj4;
        int iIntValue = ((Number) obj6).intValue();
        nl9 nl9Var = (nl9) this.b;
        x340 x340Var = (b0k) obj5;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = v8r.q(j1c1Var);
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        ven0Var.setValue(j1c1Var);
        int i = (iIntValue & 7168) ^ 3072;
        boolean zI = x340Var.i(nl9Var) | x340Var.i(ven0Var) | ((i > 2048 && x340Var.g(iu30Var)) || (iIntValue & 3072) == 2048);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new bfb1(nl9Var, iu30Var, ven0Var, (lnm) null, (byte) 2);
            x340Var.s0(objT2);
        }
        rih1 rih1Var = rih1.a;
        qxd0.t(rih1Var, x340Var, (vu30) objT2);
        boolean zI2 = x340Var.i(nl9Var) | ((i > 2048 && x340Var.g(iu30Var)) || (iIntValue & 3072) == 2048);
        Object objT3 = x340Var.T();
        if (zI2 || objT3 == m4cVar) {
            objT3 = new sv8(nl9Var, iu30Var, (lnm) null, (byte) 10);
            x340Var.s0(objT3);
        }
        jjm0Var.a((zu30) objT3, x340Var, (iIntValue << 3) & 112);
        return rih1Var;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        jjm0 jjm0Var = (jjm0) obj;
        rih1 rih1Var = (rih1) obj2;
        bsc1 bsc1Var = (bsc1) obj3;
        iu30 iu30Var = (iu30) obj4;
        int iIntValue = ((Number) obj6).intValue();
        rwj rwjVar = (rwj) this.b;
        x340 x340Var = (b0k) obj5;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = v8r.q("");
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        byte b = 1;
        boolean zI = x340Var.i(rwjVar) | ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(bsc1Var)) || (iIntValue & 384) == 256) | ((((iIntValue & 7168) ^ 3072) > 2048 && x340Var.g(iu30Var)) || (iIntValue & 3072) == 2048);
        Object objT2 = x340Var.T();
        lnm lnmVar = null;
        if (zI || objT2 == m4cVar) {
            objT2 = new bfb1(rwjVar, bsc1Var, iu30Var, (lnm) null, (byte) 5);
            x340Var.s0(objT2);
        }
        qxd0.t(rih1Var, x340Var, (vu30) objT2);
        boolean zI2 = x340Var.i(rwjVar) | x340Var.i(ven0Var);
        Object objT3 = x340Var.T();
        if (zI2 || objT3 == m4cVar) {
            objT3 = new jvu(rwjVar, ven0Var, (lnm) null, (byte) 4);
            x340Var.s0(objT3);
        }
        jjm0Var.a((zu30) objT3, x340Var, (iIntValue << 3) & 112);
        String str = (String) ven0Var.getValue();
        boolean zI3 = x340Var.i(ven0Var) | x340Var.i(rwjVar);
        Object objT4 = x340Var.T();
        if (zI3 || objT4 == m4cVar) {
            objT4 = new kwb1(rwjVar, ven0Var, lnmVar, b);
            x340Var.s0(objT4);
        }
        qxd0.t(str, x340Var, (vu30) objT4);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0069  */
    /* JADX WARN: Code duplicated, block: B:49:0x010f  */
    /* JADX WARN: Code duplicated, block: B:67:0x014a  */
    /* JADX WARN: Code duplicated, block: B:68:0x014f  */
    /* JADX WARN: Code duplicated, block: B:81:0x017d  */
    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        k1r k1rVarN;
        qsd1 qsd1VarG;
        mmr0 mmr0Var;
        afx afxVar;
        mq70 mq70Var;
        pp70 pp70Var;
        afx afxVar2;
        ho70 ho70Var;
        String str;
        mq70 mq70Var2;
        up70 up70VarA;
        pp70 pp70Var2;
        jjm0 jjm0Var = (jjm0) obj;
        psd1 psd1Var = (psd1) obj2;
        qsd1 qsd1Var = (tsd1) obj3;
        iu30 iu30Var = (iu30) obj4;
        x340 x340Var = (b0k) obj5;
        int iIntValue = ((Number) obj6).intValue();
        m4c m4cVar = fkj0.X;
        ysd1 ysd1Var = (ysd1) this.b;
        d0r d0rVar = ysd1Var.a;
        String str2 = psd1Var.e;
        String str3 = psd1Var.d;
        String str4 = str3 == null ? str2 : str3;
        x340 x340Var2 = x340Var;
        boolean zG = x340Var2.g(str4);
        Object objT = x340Var2.T();
        k1r k1rVar = j1r.a;
        if (zG || objT == m4cVar) {
            objT = str4 != null ? d3p1.F(d0rVar, ysd1.Z, str4) : new huz(k1rVar, (byte) 10);
            x340Var2.s0(objT);
        }
        mr20 mr20Var = (mr20) objT;
        String str5 = null;
        if (str4 == null || (k1rVarN = x2p1.n(d0rVar, ysd1.Z, str4)) == null) {
            k1rVarN = k1rVar;
        } else {
            if (!(k1rVarN instanceof i1r)) {
                k1rVarN = null;
            }
            if (k1rVarN == null) {
                k1rVarN = k1rVar;
            }
        }
        ven0 ven0VarG = rwq.g(mr20Var, k1rVarN, (o8n) null, x340Var2, 0, 2);
        Object objT2 = x340Var2.T();
        if (objT2 == m4cVar) {
            objT2 = v8r.q(Boolean.FALSE);
            x340Var2.s0(objT2);
        }
        ven0 ven0Var = (ven0) objT2;
        boolean zI = x340Var2.i(ysd1Var) | x340Var2.i(psd1Var) | x340Var2.i(ven0Var);
        Object objT3 = x340Var2.T();
        if (zI || objT3 == m4cVar) {
            objT3 = new o6q0(ysd1Var, psd1Var, ven0Var, (lnm) null);
            x340Var2.s0(objT3);
        }
        jjm0Var.a((zu30) objT3, x340Var2, (iIntValue << 3) & 112);
        if (!u890.j((k1r) ven0VarG.getValue(), k1rVar) || (qsd1Var instanceof qsd1)) {
            i1r i1rVar = (k1r) ven0VarG.getValue();
            Integer num = psd1Var.c;
            if (num != null) {
                int iIntValue2 = num.intValue();
                qsd1 rsd1Var = new rsd1(iIntValue2, psd1Var.f);
                if (str3 != null) {
                    mmr0Var = new mmr0(str3, ksd1.b);
                } else {
                    if (str2 != null) {
                        mmr0Var = new mmr0(str2, ksd1.a);
                    } else {
                        qsd1Var = rsd1Var;
                    }
                    if (qsd1Var instanceof qsd1) {
                        qsd1 qsd1Var2 = qsd1Var;
                        qsd1Var = new qsd1(qsd1Var2.a, qsd1Var2.b, ((Boolean) ven0Var.getValue()).booleanValue());
                    }
                }
                String str6 = (String) mmr0Var.a;
                ksd1 ksd1Var = (ksd1) mmr0Var.b;
                if (i1rVar.equals(k1rVar)) {
                    qsd1VarG = ysd1.g(psd1Var);
                } else if (i1rVar instanceof h1r) {
                    qsd1Var = rsd1Var;
                } else {
                    if (!(i1rVar instanceof i1r)) {
                        eg.o();
                        return null;
                    }
                    vsd1 vsd1Var = (vsd1) i1rVar.a;
                    jo70 jo70Var = vsd1Var.a;
                    xkk1 xkk1Var = vsd1Var.b;
                    if (xkk1Var == null || (pp70Var2 = xkk1Var.d) == null) {
                        if (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (pp70Var = mq70Var.b) == null) {
                            afxVar = null;
                        } else {
                            afxVar2 = pp70Var.c;
                        }
                        boolean z = psd1Var.f;
                        String str7 = jo70Var.a;
                        ho70Var = (ho70) o7h.s0(jo70Var.d);
                        if (ho70Var != null) {
                            str = ho70Var.a;
                        } else {
                            str = null;
                        }
                        if (xkk1Var != null && (mq70Var2 = xkk1Var.a) != null && (up70VarA = mq70Var2.a(vp70.c)) != null) {
                            str5 = up70VarA.a.a;
                        }
                        qsd1Var = new ssd1(z, iIntValue2, str6, str7, ksd1Var, str, str5, afxVar);
                    } else {
                        afxVar2 = pp70Var2.c;
                    }
                    afxVar = afxVar2;
                    boolean z2 = psd1Var.f;
                    String str8 = jo70Var.a;
                    ho70Var = (ho70) o7h.s0(jo70Var.d);
                    if (ho70Var != null) {
                        str = ho70Var.a;
                    } else {
                        str = null;
                    }
                    if (xkk1Var != null) {
                        str5 = up70VarA.a.a;
                    }
                    qsd1Var = new ssd1(z2, iIntValue2, str6, str8, ksd1Var, str, str5, afxVar);
                }
                if (qsd1Var instanceof qsd1) {
                    qsd1 qsd1Var3 = qsd1Var;
                    qsd1Var = new qsd1(qsd1Var3.a, qsd1Var3.b, ((Boolean) ven0Var.getValue()).booleanValue());
                }
            } else {
                qsd1VarG = ysd1.g(psd1Var);
            }
            qsd1Var = qsd1VarG;
            if (qsd1Var instanceof qsd1) {
                qsd1 qsd1Var4 = qsd1Var;
                qsd1Var = new qsd1(qsd1Var4.a, qsd1Var4.b, ((Boolean) ven0Var.getValue()).booleanValue());
            }
        }
        iu30Var.invoke(qsd1Var);
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        jjm0 jjm0Var = (jjm0) obj;
        q2f1 q2f1Var = (q2f1) obj3;
        iu30 iu30Var = (iu30) obj4;
        int iIntValue = ((Number) obj6).intValue();
        m4c m4cVar = fkj0.X;
        z2f1 z2f1Var = (z2f1) this.b;
        x340 x340Var = (b0k) obj5;
        boolean zI = x340Var.i(z2f1Var) | ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(q2f1Var)) || (iIntValue & 384) == 256) | ((((iIntValue & 7168) ^ 3072) > 2048 && x340Var.g(iu30Var)) || (iIntValue & 3072) == 2048);
        Object objT = x340Var.T();
        if (zI || objT == m4cVar) {
            bfb1 bfb1Var = new bfb1(z2f1Var, q2f1Var, iu30Var, (lnm) null, (byte) 16);
            x340Var.s0(bfb1Var);
            objT = bfb1Var;
        }
        rih1 rih1Var = rih1.a;
        qxd0.t(rih1Var, x340Var, (vu30) objT);
        boolean zI2 = x340Var.i(z2f1Var);
        Object objT2 = x340Var.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new xzu0(z2f1Var, (lnm) null, (byte) 2);
            x340Var.s0(objT2);
        }
        jjm0Var.a((zu30) objT2, x340Var, (iIntValue << 3) & 112);
        return rih1Var;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        tob1 tob1Var;
        tob1 tob1Var2;
        int i;
        boolean z;
        gql gqlVar;
        jjm0 jjm0Var = (jjm0) obj;
        d2g1 d2g1Var = (d2g1) obj2;
        e2g1 e2g1Var = (e2g1) obj3;
        iu30 iu30Var = (iu30) obj4;
        int iIntValue = ((Number) obj6).intValue();
        c380<plf1> c380Var = d2g1Var.f;
        nl9 nl9Var = (nl9) this.b;
        x340 x340Var = (b0k) obj5;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = ((zr00) nl9Var.e).a;
            x340Var.s0(objT);
        }
        Boolean bool = Boolean.FALSE;
        tob1 tob1VarG = rwq.g((mr20) objT, bool, (o8n) null, x340Var, 48, 2);
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = yoi1.g(((yh2) nl9Var.f).a());
            x340Var.s0(objT2);
        }
        ven0 ven0VarG = rwq.g((mr20) objT2, bool, (o8n) null, x340Var, 48, 2);
        Object objT3 = x340Var.T();
        if (objT3 == m4cVar) {
            objT3 = ((ov20) nl9Var.g).a;
            x340Var.s0(objT3);
        }
        b7x b7xVar = b7x.a;
        ven0 ven0VarG2 = rwq.g((mr20) objT3, b7xVar, (o8n) null, x340Var, 48, 2);
        boolean zG = x340Var.g(c380Var);
        Object objT4 = x340Var.T();
        if (zG || objT4 == m4cVar) {
            f8b f8bVar = (f8b) nl9Var.h;
            ArrayList arrayList = new ArrayList();
            Iterator it = c380Var.iterator();
            while (it.hasNext()) {
                r7h.W(((plf1) it.next()).n.b, arrayList);
                tob1VarG = tob1VarG;
            }
            tob1Var = tob1VarG;
            objT4 = yoi1.g(f8bVar.a(arrayList));
            x340Var.s0(objT4);
        } else {
            tob1Var = tob1VarG;
        }
        tob1 tob1VarG2 = rwq.g((mr20) objT4, b7xVar, (o8n) null, x340Var, 48, 2);
        boolean zG2 = x340Var.g(c380Var);
        Object objT5 = x340Var.T();
        if (zG2 || objT5 == m4cVar) {
            t7y t7yVar = (t7y) nl9Var.i;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj7 : c380Var) {
                tob1 tob1Var3 = tob1VarG2;
                int i2 = iIntValue;
                if (((plf1) obj7).G == 2) {
                    arrayList2.add(obj7);
                }
                tob1VarG2 = tob1Var3;
                iIntValue = i2;
            }
            tob1Var2 = tob1VarG2;
            i = iIntValue;
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((plf1) it2.next()).a);
            }
            objT5 = t7yVar.h(arrayList3);
            x340Var.s0(objT5);
        } else {
            tob1Var2 = tob1VarG2;
            i = iIntValue;
        }
        ven0 ven0VarG3 = rwq.g((mr20) objT5, b7xVar, (o8n) null, x340Var, 48, 2);
        Object objT6 = x340Var.T();
        if (objT6 == m4cVar) {
            objT6 = c13.l(e2g1Var.b, x340Var);
        }
        ven0 ven0Var = (ven0) objT6;
        boolean zI = x340Var.i(ven0Var);
        Object objT7 = x340Var.T();
        if (zI || objT7 == m4cVar) {
            objT7 = new wd2(ven0Var, (lnm) null, (byte) 17);
            x340Var.s0(objT7);
        }
        jjm0Var.a((zu30) objT7, x340Var, (i << 3) & 112);
        boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
        ArrayList arrayList4 = new ArrayList(q7h.U(c380Var, 10));
        for (plf1 plf1Var : c380Var) {
            String str = plf1Var.f;
            int i3 = plf1Var.G;
            List list = plf1Var.n.b;
            boolean z2 = false;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        z = false;
                        break;
                    }
                    if (u890.j(((Map) tob1Var2.getValue()).get((String) it3.next()), Boolean.TRUE)) {
                        z = true;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            boolean zT = y7y0.t("obfuscate-restricted-tracks", (Map) ven0VarG2.getValue());
            boolean zBooleanValue2 = ((Boolean) ven0VarG.getValue()).booleanValue();
            boolean zBooleanValue3 = ((Boolean) tob1Var.getValue()).booleanValue();
            Boolean bool2 = (Boolean) ((Map) ven0VarG3.getValue()).get(plf1Var.a);
            boolean zBooleanValue4 = bool2 != null ? bool2.booleanValue() : false;
            if (i3 != 3 && zT) {
                z2 = true;
            }
            boolean zF = o0c.F(i3, zBooleanValue2, zBooleanValue3);
            if (z) {
                gqlVar = dql.b;
            } else if (!z2 || zBooleanValue4) {
                gqlVar = (!zF || zBooleanValue4) ? gql.b : fql.b;
            } else {
                gqlVar = eql.b;
            }
            if (!(gqlVar instanceof gql)) {
                str = null;
            }
            arrayList4.add(str != null ? Uri.parse(str) : null);
        }
        iu30Var.invoke(new e2g1(d2g1Var, zBooleanValue, mqo1.A(arrayList4)));
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        mr20 mr20Var;
        zob1 zob1Var;
        List list;
        g5e0 d5e0Var;
        Integer numValueOf;
        vcg1 vcg1Var = (vcg1) obj2;
        wcg1 wcg1Var = (wcg1) obj3;
        iu30 iu30Var = (iu30) obj4;
        x340 x340Var = (b0k) obj5;
        ((Number) obj6).intValue();
        Object obj7 = fkj0.X;
        String str = vcg1Var.a;
        adg1 adg1Var = (adg1) this.b;
        boolean z = adg1Var.N0;
        d0r d0rVar = adg1Var.a;
        Integer num = null;
        if (z) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-13891353);
            boolean zG = x340Var2.g(str);
            Object objT = x340Var2.T();
            if (zG || objT == obj7) {
                lt20 lt20Var = new lt20(adg1Var.b.b(str), new q8t0(3, (lnm) null, (byte) 22), (byte) 0);
                x340Var2.s0(lt20Var);
                objT = lt20Var;
            }
            mr20Var = (mr20) objT;
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-13723333);
            Object objT2 = x340Var3.T();
            if (objT2 == obj7) {
                objT2 = new huz((Object) null, (byte) 10);
                x340Var3.s0(objT2);
            }
            mr20Var = (mr20) objT2;
            x340Var3.r(false);
        }
        ven0 ven0VarG = rwq.g(mr20Var, (Object) null, (o8n) null, x340Var, 48, 2);
        if (!z || ((String) ven0VarG.getValue()) == null) {
            x340 x340Var4 = x340Var;
            x340Var4.i0(-13090654);
            Object objT3 = x340Var4.T();
            if (objT3 == obj7) {
                objT3 = d3p1.F(d0rVar, adg1Var.R0, vcg1Var);
                x340Var4.s0(objT3);
            }
            zob1Var = (zob1) objT3;
            x340Var4.r(false);
        } else {
            x340 x340Var5 = x340Var;
            x340Var5.i0(-13521802);
            boolean zG2 = x340Var5.g((String) ven0VarG.getValue()) | x340Var5.g(str) | x340Var5.e(l1d.C(1));
            Object objT4 = x340Var5.T();
            if (zG2 || objT4 == obj7) {
                objT4 = new ga01(8, str, (String) ven0VarG.getValue(), false);
                x340Var5.s0(objT4);
            }
            ga01 ga01Var = (ga01) objT4;
            boolean zG3 = x340Var5.g(ga01Var);
            Object objT5 = x340Var5.T();
            if (zG3 || objT5 == obj7) {
                objT5 = d3p1.F(d0rVar, adg1Var.S0, ga01Var);
                x340Var5.s0(objT5);
            }
            zob1Var = (zob1) objT5;
            x340Var5.r(false);
        }
        ven0 ven0VarH = rwq.h(zob1Var, x340Var, 0);
        k1r k1rVar = (k1r) ven0VarH.getValue();
        if (k1rVar instanceof i1r) {
            x340 x340Var6 = x340Var;
            x340Var6.i0(-12889154);
            k8g1 k8g1Var = ((ycg1) u890.k(k1rVar, (d0r) null, (n4r) null)).a;
            boolean zG4 = x340Var6.g(k8g1Var) | x340Var6.g(vcg1Var);
            Object objT6 = x340Var6.T();
            if (zG4 || objT6 == obj7) {
                objT6 = ob51.q(k8g1Var, vcg1Var);
                x340Var6.s0(objT6);
            }
            list = (List) objT6;
            x340Var6.r(false);
        } else {
            x340 x340Var7 = x340Var;
            x340Var7.i0(-831694504);
            x340Var7.r(false);
            list = wcg1Var.a;
        }
        k1r k1rVar2 = (k1r) ven0VarH.getValue();
        boolean z2 = k1rVar2 instanceof j1r;
        g5e0 g5e0Var = e5e0.a;
        if (z2) {
            d5e0Var = g5e0.a;
        } else if (k1rVar2 instanceof i1r) {
            d5e0Var = g5e0Var;
        } else {
            if (!(k1rVar2 instanceof h1r)) {
                eg.o();
                return null;
            }
            d5e0Var = new d5e0((String) null);
        }
        x340 x340Var8 = x340Var;
        boolean zG5 = x340Var8.g(str);
        Object objT7 = x340Var8.T();
        if (zG5 || objT7 == obj7) {
            bnj0 bnj0Var = adg1Var.c;
            kge kgeVar = (kge) bnj0Var.c;
            FlowableMap flowableMap = (FlowableMap) bnj0Var.b;
            vbm[] vbmVarArr = q601.a;
            x010 x010Var = new x010(kgeVar, new kge(flowableMap), new yuy(str, (lnm) null, (byte) 1), (byte) 1);
            x340Var8.s0(x010Var);
            objT7 = x010Var;
        }
        Long l = (Long) rwq.g((mr20) objT7, (Object) null, (o8n) null, x340Var8, 48, 2).getValue();
        if (l == null) {
            x340Var8.i0(-12234311);
            x340Var8.r(false);
            numValueOf = null;
        } else {
            x340Var8.i0(-12234310);
            long jLongValue = l.longValue();
            if (list.isEmpty() || !d5e0Var.equals(g5e0Var)) {
                x340Var8.i0(741978400);
                x340Var8.r(false);
                numValueOf = null;
            } else {
                x340Var8.i0(741887911);
                int i = (int) jLongValue;
                Object objT8 = x340Var8.T();
                if (objT8 == obj7) {
                    objT8 = zcg1.a;
                    x340Var8.s0(objT8);
                }
                int iO = hxo1.o(list, i, (iu30) objT8);
                x340Var8.r(false);
                numValueOf = Integer.valueOf(iO);
            }
            x340Var8.r(false);
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            Integer num2 = wcg1Var.b;
            if (num2 == null || iIntValue != num2.intValue()) {
                num = numValueOf;
            }
        }
        List list2 = list;
        iu30Var.invoke(new wcg1(list2, numValueOf, num, d5e0Var, vcg1Var.b, vcg1Var.a));
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        mr20 mr20Var;
        zob1 zob1Var;
        int i;
        ven0 ven0Var;
        List list;
        g5e0 d5e0Var;
        lnm lnmVar;
        g061 g061Var;
        ven0 ven0Var2;
        String str;
        boolean z;
        String str2;
        jx31 ax31Var;
        jx31 dx31Var;
        jx31 ix31Var;
        boolean z2;
        jjm0 jjm0Var = (jjm0) obj;
        wdg1 wdg1Var = (wdg1) obj2;
        xdg1 xdg1Var = (xdg1) obj3;
        iu30 iu30Var = (iu30) obj4;
        x340 x340Var = (b0k) obj5;
        int iIntValue = ((Number) obj6).intValue();
        m4c m4cVar = fkj0.X;
        String str3 = wdg1Var.a;
        aeg1 aeg1Var = (aeg1) this.b;
        boolean z3 = aeg1Var.i;
        o3r o3rVar = aeg1Var.Z;
        d0r d0rVar = aeg1Var.a;
        if (z3) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(489571421);
            boolean zG = x340Var2.g(str3);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                z2 = false;
                lt20 lt20Var = new lt20(aeg1Var.t.b(str3), new q8t0(3, (lnm) null, (byte) 23), (byte) 0);
                x340Var2.s0(lt20Var);
                objT = lt20Var;
            } else {
                z2 = false;
            }
            mr20Var = (mr20) objT;
            x340Var2.r(z2);
        } else {
            x340Var = x340Var;
            z3 = z3;
            x340 x340Var3 = x340Var;
            x340Var3.i0(489739441);
            Object objT2 = x340Var3.T();
            if (objT2 == m4cVar) {
                objT2 = new huz((Object) null, (byte) 10);
                x340Var3.s0(objT2);
            }
            mr20Var = (mr20) objT2;
            x340Var3.r(false);
        }
        ven0 ven0VarG = rwq.g(mr20Var, (Object) null, (o8n) null, x340Var, 48, 2);
        x340 x340Var4 = x340Var;
        if (!z3 || ((String) ven0VarG.getValue()) == null) {
            x340 x340Var5 = x340Var4;
            x340Var5.i0(490335695);
            boolean zG2 = x340Var5.g(str3);
            Object objT3 = x340Var5.T();
            if (zG2 || objT3 == m4cVar) {
                objT3 = new ga01(10, str3, (String) null, false);
                x340Var5.s0(objT3);
            }
            ga01 ga01Var = (ga01) objT3;
            boolean zG3 = x340Var5.g(ga01Var);
            Object objT4 = x340Var5.T();
            if (zG3 || objT4 == m4cVar) {
                objT4 = d3p1.F(d0rVar, o3rVar, ga01Var);
                x340Var5.s0(objT4);
            }
            zob1Var = (zob1) objT4;
            i = 0;
            x340Var5.r(false);
        } else {
            x340 x340Var6 = x340Var4;
            x340Var6.i0(489939639);
            boolean zG4 = x340Var6.g((String) ven0VarG.getValue()) | x340Var6.g(str3);
            Object objT5 = x340Var6.T();
            if (zG4 || objT5 == m4cVar) {
                objT5 = new ga01(8, str3, (String) ven0VarG.getValue(), false);
                x340Var6.s0(objT5);
            }
            ga01 ga01Var2 = (ga01) objT5;
            boolean zG5 = x340Var6.g(ga01Var2);
            Object objT6 = x340Var6.T();
            if (zG5 || objT6 == m4cVar) {
                objT6 = d3p1.F(d0rVar, o3rVar, ga01Var2);
                x340Var6.s0(objT6);
            }
            zob1Var = (zob1) objT6;
            i = 0;
            x340Var6.r(false);
        }
        ven0 ven0VarH = rwq.h(zob1Var, x340Var4, i);
        k1r k1rVar = (k1r) ven0VarH.getValue();
        if (k1rVar instanceof i1r) {
            k8g1 k8g1Var = ((ydg1) u890.k(k1rVar, (d0r) null, (n4r) null)).a;
            boolean zO = dgo1.o(k8g1Var.e);
            String str4 = k8g1Var.a;
            List list2 = k8g1Var.i;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            int i2 = 0;
            for (Object obj7 : list2) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    p7h.T();
                    throw null;
                }
                of51 of51Var = (of51) obj7;
                if (of51Var instanceof yde1) {
                    yde1 yde1Var = (yde1) of51Var;
                    ven0Var2 = ven0VarH;
                    ix31Var = new gx31(i2, yde1Var.a, yde1Var.b, zO, k8g1Var.f, k8g1Var.g);
                } else {
                    ven0Var2 = ven0VarH;
                    if (of51Var instanceof kye1) {
                        kye1 kye1Var = (kye1) of51Var;
                        int i4 = kye1Var.a;
                        ix31Var = new ix31(i4, bbp1.i(i4), kye1Var.b, zO, false);
                    } else {
                        if (of51Var instanceof kz70) {
                            kz70 kz70Var = (kz70) of51Var;
                            str = str4;
                            dx31Var = new cx31(i2, str, kz70Var.b, kz70Var.c, kz70Var.d, kz70Var.e, kz70Var.f, kz70Var.g);
                            z = zO;
                        } else {
                            str = str4;
                            if (of51Var instanceof j2n0) {
                                j2n0 j2n0Var = (j2n0) of51Var;
                                boolean z4 = zO;
                                z = z4;
                                ax31Var = new ex31(j2n0Var.a, j2n0Var.b, str, j2n0Var.c, z4, false);
                                k8g1Var = k8g1Var;
                                str2 = str;
                            } else {
                                z = zO;
                                if (of51Var instanceof r7f0) {
                                    r7f0 r7f0Var = (r7f0) of51Var;
                                    dx31Var = new dx31(i2, str, r7f0Var.b, r7f0Var.c, r7f0Var.d, r7f0Var.e);
                                } else {
                                    k8g1Var = k8g1Var;
                                    if (of51Var instanceof spy) {
                                        spy spyVar = (spy) of51Var;
                                        String str5 = spyVar.h;
                                        rpy rpyVar = spyVar.e;
                                        String str6 = str5 == null ? "" : str5;
                                        String str7 = spyVar.c;
                                        String str8 = spyVar.d;
                                        String str9 = rpyVar.a;
                                        String strY0 = (str9 == null || str9.length() == 0) ? o7h.y0(rpyVar.b, (CharSequence) null, (String) null, (String) null, h5g1.Z, 31) : rpyVar.a;
                                        cq70 cq70Var = (cq70) o7h.s0(spyVar.f);
                                        String str10 = cq70Var != null ? cq70Var.b : null;
                                        String str11 = str10 == null ? "" : str10;
                                        String str12 = spyVar.g;
                                        jx31 zw31Var = new zw31(str, str6, str7, str8, strY0, str11, str12 == null ? "" : str12, str5 == null ? "" : str5);
                                        str2 = str;
                                        ax31Var = zw31Var;
                                    } else {
                                        str2 = str;
                                        if (of51Var instanceof gw0) {
                                            gw0 gw0Var = (gw0) of51Var;
                                            ax31Var = new ww31(str2, gw0Var.a, gw0Var.b, z);
                                        } else if (of51Var instanceof v710) {
                                            v710 v710Var = (v710) of51Var;
                                            ax31Var = new ax31(str2, v710Var.b, v710Var.c);
                                        } else {
                                            ax31Var = bx31.a;
                                        }
                                    }
                                }
                            }
                        }
                        ax31Var = dx31Var;
                        str2 = str;
                    }
                    arrayList.add(ax31Var);
                    zO = z;
                    str4 = str2;
                    i2 = i3;
                    k8g1Var = k8g1Var;
                    ven0VarH = ven0Var2;
                }
                jx31 jx31Var = ix31Var;
                k8g1Var = k8g1Var;
                str2 = str4;
                ax31Var = jx31Var;
                z = zO;
                arrayList.add(ax31Var);
                zO = z;
                str4 = str2;
                i2 = i3;
                k8g1Var = k8g1Var;
                ven0VarH = ven0Var2;
            }
            ven0Var = ven0VarH;
            list = arrayList;
        } else {
            ven0Var = ven0VarH;
            list = xdg1Var.a;
        }
        k1r k1rVar2 = (k1r) ven0Var.getValue();
        if (k1rVar2 instanceof j1r) {
            d5e0Var = g5e0.a;
        } else if (k1rVar2 instanceof i1r) {
            d5e0Var = e5e0.a;
        } else {
            if (!(k1rVar2 instanceof h1r)) {
                eg.o();
                return null;
            }
            d5e0Var = new d5e0((String) null);
        }
        g061 g061Var2 = xdg1Var.b;
        boolean z5 = (((iIntValue & 7168) ^ 3072) > 2048 && x340Var4.g(iu30Var)) || (iIntValue & 3072) == 2048;
        x340 x340Var7 = x340Var4;
        boolean zI = z5 | x340Var7.i(aeg1Var);
        Object objT7 = x340Var7.T();
        if (zI || objT7 == m4cVar) {
            lnmVar = null;
            objT7 = new w63((Object) iu30Var, (Object) aeg1Var, lnmVar, (byte) 27);
            x340Var7.s0(objT7);
        } else {
            lnmVar = null;
        }
        jjm0Var.a((zu30) objT7, x340Var7, (iIntValue << 3) & 112);
        iu30 iu30Var2 = wdg1Var.b;
        if (iu30Var2 == null) {
            x340Var7.i0(492213085);
            x340Var7.r(false);
            g061Var = g061Var2;
        } else {
            x340Var7.i0(492213086);
            boolean zI2 = x340Var7.i(g061Var2) | x340Var7.i(list) | x340Var7.g(iu30Var2);
            Object objT8 = x340Var7.T();
            if (zI2 || objT8 == m4cVar) {
                objT8 = new ku91(g061Var2, list, iu30Var2, lnmVar, (byte) 19);
                g061Var = g061Var2;
                x340Var7.s0(objT8);
            } else {
                g061Var = g061Var2;
            }
            qxd0.t(g061Var, x340Var7, (vu30) objT8);
            x340Var7.r(false);
        }
        iu30Var.invoke(new xdg1(list, g061Var, d5e0Var));
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0338  */
    /* JADX WARN: Code duplicated, block: B:103:0x0341 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x034f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0384  */
    /* JADX WARN: Code duplicated, block: B:111:0x038a  */
    /* JADX WARN: Code duplicated, block: B:117:0x039a  */
    /* JADX WARN: Code duplicated, block: B:119:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:125:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:127:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:133:0x03c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:134:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:137:0x03ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:141:0x0406  */
    /* JADX WARN: Code duplicated, block: B:143:0x040c  */
    /* JADX WARN: Code duplicated, block: B:149:0x0428 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x042a  */
    /* JADX WARN: Code duplicated, block: B:184:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:212:0x053f  */
    /* JADX WARN: Code duplicated, block: B:224:0x0589  */
    /* JADX WARN: Code duplicated, block: B:454:0x0aee  */
    /* JADX WARN: Code duplicated, block: B:456:0x0af4 A[PHI: r24
      0x0af4: PHI (r24v9 p.ncy0) = (r24v0 p.ncy0), (r24v10 p.ncy0) binds: [B:455:0x0af2, B:453:0x0aeb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:457:0x0af6  */
    /* JADX WARN: Code duplicated, block: B:460:0x0aff A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:463:0x0b0c  */
    /* JADX WARN: Code duplicated, block: B:466:0x0b4a  */
    /* JADX WARN: Code duplicated, block: B:470:0x0b54  */
    /* JADX WARN: Code duplicated, block: B:472:0x0b5a A[PHI: r24
      0x0b5a: PHI (r24v7 p.ncy0) = (r24v2 p.ncy0), (r24v8 p.ncy0) binds: [B:471:0x0b58, B:469:0x0b51] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:473:0x0b5c  */
    /* JADX WARN: Code duplicated, block: B:476:0x0b64  */
    /* JADX WARN: Code duplicated, block: B:480:0x0b6e  */
    /* JADX WARN: Code duplicated, block: B:482:0x0b74 A[PHI: r46
      0x0b74: PHI (r46v5 boolean) = (r46v2 boolean), (r46v6 boolean) binds: [B:481:0x0b72, B:479:0x0b6b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:483:0x0b76  */
    /* JADX WARN: Code duplicated, block: B:486:0x0b85 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:489:0x0b8b  */
    /* JADX WARN: Code duplicated, block: B:492:0x0bad  */
    /* JADX WARN: Code duplicated, block: B:493:0x0bb1  */
    /* JADX WARN: Code duplicated, block: B:495:0x0bb5  */
    /* JADX WARN: Code duplicated, block: B:498:0x0bc1  */
    /* JADX WARN: Code duplicated, block: B:501:0x0bdf  */
    /* JADX WARN: Code duplicated, block: B:505:0x0be9  */
    /* JADX WARN: Code duplicated, block: B:507:0x0bef A[PHI: r22
      0x0bef: PHI (r22v4 p.ocy0) = (r22v0 p.ocy0), (r22v5 p.ocy0) binds: [B:506:0x0bed, B:504:0x0be6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:508:0x0bf1  */
    /* JADX WARN: Code duplicated, block: B:511:0x0bfb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:514:0x0c01  */
    /* JADX WARN: Code duplicated, block: B:517:0x0c20  */
    /* JADX WARN: Code duplicated, block: B:518:0x0c23  */
    /* JADX WARN: Code duplicated, block: B:520:0x0c27  */
    /* JADX WARN: Code duplicated, block: B:521:0x0c2a  */
    /* JADX WARN: Code duplicated, block: B:524:0x0c43  */
    /* JADX WARN: Code duplicated, block: B:528:0x0c4d  */
    /* JADX WARN: Code duplicated, block: B:530:0x0c53 A[PHI: r21
      0x0c53: PHI (r21v4 p.ocy0) = (r21v1 p.ocy0), (r21v5 p.ocy0) binds: [B:529:0x0c51, B:527:0x0c4a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:531:0x0c55  */
    /* JADX WARN: Code duplicated, block: B:534:0x0c5e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:535:0x0c60  */
    /* JADX WARN: Code duplicated, block: B:538:0x0c88  */
    /* JADX WARN: Code duplicated, block: B:540:0x0c8e  */
    /* JADX WARN: Code duplicated, block: B:546:0x0ca0  */
    /* JADX WARN: Code duplicated, block: B:548:0x0ca6  */
    /* JADX WARN: Code duplicated, block: B:554:0x0cba A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:555:0x0cbc  */
    /* JADX WARN: Code duplicated, block: B:97:0x0330  */
    /* JADX WARN: Code duplicated, block: B:99:0x0336 A[PHI: r24
      0x0336: PHI (r24v15 p.ri71) = (r24v13 p.ri71), (r24v16 p.ri71) binds: [B:98:0x0334, B:96:0x032d] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean z;
        ocy0 ocy0Var;
        iu30 iu30Var;
        boolean z2;
        int i;
        ncy0 ncy0Var;
        boolean z3;
        boolean z4;
        Object objT;
        ncy0 ncy0Var2;
        ven0 ven0Var;
        ncy0 ncy0Var3;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean zI;
        Object objT2;
        ncy0 ncy0Var4;
        ocy0 ocy0Var2;
        ocy0 ocy0VarD1;
        ocy0 ocy0Var3;
        ocy0 ocy0Var4;
        boolean z9;
        boolean z10;
        Object objT3;
        ocy0 ocy0Var5;
        ocy0 ocy0Var6;
        ocy0 ocy0Var7;
        boolean z11;
        boolean z12;
        Object objT4;
        boolean zI2;
        Object objT5;
        List list;
        iu30 iu30Var2;
        v601 v601Var;
        String strY0;
        Long l;
        mq70 mq70Var;
        up70 up70VarA;
        tob1 tob1Var;
        ei71 ei71Var;
        boolean z13;
        boolean z14;
        Object objT6;
        boolean zG;
        Object objT7;
        ven0 ven0VarS;
        boolean zG2;
        Object objT8;
        Parcelable parcelable;
        boolean z15;
        int i2;
        ri71 ri71Var;
        boolean z16;
        boolean z17;
        Object objT9;
        aj71 aj71Var;
        hl71 hl71Var;
        iu30 iu30Var3;
        ven0 ven0Var2;
        boolean zG3;
        Object objT10;
        boolean zG4;
        Object objT11;
        ven0 ven0VarS2;
        boolean zG5;
        Object objT12;
        pdb1 wwa1Var;
        byte b = this.a;
        lnm lnmVar = null;
        rih1 rih1Var = rih1.a;
        Object obj7 = this.b;
        switch (b) {
            case 0:
                jjm0 jjm0Var = (jjm0) obj;
                ncy0 ncy0Var5 = (ncy0) obj2;
                ocy0 ocy0Var8 = (tcy0) obj3;
                iu30 iu30Var4 = (iu30) obj4;
                int iIntValue = ((Number) obj6).intValue();
                cm0 cm0Var = (cm0) obj7;
                String str = ncy0Var5.a;
                x340 x340Var = (b0k) obj5;
                Object objT13 = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT13 == m4cVar) {
                    objT13 = qxd0.M(o6x.a, x340Var);
                    x340Var.s0(objT13);
                }
                c9n c9nVar = (c9n) objT13;
                ven0 ven0VarS3 = v8r.s(ocy0Var8, x340Var);
                boolean zG6 = x340Var.g(str);
                Object objT14 = x340Var.T();
                if (zG6 || objT14 == m4cVar) {
                    z = false;
                    objT14 = v8r.q(0);
                    x340Var.s0(objT14);
                } else {
                    z = false;
                }
                ven0 ven0Var3 = (ven0) objT14;
                Object objT15 = x340Var.T();
                if (objT15 == m4cVar) {
                    ocy0Var = null;
                    objT15 = v8r.q((Object) null);
                    x340Var.s0(objT15);
                } else {
                    ocy0Var = null;
                }
                ven0 ven0Var4 = (ven0) objT15;
                boolean zI3 = x340Var.i(ven0Var4) | x340Var.i(cm0Var);
                int i3 = (iIntValue & 7168) ^ 3072;
                if (i3 <= 2048 || !x340Var.g(iu30Var4)) {
                    iu30Var = iu30Var4;
                    if ((iIntValue & 3072) != 2048) {
                        z2 = z;
                    }
                    boolean z18 = z2 | zI3;
                    i = (iIntValue & 112) ^ 48;
                    if (i > 32 || !x340Var.g(ncy0Var5)) {
                        ncy0Var = ncy0Var5;
                        if ((iIntValue & 48) != 32) {
                            z3 = z;
                        }
                        z4 = z3 | z18;
                        objT = x340Var.T();
                        if (!z4 || objT == m4cVar) {
                            ncy0 ncy0Var6 = ncy0Var;
                            objT = new c6h0(cm0Var, iu30Var, ncy0Var6, ven0Var4, (lnm) null, (byte) 17);
                            ncy0Var2 = ncy0Var6;
                            ven0Var = ven0Var4;
                            x340Var.s0(objT);
                        } else {
                            ven0Var = ven0Var4;
                            ncy0Var2 = ncy0Var;
                        }
                        qxd0.t(rih1Var, x340Var, (vu30) objT);
                        Integer numValueOf = Integer.valueOf(((Number) ven0Var3.getValue()).intValue());
                        boolean zI4 = x340Var.i((Object) 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0b40: INVOKE (r19v0 'zI4' boolean) = (r4v3 'x340Var' p.x340), (wrap java.lang.Object:?: CAST (java.lang.Object) (r47v1 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[DECLARE_VAR] in method: p.wcy0.Y(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes11.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r47v1 ??
                            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                            */
                        /*
                            Method dump skipped, instruction units count: 3348
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p.wcy0.Y(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                }
