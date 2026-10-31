package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class kdl1 {
    public static final long a = z4p1.g(4280624421L);

    public static final void a(int i, boolean z, float f, float f2, boolean z2, pmg1 pmg1Var, qim0 qim0Var, b0k b0kVar, int i2) {
        x340 x340Var;
        qim0 qim0Var2;
        Object idl1Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1183517807);
        int i3 = i2 | (x340Var2.e(i) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.d(f) ? 256 : 128) | (x340Var2.d(f2) ? 2048 : 1024) | (x340Var2.h(z2) ? 16384 : 8192) | (x340Var2.g(pmg1Var) ? 131072 : 65536) | 1572864;
        if (x340Var2.Y(i3 & 1, (599187 & i3) != 599186)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var2).b.a;
            tob1 tob1VarB = z95.b(i, irn1.o0(300, 0, mlv.a, 2), "waveformBackgroundNumberOfBarsAnimation", (iu30) null, x340Var2, 3072, 20);
            x340Var = x340Var2;
            float fN0 = ((wat) x340Var.k(t4k.h)).N0(pmg1Var.a);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = u291.h(u291.v(qim0Var3, fN0), f2);
            boolean zG = ((i3 & 896) == 256) | ((57344 & i3) == 16384) | x340Var.g(tob1VarB) | ((458752 & i3) == 131072) | ((i3 & 112) == 32) | x340Var.f(j);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                idl1Var = new idl1(f, z2, pmg1Var, a, z, j, tob1VarB);
                x340Var.s0(idl1Var);
            } else {
                idl1Var = objT;
            }
            j0o1.b(0, x340Var, (iu30) idl1Var, qim0VarH);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jdl1(i, z, f, f2, z2, pmg1Var, qim0Var2, i2);
        }
    }
}
