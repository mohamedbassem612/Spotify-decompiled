package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j721 implements xpw {
    public final u9c0 a;
    public final ggx0 b;
    public final mzr0 c;
    public final bpb1 d;
    public final js20 e;
    public final eih1 f;
    public final psw g;

    public j721(u9c0 u9c0Var, ggx0 ggx0Var, mzr0 mzr0Var) {
        this.a = u9c0Var;
        this.b = ggx0Var;
        this.c = mzr0Var;
        bpb1 bpb1VarB = gio1.b(f721.a);
        this.d = bpb1VarB;
        this.e = x3p1.m(bpb1VarB, new g721(this, (byte) 0), rs11.O0, (o8n) null, new g721(this, (byte) 1), 8);
        this.f = new eih1();
        j2i j2iVar = bdj.a;
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(d721 d721Var, onm onmVar) {
        i721 i721Var;
        if (onmVar instanceof i721) {
            i721Var = (i721) onmVar;
            int i = i721Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i721Var.c = i - Integer.MIN_VALUE;
            } else {
                i721Var = new i721(this, onmVar);
            }
        } else {
            i721Var = new i721(this, onmVar);
        }
        Object objQ = i721Var.a;
        int i2 = i721Var.c;
        rih1 rih1Var = rih1.a;
        byte b = 1;
        bpb1 bpb1Var = this.d;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(objQ);
            if (bpb1Var.getValue() != f721.a) {
                return rih1Var;
            }
            bpb1Var.getClass();
            bpb1Var.m((Object) null, f721.b);
            s2t s2tVarQ = fn31.q(this.a, (o8n) null, 0, new h721(this, d721Var, lnmVar, b), 3);
            i721Var.c = 1;
            objQ = s2tVarQ.Q(i721Var);
            d9n d9nVar = d9n.a;
            if (objQ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objQ);
        }
        m721 m721Var = (m721) objQ;
        if (!(m721Var instanceof l721) || !((l721) m721Var).a) {
            this.b.invoke();
            return rih1Var;
        }
        bpb1Var.getClass();
        bpb1Var.m((Object) null, f721.c);
        return rih1Var;
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
