package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jh7 implements o1i {
    public final nfx a;
    public final bcl1 b;

    public jh7(nfx nfxVar, bcl1 bcl1Var) {
        this.a = nfxVar;
        this.b = bcl1Var;
    }

    @Override // p.o1i
    public final x0i b(z0i z0iVar, o0i o0iVar) {
        return new x0i(new w0i(o0iVar.e, "associated_texts_row", (String) null, (String) null, 12));
    }

    @Override // p.o1i
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(dh7 dh7Var, o0i o0iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        o0i o0iVar2;
        b0k b0kVar2;
        Object uh0Var;
        ven0 ven0Var;
        dh7 dh7Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1188409655);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(dh7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(o0iVar) : b0kVar3.i(o0iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(this) ? 2048 : 1024;
        }
        int i3 = i2;
        boolean z = false;
        if (b0kVar3.Y(i3 & 1, (i3 & 1171) != 1170)) {
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = this.a.a((l0i) null);
                b0kVar3.s0(objT);
            }
            qzh qzhVar = (qzh) objT;
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object objT2 = b0kVar3.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = xto.t(Boolean.FALSE);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            boolean zI = b0kVar3.i(qzhVar);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new ih7(qzhVar, (byte) 0);
                b0kVar3.s0(objT3);
            }
            iu30 iu30Var = (iu30) objT3;
            boolean zI2 = (i4 == 4) | b0kVar3.i(qzhVar) | b0kVar3.g(ven0Var2) | b0kVar3.i(this);
            int i5 = i3 & 112;
            if (i5 == 32 || ((i3 & 64) != 0 && b0kVar3.i(o0iVar))) {
                z = true;
            }
            boolean z3 = zI2 | z;
            Object objT4 = b0kVar3.T();
            if (z3 || objT4 == m4cVar) {
                ven0Var = ven0Var2;
                uh0Var = new uh0(qzhVar, dh7Var, ven0Var, this, o0iVar, (byte) 9);
                dh7Var2 = dh7Var;
                o0iVar2 = o0iVar;
                b0kVar3.s0(uh0Var);
            } else {
                uh0Var = objT4;
                dh7Var2 = dh7Var;
                ven0Var = ven0Var2;
                o0iVar2 = o0iVar;
            }
            ven0 ven0Var3 = ven0Var;
            b0kVar2 = b0kVar3;
            dm5.a(iu30Var, qim0Var, (iu30) uh0Var, b0kVar2, (i3 >> 3) & 112, 0);
            boolean zG = b0kVar2.g(ven0Var3);
            Object objT5 = b0kVar2.T();
            if (zG || objT5 == m4cVar) {
                objT5 = new xj0(ven0Var3, (byte) 28);
                b0kVar2.s0(objT5);
            }
            oto1.c(dh7Var2, o0iVar2, (iu30) objT5, b0kVar2, i4 | 64 | i5);
        } else {
            o0iVar2 = o0iVar;
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new l8(i, this, dh7Var, o0iVar2, qim0Var, (byte) 18);
        }
    }
}
