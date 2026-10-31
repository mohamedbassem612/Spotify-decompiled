package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ek1 implements vu30 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ek1(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public static za10 h(vh40 vh40Var) {
        String str = vh40Var.a;
        int i = vh40Var.c;
        int i2 = vh40Var.d;
        List<ba20> list = vh40Var.b;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (ba20 ba20Var : list) {
            arrayList.add(new s520(ba20Var.b, ba20Var.a));
        }
        return new za10(i, i2, str, arrayList);
    }

    public static fb10 i(vh40 vh40Var) {
        String str = vh40Var.a;
        int i = vh40Var.c;
        int i2 = vh40Var.d;
        List<ba20> list = vh40Var.b;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (ba20 ba20Var : list) {
            arrayList.add(new s520(ba20Var.b, ba20Var.a));
        }
        return new fb10(i, i2, str, arrayList);
    }

    public static noa1 j(vh40 vh40Var) {
        String str = vh40Var.a;
        int i = vh40Var.c;
        int i2 = vh40Var.d;
        List<ba20> list = vh40Var.b;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (ba20 ba20Var : list) {
            arrayList.add(new s520(ba20Var.b, ba20Var.a));
        }
        return new noa1(i, i2, str, arrayList);
    }

    public static woa1 k(voa1 voa1Var) {
        String str = voa1Var.a;
        int i = voa1Var.f;
        int i2 = voa1Var.g;
        List<ba20> list = voa1Var.e;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (ba20 ba20Var : list) {
            arrayList.add(new s520(ba20Var.b, ba20Var.a));
        }
        return new woa1(str, arrayList, voa1Var.b, voa1Var.c, voa1Var.d, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0238, code lost:
    
        if (r0 == r7) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(p.gr40 r29, p.lnm r30) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ek1.a(p.gr40, p.lnm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(mzg0 mzg0Var, lnm lnmVar) {
        hpn hpnVar;
        if (lnmVar instanceof hpn) {
            hpnVar = (hpn) lnmVar;
            int i = hpnVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                hpnVar.d = i - Integer.MIN_VALUE;
            } else {
                hpnVar = new hpn(this, lnmVar);
            }
        } else {
            hpnVar = new hpn(this, lnmVar);
        }
        Object objC = hpnVar.b;
        int i2 = hpnVar.d;
        try {
            if (i2 == 0) {
                hm5.M(objC);
                wr2 wr2Var = (jr2) this.b;
                String str = mzg0Var.a;
                hpnVar.a = mzg0Var;
                hpnVar.d = 1;
                objC = wr2Var.c(str, hpnVar);
                d9n d9nVar = d9n.a;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mzg0Var = hpnVar.a;
                hm5.M(objC);
            }
            ms2 ms2Var = (ms2) objC;
            yrn yrnVar = (yrn) this.c;
            yrnVar.a.put(mzg0Var.a, ms2Var.a);
            return new q2h0(mzg0Var.a, ms2Var.a);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new o2h0(mzg0Var.a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(lnm lnmVar) {
        xfg xfgVar;
        if (lnmVar instanceof xfg) {
            xfgVar = (xfg) lnmVar;
            int i = xfgVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xfgVar.c = i - Integer.MIN_VALUE;
            } else {
                xfgVar = new xfg(this, lnmVar);
            }
        } else {
            xfgVar = new xfg(this, lnmVar);
        }
        Object obj = xfgVar.a;
        int i2 = xfgVar.c;
        if (i2 == 0) {
            hm5.M(obj);
            a2n a2nVar = (a2n) this.b;
            xfgVar.c = 1;
            Object objA = a2nVar.a(xfgVar);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        ((yrn) this.c).a.clear();
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(lnm lnmVar) {
        c1e0 c1e0Var;
        if (lnmVar instanceof c1e0) {
            c1e0Var = (c1e0) lnmVar;
            int i = c1e0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1e0Var.c = i - Integer.MIN_VALUE;
            } else {
                c1e0Var = new c1e0(this, lnmVar);
            }
        } else {
            c1e0Var = new c1e0(this, lnmVar);
        }
        Object objF = c1e0Var.a;
        int i2 = c1e0Var.c;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objF);
            a2n a2nVar = (a2n) this.b;
            c1e0Var.c = 1;
            objF = a2nVar.F((String) null, c1e0Var);
            if (objF != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objF);
                return objF;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objF);
        String str = (String) objF;
        if (str == null) {
            return w2h0.a;
        }
        jt2 jt2Var = (jt2) this.c;
        c1e0Var.c = 2;
        Object objB = jt2Var.b(str, c1e0Var);
        return objB == d9nVar ? d9nVar : objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(gr40 gr40Var, onm onmVar) {
        h941 h941Var;
        if (onmVar instanceof h941) {
            h941Var = (h941) onmVar;
            int i = h941Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                h941Var.c = i - Integer.MIN_VALUE;
            } else {
                h941Var = new h941(this, onmVar);
            }
        } else {
            h941Var = new h941(this, onmVar);
        }
        Object obj = h941Var.a;
        int i2 = h941Var.c;
        byte b = 0;
        lnm lnmVar = null;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                List list = gr40Var.a;
                yh40 yh40Var = gr40Var.c;
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(k(((u1d1) it.next()).c));
                }
                i941 i941Var = new i941(o7h.O0(i(yh40Var.b), o7h.O0(h(yh40Var.c), o7h.O0(j(yh40Var.a), arrayList))), this, lnmVar, b);
                h941Var.c = 1;
                Object objS = smo1.s(i941Var, h941Var);
                d9n d9nVar = d9n.a;
                if (objS == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
            return e941.a;
        } catch (IOException e) {
            Logger.d("[Puffin] Error downloading filters " + e, new Object[0]);
            return new d941(e);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                return ((Boolean) obj2).booleanValue() ? j2h1.D(igu.b, new ck1(this, str, null, (byte) 0)).g(new dk1(this, (byte) 0)) : j2h1.D(igu.b, new ck1(this, str, null, (byte) 1)).g(new dk1(this, (byte) 1));
            case 1:
                return rqt0.F((q8n) obj3, new wc5(this, (String) obj, (String) obj2, (lnm) null, (byte) 24)).onErrorReturn(q9w.Z);
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                String str2 = (String) obj4;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zG = x340Var2.g(str2);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new jfa(str2, (byte) 0);
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarB = s161.b(nim0Var, false, (iu30) objT);
                    j2i j2iVar = (j2i) obj3;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iK = tgp1.k(x340Var2);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    llj lljVar = y580.R0;
                    if (x340Var2.S || !u890.j(x340Var2.T(), Integer.valueOf(iK))) {
                        z5c.f(iK, x340Var2, iK, lljVar);
                    }
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    dv20.l(0, j2iVar, x340Var2, true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ((xu30) obj4).invoke(((iyb) obj3).b, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qim0 qim0VarW = uyn1.w(u291.a(nim0Var, sec.c, sec.d), (vzq0) obj4);
                    j2i j2iVar2 = (j2i) obj3;
                    jw31 jw31VarA = ew31.a(h36.e, een.N0, x340Var6, 54);
                    int iK2 = tgp1.k(x340Var6);
                    xos0 xos0VarM2 = x340Var6.m();
                    qim0 qim0VarE2 = zr7.E(x340Var6, qim0VarW);
                    hzj.A.getClass();
                    if (x340Var6.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar);
                    } else {
                        x340Var6.v0();
                    }
                    nko1.H(jw31VarA, x340Var6, y580.O0);
                    nko1.H(xos0VarM2, x340Var6, y580.N0);
                    llj lljVar2 = y580.R0;
                    if (x340Var6.S || !u890.j(x340Var6.T(), Integer.valueOf(iK2))) {
                        z5c.f(iK2, x340Var6, iK2, lljVar2);
                    }
                    nko1.H(qim0VarE2, x340Var6, y580.Y);
                    j2iVar2.invoke(pw31.a, x340Var6, 6);
                    x340Var6.r(true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 5:
                return e((lnm) obj2);
            case 6:
                return d((mzg0) obj, (lnm) obj2);
            case 7:
                return Boolean.valueOf(u890.j((n9r) obj, (hyc) obj4) && u890.j((n9r) obj2, (hyc) obj3));
            case 8:
                return ((Single) ((g7t) obj4).invoke((String) obj, (String) obj2)).flatMap(new rmr(this, (byte) 17));
            case 9:
                int iIntValue4 = ((Number) obj2).intValue();
                return (bg50) ((yy80) obj4).invoke((qpb0) obj, Integer.valueOf(iIntValue4), ((List) obj3).get(iIntValue4));
            case 10:
                return f((lnm) obj2);
            case 11:
                x340 x340Var7 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    q9e1.a(((k2h1) obj4).j, (j2i) obj3, x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 12:
                int iIntValue6 = ((Number) obj2).intValue();
                return (bg50) ((n1r0) obj4).invoke((qpb0) obj, Integer.valueOf(iIntValue6), ((List) obj3).get(iIntValue6));
            case 13:
                return a((gr40) obj, (lnm) obj2);
            case 14:
                x340 x340Var9 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    j2i j2iVar3 = (j2i) obj4;
                    wf41 wf41Var = (wf41) obj3;
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iK3 = tgp1.k(x340Var10);
                    xos0 xos0VarM3 = x340Var10.m();
                    qim0 qim0VarE3 = zr7.E(x340Var10, nim0Var);
                    hzj.A.getClass();
                    if (x340Var10.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(n4kVar);
                    } else {
                        x340Var10.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var10, y580.O0);
                    nko1.H(xos0VarM3, x340Var10, y580.N0);
                    llj lljVar3 = y580.R0;
                    if (x340Var10.S || !u890.j(x340Var10.T(), Integer.valueOf(iK3))) {
                        z5c.f(iK3, x340Var10, iK3, lljVar3);
                    }
                    nko1.H(qim0VarE3, x340Var10, y580.Y);
                    j2iVar3.invoke(wf41Var, x340Var10, 6);
                    x340Var10.r(true);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 15:
                x340 x340Var11 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    wr91 wr91Var = (wr91) obj3;
                    wr91Var.getClass();
                    ((xu30) obj4).invoke(wr91Var, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 16:
                x340 x340Var13 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ((xu30) obj4).invoke((m5e1) obj3, x340Var14, 6);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            default:
                x340 x340Var15 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    ven0 ven0Var = (ven0) obj4;
                    Object objT2 = x340Var16.T();
                    if (objT2 == fkj0.X) {
                        objT2 = new g45(ven0Var, (byte) 9);
                        x340Var16.s0(objT2);
                    }
                    qim0 qim0VarX = ern1.x(nim0Var, (iu30) objT2);
                    j2i j2iVar4 = (j2i) obj3;
                    gfh0 gfh0VarC3 = t1c.c(een.d, false);
                    int iK4 = tgp1.k(x340Var16);
                    xos0 xos0VarM4 = x340Var16.m();
                    qim0 qim0VarE4 = zr7.E(x340Var16, qim0VarX);
                    hzj.A.getClass();
                    if (x340Var16.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var16.m0();
                    if (x340Var16.S) {
                        x340Var16.l(n4kVar);
                    } else {
                        x340Var16.v0();
                    }
                    nko1.H(gfh0VarC3, x340Var16, y580.O0);
                    nko1.H(xos0VarM4, x340Var16, y580.N0);
                    llj lljVar4 = y580.R0;
                    if (x340Var16.S || !u890.j(x340Var16.T(), Integer.valueOf(iK4))) {
                        z5c.f(iK4, x340Var16, iK4, lljVar4);
                    }
                    nko1.H(qim0VarE4, x340Var16, y580.Y);
                    dv20.l(0, j2iVar4, x340Var16, true);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
        }
    }
}
