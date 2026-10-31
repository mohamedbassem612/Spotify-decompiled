package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class svh {
    public static final cr31 a = er31.b(4.0f);

    public static final void a(int i, int i2, String str, String str2, String str3, b0k b0kVar, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-882368244);
        int i3 = i2 | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.g(str2) ? 32 : 16) | 384 | (b0kVar3.g(str3) ? 2048 : 1024) | (b0kVar3.e(i == 0 ? -1 : l1d.C(i)) ? 16384 : 8192);
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            String strY0 = o7h.y0(f46.i0(new String[]{str, str2}), ", ", (String) null, (String) null, (iu30) null, 62);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarN = anm1.N("compact-user-activity-row-test-tag", uyn1.B(qim0VarF, 0.0f, 0.0f, 0.0f, 12.0f, 7));
            boolean zG = b0kVar3.g(strY0);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                objT = new irf(strY0, (byte) 13);
                b0kVar3.s0(objT);
            }
            qim0Var2 = qim0Var3;
            b0kVar2 = b0kVar3;
            jto1.b(s161.b(qim0VarN, false, (iu30) objT), new uvx((pgx) null, 3, (tvx) null, (p3v) null, 27), null, false, null, null, null, null, null, apo.r(879768899, new kaf(str3, (byte) 9), b0kVar3), null, apo.r(-721601468, new qvh(i, str2, (byte) 0), b0kVar3), null, null, null, apo.r(1301476936, new kaf(str, (byte) 10), b0kVar3), b0kVar2, 805306432, 196656, 30204);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new c5(str, str2, qim0Var2, str3, i, i2);
        }
    }

    public static final void b(qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-559510983);
        int i2 = i | 6;
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(b0kVar3).a.b.a();
            zov0 zov0Var = cbx.b(b0kVar3).g;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(u291.f(qim0Var3, 1.0f), new uvx((pgx) null, 3, (tvx) null, (p3v) null, 27), null, false, null, null, null, null, null, apo.r(-2045413598, new rvh((byte) 0, jA), b0kVar3), null, apo.r(1653491713, new rvh((byte) 1, jA), b0kVar3), null, null, null, apo.r(-1083429507, new rvh((byte) 2, jA), b0kVar3), b0kVar2, 805306432, 196656, 30204);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var2, i, (byte) 27);
        }
    }
}
