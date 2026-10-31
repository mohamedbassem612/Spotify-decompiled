package p;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.tooling.PreviewActivity;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class qg implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qg(k8c0 k8c0Var, iac0 iac0Var, Function0 function0, int i) {
        this.a = (byte) 8;
        this.c = k8c0Var;
        this.b = iac0Var;
        this.d = function0;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                suo1.o((iac0) obj5, (iu30) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                qim0 qim0Var = (qim0) obj5;
                ven0 ven0Var = (ven0) obj4;
                j2i j2iVar = (j2i) obj3;
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Integer) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objT = x340Var2.T();
                    if (objT == fkj0.X) {
                        objT = new g45(ven0Var, (byte) 0);
                        x340Var2.s0(objT);
                    }
                    qim0 qim0VarX = ern1.x(qim0Var, (iu30) objT);
                    gfh0 gfh0VarC = t1c.c(een.d, true);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
                    hzj.A.getClass();
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
                    dv20.l(0, j2iVar, x340Var2, true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                ven0 ven0Var2 = (ven0) obj5;
                vzq0 vzq0Var = (vzq0) obj4;
                j2i j2iVar2 = (j2i) obj3;
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    mod.b(wql.a.a(Float.valueOf(u7h.c(((u7h) ven0Var2.getValue()).a))), apo.r(-869936862, new efc(vzq0Var, j2iVar2, (byte) 0), x340Var4), x340Var4, 56);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 3:
                ((Integer) obj2).getClass();
                t4k.a((oxq0) obj5, (f65) obj4, (vu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 4:
                ((Integer) obj2).getClass();
                eko1.d((qim0) obj5, (x6e1) obj4, (j2i) obj3, (b0k) obj, czo1.p(385));
                return rih1Var;
            case 5:
                ((Integer) obj2).getClass();
                who1.h((qim0) obj5, (j2i) obj4, (gfh0) obj3, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 6:
                zzq0 zzq0Var = (zzq0) obj5;
                hab1 hab1Var = (hab1) obj4;
                c36 c36Var = (c36) obj3;
                wat watVar = (wat) obj;
                hjl hjlVar = (hjl) obj2;
                if (hjl.i(hjlVar.a) == Integer.MAX_VALUE) {
                    tf80.a("LazyVerticalStaggeredGrid's width should be bound by parent.");
                }
                flb0 flb0Var = flb0.a;
                int i = hjl.i(hjlVar.a) - watVar.i0(uyn1.m(zzq0Var, flb0Var) + uyn1.n(zzq0Var, flb0Var));
                int[] iArrA = hab1Var.a(i, watVar.i0(c36Var.a()));
                int[] iArr = new int[2];
                c36Var.e(watVar, i, iArrA, flb0Var, iArr);
                return new dvb0(iArr, iArrA);
            case 7:
                zzq0 zzq0Var2 = (zzq0) obj5;
                hab1 hab1Var2 = (hab1) obj4;
                g36 g36Var = (g36) obj3;
                wat watVar2 = (wat) obj;
                hjl hjlVar2 = (hjl) obj2;
                if (hjl.h(hjlVar2.a) == Integer.MAX_VALUE) {
                    tf80.a("LazyHorizontalStaggeredGrid's height should be bound by parent.");
                }
                int iH = hjl.h(hjlVar2.a) - watVar2.i0(zzq0Var2.e + zzq0Var2.c);
                int[] iArrA2 = hab1Var2.a(iH, watVar2.i0(g36Var.a()));
                int[] iArr2 = new int[2];
                g36Var.b(watVar2, iH, iArrA2, iArr2);
                return new dvb0(iArr2, iArrA2);
            case 8:
                ((Integer) obj2).getClass();
                cso1.j((k8c0) obj4, (iac0) obj5, (Function0) obj3, (b0k) obj, czo1.p(7));
                return rih1Var;
            case 9:
                String str = (String) obj5;
                String str2 = (String) obj4;
                Object[] objArr = (Object[]) obj3;
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i2 = PreviewActivity.U0;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    w0h1.w(str, str2, x340Var6, Arrays.copyOf(objArr, 0));
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 10:
                m811 m811Var = (m811) obj5;
                du41 du41Var = (du41) obj4;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jI = du41Var.i(du41Var.e(fFloatValue - m811Var.a));
                du41 du41Var2 = ((cu41) obj3).a;
                m811Var.a += du41Var.e(du41Var.h(du41Var2.d(du41Var2.k, jI, 1)));
                return rih1Var;
            case 11:
                o811 o811Var = (o811) obj5;
                r7e1 r7e1Var = (r7e1) obj4;
                hav0 hav0Var = (hav0) obj;
                long jG = Offset.g(o811Var.a, ((Offset) obj2).a);
                o811Var.a = jG;
                r7e1Var.A(qr50.a, Offset.g(((o811) obj3).a, jG));
                if (r7e1Var.u(r7e1Var.n())) {
                    hav0Var.a();
                    sct0 sct0Var = r7e1Var.k;
                    if (sct0Var != null) {
                        sct0Var.a(9);
                    }
                }
                return rih1Var;
            default:
                m8m1 m8m1Var = (m8m1) obj5;
                qzj qzjVar = (qzj) obj4;
                vu30 vu30Var = (vu30) obj3;
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    ha4 ha4Var = m8m1Var.a;
                    boolean zI = x340Var8.i(m8m1Var);
                    Object objT2 = x340Var8.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new vse0(m8m1Var, (lnm) null, (byte) 24);
                        x340Var8.s0(objT2);
                    }
                    qxd0.t(ha4Var, x340Var8, (vu30) objT2);
                    boolean zI2 = x340Var8.i(m8m1Var);
                    Object objT3 = x340Var8.T();
                    if (zI2 || objT3 == m4cVar) {
                        objT3 = new fkj1(m8m1Var, (lnm) null, (byte) 24);
                        x340Var8.s0(objT3);
                    }
                    qxd0.t(ha4Var, x340Var8, (vu30) objT3);
                    qzjVar.a(ha4Var, vu30Var, x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
        }
    }

    public /* synthetic */ qg(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public /* synthetic */ qg(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
