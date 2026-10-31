package p;

import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n3t implements ObservableOnSubscribe {
    public final xm41 a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(onm onmVar) {
        l3t l3tVar;
        ram0 ram0VarE;
        if (onmVar instanceof l3t) {
            l3tVar = (l3t) onmVar;
            int i = l3tVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                l3tVar.d = i - Integer.MIN_VALUE;
            } else {
                l3tVar = new l3t(this, onmVar);
            }
        } else {
            l3tVar = new l3t(this, onmVar);
        }
        Object obj = l3tVar.b;
        int i2 = l3tVar.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                ayh ayhVarA = sap1.a();
                m3t m3tVar = new m3t(ayhVarA, (byte) 0);
                ram0VarE = this.a.e(n0r.d1, m3tVar);
                l3tVar.a = ram0VarE;
                l3tVar.d = 1;
                Object objQ = ayhVarA.Q(l3tVar);
                d9n d9nVar = d9n.a;
                if (objQ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ram0VarE = l3tVar.a;
                hm5.M(obj);
            }
            ram0VarE.dispose();
            this = rih1.a;
            return this;
        } catch (Throwable th) {
            this.dispose();
            throw th;
        }
    }

    public void subscribe(ObservableEmitter observableEmitter) {
        rlv0 rlv0Var = new rlv0(observableEmitter, (byte) 0);
        observableEmitter.setCancellable(new qlv0(this.a.e(new n1r(observableEmitter, (byte) 1), rlv0Var), (byte) 0));
    }
}
