package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lf6 implements qj41 {
    public final /* synthetic */ byte a;
    public final wj31 b;
    public final List c;
    public final boolean d;
    public final qk41 e;
    public final Object f;
    public final Object g;
    public final Object h;

    public lf6(fbf1 fbf1Var, wj31 wj31Var, List list, oim1 oim1Var, boolean z, ard1 ard1Var) {
        this.a = (byte) 1;
        List list2 = fbf1Var.c;
        this.f = fbf1Var;
        this.b = wj31Var;
        this.c = list;
        this.g = oim1Var;
        this.d = z;
        this.h = ard1Var;
        this.e = (!z || list2.isEmpty()) ? pk41.a : new ok41((p7h.L(list2) * 100) + 900);
    }

    public static final void e(wgm1 wgm1Var, lf6 lf6Var, Map map, rk41 rk41Var, ven0 ven0Var, int i) {
        fbf1 fbf1Var = (fbf1) lf6Var.f;
        StoryCard storyCard = wgm1Var.a;
        if (u890.j(storyCard != null ? storyCard.getId() : null, fbf1Var.a)) {
            cj40 cj40Var = (cj40) fbf1Var.c.get(i);
            ArrayList arrayList = cj40Var.d;
            if (arrayList.isEmpty()) {
                return;
            }
            Integer numValueOf = Integer.valueOf(i);
            Object obj = map.get(numValueOf);
            if (obj == null) {
                obj = 0;
                map.put(numValueOf, obj);
            }
            int iIntValue = ((Number) obj).intValue();
            int size = iIntValue % arrayList.size();
            rx7 rx7Var = (rx7) arrayList.get(size);
            map.put(Integer.valueOf(i), Integer.valueOf(iIntValue + 1));
            ArrayList arrayList2 = cj40Var.e;
            ven0Var.setValue((qia) ((size < 0 || size >= arrayList2.size()) ? new qia(z6x.a, 0.0f, 6) : arrayList2.get(size)));
            ((xgm1) rk41Var.c).a(new lgm1(rx7Var.a, rx7Var.b, rx7Var.c));
        }
    }

    @Override // p.qj41
    public final void a(i2c i2cVar, int i, rk41 rk41Var, Function0 function0, b0k b0kVar, int i2) {
        int i3;
        lf6 lf6Var;
        rk41 rk41Var2;
        int i4;
        m4c m4cVar;
        xd6 xd6Var;
        dw91 dw91Var;
        jkr0 jkr0Var;
        ven0 ven0Var;
        qam1 qam1Var;
        float f;
        p3v p3vVar;
        float f2;
        mmr0 mmr0Var;
        hg6 hg6Var;
        float f3;
        ven0 ven0Var2;
        float f4;
        dw91 dw91Var2;
        boolean z;
        int i5;
        lf6 lf6Var2 = this;
        switch (lf6Var2.a) {
            case 0:
                int i6 = 16384;
                ue6 ue6Var = (ue6) lf6Var2.f;
                ArrayList arrayList = ue6Var.b;
                m4c m4cVar2 = fkj0.X;
                Object obj = rk41Var.c;
                b0k b0kVar2 = (x340) b0kVar;
                b0kVar2.k0(1879649873);
                if ((i2 & 6) == 0) {
                    i3 = i2 | (b0kVar2.g(i2cVar) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= b0kVar2.e(i) ? 32 : 16;
                }
                if ((i2 & 384) == 0) {
                    i3 |= (i2 & 512) == 0 ? b0kVar2.g(rk41Var) : b0kVar2.i(rk41Var) ? 256 : 128;
                }
                if ((i2 & 24576) == 0) {
                    if (!b0kVar2.i(lf6Var2)) {
                        i6 = 8192;
                    }
                    i3 |= i6;
                }
                if (b0kVar2.Y(i3 & 1, (i3 & 8339) != 8338)) {
                    b0kVar2.f0(-1837687529, Integer.valueOf(i));
                    boolean zI = b0kVar2.i(lf6Var2);
                    Object objT = b0kVar2.T();
                    if (zI || objT == m4cVar2) {
                        objT = new i26(lf6Var2, (byte) 3);
                        b0kVar2.s0(objT);
                    }
                    jkr0 jkr0VarB = lkr0.b(0, (Function0) objT, b0kVar2, 0, 3);
                    Object objT2 = b0kVar2.T();
                    if (objT2 == m4cVar2) {
                        objT2 = new dw91();
                        b0kVar2.s0(objT2);
                    }
                    dw91 dw91Var3 = (dw91) objT2;
                    Object objT3 = b0kVar2.T();
                    if (objT3 == m4cVar2) {
                        objT3 = new dw91();
                        b0kVar2.s0(objT3);
                    }
                    dw91 dw91Var4 = (dw91) objT3;
                    Object objT4 = b0kVar2.T();
                    if (objT4 == m4cVar2) {
                        objT4 = new dw91();
                        b0kVar2.s0(objT4);
                    }
                    dw91 dw91Var5 = (dw91) objT4;
                    Object objT5 = b0kVar2.T();
                    if (objT5 == m4cVar2) {
                        objT5 = v8r.q(wgo1.y((se6) arrayList.get(0), 0, tf6.a));
                        b0kVar2.s0(objT5);
                    }
                    ven0 ven0Var3 = (ven0) objT5;
                    m5d0 m5d0Var = (m5d0) ven0Var3.getValue();
                    xf6 xf6Var = (xf6) lf6Var2.g;
                    String str = (String) lf6Var2.h;
                    xgm1 xgm1Var = (xgm1) obj;
                    boolean zI2 = b0kVar2.i(lf6Var2);
                    Object objT6 = b0kVar2.T();
                    if (zI2 || objT6 == m4cVar2) {
                        objT6 = new ve3((Object) lf6Var2, (byte) 21);
                        b0kVar2.s0(objT6);
                    }
                    qgo1.a(m5d0Var, xf6Var, str, xgm1Var, (iu30) objT6, b0kVar2, 0);
                    qam1 qam1Var2 = (qam1) b0kVar2.k(sam1.a);
                    xd6 xd6VarV = mgo1.v(lf6Var2.d && !rk41Var.a, b0kVar2);
                    boolean zB = jkr0VarB.k.b();
                    kl1 kl1Var = jkr0VarB.d;
                    Boolean boolValueOf = Boolean.valueOf(zB);
                    boolean zH = b0kVar2.h(zB) | b0kVar2.g(xd6VarV);
                    Object objT7 = b0kVar2.T();
                    if (zH || objT7 == m4cVar2) {
                        i4 = 0;
                        objT7 = new cf6(zB, xd6VarV, null, (byte) 0);
                        b0kVar2.s0(objT7);
                    } else {
                        i4 = 0;
                    }
                    qxd0.t(boolValueOf, b0kVar2, (vu30) objT7);
                    Object objT8 = b0kVar2.T();
                    if (objT8 == m4cVar2) {
                        objT8 = bb00.h(i4, b0kVar2);
                    }
                    hdn0 hdn0Var = (hdn0) objT8;
                    Integer numValueOf = Integer.valueOf(jkr0VarB.o());
                    boolean zG = b0kVar2.g(jkr0VarB) | b0kVar2.i(lf6Var2) | b0kVar2.i(qam1Var2);
                    Object objT9 = b0kVar2.T();
                    if (zG || objT9 == m4cVar2) {
                        m4cVar = m4cVar2;
                        xd6Var = xd6VarV;
                        dw91Var = dw91Var3;
                        df6 df6Var = new df6((Object) jkr0VarB, (Object) dw91Var, (Object) lf6Var2, (Object) hdn0Var, (Object) ven0Var3, (Object) qam1Var2, (lnm) null, (byte) 0);
                        jkr0Var = jkr0VarB;
                        lf6Var2 = lf6Var2;
                        ven0Var = ven0Var3;
                        qam1Var = qam1Var2;
                        b0kVar2.s0(df6Var);
                        objT9 = df6Var;
                    } else {
                        ven0Var = ven0Var3;
                        m4cVar = m4cVar2;
                        jkr0Var = jkr0VarB;
                        xd6Var = xd6VarV;
                        qam1Var = qam1Var2;
                        dw91Var = dw91Var3;
                    }
                    qxd0.t(numValueOf, b0kVar2, (vu30) objT9);
                    boolean zJ = u890.j(dw91Var5.get(Integer.valueOf(jkr0Var.o())), Boolean.TRUE);
                    Boolean boolValueOf2 = Boolean.valueOf(zJ);
                    boolean zH2 = b0kVar2.h(zJ) | b0kVar2.g(xd6Var);
                    Object objT10 = b0kVar2.T();
                    if (zH2 || objT10 == m4cVar) {
                        objT10 = new cf6(zJ, xd6Var, null, (byte) 1);
                        b0kVar2.s0(objT10);
                    }
                    qxd0.t(boolValueOf2, b0kVar2, (vu30) objT10);
                    wgo1.p(jkr0Var.o(), xgm1Var, b0kVar2, 0);
                    boolean z2 = rk41Var.a;
                    boolean z3 = (i3 & 896) == 256 || ((i3 & 512) != 0 && b0kVar2.i(rk41Var));
                    Object objT11 = b0kVar2.T();
                    if (z3 || objT11 == m4cVar) {
                        objT11 = new kf6(rk41Var, (byte) 0);
                        b0kVar2.s0(objT11);
                    }
                    Float fValueOf = Float.valueOf(0.0f);
                    Float fValueOf2 = Float.valueOf(1.0f);
                    ilv.a.getClass();
                    dw91 dw91Var6 = dw91Var;
                    pxg1 pxg1Var = new pxg1(700, 100, flv.g);
                    tzg1 tzg1Var = rno1.a;
                    hsi1 hsi1Var = new hsi1("artistCardsListTitleEntrance", fValueOf, fValueOf2, pxg1Var, tzg1Var);
                    boolean z4 = lf6Var2.d;
                    ven0 ven0Var4 = ven0Var;
                    ve6 ve6Var = new ve6(zod.S(hsi1Var, z2, z4, (Function0) null, b0kVar2, 8, 8), zod.S(new hsi1("artistCardsListCarouselEntrance", fValueOf, fValueOf2, new pxg1(StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 100, flv.e), tzg1Var), z2, z4, (Function0) objT11, b0kVar2, 8, 0));
                    p3v p3vVarM = yoi1.m(new p3v(i2cVar.c() * 0.6f), new p3v(554.51807f));
                    float f5 = p3vVarM.a;
                    float f6 = pap1.A(new p3v(0.63117874f * f5), new p3v(i2cVar.d() * 0.8f), new p3v(350.0f)).a;
                    float f7 = zjy.p(0.0f, new p3v((i2cVar.d() - f6) / 2.0f)).a;
                    boolean zD = b0kVar2.d(f6);
                    Object objT12 = b0kVar2.T();
                    if (zD || objT12 == m4cVar) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            float f8 = f7;
                            Object next = it.next();
                            Iterator it2 = it;
                            if (next instanceof re6) {
                                arrayList2.add(next);
                            }
                            f7 = f8;
                            it = it2;
                        }
                        f = f7;
                        Iterator it3 = arrayList2.iterator();
                        if (it3.hasNext()) {
                            p3vVar = new p3v(ajo1.E(((re6) it3.next()).b, f6));
                            while (it3.hasNext()) {
                                float f9 = f6;
                                p3v p3vVar2 = new p3v(ajo1.E(((re6) it3.next()).b, f6));
                                if (p3vVar.compareTo(p3vVar2) < 0) {
                                    p3vVar = p3vVar2;
                                }
                                f6 = f9;
                            }
                        } else {
                            p3vVar = null;
                        }
                        f2 = f6;
                        objT12 = ktd.k(p3vVar != null ? p3vVar.a : 0.0f, b0kVar2);
                    } else {
                        f2 = f6;
                        f = f7;
                    }
                    float f10 = yoi1.t(new p3v(((p3v) objT12).a - ((f5 - (f2 / 0.71428573f)) / 2.0f)), new p3v(0.0f), p3vVarM).a * 2.0f;
                    boolean z5 = b0kVar2.k(t4k.n) == flb0.b;
                    boolean zG2 = b0kVar2.g(arrayList);
                    Object objT13 = b0kVar2.T();
                    if (zG2 || objT13 == m4cVar) {
                        ca80 it4 = o7h.u1(arrayList).iterator();
                        do {
                            ca80 ca80Var = it4;
                            if (((Iterator) ca80Var.c).hasNext()) {
                                aa80 aa80Var = (aa80) ca80Var.next();
                                int i7 = aa80Var.a;
                                se6 se6Var = (se6) aa80Var.b;
                                re6 re6Var = se6Var instanceof re6 ? (re6) se6Var : null;
                                mmr0Var = (re6Var == null || (hg6Var = re6Var.b.t) == null) ? null : new mmr0(Integer.valueOf(i7), hg6Var);
                            } else {
                                mmr0Var = null;
                            }
                            b0kVar2.s0(mmr0Var);
                            objT13 = mmr0Var;
                        } while (mmr0Var == null);
                        b0kVar2.s0(mmr0Var);
                        objT13 = mmr0Var;
                    }
                    mmr0 mmr0Var2 = (mmr0) objT13;
                    float fD = i2cVar.d();
                    if (z5) {
                        fD = -fD;
                    }
                    float fX0 = ((wat) b0kVar2.k(t4k.h)).X0(f2 + 20.0f);
                    boolean zI3 = b0kVar2.i(lf6Var2) | b0kVar2.i(qam1Var);
                    Object objT14 = b0kVar2.T();
                    if (zI3 || objT14 == m4cVar) {
                        f3 = fD;
                        ven0Var2 = ven0Var4;
                        f4 = 1.0f;
                        lf6 lf6Var3 = lf6Var2;
                        uh0 uh0Var = new uh0(dw91Var6, lf6Var3, dw91Var4, ven0Var2, qam1Var, (byte) 7);
                        dw91Var2 = dw91Var6;
                        lf6Var2 = lf6Var3;
                        dw91Var4 = dw91Var4;
                        b0kVar2.s0(uh0Var);
                        objT14 = uh0Var;
                    } else {
                        f3 = fD;
                        dw91Var2 = dw91Var6;
                        ven0Var2 = ven0Var4;
                        f4 = 1.0f;
                    }
                    iu30 iu30Var = (iu30) objT14;
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarB = uyn1.B(u291.d(nim0Var, f4), 0.0f, 56.0f, 0.0f, 72.0f, 5);
                    Object objT15 = b0kVar2.T();
                    if (objT15 == m4cVar) {
                        objT15 = t16.a1;
                        b0kVar2.s0(objT15);
                    }
                    qim0 qim0VarB2 = s161.b(qim0VarB, false, (iu30) objT15);
                    dw91 dw91Var7 = dw91Var2;
                    mbh mbhVarA = jbh.a(h36.e, een.Q0, b0kVar2, 54);
                    ven0 ven0Var5 = ven0Var2;
                    int iHashCode = Long.hashCode(((x340) b0kVar2).T);
                    xos0 xos0VarM = b0kVar2.m();
                    qim0 qim0VarE = zr7.E(b0kVar2, qim0VarB2);
                    hzj.A.getClass();
                    if (((x340) b0kVar2).a == null) {
                        tgp1.p();
                        throw null;
                    }
                    b0kVar2.m0();
                    if (((x340) b0kVar2).S) {
                        b0kVar2.l(hmb0.t1);
                    } else {
                        b0kVar2.v0();
                    }
                    nko1.H(mbhVarA, b0kVar2, y580.O0);
                    nko1.H(xos0VarM, b0kVar2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                    nko1.F(b0kVar2);
                    nko1.H(qim0VarE, b0kVar2, y580.Y);
                    err0 err0Var = (err0) kl1Var.c;
                    err0 err0Var2 = (err0) kl1Var.c;
                    int iS = err0Var.s();
                    float fFloatValue = ((Number) ve6Var.a.getValue()).floatValue();
                    boolean z6 = rk41Var.a;
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    vgo1.b(ue6Var, iS, fFloatValue, z6, lf6Var2.d, uyn1.z(cbx.b(b0kVar2).e.c, 0.0f, 2, qim0VarF), b0kVar2, 0);
                    op71.g(b0kVar2, u291.h(nim0Var, cbx.b(b0kVar2).b.c));
                    float f11 = f2;
                    fdr0 fdr0Var = new fdr0(f11);
                    zzq0 zzq0VarH = uyn1.h(2, f, 0.0f);
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    Object objT16 = b0kVar2.T();
                    if (objT16 == m4cVar) {
                        objT16 = t16.b1;
                        b0kVar2.s0(objT16);
                    }
                    qim0 qim0VarH = u291.h(u291.y(u291.h(s161.b(qim0VarF2, false, (iu30) objT16), f5), een.N0, true), f5 + f10);
                    float f12 = f3;
                    boolean zG3 = b0kVar2.g(ve6Var) | b0kVar2.d(f12);
                    Object objT17 = b0kVar2.T();
                    if (zG3 || objT17 == m4cVar) {
                        objT17 = new ef6(ve6Var, f12, (byte) 0);
                        b0kVar2.s0(objT17);
                    }
                    qim0 qim0VarC = i541.C(qim0VarH, (iu30) objT17);
                    m4c m4cVar3 = m4cVar;
                    jkr0 jkr0Var2 = jkr0Var;
                    if6 if6Var = new if6(this, jkr0Var2, rk41Var, i, xd6Var, f11, dw91Var7, dw91Var4, iu30Var, dw91Var5, ven0Var5);
                    lf6Var = this;
                    rk41Var2 = rk41Var;
                    w0h1.c(jkr0Var2, qim0VarC, zzq0VarH, fdr0Var, 1, 20.0f, (pl3) null, (ru91) null, false, (iu30) null, (d6o0) null, (xu91) null, (hxq0) null, apo.r(84410093, if6Var, b0kVar2), b0kVar2, 221184, 16320);
                    b0kVar2 = b0kVar2;
                    cvx cvxVar = cbx.b(b0kVar2).b;
                    op71.g(b0kVar2, u291.h(nim0Var, 16.0f));
                    int iL = jkr0Var2.l();
                    boolean z7 = rk41Var2.a;
                    cvx cvxVar2 = cbx.b(b0kVar2).b;
                    long j = u7h.f;
                    long jB = u7h.b(j, 0.4f, 0.0f, 0.0f, 0.0f, 14);
                    boolean zG4 = b0kVar2.g(ve6Var);
                    Object objT18 = b0kVar2.T();
                    if (zG4 || objT18 == m4cVar3) {
                        objT18 = new ve3((Object) ve6Var, (byte) 22);
                        b0kVar2.s0(objT18);
                    }
                    qim0 qim0VarC2 = i541.C(nim0Var, (iu30) objT18);
                    Object objT19 = b0kVar2.T();
                    if (objT19 == m4cVar3) {
                        objT19 = t16.d1;
                        b0kVar2.s0(objT19);
                    }
                    qgo1.c(iL, jkr0Var2, s161.a(qim0VarC2, (iu30) objT19), lf6Var.d, z7, 6.0f, 8.0f, j, jB, b0kVar2, 114819072);
                    b0kVar2.r(true);
                    if (mmr0Var2 == null) {
                        b0kVar2.i0(-1123100466);
                        z = false;
                        b0kVar2.r(false);
                    } else {
                        b0kVar2.i0(-1123100465);
                        int iIntValue = ((Number) mmr0Var2.a).intValue();
                        hg6 hg6Var2 = (hg6) mmr0Var2.b;
                        float f13 = z5 ? -1.0f : 1.0f;
                        boolean z8 = iIntValue == err0Var2.s();
                        boolean z9 = rk41Var2.a;
                        boolean zE = b0kVar2.e(iIntValue) | b0kVar2.g(jkr0Var2) | b0kVar2.d(fX0) | b0kVar2.d(f13);
                        Object objT20 = b0kVar2.T();
                        if (zE || objT20 == m4cVar3) {
                            objT20 = new jf6(fX0, f13, iIntValue, (kes) jkr0Var2);
                            b0kVar2.s0(objT20);
                        }
                        wgo1.a(hg6Var2, z8, z9, lf6Var.d, i, (Function0) objT20, lrn1.x(u291.d(nim0Var, 1.0f), iIntValue == err0Var2.s() ? 1.0f : -1.0f), b0kVar2, (i3 << 9) & 57344);
                        z = false;
                        b0kVar2.r(false);
                    }
                    b0kVar2.r(z);
                } else {
                    lf6Var = lf6Var2;
                    rk41Var2 = rk41Var;
                    b0kVar2.b0();
                }
                h311 h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new lk0(lf6Var, i2cVar, i, rk41Var2, function0, i2, (byte) 2);
                    return;
                }
                return;
            default:
                m4c m4cVar4 = fkj0.X;
                int i8 = 16384;
                x340 x340Var = (x340) b0kVar;
                x340Var.k0(-1722579727);
                if ((i2 & 6) == 0) {
                    i5 = i2 | (x340Var.g(i2cVar) ? 4 : 2);
                } else {
                    i5 = i2;
                }
                if ((i2 & 48) == 0) {
                    i5 |= x340Var.e(i) ? 32 : 16;
                }
                if ((i2 & 384) == 0) {
                    i5 |= (i2 & 512) == 0 ? x340Var.g(rk41Var) : x340Var.i(rk41Var) ? 256 : 128;
                }
                if ((i2 & 24576) == 0) {
                    if (!x340Var.i(lf6Var2)) {
                        i8 = 8192;
                    }
                    i5 |= i8;
                }
                if (x340Var.Y(i5 & 1, (i5 & 8339) != 8338)) {
                    ven0 ven0VarH = rwq.h(((xgm1) rk41Var.c).getState(), x340Var, 0);
                    boolean z10 = (i5 & 112) == 32;
                    Object objT21 = x340Var.T();
                    if (z10 || objT21 == m4cVar4) {
                        objT21 = v8r.q(Boolean.FALSE);
                        x340Var.s0(objT21);
                    }
                    ven0 ven0Var6 = (ven0) objT21;
                    x340Var.f0(-1836699640, Integer.valueOf(i));
                    wgm1 wgm1Var = (wgm1) ven0VarH.getValue();
                    boolean zBooleanValue = ((Boolean) ven0Var6.getValue()).booleanValue();
                    boolean zG5 = x340Var.g(ven0Var6);
                    Object objT22 = x340Var.T();
                    if (zG5 || objT22 == m4cVar4) {
                        objT22 = new aya1(ven0Var6, (byte) 9);
                        x340Var.s0(objT22);
                    }
                    lf6Var2.d(i2cVar, i, rk41Var, wgm1Var, zBooleanValue, (Function0) objT22, x340Var, (i5 & 1022) | ((i5 << 6) & 3670016));
                    x340Var.r(false);
                } else {
                    x340Var.b0();
                }
                h311 h311VarV2 = x340Var.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new lk0(this, i2cVar, i, rk41Var, function0, i2, (byte) 20);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:211:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:214:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:294:0x08d4  */
    /* JADX WARN: Code duplicated, block: B:297:0x091d  */
    /* JADX WARN: Code duplicated, block: B:300:0x0922  */
    /* JADX WARN: Code duplicated, block: B:301:0x0924  */
    /* JADX WARN: Code duplicated, block: B:305:0x0950  */
    /* JADX WARN: Code duplicated, block: B:307:0x0958  */
    /* JADX WARN: Code duplicated, block: B:308:0x095b  */
    /* JADX WARN: Code duplicated, block: B:312:0x0967  */
    /* JADX WARN: Code duplicated, block: B:316:0x0975 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:319:0x097a  */
    /* JADX WARN: Code duplicated, block: B:338:0x05fa A[SYNTHETIC] */
    public void d(i2c i2cVar, int i, rk41 rk41Var, wgm1 wgm1Var, boolean z, Function0 function0, b0k b0kVar, int i2) {
        lf6 lf6Var;
        b0k b0kVar2;
        h311 h311VarV;
        gbf1 gbf1Var;
        Object obj;
        u7h u7hVar;
        Object qt61Var;
        b0k b0kVar3;
        int i3;
        tob1 tob1Var;
        int i4;
        boolean zI;
        Object objT;
        jfe jfeVar;
        float f;
        qam1 qam1Var;
        b0k b0kVar4;
        cj40 cj40Var;
        iv21 iv21Var;
        lf6 lf6Var2;
        c9n c9nVar;
        tob1 tob1Var2;
        boolean zD;
        Object objT2;
        b0k b0kVar5;
        int i5;
        u7h u7hVar2;
        boolean zD2;
        Object objT3;
        char c;
        Integer num;
        int i6;
        boolean z2;
        Object objT4;
        Object obj2;
        qia qiaVar;
        vnr0 vnr0Var;
        Float fValueOf = Float.valueOf(1.0f);
        fbf1 fbf1Var = (fbf1) this.f;
        String str = fbf1Var.d;
        List list = fbf1Var.c;
        Float fValueOf2 = Float.valueOf(0.0f);
        Object obj3 = fkj0.X;
        b0k b0kVar6 = (x340) b0kVar;
        b0kVar6.k0(-721855776);
        j06 j06Var = ((x340) b0kVar6).a;
        int i7 = (i2 & 6) == 0 ? i2 | (b0kVar6.g(i2cVar) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i7 |= b0kVar6.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i7 |= (i2 & 512) == 0 ? b0kVar6.g(rk41Var) : b0kVar6.i(rk41Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i7 |= b0kVar6.i(wgm1Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i7 |= b0kVar6.h(z) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i7 |= b0kVar6.i(function0) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i7 |= b0kVar6.i(this) ? 1048576 : 524288;
        }
        int i8 = i7;
        if (b0kVar6.Y(i8 & 1, (i8 & 599187) != 599186)) {
            pxg1 pxg1Var = zaf1.c;
            boolean z3 = (((wat) b0kVar6.k(t4k.h)).U0() - 1.0f) * 32.0f >= 10.0f;
            b0kVar6.i0(2057290567);
            List list2 = list;
            boolean z4 = z3;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                cj40 cj40Var2 = (cj40) it.next();
                vnr0 vnr0Var2 = (vnr0) cj40Var2.b.invoke(b0kVar6, 0);
                Iterator it2 = it;
                kor0 kor0VarF = vnr0Var2.c;
                if (kor0VarF instanceof jor0) {
                    jor0 jor0Var = (jor0) kor0VarF;
                    kor0VarF = jor0.f(jor0Var, new gor0(16.0f, 32.0f, 4, 0, 0L), z4 ? new cjc0(1) : jor0Var.c, 57);
                } else {
                    vnr0Var2 = vnr0Var2;
                }
                kor0 kor0Var = kor0VarF;
                vnr0 vnr0Var3 = (vnr0) cj40Var2.a.invoke(b0kVar6, 0);
                vu30 vu30Var = cj40Var2.c;
                if (vu30Var == null) {
                    b0kVar6.i0(-207729835);
                    b0kVar6.r(false);
                    vnr0Var = null;
                } else {
                    b0kVar6.i0(-1669268948);
                    vnr0Var = (vnr0) vu30Var.invoke(b0kVar6, 0);
                    b0kVar6.r(false);
                }
                arrayList.add(new iv21(vnr0.a(vnr0Var3, (String) null, lee1.a(vnr0Var3.b, 0L, zaf1.a, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), (kor0) null, 0L, 29), vnr0.a(vnr0Var2, (String) null, (lee1) null, kor0Var, 0L, 27), vnr0Var != null ? vnr0.a(vnr0Var, (String) null, lee1.a(vnr0Var.b, 0L, zaf1.b, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), (kor0) null, 0L, 29) : null));
                it = it2;
            }
            b0kVar6.r(false);
            ven0 ven0VarS = v8r.s(b0kVar6.k(yhm1.a), b0kVar6);
            boolean zIsEmpty = arrayList.isEmpty();
            rih1 rih1Var = rih1.a;
            if (zIsEmpty) {
                b0kVar6.i0(96209930);
                boolean z5 = (i8 & 896) == 256 || ((i8 & 512) != 0 && b0kVar6.i(rk41Var));
                Object objT5 = b0kVar6.T();
                if (z5 || objT5 == obj3) {
                    objT5 = new jkz0(rk41Var, null, (byte) 1);
                    b0kVar6.s0(objT5);
                }
                qxd0.t(rih1Var, b0kVar6, (vu30) objT5);
                b0kVar6.r(false);
                h311VarV = b0kVar6.v();
                if (h311VarV == null) {
                    return;
                } else {
                    gbf1Var = new gbf1(this, i2cVar, i, rk41Var, wgm1Var, z, function0, i2, (byte) 0);
                }
            } else {
                b0kVar6.i0(96325250);
                b0kVar6.r(false);
                boolean zG = b0kVar6.g(str);
                Object objT6 = b0kVar6.T();
                if (zG || objT6 == obj3) {
                    objT6 = zaf1.d(str);
                    b0kVar6.s0(objT6);
                }
                u7h u7hVar3 = (u7h) objT6;
                boolean zG2 = b0kVar6.g(list);
                Object objT7 = b0kVar6.T();
                if (zG2 || objT7 == obj3) {
                    List list3 = list;
                    ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(zaf1.d(((cj40) it3.next()).f));
                    }
                    b0kVar6.s0(arrayList2);
                    obj = arrayList2;
                } else {
                    obj = objT7;
                }
                List list4 = (List) obj;
                Object objT8 = b0kVar6.T();
                if (objT8 == obj3) {
                    objT8 = v8r.q(0);
                    b0kVar6.s0(objT8);
                }
                tob1 tob1Var3 = (ven0) objT8;
                Object objT9 = b0kVar6.T();
                if (objT9 == obj3) {
                    objT9 = new LinkedHashMap();
                    b0kVar6.s0(objT9);
                }
                Map map = (Map) objT9;
                Object objT10 = b0kVar6.T();
                if (objT10 == obj3) {
                    cj40 cj40Var3 = (cj40) o7h.s0(list);
                    if (cj40Var3 == null || (qiaVar = (qia) o7h.s0(cj40Var3.e)) == null) {
                        qiaVar = new qia(z6x.a, 0.0f, 6);
                    }
                    objT10 = v8r.q(qiaVar);
                    b0kVar6.s0(objT10);
                } else {
                    tob1Var3 = tob1Var3;
                    map = map;
                    list = list;
                }
                tob1 tob1Var4 = (ven0) objT10;
                Integer num2 = (Integer) tob1Var3.getValue();
                if (num2 == null || (u7hVar = (u7h) o7h.t0(num2.intValue(), list4)) == null) {
                    u7hVar = (u7h) o7h.s0(list4);
                }
                int iH = hjl.h(i2cVar.b);
                boolean z6 = rk41Var.a;
                Boolean boolValueOf = Boolean.valueOf(z6);
                u7h u7hVar4 = u7hVar;
                int i9 = i8 & 896;
                boolean zI2 = ((i8 & 57344) == 16384) | (i9 == 256 || ((i8 & 512) != 0 && b0kVar6.i(rk41Var))) | b0kVar6.i(wgm1Var) | b0kVar6.i(this) | ((i8 & 458752) == 131072);
                Object objT11 = b0kVar6.T();
                if (zI2 || objT11 == obj3) {
                    b0kVar3 = b0kVar6;
                    i3 = i8;
                    qt61Var = new qt61(z, rk41Var, wgm1Var, this, function0, map, tob1Var4, (lnm) null);
                    tob1Var = tob1Var4;
                    b0kVar3.s0(qt61Var);
                } else {
                    qt61Var = objT11;
                    tob1Var = tob1Var4;
                    b0kVar3 = b0kVar6;
                    i3 = i8;
                }
                qxd0.s(wgm1Var, boolValueOf, (vu30) qt61Var, b0kVar3);
                boolean z7 = i9 == 256 || ((i3 & 512) != 0 && b0kVar3.i(rk41Var));
                Object objT12 = b0kVar3.T();
                if (z7 || objT12 == obj3) {
                    objT12 = new hbf1(rk41Var, tob1Var3, null, (byte) 0);
                    b0kVar3.s0(objT12);
                }
                qxd0.t(rih1Var, b0kVar3, (vu30) objT12);
                qam1 qam1Var2 = (qam1) b0kVar3.k(sam1.a);
                Object objT13 = b0kVar3.T();
                if (objT13 == obj3) {
                    objT13 = qxd0.M(o6x.a, b0kVar3);
                    b0kVar3.s0(objT13);
                }
                c9n c9nVar2 = (c9n) objT13;
                boolean zG3 = b0kVar3.g((qia) tob1Var.getValue());
                Object objT14 = b0kVar3.T();
                if (zG3 || objT14 == obj3) {
                    objT14 = (jia) ((oim1) 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0497: CHECK_CAST (r7v8 'objT14' java.lang.Object) = (p.jia) (wrap java.lang.Object:0x0492: INVOKE 
                          (wrap p.oim1:0x048a: CHECK_CAST (p.oim1) (wrap java.lang.Object:0x0488: IGET (r4v2 'this' ?? I:??[OBJECT, ARRAY] A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:116) p.lf6.g java.lang.Object))
                          (wrap p.qia:0x0490: CHECK_CAST (p.qia) (wrap java.lang.Object:0x048c: INVOKE (r35v2 'tob1Var' p.tob1) INTERFACE call: p.tob1.getValue():java.lang.Object A[WRAPPED] (LINE:117)))
                         VIRTUAL call: p.oim1.invoke(java.lang.Object):java.lang.Object A[MD:(java.lang.Object):java.lang.Object (m), WRAPPED] (LINE:118)) in method: p.lf6.d(p.i2c, int, p.rk41, p.wgm1, boolean, kotlin.jvm.functions.Function0, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes5.dex
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
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v2 ??
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 2533
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.lf6.d(p.i2c, int, p.rk41, p.wgm1, boolean, kotlin.jvm.functions.Function0, p.b0k, int):void");
                }

                @Override // p.qj41
                public final qk41 getDuration() {
                    byte b = this.a;
                    return this.e;
                }

                public lf6(ue6 ue6Var, wj31 wj31Var, List list, boolean z, xf6 xf6Var, String str) {
                    this.a = (byte) 0;
                    this.f = ue6Var;
                    this.b = wj31Var;
                    this.c = list;
                    this.d = z;
                    this.g = xf6Var;
                    this.h = str;
                    this.e = pk41.a;
                }
            }
