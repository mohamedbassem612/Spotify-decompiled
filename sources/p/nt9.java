package p;

import android.app.Activity;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nt9 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Activity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nt9(Activity activity, byte b) {
        super(1);
        this.a = b;
        this.b = activity;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Activity activity = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Activity activity2 = (Activity) ((WeakReference) obj).get();
                return Boolean.valueOf(activity2 == null || activity2.equals(activity));
            case 1:
                erw0 erw0Var = erw0.g;
                erw0Var.d = (d5d) obj;
                erw0Var.e = o4o1.p(activity);
                return erw0Var;
            case 2:
                return new yc01(activity, (byte) 0);
            default:
                activity.getWindow().addFlags(8192);
                return new yc01(activity, (byte) 1);
        }
    }
}
