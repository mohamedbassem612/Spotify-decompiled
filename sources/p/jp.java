package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class jp implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v5n b;

    public /* synthetic */ jp(v5n v5nVar, byte b) {
        this.a = b;
        this.b = v5nVar;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        v5n v5nVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return v5nVar.b(((th61) obj).a).map(uh21.c).firstOrError();
            default:
                return v5nVar.b((String) obj);
        }
    }
}
