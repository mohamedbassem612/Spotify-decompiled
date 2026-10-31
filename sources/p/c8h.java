package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class c8h implements xpw {
    public final q7u a;
    public final v2y b;
    public final List c = p7h.M(new s5l0[]{s5l0.DARK_MIN, s5l0.DARK_HIGHER, s5l0.LIGHT_MIN, s5l0.LIGHT_HIGHER});
    public final ljm0 d = h7w.D(m4h.W0, (bs50) null, (iu30) null, new j2i(1914366720, new sw1(this, (byte) 6), true), 6);
    public final ia00 e = n3o1.q(this).a(a8h.b, new zee(this, (byte) 17));
    public final psw f;

    public c8h(q7u q7uVar, v2y v2yVar) {
        this.a = q7uVar;
        this.b = v2yVar;
        j2i j2iVar = new j2i(1368543896, new rxg(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.f;
    }

    public final mqw getBehavior() {
        return this.d;
    }
}
