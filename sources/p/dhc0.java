package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dhc0 implements xpw {
    public static final long i;
    public final dg30 a;
    public final rgc0 b;
    public final kly0 c;
    public final u9c0 d;
    public final xe01 e;
    public final js20 f;
    public final eih1 g;
    public final psw h;

    static {
        ytw0 ytw0Var = jfv.b;
        i = fdg1.k0(5, ngv.SECONDS);
    }

    public dhc0(dg30 dg30Var, rgc0 rgc0Var, List list, thq thqVar) {
        this.a = dg30Var;
        this.b = rgc0Var;
        this.c = thqVar;
        this.d = cto1.q(dg30Var);
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        int i2 = 0;
        for (Object obj : list2) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            mr20 mr20VarA = ((wgc0) obj).a();
            ytw0 ytw0Var = jfv.b;
            arrayList.add(new dn6(rqt0.u(i6p1.v(mr20VarA, fdg1.k0(1, ngv.SECONDS), (Object) null)), i2, this));
            i2 = i3;
        }
        ve01 ve01VarR = d5p1.r(h4p1.l(new tya(rqt0.u(new sr0(f5p1.q(new wa3((mr20[]) o7h.l1(arrayList).toArray(new mr20[0]), (byte) 19), new e9c0(this, (lnm) null, (byte) 3)), new p811(), new p811(), this, (byte) 10)), (lnm) null, (byte) 7)), this.d, new alb1(0L, Long.MAX_VALUE), 1);
        this.e = d5p1.t(rqt0.u(new dwv(ve01VarR, (byte) 10)), this.d, new alb1(0L, Long.MAX_VALUE), (Object) null);
        this.f = x3p1.m(ve01VarR, k8b0.e, v30.c1, (o8n) null, xdc0.S0, 8);
        this.g = f3o1.u();
        j2i j2iVar = nvi.a;
        ien0 ien0Var = qsw.a;
        this.h = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.g;
    }

    public final jsw c() {
        return this.h;
    }

    public final mqw getBehavior() {
        return this.f;
    }
}
