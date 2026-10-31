package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class m601 implements xpw {
    public final hws a;
    public final rey0 b = new rey0(new f2z0(this, (byte) 15));
    public final ia00 c = n3o1.q(this).a(kxz0.Y, kxz0.Z);
    public final psw d;

    public m601(hws hwsVar) {
        this.a = hwsVar;
        j2i j2iVar = new j2i(-863258061, new zyy0(this, (byte) 23), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final void e(boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1526728125);
        int i2 = i | (b0kVar3.h(z) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16);
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            b0kVar2 = b0kVar3;
            jto1.b(anm1.N("reactions_toggle", nim0.a), (uvx) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, jbj.a, (xu30) null, (xu30) null, jbj.b, apo.r(1786579702, new nr3(z, iu30Var, (byte) 3), b0kVar3), (xu30) null, (xu30) null, jbj.c, b0kVar2, 100663296, 197040, 26366);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new r7e0(this, z, iu30Var, i, (byte) 19);
        }
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
