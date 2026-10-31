package p;

import android.app.Activity;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oj2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj2(if3 if3Var, qim0 qim0Var, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 13;
        this.b = if3Var;
        this.d = qim0Var;
        this.c = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        tw2 uw2Var;
        yu11 zu11Var;
        rx7 rx7Var;
        a4g1 a4g1VarC;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        nd31 nd31VarN = null;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                fq7.t((t51) obj5, (t51) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj3;
                m4c m4cVar = fkj0.X;
                cn2 cn2Var = (cn2) obj4;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    wm2 wm2Var = (wm2) obj5;
                    int i = wm2Var.a;
                    int i2 = wm2Var.b;
                    boolean zI = x340Var2.i(cn2Var);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        objT = new fk2(cn2Var, (byte) 0);
                        x340Var2.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT2 = x340Var2.T();
                    if (zG || objT2 == m4cVar) {
                        objT2 = new k52(iu30Var, (byte) 22);
                        x340Var2.s0(objT2);
                    }
                    eko1.m(i, i2, (qim0) null, (sgr0) null, 0L, function0, (Function0) objT2, x340Var2, 0, 28);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                hw2 hw2Var = (hw2) obj4;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    m9h m9hVar = m9h.f;
                    sw2 sw2Var = (sw2) obj5;
                    lt31 lt31Var = (lt31) hw2Var.h;
                    x340Var4.i0(-539667399);
                    x340Var4.r(false);
                    m9hVar.c(sw2Var, tw2.a, lt31Var.a, false, (iu30) obj3, x340Var4, 196608);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                jw2 jw2Var = (jw2) obj4;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    m9h m9hVar2 = m9h.f;
                    sw2 sw2Var2 = (sw2) obj5;
                    d6g1 d6g1Var = jw2Var.d;
                    mt31 mt31Var = jw2Var.e;
                    if (d6g1Var instanceof c6g1) {
                        x340Var6.i0(-1205830619);
                        x340Var6.r(false);
                        uw2Var = tw2.a;
                    } else {
                        if (!(d6g1Var instanceof b6g1)) {
                            throw p3d1.k(x340Var6, -1205832674, false);
                        }
                        x340Var6.i0(-1205826238);
                        uw2Var = new uw2(apo.r(-818326485, new o2((Object) jw2Var, (byte) 25), x340Var6));
                        x340Var6.r(false);
                    }
                    m9hVar2.c(sw2Var2, uw2Var, mt31Var.a(), mt31Var instanceof kt31, (iu30) obj3, x340Var6, 196608);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                sok.m((String) obj5, (vw2) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                fz2.c((jb30) obj5, (kp5) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                tz2.a((pxt0) obj5, (h72) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                pqo.a((aix0) obj5, (oj80) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    kkn.a(((rin0) obj5).d, (eyh0) obj4, (v1r0) obj3, (qim0) null, x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 9:
                e93 e93Var = ((x83) obj5).b;
                return new jpg0(f6o1.A(new mx2((zob1) obj, new p90(((y1c1) obj4).U(jc91.class), (byte) 1)), null, null, 3), new k83((wto) obj3, (byte) 1));
            case 10:
                kpc kpcVar = (kpc) obj;
                w2c1 w2c1Var = (y1c1) obj2;
                x83 x83Var = (x83) obj5;
                wto wtoVar = (wto) obj4;
                t6 t6Var = new t6(x83Var, w2c1Var, wtoVar, (byte) 16);
                hc3 hc3Var = x83Var.c;
                myq0 myq0Var = x83Var.l;
                iac0 iac0Var = x83Var.d;
                if (hc3Var.c().k && hc3Var.c().a) {
                    d0r d0rVar = (d0r) obj3;
                    nd31VarN = hc3Var.c().b ? w3p1.n(new l4r(hvm.d, 2, b03.R0, new j4r(b03.X0), b03.S0), new l4r(new xv00(rc11.a.b(z1g1.class)), 2, b03.T0, new j4r(b03.Y0), b03.U0), ah1.d1) : null;
                    zvf1 zvf1Var = (zvf1) x83Var.u.get();
                    f2x0 f2x0Var = new f2x0((byte) 28);
                    String str = wtoVar.f.a;
                    uyo uyoVar = x83Var.f;
                    g83 g83Var = new g83(x83Var, (byte) 0);
                    uyoVar.getClass();
                    ezo ezoVar = (ezo) uyoVar.a.c;
                    fd3 fd3Var = (fd3) ezoVar.d.get();
                    hc3 hc3Var2 = (hc3) ezoVar.v;
                    aas aasVar = (aas) hc3Var2.X.get();
                    c8o.l(aasVar);
                    b7r0 b7r0Var = (b7r0) hc3Var2.H.get();
                    c8o.l(b7r0Var);
                    vu1 vu1Var = (vu1) hc3Var2.G.get();
                    c8o.l(vu1Var);
                    vgm vgmVar = (vgm) hc3Var2.r0.get();
                    c8o.l(vgmVar);
                    q8n q8nVarD = hc3Var2.d();
                    c8o.l(q8nVarD);
                    zu11Var = new yu11(zvf1.a(zvf1Var, f2x0Var, str, nd31VarN, new cc2(x83Var, nd31VarN, (byte) 5), b03.W0, new kwf1(new bb3(fd3Var, aasVar, b7r0Var, vu1Var, vgmVar, q8nVarD, d0rVar, g83Var), d0rVar, ((req) hc3Var.a0.get()).a(iac0Var, a8o.v((peq) hc3Var.b0.get(), new p90(w2c1Var.U(jc91.class), (byte) 2)), myq0Var.get()), x83Var.w, hc3Var.i(), (t740) hc3Var.k0.get()), x83Var.v ? qb2.a : rb2.a, 24));
                } else {
                    elo eloVar = new elo(w2c1Var, (byte) 0);
                    boolean z = hc3Var.c().i;
                    uvf1 uvf1Var = (uvf1) hc3Var.c0.get();
                    String str2 = wtoVar.a;
                    w2c1 w2c1Var2 = w2c1Var;
                    s24 s24VarA = ((req) hc3Var.a0.get()).a(iac0Var, a8o.v((peq) hc3Var.b0.get(), new p90(w2c1Var2.U(jc91.class), (byte) 2)), myq0Var.get());
                    stt0 stt0VarA = ((qeq) hc3Var.Z.get()).a(new p90(w2c1Var2.U(jc91.class), (byte) 2));
                    stt0VarA.c();
                    iac0Var.getLifecycle().a(new i83(stt0VarA, (byte) 0));
                    tyo tyoVar = x83Var.e;
                    g83 g83Var2 = new g83(x83Var, (byte) 1);
                    ezo ezoVar2 = (ezo) tyoVar.a.c;
                    Activity activityA = ((hc3) ezoVar2.v).a();
                    c8o.l(activityA);
                    hc3 hc3Var3 = (hc3) ezoVar2.v;
                    aas aasVar2 = (aas) hc3Var3.X.get();
                    c8o.l(aasVar2);
                    fd3 fd3Var2 = (fd3) ezoVar2.d.get();
                    b7r0 b7r0Var2 = (b7r0) hc3Var3.H.get();
                    c8o.l(b7r0Var2);
                    vu1 vu1Var2 = (vu1) hc3Var3.G.get();
                    c8o.l(vu1Var2);
                    ptk ptkVarC = hc3Var3.c();
                    c8o.l(ptkVarC);
                    q8n q8nVarD2 = hc3Var3.d();
                    c8o.l(q8nVarD2);
                    t740 t740Var = (t740) hc3Var3.k0.get();
                    c8o.l(t740Var);
                    opv0 opv0VarI = hc3Var3.i();
                    c8o.l(opv0VarI);
                    vb2 vb2Var = (vb2) hc3Var3.q0.get();
                    c8o.l(vb2Var);
                    boolean zA = ezoVar2.a();
                    vgm vgmVar2 = (vgm) hc3Var3.r0.get();
                    c8o.l(vgmVar2);
                    zu11Var = new zu11(uvf1.b(uvf1Var, w2c1Var, str2, s24VarA, stt0VarA, new te3(activityA, aasVar2, fd3Var2, b7r0Var2, vu1Var2, ptkVarC, q8nVarD2, eloVar, g83Var2, t740Var, opv0VarI, vb2Var, zA, vgmVar2), new l83(x83Var, (byte) 0), x83Var.g, new e10(new j83(x83Var, (byte) 0)), new e10(new gh1(x83Var, eloVar, z, wtoVar, (byte) 1)), hc3Var.c().a, false, new m83(wtoVar, (byte) 0), eloVar, z, hc3Var.c().b, ((abm) hc3Var.L0.get()).a(), 28672));
                }
                kpc.c(kpcVar, "Music", (r3r) null, false, (xoc) null, t6Var, zu11Var, 54);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                x760.a((r4w0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case grn1.d /* 12 */:
                xe3 xe3Var = (xe3) obj5;
                laa laaVarL = xe3Var.a.l(new epb1((zob1) obj), (ve3) obj4, (x6o0) obj3);
                xf4 xf4Var = xe3Var.e;
                if (xf4Var.o() && xf4Var.p()) {
                    laaVarL = new rmd0(laaVarL, f6o1.j(null, z8j.a, 7));
                }
                return new jpg0(laaVarL, ra3.c1);
            case 13:
                ((Number) obj2).intValue();
                tm80.a((if3) obj5, (qim0) obj3, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                bwp0.b((h951) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                x340 x340Var9 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                pz50 pz50Var = (pz50) obj5;
                x340 x340Var10 = x340Var9;
                boolean zY = x340Var10.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2);
                j06 j06Var = x340Var10.a;
                if (zY) {
                    long j = u7h.j;
                    uwr uwrVar = cbx.a;
                    qim0 qim0VarZ = uyn1.z(12.0f, 0.0f, 2, dug.f(u291.q(120.0f, 2, u291.D(nim0Var, (era) null, 3)), z4p1.A(((Number) pz50Var.a.e()).floatValue(), j, cbx.a(x340Var10).a.c), er31.b(112.0f)));
                    Object objT3 = x340Var10.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT3 == m4cVar2) {
                        objT3 = k74.V0;
                        x340Var10.s0(objT3);
                    }
                    qim0 qim0VarB = s161.b(qim0VarZ, false, (iu30) objT3);
                    qd5 qd5Var = (qd5) obj4;
                    ven0 ven0Var = (ven0) obj3;
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM = x340Var10.m();
                    qim0 qim0VarE = zr7.E(x340Var10, qim0VarB);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var10.m0();
                    boolean z2 = x340Var10.S;
                    n4k n4kVar = hmb0.t1;
                    if (z2) {
                        x340Var10.l(n4kVar);
                    } else {
                        x340Var10.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(gfh0VarC, x340Var10, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var10, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var10, lljVar3);
                    nko1.F(x340Var10);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var10, lljVar4);
                    Uri uri = Uri.parse(qd5Var.a);
                    Object objT4 = x340Var10.T();
                    if (objT4 == m4cVar2) {
                        objT4 = new xj0(ven0Var, (byte) 17);
                        x340Var10.s0(objT4);
                    }
                    ni7 ni7VarA = oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) objT4, (iu30) null, (iu30) null, 0L, x340Var10, 0, 384, 126974);
                    qim0 qim0VarK = u291.k(h2c.a.b(nim0Var), 32.0f);
                    boolean zI2 = x340Var10.i(pz50Var);
                    Object objT5 = x340Var10.T();
                    if (zI2 || objT5 == m4cVar2) {
                        objT5 = new rd5(pz50Var, (byte) 0);
                        x340Var10.s0(objT5);
                    }
                    qim0 qim0VarC = i541.C(qim0VarK, (iu30) objT5);
                    h6m h6mVar = mif1.Q0;
                    isl islVar = isl.a;
                    eso1.h(ni7VarA, islVar, qim0VarC, (p3v) null, (zvx) null, (ecx) null, h6mVar, (tl3) null, (ColorFilter) null, x340Var10, 1797168, 384);
                    d36 d36Var = new d36(8.0f, true, new g21(een.Q0, (byte) 29));
                    fra fraVar = een.N0;
                    boolean zI3 = x340Var10.i(pz50Var);
                    Object objT6 = x340Var10.T();
                    if (zI3 || objT6 == m4cVar2) {
                        objT6 = new rd5(pz50Var, (byte) 1);
                        x340Var10.s0(objT6);
                    }
                    qim0 qim0VarZ2 = uyn1.z(0.0f, 8.0f, 1, i541.C(nim0Var, (iu30) objT6));
                    jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var10, 54);
                    int iHashCode2 = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM2 = x340Var10.m();
                    qim0 qim0VarE2 = zr7.E(x340Var10, qim0VarZ2);
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(n4kVar);
                    } else {
                        x340Var10.v0();
                    }
                    nko1.H(jw31VarA, x340Var10, lljVar);
                    nko1.H(xos0VarM2, x340Var10, lljVar2);
                    x0d.q(iHashCode2, x340Var10, lljVar3, x340Var10);
                    nko1.H(qim0VarE2, x340Var10, lljVar4);
                    uwo1.e(qd5Var.b, new wnb0(1.0f, false), cbx.d(x340Var10).j, cbx.a(x340Var10).b.a, null, null, 2, false, new cjc0(1), 0, null, x340Var10, 1572864, 0, 1712);
                    hux huxVarN = c0p1.n(qd5Var.d);
                    if (huxVarN == null) {
                        x340Var10.i0(-353076827);
                        x340Var10.r(false);
                    } else {
                        x340Var10.i0(-353076826);
                        w0h1.a(huxVarN, islVar, u291.r(nim0Var, 12.0f), cbx.a(x340Var10).b.a, 0L, false, x340Var10, 440, 48);
                        x340Var10.r(false);
                    }
                    x340Var10.r(true);
                    x340Var10.r(true);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                s3o1.b((q16) obj5, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                r4o1.f((j2i) obj5, (j2i) obj4, (vu30) obj3, (b0k) obj, czo1.p(55));
                return rih1Var;
            case 18:
                x340 x340Var11 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                Function0 function1 = (Function0) obj3;
                String str3 = (String) obj4;
                o86 o86Var = (o86) obj5;
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    qim0 qim0VarN = anm1.N("artifact-page-cancel-button", nim0Var);
                    ldx ldxVar = ldx.c;
                    gdx gdxVarS = yla.s(x340Var12);
                    String strO0 = cwl1.o0(x340Var12, 2131952426);
                    boolean zI4 = x340Var12.i(o86Var) | x340Var12.g(str3) | x340Var12.g(function1);
                    Object objT7 = x340Var12.T();
                    if (zI4 || objT7 == fkj0.X) {
                        objT7 = new hh(o86Var, str3, function1, (byte) 19);
                        x340Var12.s0(objT7);
                    }
                    Function0 function2 = (Function0) objT7;
                    if (ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.c(new gbx(new y50(strO0), function2), ldxVar, qim0VarN, null, gdxVarS, null, null, null, null, null, s6i.c, x340Var12, 0, 48, 2008);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                l6o1.a((String) obj5, (kko) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                x340 x340Var13 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                String str4 = (String) obj5;
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zG2 = x340Var14.g(str4);
                    Object objT8 = x340Var14.T();
                    if (zG2 || objT8 == fkj0.X) {
                        objT8 = new wk3(str4, (byte) 7);
                        x340Var14.s0(objT8);
                    }
                    jto1.b(s161.a(nim0Var, (iu30) objT8), ago1.l(x340Var14), null, false, null, null, null, null, null, null, null, apo.r(-399748962, new ub3((dd6) obj4, (byte) 9), x340Var14), null, null, null, apo.r(-1179461982, new p3((String) obj3, (byte) 16), x340Var14), x340Var14, 64, 196656, 30716);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                od6.a((gj6) obj5, (zi6) obj4, (yux) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                x340 x340Var15 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                m4c m4cVar3 = fkj0.X;
                c21 c21Var = (c21) obj3;
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    vnr0 vnr0Var = (vnr0) obj5;
                    if (vnr0Var == null) {
                        x340Var16.i0(706028820);
                        x340Var16.r(false);
                    } else {
                        x340Var16.i0(706028821);
                        boolean zG3 = x340Var16.g(c21Var);
                        Object objT9 = x340Var16.T();
                        if (zG3 || objT9 == m4cVar3) {
                            objT9 = new vg6(c21Var, (byte) 0);
                            x340Var16.s0(objT9);
                        }
                        qgo1.f(vnr0Var, i541.C(nim0Var, (iu30) objT9), new a0e1(3), 0, false, null, x340Var16, 8, 56);
                        x340Var16.r(false);
                    }
                    vnr0 vnr0Var2 = (vnr0) obj4;
                    if (vnr0Var2 == null) {
                        x340Var16.i0(706572157);
                        x340Var16.r(false);
                    } else {
                        x340Var16.i0(706572158);
                        boolean zG4 = x340Var16.g(c21Var);
                        Object objT10 = x340Var16.T();
                        if (zG4 || objT10 == m4cVar3) {
                            objT10 = new vg6(c21Var, (byte) 1);
                            x340Var16.s0(objT10);
                        }
                        qgo1.f(vnr0Var2, i541.C(nim0Var, (iu30) objT10), new a0e1(3), 0, false, null, x340Var16, 8, 56);
                        x340Var16.r(false);
                    }
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                zho1.b((uh6) obj5, (uh6) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                int iIntValue9 = ((Number) obj).intValue();
                tf6 tf6Var = (tf6) obj2;
                ven0 ven0Var2 = (ven0) obj4;
                wh6 wh6Var = (wh6) ((ji6) obj5).b;
                c380 c380Var = wh6Var.i;
                gj6 gj6Var = (gj6) o7h.t0(iIntValue9, wh6Var.i);
                if (gj6Var != null && (a4g1VarC = dio1.C(gj6Var, p7h.L(c380Var) - iIntValue9, tf6Var)) != null) {
                    nd31VarN = new nd31(a4g1VarC);
                }
                ven0Var2.setValue(nd31VarN);
                gj6 gj6Var2 = (gj6) o7h.t0(iIntValue9, c380Var);
                if (gj6Var2 != null && (rx7Var = gj6Var2.r) != null) {
                    Object obj6 = ((rk41) obj3).c;
                    nho1.z((xgm1) obj6, wh6Var.l, rx7Var);
                    ((xgm1) obj6).a(rgm1.a);
                }
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                eio1.m((gj6) obj5, (aj6) obj4, (yux) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                sio1.n((yj41) obj5, (yj41) obj4, (qim0) obj3, (b0k) obj, czo1.p(73));
                return rih1Var;
            case 27:
                ((Number) obj2).intValue();
                eko1.a((io6) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 28:
                x340 x340Var17 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                ven0 ven0Var3 = (ven0) obj4;
                x340 x340Var18 = x340Var17;
                if (x340Var18.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    String str5 = ((zq6) obj5).b.a;
                    if (str5 == null) {
                        str5 = "";
                    }
                    String str6 = str5;
                    List list = (List) ((ven0) obj3).getValue();
                    boolean zI5 = x340Var18.i(ven0Var3);
                    Object objT11 = x340Var18.T();
                    if (zI5 || objT11 == fkj0.X) {
                        objT11 = new xj0(ven0Var3, (byte) 27);
                        x340Var18.s0(objT11);
                    }
                    ilo1.a(str6, list, (iu30) objT11, null, x340Var18, 0);
                } else {
                    x340Var18.b0();
                }
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                omo1.a((tt6) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oj2(Object obj, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oj2(Object obj, Object obj2, Object obj3, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
