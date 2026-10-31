package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ov2 implements it80 {
    public static final /* synthetic */ int d = 0;
    public final ynb0 a;
    public final mr4 b;
    public final c9n c;

    static {
        ytw0 ytw0Var = jfv.b;
        fdg1.k0(5, ngv.e);
    }

    public ov2(ynb0 ynb0Var, ynb0 ynb0Var2, mr4 mr4Var, mr20 mr20Var, c9n c9nVar) {
        this.a = ynb0Var;
        this.b = mr4Var;
        this.c = c9nVar;
    }

    public final void a(ajq0 ajq0Var) {
        ajq0Var.L(d03.d, "Start agent realtime voice", new x5j1(this, (byte) 9));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(onm onmVar) {
        nv2 nv2Var;
        if (onmVar instanceof nv2) {
            nv2Var = (nv2) onmVar;
            int i = nv2Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nv2Var.c = i - Integer.MIN_VALUE;
            } else {
                nv2Var = new nv2(this, onmVar);
            }
        } else {
            nv2Var = new nv2(this, onmVar);
        }
        Object obj = nv2Var.a;
        int i2 = nv2Var.c;
        rih1 rih1Var = rih1.a;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(obj);
                    if (this.b.n()) {
                        ((yo2) this.a.get()).n();
                        return rih1Var;
                    }
                } else if (i2 == 1) {
                    hm5.M(obj);
                    if (((Boolean) obj) != null) {
                        throw null;
                    }
                } else {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            hm5.M(obj);
                            return rih1Var;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    if (!(obj instanceof loe)) {
                        throw null;
                    }
                }
                return rih1Var;
            } catch (Exception e) {
                n57.t("Failed to start realtime voice from URI", e);
                return rih1Var;
            }
        } catch (CancellationException e2) {
            throw e2;
        }
    }
}
