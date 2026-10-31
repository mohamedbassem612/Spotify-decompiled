package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ajs implements owy0 {
    public final d520 a;
    public final wmy b;
    public final tka0 c = rc11.a.b(sto0.class);

    public ajs(d520 d520Var, wmy wmyVar) {
        this.a = d520Var;
        this.b = wmyVar;
    }

    @Override // p.owy0
    public final tka0 a() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p.owy0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object b(sto0 sto0Var, onm onmVar) {
        yis yisVar;
        if (onmVar instanceof yis) {
            yisVar = (yis) onmVar;
            int i = yisVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                yisVar.d = i - Integer.MIN_VALUE;
            } else {
                yisVar = new yis(this, onmVar);
            }
        } else {
            yisVar = new yis(this, onmVar);
        }
        Object obj = yisVar.b;
        int i2 = yisVar.d;
        byte b = 1;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(obj);
            yisVar.a = sto0Var;
            yisVar.d = 1;
            if (qgo1.i("presenter_type", "simple", yisVar) != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        sto0Var = yisVar.a;
        hm5.M(obj);
        jx81 jx81Var = new jx81(sto0Var.c, new zis(this, sto0Var, (byte) 0), new zis(this, sto0Var, b), sto0Var.e, sto0Var.d, 96);
        yisVar.a = null;
        yisVar.d = 2;
        Object objS = this.a.s(jx81Var, yisVar);
        return objS == d9nVar ? d9nVar : objS;
    }
}
