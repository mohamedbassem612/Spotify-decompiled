package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cnb implements tyq {
    public static final o3r P0;
    public final eih1 N0;
    public final psw O0;
    public final o3r X = w3p1.n(new l4r(new xv00(rc11.a.b(zg01.class)), 2, zmb.h, new j4r(zmb.f), zmb.i), new l4r(hvm.d, 2, zmb.t, new j4r(zmb.g), zmb.X), vq9.e1);
    public final ay8 Y;
    public final ljm0 Z;
    public final kdy0 a;
    public final h9d0 b;
    public final p410 c;
    public final sjq0 d;
    public final lls0 e;
    public final String f;
    public final k740 g;
    public final ji01 h;
    public final String i;
    public final d0r t;

    static {
        zmb zmbVar = zmb.c;
        P0 = w3p1.o(new l4r(hjx0.a, 2, zmb.Y, new j4r(zmbVar), zmb.Z), zmb.d);
    }

    public cnb(kdy0 kdy0Var, h9d0 h9d0Var, p410 p410Var, sjq0 sjq0Var, lls0 lls0Var, String str, k740 k740Var, ji01 ji01Var, String str2, d0r d0rVar) {
        this.a = kdy0Var;
        this.b = h9d0Var;
        this.c = p410Var;
        this.d = sjq0Var;
        this.e = lls0Var;
        this.f = str;
        this.g = k740Var;
        this.h = ji01Var;
        this.i = str2;
        this.t = d0rVar;
        this.Y = d3p1.F(d0rVar, P0, str);
        zmb zmbVar = zmb.e;
        fns fnsVar = igu.a;
        this.Z = h7w.B(zmbVar, pyf0.a, (iu30) null, new hp9(this, (byte) 11), 4);
        this.N0 = new eih1();
        j2i j2iVar = new j2i(59747247, new zk9(this, (byte) 23), true);
        ien0 ien0Var = qsw.a;
        this.O0 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.N0;
    }

    public final jsw c() {
        return this.O0;
    }

    public final d0r e() {
        return this.t;
    }

    public final void f(c380 c380Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-320851687);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(c380Var) : x340Var.i(c380Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= x340Var.i(this) ? 256 : 128;
        }
        byte b = 0;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            ven0 ven0VarS = v8r.s(c380Var, x340Var);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                dnc0 dnc0Var = new dnc0(this.t, (Function0) null, (Function0) null, (cc9) null, (guh0) null, 126);
                two1.v(dnc0Var, new yc2(rwq.q(new bp9(ven0VarS, (byte) 4)), (byte) 2), false, new anb(this, b));
                objT = dnc0Var.a();
                x340Var.s0(objT);
            }
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            q1d0 q1d0VarN = jyo1.n(xtb0VarA, (cnc0) objT, (h3h1) null, x340Var, 4);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("book_menu_bar_test_tag", qim0Var3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(8.0f, true, new um5(false));
            fra fraVar = een.N0;
            boolean zI = x340Var.i(q1d0VarN);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new xo8(q1d0VarN, (byte) 1);
                x340Var.s0(objT2);
            }
            ujo1.e(qim0VarN, xtb0VarA, (vzq0) null, d36Var, fraVar, (iq20) null, false, (hxq0) null, (iu30) objT2, x340Var, 0, 460);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b((Object) this, (Object) c380Var, (Object) qim0Var2, i, (byte) 2);
        }
    }

    public final mqw getBehavior() {
        return this.Z;
    }

    public final f4r getData() {
        return this.X;
    }
}
