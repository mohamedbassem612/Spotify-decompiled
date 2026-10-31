package p;

import android.view.View;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class e1c extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1c(ven0 ven0Var, zks0 zks0Var, wm1 wm1Var, abf abfVar, xpi0 xpi0Var, jwm jwmVar, ven0 ven0Var2, ven0 ven0Var3, b921 b921Var) {
        super(3);
        this.a = (byte) 1;
        this.b = ven0Var;
        this.c = zks0Var;
        this.d = wm1Var;
        this.e = abfVar;
        this.f = xpi0Var;
        this.g = jwmVar;
        this.h = ven0Var2;
        this.i = ven0Var3;
        this.t = b921Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        Object lhxVar;
        m4c m4cVar;
        HashMap map;
        View view;
        ven0 ven0Var;
        HashMap map2;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            bw91 bw91Var = (bw91) this.c;
            HashMap map3 = (HashMap) this.e;
            View view2 = (View) this.g;
            iu30 iu30Var = (iu30) this.d;
            ven0 ven0Var2 = (ven0) this.b;
            ven0 ven0Var3 = (ven0) this.f;
            ven0 ven0Var4 = (ven0) this.h;
            ven0 ven0Var5 = (ven0) this.i;
            iu30 iu30Var2 = (iu30) this.t;
            int i = 0;
            for (int size = bw91Var.size(); i < size; size = size) {
                ee21 ee21Var = (ee21) bw91Var.get(i);
                otl otlVar = ee21Var.a;
                x340Var2.f0(-152087048, otlVar.getId());
                Object objT = x340Var2.T();
                m4c m4cVar2 = fkj0.X;
                if (objT == m4cVar2) {
                    objT = yv91.a(new t3x(ee21Var, ven0Var2, (byte) 27));
                    x340Var2.s0(objT);
                }
                tob1 tob1Var = (tob1) objT;
                String id = otlVar.getId();
                boolean zI = x340Var2.i(map3) | x340Var2.i(ee21Var);
                ven0 ven0Var6 = ven0Var4;
                Object objT2 = x340Var2.T();
                if (zI || objT2 == m4cVar2) {
                    objT2 = new zf10(map3, ee21Var, (byte) 9);
                    x340Var2.s0(objT2);
                }
                qxd0.i(id, (iu30) objT2, x340Var2);
                String str = "filter_reordering_chip_" + otlVar.getId();
                qim0 qim0VarC = nim0.a;
                qim0 qim0VarN = anm1.N(str, qim0VarC);
                boolean zI2 = x340Var2.i(map3) | x340Var2.i(ee21Var);
                Object objT3 = x340Var2.T();
                if (zI2 || objT3 == m4cVar2) {
                    HashMap map4 = map3;
                    m4cVar = m4cVar2;
                    map = map4;
                    lhxVar = new lhx(map, ee21Var, ven0Var2, ven0Var3, (byte) 9);
                    x340Var2.s0(lhxVar);
                } else {
                    lhxVar = objT3;
                    map = map3;
                    m4cVar = m4cVar2;
                }
                qim0 qim0VarX = ern1.x(qim0VarN, (iu30) lhxVar);
                if (((Boolean) tob1Var.getValue()).booleanValue()) {
                    x340Var2.i0(-418830919);
                    qim0 qim0VarX2 = lrn1.x(qim0VarC, 1.0f);
                    Object objT4 = x340Var2.T();
                    if (objT4 == m4cVar) {
                        objT4 = new d7v(ven0Var3, (byte) 28);
                        x340Var2.s0(objT4);
                    }
                    qim0VarC = i541.C(qim0VarX2, (iu30) objT4);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-418565032);
                    x340Var2.r(false);
                }
                qim0 qim0VarThen = qim0VarX.then(qim0VarC);
                String id2 = otlVar.getId();
                boolean zI3 = x340Var2.i(view2) | x340Var2.i(ee21Var) | x340Var2.g(iu30Var) | x340Var2.i(map);
                Object objT5 = x340Var2.T();
                if (zI3 || objT5 == m4cVar) {
                    HashMap map5 = map;
                    View view3 = view2;
                    jc20 jc20Var = new jc20(view3, ee21Var, ven0Var2, ven0Var3, ven0Var6, iu30Var, bw91Var, map5, ven0Var5);
                    view = view3;
                    ven0Var = ven0Var6;
                    map2 = map5;
                    x340Var2.s0(jc20Var);
                    objT5 = jc20Var;
                } else {
                    ven0Var = ven0Var6;
                    view = view2;
                    map2 = map;
                }
                qim0 qim0VarB = f8d1.b(qim0VarThen, id2, (PointerInputEventHandler) objT5);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
                hzj.A.getClass();
                j2i j2iVarR = null;
                if (x340Var2.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(hmb0.t1);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC, x340Var2, y580.O0);
                nko1.H(xos0VarM, x340Var2, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                nko1.F(x340Var2);
                nko1.H(qim0VarE, x340Var2, y580.Y);
                String str2 = ee21Var.b;
                Object objT6 = x340Var2.T();
                if (objT6 == m4cVar) {
                    objT6 = ny00.W0;
                    x340Var2.s0(objT6);
                }
                Function0 function0 = (Function0) objT6;
                if (ihc1.y0(str2)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                gbx gbxVar = new gbx(new y50(str2), function0);
                lex lexVarZ = yoo1.z(x340Var2);
                nex nexVar = new nex(8);
                if (otlVar instanceof vod1) {
                    x340Var2.i0(-557022355);
                    j2iVarR = apo.r(-1542103158, new xx00(ee21Var, iu30Var2, bw91Var, (byte) 11), x340Var2);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-556148403);
                    x340Var2.r(false);
                }
                poo1.e(gbxVar, nexVar, lexVarZ, (qim0) null, 0, (String) null, (max) null, uoi.a, j2iVarR, (idn0) null, (ga80) null, false, (vzq0) null, apo.r(2139589226, new rr10(ee21Var, (byte) 6), x340Var2), x340Var2, 12582912, 3072, 7800);
                x340Var2.r(true);
                x340Var2.r(false);
                bw91Var = bw91Var;
                i++;
                map3 = map2;
                view2 = view;
                iu30Var = iu30Var;
                ven0Var2 = ven0Var2;
                ven0Var3 = ven0Var3;
                ven0Var4 = ven0Var;
                ven0Var5 = ven0Var5;
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:333:0x0e6a  */
    /* JADX WARN: Code duplicated, block: B:336:0x0e82  */
    /* JADX WARN: Code duplicated, block: B:337:0x0e8c  */
    /* JADX WARN: Code duplicated, block: B:340:0x0eaa  */
    /* JADX WARN: Code duplicated, block: B:344:0x0ec4  */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        int i;
        int i2;
        ar41 ar41Var;
        Object obj4;
        lfv0 lfv0Var;
        float f;
        m4c m4cVar;
        boolean z;
        pob0 pob0Var;
        lbh lbhVar;
        tob1 tob1Var;
        iu30 iu30Var;
        List list;
        boolean z2;
        Integer num;
        boolean zG;
        Object objT;
        boolean zI;
        Object objT2;
        boolean z3;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.b;
        Object obj6 = this.i;
        Object obj7 = this.g;
        Object obj8 = this.f;
        Object obj9 = this.h;
        Object obj10 = this.t;
        Object obj11 = this.d;
        Object obj12 = this.c;
        Object obj13 = this.e;
        switch (b) {
            case 0:
                i2c i2cVar = (i2c) obj;
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                ven0 ven0Var = (ven0) obj5;
                vzq0 vzq0Var = (vzq0) obj8;
                iu30 iu30Var2 = (iu30) obj11;
                List list2 = (c380) obj12;
                if (!list2.isEmpty()) {
                    x340 x340Var2 = x340Var;
                    Object objT3 = x340Var2.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT3 == m4cVar2) {
                        objT3 = v8r.q(Boolean.FALSE);
                        x340Var2.s0(objT3);
                    }
                    ven0 ven0Var2 = (ven0) objT3;
                    Object objT4 = x340Var2.T();
                    if (objT4 == m4cVar2) {
                        objT4 = v8r.q((Object) null);
                        x340Var2.s0(objT4);
                    }
                    tob1 tob1Var2 = (ven0) objT4;
                    kiv kivVar = t4k.h;
                    wat watVar = (wat) x340Var2.k(kivVar);
                    flb0 flb0Var = (flb0) x340Var2.k(t4k.n);
                    Object objT5 = x340Var2.T();
                    if (objT5 == m4cVar2) {
                        objT5 = qxd0.M(o6x.a, x340Var2);
                        x340Var2.s0(objT5);
                    }
                    c9n c9nVar = (c9n) objT5;
                    float fX0 = watVar.X0(uyn1.n(vzq0Var, flb0Var));
                    float fX1 = watVar.X0(uyn1.m(vzq0Var, flb0Var));
                    p3v p3vVar = (p3v) obj9;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((watVar.X0(i2cVar.d()) - fX0) - fX1)) << 32) | (((long) Float.floatToRawIntBits(watVar.X0(p3vVar != null ? p3vVar.a : i2cVar.c()) - watVar.X0(vzq0Var.a()))) & 4294967295L);
                    float fX = pxd0.x(x340Var2);
                    float fX2 = watVar.X0(fX);
                    x340Var2.i0(416766509);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    float fX3 = watVar.X0(16.0f);
                    x340Var2.r(false);
                    float f2 = fX2 * 1.35f;
                    float fX4 = watVar.X0(160.0f);
                    int i3 = (int) (jFloatToRawIntBits >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i3) - (fX3 * 2.0f);
                    if (fX4 > fIntBitsToFloat) {
                        fX4 = fIntBitsToFloat;
                    }
                    float f3 = 0.866f * f2;
                    int size = (list2.size() + 1) / 2;
                    if (size < 1) {
                        size = 1;
                    }
                    int i4 = (int) (jFloatToRawIntBits & 4294967295L);
                    if (Float.intBitsToFloat(i4) < fX2) {
                        i2 = 1;
                        i = 1;
                    } else if (f3 <= 0.0f || fX2 <= 0.0f) {
                        i = 1;
                        i2 = 1;
                    } else {
                        i = 1;
                        int iIntBitsToFloat = ((int) ((Float.intBitsToFloat(i4) - fX2) / f3)) + 1;
                        i2 = iIntBitsToFloat < 1 ? 1 : iIntBitsToFloat;
                    }
                    int iMin = Math.min(size, i2);
                    wat watVar2 = (wat) x340Var2.k(kivVar);
                    yae1 yae1VarQ = d5p1.q(0, x340Var2, i);
                    float fM0 = watVar2.M0((int) (yae1.a(yae1VarQ, "Ag", cbx.d(x340Var2).h, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c & 4294967295L)) * 2.0f;
                    float fM1 = watVar2.M0((int) (yae1.a(yae1VarQ, "Ag", cbx.d(x340Var2).j, 0, false, 0, 0L, (flb0) null, (xat) null, 1020).c & 4294967295L));
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    cvx cvxVar4 = cbx.b(x340Var2).b;
                    float f4 = fM0 + fM1 + 32.0f + 16.0f + 32.0f;
                    kiv kivVar2 = alg0.a;
                    float fX5 = watVar.X0(f4 + 16.0f);
                    float fX6 = watVar.X0(16.0f);
                    df41 df41VarT = kyo1.t(zib0.U0, k9b0.a1);
                    Object[] objArr = new Object[0];
                    boolean z4 = ((((438 & 14) ^ 6) > 4 && x340Var2.e(0)) || (438 & 6) == 4) | ((((438 & 112) ^ 48) > 32 && x340Var2.d(1.0f)) || (438 & 48) == 32) | ((((438 & 896) ^ 384) > 256 && x340Var2.d(1.0f)) || (438 & 384) == 256);
                    Object objT6 = x340Var2.T();
                    if (z4 || objT6 == fkj0.X) {
                        objT6 = new qob0(0, 1.0f, 1.0f);
                        x340Var2.s0(objT6);
                    }
                    pob0 pob0Var2 = (pob0) k5p1.t(objArr, df41VarT, "LazyCanvasState", (Function0) objT6, x340Var2, 384, 0);
                    tz20 tz20Var = (tz20) pob0Var2.c.getValue();
                    qz20 qz20Var = tz20Var instanceof qz20 ? (qz20) tz20Var : null;
                    Integer numValueOf = qz20Var != null ? Integer.valueOf(qz20Var.a) : null;
                    boolean zD = x340Var2.d(fX4) | x340Var2.d(fX2) | x340Var2.e(iMin) | x340Var2.e(list2.size());
                    Object objT7 = x340Var2.T();
                    if (zD || objT7 == m4cVar2) {
                        objT7 = new lbh(new n511(fX6, 0.0f, fX6, 0.0f), list2.size(), iMin, f2, (((long) Float.floatToRawIntBits(fX4)) << 32) | (((long) Float.floatToRawIntBits(fX2)) & 4294967295L));
                        x340Var2.s0(objT7);
                    }
                    lbh lbhVar2 = (lbh) objT7;
                    boolean zG2 = x340Var2.g(lbhVar2) | x340Var2.f(jFloatToRawIntBits) | x340Var2.d(fX6);
                    Object objT8 = x340Var2.T();
                    if (zG2 || objT8 == m4cVar2) {
                        ArrayList arrayList = lbhVar2.c;
                        int i5 = lbhVar2.b;
                        if (i5 == 0) {
                            float fIntBitsToFloat2 = Float.intBitsToFloat(i3) / 2.0f;
                            ar41Var = new ar41(0.0f, 0.0f, fIntBitsToFloat2, fIntBitsToFloat2, fIntBitsToFloat2, 1.0f);
                        } else {
                            n511 n511Var = (n511) arrayList.get(0);
                            n511 n511Var2 = (n511) arrayList.get(i5 - 1);
                            float f5 = n511Var.a - fX6;
                            float fIntBitsToFloat3 = (n511Var2.c - Float.intBitsToFloat(i3)) + fX6;
                            float fIntBitsToFloat4 = Float.intBitsToFloat(i3) / 2.0f;
                            float fIntBitsToFloat5 = Float.intBitsToFloat((int) (n511Var.f() >> 32)) - f5;
                            float fIntBitsToFloat6 = Float.intBitsToFloat((int) (n511Var2.f() >> 32)) - fIntBitsToFloat3;
                            float fMin = Math.min(Float.intBitsToFloat(i3) * 0.5f, (fIntBitsToFloat3 - f5) / 2.0f);
                            ar41Var = new ar41(f5, fIntBitsToFloat3, fIntBitsToFloat4, fIntBitsToFloat5, fIntBitsToFloat6, fMin < 1.0f ? 1.0f : fMin);
                        }
                        objT8 = ar41Var;
                        x340Var2.s0(objT8);
                    }
                    ar41 ar41Var2 = (ar41) objT8;
                    boolean z5 = ar41Var2.b > ar41Var2.a;
                    Object objT9 = x340Var2.T();
                    if (objT9 == m4cVar2) {
                        objT9 = yv91.a(new rqa((Object) ar41Var2, (Object) pob0Var2, (byte) 10));
                        x340Var2.s0(objT9);
                    }
                    tob1 tob1Var3 = (tob1) objT9;
                    d0r d0rVar = (d0r) obj6;
                    Object objT10 = x340Var2.T();
                    if (objT10 == m4cVar2) {
                        objT10 = new rhg0(d0rVar, (ukj0) null);
                        x340Var2.s0(objT10);
                    }
                    rhg0 rhg0Var = (rhg0) objT10;
                    Object objT11 = x340Var2.T();
                    if (objT11 == m4cVar2) {
                        objT11 = yv91.a(new rqa((Object) pob0Var2, (Object) lbhVar2, (byte) 11));
                        x340Var2.s0(objT11);
                    }
                    tob1 tob1Var4 = (tob1) objT11;
                    Object[] objArr2 = new Object[0];
                    Object objT12 = x340Var2.T();
                    if (objT12 == m4cVar2) {
                        objT12 = cu9.b1;
                        x340Var2.s0(objT12);
                    }
                    ven0 ven0Var3 = (ven0) k5p1.s(objArr2, (Function0) objT12, x340Var2, 48);
                    Map map = (Map) tob1Var4.getValue();
                    Integer num2 = numValueOf;
                    boolean zI2 = x340Var2.i(tob1Var4) | x340Var2.g(iu30Var2) | x340Var2.i(list2) | x340Var2.g(numValueOf) | x340Var2.i((tyq) obj13) | x340Var2.i(rhg0Var);
                    iu30 iu30Var3 = (iu30) obj11;
                    c380 c380Var = (c380) obj12;
                    tyq tyqVar = (tyq) obj13;
                    Object objT13 = x340Var2.T();
                    if (zI2 || objT13 == m4cVar2) {
                        objT13 = new df6(rhg0Var, tob1Var4, iu30Var3, c380Var, num2, tyqVar, (lnm) null, (byte) 3);
                        x340Var2.s0(objT13);
                    }
                    qxd0.s(map, num2, (vu30) objT13, x340Var2);
                    n511 n511Var3 = lbhVar2.k;
                    float f6 = zjy.p(fX, new p3v(watVar.N0(n511Var3.d - n511Var3.b))).a;
                    float fA = vzq0Var.a();
                    Object[] objArr3 = {Boolean.valueOf(z5), Boolean.valueOf(pob0Var2.d()), new Size(pob0Var2.c().d), Float.valueOf(pob0Var2.c().c), lbhVar2};
                    boolean zH = x340Var2.h(z5) | x340Var2.i(pob0Var2) | x340Var2.i(lbhVar2);
                    Object objT14 = x340Var2.T();
                    if (zH || objT14 == m4cVar2) {
                        objT14 = new w0c(z5, pob0Var2, lbhVar2, null, (byte) 0);
                        obj4 = null;
                        x340Var2.s0(objT14);
                    } else {
                        obj4 = null;
                    }
                    qxd0.u(objArr3, (vu30) objT14, x340Var2);
                    if (num2 == 0 || !((Boolean) ven0Var2.getValue()).booleanValue()) {
                        f = 0.0f;
                        lfv0Var = new lfv0(0.0f, false, i2 == 1);
                    } else {
                        n511 n511Var4 = (n511) ((Map) tob1Var4.getValue()).get(num2);
                        float fX7 = watVar.X0(80.0f);
                        int height = ((View) obj7).getHeight();
                        fjk1 fjk1VarC = pob0Var2.c();
                        ur80 ur80Var = (ur80) ven0Var.getValue();
                        if (n511Var4 == null) {
                            lfv0Var = new lfv0(0.0f, false, true);
                        } else {
                            int iU = jch0.U(Float.intBitsToFloat((int) (d3p1.J(fjk1VarC, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n511Var4.f() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(n511Var4.b + fX7)) & 4294967295L)) & 4294967295L))) + ur80Var.b;
                            int i6 = height - iU;
                            int iU2 = iU - jch0.U(fX7);
                            boolean z6 = iU2 > i6;
                            float f7 = z6 ? iU2 : i6;
                            lfv0Var = new lfv0(f7, z6, i2 == 1 || f7 < fX5);
                        }
                        f = 0.0f;
                    }
                    qim0 qim0VarB = uyn1.B(u291.h(u291.j(fX + fA, f, 2, nim0Var), f6 + fA), 0.0f, 0.0f, 0.0f, fA, 7);
                    Boolean bool = (Boolean) ven0Var2.getValue();
                    bool.getClass();
                    boolean zI3 = x340Var2.i(ven0Var2);
                    Object objT15 = x340Var2.T();
                    if (zI3 || objT15 == m4cVar2) {
                        objT15 = new p6b(ven0Var2, (byte) 1);
                        x340Var2.s0(objT15);
                    }
                    qim0 qim0VarB2 = f8d1.b(qim0VarB, bool, (PointerInputEventHandler) objT15);
                    c380 c380Var2 = (c380) obj12;
                    vu30 vu30Var = (vu30) obj10;
                    iu30 iu30Var4 = (iu30) obj11;
                    tyq tyqVar2 = (tyq) obj13;
                    lfv0 lfv0Var2 = lfv0Var;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarB2);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw obj4;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    boolean zI4 = x340Var2.i(c380Var2) | x340Var2.g(num2) | x340Var2.i(ven0Var2) | x340Var2.g(vu30Var) | x340Var2.g(ar41Var2) | x340Var2.h(z5) | x340Var2.i(c9nVar) | x340Var2.i(pob0Var2) | x340Var2.i(lbhVar2) | x340Var2.g(iu30Var4) | x340Var2.i(tyqVar2) | x340Var2.i(ven0Var3);
                    boolean z7 = lfv0Var2.a;
                    boolean zH2 = zI4 | x340Var2.h(z7) | x340Var2.i(tob1Var3);
                    Object objT16 = x340Var2.T();
                    if (zH2) {
                        m4cVar = m4cVar2;
                    } else {
                        m4cVar = m4cVar2;
                        if (objT16 != m4cVar) {
                            pob0Var = pob0Var2;
                            lbhVar = lbhVar2;
                            z = z5;
                        }
                        ljo1.g(lbhVar, qim0VarD, pob0Var, cr41.b, false, z, z, (iu30) objT16, x340Var2, 27648);
                        x340Var2.r(true);
                        if (num2 == 0 && ((Boolean) ven0Var2.getValue()).booleanValue()) {
                            x340Var2.i0(48457020);
                            if (lfv0Var2.c) {
                                x340Var2.i0(48433491);
                                list = list2;
                                Object obj14 = list.get(num2.intValue());
                                int iIntValue = num2.intValue();
                                tyq tyqVar3 = (tyq) obj13;
                                iu30Var = iu30Var2;
                                boolean zG3 = x340Var2.g(iu30Var);
                                Object objT17 = x340Var2.T();
                                if (zG3 || objT17 == m4cVar) {
                                    objT17 = new c5a(iu30Var, (byte) 9);
                                    x340Var2.s0(objT17);
                                }
                                iu30 iu30Var5 = (iu30) objT17;
                                boolean zI5 = x340Var2.i(ven0Var2);
                                Object objT18 = x340Var2.T();
                                if (zI5 || objT18 == m4cVar) {
                                    objT18 = new bp9(ven0Var2, (byte) 7);
                                    x340Var2.s0(objT18);
                                }
                                pxd0.b(obj14, iIntValue, tyqVar3, iu30Var5, (Function0) objT18, x340Var2, 0);
                                z2 = false;
                                x340Var2.r(false);
                                tob1Var = tob1Var2;
                            } else {
                                iu30Var = iu30Var2;
                                list = list2;
                                z2 = false;
                                x340Var2.i0(49104548);
                                n511 n511Var5 = (n511) ((Map) tob1Var4.getValue()).get(num2);
                                if (n511Var5 == null) {
                                    x340Var2.i0(49253254);
                                    x340Var2.r(false);
                                    tob1Var = tob1Var2;
                                } else {
                                    x340Var2.i0(49253255);
                                    tyq tyqVar4 = (tyq) obj13;
                                    float fX8 = lfv0Var2.b - watVar.X0(6.0f);
                                    float fN0 = watVar.N0(fX8 < 0.0f ? 0.0f : fX8);
                                    Object obj15 = list.get(num2.intValue());
                                    String str = "popup_" + num2;
                                    fjk1 fjk1VarC2 = pob0Var.c();
                                    ur80 ur80Var2 = (ur80) ven0Var.getValue();
                                    boolean zG4 = x340Var2.g(iu30Var);
                                    Object objT19 = x340Var2.T();
                                    if (zG4 || objT19 == m4cVar) {
                                        objT19 = new c5a(iu30Var, (byte) 10);
                                        x340Var2.s0(objT19);
                                    }
                                    iu30 iu30Var6 = (iu30) objT19;
                                    boolean zI6 = x340Var2.i(ven0Var2);
                                    Object objT20 = x340Var2.T();
                                    if (zI6 || objT20 == m4cVar) {
                                        objT20 = new bp9(ven0Var2, (byte) 8);
                                        x340Var2.s0(objT20);
                                    }
                                    Function0 function0 = (Function0) objT20;
                                    tob1Var = tob1Var2;
                                    boolean zI7 = x340Var2.i(tob1Var) | x340Var2.g(num2) | x340Var2.i(ven0Var2);
                                    Object objT21 = x340Var2.T();
                                    if (zI7 || objT21 == m4cVar) {
                                        z2 = false;
                                        objT21 = new d1c(num2, tob1Var, ven0Var2, (byte) 0);
                                        x340Var2.s0(objT21);
                                    } else {
                                        z2 = false;
                                    }
                                    d3p1.f(obj15, str, n511Var5, tyqVar4, iu30Var6, fjk1VarC2, ur80Var2, fN0, z7, function0, (Function0) objT21, x340Var2, 918552576);
                                    x340Var2.r(z2);
                                }
                                x340Var2.r(z2);
                            }
                            x340Var2.r(z2);
                        } else {
                            tob1Var = tob1Var2;
                            iu30Var = iu30Var2;
                            list = list2;
                            z2 = false;
                            x340Var2.i0(50841261);
                            x340Var2.r(false);
                        }
                        num = (Integer) tob1Var.getValue();
                        if (num == null) {
                            x340Var2.i0(50980264);
                            x340Var2.r(z2);
                        } else {
                            x340Var2.i0(50980265);
                            tyq tyqVar5 = (tyq) obj13;
                            int iIntValue2 = num.intValue();
                            Object obj16 = list.get(iIntValue2);
                            zG = x340Var2.g(iu30Var);
                            objT = x340Var2.T();
                            if (zG || objT == m4cVar) {
                                objT = new c5a(iu30Var, (byte) 11);
                                x340Var2.s0(objT);
                            }
                            iu30 iu30Var7 = (iu30) objT;
                            zI = x340Var2.i(tob1Var);
                            objT2 = x340Var2.T();
                            if (zI || objT2 == m4cVar) {
                                objT2 = new bp9(tob1Var, (byte) 9);
                                x340Var2.s0(objT2);
                            }
                            pxd0.b(obj16, iIntValue2, tyqVar5, iu30Var7, (Function0) objT2, x340Var2, 0);
                            x340Var2.r(false);
                        }
                    }
                    z = z5;
                    objT16 = new c1c(c380Var2, num2, vu30Var, ar41Var2, z, tyqVar2, ven0Var3, z7, ven0Var2, c9nVar, pob0Var2, lbhVar2, iu30Var4, tob1Var3);
                    pob0Var = pob0Var2;
                    lbhVar = lbhVar2;
                    x340Var2.s0(objT16);
                    ljo1.g(lbhVar, qim0VarD, pob0Var, cr41.b, false, z, z, (iu30) objT16, x340Var2, 27648);
                    x340Var2.r(true);
                    if (num2 == 0) {
                        tob1Var = tob1Var2;
                        iu30Var = iu30Var2;
                        list = list2;
                        z2 = false;
                        x340Var2.i0(50841261);
                        x340Var2.r(false);
                    } else {
                        tob1Var = tob1Var2;
                        iu30Var = iu30Var2;
                        list = list2;
                        z2 = false;
                        x340Var2.i0(50841261);
                        x340Var2.r(false);
                    }
                    num = (Integer) tob1Var.getValue();
                    if (num == null) {
                        x340Var2.i0(50980264);
                        x340Var2.r(z2);
                    } else {
                        x340Var2.i0(50980265);
                        tyq tyqVar6 = (tyq) obj13;
                        int iIntValue3 = num.intValue();
                        Object obj17 = list.get(iIntValue3);
                        zG = x340Var2.g(iu30Var);
                        objT = x340Var2.T();
                        if (zG) {
                            objT = new c5a(iu30Var, (byte) 11);
                            x340Var2.s0(objT);
                        } else {
                            objT = new c5a(iu30Var, (byte) 11);
                            x340Var2.s0(objT);
                        }
                        iu30 iu30Var8 = (iu30) objT;
                        zI = x340Var2.i(tob1Var);
                        objT2 = x340Var2.T();
                        if (zI) {
                            objT2 = new bp9(tob1Var, (byte) 9);
                            x340Var2.s0(objT2);
                        } else {
                            objT2 = new bp9(tob1Var, (byte) 9);
                            x340Var2.s0(objT2);
                        }
                        pxd0.b(obj17, iIntValue3, tyqVar6, iu30Var8, (Function0) objT2, x340Var2, 0);
                        x340Var2.r(false);
                    }
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar2 = cbx.a;
                cvx cvxVar5 = cbx.b(x340Var3).b;
                hdh hdhVarN = lnn1.n(uyn1.j(0.0f, 8.0f, 0.0f, 0.0f, 13), (vzq0) obj);
                ven0 ven0Var4 = (ven0) obj5;
                x340 x340Var4 = x340Var3;
                abf abfVar = (abf) obj13;
                xpi0 xpi0Var = (xpi0) obj8;
                jwm jwmVar = (jwm) obj7;
                ven0 ven0Var5 = (ven0) obj6;
                boolean zI8 = x340Var4.i(ven0Var4) | x340Var4.i((zks0) obj12) | x340Var4.i((wm1) obj11) | x340Var4.g(abfVar) | x340Var4.i(xpi0Var) | x340Var4.i(jwmVar) | x340Var4.i((ven0) obj9) | x340Var4.i(ven0Var5) | x340Var4.i((b921) obj10);
                zks0 zks0Var = (zks0) obj12;
                wm1 wm1Var = (wm1) obj11;
                ven0 ven0Var6 = (ven0) obj9;
                b921 b921Var = (b921) obj10;
                Object objT22 = x340Var4.T();
                if (zI8 || objT22 == fkj0.X) {
                    objT22 = new vd6(zks0Var, ven0Var4, wm1Var, abfVar, xpi0Var, jwmVar, ven0Var6, ven0Var5, b921Var, (byte) 2);
                    x340Var4.s0(objT22);
                }
                ujo1.d((qim0) null, (xtb0) null, hdhVarN, false, (g36) null, (nl3) null, (iq20) null, false, (hxq0) null, (iu30) objT22, x340Var4, 0, 507);
                return rih1Var;
            case 2:
                j2i j2iVar = (j2i) obj13;
                ydx ydxVar = (ydx) obj11;
                x340 x340Var5 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (((xu30) obj12) == null || !(ydxVar.e instanceof wdx)) {
                    x340 x340Var6 = x340Var5;
                    x340Var6.i0(-1731457063);
                    ioo1.g(ydxVar, (xu30) obj12, j2iVar, (xu30) obj8, (xu30) obj7, (xu30) obj9, (xu30) obj6, (xu30) obj5, (xu30) obj10, x340Var6, 0);
                    x340Var6.r(false);
                } else {
                    x340 x340Var7 = x340Var5;
                    x340Var7.i0(-1731737737);
                    ioo1.h(ydxVar, (xu30) obj12, j2iVar, (xu30) obj8, (xu30) obj7, (xu30) obj9, (xu30) obj6, (xu30) obj5, (xu30) obj10, x340Var7, 0);
                    x340Var7.r(false);
                }
                return rih1Var;
            case 3:
                ((Number) obj3).intValue();
                jto1.c((uvx) obj12, (qim0) null, (cw9) null, (xu30) obj11, (xu30) obj13, (xu30) obj8, (xu30) obj7, (xu30) obj9, (xu30) obj6, (xu30) obj5, (xu30) obj10, (b0k) obj2, 0, 6);
                return rih1Var;
            case 4:
                return a(obj, obj2, obj3);
            case 5:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                vzq0 vzq0Var2 = (vzq0) obj;
                ((Number) obj3).intValue();
                x340 x340Var8 = (b0k) obj2;
                Object objK = x340Var8.k(t4k.n);
                j06 j06Var = x340Var8.a;
                flb0 flb0Var2 = (flb0) objK;
                jd21 jd21Var = (jd21) obj12;
                c380 c380Var3 = jd21Var.c;
                if (c380Var3.isEmpty()) {
                    x340Var8.i0(1724697211);
                    gra graVar = een.h;
                    qim0 qim0VarW = uyn1.w(u291.d(nim0Var, 1.0f), vzq0Var2);
                    gfh0 gfh0VarC2 = t1c.c(graVar, false);
                    int iHashCode2 = Long.hashCode(x340Var8.T);
                    xos0 xos0VarM2 = x340Var8.m();
                    qim0 qim0VarE2 = zr7.E(x340Var8, qim0VarW);
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
                    nko1.H(gfh0VarC2, x340Var8, lljVar4);
                    nko1.H(xos0VarM2, x340Var8, lljVar3);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var8, lljVar2);
                    nko1.F(x340Var8);
                    nko1.H(qim0VarE2, x340Var8, lljVar);
                    String strO0 = cwl1.o0(x340Var8, 2131959081);
                    uwr uwrVar3 = cbx.a;
                    lee1 lee1Var = cbx.d(x340Var8).j;
                    long j = cbx.a(x340Var8).b.b;
                    cvx cvxVar6 = cbx.b(x340Var8).b;
                    uwo1.e(strO0, uyn1.z(16.0f, 0.0f, 2, nim0Var), lee1Var, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, 2016);
                    x340Var8.r(true);
                    x340Var8.r(false);
                    return rih1Var;
                }
                x340Var8.i0(1725181555);
                x340Var8.r(false);
                qim0 qim0VarB3 = uyn1.B(u291.d(nim0Var, 1.0f), uyn1.n(vzq0Var2, flb0Var2), vzq0Var2.d(), uyn1.m(vzq0Var2, flb0Var2), 0.0f, 8);
                yhn0 yhn0Var = (yhn0) obj13;
                xtb0 xtb0Var = (xtb0) obj8;
                h3h1 h3h1Var = (h3h1) obj7;
                bin0 bin0Var = (bin0) obj9;
                d0r d0rVar2 = (d0r) obj6;
                poj0 poj0Var = (poj0) obj5;
                iu30 iu30Var9 = (iu30) obj11;
                eyr0 eyr0Var = (eyr0) obj10;
                mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var8, 0);
                int iHashCode3 = Long.hashCode(x340Var8.T);
                xos0 xos0VarM3 = x340Var8.m();
                qim0 qim0VarE3 = zr7.E(x340Var8, qim0VarB3);
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
                nko1.H(mbhVarA, x340Var8, lljVar4);
                nko1.H(xos0VarM3, x340Var8, lljVar3);
                nko1.H(Integer.valueOf(iHashCode3), x340Var8, lljVar2);
                nko1.F(x340Var8);
                nko1.H(qim0VarE3, x340Var8, lljVar);
                if (jd21Var.e) {
                    x340Var8.i0(-1738634370);
                    xhn0 xhn0Var = new xhn0(c380Var3, jd21Var.d);
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar7 = cbx.b(x340Var8).b;
                    otw.c(yhn0Var, xhn0Var, uyn1.z(16.0f, 0.0f, 2, nim0Var), (ipb1) null, x340Var8, 0, 8);
                    x340Var8.r(false);
                } else {
                    x340Var8.i0(-1738297059);
                    x340Var8.r(false);
                }
                zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, vzq0Var2.a(), 7);
                qim0 qim0VarF = u291.f(new wnb0(1.0f, true), 1.0f);
                boolean zI9 = x340Var8.i(jd21Var) | x340Var8.i(bin0Var) | x340Var8.i(d0rVar2) | x340Var8.i(poj0Var) | x340Var8.g(iu30Var9) | x340Var8.i(eyr0Var);
                Object objT23 = x340Var8.T();
                if (zI9 || objT23 == fkj0.X) {
                    objT23 = new j96(jd21Var, bin0Var, d0rVar2, poj0Var, iu30Var9, eyr0Var, (byte) 26);
                    x340Var8.s0(objT23);
                }
                s3o1.d(qim0VarF, xtb0Var, zzq0VarJ, (g36) null, (nl3) null, (iq20) null, false, h3h1Var, (iu30) objT23, x340Var8, 0, 248);
                x340Var8.r(true);
                return rih1Var;
            default:
                uzh uzhVar = (uzh) obj;
                x340 x340Var9 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= (iIntValue4 & 8) == 0 ? x340Var9.g(uzhVar) : x340Var9.i(uzhVar) ? 4 : 2;
                }
                x340 x340Var10 = x340Var9;
                if (!x340Var10.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x340Var10.b0();
                } else if (uzhVar instanceof gzh) {
                    x340Var10.i0(35952634);
                    gzh gzhVar = (gzh) uzhVar;
                    kka kkaVar = gzhVar.c;
                    String str2 = kkaVar.d;
                    List list3 = kkaVar.e;
                    int iC = l1d.C(gzhVar.a);
                    if (iC == 0) {
                        z3 = false;
                        x340Var10.i0(1802276679);
                        otw.c((zja) obj12, gzhVar.b, (qim0) null, (ipb1) null, x340Var10, 8, 12);
                        x340Var10.r(false);
                    } else if (iC == 1) {
                        x340Var10.i0(1802281710);
                        veb0 veb0Var = (veb0) obj11;
                        String strO1 = cwl1.o0(x340Var10, 2131962982);
                        String strO2 = cwl1.o0(x340Var10, 2131962981);
                        String strO3 = cwl1.o0(x340Var10, 2131962980);
                        List listM = p7h.M(new String[]{"offline", "group-session", "queue"});
                        List list4 = list3;
                        if (!list4.isEmpty()) {
                            listM = list4;
                        }
                        otw.c(veb0Var, new kka(strO1, strO2, strO3, str2, listM), (qim0) null, (ipb1) null, x340Var10, 8, 12);
                        z3 = false;
                        x340Var10.r(false);
                    } else {
                        if (iC != 2) {
                            throw p3d1.k(x340Var10, 1802275080, false);
                        }
                        x340Var10.i0(1802302813);
                        vf91 vf91Var = (vf91) obj13;
                        String strO4 = cwl1.o0(x340Var10, 2131962982);
                        String strO5 = cwl1.o0(x340Var10, 2131962981);
                        String strO6 = cwl1.o0(x340Var10, 2131962980);
                        List listM2 = p7h.M(new String[]{"offline", "queue"});
                        List list5 = list3;
                        if (!list5.isEmpty()) {
                            listM2 = list5;
                        }
                        otw.c(vf91Var, new kka(strO4, strO5, strO6, str2, listM2), (qim0) null, (ipb1) null, x340Var10, 8, 12);
                        x340Var10.r(false);
                        z3 = false;
                    }
                    x340Var10.r(z3);
                } else if (uzhVar instanceof jzh) {
                    x340Var10.i0(38245301);
                    d0z d0zVar = (d0z) obj10;
                    int i7 = 0;
                    for (Object obj18 : ((jzh) uzhVar).a) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            p7h.T();
                            throw null;
                        }
                        otw.c(d0zVar, new b0z(i7, (p60) obj18), (qim0) null, (ipb1) null, x340Var10, 72, 12);
                        i7 = i8;
                    }
                    x340Var10.r(false);
                } else if (uzhVar instanceof nzh) {
                    x340Var10.i0(38465835);
                    otw.c((vnc1) obj8, ((nzh) uzhVar).a, (qim0) null, (ipb1) null, x340Var10, 8, 12);
                    x340Var10.r(false);
                } else if (uzhVar.equals(ozh.a)) {
                    x340Var10.i0(1802359967);
                    x340Var10.r(false);
                } else if (uzhVar instanceof fzh) {
                    x340Var10.i0(38631499);
                    otw.c((b5a) obj7, ((fzh) uzhVar).a, (qim0) null, (ipb1) null, x340Var10, 8, 12);
                    x340Var10.r(false);
                } else if (uzhVar instanceof kzh) {
                    x340Var10.i0(38765295);
                    otw.c((kb80) obj9, ((kzh) uzhVar).a, (qim0) null, (ipb1) null, x340Var10, 8, 12);
                    x340Var10.r(false);
                } else if (uzhVar instanceof mzh) {
                    x340Var10.i0(38895247);
                    otw.c((g7t0) obj6, ((mzh) uzhVar).a, (qim0) null, (ipb1) null, x340Var10, 8, 12);
                    x340Var10.r(false);
                } else {
                    if (!(uzhVar instanceof ezh)) {
                        throw p3d1.k(x340Var10, 1802274572, false);
                    }
                    x340Var10.i0(39026253);
                    otw.c((e02) obj5, ((ezh) uzhVar).a, (qim0) null, (ipb1) null, x340Var10, 8, 12);
                    x340Var10.r(false);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
        this.i = obj7;
        this.b = obj8;
        this.t = obj9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1c(jd21 jd21Var, yhn0 yhn0Var, xtb0 xtb0Var, h3h1 h3h1Var, bin0 bin0Var, d0r d0rVar, poj0 poj0Var, iu30 iu30Var, eyr0 eyr0Var) {
        super(3);
        this.a = (byte) 5;
        this.c = jd21Var;
        this.e = yhn0Var;
        this.f = xtb0Var;
        this.g = h3h1Var;
        this.h = bin0Var;
        this.i = d0rVar;
        this.b = poj0Var;
        this.d = iu30Var;
        this.t = eyr0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1c(bw91 bw91Var, HashMap map, View view, iu30 iu30Var, ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, iu30 iu30Var2) {
        super(3);
        this.a = (byte) 4;
        this.c = bw91Var;
        this.e = map;
        this.g = view;
        this.d = iu30Var;
        this.b = ven0Var;
        this.f = ven0Var2;
        this.h = ven0Var3;
        this.i = ven0Var4;
        this.t = iu30Var2;
    }
}
