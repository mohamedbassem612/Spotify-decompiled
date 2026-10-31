package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class od6 {
    public static final z3g1 a = new z3g1(52.0f, Float.valueOf(44.2f), -0.01f, 24);

    public static final void a(gj6 gj6Var, zi6 zi6Var, yux yuxVar, b0k b0kVar, int i) {
        as80 as80Var = mif1.P0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-225989857);
        int i2 = i | (x340Var.g(gj6Var) ? 4 : 2) | (x340Var.g(zi6Var) ? 32 : 16) | (x340Var.g(yuxVar) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            xi6 xi6Var = zi6Var.a;
            long j = gj6Var.k;
            qim0 qim0VarD = u291.d(nim0.a, 1.0f);
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
            int i3 = i2 & 896;
            vi6.a(gj6Var.c, j, yuxVar, gj6Var.f ? vi6.a : a, vi6.h(yuxVar, 10.0f, 36.0f, 174.0f, 88.0f), x340Var, i3);
            x340Var = x340Var;
            float f = 0.0f;
            t1c.a(dug.f(vi6.h(yuxVar, 0.0f, 147.5f, 184.0f, 0.5f), j, d4o1.a), x340Var, 0);
            String str = xi6Var.a;
            List list = xi6Var.b;
            int i4 = i3 | 3072;
            b(str, j, yuxVar, 160.0f, x340Var, i4);
            long j2 = j;
            x340Var.i0(-212734225);
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i5 = size - 1;
                    x340 x340Var2 = x340Var;
                    vi6.b((yj41) list.get(size), i1p1.q(vi6.h(yuxVar, size * 20.0f, 171.0f, 30.0f, 30.0f), er31.a), as80Var, x340Var2, 392, 0);
                    x340Var = x340Var2;
                    if (i5 < 0) {
                        break;
                    } else {
                        size = i5;
                    }
                }
            }
            x340Var.r(false);
            b(xi6Var.c, j2, yuxVar, 215.0f, x340Var, i4);
            yux yuxVar2 = yuxVar;
            x340Var.i0(-212713004);
            int i6 = 0;
            for (Object obj : xi6Var.d) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    p7h.T();
                    throw null;
                }
                yi6 yi6Var = (yi6) obj;
                float f2 = (i6 * 34.0f) + 226.0f;
                x340 x340Var3 = x340Var;
                vi6.b(yi6Var.b, vi6.h(yuxVar2, f, f2, 28.0f, 28.0f), as80Var, x340Var3, 392, 0);
                String str2 = yi6Var.a;
                lee1 lee1VarG = vi6.g(yuxVar, 12.0f, 12.0f, -0.12f, 0.0f, x340Var3, 16);
                uwr uwrVar = cbx.a;
                Object obj2 = ajx.a.b;
                long j3 = j2;
                vi6.c(str2, lee1VarG, j3, vi6.h(yuxVar, 36.0f, f2 + 8.0f, 148.0f, 12.0f), 0, 50.0f, null, x340Var3, 0, 80);
                yuxVar2 = yuxVar;
                x340Var = x340Var3;
                f = f;
                i6 = i7;
                j2 = j3;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oj2(gj6Var, zi6Var, yuxVar, i, (byte) 21);
        }
    }

    public static final void b(String str, long j, yux yuxVar, float f, b0k b0kVar, int i) {
        float f2;
        yux yuxVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1892061002);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.f(j) ? 32 : 16) | (x340Var.g(yuxVar) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            lee1 lee1VarG = vi6.g(yuxVar, 5.0f, 7.0f, 0.0f, 0.0f, x340Var, 24);
            yuxVar2 = yuxVar;
            uwr uwrVar = cbx.a;
            Object obj = ajx.a.b;
            f2 = f;
            vi6.c(str, lee1VarG, j, vi6.h(yuxVar2, 0.0f, f2, 184.0f, 7.0f), 0, 150.0f, null, x340Var, (i2 & 14) | ((i2 << 3) & 896), 80);
            x340Var = x340Var;
        } else {
            f2 = f;
            yuxVar2 = yuxVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nd6(str, j, yuxVar2, f2, i);
        }
    }
}
