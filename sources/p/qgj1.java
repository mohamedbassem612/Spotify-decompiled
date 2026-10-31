package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qgj1 implements tyq {
    public static final o3r h;
    public static final o3r i;
    public final zfj1 a;
    public final u3e0 b = o2p1.n();
    public final o3r c = h;
    public final eih1 d = new eih1();
    public final psw e;
    public static final /* synthetic */ mma0[] g = {new cey0(qgj1.class, "dataPool", "getDataPool()Lcom/spotify/kodiak/dataloader/DataPool;", 0)};
    public static final ypa f = new ypa((byte) 29, false);

    static {
        jd11 jd11Var = rc11.a;
        h = w3p1.n(new l4r(new wlu(jd11Var.b(jo70.class)), 1, egj1.i, new j4r(l6j1.b1), egj1.t), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, egj1.c, new j4r(l6j1.c1), egj1.d), zhi1.Z0);
        i = w3p1.m(new l4r(new wlu(jd11Var.b(jo70.class)), 1, egj1.X, new j4r(l6j1.d1), egj1.Y), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, egj1.e, new j4r(l6j1.e1), egj1.f), new l4r(new wlu(jd11Var.b(xkk1.class)), 2, egj1.g, new k4r(egj1.b, lo70.a), egj1.h), rre1.P0);
    }

    public qgj1(zfj1 zfj1Var) {
        this.a = zfj1Var;
        j2i j2iVar = nqj.a;
        ien0 ien0Var = qsw.a;
        this.e = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final d0r e() {
        mma0 mma0Var = g[0];
        return this.b.a;
    }

    public final mqw getBehavior() {
        return this.a;
    }

    public final f4r getData() {
        return this.c;
    }
}
