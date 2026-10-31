package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x2z {
    public final uu00 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(String str, onm onmVar) {
        wd71 wd71Var;
        if (onmVar instanceof wd71) {
            wd71Var = (wd71) onmVar;
            int i = wd71Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wd71Var.d = i - Integer.MIN_VALUE;
            } else {
                wd71Var = new wd71(this, onmVar);
            }
        } else {
            wd71Var = new wd71(this, onmVar);
        }
        Object objL = wd71Var.b;
        int i2 = wd71Var.d;
        if (i2 == 0) {
            hm5.M(objL);
            Observable map = this.a.b(new oi("episode-share", false, new pg61(str, (byte) 8))).filter(wdx0.t).map(new zjp1(str, (byte) 9));
            wd71Var.a = str;
            wd71Var.d = 1;
            objL = fc11.l(map, 1, (Object) null, wd71Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = wd71Var.a;
            hm5.M(objL);
        }
        jo70 jo70Var = ((tv00) objL).b;
        if (jo70Var != null) {
            return jo70Var;
        }
        bhn0.f(l1d.m("IdentityTrait was null for ", str));
        return null;
    }
}
