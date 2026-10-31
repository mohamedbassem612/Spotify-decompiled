package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tam implements Comparator, Serializable {
    public final /* synthetic */ byte a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((sam) obj2).a.a - ((sam) obj).a.a;
            default:
                vih0 vih0Var = (vih0) obj;
                vih0 vih0Var2 = (vih0) obj2;
                vih0Var.getClass();
                vih0Var2.getClass();
                long jG = vih0Var.g();
                long jG2 = vih0Var2.g();
                if (jG2 < jG) {
                    return -1;
                }
                return jG2 == jG ? 0 : 1;
        }
    }
}
