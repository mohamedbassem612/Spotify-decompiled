package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fom implements sp80 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fom(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final boolean a() {
        switch (this.a) {
        }
        return false;
    }

    public final op80 b(op80 op80Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return (op80) obj;
            case 1:
                return (op80) obj;
            default:
                return new k3h1(((hjf1) obj).f);
        }
    }
}
