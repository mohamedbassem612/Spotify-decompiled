package p;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.martini.martinidata.model.Mode;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.TooltipTemplate;
import com.spotify.scrollsita.v1.Section;
import com.spotify.signup.signup.v2.proto.Error;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bvd1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvd1(j2i j2iVar, qim0 qim0Var, xu30 xu30Var, vu30 vu30Var, int i) {
        super(2);
        this.a = (byte) 8;
        this.c = j2iVar;
        this.b = qim0Var;
        this.d = xu30Var;
        this.e = vu30Var;
    }

    private final Object a(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        iu30 iu30Var = (iu30) this.b;
        Context context = (Context) this.e;
        ven0 ven0Var = (ven0) this.d;
        w9i1 w9i1Var = (w9i1) this.c;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            uwr uwrVar = cbx.a;
            d36 d36Var = new d36(cbx.b(x340Var2).b.a, true, new um5(false));
            boolean zI = x340Var2.i(w9i1Var) | x340Var2.i(ven0Var) | x340Var2.i(context) | x340Var2.g(iu30Var);
            Object objT = x340Var2.T();
            if (zI || objT == fkj0.X) {
                m9i1 m9i1Var = new m9i1(w9i1Var, ven0Var, context, iu30Var, (byte) 0);
                x340Var2.s0(m9i1Var);
                objT = m9i1Var;
            }
            ujo1.d((qim0) null, (xtb0) null, (vzq0) null, false, d36Var, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT, x340Var2, 0, 495);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        zqo1.a((String) this.c, (Uri) this.d, (Function0) this.e, (qim0) this.b, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        whi1 whi1Var = (whi1) this.d;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            irn1.u(nim0.a, apo.r(1807443442, new eii1((t2f1) this.c, whi1Var, (byte) 0), x340Var2), (vu30) null, (erl1) null, apo.r(-2028028052, new p8e1(whi1Var, (iu30) this.e, (dlg1) this.b, (byte) 5), x340Var2), x340Var2, 24624, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        jyo1.e((qvi1) this.c, (Function0) this.d, (qim0) this.b, (idn0) this.e, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ryo1.m((zob1) this.c, (zob1) this.d, (ng20) this.e, (qim0) this.b, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            wzi1 wzi1Var = ((xzi1) this.c).a;
            qim0 qim0VarW = uyn1.w(u291.d(nim0.a, 1.0f), (vzq0) this.d);
            a0j1 a0j1Var = (a0j1) this.e;
            wyo1.g(wzi1Var, a0j1Var.e, a0j1Var.f, a0j1Var.g, a0j1Var.h, a0j1Var.j, qim0VarW, (iu30) this.b, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        azo1.i((x0j1) this.c, (iu30) this.d, (jtl1) this.e, (qim0) this.b, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            azo1.i((x0j1) this.c, (iu30) this.d, ((a1j1) this.e).d, uyn1.w(u291.d(nim0.a, 1.0f), (vzq0) this.b), x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        dzo1.f((x1j1) this.c, (iu30) this.d, (kuq) this.e, (qim0) this.b, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v33, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v55 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        String str;
        ?? r15;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        long j;
        qim0 qim0Var;
        b0k b0kVar;
        int i2;
        mmr0 mmr0Var;
        ?? r16;
        boolean z4;
        boolean z5;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        f36 f36Var = h36.c;
        u5j1 u5j1Var = d4o1.a;
        byte b2 = 21;
        qim0 qim0Var2 = nim0.a;
        byte b3 = 3;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                cvd1.e((sud1) obj6, (xsq) obj5, (d0r) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                g6p1.d((yqg) obj6, (sbe1) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj6;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var2).d;
                    long j2 = ((u7h) ((tob1) obj4).getValue()).a;
                    qim0 qim0VarN = anm1.N("text", qim0Var2);
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarB = uyn1.B(qim0VarN, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    long j3 = ((u7h) ((tob1) obj3).getValue()).a;
                    cua cuaVar = cbx.b(x340Var2).f;
                    qim0 qim0VarF = dug.f(qim0VarB, j3, er31.b(16.0f));
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    qim0 qim0VarX = uyn1.x(qim0VarF, 8.0f);
                    boolean zG = x340Var2.g(function0);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new uuc1(function0, (byte) 10);
                        x340Var2.s0(objT);
                    }
                    uwo1.e((String) obj5, bin.x(qim0VarX, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), lee1Var, j2, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj5;
                tde1 tde1Var = (tde1) obj6;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    qim0 qim0VarN2 = anm1.N("compose-text-sentence", u291.f(qim0Var2, 1.0f));
                    boolean z6 = tde1Var.d;
                    boolean zG2 = x340Var4.g(iu30Var) | x340Var4.g(tde1Var);
                    Object objT2 = x340Var4.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new x0e1(iu30Var, tde1Var, (byte) 4);
                        x340Var4.s0(objT2);
                    }
                    qim0 qim0VarX2 = bin.x(qim0VarN2, z6, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 14);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar3 = cbx.b(x340Var4).b;
                    uwo1.f((af5) obj4, uyn1.B(qim0VarX2, 0.0f, 0.0f, 0.0f, 8.0f, 7), (lee1) obj3, (x9h) null, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, (cqs0) null, x340Var4, 0, 0, 4088);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                wie1.a((j2i) obj6, (j2i) obj5, (qim0) obj3, (iu30) obj4, (b0k) obj, czo1.p(55));
                return rih1Var;
            case 5:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                tob1 tob1Var = (tob1) obj3;
                m4c m4cVar = fkj0.X;
                q2f1 q2f1Var = (q2f1) obj6;
                iu30 iu30Var2 = (iu30) obj4;
                y7e1 y7e1Var = (y7e1) obj5;
                x340 x340Var6 = x340Var5;
                if (!x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x340Var6.b0();
                    return rih1Var;
                }
                if (!q2f1Var.e) {
                    x340Var6.i0(22999036);
                    String str2 = q2f1Var.a;
                    uwr uwrVar3 = cbx.a;
                    long j4 = cbx.a(x340Var6).b.a;
                    qim0 qim0VarN3 = anm1.N("toolbar_title_text", qim0Var2);
                    boolean zI = x340Var6.i(tob1Var);
                    Object objT3 = x340Var6.T();
                    if (zI || objT3 == m4cVar) {
                        objT3 = new ctd1(tob1Var, (byte) 7);
                        x340Var6.s0(objT3);
                    }
                    uwo1.e(str2, eqr0.B(qim0VarN3, (iu30) objT3), cbx.d(x340Var6).f, j4, (a0e1) null, (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var6, 0, 0, 1776);
                    x340Var6.r(false);
                    return rih1Var;
                }
                x340Var6.i0(20645299);
                Object objT4 = x340Var6.T();
                if (objT4 == m4cVar) {
                    objT4 = pzm.i(x340Var6);
                }
                lz20 lz20Var = (lz20) objT4;
                CharSequence charSequence = y7e1Var.d().d;
                boolean zG3 = x340Var6.g(iu30Var2) | x340Var6.i(y7e1Var);
                Object objT5 = x340Var6.T();
                if (zG3 || objT5 == m4cVar) {
                    objT5 = new s251(iu30Var2, y7e1Var, (lnm) null, (byte) 1);
                    x340Var6.s0(objT5);
                }
                qxd0.t(charSequence, x340Var6, (vu30) objT5);
                qim0 qim0VarN4 = anm1.N("toolbar_search_field", vby0.p(u291.f(qim0Var2, 1.0f), lz20Var));
                uwr uwrVar4 = cbx.a;
                zxx zxxVar = new zxx(cbx.a(x340Var6).b.a, cbx.a(x340Var6).b.a, cbx.a(x340Var6).b.a, cbx.a(x340Var6).b.d, cbx.a(x340Var6).d.b, cbx.a(x340Var6).d.b, cbx.a(x340Var6).b.c, 0L, 896);
                lee1 lee1Var2 = cbx.d(x340Var6).k;
                cvx cvxVar4 = cbx.b(x340Var6).b;
                cvx cvxVar5 = cbx.b(x340Var6).b;
                rwo1.b(y7e1Var, qim0VarN4, (max) null, (String) null, nnj.a, apo.r(40587862, new ey7(y7e1Var, iu30Var2, (byte) 3), x340Var6), false, false, (dk80) null, lee1Var2, (kua0) null, (yta0) null, d6e1.b, (vu30) null, (idn0) null, (uwg) null, (es41) null, new zzq0(12.0f, 8.0f, 12.0f, 8.0f), 0.0f, false, zxxVar, x340Var6, 221184, 0, 912844);
                boolean zI2 = x340Var6.i(lz20Var);
                Object objT6 = x340Var6.T();
                if (zI2 || objT6 == m4cVar) {
                    objT6 = new fx1(lz20Var, (lnm) null, (byte) 13);
                    x340Var6.s0(objT6);
                }
                qxd0.t(rih1Var, x340Var6, (vu30) objT6);
                x340Var6.r(false);
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                ((h5f1) obj6).c(czo1.p(7), (String) obj4, (j2i) obj5, (b0k) obj, (qim0) obj3);
                return rih1Var;
            case 7:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                TooltipTemplate tooltipTemplate = (TooltipTemplate) obj6;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qim0 qim0VarF2 = dug.f(u291.f(qim0Var2, 1.0f), v9p1.C(tooltipTemplate, x340Var8), u5j1Var);
                    if (tooltipTemplate instanceof TooltipTemplate.BaseTooltip) {
                        str = "messaging_tooltip_base_type";
                    } else {
                        if (!(tooltipTemplate instanceof TooltipTemplate.CustomTooltip)) {
                            hhg1.n("Unknown TooltipTemplate type");
                            return null;
                        }
                        str = "messaging_tooltip_custom_type";
                    }
                    ((h5f1) obj5).c(6, str, apo.r(1811657197, new sdb1((aqw) obj4, (e5f1) obj3, (byte) 28), x340Var8), x340Var8, qim0VarF2);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                apo.g((j2i) obj6, (qim0) obj3, (xu30) obj5, (vu30) obj4, (b0k) obj, czo1.p(27655));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                pqo.f((List) obj6, (gw70) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    af5 af5Var = ((itg0) obj6).a;
                    uwr uwrVar5 = cbx.a;
                    uwo1.d(af5Var, ((vex) zex.a.e).m, (qim0) null, (lee1) obj5, (a0e1) null, (iu30) null, 2, false, (djc0) obj4, 0, (qx8) null, (cqs0) obj3, x340Var10, 0, 0, 1716);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 11:
                tlc1 tlc1Var = (tlc1) obj;
                long j5 = ((hjl) obj2).a;
                itg0 itg0Var = (itg0) obj6;
                ArrayList<htg0> arrayList = itg0Var.b;
                iu30 iu30Var3 = (iu30) obj5;
                int iS = zno1.s(q7h.U(arrayList, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (htg0 htg0Var : arrayList) {
                    long j6 = j5;
                    q5t0 q5t0VarH = ((afh0) o7h.V0(tlc1Var.P(htg0Var.a, new j2i(-380145672, new wcf1(htg0Var, b3), true)))).H(hjl.b(j6, 0, 0, 0, 0, 10));
                    linkedHashMap.put(htg0Var.a, new gh80(new d6t0(7, tlc1Var.I(q5t0VarH.a), tlc1Var.I(q5t0VarH.b)), new j2i(-774584711, new xw91(htg0Var, iu30Var3, b2), true)));
                    j5 = j6;
                }
                q5t0 q5t0VarH2 = ((afh0) o7h.V0(tlc1Var.P("description", new j2i(1950040420, new bvd1((Object) itg0Var, obj4, obj3, (Object) mqo1.B(linkedHashMap), (byte) 10), true)))).H(j5);
                return tlc1Var.S(q5t0VarH2.a, q5t0VarH2.b, b7x.a, new oyc1(q5t0VarH2, (byte) 4));
            case 12:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                x340 x340Var12 = x340Var11;
                boolean zY = x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2);
                j06 j06Var = x340Var12.a;
                if (zY) {
                    qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
                    kef1 kef1Var = (kef1) obj6;
                    cvt0 cvt0Var = kef1Var.c;
                    iu30 iu30Var4 = (iu30) obj5;
                    nef1 nef1Var = (nef1) obj4;
                    tob1 tob1Var2 = (tob1) obj3;
                    mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var12, 0);
                    int iHashCode = Long.hashCode(x340Var12.T);
                    xos0 xos0VarM = x340Var12.m();
                    qim0 qim0VarE = zr7.E(x340Var12, qim0VarD);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var12.m0();
                    if (x340Var12.S) {
                        x340Var12.l(n4kVar);
                    } else {
                        x340Var12.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(mbhVarA, x340Var12, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var12, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var12, lljVar3);
                    nko1.F(x340Var12);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var12, lljVar4);
                    if (kef1Var.f) {
                        x340Var12.i0(1957089895);
                        String str3 = kef1Var.a;
                        String str4 = kef1Var.b;
                        boolean zG4 = x340Var12.g(iu30Var4);
                        Object objT7 = x340Var12.T();
                        if (zG4 || objT7 == m4cVar2) {
                            objT7 = new b1c1(iu30Var4, (byte) 20);
                            x340Var12.s0(objT7);
                        }
                        e130.n(str3, str4, (qim0) null, (iu30) objT7, (djc0) null, false, (lee1) null, x340Var12, 0, 116);
                        kk0.s(1.0f, true, x340Var12);
                        if (cvt0Var != null) {
                            x340Var12.i0(1957374041);
                            otw.c((evt0) nef1Var.X.getValue(), cvt0.a(cvt0Var, ((Boolean) tob1Var2.getValue()).booleanValue()), (qim0) null, (ipb1) null, x340Var12, 0, 12);
                            z3 = false;
                            x340Var12.r(false);
                        } else {
                            z3 = false;
                            x340Var12.i0(1957529723);
                            x340Var12.r(false);
                        }
                        x340Var12.r(z3);
                        r15 = z3;
                    } else {
                        r15 = 0;
                        x340Var12.i0(1957539643);
                        x340Var12.r(false);
                    }
                    if (kef1Var.g) {
                        x340Var12.i0(1957630318);
                        jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var12, (int) r15);
                        int iHashCode2 = Long.hashCode(x340Var12.T);
                        xos0 xos0VarM2 = x340Var12.m();
                        qim0 qim0VarE2 = zr7.E(x340Var12, qim0Var2);
                        x340Var12.m0();
                        if (x340Var12.S) {
                            x340Var12.l(n4kVar);
                        } else {
                            x340Var12.v0();
                        }
                        nko1.H(jw31VarA, x340Var12, lljVar);
                        nko1.H(xos0VarM2, x340Var12, lljVar2);
                        x0d.q(iHashCode2, x340Var12, lljVar3, x340Var12);
                        nko1.H(qim0VarE2, x340Var12, lljVar4);
                        lwp lwpVar = nef1Var.d;
                        lik1 lik1Var = nik1.z0;
                        Mode mode = Mode.TOP_STORIES;
                        otw.c(lwpVar.a(lik1Var, false, mode), new fr10(kef1Var.d, (String) null, true, mode, (String) null, false, Error.INVALID_COUNTRY_FIELD_NUMBER), (qim0) null, (ipb1) null, x340Var12, 0, 12);
                        if (cvt0Var != null) {
                            x340Var12.i0(1649098512);
                            boolean zG5 = x340Var12.g(iu30Var4);
                            Object objT8 = x340Var12.T();
                            if (zG5 || objT8 == m4cVar2) {
                                objT8 = new pwc1(iu30Var4, (byte) 29);
                                x340Var12.s0(objT8);
                            }
                            foo1.c(new gbx(z50.c, (Function0) objT8), ldx.c, (qim0) null, (max) null, yla.s(x340Var12), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, qnj.a, x340Var12, 0, 48, 2012);
                            idm idmVar = (idm) nef1Var.Y.getValue();
                            String str5 = cvt0Var.d;
                            Object objT9 = x340Var12.T();
                            if (objT9 == m4cVar2) {
                                objT9 = q9f1.Y;
                                x340Var12.s0(objT9);
                            }
                            otw.c(idmVar, new wcm(str5, (String) null, (String) null, scm.a, (Function0) null, (Function0) objT9, false, (String) null, (String) null, 726), (qim0) null, (ipb1) null, x340Var12, 0, 12);
                            z2 = false;
                            x340Var12.r(false);
                        } else {
                            z2 = false;
                            x340Var12.i0(1650268049);
                            x340Var12.r(false);
                        }
                        z = true;
                        x340Var12.r(true);
                        x340Var12.r(z2);
                    } else {
                        z = true;
                        x340Var12.i0(1959272667);
                        x340Var12.r((boolean) r15);
                    }
                    x340Var12.r(z);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 13:
                llj lljVar5 = y580.Y;
                llj lljVar6 = y580.R0;
                llj lljVar7 = y580.N0;
                llj lljVar8 = y580.O0;
                b0k b0kVar2 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                era eraVar = een.P0;
                qef1 qef1Var = (qef1) obj6;
                Integer num = 0;
                b0k b0kVar3 = (x340) b0kVar2;
                boolean zY2 = b0kVar3.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2);
                j06 j06Var2 = ((x340) b0kVar3).a;
                if (!zY2) {
                    b0kVar3.b0();
                    return rih1Var;
                }
                qim0 qim0VarQ = i1p1.q(u291.f(qim0Var2, 1.0f), er31.b(16.0f));
                u7h u7hVar = qef1Var.d;
                if (u7hVar == null) {
                    b0kVar3.i0(-2097465600);
                    uwr uwrVar6 = cbx.a;
                    long jA = cbx.a(b0kVar3).a.a.a();
                    b0kVar3.r(false);
                    j = jA;
                    i = 0;
                } else {
                    i = 0;
                    b0kVar3.i0(-2097467491);
                    b0kVar3.r(false);
                    j = u7hVar.a;
                }
                qim0 qim0VarF3 = dug.f(qim0VarQ, j, u5j1Var);
                iu30 iu30Var5 = (iu30) obj5;
                j2i j2iVar = (j2i) obj4;
                j2i j2iVar2 = (j2i) obj3;
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, b0kVar3, i);
                int iHashCode3 = Long.hashCode(((x340) b0kVar3).T);
                xos0 xos0VarM3 = b0kVar3.m();
                qim0 qim0VarE3 = zr7.E(b0kVar3, qim0VarF3);
                hzj.A.getClass();
                if (j06Var2 == null) {
                    tgp1.p();
                    throw null;
                }
                b0kVar3.m0();
                if (((x340) b0kVar3).S) {
                    b0kVar3.l(n4kVar);
                } else {
                    b0kVar3.v0();
                }
                nko1.H(mbhVarA2, b0kVar3, lljVar8);
                nko1.H(xos0VarM3, b0kVar3, lljVar7);
                x0d.q(iHashCode3, b0kVar3, lljVar6, b0kVar3);
                nko1.H(qim0VarE3, b0kVar3, lljVar5);
                String str6 = qef1Var.c;
                ArrayList<pef1> arrayList2 = qef1Var.b;
                oef1 oef1Var = qef1Var.a;
                isl islVar = isl.a;
                if (str6 == null) {
                    b0kVar3.i0(-530076740);
                    i2 = 0;
                    b0kVar3.r(false);
                    qim0Var = qim0Var2;
                    b0kVar = b0kVar3;
                } else {
                    b0kVar3.i0(-530076739);
                    qim0Var = qim0Var2;
                    eso1.e(Uri.parse(str6), islVar, d7e.r(1.5f, u291.f(qim0Var, 1.0f), false), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, b0kVar3, 224304, 0, 4032);
                    b0kVar = b0kVar3;
                    i2 = 0;
                    b0kVar.r(false);
                }
                qim0 qim0VarX3 = uyn1.x(qim0Var, 16.0f);
                mbh mbhVarA3 = jbh.a(f36Var, eraVar, b0kVar, i2);
                int iHashCode4 = Long.hashCode(((x340) b0kVar).T);
                xos0 xos0VarM4 = b0kVar.m();
                qim0 qim0VarE4 = zr7.E(b0kVar, qim0VarX3);
                b0kVar.m0();
                if (((x340) b0kVar).S) {
                    b0kVar.l(n4kVar);
                } else {
                    b0kVar.v0();
                }
                nko1.H(mbhVarA3, b0kVar, lljVar8);
                nko1.H(xos0VarM4, b0kVar, lljVar7);
                x0d.q(iHashCode4, b0kVar, lljVar6, b0kVar);
                nko1.H(qim0VarE4, b0kVar, lljVar5);
                fef1 fef1Var = oef1Var.e;
                if (fef1Var.equals(def1.a)) {
                    b0kVar.i0(-467936455);
                    mmr0Var = new mmr0(xrx.c, cwl1.o0(b0kVar, 2131963304));
                    r16 = 0;
                    b0kVar.r(false);
                } else if (fef1Var.equals(cef1.a)) {
                    b0kVar.i0(-467932038);
                    mmr0Var = new mmr0(hpx.c, cwl1.o0(b0kVar, 2131963303));
                    r16 = 0;
                    b0kVar.r(false);
                } else if (fef1Var.equals(bef1.a)) {
                    b0kVar.i0(-467927338);
                    mmr0Var = new mmr0(dmx.c, cwl1.o0(b0kVar, 2131963302));
                    r16 = 0;
                    b0kVar.r(false);
                } else if (fef1Var.equals(eef1.a)) {
                    b0kVar.i0(-467922050);
                    mmr0Var = new mmr0(ntx.c, cwl1.n0(2131963305, new Object[]{"X"}, b0kVar));
                    r16 = 0;
                    b0kVar.r(false);
                } else {
                    if (!fef1Var.equals(aef1.a)) {
                        throw p3d1.k(b0kVar, -467938553, false);
                    }
                    b0kVar.i0(-467917578);
                    mmr0Var = new mmr0(jox.c, cwl1.o0(b0kVar, 2131963301));
                    r16 = 0;
                    b0kVar.r(false);
                }
                fra fraVar = een.N0;
                uwr uwrVar7 = cbx.a;
                cvx cvxVar6 = cbx.b(b0kVar).b;
                jw31 jw31VarA2 = ew31.a(new d36(4.0f, true, new um5((boolean) r16)), fraVar, b0kVar, (int) r16);
                mmr0 mmr0Var2 = mmr0Var;
                int iHashCode5 = Long.hashCode(((x340) b0kVar).T);
                xos0 xos0VarM5 = b0kVar.m();
                qim0 qim0VarE5 = zr7.E(b0kVar, qim0Var);
                b0kVar.m0();
                if (((x340) b0kVar).S) {
                    b0kVar.l(n4kVar);
                } else {
                    b0kVar.v0();
                }
                nko1.H(jw31VarA2, b0kVar, lljVar8);
                nko1.H(xos0VarM5, b0kVar, lljVar7);
                x0d.q(iHashCode5, b0kVar, lljVar6, b0kVar);
                nko1.H(qim0VarE5, b0kVar, lljVar5);
                hux huxVar = (hux) mmr0Var2.a;
                zov0 zov0Var = cbx.b(b0kVar).g;
                b0k b0kVar4 = b0kVar;
                w0h1.a(huxVar, islVar, u291.r(qim0Var, 12.0f), u7h.b(cbx.a(b0kVar).b.a, 0.7f, 0.0f, 0.0f, 0.0f, 14), 0L, false, b0kVar4, 56, 48);
                uwo1.e((String) mmr0Var2.b, (qim0) null, cbx.d(b0kVar4).j, u7h.b(cbx.a(b0kVar4).b.a, 0.7f, 0.0f, 0.0f, 0.0f, 14), (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar4, 0, 0, 1714);
                b0kVar4.r(true);
                op71.g(b0kVar4, u291.h(qim0Var, 8.0f));
                e130.n("", oef1Var.c, (qim0) null, iu30Var5, bjc0.a, false, cbx.d(b0kVar4).g, b0kVar4, 196614, 4);
                if (!arrayList2.isEmpty() || qef1Var.e) {
                    v8i0.i(16.0f, -1619331734, b0kVar4, b0kVar4, qim0Var);
                    if (arrayList2.isEmpty()) {
                        b0kVar4.i0(-1619259473);
                        qim0 qim0VarN5 = anm1.N("top_story_feed_card_row_loading", qim0Var);
                        gfh0 gfh0VarC = t1c.c(een.d, false);
                        int iHashCode6 = Long.hashCode(((x340) b0kVar4).T);
                        xos0 xos0VarM6 = b0kVar4.m();
                        qim0 qim0VarE6 = zr7.E(b0kVar4, qim0VarN5);
                        b0kVar4.m0();
                        if (((x340) b0kVar4).S) {
                            b0kVar4.l(n4kVar);
                        } else {
                            b0kVar4.v0();
                        }
                        nko1.H(gfh0VarC, b0kVar4, lljVar8);
                        nko1.H(xos0VarM6, b0kVar4, lljVar7);
                        x0d.q(iHashCode6, b0kVar4, lljVar6, b0kVar4);
                        nko1.H(qim0VarE6, b0kVar4, lljVar5);
                        z4 = false;
                        odf1.a(b0kVar4, 0);
                        b0kVar4.r(true);
                        b0kVar4.r(false);
                    } else {
                        b0kVar4.i0(-1619147532);
                        for (pef1 pef1Var : arrayList2) {
                            b0kVar4.f0(1498171832, b0kVar4.K(Integer.valueOf(pef1Var.a), pef1Var.b));
                            j2iVar.invoke(pef1Var, b0kVar4, num);
                            b0kVar4.r(false);
                        }
                        z4 = false;
                        b0kVar4.r(false);
                    }
                    b0kVar4.r(z4);
                } else {
                    b0kVar4.i0(-1619039590);
                    b0kVar4.r(false);
                    num = num;
                }
                op71.g(b0kVar4, u291.h(qim0Var, 8.0f));
                String str7 = oef1Var.f;
                if (str7 == null || ihc1.y0(str7)) {
                    b0kVar4.i0(-1618915931);
                    qim0 qim0VarH = u291.h(qim0Var, 32.0f);
                    mbh mbhVarA4 = jbh.a(f36Var, eraVar, b0kVar4, 0);
                    int iHashCode7 = Long.hashCode(((x340) b0kVar4).T);
                    xos0 xos0VarM7 = b0kVar4.m();
                    qim0 qim0VarE7 = zr7.E(b0kVar4, qim0VarH);
                    hzj.A.getClass();
                    b0kVar4.m0();
                    if (((x340) b0kVar4).S) {
                        b0kVar4.l(n4kVar);
                    } else {
                        b0kVar4.v0();
                    }
                    nko1.H(mbhVarA4, b0kVar4, lljVar8);
                    nko1.H(xos0VarM7, b0kVar4, lljVar7);
                    x0d.q(iHashCode7, b0kVar4, lljVar6, b0kVar4);
                    nko1.H(qim0VarE7, b0kVar4, lljVar5);
                    z5 = true;
                    ktd.s(j2iVar2, b0kVar4, num, true, false);
                } else {
                    b0kVar4.i0(-1618781794);
                    qim0 qim0VarF4 = u291.f(qim0Var, 1.0f);
                    uwr uwrVar8 = cbx.a;
                    avw0 avw0Var = cbx.b(b0kVar4).c;
                    t1c.a(anm1.N("top_story_reasoning_divider", dug.f(u291.h(qim0VarF4, 1.0f), ((vex) zex.a.e).i, u5j1Var)), b0kVar4, 0);
                    cvx cvxVar7 = cbx.b(b0kVar4).b;
                    op71.g(b0kVar4, u291.h(qim0Var, 12.0f));
                    vzq0 vzq0Var = yla.s(b0kVar4).a;
                    flb0 flb0Var = (flb0) b0kVar4.k(t4k.n);
                    float f = zjy.p(32.0f, new p3v(vzq0Var.c(flb0Var) + vzq0Var.b(flb0Var) + 16.0f)).a;
                    cvx cvxVar8 = cbx.b(b0kVar4).b;
                    qim0 qim0VarZ = uyn1.z(0.0f, 4.0f, 1, qim0Var);
                    cvx cvxVar9 = cbx.b(b0kVar4).b;
                    jw31 jw31VarA3 = ew31.a(new d36(12.0f, true, new um5(false)), een.Z, b0kVar4, 0);
                    int iHashCode8 = Long.hashCode(((x340) b0kVar4).T);
                    xos0 xos0VarM8 = b0kVar4.m();
                    qim0 qim0VarE8 = zr7.E(b0kVar4, qim0VarZ);
                    hzj.A.getClass();
                    b0kVar4.m0();
                    if (((x340) b0kVar4).S) {
                        b0kVar4.l(n4kVar);
                    } else {
                        b0kVar4.v0();
                    }
                    nko1.H(jw31VarA3, b0kVar4, lljVar8);
                    nko1.H(xos0VarM8, b0kVar4, lljVar7);
                    x0d.q(iHashCode8, b0kVar4, lljVar6, b0kVar4);
                    up30.h(0, str7, b0kVar4, kk0.q(b0kVar4, qim0VarE8, lljVar5, 1.0f, true));
                    qim0 qim0VarH2 = u291.h(u291.v(qim0Var, f * 2.0f), 32.0f);
                    gfh0 gfh0VarC2 = t1c.c(een.f, false);
                    int iHashCode9 = Long.hashCode(((x340) b0kVar4).T);
                    xos0 xos0VarM9 = b0kVar4.m();
                    qim0 qim0VarE9 = zr7.E(b0kVar4, qim0VarH2);
                    b0kVar4.m0();
                    if (((x340) b0kVar4).S) {
                        b0kVar4.l(n4kVar);
                    } else {
                        b0kVar4.v0();
                    }
                    nko1.H(gfh0VarC2, b0kVar4, lljVar8);
                    nko1.H(xos0VarM9, b0kVar4, lljVar7);
                    x0d.q(iHashCode9, b0kVar4, lljVar6, b0kVar4);
                    nko1.H(qim0VarE9, b0kVar4, lljVar5);
                    ktd.s(j2iVar2, b0kVar4, num, true, true);
                    b0kVar4.r(false);
                    z5 = true;
                }
                b0kVar4.r(z5);
                b0kVar4.r(z5);
                return rih1Var;
            case 14:
                qef1 qef1Var2 = (qef1) obj6;
                x340 x340Var13 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                uef1 uef1Var = (uef1) obj3;
                iu30 iu30Var6 = (iu30) obj5;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zG6 = x340Var14.g(iu30Var6);
                    Object objT10 = x340Var14.T();
                    if (zG6 || objT10 == fkj0.X) {
                        objT10 = new b1c1(iu30Var6, b2);
                        x340Var14.s0(objT10);
                    }
                    up30.g(qef1Var2, (iu30) objT10, apo.r(134417660, new xw91((tob1) obj4, uef1Var, (byte) 22), x340Var14), apo.r(-1552751711, new xaf1(uef1Var, qef1Var2, b3), x340Var14), null, x340Var14, 3456);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                exd0.j((xjf1) obj6, (Uri) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                qxd0.d((cjc0) obj6, (af5) obj5, (af5) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                ((tva1) obj6).i((String) obj5, (String) obj4, (String) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                ((c681) obj6).r((String) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                return a(obj, obj2);
            case 20:
                ((Number) obj2).intValue();
                upo1.q((Function0) obj6, (iu30) obj5, (w9i1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
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
                x340 x340Var15 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1j1 x1j1Var = (x1j1) obj6;
                    x1j1Var.getClass();
                    dzo1.f(x1j1Var, (iu30) obj5, ((z1j1) obj4).e, uyn1.w(u291.d(qim0Var2, 1.0f), (vzq0) obj3), x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bvd1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bvd1(Object obj, cv30 cv30Var, qim0 qim0Var, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = cv30Var;
        this.b = qim0Var;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bvd1(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvd1(t2f1 t2f1Var, whi1 whi1Var, iu30 iu30Var, dlg1 dlg1Var) {
        super(2);
        this.a = (byte) 22;
        this.c = t2f1Var;
        this.d = whi1Var;
        this.e = iu30Var;
        this.b = dlg1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bvd1(qef1 qef1Var, iu30 iu30Var, j2i j2iVar, j2i j2iVar2) {
        super(2);
        this.a = (byte) 13;
        this.c = qef1Var;
        this.d = iu30Var;
        this.e = j2iVar;
        this.b = j2iVar2;
    }
}
