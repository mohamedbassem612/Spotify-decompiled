package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vdd0 implements h0r0 {
    public final hvj a;
    public final kly0 b;
    public final kly0 c;
    public final cbr0 d;

    public vdd0(lik1 lik1Var, p6r0 p6r0Var, hvj hvjVar, jly0 jly0Var, blp blpVar, los losVar) {
        this.a = hvjVar;
        this.b = jly0Var;
        this.c = blpVar;
        this.d = new cbr0(new dbr0[]{new t1r0(true), new s9h1(14, true, false, false), new bn70(p6r0Var, lik1Var, (nar0) null), new nxb((Integer) null, ixb.b, (Integer) null, 0, (mxb) null, losVar, false, false, false, (nsm0) null, 4061), new stm0(1, true), new yxe1(new jx21(2131957396))}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.d;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return hvj.b(this.a, f610.b(h4p1.l(new m2a0(this, (lnm) null, (byte) 9))), apo.j(-690625425, new k2d0(this, (byte) 5), true));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        udd0 udd0Var;
        if (onmVar instanceof udd0) {
            udd0Var = (udd0) onmVar;
            int i = udd0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                udd0Var.c = i - Integer.MIN_VALUE;
            } else {
                udd0Var = new udd0(this, onmVar);
            }
        } else {
            udd0Var = new udd0(this, onmVar);
        }
        Object objM = udd0Var.a;
        int i2 = udd0Var.c;
        if (i2 == 0) {
            hm5.M(objM);
            kly0 kly0Var = this.c;
            String strA = ((fei1) ((bpb1) ((iei1) kly0Var.get()).k()).getValue()).a();
            iei1 iei1Var = (iei1) kly0Var.get();
            udd0Var.c = 1;
            objM = iei1Var.m(strA, udd0Var);
            d9n d9nVar = d9n.a;
            if (objM == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objM);
        }
        return (fei1) objM;
    }
}
