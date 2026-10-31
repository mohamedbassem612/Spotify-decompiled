package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qba1 implements xpw {
    public final iu30 a;
    public final vu30 b;
    public final rey0 c = new rey0(new lh2(3, this, qba1.class, "handle", "handle(Lcom/spotify/songdna/searchsheet/SongDnaSearchChipElement$Props;Lcom/spotify/songdna/searchsheet/SongDnaSearchChipElement$Event;Lcom/spotify/element/core/instrumentation/ElementInteractionResult;)V", 0, (byte) 20));
    public final ia00 d = n3o1.q(this).a(r8a1.i, r8a1.t);
    public final psw e;

    public qba1(d061 d061Var, vu30 vu30Var) {
        this.a = d061Var;
        this.b = vu30Var;
        j2i j2iVar = new j2i(-970874300, new u491(this, (byte) 13), true);
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final void e(oba1 oba1Var, n8h1 n8h1Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-820267127);
        int i2 = (x340Var.g(oba1Var) ? 4 : 2) | i | (x340Var.i(n8h1Var) ? 32 : 16) | 384 | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            n8h1 n8h1Var2 = n8h1Var == null ? rih1.a : n8h1Var;
            boolean zI = x340Var.i(n8h1Var);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new gy00(n8h1Var, (byte) 10);
                x340Var.s0(objT);
            }
            dgo1.c(n8h1Var2, (iu30) objT, apo.r(-1921223219, new q081(this, oba1Var), x340Var), x340Var, 384);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new gh61(i, this, oba1Var, n8h1Var, qim0Var2, (byte) 17);
        }
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
