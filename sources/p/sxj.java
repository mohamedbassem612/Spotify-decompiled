package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sxj extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxj(String str, String str2, l4o1 l4o1Var, Function0 function0, String str3) {
        super(2);
        this.a = (byte) 12;
        this.b = str;
        this.c = str2;
        this.d = l4o1Var;
        this.e = function0;
        this.f = str3;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:56:0x0247  */
    /* JADX WARN: Code duplicated, block: B:60:0x025e  */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        Integer num;
        dzo1 y50Var;
        String strK;
        jax haxVar;
        long j;
        long j2;
        x340 x340Var;
        boolean zI;
        bw91 bw91Var;
        Object objT;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        Object obj4 = this.b;
        Object obj5 = this.f;
        Object obj6 = this.c;
        Object obj7 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var2 = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                wtw wtwVar = (wtw) obj5;
                maa maaVar = (maa) obj6;
                x340 x340Var3 = x340Var2;
                if (x340Var3.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i1o1.e(maaVar, (cxc0) obj7, (rzq) ((txj) obj3).d.d, null, wpb1.D(l1d.m("key_luxp_section_esh_", (String) obj4), maaVar, (cxc0) obj7, x340Var3, 0), apo.r(1627926089, new boj(wtwVar, (byte) 8), x340Var3), apo.r(-602629886, new okg(wtwVar, (byte) 25), x340Var3), 0, null, x340Var3, 1769472, 196);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var4 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    rce0.a(cwl1.B(((cir0) obj4).g()), apo.r(-1651110042, new jyj((kyj) obj6, (j2i) obj7, this.e, (iu30) obj5, (byte) 1), x340Var5), x340Var5, 48);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                lyg.d((obk) obj4, (iu30) obj6, (lbs) obj7, (d0r) obj3, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                x340 x340Var6 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mod.b(oi7.a.a((gw70) obj4), apo.r(-2058626540, new hwd((tob1) obj6, (tob1) obj7, (lbs) obj3, (d0r) obj5, (byte) 19), x340Var7), x340Var7, 56);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                ((p2o0) obj4).b((xbk) obj6, (qim0) obj7, (es41) obj3, (iu30) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                kkn.c((ffk) obj4, (iu30) obj6, (aod0) obj7, (qim0) obj3, (yqg) obj5, (b0k) obj, czo1.p(513));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                ((i7d) obj4).c((nkk) obj6, (rxk0) obj7, (iu30) obj3, (qim0) obj5, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                c921.b((kdl) obj4, (Function0) obj6, (Function0) obj7, (iu30) obj3, (qim0) obj5, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 8:
                pfl pflVar = (pfl) obj4;
                x340 x340Var8 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    wnb0 wnb0Var = new wnb0(1.0f, true);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var9).b;
                    d36 d36Var = new d36(8.0f, true, new um5(false));
                    boolean zI2 = x340Var9.i(pflVar) | x340Var9.i((idl) obj6) | x340Var9.g((iu30) obj7) | x340Var9.g((iu30) obj3) | x340Var9.g((vu30) obj5);
                    idl idlVar = (idl) obj6;
                    iu30 iu30Var = (iu30) obj7;
                    iu30 iu30Var2 = (iu30) obj3;
                    vu30 vu30Var = (vu30) obj5;
                    Object objT2 = x340Var9.T();
                    if (zI2 || objT2 == fkj0.X) {
                        uh0 uh0Var = new uh0(pflVar, idlVar, iu30Var, iu30Var2, vu30Var, (byte) 15);
                        x340Var9.s0(uh0Var);
                        objT2 = uh0Var;
                    }
                    ujo1.d(wnb0Var, null, null, false, d36Var, null, null, false, null, (iu30) objT2, x340Var9, 0, 494);
                } else {
                    x340Var9.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                i541.b((pfl) obj4, (iu30) obj6, (iu30) obj7, (vu30) obj3, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                ((f8m) obj4).h((kes) obj6, (iu30) obj7, (Function0) obj3, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                String str = (String) obj4;
                uwr uwrVar2 = cbx.a;
                x340 x340Var10 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                iu30 iu30Var3 = (iu30) obj3;
                jhm jhmVar = (jhm) obj6;
                qhm qhmVar = (qhm) obj5;
                ohm ohmVar = (ohm) obj7;
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    hux huxVar = jhmVar.b;
                    fhm fhmVar = jhmVar.c;
                    ihm ihmVar = ohmVar.b;
                    hhm hhmVar = ihmVar.b;
                    b0o1 b0o1Var = ihmVar.a;
                    if (u890.j(b0o1Var, ahm.c)) {
                        num = 2131954315;
                    } else if (u890.j(b0o1Var, zgm.c)) {
                        num = 2131954313;
                    } else {
                        num = u890.j(b0o1Var, chm.c) ? 2131954316 : null;
                    }
                    if (num == null) {
                        x340Var11.i0(-1123363472);
                        x340Var11.r(false);
                        y50Var = null;
                    } else {
                        x340Var11.i0(-1123363471);
                        String strO0 = cwl1.o0(x340Var11, num.intValue());
                        if (ihc1.y0(strO0)) {
                            hhg1.n("Please consider providing a non-empty action label to provide a more accessible experience for everyone. You can use SelfDescribed if the content description is sufficient.");
                            return null;
                        }
                        y50Var = new y50(strO0);
                        x340Var11.r(false);
                    }
                    if (y50Var == null) {
                        y50Var = z50.c;
                    }
                    boolean zI3 = x340Var11.i(ohmVar) | x340Var11.g(iu30Var3);
                    Object objT3 = x340Var11.T();
                    if (zI3 || objT3 == fkj0.X) {
                        objT3 = new gmj((byte) 28, ohmVar, iu30Var3);
                        x340Var11.s0(objT3);
                    }
                    gbx gbxVar = new gbx(y50Var, (Function0) objT3);
                    Integer num2 = jhmVar.f;
                    if (num2 == null) {
                        x340Var11.i0(-1123061532);
                        x340Var11.r(false);
                        strK = null;
                    } else {
                        strK = kk0.k(x340Var11, -1123061531, num2, x340Var11, false);
                    }
                    String str2 = strK == null ? str : strK;
                    vrv0 vrv0Var = ohmVar.c;
                    ArrayList arrayList = vrv0Var != null ? (ArrayList) vrv0Var.e : null;
                    boolean z = qhmVar.b;
                    boolean z2 = ohmVar.a.g;
                    if (z2) {
                        x340Var11.i0(379421207);
                        x340Var11.r(false);
                        haxVar = jax.a;
                    } else {
                        if (z2) {
                            throw p3d1.k(x340Var11, 379419789, false);
                        }
                        x340Var11.i0(379423466);
                        haxVar = new hax(cwl1.o0(x340Var11, 2131954345));
                        x340Var11.r(false);
                    }
                    jax jaxVar = haxVar;
                    if (phm.a[hhmVar.ordinal()] == 1) {
                        x340Var11.i0(-601166265);
                        j = cbx.a(x340Var11).b.d;
                        x340Var11.r(false);
                    } else {
                        x340Var11.i0(-601164797);
                        j = cbx.a(x340Var11).b.a;
                        x340Var11.r(false);
                    }
                    long j3 = j;
                    int iOrdinal = hhmVar.ordinal();
                    if (iOrdinal == 1) {
                        x340Var11.i0(-1269317781);
                        j2 = cbx.a(x340Var11).b.c;
                        x340Var11.r(false);
                    } else if (iOrdinal != 2) {
                        x340Var11.i0(-1269316186);
                        j2 = cbx.a(x340Var11).b.b;
                        x340Var11.r(false);
                    } else {
                        x340Var11.i0(-1269320409);
                        j2 = cbx.a(x340Var11).b.d;
                        x340Var11.r(false);
                    }
                    j0o1.c(str, gbxVar, null, huxVar, fhmVar, str2, arrayList, jaxVar, j3, j2, hhmVar == hhm.b, z, x340Var11, 32768);
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var12 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    uwr uwrVar3 = cbx.a;
                    cua cuaVar = cbx.b(x340Var13).f;
                    cr31 cr31VarB = er31.b(16.0f);
                    ogx ogxVar = ogx.e;
                    cvx cvxVar2 = cbx.b(x340Var13).b;
                    cvx cvxVar3 = cbx.b(x340Var13).b;
                    cvx cvxVar4 = cbx.b(x340Var13).b;
                    cvx cvxVar5 = cbx.b(x340Var13).b;
                    cwl1.b(nim0.a, (tl3) null, cr31VarB, ogxVar, new zzq0(12.0f, 12.0f, 12.0f, 4.0f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-2098886743, new jb1(obj4, obj6, obj7, obj3, obj5, (byte) 10), x340Var13), x340Var13, 3072, 48, 2018);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                qgo1.b((s2o) obj6, (String) obj4, (cvm) obj7, (qim0) obj3, (Function0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 14:
                x340 x340Var14 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                gln glnVar = (gln) obj6;
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    bpo1.b((bln) obj4, (iu30) obj7, glnVar.a, (q251) glnVar.N0.getValue(), glnVar.d, glnVar.h, (v361) obj3, (fm50) obj5, glnVar.Z, anm1.N("loaded_element", nim0Var), x340Var15, 805306368);
                } else {
                    x340Var15.b0();
                }
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                lro1.e((String) obj4, (String) obj6, (String) obj7, (p0o) obj3, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                p6p1.e((iu30) obj4, (qim0) obj6, (xtb0) obj7, (vzq0) obj3, (iu30) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                x340 x340Var16 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    uwr uwrVar4 = cbx.a;
                    qim0 qim0VarK = up30.k(((vex) zex.a.e).d, nim0Var);
                    tzr tzrVar = (tzr) obj4;
                    v130 v130Var = (v130) obj6;
                    z030 z030Var = (z030) obj7;
                    k9r k9rVar = (k9r) obj3;
                    iu30 iu30Var4 = (iu30) obj5;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var17, 0);
                    int iHashCode = Long.hashCode(x340Var17.T);
                    xos0 xos0VarM = x340Var17.m();
                    qim0 qim0VarE = zr7.E(x340Var17, qim0VarK);
                    hzj.A.getClass();
                    if (x340Var17.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var17.m0();
                    if (x340Var17.S) {
                        x340Var17.l(hmb0.t1);
                    } else {
                        x340Var17.v0();
                    }
                    nko1.H(mbhVarA, x340Var17, y580.O0);
                    nko1.H(xos0VarM, x340Var17, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var17, y580.R0);
                    nko1.F(x340Var17);
                    nko1.H(qim0VarE, x340Var17, y580.Y);
                    otw.c(tzrVar, v130Var, (qim0) null, (ipb1) null, x340Var17, 0, 12);
                    if (z030Var.c) {
                        x340Var17.i0(908367293);
                        x340Var17.r(false);
                    } else {
                        x340Var17.i0(908265427);
                        ((hur) k9rVar.c).b(z030Var.d, iu30Var4, x340Var17, 0);
                        x340Var17.r(false);
                    }
                    x340Var17.r(true);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                ((g1t) obj4).a((qvm1) obj6, (upb0) obj7, (iu30) obj3, (qim0) obj5, (b0k) obj, czo1.p(3073));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                ((mxr) obj4).c((jwm1) obj6, (upb0) obj7, (iu30) obj3, (qim0) obj5, (b0k) obj, czo1.p(3073));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                x340 x340Var18 = (b0k) obj;
                e3u e3uVar = (e3u) obj6;
                hnn0 hnn0Var = (hnn0) obj4;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    x340 x340Var19 = x340Var18;
                    if (x340Var19.H()) {
                        x340Var19.b0();
                    } else {
                        x340Var = x340Var18;
                        zI = x340Var.i(hnn0Var) | x340Var.g(e3uVar);
                        bw91Var = (bw91) obj3;
                        objT = x340Var.T();
                        if (zI || objT == fkj0.X) {
                            objT = new m3n(bw91Var, hnn0Var, e3uVar, (byte) 17);
                            x340Var.s0(objT);
                        }
                        qxd0.i(hnn0Var, (iu30) objT, x340Var);
                        hon1.c(hnn0Var, (kd41) obj7, apo.r(-497631156, new utt((d3u) obj5, hnn0Var), x340Var), x340Var, 384);
                    }
                } else {
                    x340Var = x340Var18;
                    zI = x340Var.i(hnn0Var) | x340Var.g(e3uVar);
                    bw91Var = (bw91) obj3;
                    objT = x340Var.T();
                    if (zI) {
                        objT = new m3n(bw91Var, hnn0Var, e3uVar, (byte) 17);
                        x340Var.s0(objT);
                    } else {
                        objT = new m3n(bw91Var, hnn0Var, e3uVar, (byte) 17);
                        x340Var.s0(objT);
                    }
                    qxd0.i(hnn0Var, (iu30) objT, x340Var);
                    hon1.c(hnn0Var, (kd41) obj7, apo.r(-497631156, new utt((d3u) obj5, hnn0Var), x340Var), x340Var, 384);
                }
                return rih1Var;
            case 21:
                x340 x340Var20 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ((vqv) obj4).l(((Set) ((ven0) obj3).getValue()).size(), (htv) obj6, ((Boolean) ((ven0) obj5).getValue()).booleanValue(), (iu30) obj7, x340Var21, 0);
                } else {
                    x340Var21.b0();
                }
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                u7n0.f((o2y) obj4, (iu30) obj6, (otu) obj7, (Function0) obj3, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                rwq0.f((l5y) obj4, (vu30) obj6, (muo) obj7, (suo) obj3, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                b0k b0kVar = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                ven0 ven0Var = (ven0) obj5;
                b0k b0kVar2 = (x340) b0kVar;
                if (b0kVar2.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    i7d i7dVar = (i7d) obj4;
                    cj00 cj00Var = (cj00) obj6;
                    iu30 iu30Var5 = (iu30) obj7;
                    d6o0 d6o0Var = (d6o0) obj3;
                    boolean zI4 = b0kVar2.i(ven0Var);
                    Object objT4 = b0kVar2.T();
                    if (zI4 || objT4 == fkj0.X) {
                        objT4 = new d7v(ven0Var, (byte) 23);
                        b0kVar2.s0(objT4);
                    }
                    i7dVar.e(cj00Var, iu30Var5, d6o0Var, (iu30) objT4, null, b0kVar2, 0);
                } else {
                    b0kVar2.b0();
                }
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                ey00.c((j2i) obj4, (Function0) obj6, (Function0) obj7, (Function0) obj3, (qim0) obj5, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 26:
                ((Number) obj2).intValue();
                pto1.g((le10) obj4, (iu30) obj6, (qim0) obj7, (j2i) obj3, (j2i) obj5, (b0k) obj, czo1.p(27649));
                return rih1Var;
            case 27:
                x340 x340Var22 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                jj10 jj10Var = (jj10) obj5;
                String str3 = (String) obj4;
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    qim0 qim0VarN = anm1.N("CtaButton", nim0Var);
                    Function0 function0 = (Function0) obj6;
                    if (ihc1.y0(str3)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.c(new gbx(new y50(str3), function0), (yf) obj7, qim0VarN, (max) obj3, yla.s(x340Var23), null, null, null, apo.r(-1491406072, new lj10(jj10Var, (byte) 0), x340Var23), apo.r(744277974, new lj10(jj10Var, (byte) 1), x340Var23), apo.r(1751200663, new ps00(str3, (byte) 1), x340Var23), x340Var23, 805306368, 54, 456);
                } else {
                    x340Var23.b0();
                }
                return rih1Var;
            case 28:
                ((Number) obj2).intValue();
                cuo1.p((jj10) obj6, (String) obj4, (String) obj7, (Locale) obj3, (TimeZone) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                wxo1.l((String) obj4, (String) obj6, (String) obj7, (Integer) obj3, (qim0) obj5, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sxj(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4, String str) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = str;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sxj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sxj(byte b, int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxj(jhm jhmVar, ohm ohmVar, iu30 iu30Var, String str, qhm qhmVar) {
        super(2);
        this.a = (byte) 11;
        this.c = jhmVar;
        this.d = ohmVar;
        this.e = iu30Var;
        this.b = str;
        this.f = qhmVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxj(tzr tzrVar, v130 v130Var, z030 z030Var, k9r k9rVar, iu30 iu30Var) {
        super(2);
        this.a = (byte) 17;
        this.b = tzrVar;
        this.c = v130Var;
        this.d = z030Var;
        this.e = k9rVar;
        this.f = iu30Var;
    }
}
