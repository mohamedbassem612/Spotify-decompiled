package p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xlo {
    public final uu00 a;

    public xlo(uu00 uu00Var) {
        this.a = uu00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        wlo wloVar;
        if (onmVar instanceof wlo) {
            wloVar = (wlo) onmVar;
            int i = wloVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wloVar.d = i - Integer.MIN_VALUE;
            } else {
                wloVar = new wlo(this, onmVar);
            }
        } else {
            wloVar = new wlo(this, onmVar);
        }
        Object objJ = wloVar.b;
        int i2 = wloVar.d;
        if (i2 == 0) {
            hm5.M(objJ);
            Single singleFirstOrError = this.a.b(new oi("curationability", false, new i3o(str, (byte) 3))).filter(wcp1.S0).firstOrError();
            wloVar.a = str;
            wloVar.d = 1;
            objJ = fc11.j(singleFirstOrError, wloVar);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = wloVar.a;
            hm5.M(objJ);
        }
        return Boolean.valueOf(((uv00) objJ).a(uio.class, str).c.b != 4);
    }
}
