package p;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.geometry.Offset;
import com.spotify.player.esperanto.proto.EsPlayOrigin;
import com.spotify.player.model.PlayOrigin;
import com.spotify.scrollsita.v1.Section;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class juc1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juc1(m5a m5aVar, qim0 qim0Var, j2i j2iVar) {
        super(2);
        this.a = (byte) 8;
        this.d = m5aVar;
        this.c = qim0Var;
        this.b = j2iVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        r3r r3rVar;
        av11 zu11Var;
        boolean z;
        long jE;
        f371 f371Var;
        boolean z2;
        byte b = this.a;
        byte b2 = 6;
        n4k n4kVar = hmb0.t1;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                bro1.i((bxc1) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                qro1.k((iys0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                eso1.l((String) obj5, (qxc1) obj4, (qim0) obj3, (b0k) obj, czo1.p(65));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                axo1.e((n8d1) obj5, (qim0) obj3, (j2i) obj4, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 4:
                d281 d281Var = (d281) obj3;
                kpc kpcVar = (kpc) obj;
                y1c1 y1c1Var = (y1c1) obj2;
                String str = (String) obj4;
                omd1 omd1Var = (omd1) obj5;
                boolean z3 = omd1Var.A;
                boolean z4 = omd1Var.J;
                boolean z5 = !z4;
                Context context = omd1Var.a;
                String string = context.getString(2131960182);
                ro30 ro30Var = omd1Var.P;
                d0r d0rVar = omd1Var.h;
                jf4 jf4Var = ((u9b) ro30Var.c).a;
                if (jf4Var.v() && jf4Var.j()) {
                    uny unyVar = (uny) ro30Var.b;
                    r3rVar = new r3r(new xzq(new qlb(d0rVar, new yxb0((xmu0) unyVar.b, (jab) unyVar.c, new c4z(2, (eg40) unyVar.d, eg40.class, "recreateGeneration", "recreateGeneration(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 0)), wc40.a), t840.b1), (vu30) null, 6);
                } else {
                    r3rVar = null;
                }
                xoc xocVar = z3 ? new xoc(context.getString(2131961585)) : null;
                if (z4) {
                    cv11 uf0Var = z3 ? new uf0(context) : null;
                    yzu yzuVar = omd1Var.L;
                    y441 y441Var = omd1Var.E;
                    w2c1 w2c1Var = (w2c1) y1c1Var;
                    mr20 mr20VarU = rqt0.u(new pzs(w2c1Var.U(pb31.class), d281Var, (byte) 24));
                    mr20 mr20VarU2 = rqt0.u(new p90(w2c1Var.U(pb31.class), (byte) 5));
                    b0d0 b0d0Var = (b0d0) y441Var.a;
                    iac0 iac0Var = (iac0) y441Var.d;
                    ruz ruzVar = (ruz) y441Var.b;
                    EsPlayOrigin.PlayOrigin playOriginA = tot0.a((PlayOrigin) y441Var.c);
                    b7x b7xVar = b7x.a;
                    k0d0 k0d0VarB = b0d0Var.b(str, mr20VarU2, iac0Var, ruzVar, mr20VarU, playOriginA, new huz(b7xVar, (byte) 10), new huz(b7xVar, (byte) 10));
                    lik1 lik1Var = omd1Var.M;
                    boolean z6 = omd1Var.K;
                    bhh1 bhh1Var = igu.b;
                    yzu yzuVar2 = (yzu) yzuVar.a;
                    xzq xzqVar = new xzq(new hho(bhh1Var, d0rVar), i7z.R0);
                    xzq xzqVar2 = new xzq(t1p.b((t1p) yzuVar2.b, d0rVar, bhh1Var, 1), i7z.S0);
                    s1p s1pVar = (s1p) yzuVar2.a;
                    fns fnsVar = igu.a;
                    zu11Var = new yu11(new ls11(new ds11(xzqVar), new ds11(xzqVar2), new ds11(new xzq(s1pVar.a(fnsVar, d0rVar), i7z.U0)), new ds11(new xzq(((d2q) yzuVar2.c).a(fnsVar, d0rVar), new va8(lik1Var, oxx.T0, (byte) 1))), new hvy(new xzq(((zwp) yzuVar2.d).a(d0rVar, new ult0(k0d0VarB)), i7z.T0), (byte) 1), (iu30) null, (qrk) null, (iu30) null, (iu30) null, ((pep) yzuVar.b).a(oxx.S0, k0d0VarB, lik1Var), (c9c) yzuVar.d, 1, new o27(1, 2, (l1d) null), (gye1) null, (ppc1) null, qb2.a, (rru) null, false, w3p1.o(new l4r(pwc0.d, 2, b4r.b, new j4r(b4r.f), b4r.d), b4r.h), x3p1.o(), (o3r) null, (o3r) null, n39.a((n39) yzuVar.c, z3, 11), (o3r) null, uf0Var, z6 ? new y5z() : null, (bnw0) null, new bt11(true), 0, (o3r) null, -442834464, 503));
                } else {
                    zu11Var = new zu11(new cmd1((Object) omd1Var, (Object) y1c1Var, (byte) 0));
                }
                kpc.c(kpcVar, string, r3rVar, z5, xocVar, (t6) null, zu11Var, 64);
                kpc.e(kpcVar, context.getString(2131960164), new gmd1(omd1Var, str, y1c1Var, d281Var), 6);
                kpcVar.d(2, context.getString(2131960195), new cmd1((Object) omd1Var, (Object) str, (byte) 2), true);
                if (omd1Var.O) {
                    kpc.e(kpcVar, context.getString(2131954162), kmd1.X, 6);
                }
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                cvd1.e((sud1) obj5, (xsq) obj4, (d0r) obj3, nim0.a, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                vvd1.d((c380) obj5, (qvd1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                lvc1 lvc1Var = (lvc1) obj3;
                iu30 iu30Var = (iu30) obj4;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    shm0 shm0Var = (shm0) obj5;
                    boolean z7 = shm0Var.d;
                    boolean z8 = shm0Var.c;
                    boolean zG = x340Var2.g(iu30Var) | x340Var2.i(lvc1Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        objT = new k7a1((Object) iu30Var, (Object) lvc1Var, (byte) 25);
                        x340Var2.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    boolean zI = x340Var2.i(lvc1Var) | x340Var2.g(iu30Var);
                    Object objT2 = x340Var2.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new cmd1(lvc1Var, iu30Var, b2);
                        x340Var2.s0(objT2);
                    }
                    o1p1.d(z7, z8, function0, (iu30) objT2, (qim0) null, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 8:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                j5a j5aVar = (m5a) obj5;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (j5aVar instanceof j5a) {
                        x340Var4.i0(-850313774);
                        z = false;
                        x340Var4.r(false);
                        jE = z4p1.e(j5aVar.a);
                    } else {
                        z = false;
                        x340Var4.i0(-850311494);
                        uwr uwrVar = cbx.a;
                        jE = cbx.a(x340Var4).a.c;
                        x340Var4.r(false);
                    }
                    qim0 qim0VarI = zr7.i(dug.f((qim0) obj3, jE, d4o1.a), o40.d1);
                    j2i j2iVar = (j2i) obj4;
                    gfh0 gfh0VarC = t1c.c(een.d, z);
                    int iHashCode = Long.hashCode(x340Var4.T);
                    xos0 xos0VarM = x340Var4.m();
                    qim0 qim0VarE = zr7.E(x340Var4, qim0VarI);
                    hzj.A.getClass();
                    if (x340Var4.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var4.m0();
                    if (x340Var4.S) {
                        x340Var4.l(n4kVar);
                    } else {
                        x340Var4.v0();
                    }
                    nko1.H(gfh0VarC, x340Var4, y580.O0);
                    nko1.H(xos0VarM, x340Var4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
                    nko1.F(x340Var4);
                    nko1.H(qim0VarE, x340Var4, y580.Y);
                    dv20.l(0, j2iVar, x340Var4, true);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                b2p1.p((gyd1) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                hav0 hav0Var = (hav0) obj;
                long j = ((Offset) obj2).a;
                y9e1 y9e1Var = (y9e1) obj5;
                if (y9e1Var != null) {
                    cde1 cde1Var = (cde1) obj4;
                    String str2 = (String) obj3;
                    int iG = y9e1Var.b.g(hav0Var.c);
                    int i = cde1Var.c;
                    if (iG <= i) {
                        cde1Var.f(o6p1.q(iG, str2));
                        cde1Var.e(cde1Var.d);
                    } else if (iG >= cde1Var.d) {
                        cde1Var.f(i);
                        cde1Var.e(o6p1.p(iG, str2));
                    } else {
                        cde1Var.f(i);
                        cde1Var.e(cde1Var.d);
                    }
                    hav0Var.a();
                }
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                xa4.h((tse1) obj5, (pre1) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String strO0 = cwl1.o0(x340Var6, ((t2f1) obj5).c);
                    n2f1 n2f1Var = (p2f1) obj4;
                    if (n2f1Var instanceof n2f1) {
                        f371Var = n2f1Var.a;
                    } else {
                        if (!n2f1Var.equals(m2f1.a)) {
                            eg.o();
                            return null;
                        }
                        f371Var = d371.a;
                    }
                    f371 f371Var2 = f371Var;
                    boolean zG2 = x340Var6.g(iu30Var2);
                    Object objT3 = x340Var6.T();
                    if (zG2 || objT3 == m4cVar2) {
                        objT3 = new pwc1(iu30Var2, (byte) 27);
                        x340Var6.s0(objT3);
                    }
                    Function0 function1 = (Function0) objT3;
                    boolean zG3 = x340Var6.g(iu30Var2);
                    Object objT4 = x340Var6.T();
                    if (zG3 || objT4 == m4cVar2) {
                        objT4 = new pwc1(iu30Var2, (byte) 28);
                        x340Var6.s0(objT4);
                    }
                    f3o1.e(strO0, f371Var2, function1, (Function0) objT4, (qim0) null, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                nln.h((q8f1) obj5, (Integer) obj4, (qim0) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                pqo.b((y8f1) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                thd0 thd0Var = (thd0) obj5;
                ven0 ven0Var = (ven0) obj4;
                x340 x340Var8 = x340Var7;
                boolean zY = x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2);
                j06 j06Var = x340Var8.a;
                if (zY) {
                    c380 c380Var = (c380) thd0Var.d;
                    rfv0 rfv0Var = (rfv0) ven0Var.getValue();
                    Object objT5 = x340Var8.T();
                    if (objT5 == fkj0.X) {
                        objT5 = new ry71(ven0Var, (byte) 24);
                        x340Var8.s0(objT5);
                    }
                    iu30 iu30Var3 = (iu30) objT5;
                    uwr uwrVar2 = cbx.a;
                    oon1.a(c380Var, rfv0Var, iu30Var3, cbx.d(x340Var8).c, cbx.d(x340Var8).b, (qim0) null, x340Var8, 384);
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    rk41 rk41Var = (rk41) obj3;
                    gfh0 gfh0VarC2 = t1c.c(een.h, false);
                    int iHashCode2 = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM2 = x340Var8.m();
                    qim0 qim0VarE2 = zr7.E(x340Var8, qim0VarD);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(n4kVar);
                    } else {
                        x340Var8.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(gfh0VarC2, x340Var8, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM2, x340Var8, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var8, lljVar3);
                    nko1.F(x340Var8);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE2, x340Var8, lljVar4);
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    era eraVar = een.Q0;
                    mbh mbhVarA = jbh.a(h36.e, eraVar, x340Var8, 54);
                    int iHashCode3 = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM3 = x340Var8.m();
                    qim0 qim0VarE3 = zr7.E(x340Var8, qim0VarF);
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(n4kVar);
                    } else {
                        x340Var8.v0();
                    }
                    nko1.H(mbhVarA, x340Var8, lljVar);
                    nko1.H(xos0VarM3, x340Var8, lljVar2);
                    x0d.q(iHashCode3, x340Var8, lljVar3, x340Var8);
                    nko1.H(qim0VarE3, x340Var8, lljVar4);
                    op71.g(x340Var8, u291.c(nim0Var, 0.13f));
                    vaf1 vaf1Var = (vaf1) thd0Var.c;
                    ArrayList arrayList = vaf1Var.b;
                    vnr0 vnr0Var = (vnr0) vaf1Var.a.invoke(x340Var8, 0);
                    boolean z9 = rk41Var.a;
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    pbh pbhVar = pbh.a;
                    y2o1.e(vnr0Var, z9, thd0Var.b, pbhVar.c(eraVar, qim0VarF2), 0, x340Var8, 8, 16);
                    op71.g(x340Var8, u291.h(nim0Var, 32.0f));
                    qim0 qim0VarA = pbhVar.a(1.0f, nim0Var, false);
                    mbh mbhVarA2 = jbh.a(h36.c, een.P0, x340Var8, 0);
                    int iHashCode4 = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM4 = x340Var8.m();
                    qim0 qim0VarE4 = zr7.E(x340Var8, qim0VarA);
                    x340Var8.m0();
                    if (x340Var8.S) {
                        x340Var8.l(n4kVar);
                    } else {
                        x340Var8.v0();
                    }
                    nko1.H(mbhVarA2, x340Var8, lljVar);
                    nko1.H(xos0VarM4, x340Var8, lljVar2);
                    x0d.q(iHashCode4, x340Var8, lljVar3, x340Var8);
                    nko1.H(qim0VarE4, x340Var8, lljVar4);
                    x340Var8.i0(-390285861);
                    int i2 = 0;
                    for (Object obj6 : arrayList) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            p7h.T();
                            throw null;
                        }
                        g9e1 g9e1Var = (g9e1) obj6;
                        int i4 = ((rfv0) ven0Var.getValue()).a;
                        boolean z10 = rk41Var.a;
                        boolean z11 = thd0Var.b;
                        if (((wat) x340Var8.k(t4k.h)).U0() > 1.5d) {
                            x340Var8.i0(72759846);
                            boolean z12 = dhe0.a(x340Var8) != 3;
                            x340Var8.r(false);
                            z2 = z12;
                        } else {
                            x340Var8.i0(-2039410833);
                            x340Var8.r(false);
                            z2 = false;
                        }
                        thd0 thd0Var2 = thd0Var;
                        k1u.k(g9e1Var, i2, i4, z10, z11, k8p1.q(nim0Var, z2, pbhVar.a(1.0f, nim0Var, true)), x340Var8, 0);
                        if (i2 < p7h.L(arrayList)) {
                            v8i0.i(12.0f, -1698169570, x340Var8, x340Var8, nim0Var);
                            x340Var8.r(false);
                        } else {
                            x340Var8.i0(-1698074431);
                            x340Var8.r(false);
                        }
                        thd0Var = thd0Var2;
                        i2 = i3;
                    }
                    x340Var8.r(false);
                    x340Var8.r(true);
                    op71.g(x340Var8, u291.h(nim0Var, 16.0f));
                    x340Var8.r(true);
                    x340Var8.r(true);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                acf1.c((j2i) obj5, (qim0) obj3, (vu30) obj4, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                x760.i((zff1) obj5, (Integer) obj4, (qim0) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                exd0.k((rjf1) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    exd0.j((xjf1) obj5, (Uri) obj4, (iu30) obj3, (qim0) null, x340Var10, 0);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                crm0.r((erf1) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                crm0.s((crf1) obj5, (srt0) obj4, (qim0) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 22:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    trf1 trf1Var = (trf1) obj3;
                    ((tva1) obj5).g((String) obj4, trf1Var.a, trf1Var.f, trf1Var.g, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 23:
                ft0 ft0Var = new ft0((String) obj, (btt0) obj3, (byte) 26);
                ((uvf1) obj5).getClass();
                return uvf1.a((ymd0) obj4, ft0Var);
            case 24:
                return new jpg0(((zl5) ((iz6) obj5).b).h(new epb1((zob1) obj), (iac0) obj2, (ms11) obj4, (up41) obj3), iwf1.R0);
            case 25:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                iu30 iu30Var4 = (iu30) obj3;
                myf1 myf1Var = (myf1) obj5;
                x340 x340Var14 = x340Var13;
                if (!x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x340Var14.b0();
                } else if (myf1Var instanceof jyf1) {
                    x340Var14.i0(422138816);
                    long j2 = ((u7h) x340Var14.k(gaa1.a)).a;
                    jyf1 jyf1Var = (jyf1) myf1Var;
                    tva1 tva1Var = (tva1) obj4;
                    d0r d0rVar2 = tva1Var.b;
                    y08 y08Var = (y08) tva1Var.h;
                    jd6 jd6Var = (jd6) tva1Var.i;
                    wm31 wm31Var = (wm31) tva1Var.t;
                    boolean zG4 = x340Var14.g(iu30Var4) | x340Var14.f(j2);
                    Object objT6 = x340Var14.T();
                    if (zG4 || objT6 == fkj0.X) {
                        objT6 = new sza(iu30Var4, j2, (byte) 1);
                        x340Var14.s0(objT6);
                    }
                    cev0.g(jyf1Var, d0rVar2, y08Var, jd6Var, wm31Var, (qim0) null, (Function0) objT6, x340Var14, 4096);
                    x340Var14.r(false);
                } else {
                    if (!(myf1Var instanceof kyf1)) {
                        throw p3d1.k(x340Var14, 983447509, false);
                    }
                    x340Var14.i0(983463218);
                    cev0.h(0, 1, x340Var14, (qim0) null, ((kyf1) myf1Var).b != null);
                    x340Var14.r(false);
                }
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                cev0.i((jyf1) obj5, (tyq) obj4, (d0r) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    e2g1 e2g1Var = (e2g1) obj5;
                    d2g1 d2g1Var = e2g1Var.a;
                    c380 c380Var2 = e2g1Var.c;
                    boolean z13 = e2g1Var.b;
                    wf3 wf3Var = (wf3) ((nl9) obj4).t;
                    boolean zG5 = x340Var16.g(iu30Var5);
                    Object objT7 = x340Var16.T();
                    if (zG5 || objT7 == fkj0.X) {
                        objT7 = new fgf1(iu30Var5, (byte) 7);
                        x340Var16.s0(objT7);
                    }
                    k2g1.f(d2g1Var, c380Var2, wf3Var, null, z13, (Function0) objT7, x340Var16, 0);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 28:
                x340 x340Var17 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    aeg1 aeg1Var = (aeg1) obj3;
                    ha71.m((xdg1) obj5, (iu30) obj4, aeg1Var.b, aeg1Var.c, aeg1Var.d, aeg1Var.e, aeg1Var.f, aeg1Var.g, aeg1Var.h, x340Var18, 0);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                op71.h((mbl1) obj5, (u7h) obj4, (lee1) obj3, (b0k) obj, czo1.p(49));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ juc1(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ juc1(Object obj, qim0 qim0Var, vu30 vu30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.c = qim0Var;
        this.b = vu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ juc1(Object obj, Object obj2, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juc1(thd0 thd0Var, ven0 ven0Var, che0 che0Var, rk41 rk41Var) {
        super(2);
        this.a = (byte) 15;
        this.d = thd0Var;
        this.b = ven0Var;
        this.c = rk41Var;
    }
}
