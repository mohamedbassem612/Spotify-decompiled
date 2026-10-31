package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vaf extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r2f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vaf(r2f r2fVar, byte b) {
        super(1);
        this.a = b;
        this.b = r2fVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        r2f r2fVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return Boolean.valueOf(u890.j(((tom) obj).a, r2fVar.a));
    }
}
