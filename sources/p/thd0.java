package p;

import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class thd0 extends f311 {
    public final /* synthetic */ byte a = 1;
    public final boolean b;
    public final Object c;
    public final Object d;

    public thd0(vaf1 vaf1Var, boolean z) {
        this.c = vaf1Var;
        this.b = z;
        ArrayList arrayList = vaf1Var.b;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((g9e1) it.next()).a);
        }
        this.d = mqo1.A(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:70:0x024f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0281  */
    /* JADX WARN: Code duplicated, block: B:77:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:78:0x02b0  */
    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        int i3;
        pxg1 pxg1VarJ0;
        int i4;
        pxg1 pxg1VarJ1;
        pxg1 pxg1VarJ2;
        Float f;
        ven0 ven0VarP;
        int i5;
        boolean z;
        n4k n4kVar;
        nim0 nim0Var;
        int i6;
        int i7;
        ven0 ven0Var;
        u7h u7hVar;
        boolean z2;
        ven0 ven0VarR;
        int i8;
        x340 x340Var;
        int i9;
        int i10;
        m4c m4cVar;
        boolean zG;
        Object objT;
        boolean zG2;
        Object objT2;
        byte b = this.a;
        n4k n4kVar2 = hmb0.t1;
        nim0 nim0Var2 = nim0.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                Float fValueOf = Float.valueOf(0.5f);
                Float fValueOf2 = Float.valueOf(0.0f);
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(-223418214);
                if ((i & 48) == 0) {
                    i2 = i | ((i & 64) == 0 ? b0kVar3.g(rk41Var) : b0kVar3.i(rk41Var) ? 32 : 16);
                } else {
                    i2 = i;
                }
                if ((i & 3072) == 0) {
                    i2 |= b0kVar3.i(this) ? 2048 : 1024;
                }
                if (b0kVar3.Y(i2 & 1, (i2 & 1041) != 1040)) {
                    Object objT3 = b0kVar3.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT3 == m4cVar2) {
                        i3 = 0;
                        objT3 = bb00.h(0, b0kVar3);
                    } else {
                        i3 = 0;
                    }
                    hdn0 hdn0Var = (hdn0) objT3;
                    Object objT4 = b0kVar3.T();
                    if (objT4 == m4cVar2) {
                        objT4 = bb00.h(i3, b0kVar3);
                    }
                    hdn0 hdn0Var2 = (hdn0) objT4;
                    float f2 = hon1.v(b0kVar3).a.i;
                    boolean z3 = this.b;
                    if (z3) {
                        ilv.a.getClass();
                        pxg1VarJ0 = new pxg1(666, 83, flv.b);
                    } else {
                        pxg1VarJ0 = irn1.j0();
                    }
                    if (z3) {
                        ilv.a.getClass();
                        ceo ceoVar = flv.f;
                        i4 = StoryCard.CLASSIC_CONTENT_FIELD_NUMBER;
                        pxg1VarJ1 = new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, -83, ceoVar);
                    } else {
                        i4 = StoryCard.CLASSIC_CONTENT_FIELD_NUMBER;
                        pxg1VarJ1 = irn1.j0();
                    }
                    if (z3) {
                        ilv.a.getClass();
                        pxg1VarJ2 = new pxg1(666, i4, flv.b);
                    } else {
                        pxg1VarJ2 = irn1.j0();
                    }
                    tzg1 tzg1Var = rno1.a;
                    if (z3 == 0) {
                        b0kVar3.i0(1348534970);
                        ven0VarP = zod.y("titleIn", rk41Var, pxg1VarJ0, b0kVar3);
                        b0kVar3.r(false);
                        f = fValueOf2;
                    } else {
                        b0kVar3.i0(1348663310);
                        f = fValueOf2;
                        ven0VarP = zod.P(mqo1.s(new hsi1[]{new hsi1("titleIn", Float.valueOf(1.0f), fValueOf, pxg1VarJ0, tzg1Var), new hsi1("titleUp", fValueOf, f, pxg1VarJ1, tzg1Var)}), rk41Var.a, (String) null, (Function0) null, (Function0) null, b0kVar3, 8, 28);
                        b0kVar3.r(false);
                    }
                    tob1 tob1VarR = zod.R(new hsi1("subtitleIn", Float.valueOf(!z3 ? 0.0f : 1.0f), f, pxg1VarJ2, tzg1Var), rk41Var.a, (Function0) null, b0kVar3, 8, 4);
                    b0kVar2 = b0kVar3;
                    ven0 ven0VarY = h7w.y(b0kVar2);
                    Object objT5 = b0kVar2.T();
                    if (objT5 == m4cVar2) {
                        objT5 = pzm.i(b0kVar2);
                    }
                    lz20 lz20Var = (lz20) objT5;
                    if (((Boolean) ven0VarY.getValue()).booleanValue()) {
                        b0kVar2.i0(1349699547);
                        Boolean boolValueOf = Boolean.valueOf(rk41Var.a);
                        boolean z4 = (i2 & 112) == 32 || ((i2 & 64) != 0 && b0kVar2.i(rk41Var));
                        Object objT6 = b0kVar2.T();
                        if (z4 || objT6 == m4cVar2) {
                            objT6 = new uka(rk41Var, lz20Var, null, (byte) 3);
                            b0kVar2.s0(objT6);
                        }
                        qxd0.t(boolValueOf, b0kVar2, (vu30) objT6);
                        b0kVar2.r(false);
                    } else {
                        tob1VarR = tob1VarR;
                        b0kVar2.i0(1349988808);
                        b0kVar2.r(false);
                    }
                    qim0 qim0VarThen = vby0.p(u291.d(nim0Var2, 1.0f), lz20Var).then(c030.a);
                    Object objT7 = b0kVar2.T();
                    if (objT7 == m4cVar2) {
                        objT7 = ecd0.W0;
                        b0kVar2.s0(objT7);
                    }
                    qim0 qim0VarB = s161.b(qim0VarThen, true, (iu30) objT7);
                    mbh mbhVarA = jbh.a(h36.e, een.Q0, b0kVar2, 54);
                    int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                    xos0 xos0VarM = b0kVar2.m();
                    qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB);
                    hzj.A.getClass();
                    if (((x340) b0kVar2).a == null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar2.m0();
                    if (((x340) b0kVar2).S) {
                        b0kVar2.l(n4kVar2);
                    } else {
                        b0kVar2.v0();
                    }
                    nko1.H(mbhVarA, b0kVar2, y580.O0);
                    nko1.H(xos0VarM, b0kVar2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                    nko1.F(b0kVar2);
                    nko1.H(qim0VarE, b0kVar2, y580.Y);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(b0kVar2).b;
                    op71.g(b0kVar2, u291.h(nim0Var2, 16.0f));
                    vnr0 vnr0Var = (vnr0) ((shd0) obj).invoke(b0kVar2, 0);
                    qim0 qim0VarZ = uyn1.z(f2, 0.0f, 2, u291.f(nim0Var2, 1.0f));
                    boolean zG3 = b0kVar2.g(ven0VarP);
                    Object objT8 = b0kVar2.T();
                    if (zG3 || objT8 == m4cVar2) {
                        objT8 = new pak(ven0VarP, (byte) 19);
                        b0kVar2.s0(objT8);
                    }
                    qim0 qim0VarC = i541.C(qim0VarZ, (iu30) objT8);
                    Object objT9 = b0kVar2.T();
                    if (objT9 == m4cVar2) {
                        objT9 = new tu9(hdn0Var, (byte) 23);
                        b0kVar2.s0(objT9);
                    }
                    qim0 qim0VarU = lrn1.u(qim0VarC, (iu30) objT9);
                    boolean zG4 = b0kVar2.g(ven0VarP);
                    Object objT10 = b0kVar2.T();
                    if (zG4 || objT10 == m4cVar2) {
                        objT10 = new pak(ven0VarP, (byte) 20);
                        b0kVar2.s0(objT10);
                    }
                    qgo1.f(vnr0Var, eqr0.B(qim0VarU, (iu30) objT10), new a0e1(3), 0, false, (iu30) null, b0kVar2, 8, 56);
                    cvx cvxVar2 = cbx.b(b0kVar2).b;
                    op71.g(b0kVar2, u291.h(nim0Var2, 16.0f));
                    vnr0 vnr0Var2 = (vnr0) ((shd0) this.d).invoke(b0kVar2, 0);
                    qim0 qim0VarZ2 = uyn1.z(f2, 0.0f, 2, u291.f(nim0Var2, 1.0f));
                    Object objT11 = b0kVar2.T();
                    if (objT11 == m4cVar2) {
                        objT11 = new tu9(hdn0Var2, (byte) 24);
                        b0kVar2.s0(objT11);
                    }
                    qim0 qim0VarU2 = lrn1.u(qim0VarZ2, (iu30) objT11);
                    tob1 tob1Var = tob1VarR;
                    boolean zG5 = b0kVar2.g(tob1Var);
                    Object objT12 = b0kVar2.T();
                    if (zG5 || objT12 == m4cVar2) {
                        objT12 = new pak(tob1Var, (byte) 21);
                        b0kVar2.s0(objT12);
                    }
                    qim0 qim0VarC2 = i541.C(qim0VarU2, (iu30) objT12);
                    boolean zG6 = b0kVar2.g(tob1Var);
                    Object objT13 = b0kVar2.T();
                    if (zG6 || objT13 == m4cVar2) {
                        objT13 = new pak(tob1Var, (byte) 22);
                        b0kVar2.s0(objT13);
                    }
                    qgo1.f(vnr0Var2, eqr0.B(qim0VarC2, (iu30) objT13), new a0e1(3), 0, false, (iu30) null, b0kVar2, 8, 56);
                    cvx cvxVar3 = cbx.b(b0kVar2).b;
                    x0d.s(nim0Var2, 16.0f, b0kVar2, true);
                } else {
                    b0kVar2 = b0kVar3;
                    b0kVar2.b0();
                }
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new nca0(this, i2cVar, rk41Var, function0, i, (byte) 13);
                    return;
                }
                return;
            case 1:
                Float fValueOf3 = Float.valueOf(1.0f);
                qk41 qk41Var = (qk41) this.d;
                Float fValueOf4 = Float.valueOf(0.0f);
                m4c m4cVar3 = fkj0.X;
                etj0 etj0Var = (etj0) obj;
                List list = etj0Var.f;
                long j = etj0Var.a;
                c380 c380Var = etj0Var.c;
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.k0(-854519501);
                if ((i & 6) == 0) {
                    i5 = i | (x340Var2.g(i2cVar) ? 4 : 2);
                } else {
                    i5 = i;
                }
                if ((i & 48) == 0) {
                    i5 |= (i & 64) == 0 ? x340Var2.g(rk41Var) : x340Var2.i(rk41Var) ? 32 : 16;
                }
                if ((i & 3072) == 0) {
                    i5 |= x340Var2.i(this) ? 2048 : 1024;
                }
                if (x340Var2.Y(i5 & 1, (i5 & 1043) != 1042)) {
                    ok41 ok41Var = qk41Var instanceof ok41 ? (ok41) qk41Var : null;
                    int i11 = ok41Var != null ? ok41Var.a : 0;
                    ilv.a.getClass();
                    ven0 ven0VarQ = k1p1.q(100, 700, 438, "titleIn", x340Var2, flv.g, rk41Var.a, this.b);
                    boolean z5 = rk41Var.a;
                    vq60 vq60Var = htj0.a;
                    int i12 = i11;
                    ven0 ven0VarQ2 = k1p1.q(i12, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 390, "subtextIn", x340Var2, flv.d, z5, this.b);
                    int i13 = i12;
                    x340Var2 = x340Var2;
                    boolean zIsEmpty = c380Var.isEmpty();
                    boolean z6 = this.b;
                    if (zIsEmpty) {
                        z = z6;
                        n4kVar = n4kVar2;
                        nim0Var = nim0Var2;
                        i6 = i5;
                        i7 = i13;
                        x340Var2.i0(-718288295);
                        x340Var2.r(false);
                        ven0Var = null;
                    } else {
                        z = z6;
                        x340Var2.i0(-718474636);
                        boolean z7 = rk41Var.a;
                        m4h m4hVar = m4h.X0;
                        x340Var2.i0(-81600734);
                        if (c380Var.isEmpty()) {
                            hhg1.n("Failed requirement.");
                            return;
                        }
                        if (z) {
                            i6 = i5;
                            if (c380Var.size() != 1) {
                                x340Var2.i0(-15386816);
                                x340Var2.r(false);
                                List listW1 = o7h.w1(c380Var);
                                ArrayList arrayList = new ArrayList(q7h.U(listW1, 10));
                                Iterator it = listW1.iterator();
                                int i14 = 0;
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    Iterator it2 = it;
                                    int i15 = i14 + 1;
                                    if (i14 < 0) {
                                        p7h.T();
                                        throw null;
                                    }
                                    int i16 = i14;
                                    mmr0 mmr0Var = (mmr0) next;
                                    x340 x340Var3 = x340Var2;
                                    dtj0 dtj0Var = (dtj0) mmr0Var.a;
                                    dtj0 dtj0Var2 = (dtj0) mmr0Var.b;
                                    n4k n4kVar3 = n4kVar2;
                                    String strC = f4i1.c(i15, "tierColor");
                                    long j2 = dtj0Var.b;
                                    long j3 = dtj0Var2.b;
                                    int i17 = i16 == 0 ? StoryCard.CLASSIC_CONTENT_FIELD_NUMBER : 500;
                                    ilv.a.getClass();
                                    arrayList.add(new hsi1(strC, new u7h(j2), new u7h(j3), new pxg1(500, i17, flv.e), new tzg1(m4hVar, new syf(kah.e, (byte) 20))));
                                    i14 = i15;
                                    it = it2;
                                    x340Var2 = x340Var3;
                                    n4kVar2 = n4kVar3;
                                    nim0Var2 = nim0Var2;
                                    i13 = i13;
                                }
                                n4kVar = n4kVar2;
                                nim0Var = nim0Var2;
                                i7 = i13;
                                ven0VarR = zod.P(mqo1.F(arrayList), z7, "tierColor", (Function0) null, (Function0) null, x340Var2, 392, 24);
                                z2 = false;
                            }
                            x340Var2.r(z2);
                            x340Var2.r(z2);
                            ven0Var = ven0VarR;
                        } else {
                            i6 = i5;
                        }
                        n4kVar = n4kVar2;
                        nim0Var = nim0Var2;
                        i7 = i13;
                        x340Var2.i0(-15723166);
                        long j4 = ((dtj0) (z ? o7h.q0(c380Var) : o7h.A0(c380Var))).b;
                        ven0VarR = zod.R(new hsi1("tierColor-static", new u7h(j4), new u7h(j4), irn1.j0(), new tzg1(m4hVar, new syf(kah.e, (byte) 20))), z7, (Function0) null, x340Var2, 8, 4);
                        z2 = false;
                        x340Var2.r(false);
                        x340Var2.r(z2);
                        x340Var2.r(z2);
                        ven0Var = ven0VarR;
                    }
                    if (c380Var.isEmpty()) {
                        u7hVar = null;
                    } else {
                        u7hVar = z ? new u7h(((dtj0) o7h.q0(c380Var)).b) : new u7h(((dtj0) o7h.A0(c380Var)).b);
                    }
                    boolean zF = x340Var2.f(j) | x340Var2.g(list) | x340Var2.g(u7hVar);
                    Object objT14 = x340Var2.T();
                    if (zF || objT14 == m4cVar3) {
                        smc0 smc0VarN = k4p1.n();
                        smc0VarN.add(new rj31("minutesListened", j));
                        smc0VarN.addAll(list);
                        if (u7hVar != null) {
                            smc0VarN.add(new oj31("numberColor", z4p1.G(u7hVar.a)));
                        }
                        objT14 = k4p1.k(smc0VarN);
                        x340Var2.s0(objT14);
                    }
                    List list2 = (List) objT14;
                    Object objT15 = x340Var2.T();
                    if (objT15 == m4cVar3) {
                        objT15 = mno1.a(-2, 0, 6);
                        x340Var2.s0(objT15);
                    }
                    jfe jfeVar = (jfe) objT15;
                    boolean zI = x340Var2.i(jfeVar);
                    Object objT16 = x340Var2.T();
                    if (zI || objT16 == m4cVar3) {
                        objT16 = new zw11((Object) jfeVar, (byte) 16);
                        x340Var2.s0(objT16);
                    }
                    qxd0.i(rih1.a, (iu30) objT16, x340Var2);
                    boolean zG7 = x340Var2.g(ven0Var) | x340Var2.i(jfeVar);
                    Object objT17 = x340Var2.T();
                    if (zG7 || objT17 == m4cVar3) {
                        objT17 = new d7i0(ven0Var, jfeVar, (lnm) null, (byte) 13);
                        x340Var2.s0(objT17);
                    }
                    qxd0.s(jfeVar, ven0Var, (vu30) objT17, x340Var2);
                    ven0 ven0VarY2 = h7w.y(x340Var2);
                    Object objT18 = x340Var2.T();
                    if (objT18 == m4cVar3) {
                        objT18 = pzm.i(x340Var2);
                    }
                    lz20 lz20Var2 = (lz20) objT18;
                    if (((Boolean) ven0VarY2.getValue()).booleanValue()) {
                        x340Var2.i0(-717137730);
                        Boolean boolValueOf2 = Boolean.valueOf(rk41Var.a);
                        boolean z8 = (i6 & 112) == 32 || ((i6 & 64) != 0 && x340Var2.i(rk41Var));
                        Object objT19 = x340Var2.T();
                        if (z8 || objT19 == m4cVar3) {
                            objT19 = new uka(rk41Var, lz20Var2, null, (byte) 5);
                            x340Var2.s0(objT19);
                        }
                        qxd0.t(boolValueOf2, x340Var2, (vu30) objT19);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-716844625);
                        x340Var2.r(false);
                    }
                    boolean z9 = etj0Var.g;
                    tzg1 tzg1Var2 = rno1.a;
                    if (z9 && z) {
                        x340Var2.i0(-716766319);
                        qam1 qam1Var = (qam1) x340Var2.k(sam1.a);
                        hsi1 hsi1Var = new hsi1("revealHapticTrigger", fValueOf4, fValueOf3, new zu91(((ok41) qk41Var).a), tzg1Var2);
                        boolean z10 = rk41Var.a;
                        boolean zI2 = x340Var2.i(qam1Var);
                        Object objT20 = x340Var2.T();
                        if (zI2 || objT20 == m4cVar3) {
                            objT20 = new z8i0(qam1Var, (byte) 20);
                            x340Var2.s0(objT20);
                        }
                        zod.S(hsi1Var, z10, true, (Function0) objT20, x340Var2, 392, 0);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-716276209);
                        x340Var2.r(false);
                    }
                    hsi1 hsi1Var2 = new hsi1("showAudioPreviewChip", fValueOf4, fValueOf3, new zu91(i7), tzg1Var2);
                    boolean z11 = rk41Var.a;
                    boolean z12 = (i6 & 112) == 32 || ((i6 & 64) != 0 && x340Var2.i(rk41Var));
                    Object objT21 = x340Var2.T();
                    if (z12 || objT21 == m4cVar3) {
                        objT21 = new kf6(rk41Var, (byte) 2);
                        x340Var2.s0(objT21);
                    }
                    zod.S(hsi1Var2, z11, this.b, (Function0) objT21, x340Var2, 8, 0);
                    gra graVar = een.h;
                    qim0 qim0VarA = i2cVar.a(u291.c(u291.f(nim0Var, 1.0f), 0.75f), graVar);
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarA);
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
                    nko1.H(xos0VarM2, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE2, x340Var2, y580.Y);
                    htj0.c(48, apo.r(558837500, new zx(this, lz20Var2, ven0Var, ven0VarQ, rk41Var, i2cVar, jfeVar, list2, ven0VarQ2, (byte) 7), x340Var2), x340Var2, (qim0) null);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                h311 h311VarV2 = x340Var2.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new etg0(i, this, i2cVar, rk41Var, function0, (byte) 6);
                    return;
                }
                return;
            case 2:
                m4c m4cVar4 = fkj0.X;
                x340 x340Var4 = (x340) b0kVar;
                x340Var4.k0(1646906013);
                if ((i & 48) == 0) {
                    i8 = ((i & 64) == 0 ? x340Var4.g(rk41Var) : x340Var4.i(rk41Var) ? 32 : 16) | i;
                } else {
                    i8 = i;
                }
                if ((i & 3072) == 0) {
                    i8 |= x340Var4.i(this) ? 2048 : 1024;
                }
                if (x340Var4.Y(i8 & 1, (i8 & 1041) != 1040)) {
                    ven0 ven0VarU = xto.u("ta_single_title", 100, rk41Var.a, this.b, (Function0) null, x340Var4, 54, 16);
                    ven0 ven0VarU2 = xto.u("ta_single_cover", 100, rk41Var.a, this.b, (Function0) null, x340Var4, 54, 16);
                    ven0 ven0VarU3 = xto.u("ta_single_names", 200, rk41Var.a, this.b, (Function0) null, x340Var4, 54, 16);
                    ilv.a.getClass();
                    hsi1 hsi1Var3 = new hsi1("ta_single_desc", Float.valueOf(0.0f), Float.valueOf(1.0f), new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, flv.d), rno1.a);
                    boolean z13 = rk41Var.a;
                    boolean z14 = (i8 & 112) == 32 || ((i8 & 64) != 0 && x340Var4.i(rk41Var));
                    Object objT22 = x340Var4.T();
                    if (z14 || objT22 == m4cVar4) {
                        objT22 = new kf6(rk41Var, (byte) 4);
                        x340Var4.s0(objT22);
                    }
                    ven0 ven0VarS = zod.S(hsi1Var3, z13, this.b, (Function0) objT22, x340Var4, 8, 0);
                    s7f1 s7f1Var = ((u7f1) obj).a;
                    boolean zG8 = x340Var4.g(ven0VarU);
                    Object objT23 = x340Var4.T();
                    if (zG8 || objT23 == m4cVar4) {
                        objT23 = new ctd1(ven0VarU, (byte) 10);
                        x340Var4.s0(objT23);
                    }
                    aym.i(s7f1Var, i541.C(nim0Var2, (iu30) objT23), false, apo.r(-330606212, new kj21(this, ven0VarU2, ven0VarU3, ven0VarS, (byte) 20), x340Var4), x340Var4, 3072, 4);
                    x340Var = x340Var4;
                } else {
                    x340Var = x340Var4;
                    x340Var.b0();
                }
                h311 h311VarV3 = x340Var.v();
                if (h311VarV3 != null) {
                    h311VarV3.d = new uoc1(i, this, i2cVar, rk41Var, function0, (byte) 24);
                    return;
                }
                return;
            case 3:
                x340 x340Var5 = (x340) b0kVar;
                x340Var5.k0(1925530145);
                if ((i & 48) == 0) {
                    i9 = i | ((i & 64) == 0 ? x340Var5.g(rk41Var) : x340Var5.i(rk41Var) ? 32 : 16);
                } else {
                    i9 = i;
                }
                if ((i & 3072) == 0) {
                    i9 |= x340Var5.i(this) ? 2048 : 1024;
                }
                if (x340Var5.Y(i9 & 1, (i9 & 1041) != 1040)) {
                    Object objT24 = x340Var5.T();
                    if (objT24 == fkj0.X) {
                        objT24 = v8r.q(new rfv0(0, 0));
                        x340Var5.s0(objT24);
                    }
                    che0 che0VarV = hon1.v(x340Var5);
                    mod.b(dhe0.a.a(che0VarV), apo.r(-2079856927, new juc1(this, (ven0) objT24, che0VarV, rk41Var), x340Var5), x340Var5, 56);
                } else {
                    x340Var5.b0();
                }
                h311 h311VarV4 = x340Var5.v();
                if (h311VarV4 != null) {
                    h311VarV4.d = new uoc1(i, this, i2cVar, rk41Var, function0, (byte) 28);
                    return;
                }
                return;
            default:
                m4c m4cVar5 = fkj0.X;
                gcf1 gcf1Var = (gcf1) obj;
                b0k b0kVar4 = (x340) b0kVar;
                b0kVar4.k0(-336991812);
                j06 j06Var = ((x340) b0kVar4).a;
                if ((i & 6) == 0) {
                    i10 = i | (b0kVar4.g(i2cVar) ? 4 : 2);
                } else {
                    i10 = i;
                }
                if ((i & 48) == 0) {
                    i10 |= (i & 64) == 0 ? b0kVar4.g(rk41Var) : b0kVar4.i(rk41Var) ? 32 : 16;
                }
                if ((i & 3072) == 0) {
                    i10 |= b0kVar4.i(this) ? 2048 : 1024;
                }
                int i18 = i10;
                if (b0kVar4.Y(i18 & 1, (i18 & 1043) != 1042)) {
                    ven0 ven0VarU4 = xto.u("topPlaylistsSingleCover", 100, rk41Var.a, this.b, (Function0) null, b0kVar4, 54, 16);
                    ven0 ven0VarU5 = xto.u("topPlaylistsSingleTitle", 200, rk41Var.a, this.b, (Function0) null, b0kVar4, 54, 16);
                    ven0 ven0VarU6 = xto.u("topPlaylistsSingleName", 300, rk41Var.a, this.b, (Function0) null, b0kVar4, 54, 16);
                    ilv.a.getClass();
                    hsi1 hsi1Var4 = new hsi1("topPlaylistsSingleDataPoints", Float.valueOf(0.0f), Float.valueOf(1.0f), new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, flv.d), rno1.a);
                    boolean z15 = rk41Var.a;
                    boolean z16 = (i18 & 112) == 32 || ((i18 & 64) != 0 && b0kVar4.i(rk41Var));
                    Object objT25 = b0kVar4.T();
                    if (z16 || objT25 == m4cVar5) {
                        objT25 = new kf6(rk41Var, (byte) 7);
                        b0kVar4.s0(objT25);
                    }
                    ven0 ven0VarS2 = zod.S(hsi1Var4, z15, this.b, (Function0) objT25, b0kVar4, 8, 0);
                    gra graVar2 = een.h;
                    qim0 qim0VarC3 = u291.c(u291.f(i2cVar.a(nim0Var2, graVar2), 1.0f), 0.75f);
                    uwr uwrVar2 = cbx.a;
                    qim0 qim0VarZ3 = uyn1.z(cbx.b(b0kVar4).e.c, 0.0f, 2, qim0VarC3);
                    era eraVar = een.Q0;
                    mbh mbhVarA2 = jbh.a(h36.e, eraVar, b0kVar4, 54);
                    int iHashCode3 = Long.hashCode(((x340) b0kVar4).T);
                    xos0 xos0VarM3 = b0kVar4.m();
                    qim0 qim0VarE3 = zr7.E(b0kVar4, qim0VarZ3);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar4.m0();
                    if (((x340) b0kVar4).S) {
                        b0kVar4.l(n4kVar2);
                    } else {
                        b0kVar4.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(mbhVarA2, b0kVar4, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM3, b0kVar4, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode3);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, b0kVar4, lljVar3);
                    nko1.F(b0kVar4);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE3, b0kVar4, lljVar4);
                    w2g0.c(kx40.h(1.0f, u291.f(nim0Var2, 1.0f), false), graVar2, apo.r(106329480, new xw91(this, ven0VarU4, (byte) 19), b0kVar4), b0kVar4, 3120, 4);
                    b0kVar4 = b0kVar4;
                    qim0 qim0VarO = ab80.o(nim0Var2, cbx.b(b0kVar4).b.b, b0kVar4, nim0Var2, 1.0f);
                    Object objT26 = b0kVar4.T();
                    if (objT26 == m4cVar5) {
                        objT26 = v7f1.Q0;
                        b0kVar4.s0(objT26);
                    }
                    qim0 qim0VarB2 = s161.b(qim0VarO, true, (iu30) objT26);
                    f36 f36Var = h36.c;
                    mbh mbhVarA3 = jbh.a(f36Var, eraVar, b0kVar4, 48);
                    int iHashCode4 = Long.hashCode(((x340) b0kVar4).T);
                    xos0 xos0VarM4 = b0kVar4.m();
                    qim0 qim0VarE4 = zr7.E(b0kVar4, qim0VarB2);
                    b0kVar4.m0();
                    if (((x340) b0kVar4).S) {
                        b0kVar4.l(n4kVar2);
                    } else {
                        b0kVar4.v0();
                    }
                    nko1.H(mbhVarA3, b0kVar4, lljVar);
                    nko1.H(xos0VarM4, b0kVar4, lljVar2);
                    x0d.q(iHashCode4, b0kVar4, lljVar3, b0kVar4);
                    nko1.H(qim0VarE4, b0kVar4, lljVar4);
                    dcf1 dcf1Var = gcf1Var.b;
                    boolean zG9 = b0kVar4.g(ven0VarU5);
                    Object objT27 = b0kVar4.T();
                    if (zG9) {
                        m4cVar = m4cVar5;
                    } else {
                        m4cVar = m4cVar5;
                        if (objT27 == m4cVar) {
                        }
                        qim0 qim0VarC4 = i541.C(nim0Var2, (iu30) objT27);
                        int i19 = (i18 >> 3) & 896;
                        m4c m4cVar6 = m4cVar;
                        f(i19, 0, b0kVar4, dcf1Var, qim0VarC4);
                        cvx cvxVar4 = cbx.b(b0kVar4).b;
                        op71.g(b0kVar4, u291.h(nim0Var2, 8.0f));
                        dcf1 dcf1Var2 = gcf1Var.c;
                        zG = b0kVar4.g(ven0VarU6);
                        objT = b0kVar4.T();
                        if (zG || objT == m4cVar6) {
                            objT = new ctd1(ven0VarU6, (byte) 24);
                            b0kVar4.s0(objT);
                        }
                        f(i19, 0, b0kVar4, dcf1Var2, i541.C(nim0Var2, (iu30) objT));
                        cvx cvxVar5 = cbx.b(b0kVar4).b;
                        qim0 qim0VarO2 = ab80.o(nim0Var2, 16.0f, b0kVar4, nim0Var2, 1.0f);
                        zG2 = b0kVar4.g(ven0VarS2);
                        objT2 = b0kVar4.T();
                        if (zG2 || objT2 == m4cVar6) {
                            objT2 = new ctd1(ven0VarS2, (byte) 25);
                            b0kVar4.s0(objT2);
                        }
                        qim0 qim0VarC5 = i541.C(qim0VarO2, (iu30) objT2);
                        mbh mbhVarA4 = jbh.a(f36Var, eraVar, b0kVar4, 48);
                        int iHashCode5 = Long.hashCode(((x340) b0kVar4).T);
                        xos0 xos0VarM5 = b0kVar4.m();
                        qim0 qim0VarE5 = zr7.E(b0kVar4, qim0VarC5);
                        b0kVar4.m0();
                        if (((x340) b0kVar4).S) {
                            b0kVar4.l(n4kVar2);
                        } else {
                            b0kVar4.v0();
                        }
                        nko1.H(mbhVarA4, b0kVar4, lljVar);
                        nko1.H(xos0VarM5, b0kVar4, lljVar2);
                        x0d.q(iHashCode5, b0kVar4, lljVar3, b0kVar4);
                        nko1.H(qim0VarE5, b0kVar4, lljVar4);
                        f(i19, 2, b0kVar4, gcf1Var.d, null);
                        cvx cvxVar6 = cbx.b(b0kVar4).b;
                        op71.g(b0kVar4, u291.h(nim0Var2, 8.0f));
                        f(i19, 2, b0kVar4, gcf1Var.e, null);
                        us71.m(b0kVar4, true, true, true);
                    }
                    objT27 = new ctd1(ven0VarU5, (byte) 23);
                    b0kVar4.s0(objT27);
                    qim0 qim0VarC6 = i541.C(nim0Var2, (iu30) objT27);
                    int i110 = (i18 >> 3) & 896;
                    m4c m4cVar7 = m4cVar;
                    f(i110, 0, b0kVar4, dcf1Var, qim0VarC6);
                    cvx cvxVar7 = cbx.b(b0kVar4).b;
                    op71.g(b0kVar4, u291.h(nim0Var2, 8.0f));
                    dcf1 dcf1Var3 = gcf1Var.c;
                    zG = b0kVar4.g(ven0VarU6);
                    objT = b0kVar4.T();
                    if (zG) {
                        objT = new ctd1(ven0VarU6, (byte) 24);
                        b0kVar4.s0(objT);
                    } else {
                        objT = new ctd1(ven0VarU6, (byte) 24);
                        b0kVar4.s0(objT);
                    }
                    f(i110, 0, b0kVar4, dcf1Var3, i541.C(nim0Var2, (iu30) objT));
                    cvx cvxVar8 = cbx.b(b0kVar4).b;
                    qim0 qim0VarO3 = ab80.o(nim0Var2, 16.0f, b0kVar4, nim0Var2, 1.0f);
                    zG2 = b0kVar4.g(ven0VarS2);
                    objT2 = b0kVar4.T();
                    if (zG2) {
                        objT2 = new ctd1(ven0VarS2, (byte) 25);
                        b0kVar4.s0(objT2);
                    } else {
                        objT2 = new ctd1(ven0VarS2, (byte) 25);
                        b0kVar4.s0(objT2);
                    }
                    qim0 qim0VarC7 = i541.C(qim0VarO3, (iu30) objT2);
                    mbh mbhVarA5 = jbh.a(f36Var, eraVar, b0kVar4, 48);
                    int iHashCode6 = Long.hashCode(((x340) b0kVar4).T);
                    xos0 xos0VarM6 = b0kVar4.m();
                    qim0 qim0VarE6 = zr7.E(b0kVar4, qim0VarC7);
                    b0kVar4.m0();
                    if (((x340) b0kVar4).S) {
                        b0kVar4.l(n4kVar2);
                    } else {
                        b0kVar4.v0();
                    }
                    nko1.H(mbhVarA5, b0kVar4, lljVar);
                    nko1.H(xos0VarM6, b0kVar4, lljVar2);
                    x0d.q(iHashCode6, b0kVar4, lljVar3, b0kVar4);
                    nko1.H(qim0VarE6, b0kVar4, lljVar4);
                    f(i110, 2, b0kVar4, gcf1Var.d, null);
                    cvx cvxVar9 = cbx.b(b0kVar4).b;
                    op71.g(b0kVar4, u291.h(nim0Var2, 8.0f));
                    f(i110, 2, b0kVar4, gcf1Var.e, null);
                    us71.m(b0kVar4, true, true, true);
                } else {
                    b0kVar4.b0();
                }
                h311 h311VarV5 = b0kVar4.v();
                if (h311VarV5 != null) {
                    h311VarV5.d = new uoc1(i, this, i2cVar, rk41Var, function0, (byte) 29);
                    return;
                }
                return;
        }
    }

    public void e(nbh nbhVar, yj41 yj41Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-63223828);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(nbhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(yj41Var) : x340Var.i(yj41Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarA = nbhVar.a(1.0f, u291.f(nim0.a, 1.0f), false);
            uwr uwrVar = cbx.a;
            w2g0.c(uyn1.x(qim0VarA, cbx.b(x340Var).e.c), een.h, apo.r(1971514562, new xw91(yj41Var, qim0Var, (byte) 16), x340Var), x340Var, 3120, 4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uoc1(i, this, nbhVar, yj41Var, qim0Var, (byte) 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x007f  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    public void f(int i, int i2, b0k b0kVar, vu30 vu30Var, qim0 qim0Var) {
        int i3;
        qim0 qim0Var2;
        boolean z;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(726861423);
        if ((i & 6) == 0) {
            i3 = i | (x340Var.i(vu30Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.g(qim0Var2) ? 32 : 16;
            }
            if ((i3 & 19) != 18) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                qgo1.f((vnr0) vu30Var.invoke(x340Var, Integer.valueOf(i3 & 14)), u291.f(qim0Var4, 1.0f), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
                qim0Var3 = qim0Var4;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new qx1((byte) 24, i, i2, this, vu30Var, qim0Var3);
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            if (i4 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            qgo1.f((vnr0) vu30Var.invoke(x340Var, Integer.valueOf(i3 & 14)), u291.f(qim0Var4, 1.0f), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qx1((byte) 24, i, i2, this, vu30Var, qim0Var3);
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        byte b = this.a;
        pk41 pk41Var = pk41.a;
        Object obj = this.d;
        switch (b) {
            case 0:
                return pk41Var;
            case 1:
                return (qk41) obj;
            case 2:
                return (qk41) obj;
            case 3:
                return pk41Var;
            default:
                return (qk41) obj;
        }
    }

    public thd0(etj0 etj0Var, boolean z) {
        Object ok41Var;
        this.c = etj0Var;
        this.b = z;
        if (z) {
            int size = etj0Var.c.size();
            ok41Var = new ok41(Math.max(800, (size == 0 ? 0 : ((size - 1) * StoryCard.CLASSIC_CONTENT_FIELD_NUMBER) + 500) + 4000));
        } else {
            ok41Var = pk41.a;
        }
        this.d = ok41Var;
    }

    public thd0(u7f1 u7f1Var, boolean z) {
        Object ok41Var;
        this.c = u7f1Var;
        this.b = z;
        if (z) {
            ok41Var = new ok41(2000);
        } else {
            ok41Var = pk41.a;
        }
        this.d = ok41Var;
    }

    public thd0(shd0 shd0Var, shd0 shd0Var2, boolean z) {
        this.c = shd0Var;
        this.d = shd0Var2;
        this.b = z;
    }

    public thd0(gcf1 gcf1Var, boolean z) {
        Object ok41Var;
        this.c = gcf1Var;
        this.b = z;
        if (z) {
            ok41Var = new ok41(2000);
        } else {
            ok41Var = pk41.a;
        }
        this.d = ok41Var;
    }
}
