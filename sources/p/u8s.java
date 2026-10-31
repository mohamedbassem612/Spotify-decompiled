package p;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class u8s extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8s(yk31 yk31Var, boolean z, kj31 kj31Var, vnr0 vnr0Var, tlc1 tlc1Var, float f) {
        super(3);
        this.d = yk31Var;
        this.b = z;
        this.e = kj31Var;
        this.f = vnr0Var;
        this.g = tlc1Var;
        this.c = f;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        dlv dlvVar;
        int i;
        x340 x340Var;
        boolean z;
        byte b = this.a;
        boolean z2 = this.b;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        float f = this.c;
        Object obj4 = this.d;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        switch (b) {
            case 0:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                Function0 function0 = (Function0) obj4;
                x340 x340Var2 = (b0k) obj2;
                x340Var2.i0(761452138);
                if (!z2) {
                    x340Var2.r(false);
                    return nim0Var;
                }
                Object objT = x340Var2.T();
                Object obj8 = fkj0.X;
                if (objT == obj8) {
                    objT = kaa0.h(0L, x340Var2);
                }
                ven0 ven0Var = (ven0) objT;
                Object objT2 = x340Var2.T();
                if (objT2 == obj8) {
                    objT2 = v8r.q(Boolean.FALSE);
                    x340Var2.s0(objT2);
                }
                ven0 ven0Var2 = (ven0) objT2;
                Object objT3 = x340Var2.T();
                if (objT3 == obj8) {
                    objT3 = kaa0.h(0L, x340Var2);
                }
                ven0 ven0Var3 = (ven0) objT3;
                Object objT4 = x340Var2.T();
                if (objT4 == obj8) {
                    objT4 = v8r.q((Object) null);
                    x340Var2.s0(objT4);
                }
                ven0 ven0Var4 = (ven0) objT4;
                float fX0 = ((wat) x340Var2.k(t4k.h)).X0(f);
                Object objT5 = x340Var2.T();
                if (objT5 == obj8) {
                    Integer num = ((Boolean) ven0Var2.getValue()).booleanValue() ? 300 : null;
                    dlvVar = null;
                    i = 0;
                    objT5 = irn1.o0(num != null ? num.intValue() : 0, 0, (dlv) null, 6);
                    x340Var2.s0(objT5);
                } else {
                    dlvVar = null;
                    i = 0;
                }
                pxg1 pxg1Var = (pxg1) objT5;
                Object objT6 = x340Var2.T();
                if (objT6 == obj8) {
                    objT6 = irn1.o0(300, i, dlvVar, 6);
                    x340Var2.s0(objT6);
                }
                pxg1 pxg1Var2 = (pxg1) objT6;
                boolean zF = x340Var2.f(((Offset) ven0Var.getValue()).a) | x340Var2.h(((Boolean) ven0Var2.getValue()).booleanValue());
                Object objT7 = x340Var2.T();
                if (zF || objT7 == obj8) {
                    objT7 = Float.valueOf(((Boolean) ven0Var2.getValue()).booleanValue() ? yoi1.o(Float.intBitsToFloat((int) (((Offset) ven0Var.getValue()).a >> 32)) / 30.0f, -90.0f, 90.0f) : 0.0f);
                    x340Var2.s0(objT7);
                }
                tob1 tob1VarB = z95.b(((Number) objT7).floatValue(), pxg1Var, "rotation", (iu30) null, x340Var2, 3072, 20);
                boolean zH = x340Var2.h(((Boolean) ven0Var2.getValue()).booleanValue()) | x340Var2.f(((Offset) ven0Var.getValue()).a);
                Object objT8 = x340Var2.T();
                if (zH || objT8 == obj8) {
                    Offset offset = new Offset(((Boolean) ven0Var2.getValue()).booleanValue() ? ((Offset) ven0Var.getValue()).a : 0L);
                    x340Var2.s0(offset);
                    objT8 = offset;
                }
                Offset offset2 = (Offset) objT8;
                long j = offset2.a;
                boolean zI = x340Var2.i(ven0Var2) | x340Var2.g(function0);
                Object objT9 = x340Var2.T();
                if (zI || objT9 == obj8) {
                    objT9 = new t8s(function0, ven0Var2, (byte) 0);
                    x340Var2.s0(objT9);
                }
                tob1 tob1VarD = z95.d(offset2, rno1.f, pxg1Var2, (Float) null, "position", (iu30) objT9, x340Var2, 24576, 8);
                boolean zF2 = x340Var2.f(((Offset) tob1VarD.getValue()).a);
                Object objT10 = x340Var2.T();
                if (zF2 || objT10 == obj8) {
                    qr80 qr80Var = new qr80((((long) jch0.U(Float.intBitsToFloat((int) (((Offset) tob1VarD.getValue()).a >> 32)))) << 32) | (((long) jch0.U(Float.intBitsToFloat((int) (((Offset) tob1VarD.getValue()).a & 4294967295L)))) & 4294967295L));
                    x340Var2.s0(qr80Var);
                    objT10 = qr80Var;
                }
                long j2 = ((qr80) objT10).a;
                qim0 qim0VarD = i541.D(qim0Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 0, (f2b) null, 1044479);
                boolean zI2 = x340Var2.i(ven0Var3) | x340Var2.i((Set) obj5) | x340Var2.i(ven0Var2) | x340Var2.i(ven0Var) | x340Var2.g((Function0) obj7) | x340Var2.d(fX0) | x340Var2.g((Function0) obj6);
                Set set = (Set) obj5;
                Function0 function1 = (Function0) obj7;
                Function0 function2 = (Function0) obj6;
                Object objT11 = x340Var2.T();
                if (zI2 || objT11 == obj8) {
                    objT11 = new s8s(set, function1, fX0, function2, ven0Var3, ven0Var2, ven0Var);
                    x340Var2.s0(objT11);
                }
                qim0 qim0VarS = b9p1.s(qim0VarD, (iu30) objT11);
                boolean zI3 = x340Var2.i(ven0Var4);
                Object objT12 = x340Var2.T();
                if (zI3 || objT12 == obj8) {
                    objT12 = new bzm(ven0Var4, (byte) 25);
                    x340Var2.s0(objT12);
                }
                qim0 qim0VarX = ern1.x(qim0VarS, (iu30) objT12);
                boolean zF3 = x340Var2.f(j2);
                Object objT13 = x340Var2.T();
                if (zF3 || objT13 == obj8) {
                    objT13 = new ps((byte) 8, j2);
                    x340Var2.s0(objT13);
                }
                qim0 qim0VarU = k1u.u(eqr0.B(qim0VarX, (iu30) objT13), ((Number) tob1VarB.getValue()).floatValue());
                x340Var2.r(false);
                return qim0VarU;
            case 1:
                ((Number) obj3).intValue();
                x340 x340Var3 = (b0k) obj2;
                x340Var3.i0(972036463);
                nim0 nim0Var2 = nim0.a;
                if (!z2) {
                    x340Var3.r(false);
                    return nim0Var2;
                }
                dui1 dui1VarS = byo1.s(((hux) wsx.c).a.b, x340Var3);
                Object objT14 = x340Var3.T();
                m4c m4cVar = fkj0.X;
                if (objT14 == m4cVar) {
                    objT14 = c97.b(0.0f);
                    x340Var3.s0(objT14);
                }
                o95 o95Var = (o95) objT14;
                boolean zI4 = x340Var3.i(o95Var);
                Object objT15 = x340Var3.T();
                if (zI4 || objT15 == m4cVar) {
                    objT15 = new b(o95Var, (lnm) null, (byte) 12);
                    x340Var3.s0(objT15);
                }
                qxd0.t(rih1Var, x340Var3, (vu30) objT15);
                uwr uwrVar = cbx.a;
                float f2 = cbx.b(x340Var3).b.b;
                qim0 qim0VarD2 = i541.D(nim0Var2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, (hw61) null, false, 0L, 0L, 1, (f2b) null, 983039);
                boolean zD = x340Var3.d(f) | x340Var3.d(f2) | x340Var3.g((p3v) obj4) | x340Var3.g((p3v) obj7) | x340Var3.g((p3v) obj6) | x340Var3.i(o95Var) | x340Var3.i((tob1) obj5) | x340Var3.i(dui1VarS);
                p3v p3vVar = (p3v) obj4;
                p3v p3vVar2 = (p3v) obj7;
                p3v p3vVar3 = (p3v) obj6;
                tob1 tob1Var = (tob1) obj5;
                Object objT16 = x340Var3.T();
                if (zD || objT16 == m4cVar) {
                    objT16 = new o3f0(f2, this.c, p3vVar, p3vVar2, p3vVar3, o95Var, tob1Var, dui1VarS);
                    x340Var3.s0(objT16);
                }
                qim0 qim0VarR = exd0.r(qim0VarD2, (iu30) objT16);
                x340Var3.r(false);
                return qim0VarR;
            default:
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarD3 = u291.d(nim0Var, 1.0f);
                yk31 yk31Var = (yk31) obj4;
                kj31 kj31Var = (kj31) obj7;
                vnr0 vnr0Var = (vnr0) obj6;
                tlc1 tlc1Var = (tlc1) obj5;
                gra graVar = een.d;
                gfh0 gfh0VarC = t1c.c(graVar, false);
                x340 x340Var5 = x340Var4;
                int iHashCode = Long.hashCode(x340Var5.T);
                xos0 xos0VarM = x340Var5.m();
                qim0 qim0VarE = zr7.E(x340Var4, qim0VarD3);
                hzj.A.getClass();
                x340 x340Var6 = x340Var4;
                if (x340Var6.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var6.m0();
                boolean z3 = x340Var6.S;
                n4k n4kVar = hmb0.t1;
                if (z3) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var4, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var4, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var4, lljVar3);
                nko1.F(x340Var4);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var4, lljVar4);
                h2c h2cVar = h2c.a;
                qim0 qim0VarB = h2cVar.b(nim0Var);
                uwr uwrVar2 = cbx.a;
                qim0 qim0VarF = dug.f(qim0VarB, cbx.a(x340Var4).a.b.a(), d4o1.a);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var6.T);
                xos0 xos0VarM2 = x340Var6.m();
                qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarF);
                x340Var6.m0();
                if (x340Var6.S) {
                    x340Var6.l(n4kVar);
                } else {
                    x340Var6.v0();
                }
                nko1.H(gfh0VarC2, x340Var4, lljVar);
                nko1.H(xos0VarM2, x340Var4, lljVar2);
                i3a.l(iHashCode2, x340Var4, lljVar3, x340Var4);
                nko1.H(qim0VarE2, x340Var4, lljVar4);
                if (yk31Var instanceof xk31) {
                    x340Var6.i0(-835058058);
                    x340Var = x340Var6;
                    apo.e(((xk31) yk31Var).a, this.b, kj31Var, u291.d(nim0Var, 1.0f), x340Var4, 0);
                    z = false;
                    x340Var.r(false);
                } else {
                    x340Var = x340Var6;
                    z = false;
                    x340Var.i0(-834779368);
                    x340Var.r(false);
                }
                x340Var.r(true);
                qim0 qim0VarC = u291.c(u291.f(nim0Var, 1.0f), 0.6f);
                gra graVar2 = een.h;
                qim0 qim0VarA = h2cVar.a(qim0VarC, graVar2);
                gfh0 gfh0VarC3 = t1c.c(graVar, z);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var4, qim0VarA);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC3, x340Var4, lljVar);
                nko1.H(xos0VarM3, x340Var4, lljVar2);
                i3a.l(iHashCode3, x340Var4, lljVar3, x340Var4);
                nko1.H(qim0VarE3, x340Var4, lljVar4);
                Object objT17 = x340Var.T();
                if (objT17 == fkj0.X) {
                    objT17 = oe31.c1;
                    x340Var.s0(objT17);
                }
                qgo1.f(vnr0.a(gqg0.a(vnr0Var, tlc1Var.N0(f)), (String) null, lee1.a(vnr0Var.b, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 3, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16744447), (kor0) null, 0L, 29), uyn1.B(h2cVar.a(s161.a(nim0Var, (iu30) objT17), graVar2), 16.0f, 0.0f, 16.0f, 0.0f, 10), (a0e1) null, 0, false, (iu30) null, x340Var4, 8, 60);
                x340Var.r(true);
                x340Var.r(true);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8s(boolean z, float f, p3v p3vVar, p3v p3vVar2, p3v p3vVar3, tob1 tob1Var) {
        super(3);
        this.b = z;
        this.c = f;
        this.d = p3vVar;
        this.e = p3vVar2;
        this.f = p3vVar3;
        this.g = tob1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8s(boolean z, Function0 function0, Set set, Function0 function1, Function0 function2, float f) {
        super(3);
        this.b = z;
        this.d = function0;
        this.g = set;
        this.e = function1;
        this.f = function2;
        this.c = f;
    }
}
