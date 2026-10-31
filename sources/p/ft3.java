package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ft3 implements xpw {
    public final bqk0 a;
    public final pt3 b;
    public final pt3 c;
    public final bt3 d;
    public iu30 e = dt3.b;
    public final umf0 f;
    public final ldo g;
    public final e7m0 h;
    public final ia00 i;
    public final psw t;

    public ft3(bqk0 bqk0Var, g931 g931Var, o8p o8pVar, pt3 pt3Var, pt3 pt3Var2, p8p p8pVar, bt3 bt3Var) {
        umf0 umf0Var;
        ldo ldoVar;
        this.a = bqk0Var;
        this.b = pt3Var;
        this.c = pt3Var2;
        this.d = bt3Var;
        xb2 xb2Var = new xb2(this, (byte) 13);
        switch (o8pVar.a) {
            case 0:
                umf0Var = new umf0(new bqk0((byte) 6), xb2Var);
                break;
            default:
                umf0Var = new umf0(new bqk0((byte) 6), xb2Var);
                break;
        }
        this.f = umf0Var;
        qt3 qt3Var = new qt3(new ve3((Object) this, (byte) 5), new et3(this, (byte) 0), new et3(this, (byte) 1));
        switch (p8pVar.a) {
            case 0:
                ldoVar = new ldo(new bqk0((byte) 6), qt3Var);
                break;
            default:
                ldoVar = new ldo(new bqk0((byte) 6), qt3Var);
                break;
        }
        this.g = ldoVar;
        se11 se11Var = gt3.a;
        dt3 dt3Var = dt3.c;
        n4 n4Var = n4.h;
        this.h = new e7m0(dt3Var, new dq7(n4Var, (byte) 21), new qn(g931Var, bt3Var, (byte) 1), p83.Z0, new cas());
        this.i = n3o1.q(this).a(new v72(this, (byte) 9), k63.S0);
        j2i j2iVar = new j2i(-711958677, new i43(this, (byte) 5), true);
        ien0 ien0Var = qsw.a;
        this.t = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.t;
    }

    public final mqw getBehavior() {
        return this.h;
    }
}
