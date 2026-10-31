package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cj extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cj(hi hiVar, byte b) {
        super(1);
        this.a = b;
        this.b = hiVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        qi qiVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return Boolean.valueOf(cn70.c(((hi) obj).i, qiVar.i));
    }
}
