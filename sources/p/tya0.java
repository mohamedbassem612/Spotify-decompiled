package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tya0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ es41 b;
    public final /* synthetic */ mya0 c;
    public final /* synthetic */ shg1 d;
    public final /* synthetic */ iu30 e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tya0(mya0 mya0Var, String str, shg1 shg1Var, iu30 iu30Var, es41 es41Var) {
        super(3);
        this.c = mya0Var;
        this.f = str;
        this.d = shg1Var;
        this.e = iu30Var;
        this.b = es41Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                j1e1.f((qim0) null, 0L, b0kVar, 0, 3);
                j0o1.h(this.c, this.f, this.d, this.e, (vzq0) obj, this.b, null, b0kVar, (iIntValue << 12) & 57344);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                ujo1.a(null, this.b, apo.r(1996227169, new e9g0(obj, (Object) this.c, (Object) this.d, (Object) this.e, (Object) this.f, (byte) 16), b0kVar2), b0kVar2, 384, 1);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tya0(es41 es41Var, mya0 mya0Var, shg1 shg1Var, iu30 iu30Var, String str) {
        super(3);
        this.b = es41Var;
        this.c = mya0Var;
        this.d = shg1Var;
        this.e = iu30Var;
        this.f = str;
    }
}
