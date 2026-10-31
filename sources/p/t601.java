package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t601 implements gnc1 {
    public final long a;
    public pnc1 b;
    public final bbc c;

    public t601(int i, long j, int i2) {
        this.a = j;
        this.c = mno1.a(i == 0 ? 1 : i, i2, 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) throws Throwable {
        s601 s601Var;
        Object objO;
        if (onmVar instanceof s601) {
            s601Var = (s601) onmVar;
            int i = s601Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                s601Var.c = i - Integer.MIN_VALUE;
            } else {
                s601Var = new s601(this, onmVar);
            }
        } else {
            s601Var = new s601(this, onmVar);
        }
        Object obj = s601Var.a;
        int i2 = s601Var.c;
        if (i2 == 0) {
            hm5.M(obj);
            s601Var.c = 1;
            objO = bbc.O(this.c, s601Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            objO = ((qge) obj).a;
        }
        Throwable thA = qge.a(objO);
        if (thA != null) {
            throw thA;
        }
        if (objO instanceof pge) {
            return null;
        }
        return objO;
    }

    @Override // p.gnc1
    public final void onComplete() {
        this.c.H(null);
    }

    @Override // p.gnc1
    public final void onError(Throwable th) {
        this.c.e(th, false);
    }

    @Override // p.gnc1
    public final void onNext(Object obj) {
        bbc bbcVar = this.c;
        if (bbcVar.l(obj) instanceof pge) {
            bhn0.l("Element ", obj, " was not added to channel because it was full, ", bbcVar);
        }
    }

    @Override // p.gnc1
    public final void onSubscribe(pnc1 pnc1Var) {
        this.b = pnc1Var;
        if (pnc1Var != null) {
            pnc1Var.request(this.a);
        } else {
            u890.C("subscription");
            throw null;
        }
    }
}
