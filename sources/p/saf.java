package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class saf extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e3f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ saf(e3f e3fVar, byte b) {
        super(1);
        this.a = b;
        this.b = e3fVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        e3f e3fVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return Boolean.valueOf(u890.j(((tom) obj).a, e3fVar.a));
            default:
                return Boolean.valueOf(u890.j(((gxz0) obj).a, e3fVar.b));
        }
    }
}
