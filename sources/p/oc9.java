package p;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class oc9 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(oc9.class, "notCompletedCount$volatile");
    public final l2t[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public oc9(l2t[] l2tVarArr) {
        this.a = l2tVarArr;
        this.notCompletedCount$volatile = l2tVarArr.length;
    }

    public final Object a(lnm lnmVar) {
        ohd ohdVar = new ohd(1, aym.t(lnmVar));
        ohdVar.t();
        l2t[] l2tVarArr = this.a;
        int length = l2tVarArr.length;
        mc9[] mc9VarArr = new mc9[length];
        for (int i = 0; i < length; i++) {
            l2t l2tVar = l2tVarArr[i];
            l2tVar.start();
            mc9 mc9Var = new mc9(this, ohdVar);
            mc9Var.h = op71.B(l2tVar, mc9Var);
            mc9VarArr[i] = mc9Var;
        }
        nc9 nc9Var = new nc9(mc9VarArr);
        for (int i2 = 0; i2 < length; i2++) {
            mc9 mc9Var2 = mc9VarArr[i2];
            mc9Var2.getClass();
            avg.a.putObjectVolatile(mc9Var2, mc9.t, nc9Var);
        }
        if (ohdVar.w()) {
            nc9Var.b();
        } else {
            jzn1.v(ohdVar, nc9Var);
        }
        return ohdVar.r();
    }
}
