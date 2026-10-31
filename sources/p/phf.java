package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class phf implements tyq {
    public static final /* synthetic */ mma0[] Z = {new cey0(phf.class, "dataPool", "getDataPool()Lcom/spotify/kodiak/dataloader/DataPool;", 0)};
    public final psw Y;
    public final woa a;
    public final kma b;
    public final yqg c;
    public final gm31 d;
    public final em31 e;
    public final q8n f;
    public final q8n g;
    public final u3e0 h = o2p1.n();
    public final i13 i = i13.f;
    public final js20 t = x3p1.n(nve.V0, new rs7(this, (byte) 22), new qza((avl1) this, (byte) 14), (o8n) null, (iu30) null, 24);
    public final eih1 X = new eih1();

    public phf(woa woaVar, kma kmaVar, yqg yqgVar, gm31 gm31Var, em31 em31Var, q8n q8nVar, q8n q8nVar2) {
        this.a = woaVar;
        this.b = kmaVar;
        this.c = yqgVar;
        this.d = gm31Var;
        this.e = em31Var;
        this.f = q8nVar;
        this.g = q8nVar2;
        j2i j2iVar = new j2i(-1082554701, new gtd(this, (byte) 16), true);
        ien0 ien0Var = qsw.a;
        this.Y = new psw(j2iVar, (byte) 0);
    }

    public static ohf f(ahf ahfVar) {
        jto1 mhfVar;
        if (ahfVar instanceof zgf) {
            return new ohf(lhf.b, 0.0f, mz61.b, 0, false, false);
        }
        ygf ygfVar = (ygf) ahfVar;
        oz61 oz61Var = ygfVar.a;
        jz61 jz61Var = oz61Var.a;
        fuo1 fuo1Var = jz61Var.b;
        if (fuo1Var instanceof fz61) {
            fz61 fz61Var = (fz61) fuo1Var;
            mhfVar = new jhf(fz61Var.b, fz61Var.c);
        } else if (fuo1Var instanceof gz61) {
            mhfVar = new khf(((gz61) fuo1Var).b);
        } else if (fuo1Var instanceof iz61) {
            mhfVar = new nhf(((iz61) fuo1Var).b);
        } else {
            if (!(fuo1Var instanceof hz61)) {
                eg.o();
                return null;
            }
            mhfVar = new mhf(((hz61) fuo1Var).b);
        }
        return new ohf(mhfVar, jz61Var.a, oz61Var.b, oz61Var.c, oz61Var.d, ygfVar.b);
    }

    public final rqw a() {
        return this.X;
    }

    public final jsw c() {
        return this.Y;
    }

    public final d0r e() {
        mma0 mma0Var = Z[0];
        return this.h.a;
    }

    public final mqw getBehavior() {
        return this.t;
    }

    public final f4r getData() {
        return this.i;
    }
}
