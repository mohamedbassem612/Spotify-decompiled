package p;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.creativework.v1.ParentInfo;
import com.spotify.creativework.v1.Release;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.SnackBarTemplate;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.scrollsita.v1.Section;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gh61 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh61(String str, Function0 function0, ArrayList arrayList, vi11 vi11Var) {
        super(2);
        this.a = (byte) 26;
        this.b = str;
        this.c = function0;
        this.d = arrayList;
        this.e = vi11Var;
    }

    /* JADX WARN: Code duplicated, block: B:233:0x0c21 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:235:0x0c24  */
    /* JADX WARN: Code duplicated, block: B:237:0x0c3f  */
    /* JADX WARN: Code duplicated, block: B:240:0x0c4d  */
    /* JADX WARN: Code duplicated, block: B:242:0x0c66  */
    /* JADX WARN: Code duplicated, block: B:245:0x0c7c  */
    public final Object invoke(Object obj, Object obj2) {
        smc0 smc0VarN;
        blc0[] blc0VarArr;
        blc0[] blc0VarArr2;
        boolean zH;
        blc0[] blc0VarArr3;
        int i;
        String str;
        byte b = this.a;
        f36 f36Var = h36.c;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                return yoi1.g(BehaviorSubject.g(new an41(new ndp0((mlv0) obj, (tif1) obj6, (dn41) obj2, (kly0) obj5, (kly0) obj4, (jo20) obj3, (byte) 5))));
            case 1:
                ((Number) obj2).intValue();
                ((vt61) obj6).b((c8e1) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                vzq0 vzq0Var = (vzq0) obj4;
                b0k b0kVar = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                b0k b0kVar2 = (x340) b0kVar;
                if (b0kVar2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    axq0 axq0VarM = nmn1.m(vzq0Var, (p3v) null, new p3v(0.0f), (p3v) null, (p3v) null, 13);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(b0kVar2).b;
                    ((su61) obj6).c.b(mqo1.F((List) obj5), u291.c(uyn1.w(nim0Var, nmn1.m(vzq0Var, new p3v(0.0f), (p3v) null, new p3v(0.0f), new p3v(0.0f), 2)), 1.0f), false, (String) obj3, lnn1.n(axq0VarM, uyn1.h(1, 0.0f, 8.0f)), b0kVar2, 8, 4);
                } else {
                    b0kVar2.b0();
                }
                return rih1Var;
            case 3:
                x340 x340Var = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                k171 k171Var = (k171) obj5;
                m4c m4cVar = fkj0.X;
                iu30 iu30Var = (iu30) obj3;
                j171 j171Var = (j171) obj4;
                tom tomVar = j171Var.j;
                r171 r171Var = (r171) obj6;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String str2 = r171Var.c1;
                    add addVar = r171Var.t;
                    boolean z = r171Var.e1;
                    qf4 qf4Var = addVar.a;
                    boolean z2 = qf4Var.h() && qf4Var.X();
                    boolean zK = addVar.k();
                    boolean zM = addVar.m();
                    e821 e821Var = r171Var.k1;
                    boolean zO = addVar.o();
                    boolean z3 = addVar.o() && addVar.b.f();
                    boolean z4 = k171Var.b;
                    sve sveVar = r171Var.P0;
                    String str3 = tomVar.f.a;
                    boolean zJ = u890.j(tomVar.c.a, r171Var.d1);
                    boolean z5 = tomVar.f.b instanceof jb71;
                    l171 l171Var = k171Var.c;
                    List listK = z6x.a;
                    if (!zJ) {
                        if (nzy.j(str3)) {
                            listK = Collections.singletonList(new d071(str3));
                        } else {
                            Set set = s4b1.f;
                            blc0[] blc0VarArr4 = nzy.m;
                            if (uic.h(str3, (blc0[]) Arrays.copyOf(blc0VarArr4, blc0VarArr4.length))) {
                                if (l171Var != null) {
                                    smc0 smc0VarN2 = k4p1.n();
                                    if (l171Var.a.a() && l171Var.b) {
                                        smc0VarN2.add(new i071(str3));
                                    }
                                    if (l171Var.c) {
                                        smc0VarN2.add(new g071(str3));
                                    }
                                    smc0VarN2.add(new h071(str3));
                                    List listK2 = k4p1.k(smc0VarN2);
                                    if (listK2 != null) {
                                        listK = listK2;
                                    }
                                }
                            } else if (!nzy.d(str3)) {
                                blc0[] blc0VarArr5 = (blc0[]) f46.A0(f46.A0(f46.A0(f46.A0(f46.A0(f46.A0(f46.A0(nzy.b, nzy.c), nzy.d), nzy.e), nzy.k), nzy.g), nzy.a), nzy.n);
                                if (uic.h(str3, (blc0[]) Arrays.copyOf(blc0VarArr5, blc0VarArr5.length))) {
                                    if (!z5) {
                                        smc0VarN = k4p1.n();
                                        blc0VarArr = nzy.a;
                                        blc0VarArr2 = nzy.d;
                                        blc0[] blc0VarArr6 = (blc0[]) f46.A0(blc0VarArr, blc0VarArr2);
                                        zH = uic.h(str3, (blc0[]) Arrays.copyOf(blc0VarArr6, blc0VarArr6.length));
                                        if (zH) {
                                            smc0VarN.add(new e071(str3));
                                        }
                                        if (nzy.d(str3)) {
                                            smc0VarN.add(new f071(nzy.k(str3)));
                                        } else {
                                            blc0VarArr3 = (blc0[]) f46.A0(f46.A0(blc0VarArr, blc0VarArr2), nzy.b);
                                            if (uic.h(str3, (blc0[]) Arrays.copyOf(blc0VarArr3, blc0VarArr3.length))) {
                                                smc0VarN.add(new f071(nzy.k(str3)));
                                            }
                                        }
                                        smc0VarN.add(new g071(str3));
                                        if (!zH) {
                                            smc0VarN.add(new h071(str3));
                                        }
                                        smc0VarN.add(new c071(nzy.k(str3)));
                                        listK = k4p1.k(smc0VarN);
                                    }
                                } else if (nzy.h(str3) || nzy.e(str3) || nzy.j(str3)) {
                                    listK = p7h.M(new j071[]{new h071(str3), new c071(nzy.k(str3))});
                                }
                            } else if (!z5) {
                                smc0VarN = k4p1.n();
                                blc0VarArr = nzy.a;
                                blc0VarArr2 = nzy.d;
                                blc0[] blc0VarArr7 = (blc0[]) f46.A0(blc0VarArr, blc0VarArr2);
                                zH = uic.h(str3, (blc0[]) Arrays.copyOf(blc0VarArr7, blc0VarArr7.length));
                                if (zH) {
                                    smc0VarN.add(new e071(str3));
                                }
                                if (nzy.d(str3)) {
                                    blc0VarArr3 = (blc0[]) f46.A0(f46.A0(blc0VarArr, blc0VarArr2), nzy.b);
                                    if (uic.h(str3, (blc0[]) Arrays.copyOf(blc0VarArr3, blc0VarArr3.length))) {
                                        smc0VarN.add(new f071(nzy.k(str3)));
                                    }
                                } else {
                                    smc0VarN.add(new f071(nzy.k(str3)));
                                }
                                smc0VarN.add(new g071(str3));
                                if (!zH) {
                                    smc0VarN.add(new h071(str3));
                                }
                                smc0VarN.add(new c071(nzy.k(str3)));
                                listK = k4p1.k(smc0VarN);
                            }
                        }
                    }
                    c380 c380VarA = mqo1.A(listK);
                    String str4 = r171Var.d1;
                    z201 z201Var = r171Var.i;
                    yxb0 yxb0Var = r171Var.Z;
                    c101 c101Var = (c101) r171Var.n1.getValue();
                    ngs0 ngs0Var = r171Var.Q0;
                    fqm fqmVar = (fqm) r171Var.o1.getValue();
                    lgq lgqVar = r171Var.W0;
                    h9n h9nVar = r171Var.f1;
                    h4q h4qVar = r171Var.Y0;
                    boolean z6 = j171Var.k;
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == m4cVar) {
                        objT = new et61(iu30Var, (byte) 1);
                        x340Var2.s0(objT);
                    }
                    vaq0 vaq0Var = new vaq0((iu30) objT);
                    boolean zI = x340Var2.i(r171Var) | x340Var2.g(iu30Var) | x340Var2.g(j171Var);
                    Object objT2 = x340Var2.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new m551((Object) r171Var, (Object) iu30Var, (Object) j171Var, (byte) 6);
                        x340Var2.s0(objT2);
                    }
                    Function0 function0 = (Function0) objT2;
                    boolean zI2 = x340Var2.i(r171Var);
                    Object objT3 = x340Var2.T();
                    if (zI2 || objT3 == m4cVar) {
                        objT3 = new n171(r171Var, (byte) 4);
                        x340Var2.s0(objT3);
                    }
                    Function0 function1 = (Function0) objT3;
                    boolean zI3 = x340Var2.i(r171Var);
                    Object objT4 = x340Var2.T();
                    if (zI3 || objT4 == m4cVar) {
                        objT4 = new n171(r171Var, (byte) 5);
                        x340Var2.s0(objT4);
                    }
                    wxo1.j(j171Var, str2, str4, z, z2, function0, c380VarA, iu30Var, zK, z201Var, zM, e821Var, yxb0Var, c101Var, sveVar, ngs0Var, function1, (Function0) objT4, fqmVar, lgqVar, h9nVar, h4qVar, vaq0Var, z6, zO, z3, z4, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                ((ka71) obj6).e((u9) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                x340 x340Var3 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                tk71 tk71Var = (tk71) obj5;
                qk71 qk71Var = (qk71) obj6;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ok71 ok71Var = (ok71) qk71Var;
                    ven0 ven0VarS = v8r.s(mqo1.A(ok71Var.c.a()), x340Var4);
                    Object objT5 = x340Var4.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT5 == m4cVar2) {
                        objT5 = rwq.q(new g8y0(ven0VarS, (byte) 20));
                        x340Var4.s0(objT5);
                    }
                    mr20 mr20Var = (mr20) objT5;
                    ela1 ela1Var = ok71Var.b;
                    boolean zG2 = x340Var4.g(mr20Var) | x340Var4.g(ela1Var);
                    Object objT6 = x340Var4.T();
                    if (zG2 || objT6 == m4cVar2) {
                        cl71 cl71Var = tk71Var.e;
                        dnc0 dnc0VarB = hvp0.b(cl71Var.b);
                        i = 0;
                        two1.v(dnc0VarB, new zo51(mr20Var, ela1Var, (byte) 15), false, new q961((Object) cl71Var, (byte) 22));
                        objT6 = dnc0VarB.a();
                        x340Var4.s0(objT6);
                    } else {
                        i = 0;
                    }
                    xtb0 xtb0VarA = aub0.a(i, x340Var4, 3);
                    c2p1.k(ok71Var, (dl71) obj4, tk71Var.d, tk71Var.a, tk71Var.f, xtb0VarA, jyo1.n(xtb0VarA, (cnc0) objT6, (h3h1) null, x340Var4, 4), (iu30) obj3, anm1.N("share.sheet.share.preview.sections.loaded", nim0Var), x340Var4, 102760448);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                m6p1.i((x581) obj6, (Function0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                b0k b0kVar3 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                b0k b0kVar4 = (x340) b0kVar3;
                if (b0kVar4.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    qim0 qim0VarY = too1.y(nim0Var, new bgc0((mih1) obj6, 16 | 10));
                    zg81 zg81Var = (zg81) obj5;
                    wg81 wg81Var = (wg81) obj4;
                    iu30 iu30Var2 = (iu30) obj3;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(((x340) b0kVar4).T);
                    xos0 xos0VarM = b0kVar4.m();
                    qim0 qim0VarE = zr7.E(b0kVar4, qim0VarY);
                    hzj.A.getClass();
                    if (((x340) b0kVar4).a == null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar4.m0();
                    if (((x340) b0kVar4).S) {
                        b0kVar4.l(n4kVar);
                    } else {
                        b0kVar4.v0();
                    }
                    nko1.H(gfh0VarC, b0kVar4, y580.O0);
                    nko1.H(xos0VarM, b0kVar4, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), b0kVar4, y580.R0);
                    nko1.F(b0kVar4);
                    nko1.H(qim0VarE, b0kVar4, y580.Y);
                    zg81Var.i(wg81Var, iu30Var2, b0kVar4, 0);
                    b0kVar4.r(true);
                } else {
                    b0kVar4.b0();
                }
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                ((res) obj6).n((aj81) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                ((res) obj6).o((aj81) obj5, (iu30) obj4, (li81) obj3, (b0k) obj, czo1.p(521));
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                z8p1.k((cd71) obj6, (z710) obj5, (wj81) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                x340 x340Var5 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    era eraVar = een.Q0;
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var6).b;
                    cvx cvxVar3 = cbx.b(x340Var6).b;
                    qim0 qim0VarB = uyn1.B(qim0VarF, 16.0f, 0.0f, 16.0f, ((vzq0) obj6).a(), 2);
                    cd71 cd71Var = (cd71) obj5;
                    z710 z710Var = (z710) obj4;
                    wj81 wj81Var = (wj81) obj3;
                    mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var6, 0);
                    int iHashCode2 = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM2 = x340Var6.m();
                    qim0 qim0VarE2 = zr7.E(x340Var6, qim0VarB);
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
                    nko1.H(mbhVarA, x340Var6, y580.O0);
                    nko1.H(xos0VarM2, x340Var6, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var6, y580.R0);
                    nko1.F(x340Var6);
                    nko1.H(qim0VarE2, x340Var6, y580.Y);
                    gio1.d((qim0) null, x340Var6, 0);
                    b9p1.d(pox.c, cwl1.o0(x340Var6, 2131952717), x340Var6, pox.d);
                    b9p1.d(rpx.c, cwl1.o0(x340Var6, 2131952719), x340Var6, rpx.d);
                    b9p1.d(zkx.c, cwl1.o0(x340Var6, 2131952715), x340Var6, zkx.d);
                    b9p1.d(znx.c, cwl1.o0(x340Var6, 2131952718), x340Var6, znx.d);
                    b9p1.d(hmx.c, cwl1.o0(x340Var6, 2131952716), x340Var6, hmx.d);
                    cvx cvxVar4 = cbx.b(x340Var6).b;
                    op71.g(x340Var6, u291.h(nim0Var, 16.0f));
                    z8p1.k(cd71Var, z710Var, wj81Var, (qim0) null, x340Var6, 0);
                    x340Var6.r(true);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 12:
                ((Number) obj2).intValue();
                b9p1.l((kg0) obj6, (cd71) obj5, (z710) obj4, (wj81) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                ((tt91) obj6).c(czo1.p(7), (String) obj3, (j2i) obj5, (b0k) obj, (qim0) obj4);
                return rih1Var;
            case 14:
                x340 x340Var7 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                SnackBarTemplate snackBarTemplate = (SnackBarTemplate) obj6;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    qim0 qim0VarF2 = dug.f(u291.f(nim0Var, 1.0f), v9p1.C(snackBarTemplate, x340Var8), d4o1.a);
                    if (snackBarTemplate instanceof SnackBarTemplate.JitSnackBar) {
                        str = "messaging_snackbar_type_jit";
                    } else if (snackBarTemplate instanceof SnackBarTemplate.CustomSnackbar) {
                        str = "messaging_snackbar_type_custom";
                    } else {
                        if (!(snackBarTemplate instanceof SnackBarTemplate.BaseSnackBar)) {
                            hhg1.n("Unknown SnackbarTemplate type");
                            return null;
                        }
                        str = "messaging_snackbar_type_base";
                    }
                    ((tt91) obj5).c(6, str, apo.r(-1689260268, new q081((aqw) obj4, (qt91) obj3, (byte) 15), x340Var8), x340Var8, qim0VarF2);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 15:
                ((Number) obj2).intValue();
                mym.f((dt71) obj6, (cce) obj5, (dbp) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                gm50.k((bc81) obj6, (rv21) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                ((qba1) obj6).e((oba1) obj5, (n8h1) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                x340 x340Var9 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                pda1 pda1Var = (pda1) obj4;
                m4c m4cVar3 = fkj0.X;
                c1m0 c1m0Var = (c1m0) obj6;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zG3 = x340Var10.g(c1m0Var);
                    Object objT7 = x340Var10.T();
                    if (zG3 || objT7 == m4cVar3) {
                        a1m0 a1m0Var = c1m0Var != null ? new a1m0(c1m0Var) : null;
                        x340Var10.s0(a1m0Var);
                        objT7 = a1m0Var;
                    }
                    a1m0 a1m0Var2 = (a1m0) objT7;
                    rba1 rba1Var = sba1.b;
                    String str5 = ((sda1) obj5).c;
                    String str6 = str5 == null ? null : str5;
                    boolean zI4 = x340Var10.i(pda1Var);
                    Object objT8 = x340Var10.T();
                    if (zI4 || objT8 == m4cVar3) {
                        objT8 = new ida1(pda1Var, (byte) 1);
                        x340Var10.s0(objT8);
                    }
                    rqg0.p(rba1Var, str6, (iu30) objT8, apo.r(-1228316324, new kda1((qba1) obj3, a1m0Var2, (byte) 0), x340Var10), (qim0) null, x340Var10, 3078);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                cev0.n((sda1) obj6, (iu30) obj5, (qim0) obj4, (j2i) obj3, (b0k) obj, czo1.p(3121));
                return rih1Var;
            case 20:
                ((Number) obj2).intValue();
                i541.h((c380) obj6, (vu30) obj5, (qim0) obj4, (String) obj3, (b0k) obj, czo1.p(3073));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                vvm1.o((uoa) obj6, (Function0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                x340 x340Var11 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                x340 x340Var12 = x340Var11;
                boolean zY = x340Var12.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2);
                j06 j06Var = x340Var12.a;
                if (!zY) {
                    x340Var12.b0();
                    return rih1Var;
                }
                qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
                uwr uwrVar3 = cbx.a;
                long jC = cbx.a(x340Var12).a.a.c();
                cua cuaVar = cbx.b(x340Var12).f;
                qim0 qim0VarF4 = dug.f(qim0VarF3, jC, er31.b(16.0f));
                egc1 egc1Var = (egc1) obj6;
                j2i j2iVar = (j2i) obj5;
                j2i j2iVar2 = (j2i) obj4;
                Function0 function2 = (Function0) obj3;
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                int iHashCode3 = Long.hashCode(x340Var12.T);
                xos0 xos0VarM3 = x340Var12.m();
                qim0 qim0VarE3 = zr7.E(x340Var12, qim0VarF4);
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
                nko1.H(gfh0VarC2, x340Var12, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM3, x340Var12, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode3);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var12, lljVar3);
                nko1.F(x340Var12);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE3, x340Var12, lljVar4);
                mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var12, 0);
                int iHashCode4 = Long.hashCode(x340Var12.T);
                xos0 xos0VarM4 = x340Var12.m();
                qim0 qim0VarE4 = zr7.E(x340Var12, nim0Var);
                x340Var12.m0();
                if (x340Var12.S) {
                    x340Var12.l(n4kVar);
                } else {
                    x340Var12.v0();
                }
                nko1.H(mbhVarA2, x340Var12, lljVar);
                nko1.H(xos0VarM4, x340Var12, lljVar2);
                x0d.q(iHashCode4, x340Var12, lljVar3, x340Var12);
                nko1.H(qim0VarE4, x340Var12, lljVar4);
                iko1.k(egc1Var, x340Var12, 0);
                cvx cvxVar5 = cbx.b(x340Var12).b;
                op71.g(x340Var12, u291.h(nim0Var, 16.0f));
                j2iVar.invoke(x340Var12, 0);
                j2iVar2.invoke(x340Var12, 0);
                hr80.d(u291.f(nim0Var, 1.0f), 1.0f, ((vex) zex.a.e).i, x340Var12, 0, 0);
                cvx cvxVar6 = cbx.b(x340Var12).b;
                cvx cvxVar7 = cbx.b(x340Var12).b;
                iko1.n(0, function2, x340Var12, uyn1.y(nim0Var, 16.0f, 16.0f));
                x340Var12.r(true);
                x340Var12.r(true);
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                mqo1.j((r6q) obj6, (o860) obj5, (csc1) obj4, (kt91) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                ((buc1) obj6).a((qtc1) obj5, (Integer) obj4, (rxe1) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 25:
                ((Number) obj2).intValue();
                tro1.k((c380) obj6, (irp) obj5, (vu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 26:
                x340 x340Var13 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    irn1.u((qim0) null, apo.r(-669868509, new s721((String) obj6, (Function0) obj5, (byte) 4), x340Var14), (vu30) null, (erl1) null, apo.r(705151081, new xw91((ArrayList) obj4, (vi11) obj3), x340Var14), x340Var14, 24624, 13);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                iac0 iac0Var = (iac0) obj2;
                n3z n3zVar = (n3z) obj4;
                nmd1 nmd1Var = (nmd1) obj6;
                if (nmd1Var.y.f()) {
                    mep mepVar = nmd1Var.t;
                    d0r d0rVar = ((ji50) obj5).a;
                    n6r0 n6r0Var = nmd1Var.c.a;
                    lzn0 lzn0VarC = ((e7z) ((f9p) mepVar.a.c).X).c();
                    c8o.l(lzn0VarC);
                    return new jpg0(f6o1.A(new jd6(lzn0VarC, d0rVar, n6r0Var), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new uld1(n3zVar, (byte) 0));
                }
                lo11 lo11VarO = Release.o();
                lo11VarO.q(n3zVar.a);
                Release releaseBuild = lo11VarO.build();
                rq50 rq50Var = nmd1Var.u;
                releaseBuild.getClass();
                return new jpg0(new q1v0((y1c1) obj3, releaseBuild, iac0Var, nmd1Var.v, rq50Var), new vld1(releaseBuild, (byte) 0));
            case 28:
                iac0 iac0Var2 = (iac0) obj2;
                lo11 lo11VarO2 = Release.o();
                lo11VarO2.q(((n3z) obj6).a);
                wsr0 wsr0VarO = ParentInfo.o();
                wsr0VarO.n((String) obj5);
                lo11VarO2.n(wsr0VarO);
                Release releaseBuild2 = lo11VarO2.build();
                nmd1 nmd1Var2 = (nmd1) obj4;
                if (nmd1Var2.y.k()) {
                    nt21 nt21Var = nmd1Var2.s;
                    return new jpg0(f6o1.A(new kls0((lzn0) nt21Var.b, (n6r0) nt21Var.c), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new vld1(releaseBuild2, (byte) 5));
                }
                g931 g931Var = nmd1Var2.r;
                releaseBuild2.getClass();
                return new jpg0(new q1v0((y1c1) obj3, releaseBuild2, iac0Var2, nmd1Var2.v, g931Var), new vld1(releaseBuild2, (byte) 6));
            default:
                iac0 iac0Var3 = (iac0) obj2;
                y1c1 y1c1Var = (y1c1) obj6;
                ymd0 epb1Var = new epb1((zob1) obj);
                omd1 omd1Var = (omd1) obj5;
                Context context = omd1Var.a;
                yqg yqgVar = omd1Var.i;
                d0r d0rVar2 = omd1Var.h;
                lls0 lls0Var = omd1Var.x;
                yyo yyoVar = omd1Var.f29p;
                fap fapVar = omd1Var.q;
                xyo xyoVar = omd1Var.s;
                vyo vyoVar = omd1Var.t;
                tzr0 tzr0Var = omd1Var.k;
                tzo tzoVar = omd1Var.l;
                d771 d771Var = omd1Var.j;
                idm idmVarA = ycm.a(omd1Var.m);
                o241 o241Var = omd1Var.b;
                o3r o3rVar = vmd1.a;
                umd1 umd1Var = new umd1(y1c1Var);
                rmd1 rmd1Var = new rmd1(y1c1Var);
                zob1 zob1VarU = ((w2c1) y1c1Var).U(qae.class);
                yxu yxuVar = new yxu(y1c1Var, (byte) 1);
                smd1 smd1Var = new smd1(y1c1Var);
                String str7 = (String) obj4;
                k811 k811Var = new k811(omd1Var.D, new paz(), str7, (byte) 8);
                q8n q8nVar = omd1Var.I;
                q8n q8nVar2 = omd1Var.H;
                vb2 vb2Var = omd1Var.C;
                g2c1 g2c1Var = new g2c1(y1c1Var);
                n891 n891Var = new n891(context, (d281) obj3, yqgVar, (byte) 27);
                jpg0 jpg0Var = new jpg0(new w2s(g2c1Var, new tla(tzoVar, (byte) 1), new j1(2, new mar((z3v0) tzr0Var.b, (wr00) tzr0Var.c, (yh2) tzr0Var.d, (y5v0) tzr0Var.e, iac0Var3), mar.class, "playbackAuthorisation", "playbackAuthorisation(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 12), gr11.a, q8nVar, q8nVar2, vmd1.b(y1c1Var), vb2Var), yda.P0);
                jpg0 jpg0Var2 = new jpg0(f6o1.A(new hho(d0rVar2), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), yda.Q0);
                jpg0 jpg0Var3 = new jpg0(f6o1.A(vyo.b(vyoVar, yxuVar, p7h.M(new slq0[]{new m9v0(o241Var, epb1Var, cto1.q(iac0Var3)), new m9v0(cto1.q(iac0Var3), smd1Var), yyoVar.a(cto1.q(iac0Var3), zob1VarU), fapVar.a(cto1.q(iac0Var3), rmd1Var, epb1Var), xyo.a(xyoVar, cto1.q(iac0Var3), umd1Var, (bpb1) null, 4)})), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), yda.R0);
                jpg0 jpg0Var4 = new jpg0(d771Var.a(), yda.S0);
                jpg0 jpg0Var5 = new jpg0(f6o1.A(idmVarA, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new rs7(1, (byte) 8));
                new yla(n891Var, jpg0Var, jpg0Var2, jpg0Var3, jpg0Var4, jpg0Var5);
                return new jpg0(zsc.j((zsc) lls0Var.c, new em0(n891Var, epb1Var, new hzw(g2c1Var, (byte) 13), (iu30) null, (iu30) null, (iu30) null, (iu30) null, (xu30) null, (vu30) null, (vu30) null, 1784), (mka) null, 1, lls0Var.b, new vtw(jpg0Var, (qbo1) null), (vtw) null, new vtw(jpg0Var2, (qbo1) null), new vtw(jpg0Var3, (qbo1) null), new vtw(jpg0Var4, (qbo1) null), new vtw(jpg0Var5, (qbo1) null), new zla(), k811Var, (nu11) null, false, (int) context.getResources().getDimension(2131165364), false, npc1.a, false, false, false, new bgx0(d0rVar2), 0, -545570656), new hqa1(str7, (byte) 14));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gh61(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gh61(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh61(egc1 egc1Var, j2i j2iVar, j2i j2iVar2, Function0 function0) {
        super(2);
        this.a = (byte) 22;
        this.b = egc1Var;
        this.c = j2iVar;
        this.d = j2iVar2;
        this.e = function0;
    }
}
