package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class joo {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ joo(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    public final Object a(onm onmVar) {
        lji1 lji1Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return b5p1.i(new i0h(new dkm((mr20) obj, (byte) 17), (byte) 11), onmVar);
            default:
                if (onmVar instanceof lji1) {
                    lji1Var = (lji1) onmVar;
                    int i = lji1Var.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        lji1Var.c = i - Integer.MIN_VALUE;
                    } else {
                        lji1Var = new lji1(this, onmVar);
                    }
                } else {
                    lji1Var = new lji1(this, onmVar);
                }
                Object obj2 = lji1Var.a;
                int i2 = lji1Var.c;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return obj2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                Single singleFirstOrError = ((Observable) obj).firstOrError();
                lji1Var.c = 1;
                Object objJ = fc11.j(singleFirstOrError, lji1Var);
                d9n d9nVar = d9n.a;
                return objJ == d9nVar ? d9nVar : objJ;
        }
    }
}
