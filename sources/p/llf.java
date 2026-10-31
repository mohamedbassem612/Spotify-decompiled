package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class llf extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llf(boolean z, iu30 iu30Var, boolean z2) {
        super(3);
        this.b = z;
        this.d = iu30Var;
        this.c = z2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                anm1.c(this.b, this.d, (qim0) null, z ? new hax("Disabled") : jax.a, (idn0) null, b0kVar, 0, 20);
                break;
            default:
                ((Number) obj3).intValue();
                ioo1.d(this.b, z, this.d, (b0k) obj2, 0);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public llf(boolean z, boolean z2, iu30 iu30Var) {
        super(3);
        this.b = z;
        this.c = z2;
        this.d = iu30Var;
    }
}
