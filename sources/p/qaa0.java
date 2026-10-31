package p;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final /* synthetic */ class qaa0 extends tv30 implements xu30 {
    public static final qaa0 a = new qaa0(3, saa0.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object objG0;
        saa0 saa0Var = (saa0) obj;
        ou51 ou51Var = (ou51) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = saa0.a;
        do {
            objG0 = saa0Var.g0();
            if (!(objG0 instanceof i980)) {
                if (!(objG0 instanceof nyh)) {
                    objG0 = j1e1.D(objG0);
                }
                ou51Var.e = objG0;
            }
            return rih1.a;
        } while (saa0Var.u0(objG0) < 0);
        ou51Var.c = op71.A(saa0Var, true, new oaa0(saa0Var, ou51Var));
        return rih1.a;
    }
}
