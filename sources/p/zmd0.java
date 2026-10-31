package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zmd0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vu30 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zmd0(vu30 vu30Var, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = vu30Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        iu30 iu30Var = this.c;
        vu30 vu30Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Object objE = ((ymd0) iu30Var.invoke(obj)).e();
                if (objE != null) {
                    return vu30Var.invoke(obj, objE);
                }
                hhg1.n("DerivedState expects Live data to have non-nullable value");
                return null;
            default:
                return vu30Var.invoke(obj, ((zob1) iu30Var.invoke(obj)).getValue());
        }
    }
}
