package p;

import android.content.Context;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u1o1 implements Callable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u1o1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return ((Context) obj).getSharedPreferences("google_sdk_flags", 0);
            case 1:
                return a8c0.c.a(((bwo1) obj).g);
            case 2:
                return a8c0.c.a(((o8p1) obj).a);
            case 3:
                return a8c0.c.a(((ecp1) obj).g);
            default:
                return a8c0.c.a(((dgp1) obj).a);
        }
    }
}
