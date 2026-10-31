package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class lxc1 {
    public static final long a = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(4.0f)) & 4294967295L);
    public static final float b = 26.0f;

    public static final void a(mxc1 mxc1Var, kes kesVar, int i, int i2, qim0 qim0Var, b0k b0kVar, int i3) {
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-912041839);
        int i4 = i3 | (x340Var.i(mxc1Var) ? 4 : 2) | (x340Var.g(kesVar) ? 32 : 16) | (x340Var.e(i) ? 256 : 128) | (x340Var.e(i2) ? 2048 : 1024) | (x340Var.g(qim0Var) ? 16384 : 8192);
        if (x340Var.Y(i4 & 1, (i4 & 9363) != 9362)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            boolean z = (i4 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == obj) {
                objT = Float.valueOf(i * 0.5625f);
                x340Var.s0(objT);
            }
            float fFloatValue = ((Number) objT).floatValue();
            boolean z2 = (i4 & 7168) == 2048;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == obj) {
                objT2 = Float.valueOf((i2 * 0.5f) - (0.5f * fFloatValue));
                x340Var.s0(objT2);
            }
            float fFloatValue2 = ((Number) objT2).floatValue();
            fdr0 fdr0Var = new fdr0(watVar.N0(fFloatValue));
            zzq0 zzq0VarH = uyn1.h(2, watVar.N0(Math.max(0.0f, fFloatValue2)), 0.0f);
            ilv.a.getClass();
            int i5 = (i4 >> 3) & 14;
            w0h1.c(kesVar, qim0Var, zzq0VarH, fdr0Var, 0, 16.0f, (pl3) null, q0o1.j(kesVar, (bkr0) null, irn1.o0(500, 0, flv.e, 2), x340Var, i5 | 3072, 22), false, (iu30) null, (d6o0) null, (xu91) null, (hxq0) null, apo.r(-466319518, new kxc1(kesVar, mxc1Var, watVar, fFloatValue, i), x340Var), x340Var, 196608 | i5 | ((i4 >> 9) & 112), 16208);
            x340Var = x340Var;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk0(mxc1Var, kesVar, i, i2, qim0Var, i3);
        }
    }
}
