package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wbn0 implements tyq {
    public static final o3r N0;
    public final psw X;
    public final yqg a;
    public final n1k b;
    public final wh1 c;
    public final ycm d;
    public final br0 e;
    public final o15 f;
    public final u3e0 g = o2p1.n();
    public final o3r h = N0;
    public final fbn0 i = new fbn0(e());
    public final eih1 t = new eih1();
    public static final /* synthetic */ mma0[] Z = {new cey0(wbn0.class, "dataPool", "getDataPool()Lcom/spotify/kodiak/dataloader/DataPool;", 0)};
    public static final mka Y = new mka((byte) 17);

    static {
        jd11 jd11Var = rc11.a;
        N0 = w3p1.m(new l4r(new xv00(jd11Var.b(jo70.class)), 1, l9n0.e1, new j4r(l9n0.Z0), sbn0.b), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, l9n0.c1, new j4r(l9n0.a1), l9n0.d1), new l4r(new xv00(jd11Var.b(pjw0.class)), 1, sbn0.c, new j4r(l9n0.b1), sbn0.d), gce0.d1);
    }

    public wbn0(yqg yqgVar, n1k n1kVar, wh1 wh1Var, ycm ycmVar, br0 br0Var, o15 o15Var) {
        this.a = yqgVar;
        this.b = n1kVar;
        this.c = wh1Var;
        this.d = ycmVar;
        this.e = br0Var;
        this.f = o15Var;
        j2i j2iVar = new j2i(109134, new hmk0(this, (byte) 19), true);
        ien0 ien0Var = qsw.a;
        this.X = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.t;
    }

    public final jsw c() {
        return this.X;
    }

    public final d0r e() {
        mma0 mma0Var = Z[0];
        return this.g.a;
    }

    public final mqw getBehavior() {
        return this.i;
    }

    public final f4r getData() {
        return this.h;
    }
}
