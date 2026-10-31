package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x9l1 implements o1i {
    public final cce a;
    public final kly0 b;
    public final lzn0 c;
    public final aod d;
    public final mv2 e;
    public final hcl1 f;

    public x9l1(cce cceVar, jly0 jly0Var, lzn0 lzn0Var, aod aodVar, mv2 mv2Var, hcl1 hcl1Var) {
        this.a = cceVar;
        this.b = jly0Var;
        this.c = lzn0Var;
        this.d = aodVar;
        this.e = mv2Var;
        this.f = hcl1Var;
    }

    public final x0i b(z0i z0iVar, o0i o0iVar) {
        return new x0i(new w0i(o0iVar.e, "pivoting_carousel_layout", ((v9l1) z0iVar).b, null, 8));
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(v9l1 v9l1Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        v9l1 v9l1Var2 = v9l1Var;
        o0i o0iVar2 = o0iVar;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(909605273);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(v9l1Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(o0iVar2) : x340Var.i(o0iVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = i3 & 112;
            boolean zI = x340Var.i(this) | (i4 == 32 || ((i3 & 64) != 0 && x340Var.i(o0iVar2)));
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new w9l1(this, o0iVar2, (byte) 0);
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            boolean zI2 = x340Var.i(this) | (i4 == 32 || ((i3 & 64) != 0 && x340Var.i(o0iVar2)));
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new w9l1(this, o0iVar2, (byte) 1);
                x340Var.s0(objT2);
            }
            cxm.s(this.b, this.a, v9l1Var, this.f, o0iVar, iu30Var, (iu30) objT2, qim0Var, x340Var, ((i3 << 6) & 896) | 32768 | ((i3 << 9) & 57344) | ((i3 << 15) & 29360128));
            v9l1Var2 = v9l1Var;
            o0iVar2 = o0iVar;
            boolean zI3 = x340Var.i(this) | (i4 == 32 || ((i3 & 64) != 0 && x340Var.i(o0iVar2)));
            int i5 = i3 & 14;
            boolean z = zI3 | (i5 == 4);
            Object objT3 = x340Var.T();
            if (z || objT3 == m4cVar) {
                objT3 = new jyi1(this, o0iVar2, v9l1Var2, (byte) 10);
                x340Var.s0(objT3);
            }
            oto1.c(v9l1Var2, o0iVar2, (iu30) objT3, x340Var, i5 | 64 | i4);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swk1(i, this, v9l1Var2, o0iVar2, qim0Var, (byte) 5);
        }
    }
}
