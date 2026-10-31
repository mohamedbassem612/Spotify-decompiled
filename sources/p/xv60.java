package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xv60 implements xpw {
    public final psw N0;
    public final svh0 X;
    public final js20 Y;
    public final ia00 Z = n3o1.q(this).a(new wx00(this, (byte) 27), oe60.h);
    public final vu60 a;
    public final tob1 b;
    public final d6o0 c;
    public final lbl0 d;
    public final i030 e;
    public final njp f;
    public final ojp g;
    public final js90 h;
    public final vu60 i;
    public final b0a0 t;

    public xv60(vu60 vu60Var, ven0 ven0Var, i6o0 i6o0Var, lbl0 lbl0Var, i030 i030Var, njp njpVar, ojp ojpVar, js90 js90Var, vu60 vu60Var2, los losVar, b0a0 b0a0Var) {
        this.a = vu60Var;
        this.b = ven0Var;
        this.c = i6o0Var;
        this.d = lbl0Var;
        this.e = i030Var;
        this.f = njpVar;
        this.g = ojpVar;
        this.h = js90Var;
        this.i = vu60Var2;
        this.t = b0a0Var;
        this.X = new svh0(losVar, (byte) 16);
        this.Y = x3p1.m(new xr0(d5p1.h(vu60Var.e), (byte) 17), new uv60(this, (byte) 0), new jb50(this, (byte) 10), (o8n) null, new uv60(this, (byte) 1), 8);
        j2i j2iVar = new j2i(-1392196420, new wv60(this, (byte) 0), true);
        ien0 ien0Var = qsw.a;
        this.N0 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.Z;
    }

    public final jsw c() {
        return this.N0;
    }

    public final void e(sv60 sv60Var, tob1 tob1Var, d6o0 d6o0Var, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-743343118);
        int i2 = i | (b0kVar3.i(sv60Var) ? 4 : 2) | (b0kVar3.i(tob1Var) ? 32 : 16) | (b0kVar3.i(d6o0Var) ? 256 : 128) | (b0kVar3.i(iu30Var) ? 2048 : 1024) | (b0kVar3.i(this) ? 16384 : 8192);
        boolean z = false;
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            b0kVar3.i0(-1388158012);
            float fM0 = ((wat) b0kVar3.k(t4k.h)).M0((int) (((crl1) b0kVar3.k(t4k.u)).a() & 4294967295L));
            b0kVar3.r(false);
            if (p3v.b(fM0, 400.0f) >= 0) {
                z = true;
            }
            b0kVar2 = b0kVar3;
            nyx.a(2, (wux) null, apo.r(-543929921, new vl(tob1Var, this, sv60Var, iu30Var, sv60Var.c.b.a.size() == 1, d6o0Var, z), b0kVar3), b0kVar2, 3078, 6);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new uk20((byte) 7, i, this, sv60Var, tob1Var, d6o0Var, iu30Var);
        }
    }

    public final mqw getBehavior() {
        return this.Y;
    }
}
