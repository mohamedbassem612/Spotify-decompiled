package p;

import io.reactivex.rxjava3.core.Observable;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class kw {
    public final o241 a;
    public final boolean b;
    public final boolean c;
    public final wv d;
    public final idd1 e;

    public kw(Observable observable, o241 o241Var, boolean z, boolean z2, wv wvVar) {
        this.a = o241Var;
        this.b = z;
        this.c = z2;
        this.d = wvVar;
        this.e = new idd1(new g3(observable, (byte) 7));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlinx.coroutines.flow.internal.AbortFlowException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(onm onmVar) throws AbortFlowException {
        iw iwVar;
        if (onmVar instanceof iw) {
            iwVar = (iw) onmVar;
            int i = iwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iwVar.c = i - Integer.MIN_VALUE;
            } else {
                iwVar = new iw(this, onmVar);
            }
        } else {
            iwVar = new iw(this, onmVar);
        }
        Object objI = iwVar.a;
        int i2 = iwVar.c;
        p241 p241Var = this.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objI);
            if (!this.b) {
                return Boolean.FALSE;
            }
            nf nfVar = new nf(yoi1.g(p241Var.a("is-account-switching-add-account-page-enabled", "0")), (byte) 1);
            iwVar.c = 1;
            objI = b5p1.i(nfVar, iwVar);
            if (objI != d9nVar) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objI);
                return objI;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(objI);
        if (((Boolean) objI).booleanValue()) {
            return Boolean.TRUE;
        }
        if (!this.c) {
            return Boolean.FALSE;
        }
        nf nfVar2 = new nf(yoi1.g(p241Var.a("is-account-switching-add-account-page-v2-enabled", "0")), (byte) 2);
        iwVar.c = 2;
        Object objI2 = b5p1.i(nfVar2, iwVar);
        return objI2 == d9nVar ? d9nVar : objI2;
    }

    public final zob1 b() {
        return (zob1) this.e.getValue();
    }
}
