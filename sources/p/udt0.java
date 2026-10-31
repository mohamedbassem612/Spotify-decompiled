package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class udt0 {
    public static final kiv a = new kiv(new el70((byte) 24), (byte) 1);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void a(rdt0 rdt0Var, vu30 vu30Var, onm onmVar) {
        sdt0 sdt0Var;
        if (onmVar instanceof sdt0) {
            sdt0Var = (sdt0) onmVar;
            int i = sdt0Var.b;
            if ((i & os00.INVALID_ID) != 0) {
                sdt0Var.b = i - os00.INVALID_ID;
            } else {
                sdt0Var = new sdt0(onmVar);
            }
        } else {
            sdt0Var = new sdt0(onmVar);
        }
        Object obj = sdt0Var.a;
        int i2 = sdt0Var.b;
        if (i2 != 0) {
            if (i2 == 1) {
                throw l1d.v(obj);
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return;
        }
        hm5.M(obj);
        if (!((pim0) rdt0Var).a.N0) {
            hhg1.n("establishTextInputSession called from an unattached node");
            return;
        }
        oxq0 oxq0VarC = oap1.C(rdt0Var);
        xos0 xos0Var = oap1.B(rdt0Var).c1;
        xos0Var.getClass();
        if (d7e.x(xos0Var, a) != null) {
            bhn0.d();
        } else {
            sdt0Var.b = 1;
            b(oxq0VarC, vu30Var, sdt0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void b(oxq0 oxq0Var, vu30 vu30Var, onm onmVar) {
        tdt0 tdt0Var;
        if (onmVar instanceof tdt0) {
            tdt0Var = (tdt0) onmVar;
            int i = tdt0Var.b;
            if ((i & os00.INVALID_ID) != 0) {
                tdt0Var.b = i - os00.INVALID_ID;
            } else {
                tdt0Var = new tdt0(onmVar);
            }
        } else {
            tdt0Var = new tdt0(onmVar);
        }
        Object obj = tdt0Var.a;
        int i2 = tdt0Var.b;
        if (i2 == 0) {
            hm5.M(obj);
            tdt0Var.b = 1;
            ((ha4) oxq0Var).L(vu30Var, tdt0Var);
        } else {
            if (i2 == 1) {
                throw l1d.v(obj);
            }
            if (i2 == 2) {
                throw l1d.v(obj);
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
