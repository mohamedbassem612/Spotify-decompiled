package p;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u651 {
    public final nu a;
    public final br0 b;
    public final hc51 c;
    public final y751 d;
    public final e8r0 e;
    public final w651 f;
    public final v3v0 g;
    public final z72 h;
    public final m251 i;
    public final p40 j;
    public final idd1 k;
    public final umf0 m;
    public final idd1 o;
    public final bpb1 l = gio1.b(se20.a);
    public final bpb1 n = gio1.b(z6x.a);

    public u651(bop bopVar, dop dopVar, eop eopVar, gop gopVar, nu nuVar, br0 br0Var, znp znpVar, hc51 hc51Var, y751 y751Var, sco0 sco0Var, e8r0 e8r0Var, w651 w651Var, v3v0 v3v0Var, String str, boolean z) {
        this.a = nuVar;
        this.b = br0Var;
        this.c = hc51Var;
        this.d = y751Var;
        this.e = e8r0Var;
        this.f = w651Var;
        this.g = v3v0Var;
        this.h = bopVar.a(str, z, v3v0Var);
        this.i = new m251(str, z);
        this.j = dopVar.a(v3v0Var);
        this.k = new idd1(new rl21(eopVar, this, (byte) 22));
        this.m = gopVar.a(v3v0Var);
        this.o = new idd1(new rl21(znpVar, this, (byte) 21));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a(lw41 lw41Var, b851 b851Var, a851 a851Var, e7r0 e7r0Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        qim0 qim0Var3;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(610506031);
        int i2 = i | (x340Var.g(lw41Var) ? 4 : 2) | (x340Var.g(b851Var) ? 32 : 16) | (x340Var.e(a851Var.ordinal()) ? 256 : 128) | (x340Var.i(e7r0Var) ? 2048 : 1024) | 24576 | (x340Var.i(this) ? 131072 : 65536);
        byte b = 1;
        byte b2 = 0;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            xe01 xe01Var = this.d.b;
            rwq.h(xe01Var, x340Var, 0).getValue();
            x751 x751Var = (x751) xe01Var.a.getValue();
            xb51 xb51Var = null;
            if (x751Var != null) {
                if (x751Var.a != lw41Var) {
                    x751Var = null;
                }
                if (x751Var != null) {
                    xb51Var = new xb51(x751Var.b);
                }
            }
            boolean zI = x340Var.i(this);
            Object objT = x340Var.T();
            if (zI || objT == obj) {
                objT = new r651(this, b);
                x340Var.s0(objT);
            }
            iu30 iu30Var = (iu30) objT;
            boolean zI2 = x340Var.i(this);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == obj) {
                objT2 = new r651(this, b2);
                x340Var.s0(objT2);
            }
            iu30 iu30Var2 = (iu30) objT2;
            x340Var.i0(-1600150851);
            x340Var.r(false);
            x340Var.i0(-1600100756);
            x340Var.r(false);
            x340Var.i0(-1599123139);
            x340Var.r(false);
            boolean z = lw41Var instanceof kw41;
            qim0 qim0Var4 = nim0.a;
            if (z) {
                x340Var.i0(-1599020653);
                otw.c(this.a, rih1.a, qim0Var4, (ipb1) null, x340Var, 432, 8);
                qim0Var3 = qim0Var4;
                x340Var.r(false);
            } else {
                qim0Var3 = qim0Var4;
                if (lw41Var instanceof iw41) {
                    x340Var.i0(-1598864444);
                    otw.c(this.m, ((iw41) lw41Var).a, i1o1.E(qim0Var3, xb51Var, iu30Var2, iu30Var), (ipb1) null, x340Var, 0, 8);
                    x340Var.r(false);
                } else if (lw41Var instanceof hw41) {
                    x340Var.i0(-1598473596);
                    otw.c(this.b, ((hw41) lw41Var).a, i1o1.E(qim0Var3, xb51Var, iu30Var2, iu30Var), (ipb1) null, x340Var, 0, 8);
                    x340Var.r(false);
                } else {
                    if (lw41Var instanceof gw41) {
                        x340Var.i0(-1598090777);
                        x340Var.r(false);
                        eg.m("SearchPageComposer does not support ElementModel.Content");
                        return;
                    }
                    if (!(lw41Var instanceof jw41)) {
                        throw p3d1.k(x340Var, -1714149469, false);
                    }
                    x340Var.i0(-1597776871);
                    int i3 = i2 & 14;
                    boolean zG = x340Var.g(xb51Var) | (i3 == 4);
                    Object objT3 = x340Var.T();
                    if (zG || objT3 == obj) {
                        objT3 = Boolean.valueOf(!u890.j(this.n.getValue(), ((jw41) lw41Var).a));
                        x340Var.s0(objT3);
                    }
                    boolean zBooleanValue = ((Boolean) objT3).booleanValue();
                    List list = ((jw41) lw41Var).a;
                    boolean zI3 = x340Var.i(this) | (i3 == 4);
                    Object objT4 = x340Var.T();
                    if (zI3 || objT4 == obj) {
                        objT4 = new rl21(this, lw41Var, (byte) 20);
                        x340Var.s0(objT4);
                    }
                    qxd0.C(list, (Function0) objT4, x340Var);
                    xzn1.d(uyn1.C(list, x340Var), b851Var, this.g, (cnc0) this.o.getValue(), a851Var == a851.t ? (byte) 2 : (byte) 1, true, this.d, qim0Var3, xb51Var, zBooleanValue, iu30Var2, iu30Var, x340Var, (i2 & 112) | 100663296, 6);
                    x340Var = x340Var;
                    x340Var.r(false);
                }
            }
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wyy0((Object) this, (Object) lw41Var, (Object) b851Var, (Object) a851Var, (Object) e7r0Var, (Object) qim0Var2, i, (byte) 5);
        }
    }

    public final void b(od51 od51Var, qim0 qim0Var, b0k b0kVar, int i) {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(305429701);
        byte b = 2;
        int i2 = (x340Var.i(od51Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16) | (x340Var.i(this) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean zI = x340Var.i(od51Var);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new l451(od51Var, (byte) 3);
                x340Var.s0(objT);
            }
            s9p1.u((Function0) objT, x340Var, 0);
            lw41 lw41Var = od51Var.a;
            x751 x751Var = (x751) this.d.a.getValue();
            if (x751Var != null && x751Var.a == lw41Var && !x751Var.c) {
                this.c.e(new se5((bc51) null, x751Var.b, true));
            }
            e7r0 e7r0Var = od51Var.h;
            p6r0 p6r0Var = e7r0Var.b;
            tv80 tv80Var = e7r0Var.d;
            boolean zI2 = x340Var.i(this) | x340Var.i(e7r0Var);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new s651(this, e7r0Var);
                x340Var.s0(objT2);
            }
            qxd0.h(p6r0Var, tv80Var, (iu30) objT2, x340Var);
            boolean zI3 = x340Var.i(this);
            Object objT3 = x340Var.T();
            if (zI3 || objT3 == m4cVar) {
                objT3 = new r651(this, b);
                x340Var.s0(objT3);
            }
            qxd0.i(this.e, (iu30) objT3, x340Var);
            boolean zI4 = x340Var.i(e7r0Var) | x340Var.i(this);
            Object objT4 = x340Var.T();
            if (zI4 || objT4 == m4cVar) {
                objT4 = new s651(e7r0Var, this);
                x340Var.s0(objT4);
            }
            dgo1.c(e7r0Var, (iu30) objT4, apo.r(535529217, new t651(qim0Var, this, od51Var), x340Var), x340Var, 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new t651(this, od51Var, qim0Var, i);
        }
    }
}
