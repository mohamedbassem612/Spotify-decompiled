package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q6v implements d6o0 {
    public final /* synthetic */ tob1 a;
    public final /* synthetic */ t24 b;

    public q6v(tob1 tob1Var, t24 t24Var) {
        this.a = tob1Var;
        this.b = t24Var;
    }

    public final long M(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (i != 1) {
            return 0L;
        }
        wvr wvrVar = (wvr) this.a.getValue();
        if (Math.abs(wvrVar.d()) > Float.MAX_VALUE || Math.abs(wvrVar.e()) > Float.MAX_VALUE) {
            return 0L;
        }
        t24 t24Var = this.b;
        if (Math.abs(t24Var.j.s()) > Float.MAX_VALUE) {
            return 0L;
        }
        float fB = t24Var.b(fIntBitsToFloat);
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fB)) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k0(long j, lnm lnmVar) {
        p6v p6vVar;
        if (lnmVar instanceof p6v) {
            p6vVar = (p6v) lnmVar;
            int i = p6vVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                p6vVar.c = i - Integer.MIN_VALUE;
            } else {
                p6vVar = new p6v(this, (onm) lnmVar);
            }
        } else {
            p6vVar = new p6v(this, (onm) lnmVar);
        }
        Object objH = p6vVar.a;
        int i2 = p6vVar.c;
        if (i2 == 0) {
            hm5.M(objH);
            wvr wvrVar = (wvr) this.a.getValue();
            if (Math.abs(wvrVar.d()) <= Float.MAX_VALUE && Math.abs(wvrVar.e()) <= Float.MAX_VALUE) {
                t24 t24Var = this.b;
                if (Math.abs(t24Var.j.s()) <= Float.MAX_VALUE) {
                    float fE = qui1.e(j);
                    p6vVar.c = 1;
                    objH = t24Var.h(fE, p6vVar);
                    d9n d9nVar = d9n.a;
                    if (objH == d9nVar) {
                        return d9nVar;
                    }
                }
            }
            return new qui1(0L);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objH);
        return new qui1(j2h1.g(0.0f, ((Number) objH).floatValue()));
    }
}
