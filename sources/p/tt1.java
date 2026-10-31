package p;

import android.app.Activity;
import android.view.Window;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tt1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wwq0 b;
    public final /* synthetic */ Activity c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tt1(wwq0 wwq0Var, Activity activity, byte b) {
        super(1);
        this.a = b;
        this.b = wwq0Var;
        this.c = activity;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Activity activity = this.c;
        wwq0 wwq0Var = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Window window = activity.getWindow();
                Window.Callback callback = window.getCallback();
                window.setCallback(new vwq0(callback, wwq0Var));
                return new st1(new shq0(window, callback, (byte) 3), (byte) 0);
            default:
                Window window2 = activity.getWindow();
                Window.Callback callback2 = window2.getCallback();
                window2.setCallback(new vwq0(callback2, wwq0Var));
                return new st1(new shq0(window2, callback2, (byte) 3), (byte) 1);
        }
    }
}
