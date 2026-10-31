package p;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class no9 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no9(u8h u8hVar, long j, kee1 kee1Var) {
        super(3);
        this.a = (byte) 7;
        this.c = u8hVar;
        this.b = j;
        this.d = kee1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        k960 k960Var;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        long j = this.b;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.c;
        Object obj5 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                d620 d620Var = u291.a;
                qim0 qim0VarS = u291.s(nim0Var, s3v.b(j), s3v.a(j));
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                qim0 qim0VarQ = i1p1.q(qim0VarS, er31.b(8.0f));
                j2i j2iVar = (j2i) obj4;
                f8n f8nVar = (f8n) obj5;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarQ);
                hzj.A.getClass();
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                j2iVar.invoke(f8nVar, x340Var, 0);
                x340Var3.r(true);
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                w0h1.a(((ga0) obj4).b, new jsl((String) obj5), (qim0) null, this.b, 0L, false, (b0k) obj2, 8, 52);
                return rih1Var;
            case 2:
                ((Number) obj3).intValue();
                otw.c(((owj) obj4).b, new vcg1(((lwj) obj5).a, 1), anm1.N("compose-read-along-page-content", uyn1.w(dug.f(u291.d(nim0Var, 1.0f), j, d4o1.a), (vzq0) obj)), (ipb1) null, (b0k) obj2, 0, 8);
                return rih1Var;
            case 3:
                x340 x340Var4 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    n9p1.i(384, (ArrayList) obj4, apo.r(652904603, new icc((byte) 2, j, (String) obj5), x340Var5), x340Var5, null);
                } else {
                    x340Var5.b0();
                }
                return rih1Var;
            case 4:
                ifh0 ifh0Var = (ifh0) obj;
                long j2 = ((hjl) obj3).a;
                xln xlnVar = (xln) obj5;
                int height = ((View) obj4).getHeight() - xlnVar.b;
                q5t0 q5t0VarH = ((afh0) obj2).H(hjl.b(j2, 0, 0, 0, hjl.h(j2) - height, 7));
                int iIntBitsToFloat = xlnVar.a - ((int) Float.intBitsToFloat((int) (j >> 32)));
                int iOrdinal = ifh0Var.getLayoutDirection().ordinal();
                if (iOrdinal == 0) {
                    int i3 = q5t0VarH.a;
                    i = iIntBitsToFloat - (i3 / 2);
                    i2 = i3;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    int i4 = hjl.i(j2) - iIntBitsToFloat;
                    i2 = q5t0VarH.a;
                    i = i4 - (i2 / 2);
                }
                return ifh0Var.S(i2, q5t0VarH.b, b7x.a, new hnn(q5t0VarH, i, j2, height));
            case 5:
                i2c i2cVar = (i2c) obj;
                x340 x340Var6 = (b0k) obj2;
                ((Number) obj3).intValue();
                da60 da60Var = (da60) obj4;
                if (da60Var == null) {
                    x340 x340Var7 = x340Var6;
                    x340Var7.i0(1606496632);
                    x340Var7.r(false);
                } else {
                    x340 x340Var8 = x340Var6;
                    x340Var8.i0(1606496633);
                    List list = (List) obj5;
                    if (da60Var instanceof x960) {
                        k960Var = if50.a;
                    } else if (da60Var instanceof z960) {
                        k960Var = fy81.a;
                    } else if (da60Var instanceof y960) {
                        k960Var = quq0.a;
                    } else if (da60Var instanceof ba60) {
                        k960Var = gke1.a;
                    } else if (da60Var instanceof ca60) {
                        k960Var = hke1.a;
                    } else if (da60Var instanceof aa60) {
                        k960Var = b8b1.a;
                    } else {
                        if (!(da60Var instanceof w960)) {
                            eg.o();
                            return null;
                        }
                        k960Var = i2u.a;
                    }
                    w2g0.c(d7e.r(!list.isEmpty() ? 1.0f : k960Var.c, u291.x(0.0f, i2cVar.d(), 1, nim0Var), false), een.h, apo.r(467003897, new nhg(k960Var, list, da60Var, this.b), x340Var8), x340Var8, 3072, 4);
                    x340Var8.r(false);
                }
                return rih1Var;
            case 6:
                x340 x340Var9 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    wat watVar = (wat) x340Var10.k(t4k.h);
                    Context context = (Context) x340Var10.k(AndroidCompositionLocals_androidKt.b);
                    Object objT = x340Var10.T();
                    if (objT == fkj0.X) {
                        objT = ktd.k(watVar.M0(h4o1.n(context.getResources())), x340Var10);
                    }
                    float f = ((p3v) objT).a;
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarZ = u291.z(u291.f(nim0Var2, 1.0f), (fra) null, 3);
                    mmr0 mmr0Var = new mmr0(Float.valueOf(0.0f), new u7h(j));
                    Float fValueOf = Float.valueOf(1.0f);
                    uwr uwrVar2 = cbx.a;
                    qim0 qim0VarE2 = dug.e(qim0VarZ, v9c.t(new mmr0[]{mmr0Var, new mmr0(fValueOf, new u7h(cbx.a(x340Var10).a.c))}, 0.0f, 0.0f, 14), null, 0.0f, 6);
                    lb9 lb9Var = (lb9) obj4;
                    hh11 hh11Var = (hh11) obj5;
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var10.T);
                    xos0 xos0VarM2 = x340Var10.m();
                    qim0 qim0VarE3 = zr7.E(x340Var10, qim0VarE2);
                    hzj.A.getClass();
                    if (x340Var10.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var10.m0();
                    if (x340Var10.S) {
                        x340Var10.l(n4kVar);
                    } else {
                        x340Var10.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var10, y580.O0);
                    nko1.H(xos0VarM2, x340Var10, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var10, y580.R0);
                    nko1.F(x340Var10);
                    nko1.H(qim0VarE3, x340Var10, y580.Y);
                    otw.c(lb9Var, new kb9(hh11Var.b, hh11Var.c, Integer.valueOf(hh11Var.d | (-16777216)), hh11Var.a), uyn1.B(nim0Var2, 0.0f, 56.0f + f, 0.0f, 0.0f, 13), (ipb1) null, x340Var10, 390, 8);
                    x340Var10.r(true);
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            default:
                x340 x340Var11 = (b0k) obj2;
                ((Number) obj3).intValue();
                aym.e((gt40) null, (u8h) obj4, x340Var11, 64);
                if (p3v.b(s3v.b(j), 180.0f) >= 0) {
                    x340 x340Var12 = x340Var11;
                    x340Var12.i0(-196708698);
                    et40 et40Var = et40.a;
                    gt40 gt40VarH = eqr0.H(et40Var, 4.0f, 0.0f, 2.0f, 0.0f, 10);
                    kiv kivVar = p4k.b;
                    o4p1.g(((Context) x340Var12.k(kivVar)).getString(2131955164), gt40VarH, (kee1) obj5, 0, x340Var12, 0, 8);
                    gt40 gt40VarA = ow31.a(et40Var);
                    Object objT2 = x340Var12.T();
                    if (objT2 == fkj0.X) {
                        objT2 = hzg1.Z;
                        x340Var12.s0(objT2);
                    }
                    o4p1.g(((Context) x340Var12.k(kivVar)).getString(2131955163), iko1.x(gt40VarA, (iu30) objT2), (kee1) obj5, 1, x340Var12, 3072, 0);
                    x340Var12.r(false);
                } else {
                    x340 x340Var13 = x340Var11;
                    x340Var13.i0(-196092697);
                    x340Var13.r(false);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ no9(Object obj, Object obj2, long j, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ no9(long j, Object obj, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.b = j;
        this.c = obj;
        this.d = obj2;
    }
}
