package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sw1 extends hab0 implements dv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sw1(Object obj, byte b) {
        super(6);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(iu30 iu30Var, c0y0 c0y0Var, pt ptVar, wzx0 wzx0Var, String str, onm onmVar) {
        e0y0 e0y0Var;
        m231 m231Var;
        Object objT;
        if (onmVar instanceof e0y0) {
            e0y0Var = (e0y0) onmVar;
            int i = e0y0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                e0y0Var.d = i - Integer.MIN_VALUE;
            } else {
                e0y0Var = new e0y0(onmVar);
            }
        } else {
            e0y0Var = new e0y0(onmVar);
        }
        Object obj = e0y0Var.c;
        int i2 = e0y0Var.d;
        m231 m231Var2 = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                iu30Var.invoke(new a0y0(c0y0Var.a(), (String) null));
                tzr0 tzr0Var = (tzr0) ptVar.e;
                String strA = c0y0Var.a();
                e0y0Var.a = iu30Var;
                e0y0Var.b = wzx0Var;
                e0y0Var.d = 1;
                objT = tzr0Var.t(str, strA, e0y0Var);
                d9n d9nVar = d9n.a;
                if (objT == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wzx0Var = e0y0Var.b;
                iu30Var = e0y0Var.a;
                hm5.M(obj);
                objT = ((e331) obj).a;
            }
            hm5.M(objT);
            m231Var = m231Var2;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (e331.a(m231Var) != null) {
            iu30Var.invoke(new b0y0(wzx0Var.b, wzx0Var.c, wzx0Var.a));
        }
        return m231Var2;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x014f  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d0  */
    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        z9y z9yVar;
        u9y u9yVar;
        tob1 tob1Var;
        d0r d0rVarValueOf;
        iu30 iu30Var;
        v9y v9yVarA;
        d0r d0rVar;
        List listM;
        d0r d0rVarB;
        d0r mmr0Var;
        d0r d0rVar2;
        jjm0 jjm0Var = (jjm0) obj;
        u9y u9yVar2 = (u9y) obj2;
        v9y v9yVar = (v9y) obj3;
        iu30 iu30Var2 = (iu30) obj4;
        int iIntValue = ((Number) obj6).intValue();
        z9y z9yVar2 = (z9y) this.b;
        x340 x340Var = (b0k) obj5;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = d3p1.F(z9yVar2.a, z9yVar2.t, u9yVar2);
            x340Var.s0(objT);
        }
        tob1 tob1VarH = rwq.h((zob1) objT, x340Var, 0);
        String str = u9yVar2.a;
        int i = (iIntValue & 112) ^ 48;
        boolean zI = x340Var.i(z9yVar2) | ((i > 32 && x340Var.g(u9yVar2)) || (iIntValue & 48) == 32);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new lqv(z9yVar2, u9yVar2, (lnm) null, (byte) 1);
            x340Var.s0(objT2);
        }
        o020 o020Var = o020.a;
        ven0 ven0VarP = yto.p(o020Var, str, (vu30) objT2, x340Var, 6);
        String str2 = u9yVar2.a;
        k1r k1rVar = (k1r) tob1VarH.getValue();
        boolean zI2 = x340Var.i(z9yVar2) | ((i > 32 && x340Var.g(u9yVar2)) || (iIntValue & 48) == 32) | x340Var.i(tob1VarH);
        Object objT3 = x340Var.T();
        if (zI2 || objT3 == m4cVar) {
            objT3 = new el0(z9yVar2, u9yVar2, tob1VarH, (lnm) null, (byte) 28);
            z9yVar = z9yVar2;
            u9yVar = u9yVar2;
            tob1Var = tob1VarH;
            d0rVarValueOf = null;
            x340Var.s0(objT3);
        } else {
            tob1Var = tob1VarH;
            z9yVar = z9yVar2;
            u9yVar = u9yVar2;
            d0rVarValueOf = null;
        }
        ven0 ven0VarO = yto.o(o020Var, str2, k1rVar, (vu30) objT3, x340Var, 6);
        boolean zI3 = ((((iIntValue & 7168) ^ 3072) > 2048 && x340Var.g(iu30Var2)) || (iIntValue & 3072) == 2048) | x340Var.i(z9yVar);
        Object objT4 = x340Var.T();
        if (zI3 || objT4 == m4cVar) {
            objT4 = new kw0(iu30Var2, z9yVar, d0rVarValueOf, (byte) 8);
            x340Var.s0(objT4);
        }
        jjm0Var.a((zu30) objT4, x340Var, (iIntValue << 3) & 112);
        d0r d0rVar3 = (q020) ven0VarP.getValue();
        d0r d0rVar4 = d0rVar3 instanceof p020 ? (p020) d0rVar3 : d0rVarValueOf;
        d0r d0rVar5 = (q020) ven0VarO.getValue();
        d0r d0rVar6 = d0rVar5 instanceof p020 ? (p020) d0rVar5 : d0rVarValueOf;
        boolean z = (d0rVar4 == null || d0rVar6 == null) ? false : true;
        k1r k1rVar2 = (k1r) tob1Var.getValue();
        k1rVar2.getClass();
        if (k1rVar2 instanceof j1r) {
            iu30Var = iu30Var2;
            v9yVarA = v9y.a(v9yVar, u9yVar.a, u9yVar.b, u9yVar.c, true, (Integer) null, (List) null, (msd) null, (l1f1) null, (vef0) null, (kw9) null, (smc0) null, (chf0) null, 0, false, (ArrayList) null, 32752);
        } else {
            k1r k1rVar3 = (k1r) tob1Var.getValue();
            k1rVar3.getClass();
            if (!(k1rVar3 instanceof i1r) || z) {
                k1r k1rVar4 = (k1r) tob1Var.getValue();
                k1rVar4.getClass();
                if (k1rVar4 instanceof i1r) {
                    k1r k1rVar5 = (k1r) tob1Var.getValue();
                    d0rVar4.getClass();
                    a9h a9hVar = (a9h) ((p020) d0rVar4).a;
                    d0rVar6.getClass();
                    clk1 clk1Var = (clk1) ((p020) d0rVar6).a;
                    t9y t9yVar = (t9y) u890.k(k1rVar5, d0rVarValueOf, d0rVarValueOf);
                    if (a9hVar != null) {
                        List list = u9yVar.d;
                        List list2 = a9hVar.a.a;
                        if (list2.isEmpty()) {
                            d0rVarB = mqo1.B(b7x.a);
                        } else {
                            List listZ0 = o7h.Z0(list);
                            ArrayList arrayList = new ArrayList();
                            Iterator it = listZ0.iterator();
                            while (it.hasNext()) {
                                int iIntValue2 = ((Number) it.next()).intValue();
                                aef0 aef0Var = (aef0) o7h.t0(iIntValue2, list2);
                                if (aef0Var == null || (d0rVar2 = aef0Var.b) == null) {
                                    mmr0Var = d0rVarValueOf;
                                } else {
                                    if (ihc1.y0(d0rVar2)) {
                                        d0rVar2 = d0rVarValueOf;
                                    }
                                    if (d0rVar2 != null) {
                                        mmr0Var = new mmr0(String.valueOf(iIntValue2), d0rVar2);
                                    } else {
                                        mmr0Var = d0rVarValueOf;
                                    }
                                }
                                if (mmr0Var != null) {
                                    arrayList.add(mmr0Var);
                                }
                            }
                            d0rVarB = mqo1.B(sqg0.T(arrayList));
                        }
                        d0rVar = d0rVarB;
                    } else {
                        d0rVar = d0rVarValueOf;
                    }
                    d0r d0rVarH = a9hVar != null ? b5p1.h(a9hVar.b) : d0rVarValueOf;
                    d0r d0rVar7 = d0rVarH != null ? (k9h) o7h.s0(d0rVarH) : d0rVarValueOf;
                    d0r vef0Var = (d0rVar7 == null || d0rVar == null || ((m7) d0rVar).isEmpty()) ? d0rVarValueOf : new vef0(t9yVar.f, t9yVar.e, t9yVar.d, d0rVar, ((k9h) d0rVar7).c, ((k9h) d0rVar7).e, ((k9h) d0rVar7).f, ((k9h) d0rVar7).a, 1, (c380) null, false, false, 15872);
                    d0r kw9Var = d0rVar7 != null ? new kw9(((k9h) d0rVar7).a, ((k9h) d0rVar7).b) : d0rVarValueOf;
                    String str3 = clk1Var.d;
                    if (str3 == null) {
                        str3 = t9yVar.f;
                    }
                    u7h u7hVar = t9yVar.a;
                    String str4 = clk1Var.b;
                    u7h u7hVar2 = clk1Var.c;
                    List list3 = clk1Var.a;
                    smc0 smc0VarN = k4p1.n();
                    if (str3.length() > 0) {
                        smc0VarN.add(new ax70(u7hVar != null ? z4p1.G(u7hVar.a) : 0, str3, str3));
                    }
                    if (str4 != null && str4.length() != 0) {
                        if (u7hVar2 == null) {
                            u7hVar2 = u7hVar;
                        }
                        smc0VarN.add(new ax70(u7hVar2 != null ? z4p1.G(u7hVar2.a) : 0, str4, str4));
                    }
                    smc0VarN.addAll(list3);
                    smc0 smc0VarK = k4p1.k(smc0VarN);
                    String str5 = u9yVar.a;
                    long j = u9yVar.b;
                    String str6 = u9yVar.c;
                    if (u7hVar != null) {
                        d0rVarValueOf = Integer.valueOf(z4p1.G(u7hVar.a));
                    }
                    if (u7hVar != null) {
                        long j2 = u7hVar.a;
                        u7h u7hVar3 = t9yVar.b;
                        u7h u7hVar4 = t9yVar.c;
                        long j3 = u7hVar3 != null ? u7hVar3.a : j2;
                        long j4 = u7hVar4 != null ? u7hVar4.a : u7h.f;
                        long j5 = u7h.b;
                        long jQ = u4p1.Q(0.4f, j2, j5);
                        long j6 = u7h.f;
                        long jQ2 = u4p1.Q(0.4f, j2, j6);
                        long jQ3 = u4p1.Q(0.7f, j2, j6);
                        listM = p7h.M(new d9h[]{new d9h(j2, j3, j4, j4, j4), new d9h(jQ, jQ, j6, j6, j6), new d9h(jQ2, jQ2, j5, j5, j5), new d9h(jQ3, jQ3, j5, j5, j5)});
                    } else {
                        listM = z6x.a;
                    }
                    List list4 = listM;
                    iu30Var = iu30Var2;
                    v9yVarA = v9y.a(v9yVar, str5, j, str6, false, d0rVarValueOf, list4, (msd) null, (l1f1) null, vef0Var, kw9Var, smc0VarK, (chf0) null, 0, false, (ArrayList) null, 30912);
                } else {
                    iu30Var = iu30Var2;
                    v9yVarA = v9y.a(v9yVar, u9yVar.a, u9yVar.b, u9yVar.c, false, (Integer) null, (List) null, (msd) null, (l1f1) null, (vef0) null, (kw9) null, (smc0) null, (chf0) null, 0, false, (ArrayList) null, 32752);
                }
            } else {
                iu30Var = iu30Var2;
                v9yVarA = v9y.a(v9yVar, u9yVar.a, u9yVar.b, u9yVar.c, true, (Integer) null, (List) null, (msd) null, (l1f1) null, (vef0) null, (kw9) null, (smc0) null, (chf0) null, 0, false, (ArrayList) null, 32752);
            }
        }
        iu30Var.invoke(v9yVarA);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        jjm0 jjm0Var = (jjm0) obj;
        why whyVar = (why) obj2;
        xhy xhyVar = (xhy) obj3;
        iu30 iu30Var = (iu30) obj4;
        int iIntValue = ((Number) obj6).intValue();
        m4c m4cVar = fkj0.X;
        zhy zhyVar = (zhy) this.b;
        x340 x340Var = (b0k) obj5;
        boolean zI = x340Var.i(zhyVar) | x340Var.i(whyVar) | ((((iIntValue & 7168) ^ 3072) > 2048 && x340Var.g(iu30Var)) || (iIntValue & 3072) == 2048) | x340Var.i(xhyVar);
        Object objT = x340Var.T();
        if (zI || objT == m4cVar) {
            lqv lqvVar = new lqv(zhyVar, whyVar, iu30Var, xhyVar, (lnm) null, (byte) 2);
            x340Var.s0(lqvVar);
            objT = lqvVar;
        }
        qxd0.t(whyVar, x340Var, (vu30) objT);
        boolean zI2 = x340Var.i(zhyVar);
        Object objT2 = x340Var.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new kw0(zhyVar, (lnm) null, (byte) 9);
            x340Var.s0(objT2);
        }
        jjm0Var.a((zu30) objT2, x340Var, (iIntValue << 3) & 112);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        jjm0 jjm0Var = (jjm0) obj;
        wj10 wj10Var = (wj10) obj2;
        iu30 iu30Var = (iu30) obj4;
        x340 x340Var = (b0k) obj5;
        int iIntValue = ((Number) obj6).intValue();
        pt ptVar = (pt) this.b;
        boolean z = (((iIntValue & 7168) ^ 3072) > 2048 && x340Var.g(iu30Var)) || (iIntValue & 3072) == 2048;
        boolean z2 = (((iIntValue & 112) ^ 48) > 32 && x340Var.g(wj10Var)) || (iIntValue & 48) == 32;
        x340 x340Var2 = x340Var;
        boolean zI = z | z2 | x340Var2.i(ptVar);
        Object objT = x340Var2.T();
        if (zI || objT == fkj0.X) {
            xj10 xj10Var = new xj10(iu30Var, wj10Var, ptVar, (lnm) null, (byte) 0);
            x340Var2.s0(xj10Var);
            objT = xj10Var;
        }
        jjm0Var.a((zu30) objT, x340Var2, (iIntValue << 3) & 112);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        jjm0 jjm0Var = (jjm0) obj;
        iu30 iu30Var = (iu30) obj4;
        x340 x340Var = (b0k) obj5;
        int iIntValue = ((Number) obj6).intValue();
        c920 c920Var = (c920) this.b;
        boolean z = (((iIntValue & 7168) ^ 3072) > 2048 && x340Var.g(iu30Var)) || (iIntValue & 3072) == 2048;
        x340 x340Var2 = x340Var;
        boolean zI = z | x340Var2.i(c920Var);
        Object objT = x340Var2.T();
        if (zI || objT == fkj0.X) {
            objT = new w63(iu30Var, c920Var, (lnm) null, (byte) 7);
            x340Var2.s0(objT);
        }
        jjm0Var.a((zu30) objT, x340Var2, (iIntValue << 3) & 112);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        mq70 mq70Var;
        up70 up70VarA;
        String str = (String) obj2;
        iu30 iu30Var = (iu30) obj4;
        x340 x340Var = (b0k) obj5;
        int iIntValue = ((Number) obj6).intValue();
        t540 t540Var = (t540) this.b;
        boolean z = (((iIntValue & 112) ^ 48) > 32 && x340Var.g(str)) || (iIntValue & 48) == 32;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = d3p1.H(t540Var.c, t540Var.d, str);
            x340Var2.s0(objT);
        }
        ven0 ven0VarH = rwq.h((zob1) objT, x340Var2, 0);
        xkk1 xkk1VarA = ((o540) ven0VarH.getValue()).a();
        s540 q540Var = null;
        String str2 = (xkk1VarA == null || (mq70Var = xkk1VarA.a) == null || (up70VarA = mq70Var.a(vp70.d)) == null) ? null : up70VarA.a.a;
        o540 o540Var = (o540) ven0VarH.getValue();
        if (o540Var instanceof n540) {
            n281 n281Var = ((n540) o540Var).a.a;
            if (n281Var instanceof k281) {
                k281 k281Var = (k281) n281Var;
                String str3 = k281Var.f;
                if (str3 != null) {
                    q540Var = new r540(new mzh1(k281Var.c, k281Var.d, k281Var.e, str3, str));
                }
            } else if (n281Var instanceof n281) {
                n281 n281Var2 = n281Var;
                q540Var = new q540(new q7y(n281Var2.c, n281Var2.d, n281Var2.e, n281Var2.f, n281Var2.g, n281Var2.i, str2, str));
            }
        } else {
            if (!(o540Var instanceof m540)) {
                eg.o();
                return null;
            }
            b98 b98Var = ((m540) o540Var).a.a.c;
            if (b98Var instanceof y88) {
                y88 y88Var = (y88) b98Var;
                q540Var = new q540(new q7y(y88Var.a, y88Var.b, y88Var.c, y88Var.d, y88Var.e, y88Var.f, str2, str));
            } else if (!(b98Var instanceof z88) && !(b98Var instanceof a98) && b98Var != null) {
                eg.o();
                return null;
            }
        }
        iu30Var.invoke(new p540(q540Var));
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        jjm0 jjm0Var = (jjm0) obj;
        yi50 yi50Var = (yi50) obj3;
        int iIntValue = ((Number) obj6).intValue();
        umf0 umf0Var = (umf0) this.b;
        x340 x340Var = (b0k) obj5;
        boolean zI = x340Var.i(umf0Var) | ((((iIntValue & 896) ^ 384) > 256 && x340Var.i(yi50Var)) || (iIntValue & 384) == 256);
        Object objT = x340Var.T();
        if (zI || objT == fkj0.X) {
            objT = new w63(umf0Var, yi50Var, (lnm) null, (byte) 8);
            x340Var.s0(objT);
        }
        jjm0Var.a((zu30) objT, x340Var, (iIntValue << 3) & 112);
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        jjm0 jjm0Var = (jjm0) obj;
        tp50 tp50Var = (tp50) obj2;
        up50 up50Var = (up50) obj3;
        iu30 iu30Var = (iu30) obj4;
        int iIntValue = ((Number) obj6).intValue();
        wp50 wp50Var = (wp50) this.b;
        x340 x340Var = (b0k) obj5;
        boolean zI = x340Var.i(wp50Var) | ((((iIntValue & 7168) ^ 3072) > 2048 && x340Var.g(iu30Var)) || (iIntValue & 3072) == 2048);
        Object objT = x340Var.T();
        if (zI || objT == fkj0.X) {
            objT = new jvu(wp50Var, iu30Var, (lnm) null, (byte) 2);
            x340Var.s0(objT);
        }
        jjm0Var.a((zu30) objT, x340Var, (iIntValue << 3) & 112);
        iu30Var.invoke(up50.a(up50Var, tp50Var, false, 2));
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        jjm0 jjm0Var = (jjm0) obj;
        o180 o180Var = (o180) obj2;
        iu30 iu30Var = (iu30) obj4;
        int iIntValue = ((Number) obj6).intValue();
        q180 q180Var = (q180) this.b;
        x340 x340Var = (b0k) obj5;
        boolean zI = x340Var.i(q180Var);
        Object objT = x340Var.T();
        if (zI || objT == fkj0.X) {
            objT = new vd2(q180Var, (lnm) null, (byte) 17);
            x340Var.s0(objT);
        }
        jjm0Var.a((zu30) objT, x340Var, (iIntValue << 3) & 112);
        iu30Var.invoke(o180Var);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        oab0 oab0Var;
        l631 l631Var;
        jjm0 jjm0Var = (jjm0) obj;
        pab0 pab0Var = (pab0) obj2;
        iu30 iu30Var = (iu30) obj4;
        int iIntValue = ((Number) obj6).intValue();
        psy psyVar = (psy) this.b;
        x340 x340Var = (b0k) obj5;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = d3p1.F(psyVar.b, (o3r) psyVar.c, pab0Var);
            x340Var.s0(objT);
        }
        boolean z = false;
        ven0 ven0VarH = rwq.h((zob1) objT, x340Var, 0);
        boolean zI = x340Var.i(psyVar);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new wd2(psyVar, (lnm) null, (byte) 4);
            x340Var.s0(objT2);
        }
        jjm0Var.a((zu30) objT2, x340Var, (iIntValue << 3) & 112);
        i1r i1rVar = (k1r) ven0VarH.getValue();
        i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
        if (i1rVar2 != null && (oab0Var = (oab0) i1rVar2.a) != null) {
            gix0 gix0Var = oab0Var.a;
            x340Var.i0(-216770072);
            x340Var.r(false);
            boolean z2 = gix0Var instanceof gix0;
            if (z2) {
                if (gix0Var.c > 0) {
                    z = true;
                }
            } else if (!(gix0Var instanceof hix0)) {
                eg.o();
                return null;
            }
            boolean z3 = z;
            gix0 gix0Var2 = z2 ? gix0Var : null;
            Long lValueOf = gix0Var2 != null ? Long.valueOf(gix0Var2.c) : null;
            String str = (((gix0Var instanceof hix0) && ((hix0) gix0Var).a) || (l631Var = oab0Var.b) == null) ? null : l631Var.a;
            String str2 = pab0Var.a;
            String str3 = pab0Var.b;
            Boolean boolValueOf = Boolean.valueOf(z3);
            tab0 tab0Var = z3 ? tab0.a : tab0.b;
            wmb wmbVar = wmb.a;
            vmb vmbVar = vmb.a;
            if (!vmbVar.equals(wmbVar) && !vmbVar.equals(vmbVar)) {
                eg.o();
                return null;
            }
            iu30Var.invoke(new qab0(str2, str3, boolValueOf, lValueOf, str, z3, (String) null, (sg90) null, p7h.M(new tab0[]{tab0Var, tab0.c, tab0.d})));
        }
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        jjm0 jjm0Var = (jjm0) obj;
        acb0 acb0Var = (acb0) obj2;
        bcb0 bcb0Var = (bcb0) obj3;
        iu30 iu30Var = (iu30) obj4;
        x340 x340Var = (b0k) obj5;
        int iIntValue = ((Number) obj6).intValue();
        ccb0 ccb0Var = (ccb0) this.b;
        m4c m4cVar = fkj0.X;
        boolean z = (((iIntValue & 7168) ^ 3072) > 2048 && x340Var.g(iu30Var)) || (iIntValue & 3072) == 2048;
        x340 x340Var2 = x340Var;
        boolean zI = z | x340Var2.i(bcb0Var) | x340Var2.i(acb0Var);
        Object objT = x340Var2.T();
        if (zI || objT == m4cVar) {
            objT = new az80(iu30Var, bcb0Var, acb0Var, (lnm) null);
            x340Var2.s0(objT);
        }
        qxd0.t(acb0Var, x340Var2, (vu30) objT);
        boolean zI2 = x340Var2.i(ccb0Var);
        Object objT2 = x340Var2.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new wd2(ccb0Var, (lnm) null, (byte) 5);
            x340Var2.s0(objT2);
        }
        jjm0Var.a((zu30) objT2, x340Var2, (iIntValue << 3) & 112);
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        jjm0 jjm0Var = (jjm0) obj;
        ypf0 ypf0Var = (ypf0) obj2;
        iqf0 iqf0VarA = (iqf0) obj3;
        iu30 iu30Var = (iu30) obj4;
        int iIntValue = ((Number) obj6).intValue();
        jqf0 jqf0Var = (jqf0) this.b;
        x340 x340Var = (b0k) obj5;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = d3p1.F(jqf0Var.e, jqf0Var.g, ypf0Var);
            x340Var.s0(objT);
        }
        ven0 ven0VarH = rwq.h((zob1) objT, x340Var, 0);
        boolean zI = x340Var.i(jqf0Var) | x340Var.i(ypf0Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new m2a0(jqf0Var, ypf0Var, (lnm) null, (byte) 18);
            x340Var.s0(objT2);
        }
        rih1 rih1Var = rih1.a;
        qxd0.t(rih1Var, x340Var, (vu30) objT2);
        boolean zI2 = ((((iIntValue & 7168) ^ 3072) > 2048 && x340Var.g(iu30Var)) || (iIntValue & 3072) == 2048) | x340Var.i(jqf0Var) | x340Var.i(ypf0Var);
        Object objT3 = x340Var.T();
        if (zI2 || objT3 == m4cVar) {
            objT3 = new cz40(jqf0Var, ypf0Var, iu30Var, (lnm) null);
            x340Var.s0(objT3);
        }
        jjm0Var.a((zu30) objT3, x340Var, (iIntValue << 3) & 112);
        k1r k1rVar = (k1r) ven0VarH.getValue();
        k1rVar.getClass();
        if (!(k1rVar instanceof j1r)) {
            k1r k1rVar2 = (k1r) ven0VarH.getValue();
            k1rVar2.getClass();
            if (k1rVar2 instanceof i1r) {
                hqf0 hqf0Var = (hqf0) u890.k((k1r) ven0VarH.getValue(), (d0r) null, (n4r) null);
                iqf0VarA = iqf0.a(iqf0VarA, false, hqf0Var.a, hqf0Var.b, false, hqf0Var.c, 8);
            } else {
                iqf0VarA = iqf0.a(iqf0VarA, false, (List) null, (ArrayList) null, false, true, 14);
            }
        } else if (iqf0VarA.b.isEmpty()) {
            iqf0VarA = iqf0.a(iqf0VarA, true, (List) null, (ArrayList) null, false, false, 14);
        }
        iu30Var.invoke(iqf0VarA);
        return rih1Var;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        jjm0 jjm0Var = (jjm0) obj;
        iu30 iu30Var = (iu30) obj4;
        x340 x340Var = (b0k) obj5;
        int iIntValue = ((Number) obj6).intValue();
        z3i0 z3i0Var = (z3i0) this.b;
        ven0 ven0VarS = v8r.s((FlowableMap) z3i0Var.d, x340Var);
        ven0 ven0VarS2 = v8r.s((Flowable) z3i0Var.e, x340Var);
        ven0 ven0VarS3 = v8r.s((oj3) z3i0Var.h, x340Var);
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = qxd0.M(o6x.a, x340Var2);
            x340Var2.s0(objT);
        }
        c9n c9nVar = (c9n) objT;
        Object objT2 = x340Var2.T();
        if (objT2 == m4cVar) {
            objT2 = v8r.q((Object) null);
            x340Var2.s0(objT2);
        }
        ven0 ven0Var = (ven0) objT2;
        Object objT3 = x340Var2.T();
        if (objT3 == m4cVar) {
            o3e0 o3e0Var = (o3e0) z3i0Var.g;
            c7i0 c7i0Var = new c7i0(o3e0Var, fn31.T((llm) o3e0Var.d, (o8n) null, 0, new d7i0(o3e0Var, new x3i0(c9nVar, ven0VarS3, ven0Var), (lnm) null, (byte) 0), 3));
            x340Var2.s0(c7i0Var);
            objT3 = c7i0Var;
        }
        b431 b431Var = (b431) objT3;
        boolean zI = x340Var2.i(b431Var);
        Object objT4 = x340Var2.T();
        if (zI || objT4 == m4cVar) {
            objT4 = new w3i0(b431Var, (byte) 0);
            x340Var2.s0(objT4);
        }
        rih1 rih1Var = rih1.a;
        qxd0.i(rih1Var, (iu30) objT4, x340Var2);
        if (z3i0Var.b) {
            x340Var2.i0(1878841261);
            boolean zI2 = x340Var2.i(z3i0Var) | ((((iIntValue & 7168) ^ 3072) > 2048 && x340Var2.g(iu30Var)) || (iIntValue & 3072) == 2048);
            Object objT5 = x340Var2.T();
            if (zI2 || objT5 == m4cVar) {
                objT5 = new tfe0(z3i0Var, iu30Var, (lnm) null, (byte) 27);
                x340Var2.s0(objT5);
            }
            qxd0.t(rih1Var, x340Var2, (vu30) objT5);
            x340Var2.r(false);
        } else {
            x340Var2.i0(1879144937);
            x340Var2.r(false);
        }
        boolean zI3 = x340Var2.i(ven0Var) | x340Var2.i(ven0VarS) | x340Var2.i(ven0VarS2) | x340Var2.i(b431Var);
        Object objT6 = x340Var2.T();
        if (zI3 || objT6 == m4cVar) {
            objT6 = new l14(b431Var, ven0Var, ven0VarS, ven0VarS2, (lnm) null, (byte) 6);
            x340Var2.s0(objT6);
        }
        jjm0Var.a((zu30) objT6, x340Var2, (iIntValue << 3) & 112);
        return rih1Var;
    }

    private final Object q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        rwj rwjVarA;
        mey0 mey0Var = (mey0) obj;
        ((Number) obj2).intValue();
        igi0 igi0Var = (igi0) obj3;
        kgi0 kgi0Var = (kgi0) obj4;
        x340 x340Var = (b0k) obj5;
        int iIntValue = ((Number) obj6).intValue();
        rgi0 rgi0Var = (rgi0) this.b;
        uei0 uei0Var = rgi0Var.h;
        ojv0 ojv0Var = rgi0Var.Z;
        Function0 function0 = rgi0Var.e;
        yy4 yy4Var = rgi0Var.c;
        ymd0 ymd0Var = rgi0Var.d;
        boolean z = yy4Var.h() || igi0Var.d;
        x340 x340Var2 = x340Var;
        boolean zG = x340Var2.g(mey0Var.a) | x340Var2.h(z) | x340Var2.h(igi0Var.e);
        Object objT = x340Var2.T();
        if (zG || objT == fkj0.X) {
            if (z) {
                fci0 fci0Var = rgi0Var.b;
                kko kkoVar = rgi0Var.f;
                qgi0 qgi0Var = new qgi0(kgi0Var, (byte) 0);
                p731 p731Var = rgi0Var.g;
                vu30 vu30Var = rgi0Var.Y;
                zob1 zob1Var = rgi0Var.N0;
                boolean z2 = igi0Var.e;
                if (!z2) {
                    zob1Var = null;
                }
                rwjVarA = fci0Var.a(ymd0Var, new p1f0(function0, kkoVar, ojv0Var, qgi0Var, p731Var, vu30Var, (Object) null, zob1Var), new eci0(uei0Var.a, new har0(0), uei0Var.d, uei0Var.e, uei0Var.f, uei0Var.g, uei0Var.h, uei0Var.i, uei0Var.j, z2, uei0Var.l, uei0Var.m));
            } else {
                rwjVarA = rgi0Var.a.a(ymd0Var, new p410(function0, rgi0Var.f, ojv0Var, new qgi0(kgi0Var, (byte) 1), rgi0Var.g, rgi0Var.Y, 64), uei0.a(uei0Var, new har0(0)));
            }
            objT = rwjVarA;
            x340Var2.s0(objT);
        } else {
            mey0Var = mey0Var;
        }
        otw.c((xpw) objT, mey0Var, (qim0) null, (ipb1) null, x340Var2, (iIntValue << 3) & 112, 12);
        return rih1.a;
    }

    private final Object r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean z;
        mey0 mey0Var = (mey0) obj;
        ((Number) obj2).intValue();
        igi0 igi0Var = (igi0) obj3;
        kgi0 kgi0Var = (kgi0) obj4;
        x340 x340Var = (b0k) obj5;
        int iIntValue = ((Number) obj6).intValue();
        m4c m4cVar = fkj0.X;
        String str = mey0Var.a;
        ahi0 ahi0Var = (ahi0) this.b;
        uei0 uei0Var = (uei0) ahi0Var.Y;
        ojv0 ojv0Var = (ojv0) ahi0Var.S0;
        Function0 function0 = (Function0) ahi0Var.i;
        yy4 yy4Var = (yy4) ahi0Var.g;
        d0r d0rVar = (d0r) ahi0Var.h;
        wei0 wei0Var = (wei0) ahi0Var.Z;
        boolean z2 = yy4Var.h() || igi0Var.d;
        if (z2) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1301794877);
            boolean zG = x340Var2.g(str) | x340Var2.h(z2) | x340Var2.h(igi0Var.e);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                kci0 kci0Var = (kci0) ahi0Var.f;
                gci0 gci0Var = new gci0(wei0Var.a, wei0Var.b, wei0Var.c);
                kko kkoVar = (kko) ahi0Var.t;
                qgi0 qgi0Var = new qgi0(kgi0Var, (byte) 3);
                p731 p731Var = (p731) ahi0Var.X;
                vu30 vu30Var = (vu30) ahi0Var.Q0;
                vu30 vu30Var2 = (vu30) ahi0Var.R0;
                zob1 zob1Var = (zob1) ahi0Var.T0;
                boolean z3 = igi0Var.e;
                if (!z3) {
                    zob1Var = null;
                }
                objT = kci0Var.a(d0rVar, new p1f0(function0, kkoVar, ojv0Var, qgi0Var, p731Var, vu30Var, vu30Var2, zob1Var), new eci0(uei0Var.a, new har0(0), uei0Var.d, uei0Var.e, uei0Var.f, uei0Var.g, uei0Var.h, uei0Var.i, uei0Var.j, z3, uei0Var.l, uei0Var.m), gci0Var);
                x340Var2.s0(objT);
            }
            otw.c((maa) objT, mey0Var, (qim0) null, (ipb1) null, x340Var2, (iIntValue << 3) & 112, 12);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1304286998);
            boolean zG2 = x340Var3.g(str) | x340Var3.h(z2);
            Object objT2 = x340Var3.T();
            if (zG2 || objT2 == m4cVar) {
                zei0 zei0Var = (zei0) ahi0Var.e;
                kko kkoVar2 = (kko) ahi0Var.t;
                qgi0 qgi0Var2 = new qgi0(kgi0Var, (byte) 4);
                p731 p731Var2 = (p731) ahi0Var.X;
                vu30 vu30Var3 = (vu30) ahi0Var.Q0;
                vu30 vu30Var4 = (vu30) ahi0Var.R0;
                z = false;
                objT2 = zei0Var.a(d0rVar, new p410(function0, kkoVar2, ojv0Var, qgi0Var2, p731Var2, vu30Var3, vu30Var4, (byte) 19), uei0.a(uei0Var, new har0(0)), wei0Var);
                x340Var3.s0(objT2);
            } else {
                z = false;
            }
            otw.c((maa) objT2, mey0Var, (qim0) null, (ipb1) null, x340Var3, (iIntValue << 3) & 112, 12);
            x340Var3.r(z);
        }
        return rih1.a;
    }

    private final Object s(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        jjm0 jjm0Var = (jjm0) obj;
        iu30 iu30Var = (iu30) obj4;
        x340 x340Var = (b0k) obj5;
        int iIntValue = ((Number) obj6).intValue();
        if ((iIntValue & 6) == 0) {
            i = ((iIntValue & 8) == 0 ? x340Var.g(jjm0Var) : x340Var.i(jjm0Var) ? 4 : 2) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i |= (iIntValue & 64) == 0 ? x340Var.g(obj2) : x340Var.i(obj2) ? 32 : 16;
        }
        if ((iIntValue & 3072) == 0) {
            i |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 9235) != 9234)) {
            iu30Var.invoke(((zu30) this.b).J(jjm0Var, obj2, x340Var2, Integer.valueOf(i & 126)));
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        omp0 omp0Var;
        iu30 iu30Var;
        smp0 smp0Var = (smp0) this.b;
        jjm0 jjm0Var = (jjm0) obj;
        omp0 omp0Var2 = (omp0) obj2;
        qmp0 qmp0Var = (qmp0) obj3;
        iu30 iu30Var2 = (iu30) obj4;
        x340 x340Var = (b0k) obj5;
        int iIntValue = ((Number) obj6).intValue();
        m4c m4cVar = fkj0.X;
        pmp0 pmp0Var = qmp0Var.d;
        int i = (iIntValue & 112) ^ 48;
        boolean z = ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(qmp0Var)) || (iIntValue & 384) == 256) | ((i > 32 && x340Var.g(omp0Var2)) || (iIntValue & 48) == 32);
        int i2 = (iIntValue & 7168) ^ 3072;
        boolean z2 = (i2 > 2048 && x340Var.g(iu30Var2)) || (iIntValue & 3072) == 2048;
        x340 x340Var2 = x340Var;
        boolean zI = z | z2 | x340Var2.i(smp0Var);
        Object objT = x340Var2.T();
        if (zI || objT == m4cVar) {
            objT = new ary(qmp0Var, omp0Var2, iu30Var2, smp0Var, (lnm) null);
            omp0Var = omp0Var2;
            iu30Var = iu30Var2;
            x340Var2.s0(objT);
        } else {
            omp0Var = omp0Var2;
            iu30Var = iu30Var2;
        }
        qxd0.t(pmp0Var, x340Var2, (vu30) objT);
        boolean z3 = ((i > 32 && x340Var2.g(omp0Var)) || (iIntValue & 48) == 32) | ((i2 > 2048 && x340Var2.g(iu30Var)) || (iIntValue & 3072) == 2048);
        Object objT2 = x340Var2.T();
        if (z3 || objT2 == m4cVar) {
            objT2 = new w63(omp0Var, iu30Var, (lnm) null, (byte) 13);
            x340Var2.s0(objT2);
        }
        jjm0Var.a((zu30) objT2, x340Var2, (iIntValue << 3) & 112);
        return rih1.a;
    }

    private final Object u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        jjm0 jjm0Var = (jjm0) obj;
        h8r0 h8r0Var = (h8r0) obj2;
        k8r0 k8r0Var = (k8r0) obj3;
        iu30 iu30Var = (iu30) obj4;
        int iIntValue = ((Number) obj6).intValue();
        m4c m4cVar = fkj0.X;
        String str = h8r0Var.a;
        l8r0 l8r0Var = (l8r0) this.b;
        x340 x340Var = (b0k) obj5;
        boolean z = true;
        boolean zI = x340Var.i(l8r0Var) | x340Var.i(h8r0Var) | ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(k8r0Var)) || (iIntValue & 384) == 256);
        if ((((iIntValue & 7168) ^ 3072) <= 2048 || !x340Var.g(iu30Var)) && (iIntValue & 3072) != 2048) {
            z = false;
        }
        boolean z2 = zI | z;
        Object objT = x340Var.T();
        if (z2 || objT == m4cVar) {
            ofk0 ofk0Var = new ofk0(l8r0Var, h8r0Var, k8r0Var, iu30Var, (lnm) null, (byte) 18, false);
            x340Var.s0(ofk0Var);
            objT = ofk0Var;
        }
        qxd0.t(str, x340Var, (vu30) objT);
        boolean zI2 = x340Var.i(l8r0Var) | x340Var.i(h8r0Var);
        Object objT2 = x340Var.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new l14(l8r0Var, h8r0Var, (lnm) null, (byte) 7);
            x340Var.s0(objT2);
        }
        jjm0Var.a((zu30) objT2, x340Var, (iIntValue << 3) & 112);
        return rih1.a;
    }

    private final Object v(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        jjm0 jjm0Var = (jjm0) obj;
        bss0 bss0Var = (bss0) obj3;
        iu30 iu30Var = (iu30) obj4;
        int iIntValue = ((Number) obj6).intValue();
        et90 et90Var = (et90) this.b;
        x340 x340Var = (b0k) obj5;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = qxd0.M(o6x.a, x340Var);
            x340Var.s0(objT);
        }
        c9n c9nVar = (c9n) objT;
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = v8r.q((Object) null);
            x340Var.s0(objT2);
        }
        ven0 ven0Var = (ven0) objT2;
        Boolean boolValueOf = Boolean.valueOf(bss0Var instanceof ass0);
        int i = (iIntValue & 7168) ^ 3072;
        boolean zI = ((((iIntValue & 896) ^ 384) > 256 && x340Var.i(bss0Var)) || (iIntValue & 384) == 256) | ((i > 2048 && x340Var.g(iu30Var)) || (iIntValue & 3072) == 2048) | x340Var.i(et90Var);
        Object objT3 = x340Var.T();
        if (zI || objT3 == m4cVar) {
            objT3 = new ofk0(bss0Var, iu30Var, et90Var, (lnm) null);
            x340Var.s0(objT3);
        }
        qxd0.t(boolValueOf, x340Var, (vu30) objT3);
        boolean zI2 = x340Var.i(ven0Var) | ((i > 2048 && x340Var.g(iu30Var)) || (iIntValue & 3072) == 2048) | x340Var.i(c9nVar) | x340Var.i(et90Var);
        Object objT4 = x340Var.T();
        if (zI2 || objT4 == m4cVar) {
            objT4 = new pov(iu30Var, c9nVar, ven0Var, et90Var, (lnm) null);
            x340Var.s0(objT4);
        }
        jjm0Var.a((zu30) objT4, x340Var, (iIntValue << 3) & 112);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:469:0x09eb  */
    /* JADX WARN: Code duplicated, block: B:470:0x09ed  */
    /* JADX WARN: Code duplicated, block: B:472:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:475:0x09f7  */
    /* JADX WARN: Code duplicated, block: B:478:0x09fb A[PHI: r0
      0x09fb: PHI (r0v22 p.urc) = (r0v21 p.urc), (r0v35 p.urc) binds: [B:471:0x09ee, B:476:0x09f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:482:0x0a08  */
    /* JADX WARN: Code duplicated, block: B:486:0x0a3a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f7 A[PHI: r37
      0x00f7: PHI (r37v17 boolean) = (r37v14 boolean), (r37v18 boolean) binds: [B:55:0x00f5, B:53:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:60:0x0102 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x0108  */
    /* JADX WARN: Code duplicated, block: B:66:0x012e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0134  */
    /* JADX WARN: Code duplicated, block: B:74:0x0140  */
    /* JADX WARN: Code duplicated, block: B:76:0x0146  */
    /* JADX WARN: Code duplicated, block: B:82:0x015c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0162  */
    /* JADX WARN: Code duplicated, block: B:90:0x0176 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:91:0x0178  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        lnm lnmVar;
        lnm lnmVar2;
        List listZ0;
        urc trcVar;
        urc urcVar;
        boolean zI;
        Object objT;
        ven0 ven0Var;
        boolean zI2;
        Object objT2;
        byte b;
        boolean z;
        tob1 tob1Var;
        tob1 tob1Var2;
        boolean z2;
        Integer num;
        String str;
        String str2;
        z6q0 z6q0Var;
        mq70 mq70Var;
        up70 up70VarA;
        String str3;
        mq70 mq70Var2;
        up70 up70VarA2;
        String str4;
        mq70 mq70Var3;
        up70 up70VarA3;
        String str5;
        c0y0 c0y0Var;
        boolean z3;
        boolean z4;
        int i2;
        boolean z5;
        boolean z6;
        boolean z7;
        Object objT3;
        c0y0 c0y0Var2;
        boolean zI3;
        Object objT4;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        Object obj7 = this.b;
        switch (b2) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int i3 = 2048;
                su1 su1Var = (su1) obj;
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue = bool.booleanValue();
                Function0 function0 = (Function0) obj3;
                Function0 function1 = (Function0) obj4;
                x340 x340Var = (b0k) obj5;
                int iIntValue = ((Number) obj6).intValue();
                if ((iIntValue & 6) == 0) {
                    i = ((iIntValue & 8) == 0 ? x340Var.g(su1Var) : x340Var.i(su1Var) ? 4 : 2) | iIntValue;
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= x340Var.h(zBooleanValue) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    i |= x340Var.i(function0) ? 256 : 128;
                }
                if ((iIntValue & 3072) == 0) {
                    if (!x340Var.i(function1)) {
                        i3 = 1024;
                    }
                    i |= i3;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i & 1, (i & 9363) != 9362)) {
                    ((dv30) ((ven0) obj7).getValue()).Y(su1Var, bool, function0, function1, x340Var2, Integer.valueOf((i & 7168) | 8 | (i & 14) | (i & 112) | (i & 896)));
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                jjm0 jjm0Var = (jjm0) obj;
                pv7 pv7Var = (pv7) obj3;
                iu30 iu30Var = (iu30) obj4;
                int iIntValue2 = ((Number) obj6).intValue();
                m4c m4cVar = fkj0.X;
                rwj rwjVar = (rwj) obj7;
                x340 x340Var3 = (b0k) obj5;
                boolean zI4 = x340Var3.i(rwjVar) | ((((iIntValue2 & 896) ^ 384) > 256 && x340Var3.g(pv7Var)) || (iIntValue2 & 384) == 256) | ((((iIntValue2 & 7168) ^ 3072) > 2048 && x340Var3.g(iu30Var)) || (iIntValue2 & 3072) == 2048);
                Object objT5 = x340Var3.T();
                if (zI4 || objT5 == m4cVar) {
                    objT5 = new wc5(rwjVar, pv7Var, iu30Var, (lnm) null, (byte) 14);
                    lnmVar = null;
                    x340Var3.s0(objT5);
                } else {
                    lnmVar = null;
                }
                qxd0.t(rih1Var, x340Var3, (vu30) objT5);
                boolean zI5 = x340Var3.i(rwjVar);
                Object objT6 = x340Var3.T();
                if (zI5 || objT6 == m4cVar) {
                    objT6 = new sv7(rwjVar, lnmVar, (byte) 0);
                    x340Var3.s0(objT6);
                }
                jjm0Var.a((zu30) objT6, x340Var3, (iIntValue2 << 3) & 112);
                return rih1Var;
            case 2:
                jjm0 jjm0Var2 = (jjm0) obj;
                bw7 bw7Var = (bw7) obj3;
                iu30 iu30Var2 = (iu30) obj4;
                int iIntValue3 = ((Number) obj6).intValue();
                yxb0 yxb0Var = (yxb0) obj7;
                x340 x340Var4 = (b0k) obj5;
                Object objT7 = x340Var4.T();
                m4c m4cVar2 = fkj0.X;
                if (objT7 == m4cVar2) {
                    objT7 = v8r.q("");
                    x340Var4.s0(objT7);
                }
                ven0 ven0Var2 = (ven0) objT7;
                boolean zI6 = x340Var4.i(yxb0Var) | ((((iIntValue3 & 896) ^ 384) > 256 && x340Var4.g(bw7Var)) || (iIntValue3 & 384) == 256) | ((((iIntValue3 & 7168) ^ 3072) > 2048 && x340Var4.g(iu30Var2)) || (iIntValue3 & 3072) == 2048);
                Object objT8 = x340Var4.T();
                if (zI6 || objT8 == m4cVar2) {
                    objT8 = new wc5(yxb0Var, bw7Var, iu30Var2, (lnm) null, (byte) 15);
                    lnmVar2 = null;
                    x340Var4.s0(objT8);
                } else {
                    lnmVar2 = null;
                }
                qxd0.t(rih1Var, x340Var4, (vu30) objT8);
                boolean zI7 = x340Var4.i(yxb0Var) | x340Var4.i(ven0Var2);
                Object objT9 = x340Var4.T();
                if (zI7 || objT9 == m4cVar2) {
                    objT9 = new kw0(yxb0Var, ven0Var2, lnmVar2, (byte) 4);
                    x340Var4.s0(objT9);
                }
                jjm0Var2.a((zu30) objT9, x340Var4, (iIntValue3 << 3) & 112);
                String str6 = (String) ven0Var2.getValue();
                boolean zI8 = x340Var4.i(ven0Var2) | x340Var4.i(yxb0Var);
                Object objT10 = x340Var4.T();
                if (zI8 || objT10 == m4cVar2) {
                    objT10 = new ry5(yxb0Var, ven0Var2, lnmVar2, (byte) 10);
                    x340Var4.s0(objT10);
                }
                qxd0.t(str6, x340Var4, (vu30) objT10);
                return rih1Var;
            case 3:
                jjm0 jjm0Var3 = (jjm0) obj;
                uqo uqoVar = (uqo) obj2;
                crc crcVar = (crc) obj3;
                iu30 iu30Var3 = (iu30) obj4;
                int iIntValue4 = ((Number) obj6).intValue();
                Long l = crcVar.d;
                umf0 umf0Var = (umf0) obj7;
                x340 x340Var5 = (b0k) obj5;
                Object objT11 = x340Var5.T();
                m4c m4cVar3 = fkj0.X;
                if (objT11 == m4cVar3) {
                    objT11 = (rrc) ((kly0) umf0Var.d).get();
                    x340Var5.s0(objT11);
                }
                rrc rrcVar = (rrc) objT11;
                ven0 ven0VarH = rwq.h(rrcVar.c, x340Var5, 0);
                Object objT12 = x340Var5.T();
                if (objT12 == m4cVar3) {
                    Long l2 = crcVar.c;
                    if (l == null) {
                        l2 = null;
                    }
                    objT12 = v8r.q(l2);
                    x340Var5.s0(objT12);
                }
                ven0 ven0Var3 = (ven0) objT12;
                Object objT13 = x340Var5.T();
                if (objT13 == m4cVar3) {
                    objT13 = v8r.q(l);
                    x340Var5.s0(objT13);
                }
                ven0 ven0Var4 = (ven0) objT13;
                Object objT14 = x340Var5.T();
                if (objT14 == m4cVar3) {
                    objT14 = c13.l(crcVar.e, x340Var5);
                }
                ven0 ven0Var5 = (ven0) objT14;
                mrc mrcVar = (orc) ven0VarH.getValue();
                if (!mrcVar.equals(nrc.a)) {
                    if (mrcVar.equals(lrc.a)) {
                        trcVar = src.a;
                    } else {
                        if (!(mrcVar instanceof mrc)) {
                            eg.o();
                            return null;
                        }
                        List list = krc.a;
                        mrc mrcVar2 = mrcVar;
                        Long l3 = mrcVar2.a;
                        long j = mrcVar2.c;
                        long j2 = mrcVar2.d;
                        if (j <= 0 || j > j2) {
                            listZ0 = z6x.a;
                        } else {
                            List list2 = krc.a;
                            ArrayList arrayList = new ArrayList();
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                Iterator it2 = it;
                                Object next = it2.next();
                                long jA0 = jch0.a0(((Number) next).doubleValue() * 1.0E9d);
                                if (j <= jA0 && jA0 <= j2) {
                                    arrayList.add(next);
                                }
                                it = it2;
                            }
                            ArrayList arrayList2 = new ArrayList(arrayList);
                            if (arrayList2.isEmpty()) {
                                arrayList2.add(Double.valueOf(j / 1.0E9d));
                            } else {
                                Iterator it3 = arrayList2.iterator();
                                do {
                                    if (!it3.hasNext()) {
                                        arrayList2.add(Double.valueOf(j / 1.0E9d));
                                    }
                                } while (jch0.a0(((Number) it3.next()).doubleValue() * 1.0E9d) != j);
                            }
                            listZ0 = o7h.Z0(arrayList2);
                        }
                        List list3 = krc.a;
                        trcVar = new trc(krc.a(l3 != null ? l3.longValue() : mrcVar2.b, listZ0), listZ0, l3 == null, l3 != null);
                    }
                    if (trcVar instanceof trc) {
                        urcVar = trcVar;
                    } else {
                        urcVar = null;
                    }
                    if (urcVar == null) {
                        urcVar = crcVar.b;
                        if (!(urcVar instanceof trc)) {
                            urcVar = null;
                        }
                        if (urcVar != null) {
                            trcVar = urcVar;
                        }
                    } else {
                        trcVar = urcVar;
                    }
                    zI = x340Var5.i(rrcVar);
                    objT = x340Var5.T();
                    if (zI || objT == m4cVar3) {
                        objT = new vk6(rrcVar, null, (byte) 18);
                        x340Var5.s0(objT);
                    }
                    qxd0.t(rrcVar, x340Var5, (vu30) objT);
                    ven0Var = ven0Var5;
                    zI2 = x340Var5.i(ven0Var3) | x340Var5.i(ven0Var4) | x340Var5.i(rrcVar) | x340Var5.i(ven0Var) | x340Var5.i(umf0Var);
                    objT2 = x340Var5.T();
                    if (zI2 || objT2 == m4cVar3) {
                        objT2 = new drc(rrcVar, umf0Var, ven0Var3, ven0Var4, ven0Var, (lnm) null);
                        x340Var5.s0(objT2);
                    }
                    jjm0Var3.a((zu30) objT2, x340Var5, (iIntValue4 << 3) & 112);
                    iu30Var3.invoke(new crc(uqoVar, trcVar, (Long) ven0Var3.getValue(), (Long) ven0Var4.getValue(), ((Boolean) ven0Var.getValue()).booleanValue()));
                    return rih1Var;
                }
                trcVar = urc.a;
                iIntValue4 = iIntValue4;
                ven0Var5 = ven0Var5;
                if (trcVar instanceof trc) {
                    urcVar = trcVar;
                } else {
                    urcVar = null;
                }
                if (urcVar == null) {
                    urcVar = crcVar.b;
                    if (!(urcVar instanceof trc)) {
                        urcVar = null;
                    }
                    if (urcVar != null) {
                        trcVar = urcVar;
                    }
                } else {
                    trcVar = urcVar;
                }
                zI = x340Var5.i(rrcVar);
                objT = x340Var5.T();
                if (zI) {
                    objT = new vk6(rrcVar, null, (byte) 18);
                    x340Var5.s0(objT);
                } else {
                    objT = new vk6(rrcVar, null, (byte) 18);
                    x340Var5.s0(objT);
                }
                qxd0.t(rrcVar, x340Var5, (vu30) objT);
                ven0Var = ven0Var5;
                zI2 = x340Var5.i(ven0Var3) | x340Var5.i(ven0Var4) | x340Var5.i(rrcVar) | x340Var5.i(ven0Var) | x340Var5.i(umf0Var);
                objT2 = x340Var5.T();
                if (zI2) {
                    objT2 = new drc(rrcVar, umf0Var, ven0Var3, ven0Var4, ven0Var, (lnm) null);
                    x340Var5.s0(objT2);
                } else {
                    objT2 = new drc(rrcVar, umf0Var, ven0Var3, ven0Var4, ven0Var, (lnm) null);
                    x340Var5.s0(objT2);
                }
                jjm0Var3.a((zu30) objT2, x340Var5, (iIntValue4 << 3) & 112);
                iu30Var3.invoke(new crc(uqoVar, trcVar, (Long) ven0Var3.getValue(), (Long) ven0Var4.getValue(), ((Boolean) ven0Var.getValue()).booleanValue()));
                return rih1Var;
            case 4:
                jjm0 jjm0Var4 = (jjm0) obj;
                dmf dmfVar = (dmf) obj2;
                iu30 iu30Var4 = (iu30) obj4;
                int iIntValue5 = ((Number) obj6).intValue();
                Object obj8 = fkj0.X;
                mmf mmfVar = (mmf) obj7;
                String str7 = dmfVar.a;
                boolean z8 = dmfVar.b instanceof btf;
                x340 x340Var6 = (b0k) obj5;
                boolean zG = x340Var6.g(str7);
                Object objT15 = x340Var6.T();
                if (zG || objT15 == obj8) {
                    objT15 = c13.l(dmfVar.g, x340Var6);
                }
                tob1 tob1Var3 = (ven0) objT15;
                boolean zI9 = x340Var6.i(tob1Var3);
                Object objT16 = x340Var6.T();
                if (zI9 || objT16 == obj8) {
                    objT16 = new yw1(tob1Var3, (byte) 1);
                    x340Var6.s0(objT16);
                }
                r331 r331Var = (r331) objT16;
                boolean zG2 = x340Var6.g(str7);
                Object objT17 = x340Var6.T();
                if (zG2 || objT17 == obj8) {
                    objT17 = mmfVar.a.a(uj1.E, r331Var);
                    x340Var6.s0(objT17);
                }
                b431 b431Var = (b431) objT17;
                iac0 iac0Var = mmfVar.P0;
                jed0 jed0Var = mmfVar.g;
                add addVar = mmfVar.f;
                qf4 qf4Var = addVar.a;
                boolean zI10 = x340Var6.i(mmfVar) | x340Var6.i(tob1Var3) | x340Var6.g(str7);
                Object objT18 = x340Var6.T();
                if (zI10 || objT18 == obj8) {
                    objT18 = new gmf(mmfVar, str7, tob1Var3, (byte) 0);
                    x340Var6.s0(objT18);
                }
                qxd0.h(iac0Var, str7, (iu30) objT18, x340Var6);
                boolean zG3 = x340Var6.g(str7);
                Object objT19 = x340Var6.T();
                if (zG3 || objT19 == obj8) {
                    objT19 = v8r.q(Boolean.FALSE);
                    x340Var6.s0(objT19);
                }
                ven0 ven0Var6 = (ven0) objT19;
                boolean zG4 = x340Var6.g(str7);
                Object objT20 = x340Var6.T();
                if (zG4 || objT20 == obj8) {
                    objT20 = v8r.q(Boolean.FALSE);
                    x340Var6.s0(objT20);
                }
                tob1 tob1Var4 = (ven0) objT20;
                ven0 ven0VarG = rwq.g(new lmf(jed0Var.b(), (byte) 0), Boolean.FALSE, null, x340Var6, 48, 2);
                tob1 tob1VarG = rwq.g(jed0Var.d(), fbd0.a, null, x340Var6, 0, 2);
                if (z8) {
                    tob1VarG = tob1VarG;
                    rih1Var = rih1Var;
                    qf4Var = qf4Var;
                    b = 1;
                    x340Var6.i0(337032474);
                    x340Var6.r(false);
                } else {
                    x340Var6.i0(335891767);
                    jwm jwmVar = (jwm) o7h.s0(dmfVar.e);
                    String str8 = jwmVar != null ? jwmVar.a.a : null;
                    if (str8 != null) {
                        x340Var6.i0(336003956);
                        boolean zG5 = x340Var6.g(str8);
                        Object objT21 = x340Var6.T();
                        if (zG5 || objT21 == obj8) {
                            objT21 = pcf.j(str8);
                            x340Var6.s0(objT21);
                        }
                        String str9 = (String) objT21;
                        boolean zI11 = x340Var6.i(ven0Var6) | x340Var6.i(mmfVar) | x340Var6.g(str9);
                        Object objT22 = x340Var6.T();
                        if (zI11 || objT22 == obj8) {
                            b = 1;
                            objT22 = new gmf(mmfVar, str9, ven0Var6, b);
                            x340Var6.s0(objT22);
                        } else {
                            b = 1;
                        }
                        qxd0.i(str9, (iu30) objT22, x340Var6);
                        boolean zI12 = x340Var6.i(tob1Var4) | x340Var6.i(mmfVar) | x340Var6.g(str8);
                        Object objT23 = x340Var6.T();
                        if (zI12 || objT23 == obj8) {
                            objT23 = new el0(mmfVar, str8, tob1Var4, (lnm) null, (byte) 13);
                            x340Var6.s0(objT23);
                        }
                        qxd0.t(str8, x340Var6, (vu30) objT23);
                        z2 = false;
                        x340Var6.r(false);
                    } else {
                        rih1Var = rih1Var;
                        z2 = false;
                        b = 1;
                        x340Var6.i0(337024538);
                        x340Var6.r(false);
                    }
                    x340Var6.r(z2);
                }
                boolean zI13 = x340Var6.i(b431Var) | x340Var6.g(str7) | x340Var6.i(tob1Var3) | x340Var6.i(mmfVar) | x340Var6.h(z8) | x340Var6.i(tob1Var4) | x340Var6.i(dmfVar);
                Object objT24 = x340Var6.T();
                if (zI13 || objT24 == obj8) {
                    z = z8;
                    tob1Var = tob1Var3;
                    tob1Var2 = tob1Var4;
                    objT24 = new imf(b431Var, str7, mmfVar, z, dmfVar, tob1Var, tob1Var2, null);
                    x340Var6.s0(objT24);
                } else {
                    z = z8;
                    tob1Var = tob1Var3;
                    tob1Var2 = tob1Var4;
                }
                jjm0Var4.a((zu30) objT24, x340Var6, (iIntValue5 << 3) & 112);
                zks0 zks0Var = dmfVar.f;
                iu30Var4.invoke(new emf(dmfVar.b, dmfVar.c, dmfVar.d, dmfVar.e, ((Boolean) tob1Var.getValue()).booleanValue(), ((Boolean) ven0Var6.getValue()).booleanValue(), ((Boolean) tob1Var2.getValue()).booleanValue(), ((Boolean) ven0VarG.getValue()).booleanValue(), ((ibd0) tob1VarG.getValue()) instanceof ebd0, addVar.l(), addVar.e(), z, (z && qf4Var.h() && qf4Var.x()) ? b : 0, (!z || (qf4Var.i() && (zks0Var.b() || zks0Var.g()))) ? 0 : b, (!z || qf4Var.i()) ? b : 0, (!z || !qf4Var.i() || zks0Var.b() || zks0Var.g()) ? 0 : b, !z));
                return rih1Var;
            case 5:
                fmg fmgVar = (fmg) obj7;
                jjm0 jjm0Var5 = (jjm0) obj;
                amg amgVar = (amg) obj2;
                dmg dmgVar = (dmg) obj3;
                iu30 iu30Var5 = (iu30) obj4;
                int iIntValue6 = ((Number) obj6).intValue();
                x340 x340Var7 = (b0k) obj5;
                Object objT25 = x340Var7.T();
                m4c m4cVar4 = fkj0.X;
                if (objT25 == m4cVar4) {
                    objT25 = v8r.q(Boolean.FALSE);
                    x340Var7.s0(objT25);
                }
                ven0 ven0Var7 = (ven0) objT25;
                Object objT26 = x340Var7.T();
                if (objT26 == m4cVar4) {
                    objT26 = v8r.q(Boolean.FALSE);
                    x340Var7.s0(objT26);
                }
                ven0 ven0Var8 = (ven0) objT26;
                Object objT27 = x340Var7.T();
                if (objT27 == m4cVar4) {
                    objT27 = c13.l(dmgVar.d, x340Var7);
                }
                ven0 ven0Var9 = (ven0) objT27;
                ven0 ven0VarS = v8r.s(amgVar, x340Var7);
                boolean zI14 = x340Var7.i(ven0Var7) | x340Var7.i(ven0Var8) | x340Var7.i(jjm0Var5) | x340Var7.i(ven0VarS) | x340Var7.i(fmgVar) | x340Var7.i(ven0Var9);
                Object objT28 = x340Var7.T();
                if (zI14 || objT28 == m4cVar4) {
                    imf imfVar = new imf(jjm0Var5, fmgVar, ven0Var7, ven0Var8, ven0VarS, ven0Var9, null);
                    x340Var7.s0(imfVar);
                    objT28 = imfVar;
                }
                jjm0Var5.a((zu30) objT28, x340Var7, (iIntValue6 << 3) & 112);
                iu30Var5.invoke(new dmg(((Boolean) ven0Var7.getValue()).booleanValue(), ((Boolean) ven0Var8.getValue()).booleanValue(), amgVar.c, ((Boolean) ven0Var9.getValue()).booleanValue(), amgVar.d, amgVar.e, amgVar.f));
                return rih1Var;
            case 6:
                jjm0 jjm0Var6 = (jjm0) obj;
                z7h z7hVar = (z7h) obj2;
                iu30 iu30Var6 = (iu30) obj4;
                int iIntValue7 = ((Number) obj6).intValue();
                c8h c8hVar = (c8h) obj7;
                x340 x340Var8 = (b0k) obj5;
                boolean zI15 = x340Var8.i(c8hVar);
                Object objT29 = x340Var8.T();
                if (zI15 || objT29 == fkj0.X) {
                    objT29 = new vd2(c8hVar, (lnm) null, (byte) 6);
                    x340Var8.s0(objT29);
                }
                jjm0Var6.a((zu30) objT29, x340Var8, (iIntValue7 << 3) & 112);
                iu30Var6.invoke(z7hVar);
                return rih1Var;
            case 7:
                jjm0 jjm0Var7 = (jjm0) obj;
                owl owlVar = (owl) obj2;
                iu30 iu30Var7 = (iu30) obj4;
                x340 x340Var9 = (b0k) obj5;
                int iIntValue8 = ((Number) obj6).intValue();
                m4c m4cVar5 = fkj0.X;
                uwl uwlVar = (uwl) obj7;
                ven0 ven0VarG2 = rwq.g((i0h) ((em0) uwlVar.f).t, new u7h(u7h.k), null, x340Var9, 48, 2);
                x340 x340Var10 = x340Var9;
                boolean zI16 = x340Var10.i(uwlVar) | ((((iIntValue8 & 112) ^ 48) > 32 && x340Var10.g(owlVar)) || (iIntValue8 & 48) == 32) | ((((iIntValue8 & 7168) ^ 3072) > 2048 && x340Var10.g(iu30Var7)) || (iIntValue8 & 3072) == 2048) | x340Var10.g(ven0VarG2);
                Object objT30 = x340Var10.T();
                if (zI16 || objT30 == m4cVar5) {
                    objT30 = new us0(uwlVar, owlVar, iu30Var7, ven0VarG2, null, (byte) 22, false);
                    x340Var10.s0(objT30);
                }
                qxd0.t(owlVar, x340Var10, (vu30) objT30);
                boolean zI17 = x340Var10.i(uwlVar);
                Object objT31 = x340Var10.T();
                if (zI17 || objT31 == m4cVar5) {
                    objT31 = new vd2(uwlVar, (lnm) null, (byte) 8);
                    x340Var10.s0(objT31);
                }
                jjm0Var7.a((zu30) objT31, x340Var10, (iIntValue8 << 3) & 112);
                return rih1Var;
            case 8:
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = (k1r) obj2;
                a7q0 a7q0Var = (a7q0) obj3;
                jo70 jo70Var = (jo70) obj4;
                mdz mdzVar = (mdz) obj5;
                va81 va81Var = (va81) obj6;
                boolean z9 = i1rVar instanceof i1r;
                i1r i1rVar3 = z9 ? i1rVar : null;
                xkk1 xkk1Var = i1rVar3 != null ? (xkk1) i1rVar3.a : null;
                vp70 vp70Var = vp70.d;
                String str10 = (xkk1Var == null || (mq70Var3 = xkk1Var.a) == null || (up70VarA3 = mq70Var3.a(vp70Var)) == null || (str5 = up70VarA3.a.a) == null || str5.length() <= 0) ? null : str5;
                String str11 = (xkk1Var == null || (mq70Var2 = xkk1Var.b) == null || (up70VarA2 = mq70Var2.a(vp70Var)) == null || (str4 = up70VarA2.a.a) == null || str4.length() <= 0) ? null : str4;
                xkk1 xkk1Var2 = i1rVar2 instanceof i1r ? (xkk1) i1rVar2.a : null;
                Integer numJ = oqo1.j(xkk1Var2);
                if (i1rVar instanceof j1r) {
                    num = null;
                } else {
                    if (z9) {
                        Integer numJ2 = oqo1.j((xkk1) i1rVar.a);
                        if (numJ2 != null) {
                            num = numJ2;
                        }
                    } else if (!(i1rVar instanceof h1r)) {
                        eg.o();
                        return null;
                    }
                    num = numJ;
                }
                String str12 = (xkk1Var2 == null || (mq70Var = xkk1Var2.a) == null || (up70VarA = mq70Var.a(vp70Var)) == null || (str3 = up70VarA.a.a) == null || str3.length() <= 0) ? null : str3;
                boolean z10 = (((String) obj7) == null || (i1rVar2 instanceof j1r)) ? false : true;
                boolean z11 = (a7q0Var == null || (z6q0Var = a7q0Var.f) == null || !z6q0Var.b) ? false : true;
                String str13 = (jo70Var == null || (str2 = jo70Var.a) == null || str2.length() <= 0) ? null : str2;
                if (mdzVar != null) {
                    str = mdzVar.c;
                } else {
                    str = va81Var != null ? va81Var.b : null;
                }
                return new utn(str10, str11, num, str12, z10, z11, str13, (str == null || str.length() <= 0) ? null : str);
            case 9:
                jjm0 jjm0Var8 = (jjm0) obj;
                zov zovVar = (zov) obj2;
                apv apvVar = (apv) obj3;
                iu30 iu30Var8 = (iu30) obj4;
                int iIntValue9 = ((Number) obj6).intValue();
                res resVar = (res) obj7;
                x340 x340Var11 = (b0k) obj5;
                boolean zI18 = x340Var11.i(resVar) | ((((iIntValue9 & 7168) ^ 3072) > 2048 && x340Var11.g(iu30Var8)) || (iIntValue9 & 3072) == 2048) | ((((iIntValue9 & 896) ^ 384) > 256 && x340Var11.g(apvVar)) || (iIntValue9 & 384) == 256) | ((((iIntValue9 & 112) ^ 48) > 32 && x340Var11.g(zovVar)) || (iIntValue9 & 48) == 32);
                Object objT32 = x340Var11.T();
                if (zI18 || objT32 == fkj0.X) {
                    objT32 = new l14(resVar, iu30Var8, apvVar, zovVar, (lnm) null, (byte) 5);
                    x340Var11.s0(objT32);
                }
                jjm0Var8.a((zu30) objT32, x340Var11, (iIntValue9 << 3) & 112);
                return rih1Var;
            case 10:
                jjm0 jjm0Var9 = (jjm0) obj;
                q7y q7yVar = (q7y) obj2;
                iu30 iu30Var9 = (iu30) obj4;
                int iIntValue10 = ((Number) obj6).intValue();
                s7y s7yVar = (s7y) obj7;
                x340 x340Var12 = (b0k) obj5;
                boolean zI19 = x340Var12.i(s7yVar) | ((((iIntValue10 & 112) ^ 48) > 32 && x340Var12.g(q7yVar)) || (iIntValue10 & 48) == 32);
                Object objT33 = x340Var12.T();
                if (zI19 || objT33 == fkj0.X) {
                    objT33 = new r20(s7yVar, q7yVar, (lnm) null);
                    x340Var12.s0(objT33);
                }
                jjm0Var9.a((zu30) objT33, x340Var12, (iIntValue10 << 3) & 112);
                iu30Var9.invoke(q7yVar);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return d(obj, obj2, obj3, obj4, obj5, obj6);
            case grn1.d /* 12 */:
                return e(obj, obj2, obj3, obj4, obj5, obj6);
            case 13:
                return f(obj, obj2, obj3, obj4, obj5, obj6);
            case 14:
                return g(obj, obj2, obj3, obj4, obj5, obj6);
            case 15:
                return h(obj, obj2, obj3, obj4, obj5, obj6);
            case 16:
                return i(obj, obj2, obj3, obj4, obj5, obj6);
            case 17:
                return j(obj, obj2, obj3, obj4, obj5, obj6);
            case 18:
                return k(obj, obj2, obj3, obj4, obj5, obj6);
            case 19:
                return m(obj, obj2, obj3, obj4, obj5, obj6);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return n(obj, obj2, obj3, obj4, obj5, obj6);
            case 21:
                return o(obj, obj2, obj3, obj4, obj5, obj6);
            case 22:
                return p(obj, obj2, obj3, obj4, obj5, obj6);
            case 23:
                return q(obj, obj2, obj3, obj4, obj5, obj6);
            case 24:
                return r(obj, obj2, obj3, obj4, obj5, obj6);
            case 25:
                return s(obj, obj2, obj3, obj4, obj5, obj6);
            case 26:
                return t(obj, obj2, obj3, obj4, obj5, obj6);
            case 27:
                return u(obj, obj2, obj3, obj4, obj5, obj6);
            case 28:
                return v(obj, obj2, obj3, obj4, obj5, obj6);
            default:
                jjm0 jjm0Var10 = (jjm0) obj;
                wzx0 wzx0Var = (wzx0) obj2;
                c0y0 c0y0Var3 = (c0y0) obj3;
                iu30 iu30Var10 = (iu30) obj4;
                int iIntValue11 = ((Number) obj6).intValue();
                pt ptVar = (pt) obj7;
                x340 x340Var13 = (b0k) obj5;
                Object objT34 = x340Var13.T();
                m4c m4cVar6 = fkj0.X;
                if (objT34 == m4cVar6) {
                    objT34 = qxd0.M(o6x.a, x340Var13);
                    x340Var13.s0(objT34);
                }
                c9n c9nVar = (c9n) objT34;
                Object objT35 = x340Var13.T();
                if (objT35 == m4cVar6) {
                    objT35 = v8r.q((Object) null);
                    x340Var13.s0(objT35);
                }
                ven0 ven0Var10 = (ven0) objT35;
                int i4 = (iIntValue11 & 7168) ^ 3072;
                int i5 = (iIntValue11 & 896) ^ 384;
                boolean zI20 = ((i4 > 2048 && x340Var13.g(iu30Var10)) || (iIntValue11 & 3072) == 2048) | x340Var13.i(ven0Var10) | x340Var13.i(ptVar) | ((i5 > 256 && x340Var13.g(c0y0Var3)) || (iIntValue11 & 384) == 256);
                Object objT36 = x340Var13.T();
                if (zI20 || objT36 == m4cVar6) {
                    objT36 = new c6h0(ptVar, iu30Var10, c0y0Var3, ven0Var10, (lnm) null, (byte) 13);
                    x340Var13.s0(objT36);
                }
                qxd0.t(rih1Var, x340Var13, (vu30) objT36);
                String strA = c0y0Var3.a();
                boolean zI21 = x340Var13.i(ptVar);
                if (i5 <= 256 || !x340Var13.g(c0y0Var3)) {
                    c0y0Var = c0y0Var3;
                    if ((iIntValue11 & 384) != 256) {
                        z3 = false;
                    }
                    z4 = z3 | zI21 | ((i4 <= 2048 && x340Var13.g(iu30Var10)) || (iIntValue11 & 3072) == 2048);
                    i2 = (iIntValue11 & 112) ^ 48;
                    if (i2 > 32 || !x340Var13.g(wzx0Var)) {
                        z5 = z4;
                        if ((iIntValue11 & 48) != 32) {
                            z6 = false;
                        }
                        z7 = z5 | z6;
                        objT3 = x340Var13.T();
                        if (!z7 || objT3 == m4cVar6) {
                            c0y0 c0y0Var4 = c0y0Var;
                            objT3 = new yj6(ptVar, c0y0Var4, iu30Var10, wzx0Var, (lnm) null);
                            c0y0Var2 = c0y0Var4;
                            x340Var13.s0(objT3);
                        } else {
                            c0y0Var2 = c0y0Var;
                        }
                        qxd0.t(strA, x340Var13, (vu30) objT3);
                        zI3 = x340Var13.i(c9nVar) | ((i4 <= 2048 && x340Var13.g(iu30Var10)) || (iIntValue11 & 3072) == 2048) | ((i5 <= 256 && x340Var13.g(c0y0Var2)) || (iIntValue11 & 384) == 256) | x340Var13.i(jjm0Var10) | x340Var13.i(ptVar) | ((i2 <= 32 && x340Var13.g(wzx0Var)) || (iIntValue11 & 48) == 32) | x340Var13.i(ven0Var10);
                        objT4 = x340Var13.T();
                        if (zI3 || objT4 == m4cVar6) {
                            d0y0 d0y0Var = new d0y0(c9nVar, iu30Var10, wzx0Var, jjm0Var10, c0y0Var2, ptVar, ven0Var10, (lnm) null);
                            x340Var13.s0(d0y0Var);
                            objT4 = d0y0Var;
                        }
                        jjm0Var10.a((zu30) objT4, x340Var13, (iIntValue11 << 3) & 112);
                        return rih1Var;
                    }
                    z5 = z4;
                    z6 = true;
                    z7 = z5 | z6;
                    objT3 = x340Var13.T();
                    if (z7) {
                        c0y0 c0y0Var5 = c0y0Var;
                        objT3 = new yj6(ptVar, c0y0Var5, iu30Var10, wzx0Var, (lnm) null);
                        c0y0Var2 = c0y0Var5;
                        x340Var13.s0(objT3);
                    } else {
                        c0y0 c0y0Var6 = c0y0Var;
                        objT3 = new yj6(ptVar, c0y0Var6, iu30Var10, wzx0Var, (lnm) null);
                        c0y0Var2 = c0y0Var6;
                        x340Var13.s0(objT3);
                    }
                    qxd0.t(strA, x340Var13, (vu30) objT3);
                    zI3 = x340Var13.i(c9nVar) | ((i4 <= 2048 && x340Var13.g(iu30Var10)) || (iIntValue11 & 3072) == 2048) | ((i5 <= 256 && x340Var13.g(c0y0Var2)) || (iIntValue11 & 384) == 256) | x340Var13.i(jjm0Var10) | x340Var13.i(ptVar) | ((i2 <= 32 && x340Var13.g(wzx0Var)) || (iIntValue11 & 48) == 32) | x340Var13.i(ven0Var10);
                    objT4 = x340Var13.T();
                    if (zI3) {
                        d0y0 d0y0Var2 = new d0y0(c9nVar, iu30Var10, wzx0Var, jjm0Var10, c0y0Var2, ptVar, ven0Var10, (lnm) null);
                        x340Var13.s0(d0y0Var2);
                        objT4 = d0y0Var2;
                    } else {
                        d0y0 d0y0Var3 = new d0y0(c9nVar, iu30Var10, wzx0Var, jjm0Var10, c0y0Var2, ptVar, ven0Var10, (lnm) null);
                        x340Var13.s0(d0y0Var3);
                        objT4 = d0y0Var3;
                    }
                    jjm0Var10.a((zu30) objT4, x340Var13, (iIntValue11 << 3) & 112);
                    return rih1Var;
                }
                c0y0Var = c0y0Var3;
                z3 = true;
                z4 = z3 | zI21 | ((i4 <= 2048 && x340Var13.g(iu30Var10)) || (iIntValue11 & 3072) == 2048);
                i2 = (iIntValue11 & 112) ^ 48;
                if (i2 > 32) {
                    z5 = z4;
                    if ((iIntValue11 & 48) != 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                } else {
                    z5 = z4;
                    if ((iIntValue11 & 48) != 32) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                }
                z7 = z5 | z6;
                objT3 = x340Var13.T();
                if (z7) {
                    c0y0 c0y0Var7 = c0y0Var;
                    objT3 = new yj6(ptVar, c0y0Var7, iu30Var10, wzx0Var, (lnm) null);
                    c0y0Var2 = c0y0Var7;
                    x340Var13.s0(objT3);
                } else {
                    c0y0 c0y0Var8 = c0y0Var;
                    objT3 = new yj6(ptVar, c0y0Var8, iu30Var10, wzx0Var, (lnm) null);
                    c0y0Var2 = c0y0Var8;
                    x340Var13.s0(objT3);
                }
                qxd0.t(strA, x340Var13, (vu30) objT3);
                zI3 = x340Var13.i(c9nVar) | ((i4 <= 2048 && x340Var13.g(iu30Var10)) || (iIntValue11 & 3072) == 2048) | ((i5 <= 256 && x340Var13.g(c0y0Var2)) || (iIntValue11 & 384) == 256) | x340Var13.i(jjm0Var10) | x340Var13.i(ptVar) | ((i2 <= 32 && x340Var13.g(wzx0Var)) || (iIntValue11 & 48) == 32) | x340Var13.i(ven0Var10);
                objT4 = x340Var13.T();
                if (zI3) {
                    d0y0 d0y0Var4 = new d0y0(c9nVar, iu30Var10, wzx0Var, jjm0Var10, c0y0Var2, ptVar, ven0Var10, (lnm) null);
                    x340Var13.s0(d0y0Var4);
                    objT4 = d0y0Var4;
                } else {
                    d0y0 d0y0Var5 = new d0y0(c9nVar, iu30Var10, wzx0Var, jjm0Var10, c0y0Var2, ptVar, ven0Var10, (lnm) null);
                    x340Var13.s0(d0y0Var5);
                    objT4 = d0y0Var5;
                }
                jjm0Var10.a((zu30) objT4, x340Var13, (iIntValue11 << 3) & 112);
                return rih1Var;
        }
    }
}
