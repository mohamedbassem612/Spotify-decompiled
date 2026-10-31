package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class zuo {
    public static final ceo a = new ceo(0.0f, 0.0f, 0.58f, 1.0f);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(float f, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        float f2;
        char c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1916876432);
        int i2 = (x340Var.d(f) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x9a0 x9a0Var = (x9a0) x340Var.k(y9a0.a);
            rh31[] rh31VarArr = new rh31[3];
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                f2 = 0.0f;
                c = 1;
                rh31 rh31Var = new rh31(x9a0Var.c, 0.1f, new zsc((byte) 20), c97.b(0.0f));
                x340Var.s0(rh31Var);
                objT = rh31Var;
            } else {
                f2 = 0.0f;
                c = 1;
            }
            rh31VarArr[0] = objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                rh31 rh31Var2 = new rh31(x9a0Var.b, 0.5f, new zsc((byte) 20), c97.b(f2));
                x340Var.s0(rh31Var2);
                objT2 = rh31Var2;
            }
            rh31VarArr[c] = objT2;
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                rh31 rh31Var3 = new rh31(x9a0Var.a, 0.9f, new zsc((byte) 20), c97.b(f2));
                x340Var.s0(rh31Var3);
                objT3 = rh31Var3;
            }
            rh31VarArr[2] = objT3;
            List<rh31> listM = p7h.M(rh31VarArr);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z2 = ((i2 & 112) == 32 ? c : (char) 0) | (x340Var.i(listM) ? 1 : 0);
            Object objT4 = x340Var.T();
            if (z2 != 0 || objT4 == m4cVar) {
                objT4 = new wuo(z, listM, (lnm) null);
                x340Var.s0(objT4);
            }
            qxd0.t(boolValueOf, x340Var, (vu30) objT4);
            qim0Var2 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(65819712);
            for (rh31 rh31Var4 : listM) {
                float f3 = f2;
                b(z ? (yoi1.o((f - 0.2f) / 0.8f, f3, 1.0f) * 0.1f * rh31Var4.b) + 1.0f : 1.0f, rh31Var4.c, ((Number) rh31Var4.d.e()).floatValue(), rh31Var4.a, null, 0.0f, x340Var, 0);
                f2 = f3;
            }
            x340Var.r(false);
            x340Var.r(c);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jrc(f, z, qim0Var2, i);
        }
    }

    public static final void b(float f, zsc zscVar, float f2, long j, qim0 qim0Var, float f3, b0k b0kVar, int i) {
        qim0 qim0Var2;
        float f4;
        qim0 qim0Var3;
        int i2;
        float f5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2046359712);
        int i3 = i | (x340Var.d(f) ? 4 : 2) | (x340Var.g(zscVar) ? 32 : 16) | (x340Var.d(f2) ? 256 : 128) | (x340Var.f(j) ? 2048 : 1024) | 90112;
        if (x340Var.Y(i3 & 1, (74899 & i3) != 74898)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                float fM = dsa0.m(x340Var, 2131166195);
                qim0Var3 = nim0.a;
                i2 = i3 & (-458753);
                f5 = fM;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
                i2 = i3 & (-458753);
                f5 = f3;
            }
            x340Var.s();
            qim0 qim0VarX = uyn1.x(u291.d(qim0Var3, 1.0f), f5);
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                xuo xuoVar = new xuo(zscVar, f, f2, j);
                x340Var.s0(xuoVar);
                objT = xuoVar;
            }
            j0o1.b(0, x340Var, (iu30) objT, qim0VarX);
            f4 = f5;
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            f4 = f3;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yuo(f, zscVar, f2, j, qim0Var2, f4, i);
        }
    }

    public static final Object c(o95 o95Var, float f, a8d1 a8d1Var) {
        Object objB = o95.b(o95Var, new Float(((Number) o95Var.e()).floatValue() + f), irn1.o0(1000, 0, a, 2), (Float) null, (iu30) null, a8d1Var, 12);
        return objB == d9n.a ? objB : rih1.a;
    }
}
