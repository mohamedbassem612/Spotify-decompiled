package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class svd1 implements tyq {
    public final d0r a;
    public final o3r b;
    public final iik0 c;
    public final js20 d;
    public final ia00 e;
    public final psw f;

    public svd1(d0r d0rVar) {
        b3s b3sVar = b3s.c;
        this.a = d0rVar;
        this.b = w3p1.o(new l4r(new xv00(rc11.a.b(xkk1.class)), 2, pod1.U0, new j4r(pod1.W0), pod1.V0), pod1.X0);
        this.c = new iik0(this, (byte) 26);
        this.d = x3p1.n(new qwc1(this, (byte) 12), new qd81(this, (byte) 25), new rvd1(this, (byte) 0), b3sVar, (iu30) null, 16);
        this.e = n3o1.q(this).a(i6d1.Z, i6d1.N0);
        j2i j2iVar = pmj.a;
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public static qvd1 f(String str) {
        Set set = s4b1.f;
        return uic.h(str, new blc0[]{blc0.u1, blc0.A1, blc0.M1, blc0.da}) ? qvd1.a : qvd1.b;
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.f;
    }

    public final d0r e() {
        return this.a;
    }

    public final mqw getBehavior() {
        return this.d;
    }

    public final f4r getData() {
        return this.c;
    }
}
