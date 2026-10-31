package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bmr implements xpw {
    public final psw X;
    public final mxr a;
    public final l6s b;
    public final mxr c;
    public final tq90 d;
    public final i3b e;
    public final b0a0 f;
    public final u9c0 g;
    public xab1 h;
    public final js20 i = x3p1.n(new zlr(this, (byte) 0), r5r.U0, ido.U0, (o8n) null, new zlr(this, (byte) 1), 8);
    public final ia00 t = n3o1.q(this).a(zho.N0, zho.O0);

    public bmr(mxr mxrVar, l6s l6sVar, mxr mxrVar2, tq90 tq90Var, i3b i3bVar, b0a0 b0a0Var, u9c0 u9c0Var) {
        this.a = mxrVar;
        this.b = l6sVar;
        this.c = mxrVar2;
        this.d = tq90Var;
        this.e = i3bVar;
        this.f = b0a0Var;
        this.g = u9c0Var;
        j2i j2iVar = new j2i(-11405747, new i6r(this, (byte) 2), true);
        ien0 ien0Var = qsw.a;
        this.X = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.t;
    }

    public final jsw c() {
        return this.X;
    }

    public final void e(int i, String str, Function0 function0, b0k b0kVar, boolean z) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-2132036050);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(function0) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            gbx gbxVar = new gbx(z50.c, function0);
            boolean z2 = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new i3o(str, (byte) 7);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar, ldx.c, s161.b(nim0.a, false, (iu30) objT), (max) null, yla.s(b0kVar3), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(1252805647, new dr0((byte) 18, z), b0kVar3), b0kVar2, 0, 48, 2008);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bk0(this, str, z, function0, i, (byte) 19);
        }
    }

    public final mqw getBehavior() {
        return this.i;
    }
}
