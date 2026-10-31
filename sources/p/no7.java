package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class no7 {
    public final uu00 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(String str, onm onmVar) {
        mo7 mo7Var;
        lh7 lh7Var;
        if (onmVar instanceof mo7) {
            mo7Var = (mo7) onmVar;
            int i = mo7Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                mo7Var.c = i - Integer.MIN_VALUE;
            } else {
                mo7Var = new mo7(this, onmVar);
            }
        } else {
            mo7Var = new mo7(this, onmVar);
        }
        Object objL = mo7Var.a;
        int i2 = mo7Var.c;
        if (i2 == 0) {
            hm5.M(objL);
            Observable map = this.a.b(new oi("share-audio-associations", false, new wk3(str, (byte) 18))).filter(pbo1.g).map(new ljp1(str, (byte) 3));
            mo7Var.c = 1;
            objL = fc11.l(map, 1, (Object) null, mo7Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objL);
        }
        lo7 lo7Var = ((tv00) objL).b;
        if (lo7Var == null || (lh7Var = (lh7) o7h.s0(lo7Var.a)) == null) {
            return null;
        }
        return lh7Var.a;
    }
}
