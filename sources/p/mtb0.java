package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class mtb0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ isb0 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public /* synthetic */ mtb0(isb0 isb0Var, long j, int i, int i2, byte b) {
        this.a = b;
        this.b = isb0Var;
        this.c = j;
        this.d = i;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        int i = this.e;
        int i2 = this.d;
        long j = this.c;
        isb0 isb0Var = this.b;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        iu30 iu30Var = (iu30) obj3;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return isb0Var.b.S(jjl.g(iIntValue + i2, j), jjl.f(iIntValue2 + i, j), b7xVar, iu30Var);
            default:
                return isb0Var.b.S(jjl.g(iIntValue + i2, j), jjl.f(iIntValue2 + i, j), b7xVar, iu30Var);
        }
    }
}
