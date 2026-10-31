package p;

import io.reactivex.rxjava3.core.Completable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bbk0 {
    public final rxj0 a;
    public final ov20 b;
    public final r241 c;

    public bbk0(rxj0 rxj0Var, ov20 ov20Var, r241 r241Var) {
        this.a = rxj0Var;
        this.b = ov20Var;
        this.c = r241Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, onm onmVar) {
        zak0 zak0Var;
        if (onmVar instanceof zak0) {
            zak0Var = (zak0) onmVar;
            int i = zak0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zak0Var.c = i - Integer.MIN_VALUE;
            } else {
                zak0Var = new zak0(this, onmVar);
            }
        } else {
            zak0Var = new zak0(this, onmVar);
        }
        Object obj = zak0Var.a;
        int i2 = zak0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                Completable completableB = this.c.b("mixing-fx-looping-jogwheel", z ? "1" : "0");
                zak0Var.c = 1;
                Object objI = fc11.i(completableB, zak0Var);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
            }
        } catch (Throwable unused) {
        }
        return rih1.a;
    }

    public final mr20 b() {
        return !this.a.P ? new huz(uao0.a, (byte) 10) : new r6k0(this.b.b("mixing-fx-looping-jogwheel"), (byte) 2);
    }
}
