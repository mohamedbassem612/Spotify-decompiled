package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vh1 implements tyq {
    public final oj3 a;
    public final rzo b;
    public final d0r c;
    public final o3r d = w3p1.n(new l4r(hvm.b, 1, uh1.b, new j4r(gx0.b1), uh1.c), new l4r(new xv00(rc11.a.b(iam.class)), 2, gx0.d1, new j4r(gx0.c1), gx0.e1), new bom1(this, (byte) 10));
    public final js20 e = z0o1.j(new j2(this, (byte) 28), ah1.c, (iu30) null, 12);
    public final eih1 f = new eih1();
    public final psw g;

    public vh1(oj3 oj3Var, rzo rzoVar, d0r d0rVar) {
        this.a = oj3Var;
        this.b = rzoVar;
        this.c = d0rVar;
        j2i j2iVar = new j2i(-930437852, new r1(this, (byte) 15), true);
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
    }

    public static ijo f(String str, vnb1 vnb1Var) {
        Set setA0 = dm61.A0((vnb1Var == null || !vnb1Var.a) ? null : str);
        if (vnb1Var == null || !vnb1Var.b) {
            str = null;
        }
        return new ijo(12, setA0, dm61.A0(str));
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.g;
    }

    public final d0r e() {
        return this.c;
    }

    public final mqw getBehavior() {
        return this.e;
    }

    public final f4r getData() {
        return this.d;
    }
}
