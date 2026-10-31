package p;

import android.content.Context;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.home.evopage.structureapi.a;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.model.PlayOrigin;
import com.spotify.scrollsita.v1.Section;
import j$.time.format.DateTimeFormatter;
import j$.time.format.FormatStyle;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tc11 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc11(String str, ven0 ven0Var) {
        super(2);
        this.a = (byte) 17;
        this.c = str;
        this.b = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwo1.e((String) obj4, (qim0) null, ((lex) obj3).e, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1722);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj4;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    dd11 dd11Var = (dd11) obj3;
                    boolean zG = x340Var4.g(iu30Var);
                    Object objT = x340Var4.T();
                    if (zG || objT == fkj0.X) {
                        objT = new iuy0(iu30Var, (byte) 5);
                        x340Var4.s0(objT);
                    }
                    f2p1.i(dd11Var, (vu30) objT, (qim0) null, (Set) null, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    xfo1.c((k0e) obj3, (umf0) ((nm1) obj4).g, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    otw.c((bm11) obj3, new yl11((String) obj4), (qim0) null, (ipb1) null, x340Var8, 0, 12);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    otw.c(new xho(((en11) obj3).b), new uho(((an11) obj4).a, null, null, kho.a, null, null, 246), (qim0) null, (ipb1) null, x340Var10, 8, 12);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                tob1 tob1Var = (tob1) obj4;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    vnr0 vnr0Var = (vnr0) ((ooh0) ((ji6) obj3).b).f.invoke(x340Var12, 0);
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    boolean zG2 = x340Var12.g(tob1Var);
                    Object objT2 = x340Var12.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new lws0(tob1Var, (byte) 16);
                        x340Var12.s0(objT2);
                    }
                    qgo1.f(vnr0Var, i541.C(qim0VarF, (iu30) objT2), new a0e1(3), 0, false, (iu30) null, x340Var12, 8, 56);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var14).g;
                    qim0 qim0VarN = anm1.N("label-container", u291.j(32.0f, 0.0f, 2, nim0Var));
                    long j = cbx.a(x340Var14).a.c;
                    cua cuaVar = cbx.b(x340Var14).f;
                    qim0 qim0VarF2 = dug.f(qim0VarN, j, er31.b(4.0f));
                    oo11 oo11Var = (oo11) obj3;
                    Context context = (Context) obj4;
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var14, 0);
                    int iHashCode = Long.hashCode(x340Var14.T);
                    xos0 xos0VarM = x340Var14.m();
                    qim0 qim0VarE = zr7.E(x340Var14, qim0VarF2);
                    hzj.A.getClass();
                    if (x340Var14.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var14.m0();
                    if (x340Var14.S) {
                        x340Var14.l(n4kVar);
                    } else {
                        x340Var14.v0();
                    }
                    nko1.H(jw31VarA, x340Var14, y580.O0);
                    nko1.H(xos0VarM, x340Var14, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var14, y580.R0);
                    nko1.F(x340Var14);
                    nko1.H(qim0VarE, x340Var14, y580.Y);
                    xrx xrxVar = xrx.c;
                    jsl jslVar = new jsl(cwl1.o0(x340Var14, 2131954619));
                    qim0 qim0VarN2 = anm1.N("calendar-icon", nim0Var);
                    zov0 zov0Var2 = cbx.b(x340Var14).g;
                    qim0 qim0VarH = u291.h(qim0VarN2, 16.0f);
                    cvx cvxVar = cbx.b(x340Var14).b;
                    cvx cvxVar2 = cbx.b(x340Var14).b;
                    w0h1.a(xrxVar, jslVar, uyn1.B(qim0VarH, 8.0f, 0.0f, 6.0f, 0.0f, 10), 0L, 0L, false, x340Var14, xrx.d, 56);
                    qim0 qim0VarN3 = anm1.N("label-text", nim0Var);
                    cvx cvxVar3 = cbx.b(x340Var14).b;
                    uwo1.e(a4p1.j(oo11Var.a, oo11Var.b.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)), context, false), uyn1.B(qim0VarN3, 0.0f, 0.0f, 8.0f, 0.0f, 11), lee1.a(cbx.d(x340Var14).k, cbx.a(x340Var14).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var14, 0, 0, 1720);
                    x340Var14.r(true);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                t3p1.k((oo11) obj3, (qim0) obj4, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 8:
                hp11 hp11Var = (hp11) obj3;
                d5g1 d5g1Var = hp11Var.b;
                d0r d0rVar = hp11Var.k;
                y441 y441Var = hp11Var.c;
                q381 q381Var = (q381) obj4;
                String str = q381Var.a;
                huz huzVar = new huz(vmd1.a(q381Var.c), (byte) 10);
                huz huzVar2 = new huz(w7x.a, (byte) 10);
                b0d0 b0d0Var = (b0d0) y441Var.a;
                iac0 iac0Var = (iac0) y441Var.d;
                ruz ruzVar = (ruz) y441Var.b;
                EsPlayOrigin.PlayOrigin playOriginA = tot0.a((PlayOrigin) y441Var.c);
                b7x b7xVar = b7x.a;
                return new jpg0(new i5g1((y1c1) obj, d0rVar, hp11Var.g, d5g1Var.c, d5g1Var.b, d5g1Var.a, hp11Var.h, d5g1Var.d.r(new ult0(b0d0Var.b(str, huzVar2, iac0Var, ruzVar, huzVar, playOriginA, new huz(b7xVar, (byte) 10), new huz(b7xVar, (byte) 10)))), d5g1Var.e, d5g1Var.f, d5g1Var.g), hm11.V0);
            case 9:
                hp11 hp11Var2 = (hp11) obj3;
                w6e0 w6e0Var = hp11Var2.j;
                xe01 xe01Var = (xe01) w6e0Var.c;
                nap napVar = (nap) hp11Var2.e.a.c;
                return new jpg0(new ug3(new mhg0(hm11.X0, (byte) 29), Collections.singletonMap(rih1Var, f46.S0(new yp21[]{new yp21(w281.class), new yp21(tlr0.class)})), cso1.y(new u63(napVar.j, napVar.o, napVar.E, xe01Var, (String) obj4), xe01Var, new p9y0((String) obj4, (byte) 13)), w6e0Var), hm11.Y0);
            case 10:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    otw.c(((ds11) obj3).a, (uv11) obj4, (qim0) null, (ipb1) null, x340Var16, 0, 12);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 11:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    qim0 qim0VarF3 = u291.f(pqo.h(nim0Var, !u890.j(((jmb1) obj3).i, j6u.a)), 1.0f);
                    vu30 vu30Var = (vu30) obj4;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var18.T);
                    xos0 xos0VarM2 = x340Var18.m();
                    qim0 qim0VarE2 = zr7.E(x340Var18, qim0VarF3);
                    hzj.A.getClass();
                    if (x340Var18.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var18.m0();
                    if (x340Var18.S) {
                        x340Var18.l(n4kVar);
                    } else {
                        x340Var18.v0();
                    }
                    nko1.H(gfh0VarC, x340Var18, y580.O0);
                    nko1.H(xos0VarM2, x340Var18, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var18, y580.R0);
                    nko1.F(x340Var18);
                    nko1.H(qim0VarE2, x340Var18, y580.Y);
                    us71.j(0, vu30Var, x340Var18, true);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            case 12:
                x340 x340Var19 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    jmb1 jmb1Var = (jmb1) obj3;
                    u4p1.A(jmb1Var.b.a, jmb1Var.f, jmb1Var.i, (uu11) obj4, x340Var20, 0);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                u4p1.J((rrt0) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                r6p1.j((guk1) obj3, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                ((sh21) obj3).f((qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                ((kk21) obj3).n1((xtj) obj4, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 17:
                x340 x340Var21 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    w2g0.c(u291.f(nim0Var, 1.0f), een.X, apo.r(1991429656, new xt3((String) obj4, (ven0) obj3, (byte) 2), x340Var22), x340Var22, 3072, 4);
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                z47.o((ox3) obj3, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                x340 x340Var23 = (b0k) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                r531 r531Var = (r531) obj4;
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    yc30 yc30Var = ((y531) obj3).a;
                    e631 e631Var = r531Var.g;
                    boolean zI = x340Var24.i(e631Var);
                    Object objT3 = x340Var24.T();
                    if (zI || objT3 == m4cVar) {
                        ggx0 ggx0Var = new ggx0(0, e631Var, e631.class, "openStore", "openStore()V", 0, (byte) 17);
                        x340Var24.s0(ggx0Var);
                        objT3 = ggx0Var;
                    }
                    Function0 function0 = (Function0) objT3;
                    lzn0 lzn0Var = r531Var.f;
                    boolean zI2 = x340Var24.i(lzn0Var);
                    Object objT4 = x340Var24.T();
                    if (zI2 || objT4 == m4cVar) {
                        ggx0 ggx0Var2 = new ggx0(0, lzn0Var, lzn0.class, "closeCurrentPage", "closeCurrentPage()V", 0, (byte) 18);
                        x340Var24.s0(ggx0Var2);
                        objT4 = ggx0Var2;
                    }
                    x9p1.b(yc30Var, function0, (Function0) objT4, (qim0) null, x340Var24, 0);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 20:
                bf31 bf31Var = (bf31) obj3;
                xk00 xk00Var = (xk00) obj4;
                return new jpg0(new ye31(new nfx(bf31Var.a.b, bf31Var.b, (byte) 6), bf31Var.c, new af31(2, xk00Var.d, a.class, "dismissSection", "dismissSection(Ljava/lang/String;Lcom/spotify/home/evopage/structureapi/DismissedEntity$Type;)V", 0), xk00Var.e, bf31Var.d), oe31.e);
            case 21:
                ((Number) obj2).intValue();
                brl.h((gg31) obj3, (ig31) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                ((zj31) obj3).b((jj31) obj4, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 23:
                x340 x340Var25 = (b0k) obj;
                int iIntValue13 = ((Number) obj2).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    smp0 smp0Var = (smp0) obj3;
                    gu31 gu31Var = (gu31) obj4;
                    otw.c(new tm((ynb0) smp0Var.c, (ynb0) smp0Var.d, new udm(gu31Var.a, gu31Var.b, gu31Var.c)), new nem(), (qim0) null, (ipb1) null, x340Var26, 0, 12);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 24:
                x340 x340Var27 = (b0k) obj;
                int iIntValue14 = ((Number) obj2).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    tz31 tz31Var = (tz31) ((mz31) obj3).a.getValue();
                    n041 n041Var = tz31Var != null ? tz31Var.b : n041.d;
                    wz31 wz31Var = tz31Var != null ? tz31Var.a : null;
                    int iOrdinal = ((nz31) obj4).b.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        if (wz31Var == null) {
                            x340Var28.i0(-93936431);
                            fj30.c(n041Var, qim0VarD, x340Var28, 48);
                            x340Var28.r(false);
                        } else {
                            x340Var28.i0(-93934731);
                            fj30.d(wz31Var, n041Var, qim0VarD, x340Var28, 384);
                            x340Var28.r(false);
                        }
                    } else if (wz31Var == null) {
                        x340Var28.i0(-93941771);
                        gto1.b(n041Var, qim0VarD, x340Var28, 48);
                        x340Var28.r(false);
                    } else {
                        x340Var28.i0(-93939943);
                        gto1.c(wz31Var, n041Var, qim0VarD, x340Var28, 384);
                        x340Var28.r(false);
                    }
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 25:
                x340 x340Var29 = (b0k) obj;
                int iIntValue15 = ((Number) obj2).intValue();
                x340 x340Var30 = x340Var29;
                if (x340Var30.Y(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    cua cuaVar2 = cbx.b(x340Var30).f;
                    qim0 qim0VarF4 = dug.f(i1p1.q(qim0VarD2, er31.b(16.0f)), ((n041) obj3).a, d4o1.a);
                    j2i j2iVar = (j2i) obj4;
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode3 = Long.hashCode(x340Var30.T);
                    xos0 xos0VarM3 = x340Var30.m();
                    qim0 qim0VarE3 = zr7.E(x340Var30, qim0VarF4);
                    hzj.A.getClass();
                    if (x340Var30.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var30.m0();
                    if (x340Var30.S) {
                        x340Var30.l(n4kVar);
                    } else {
                        x340Var30.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var30, y580.O0);
                    nko1.H(xos0VarM3, x340Var30, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var30, y580.R0);
                    nko1.F(x340Var30);
                    nko1.H(qim0VarE3, x340Var30, y580.Y);
                    ywx0.l(6, j2iVar, h2c.a, x340Var30, true);
                } else {
                    x340Var30.b0();
                }
                return rih1Var;
            case 26:
                return (mr20) ((n891) obj3).invoke(obj, obj2, ((ym41) obj4).a);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((Number) obj2).intValue();
                hqn1.i((xtb0) obj3, (iu30) obj4, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                qqn1.c((List) obj3, (xtb0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                irn1.z((nue1) obj3, (sm51) obj4, nim0Var, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tc11(Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tc11(Object obj, Object obj2, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc11(oo11 oo11Var, Context context) {
        super(2);
        this.a = (byte) 6;
        this.b = oo11Var;
        this.c = context;
    }
}
